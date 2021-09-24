# 1. 项目简介
# 2. 工具版本
|Tool|Version|
|-|-|
|hadoop|3.13|
|flume|1.9.0|
|hive|3.12|
|zookeeper|3.5.7|
|hbase|2.0.5|
|kafka|2.4.1|
|mysql|5.7.16|
|spark|3.0.0|
|sqoop|1.4.6|
# 3. 项目架构
### 3.1 数据模块
数据分位两类：**业务交互数据**和**埋点用户行为数据**
- 业务交互数据：业务流程中产生的登录、订单、用户、商品、支付等相关的数据，通常存储在DB中，包括Mysql、Oracle等
- 埋点用户行为数据：用户在使用产品过程中，与客户端产品交互过程中产生的数据，比如页面浏览、点击、停留、评论、点赞、收藏等
 
用户行为数据主要包括**页面数据**、**事件数据**、**曝光数据**、**启动数据**和**错误数据**。具体就是普通页面埋点日志和启动日志(两个json对象)。
- 页面数据：记录一个页面的用户访问情况，包括访问时间、停留时间
- 事件数据：主要记录应用内一个具体操作行为，包括操作类型、操作对象
- 曝光数据：主要记录页面所曝光的内容，包括曝光对象，曝光类型等信息
- 启动数据：记录应用的启动信息
- 错误数据：记录应用使用过程中的错误信息，包括错误编号及错误信息

用户行为数据通过java代码模拟生成，使用的json格式，分为两个json对象。日志数据一天的**数据大小约400K**, 不到1M的大小。业务数据有**23张表**

- 用户行为日志数据通过flume -> kafka -> flume导入HDFS的topic_log目录下，然后使用`load data inpath * into table *`导入到ods层的一张表中
- 业务数据通过sqoop从mysql导入到hdfs的ods层的各张表中
#### 同步策略
- 全量同步：每次将mysql整张表同步到Hive中，适用于数据量不大，每天既有新增也有修改的场景，如品牌表，活动表，优惠券表
- 增量表：每次将新增的数据日期同步到hive对应的分区中。适用于数据量大，每天只会有新增的场景，如订单表，支付表，评论表
- 新增及变化表：将mysql中增加和变化的数据同步到Hive中，DWD层通过拉链表完成
- 特殊表：只需存储一次，省份和地区表

在用Sqoop将mysql中的数据导入Hive的过程中，不同的同步的策略是通过导入语句的'where'子句做到的，例如全量同步则where子句不加任何筛选条件，增量同步则表中的时间字段筛选(创建时间、支付时间等)，新增及变化同步通过表中的**创建时间**+**修改时间**筛选的。
# 4. 数仓
## 数据仓库分层
|||功能|
|-|-|-|
|ODS|Operation DataStore 数据原始层|存放原始数据|
|DWD|Data warehouse Detail 明细数据层|对ODS层数据进行清洗等，保存明细数据|
|DWS|Data warehouse service 服务数据层|以DWD为基础，按天进行汇总|
|DWT|Data Warehouse Topic 主题层|以DWS层为基础，对数据进行累积汇总|
|ADS|Application Data Store 应用层|ADS层为各种统计报表提供数据|
- ODS: 
    - 日志数据：ods_log
    - 业务数据： ods_order_info，ods_order_detail，ods_sku_info，ods_user_info，ods_base_category1，ods_base_category2，ods_base_category3，ods_payment_info，ods_base_province，ods_base_region，ods_base_trademark，ods_order_status_log, ...
- DWD：对用户行为日志解析, 数据判空，对业务数据采用维度模型重新建模 8张事实6张维度
    - 日志数据：dwd_start_log, dwd_page_log，dwd_action_log，dwd_display_log，dwd_error_log
    - 业务数据：dwd_dim_sku_info(`join`)，dwd_dim_coupon_info，dwd_dim_activity_info，dwd_dim_base_province,dwd_fact_payment_info(增量同步)
- DWS：存放的所有主题对象当天的汇总行为
    - 每日设备行为：dws_uv_detail_daycount
    - 每日会员行为：dws_user_action_daycount
    - 每日商品行为：dws_sku_action_daycount
    - 每日活动统计：dws_activity_info_daycount
- DWT：存放的是所有主题对象的累积行为
    - 设备主题宽表：dwt_uv_topic
    - 会员主题宽表：dwt_user_topic
    - 商品主题宽表：dwt_sku_topic
- ADS：
    - 设备主题：活跃设备数、留存率...
    - 会员主题：会员信息 ads_user_topic ...
    - 商品主题：商品销量排行：ads_product_sale_topN ...

## 维度建模
维度建模通常以一个事实表为中心进行表的组织，把相关各种表整理成两种：**事实表**和**维度表**两种
### 事实表和维度表
事实表每行代表一个业务事件，如下单事实表、支付事实表等

维度表是对事实的描述信息，对应现实世界中的一个对象，如日期维度表，地区维度表。
### 维度模型分类
常分为三种模型：
- 星型模型
- 雪花模型
- 星座模型

雪花模型与星型模型的区别主要在于维度的层级，标准的雪花模型维度只有一层，而雪花模型可能涉及多级。

