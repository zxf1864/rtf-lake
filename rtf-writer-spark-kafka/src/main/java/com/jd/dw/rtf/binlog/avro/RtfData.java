/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

 package com.jd.dw.rtf.binlog.avro;

import com.github.shyiko.mysql.binlog.event.Event;
import com.github.shyiko.mysql.binlog.event.EventHeader;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RtfData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3404325152517828401L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RtfData\",\"namespace\":\"com.jd.dw.rtf.binlog.avro\",\"fields\":[{\"name\":\"mid\",\"type\":\"long\"},{\"name\":\"db\",\"type\":\"string\"},{\"name\":\"tb\",\"type\":\"string\"},{\"name\":\"ts\",\"type\":\"long\"},{\"name\":\"opt\",\"type\":\"string\"},{\"name\":\"src\",\"type\":[{\"type\":\"map\",\"values\":[\"string\",\"null\"]},\"null\"]},{\"name\":\"cur\",\"type\":[{\"type\":\"map\",\"values\":[\"string\",\"null\"]},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long mid;
  @Deprecated public java.lang.CharSequence db;
  @Deprecated public java.lang.CharSequence tb;
  @Deprecated public long ts;
  @Deprecated public java.lang.CharSequence opt;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> src;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> cur;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   * @param event
   * @param databaseName
   * @param tableName
   */
  public RtfData() {}

  public RtfData(final Event event, String databaseName, String tableName){
    this.init(event);
    this.db = databaseName;
    this.tb = tableName;
  }

  private void init(final Event event) {
    this.mid = uuid.getAndAdd(1);
    EventHeader eventHeader = event.getHeader();
    this.ts = eventHeader.getTimestamp();
  }

  private static AtomicLong uuid = new AtomicLong(0);

  /**
   * All-args constructor.
   */
  public RtfData(java.lang.Long mid, java.lang.CharSequence db, java.lang.CharSequence tb, java.lang.Long ts, java.lang.CharSequence opt, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> src, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> cur) {
    this.mid = mid;
    this.db = db;
    this.tb = tb;
    this.ts = ts;
    this.opt = opt;
    this.src = src;
    this.cur = cur;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mid;
    case 1: return db;
    case 2: return tb;
    case 3: return ts;
    case 4: return opt;
    case 5: return src;
    case 6: return cur;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mid = (java.lang.Long)value$; break;
    case 1: db = (java.lang.CharSequence)value$; break;
    case 2: tb = (java.lang.CharSequence)value$; break;
    case 3: ts = (java.lang.Long)value$; break;
    case 4: opt = (java.lang.CharSequence)value$; break;
    case 5: src = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 6: cur = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'mid' field.
   */
  public java.lang.Long getMid() {
    return mid;
  }

  /**
   * Sets the value of the 'mid' field.
   * @param value the value to set.
   */
  public void setMid(java.lang.Long value) {
    this.mid = value;
  }

  /**
   * Gets the value of the 'db' field.
   */
  public java.lang.CharSequence getDb() {
    return db;
  }

  /**
   * Sets the value of the 'db' field.
   * @param value the value to set.
   */
  public void setDb(java.lang.CharSequence value) {
    this.db = value;
  }

  /**
   * Gets the value of the 'tb' field.
   */
  public java.lang.CharSequence getTb() {
    return tb;
  }

  /**
   * Sets the value of the 'tb' field.
   * @param value the value to set.
   */
  public void setTb(java.lang.CharSequence value) {
    this.tb = value;
  }

  /**
   * Gets the value of the 'ts' field.
   */
  public java.lang.Long getTs() {
    return ts;
  }

  /**
   * Sets the value of the 'ts' field.
   * @param value the value to set.
   */
  public void setTs(java.lang.Long value) {
    this.ts = value;
  }

  /**
   * Gets the value of the 'opt' field.
   */
  public java.lang.CharSequence getOpt() {
    return opt;
  }

  /**
   * Sets the value of the 'opt' field.
   * @param value the value to set.
   */
  public void setOpt(java.lang.CharSequence value) {
    this.opt = value;
  }

  /**
   * Gets the value of the 'src' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getSrc() {
    return src;
  }

  /**
   * Sets the value of the 'src' field.
   * @param value the value to set.
   */
  public void setSrc(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.src = value;
  }

  /**
   * Gets the value of the 'cur' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getCur() {
    return cur;
  }

  /**
   * Sets the value of the 'cur' field.
   * @param value the value to set.
   */
  public void setCur(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.cur = value;
  }

  /**
   * Creates a new RtfData RecordBuilder.
   * @return A new RtfData RecordBuilder
   */
  public static com.jd.dw.rtf.binlog.avro.RtfData.Builder newBuilder() {
    return new com.jd.dw.rtf.binlog.avro.RtfData.Builder();
  }

  /**
   * Creates a new RtfData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RtfData RecordBuilder
   */
  public static com.jd.dw.rtf.binlog.avro.RtfData.Builder newBuilder(com.jd.dw.rtf.binlog.avro.RtfData.Builder other) {
    return new com.jd.dw.rtf.binlog.avro.RtfData.Builder(other);
  }

  /**
   * Creates a new RtfData RecordBuilder by copying an existing RtfData instance.
   * @param other The existing instance to copy.
   * @return A new RtfData RecordBuilder
   */
  public static com.jd.dw.rtf.binlog.avro.RtfData.Builder newBuilder(com.jd.dw.rtf.binlog.avro.RtfData other) {
    return new com.jd.dw.rtf.binlog.avro.RtfData.Builder(other);
  }

  /**
   * RecordBuilder for RtfData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RtfData>
    implements org.apache.avro.data.RecordBuilder<RtfData> {

    private long mid;
    private java.lang.CharSequence db;
    private java.lang.CharSequence tb;
    private long ts;
    private java.lang.CharSequence opt;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> src;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> cur;

    /** Creates a new Builder */
    private Builder() {
      super(com.jd.dw.rtf.binlog.avro.RtfData.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.jd.dw.rtf.binlog.avro.RtfData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.mid)) {
        this.mid = data().deepCopy(fields()[0].schema(), other.mid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.db)) {
        this.db = data().deepCopy(fields()[1].schema(), other.db);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tb)) {
        this.tb = data().deepCopy(fields()[2].schema(), other.tb);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ts)) {
        this.ts = data().deepCopy(fields()[3].schema(), other.ts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.opt)) {
        this.opt = data().deepCopy(fields()[4].schema(), other.opt);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.src)) {
        this.src = data().deepCopy(fields()[5].schema(), other.src);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.cur)) {
        this.cur = data().deepCopy(fields()[6].schema(), other.cur);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RtfData instance
     * @param other The existing instance to copy.
     */
    private Builder(com.jd.dw.rtf.binlog.avro.RtfData other) {
            super(com.jd.dw.rtf.binlog.avro.RtfData.SCHEMA$);
      if (isValidValue(fields()[0], other.mid)) {
        this.mid = data().deepCopy(fields()[0].schema(), other.mid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.db)) {
        this.db = data().deepCopy(fields()[1].schema(), other.db);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tb)) {
        this.tb = data().deepCopy(fields()[2].schema(), other.tb);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ts)) {
        this.ts = data().deepCopy(fields()[3].schema(), other.ts);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.opt)) {
        this.opt = data().deepCopy(fields()[4].schema(), other.opt);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.src)) {
        this.src = data().deepCopy(fields()[5].schema(), other.src);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.cur)) {
        this.cur = data().deepCopy(fields()[6].schema(), other.cur);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'mid' field.
      * @return The value.
      */
    public java.lang.Long getMid() {
      return mid;
    }

    /**
      * Sets the value of the 'mid' field.
      * @param value The value of 'mid'.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder setMid(long value) {
      validate(fields()[0], value);
      this.mid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'mid' field has been set.
      * @return True if the 'mid' field has been set, false otherwise.
      */
    public boolean hasMid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'mid' field.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder clearMid() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'db' field.
      * @return The value.
      */
    public java.lang.CharSequence getDb() {
      return db;
    }

    /**
      * Sets the value of the 'db' field.
      * @param value The value of 'db'.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder setDb(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.db = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'db' field has been set.
      * @return True if the 'db' field has been set, false otherwise.
      */
    public boolean hasDb() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'db' field.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder clearDb() {
      db = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'tb' field.
      * @return The value.
      */
    public java.lang.CharSequence getTb() {
      return tb;
    }

    /**
      * Sets the value of the 'tb' field.
      * @param value The value of 'tb'.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder setTb(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.tb = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'tb' field has been set.
      * @return True if the 'tb' field has been set, false otherwise.
      */
    public boolean hasTb() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'tb' field.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder clearTb() {
      tb = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts' field.
      * @return The value.
      */
    public java.lang.Long getTs() {
      return ts;
    }

    /**
      * Sets the value of the 'ts' field.
      * @param value The value of 'ts'.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder setTs(long value) {
      validate(fields()[3], value);
      this.ts = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'ts' field has been set.
      * @return True if the 'ts' field has been set, false otherwise.
      */
    public boolean hasTs() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'ts' field.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder clearTs() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'opt' field.
      * @return The value.
      */
    public java.lang.CharSequence getOpt() {
      return opt;
    }

    /**
      * Sets the value of the 'opt' field.
      * @param value The value of 'opt'.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder setOpt(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.opt = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'opt' field has been set.
      * @return True if the 'opt' field has been set, false otherwise.
      */
    public boolean hasOpt() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'opt' field.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder clearOpt() {
      opt = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'src' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getSrc() {
      return src;
    }

    /**
      * Sets the value of the 'src' field.
      * @param value The value of 'src'.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder setSrc(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.src = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'src' field has been set.
      * @return True if the 'src' field has been set, false otherwise.
      */
    public boolean hasSrc() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'src' field.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder clearSrc() {
      src = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'cur' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getCur() {
      return cur;
    }

    /**
      * Sets the value of the 'cur' field.
      * @param value The value of 'cur'.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder setCur(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[6], value);
      this.cur = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'cur' field has been set.
      * @return True if the 'cur' field has been set, false otherwise.
      */
    public boolean hasCur() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'cur' field.
      * @return This builder.
      */
    public com.jd.dw.rtf.binlog.avro.RtfData.Builder clearCur() {
      cur = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public RtfData build() {
      try {
        RtfData record = new RtfData();
        record.mid = fieldSetFlags()[0] ? this.mid : (java.lang.Long) defaultValue(fields()[0]);
        record.db = fieldSetFlags()[1] ? this.db : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.tb = fieldSetFlags()[2] ? this.tb : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.ts = fieldSetFlags()[3] ? this.ts : (java.lang.Long) defaultValue(fields()[3]);
        record.opt = fieldSetFlags()[4] ? this.opt : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.src = fieldSetFlags()[5] ? this.src : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[5]);
        record.cur = fieldSetFlags()[6] ? this.cur : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

/*  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }*/

}