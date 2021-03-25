// ORM class for table 'ads_area_topic'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Mar 12 01:34:48 CST 2021
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ads_area_topic extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.sql.Date dt;
  public java.sql.Date get_dt() {
    return dt;
  }
  public void set_dt(java.sql.Date dt) {
    this.dt = dt;
  }
  public ads_area_topic with_dt(java.sql.Date dt) {
    this.dt = dt;
    return this;
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public ads_area_topic with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String province_name;
  public String get_province_name() {
    return province_name;
  }
  public void set_province_name(String province_name) {
    this.province_name = province_name;
  }
  public ads_area_topic with_province_name(String province_name) {
    this.province_name = province_name;
    return this;
  }
  private String area_code;
  public String get_area_code() {
    return area_code;
  }
  public void set_area_code(String area_code) {
    this.area_code = area_code;
  }
  public ads_area_topic with_area_code(String area_code) {
    this.area_code = area_code;
    return this;
  }
  private String iso_code;
  public String get_iso_code() {
    return iso_code;
  }
  public void set_iso_code(String iso_code) {
    this.iso_code = iso_code;
  }
  public ads_area_topic with_iso_code(String iso_code) {
    this.iso_code = iso_code;
    return this;
  }
  private Integer region_id;
  public Integer get_region_id() {
    return region_id;
  }
  public void set_region_id(Integer region_id) {
    this.region_id = region_id;
  }
  public ads_area_topic with_region_id(Integer region_id) {
    this.region_id = region_id;
    return this;
  }
  private String region_name;
  public String get_region_name() {
    return region_name;
  }
  public void set_region_name(String region_name) {
    this.region_name = region_name;
  }
  public ads_area_topic with_region_name(String region_name) {
    this.region_name = region_name;
    return this;
  }
  private Long login_day_count;
  public Long get_login_day_count() {
    return login_day_count;
  }
  public void set_login_day_count(Long login_day_count) {
    this.login_day_count = login_day_count;
  }
  public ads_area_topic with_login_day_count(Long login_day_count) {
    this.login_day_count = login_day_count;
    return this;
  }
  private Long order_day_count;
  public Long get_order_day_count() {
    return order_day_count;
  }
  public void set_order_day_count(Long order_day_count) {
    this.order_day_count = order_day_count;
  }
  public ads_area_topic with_order_day_count(Long order_day_count) {
    this.order_day_count = order_day_count;
    return this;
  }
  private Double order_day_amount;
  public Double get_order_day_amount() {
    return order_day_amount;
  }
  public void set_order_day_amount(Double order_day_amount) {
    this.order_day_amount = order_day_amount;
  }
  public ads_area_topic with_order_day_amount(Double order_day_amount) {
    this.order_day_amount = order_day_amount;
    return this;
  }
  private Long payment_day_count;
  public Long get_payment_day_count() {
    return payment_day_count;
  }
  public void set_payment_day_count(Long payment_day_count) {
    this.payment_day_count = payment_day_count;
  }
  public ads_area_topic with_payment_day_count(Long payment_day_count) {
    this.payment_day_count = payment_day_count;
    return this;
  }
  private Double payment_day_amount;
  public Double get_payment_day_amount() {
    return payment_day_amount;
  }
  public void set_payment_day_amount(Double payment_day_amount) {
    this.payment_day_amount = payment_day_amount;
  }
  public ads_area_topic with_payment_day_amount(Double payment_day_amount) {
    this.payment_day_amount = payment_day_amount;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_area_topic)) {
      return false;
    }
    ads_area_topic that = (ads_area_topic) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.area_code == null ? that.area_code == null : this.area_code.equals(that.area_code));
    equal = equal && (this.iso_code == null ? that.iso_code == null : this.iso_code.equals(that.iso_code));
    equal = equal && (this.region_id == null ? that.region_id == null : this.region_id.equals(that.region_id));
    equal = equal && (this.region_name == null ? that.region_name == null : this.region_name.equals(that.region_name));
    equal = equal && (this.login_day_count == null ? that.login_day_count == null : this.login_day_count.equals(that.login_day_count));
    equal = equal && (this.order_day_count == null ? that.order_day_count == null : this.order_day_count.equals(that.order_day_count));
    equal = equal && (this.order_day_amount == null ? that.order_day_amount == null : this.order_day_amount.equals(that.order_day_amount));
    equal = equal && (this.payment_day_count == null ? that.payment_day_count == null : this.payment_day_count.equals(that.payment_day_count));
    equal = equal && (this.payment_day_amount == null ? that.payment_day_amount == null : this.payment_day_amount.equals(that.payment_day_amount));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ads_area_topic)) {
      return false;
    }
    ads_area_topic that = (ads_area_topic) o;
    boolean equal = true;
    equal = equal && (this.dt == null ? that.dt == null : this.dt.equals(that.dt));
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.province_name == null ? that.province_name == null : this.province_name.equals(that.province_name));
    equal = equal && (this.area_code == null ? that.area_code == null : this.area_code.equals(that.area_code));
    equal = equal && (this.iso_code == null ? that.iso_code == null : this.iso_code.equals(that.iso_code));
    equal = equal && (this.region_id == null ? that.region_id == null : this.region_id.equals(that.region_id));
    equal = equal && (this.region_name == null ? that.region_name == null : this.region_name.equals(that.region_name));
    equal = equal && (this.login_day_count == null ? that.login_day_count == null : this.login_day_count.equals(that.login_day_count));
    equal = equal && (this.order_day_count == null ? that.order_day_count == null : this.order_day_count.equals(that.order_day_count));
    equal = equal && (this.order_day_amount == null ? that.order_day_amount == null : this.order_day_amount.equals(that.order_day_amount));
    equal = equal && (this.payment_day_count == null ? that.payment_day_count == null : this.payment_day_count.equals(that.payment_day_count));
    equal = equal && (this.payment_day_amount == null ? that.payment_day_amount == null : this.payment_day_amount.equals(that.payment_day_amount));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.province_name = JdbcWritableBridge.readString(3, __dbResults);
    this.area_code = JdbcWritableBridge.readString(4, __dbResults);
    this.iso_code = JdbcWritableBridge.readString(5, __dbResults);
    this.region_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.region_name = JdbcWritableBridge.readString(7, __dbResults);
    this.login_day_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_day_count = JdbcWritableBridge.readLong(9, __dbResults);
    this.order_day_amount = JdbcWritableBridge.readDouble(10, __dbResults);
    this.payment_day_count = JdbcWritableBridge.readLong(11, __dbResults);
    this.payment_day_amount = JdbcWritableBridge.readDouble(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.dt = JdbcWritableBridge.readDate(1, __dbResults);
    this.id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.province_name = JdbcWritableBridge.readString(3, __dbResults);
    this.area_code = JdbcWritableBridge.readString(4, __dbResults);
    this.iso_code = JdbcWritableBridge.readString(5, __dbResults);
    this.region_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.region_name = JdbcWritableBridge.readString(7, __dbResults);
    this.login_day_count = JdbcWritableBridge.readLong(8, __dbResults);
    this.order_day_count = JdbcWritableBridge.readLong(9, __dbResults);
    this.order_day_amount = JdbcWritableBridge.readDouble(10, __dbResults);
    this.payment_day_count = JdbcWritableBridge.readLong(11, __dbResults);
    this.payment_day_amount = JdbcWritableBridge.readDouble(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(iso_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(region_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(region_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(login_day_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_day_count, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(order_day_amount, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(payment_day_count, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(payment_day_amount, 12 + __off, 8, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(dt, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(province_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(iso_code, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(region_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(region_name, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(login_day_count, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(order_day_count, 9 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(order_day_amount, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(payment_day_count, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(payment_day_amount, 12 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.dt = null;
    } else {
    this.dt = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.province_name = null;
    } else {
    this.province_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.area_code = null;
    } else {
    this.area_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.iso_code = null;
    } else {
    this.iso_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_id = null;
    } else {
    this.region_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.region_name = null;
    } else {
    this.region_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.login_day_count = null;
    } else {
    this.login_day_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_day_count = null;
    } else {
    this.order_day_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.order_day_amount = null;
    } else {
    this.order_day_amount = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.payment_day_count = null;
    } else {
    this.payment_day_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.payment_day_amount = null;
    } else {
    this.payment_day_amount = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.area_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_code);
    }
    if (null == this.iso_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iso_code);
    }
    if (null == this.region_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region_id);
    }
    if (null == this.region_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_name);
    }
    if (null == this.login_day_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.login_day_count);
    }
    if (null == this.order_day_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_day_count);
    }
    if (null == this.order_day_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.order_day_amount);
    }
    if (null == this.payment_day_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.payment_day_count);
    }
    if (null == this.payment_day_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.payment_day_amount);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dt.getTime());
    }
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.province_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province_name);
    }
    if (null == this.area_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_code);
    }
    if (null == this.iso_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, iso_code);
    }
    if (null == this.region_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region_id);
    }
    if (null == this.region_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, region_name);
    }
    if (null == this.login_day_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.login_day_count);
    }
    if (null == this.order_day_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.order_day_count);
    }
    if (null == this.order_day_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.order_day_amount);
    }
    if (null == this.payment_day_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.payment_day_count);
    }
    if (null == this.payment_day_amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.payment_day_amount);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":"" + dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_code==null?"null":area_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iso_code==null?"null":iso_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_id==null?"null":"" + region_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_name==null?"null":region_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(login_day_count==null?"null":"" + login_day_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_day_count==null?"null":"" + order_day_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_day_amount==null?"null":"" + order_day_amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_day_count==null?"null":"" + payment_day_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_day_amount==null?"null":"" + payment_day_amount, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(dt==null?"null":"" + dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province_name==null?"null":province_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_code==null?"null":area_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iso_code==null?"null":iso_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_id==null?"null":"" + region_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_name==null?"null":region_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(login_day_count==null?"null":"" + login_day_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_day_count==null?"null":"" + order_day_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_day_amount==null?"null":"" + order_day_amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_day_count==null?"null":"" + payment_day_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(payment_day_amount==null?"null":"" + payment_day_amount, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.dt = null; } else {
      this.dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.area_code = null; } else {
      this.area_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.iso_code = null; } else {
      this.iso_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.region_id = null; } else {
      this.region_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.region_name = null; } else {
      this.region_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.login_day_count = null; } else {
      this.login_day_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_day_count = null; } else {
      this.order_day_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_day_amount = null; } else {
      this.order_day_amount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.payment_day_count = null; } else {
      this.payment_day_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.payment_day_amount = null; } else {
      this.payment_day_amount = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.dt = null; } else {
      this.dt = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.province_name = null; } else {
      this.province_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.area_code = null; } else {
      this.area_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.iso_code = null; } else {
      this.iso_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.region_id = null; } else {
      this.region_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N")) { this.region_name = null; } else {
      this.region_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.login_day_count = null; } else {
      this.login_day_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_day_count = null; } else {
      this.order_day_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.order_day_amount = null; } else {
      this.order_day_amount = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.payment_day_count = null; } else {
      this.payment_day_count = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.payment_day_amount = null; } else {
      this.payment_day_amount = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    ads_area_topic o = (ads_area_topic) super.clone();
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
    return o;
  }

  public void clone0(ads_area_topic o) throws CloneNotSupportedException {
    o.dt = (o.dt != null) ? (java.sql.Date) o.dt.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("area_code", this.area_code);
    __sqoop$field_map.put("iso_code", this.iso_code);
    __sqoop$field_map.put("region_id", this.region_id);
    __sqoop$field_map.put("region_name", this.region_name);
    __sqoop$field_map.put("login_day_count", this.login_day_count);
    __sqoop$field_map.put("order_day_count", this.order_day_count);
    __sqoop$field_map.put("order_day_amount", this.order_day_amount);
    __sqoop$field_map.put("payment_day_count", this.payment_day_count);
    __sqoop$field_map.put("payment_day_amount", this.payment_day_amount);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("dt", this.dt);
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("province_name", this.province_name);
    __sqoop$field_map.put("area_code", this.area_code);
    __sqoop$field_map.put("iso_code", this.iso_code);
    __sqoop$field_map.put("region_id", this.region_id);
    __sqoop$field_map.put("region_name", this.region_name);
    __sqoop$field_map.put("login_day_count", this.login_day_count);
    __sqoop$field_map.put("order_day_count", this.order_day_count);
    __sqoop$field_map.put("order_day_amount", this.order_day_amount);
    __sqoop$field_map.put("payment_day_count", this.payment_day_count);
    __sqoop$field_map.put("payment_day_amount", this.payment_day_amount);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
    }
    else    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
    }
    else    if ("area_code".equals(__fieldName)) {
      this.area_code = (String) __fieldVal;
    }
    else    if ("iso_code".equals(__fieldName)) {
      this.iso_code = (String) __fieldVal;
    }
    else    if ("region_id".equals(__fieldName)) {
      this.region_id = (Integer) __fieldVal;
    }
    else    if ("region_name".equals(__fieldName)) {
      this.region_name = (String) __fieldVal;
    }
    else    if ("login_day_count".equals(__fieldName)) {
      this.login_day_count = (Long) __fieldVal;
    }
    else    if ("order_day_count".equals(__fieldName)) {
      this.order_day_count = (Long) __fieldVal;
    }
    else    if ("order_day_amount".equals(__fieldName)) {
      this.order_day_amount = (Double) __fieldVal;
    }
    else    if ("payment_day_count".equals(__fieldName)) {
      this.payment_day_count = (Long) __fieldVal;
    }
    else    if ("payment_day_amount".equals(__fieldName)) {
      this.payment_day_amount = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("dt".equals(__fieldName)) {
      this.dt = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("id".equals(__fieldName)) {
      this.id = (Integer) __fieldVal;
      return true;
    }
    else    if ("province_name".equals(__fieldName)) {
      this.province_name = (String) __fieldVal;
      return true;
    }
    else    if ("area_code".equals(__fieldName)) {
      this.area_code = (String) __fieldVal;
      return true;
    }
    else    if ("iso_code".equals(__fieldName)) {
      this.iso_code = (String) __fieldVal;
      return true;
    }
    else    if ("region_id".equals(__fieldName)) {
      this.region_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("region_name".equals(__fieldName)) {
      this.region_name = (String) __fieldVal;
      return true;
    }
    else    if ("login_day_count".equals(__fieldName)) {
      this.login_day_count = (Long) __fieldVal;
      return true;
    }
    else    if ("order_day_count".equals(__fieldName)) {
      this.order_day_count = (Long) __fieldVal;
      return true;
    }
    else    if ("order_day_amount".equals(__fieldName)) {
      this.order_day_amount = (Double) __fieldVal;
      return true;
    }
    else    if ("payment_day_count".equals(__fieldName)) {
      this.payment_day_count = (Long) __fieldVal;
      return true;
    }
    else    if ("payment_day_amount".equals(__fieldName)) {
      this.payment_day_amount = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