星座模型与前两种模型的区别是事实表的数量，星座模型是基于多个事实表。
## 数仓建模
### ODS层
- 保持数据原貌不做修改
- 采用压缩 
- 创建分区表，避免全表扫描

> hive hadoop支持哪些压缩格式？自动分区？存储格式？
### DWD层
1) 对用户行为日志解析(使用`get_gson_object`函数)。
2) 对核心数据进行判空过滤。
3) 对业务数据采用维度模型重新建模。

DWD层需构建维度模型，一般采用星型模型

维度建模一般按照以下四个步骤： 选择业务过程(确定事实表)→声明粒度→确认维度→确认事实

**表的数量**：8张事实表，12张维度表
- 事实表：订单事实表，订单详情事实表，支付事实表，加购事实表，收藏事实表，优惠券领用事实表，评价事实表，退款事实表
- 维度表：时间维度表，地区维度表，商品维度表，活动维度表，用户维度表

DWD层日志数据存的是各种表，业务数据存的事实表和维度表

#### 拉链表(用户表)
用户表中的数据每日既有可能新增，也有可能修改，但修改频率并不高，属于缓慢变化维度，此处采用拉链表存储用户维度数据。

拉链表记录每条信息的生命周期，记录开始日期和结束日期

制作过程：用户全部首日数据和mysql中每日变化的数据拼接在一起，形成一个临时的拉链表，用临时的拉链表覆盖旧的拉链表。
###  DWS层与DWT层
DWS层和DWT层统称宽表层。

DWS层、DWT层和ADS层都是以需求为驱动，和维度建模已经没有关系了。

DWS和DWT都是建宽表，按照主题去建表。

**DWS和DWT层的区别**
- DWS层存放的所有主题对象当天的汇总行为，例如每个地区当天的下单次数，下单金额等
    - 每日设备行为
    - 每日会员行为
    - 每日商品行为
    - 每日活动统计
    - 每日地区统计
- DWT层存放的是所有主题对象的累积行为，例如每个地区最近７天（15天、30天、60天）的下单次数、下单金额等
    - 设备主题宽表
    - 会员主题宽表
    - 商品主题宽表
    - 活动主题宽表
    - 地区主题宽表

### ADS
设备(每日新增设备)，商品(商品销量排行，收藏排名)，会员等主题
- 设备主题
    - 留存率
    - 活跃设备数
    - 新增设备数
- 会员主题
    - 会员信息
- 商品主题
    - 销量排名
# 项目经验
#### 1. HDFS多级目录存储
HDFS的DataNode节点保存数据的路径由dfs.datanode.data.dir参数决定，其默认值为file://${hadoop.tmp.dir}/dfs/data，若服务器有多个磁盘，必须对该参数进行修改
#### 2. 集群数据均衡
-节点间数据均衡  
开启数据均衡命令：`start-balancer.sh -threshold 10`代表的是集群中各个节点的磁盘空间利用率相差不超过10%，可根据实际情况进行调整
- 磁盘间数据均衡
    - 生成均衡计划 `hdfs diskbalancer -plan hadoop103`
    - 执行均衡计划 `hdfs diskbalancer -execute hadoop103.plan.json`
    - 取消均衡计划 `hdfs diskbalancer -cancel hadoop103.plan.json`

#### 3. LZO压缩
#### 4. hadoop参数调优
- HDFS参数调优hdfs-site.xml  
NameNode有一个工作线程池，用来处理不同DataNode的并发心跳以及客户端并发的元数据操作。
对于大集群或者有大量客户端的集群来说，通常需要增大参数dfs.namenode.handler.count的默认值10。
- Yarn参数调优 yarn-site.xml

#### 5. Flume组件选择
##### 5.1 采集flume
- Source 
    - TailDir Source：支持断点续传、多目录
    - Exec Source：Flume不运行时数据会丢失
    - Spooling Directory Source

- Channel    
采用Kafka Channel，省去了Sink，提高了效率。KafkaChannel数据存储在Kafka里面，所以数据是存储在磁盘中

##### 5.2 消费kafka flume
- Channel
    - FileChannel
    - MemoryChannel

- sink  
hdfs小文件处理：`hdfs.rollInterval=3600，hdfs.rollSize=134217728，hdfs.rollCount =0`文件在达到128M时会滚动生成新文件.文件创建超3600秒时会滚动生成新文件
#### Flume内存优化
在conf/flume-env.sh中将-Xms和-Xmx参数增大
# 监控工具 Zabbix
## 架构
## 术语
1. Host: 想要监控的设备，用ip或域名表示
2. Item：想要监控的对象
3. Trigger：怎么促发报警
4. Action：怎么报警
## 使用方法
目标：监控每个节点Datanode进程是否正常开启
1. 创建Host
2. 创建监控项：选择`proc.num[<name><user><state><cmdline>]`修改为`proc.num[,,all,datanode]`, 时间间隔自定
3. 创建Trigger：选择表达式，根据实际情况配置
4. 创建Action：选择**管理** -> **报警媒介类型**，填写邮箱信息。再选择**配置**->**动作**
## 模板
可为相同的配置设置模板

