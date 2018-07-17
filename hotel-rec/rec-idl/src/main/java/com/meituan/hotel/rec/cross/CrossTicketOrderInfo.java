/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.meituan.hotel.rec.cross;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrossTicketOrderInfo implements org.apache.thrift.TBase<CrossTicketOrderInfo, CrossTicketOrderInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CrossTicketOrderInfo");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ORDERID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderid", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ORDER_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("orderTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField DEPARTURE_CITYID_FIELD_DESC = new org.apache.thrift.protocol.TField("departureCityid", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField DESTINATION_CITYID_FIELD_DESC = new org.apache.thrift.protocol.TField("destinationCityid", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField ARRIVE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("arriveTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField EXTRA_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("extraMap", org.apache.thrift.protocol.TType.MAP, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CrossTicketOrderInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CrossTicketOrderInfoTupleSchemeFactory());
  }

  /**
   * 
   * @see OrderTypeEnum
   */
  public OrderTypeEnum type; // optional
  public long orderid; // optional
  public long orderTime; // optional
  public int departureCityid; // optional
  public int destinationCityid; // optional
  public long startTime; // optional
  public long arriveTime; // optional
  public Map<String,String> extraMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see OrderTypeEnum
     */
    TYPE((short)1, "type"),
    ORDERID((short)2, "orderid"),
    ORDER_TIME((short)3, "orderTime"),
    DEPARTURE_CITYID((short)4, "departureCityid"),
    DESTINATION_CITYID((short)5, "destinationCityid"),
    START_TIME((short)6, "startTime"),
    ARRIVE_TIME((short)7, "arriveTime"),
    EXTRA_MAP((short)8, "extraMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // ORDERID
          return ORDERID;
        case 3: // ORDER_TIME
          return ORDER_TIME;
        case 4: // DEPARTURE_CITYID
          return DEPARTURE_CITYID;
        case 5: // DESTINATION_CITYID
          return DESTINATION_CITYID;
        case 6: // START_TIME
          return START_TIME;
        case 7: // ARRIVE_TIME
          return ARRIVE_TIME;
        case 8: // EXTRA_MAP
          return EXTRA_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ORDERID_ISSET_ID = 0;
  private static final int __ORDERTIME_ISSET_ID = 1;
  private static final int __DEPARTURECITYID_ISSET_ID = 2;
  private static final int __DESTINATIONCITYID_ISSET_ID = 3;
  private static final int __STARTTIME_ISSET_ID = 4;
  private static final int __ARRIVETIME_ISSET_ID = 5;
  private BitSet __isset_bit_vector = new BitSet(6);
  private _Fields optionals[] = {_Fields.TYPE,_Fields.ORDERID,_Fields.ORDER_TIME,_Fields.DEPARTURE_CITYID,_Fields.DESTINATION_CITYID,_Fields.START_TIME,_Fields.ARRIVE_TIME,_Fields.EXTRA_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, OrderTypeEnum.class)));
    tmpMap.put(_Fields.ORDERID, new org.apache.thrift.meta_data.FieldMetaData("orderid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ORDER_TIME, new org.apache.thrift.meta_data.FieldMetaData("orderTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DEPARTURE_CITYID, new org.apache.thrift.meta_data.FieldMetaData("departureCityid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESTINATION_CITYID, new org.apache.thrift.meta_data.FieldMetaData("destinationCityid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ARRIVE_TIME, new org.apache.thrift.meta_data.FieldMetaData("arriveTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXTRA_MAP, new org.apache.thrift.meta_data.FieldMetaData("extraMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CrossTicketOrderInfo.class, metaDataMap);
  }

  public CrossTicketOrderInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CrossTicketOrderInfo(CrossTicketOrderInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.orderid = other.orderid;
    this.orderTime = other.orderTime;
    this.departureCityid = other.departureCityid;
    this.destinationCityid = other.destinationCityid;
    this.startTime = other.startTime;
    this.arriveTime = other.arriveTime;
    if (other.isSetExtraMap()) {
      Map<String,String> __this__extraMap = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.extraMap.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__extraMap_copy_key = other_element_key;

        String __this__extraMap_copy_value = other_element_value;

        __this__extraMap.put(__this__extraMap_copy_key, __this__extraMap_copy_value);
      }
      this.extraMap = __this__extraMap;
    }
  }

  public CrossTicketOrderInfo deepCopy() {
    return new CrossTicketOrderInfo(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setOrderidIsSet(false);
    this.orderid = 0;
    setOrderTimeIsSet(false);
    this.orderTime = 0;
    setDepartureCityidIsSet(false);
    this.departureCityid = 0;
    setDestinationCityidIsSet(false);
    this.destinationCityid = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setArriveTimeIsSet(false);
    this.arriveTime = 0;
    this.extraMap = null;
  }

  /**
   * 
   * @see OrderTypeEnum
   */
  public OrderTypeEnum getType() {
    return this.type;
  }

  /**
   * 
   * @see OrderTypeEnum
   */
  public CrossTicketOrderInfo setType(OrderTypeEnum type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public long getOrderid() {
    return this.orderid;
  }

  public CrossTicketOrderInfo setOrderid(long orderid) {
    this.orderid = orderid;
    setOrderidIsSet(true);
    return this;
  }

  public void unsetOrderid() {
    __isset_bit_vector.clear(__ORDERID_ISSET_ID);
  }

  /** Returns true if field orderid is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderid() {
    return __isset_bit_vector.get(__ORDERID_ISSET_ID);
  }

  public void setOrderidIsSet(boolean value) {
    __isset_bit_vector.set(__ORDERID_ISSET_ID, value);
  }

  public long getOrderTime() {
    return this.orderTime;
  }

  public CrossTicketOrderInfo setOrderTime(long orderTime) {
    this.orderTime = orderTime;
    setOrderTimeIsSet(true);
    return this;
  }

  public void unsetOrderTime() {
    __isset_bit_vector.clear(__ORDERTIME_ISSET_ID);
  }

  /** Returns true if field orderTime is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderTime() {
    return __isset_bit_vector.get(__ORDERTIME_ISSET_ID);
  }

  public void setOrderTimeIsSet(boolean value) {
    __isset_bit_vector.set(__ORDERTIME_ISSET_ID, value);
  }

  public int getDepartureCityid() {
    return this.departureCityid;
  }

  public CrossTicketOrderInfo setDepartureCityid(int departureCityid) {
    this.departureCityid = departureCityid;
    setDepartureCityidIsSet(true);
    return this;
  }

  public void unsetDepartureCityid() {
    __isset_bit_vector.clear(__DEPARTURECITYID_ISSET_ID);
  }

  /** Returns true if field departureCityid is set (has been assigned a value) and false otherwise */
  public boolean isSetDepartureCityid() {
    return __isset_bit_vector.get(__DEPARTURECITYID_ISSET_ID);
  }

  public void setDepartureCityidIsSet(boolean value) {
    __isset_bit_vector.set(__DEPARTURECITYID_ISSET_ID, value);
  }

  public int getDestinationCityid() {
    return this.destinationCityid;
  }

  public CrossTicketOrderInfo setDestinationCityid(int destinationCityid) {
    this.destinationCityid = destinationCityid;
    setDestinationCityidIsSet(true);
    return this;
  }

  public void unsetDestinationCityid() {
    __isset_bit_vector.clear(__DESTINATIONCITYID_ISSET_ID);
  }

  /** Returns true if field destinationCityid is set (has been assigned a value) and false otherwise */
  public boolean isSetDestinationCityid() {
    return __isset_bit_vector.get(__DESTINATIONCITYID_ISSET_ID);
  }

  public void setDestinationCityidIsSet(boolean value) {
    __isset_bit_vector.set(__DESTINATIONCITYID_ISSET_ID, value);
  }

  public long getStartTime() {
    return this.startTime;
  }

  public CrossTicketOrderInfo setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bit_vector.clear(__STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return __isset_bit_vector.get(__STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bit_vector.set(__STARTTIME_ISSET_ID, value);
  }

  public long getArriveTime() {
    return this.arriveTime;
  }

  public CrossTicketOrderInfo setArriveTime(long arriveTime) {
    this.arriveTime = arriveTime;
    setArriveTimeIsSet(true);
    return this;
  }

  public void unsetArriveTime() {
    __isset_bit_vector.clear(__ARRIVETIME_ISSET_ID);
  }

  /** Returns true if field arriveTime is set (has been assigned a value) and false otherwise */
  public boolean isSetArriveTime() {
    return __isset_bit_vector.get(__ARRIVETIME_ISSET_ID);
  }

  public void setArriveTimeIsSet(boolean value) {
    __isset_bit_vector.set(__ARRIVETIME_ISSET_ID, value);
  }

  public int getExtraMapSize() {
    return (this.extraMap == null) ? 0 : this.extraMap.size();
  }

  public void putToExtraMap(String key, String val) {
    if (this.extraMap == null) {
      this.extraMap = new HashMap<String,String>();
    }
    this.extraMap.put(key, val);
  }

  public Map<String,String> getExtraMap() {
    return this.extraMap;
  }

  public CrossTicketOrderInfo setExtraMap(Map<String,String> extraMap) {
    this.extraMap = extraMap;
    return this;
  }

  public void unsetExtraMap() {
    this.extraMap = null;
  }

  /** Returns true if field extraMap is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraMap() {
    return this.extraMap != null;
  }

  public void setExtraMapIsSet(boolean value) {
    if (!value) {
      this.extraMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((OrderTypeEnum)value);
      }
      break;

    case ORDERID:
      if (value == null) {
        unsetOrderid();
      } else {
        setOrderid((Long)value);
      }
      break;

    case ORDER_TIME:
      if (value == null) {
        unsetOrderTime();
      } else {
        setOrderTime((Long)value);
      }
      break;

    case DEPARTURE_CITYID:
      if (value == null) {
        unsetDepartureCityid();
      } else {
        setDepartureCityid((Integer)value);
      }
      break;

    case DESTINATION_CITYID:
      if (value == null) {
        unsetDestinationCityid();
      } else {
        setDestinationCityid((Integer)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case ARRIVE_TIME:
      if (value == null) {
        unsetArriveTime();
      } else {
        setArriveTime((Long)value);
      }
      break;

    case EXTRA_MAP:
      if (value == null) {
        unsetExtraMap();
      } else {
        setExtraMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case ORDERID:
      return Long.valueOf(getOrderid());

    case ORDER_TIME:
      return Long.valueOf(getOrderTime());

    case DEPARTURE_CITYID:
      return Integer.valueOf(getDepartureCityid());

    case DESTINATION_CITYID:
      return Integer.valueOf(getDestinationCityid());

    case START_TIME:
      return Long.valueOf(getStartTime());

    case ARRIVE_TIME:
      return Long.valueOf(getArriveTime());

    case EXTRA_MAP:
      return getExtraMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case ORDERID:
      return isSetOrderid();
    case ORDER_TIME:
      return isSetOrderTime();
    case DEPARTURE_CITYID:
      return isSetDepartureCityid();
    case DESTINATION_CITYID:
      return isSetDestinationCityid();
    case START_TIME:
      return isSetStartTime();
    case ARRIVE_TIME:
      return isSetArriveTime();
    case EXTRA_MAP:
      return isSetExtraMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CrossTicketOrderInfo)
      return this.equals((CrossTicketOrderInfo)that);
    return false;
  }

  public boolean equals(CrossTicketOrderInfo that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_orderid = true && this.isSetOrderid();
    boolean that_present_orderid = true && that.isSetOrderid();
    if (this_present_orderid || that_present_orderid) {
      if (!(this_present_orderid && that_present_orderid))
        return false;
      if (this.orderid != that.orderid)
        return false;
    }

    boolean this_present_orderTime = true && this.isSetOrderTime();
    boolean that_present_orderTime = true && that.isSetOrderTime();
    if (this_present_orderTime || that_present_orderTime) {
      if (!(this_present_orderTime && that_present_orderTime))
        return false;
      if (this.orderTime != that.orderTime)
        return false;
    }

    boolean this_present_departureCityid = true && this.isSetDepartureCityid();
    boolean that_present_departureCityid = true && that.isSetDepartureCityid();
    if (this_present_departureCityid || that_present_departureCityid) {
      if (!(this_present_departureCityid && that_present_departureCityid))
        return false;
      if (this.departureCityid != that.departureCityid)
        return false;
    }

    boolean this_present_destinationCityid = true && this.isSetDestinationCityid();
    boolean that_present_destinationCityid = true && that.isSetDestinationCityid();
    if (this_present_destinationCityid || that_present_destinationCityid) {
      if (!(this_present_destinationCityid && that_present_destinationCityid))
        return false;
      if (this.destinationCityid != that.destinationCityid)
        return false;
    }

    boolean this_present_startTime = true && this.isSetStartTime();
    boolean that_present_startTime = true && that.isSetStartTime();
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_arriveTime = true && this.isSetArriveTime();
    boolean that_present_arriveTime = true && that.isSetArriveTime();
    if (this_present_arriveTime || that_present_arriveTime) {
      if (!(this_present_arriveTime && that_present_arriveTime))
        return false;
      if (this.arriveTime != that.arriveTime)
        return false;
    }

    boolean this_present_extraMap = true && this.isSetExtraMap();
    boolean that_present_extraMap = true && that.isSetExtraMap();
    if (this_present_extraMap || that_present_extraMap) {
      if (!(this_present_extraMap && that_present_extraMap))
        return false;
      if (!this.extraMap.equals(that.extraMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(CrossTicketOrderInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    CrossTicketOrderInfo typedOther = (CrossTicketOrderInfo)other;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderid()).compareTo(typedOther.isSetOrderid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderid, typedOther.orderid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderTime()).compareTo(typedOther.isSetOrderTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderTime, typedOther.orderTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepartureCityid()).compareTo(typedOther.isSetDepartureCityid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepartureCityid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.departureCityid, typedOther.departureCityid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDestinationCityid()).compareTo(typedOther.isSetDestinationCityid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDestinationCityid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.destinationCityid, typedOther.destinationCityid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(typedOther.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, typedOther.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArriveTime()).compareTo(typedOther.isSetArriveTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArriveTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arriveTime, typedOther.arriveTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraMap()).compareTo(typedOther.isSetExtraMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraMap, typedOther.extraMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CrossTicketOrderInfo(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetOrderid()) {
      if (!first) sb.append(", ");
      sb.append("orderid:");
      sb.append(this.orderid);
      first = false;
    }
    if (isSetOrderTime()) {
      if (!first) sb.append(", ");
      sb.append("orderTime:");
      sb.append(this.orderTime);
      first = false;
    }
    if (isSetDepartureCityid()) {
      if (!first) sb.append(", ");
      sb.append("departureCityid:");
      sb.append(this.departureCityid);
      first = false;
    }
    if (isSetDestinationCityid()) {
      if (!first) sb.append(", ");
      sb.append("destinationCityid:");
      sb.append(this.destinationCityid);
      first = false;
    }
    if (isSetStartTime()) {
      if (!first) sb.append(", ");
      sb.append("startTime:");
      sb.append(this.startTime);
      first = false;
    }
    if (isSetArriveTime()) {
      if (!first) sb.append(", ");
      sb.append("arriveTime:");
      sb.append(this.arriveTime);
      first = false;
    }
    if (isSetExtraMap()) {
      if (!first) sb.append(", ");
      sb.append("extraMap:");
      if (this.extraMap == null) {
        sb.append("null");
      } else {
        sb.append(this.extraMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CrossTicketOrderInfoStandardSchemeFactory implements SchemeFactory {
    public CrossTicketOrderInfoStandardScheme getScheme() {
      return new CrossTicketOrderInfoStandardScheme();
    }
  }

  private static class CrossTicketOrderInfoStandardScheme extends StandardScheme<CrossTicketOrderInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CrossTicketOrderInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = OrderTypeEnum.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORDERID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.orderid = iprot.readI64();
              struct.setOrderidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ORDER_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.orderTime = iprot.readI64();
              struct.setOrderTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEPARTURE_CITYID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.departureCityid = iprot.readI32();
              struct.setDepartureCityidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DESTINATION_CITYID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.destinationCityid = iprot.readI32();
              struct.setDestinationCityidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ARRIVE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.arriveTime = iprot.readI64();
              struct.setArriveTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // EXTRA_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map36 = iprot.readMapBegin();
                struct.extraMap = new HashMap<String,String>(2*_map36.size);
                for (int _i37 = 0; _i37 < _map36.size; ++_i37)
                {
                  String _key38; // required
                  String _val39; // required
                  _key38 = iprot.readString();
                  _val39 = iprot.readString();
                  struct.extraMap.put(_key38, _val39);
                }
                iprot.readMapEnd();
              }
              struct.setExtraMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CrossTicketOrderInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeI32(struct.type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetOrderid()) {
        oprot.writeFieldBegin(ORDERID_FIELD_DESC);
        oprot.writeI64(struct.orderid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOrderTime()) {
        oprot.writeFieldBegin(ORDER_TIME_FIELD_DESC);
        oprot.writeI64(struct.orderTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDepartureCityid()) {
        oprot.writeFieldBegin(DEPARTURE_CITYID_FIELD_DESC);
        oprot.writeI32(struct.departureCityid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetDestinationCityid()) {
        oprot.writeFieldBegin(DESTINATION_CITYID_FIELD_DESC);
        oprot.writeI32(struct.destinationCityid);
        oprot.writeFieldEnd();
      }
      if (struct.isSetStartTime()) {
        oprot.writeFieldBegin(START_TIME_FIELD_DESC);
        oprot.writeI64(struct.startTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetArriveTime()) {
        oprot.writeFieldBegin(ARRIVE_TIME_FIELD_DESC);
        oprot.writeI64(struct.arriveTime);
        oprot.writeFieldEnd();
      }
      if (struct.extraMap != null) {
        if (struct.isSetExtraMap()) {
          oprot.writeFieldBegin(EXTRA_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraMap.size()));
            for (Map.Entry<String, String> _iter40 : struct.extraMap.entrySet())
            {
              oprot.writeString(_iter40.getKey());
              oprot.writeString(_iter40.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CrossTicketOrderInfoTupleSchemeFactory implements SchemeFactory {
    public CrossTicketOrderInfoTupleScheme getScheme() {
      return new CrossTicketOrderInfoTupleScheme();
    }
  }

  private static class CrossTicketOrderInfoTupleScheme extends TupleScheme<CrossTicketOrderInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CrossTicketOrderInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetOrderid()) {
        optionals.set(1);
      }
      if (struct.isSetOrderTime()) {
        optionals.set(2);
      }
      if (struct.isSetDepartureCityid()) {
        optionals.set(3);
      }
      if (struct.isSetDestinationCityid()) {
        optionals.set(4);
      }
      if (struct.isSetStartTime()) {
        optionals.set(5);
      }
      if (struct.isSetArriveTime()) {
        optionals.set(6);
      }
      if (struct.isSetExtraMap()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetOrderid()) {
        oprot.writeI64(struct.orderid);
      }
      if (struct.isSetOrderTime()) {
        oprot.writeI64(struct.orderTime);
      }
      if (struct.isSetDepartureCityid()) {
        oprot.writeI32(struct.departureCityid);
      }
      if (struct.isSetDestinationCityid()) {
        oprot.writeI32(struct.destinationCityid);
      }
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetArriveTime()) {
        oprot.writeI64(struct.arriveTime);
      }
      if (struct.isSetExtraMap()) {
        {
          oprot.writeI32(struct.extraMap.size());
          for (Map.Entry<String, String> _iter41 : struct.extraMap.entrySet())
          {
            oprot.writeString(_iter41.getKey());
            oprot.writeString(_iter41.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CrossTicketOrderInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.type = OrderTypeEnum.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.orderid = iprot.readI64();
        struct.setOrderidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.orderTime = iprot.readI64();
        struct.setOrderTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.departureCityid = iprot.readI32();
        struct.setDepartureCityidIsSet(true);
      }
      if (incoming.get(4)) {
        struct.destinationCityid = iprot.readI32();
        struct.setDestinationCityidIsSet(true);
      }
      if (incoming.get(5)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.arriveTime = iprot.readI64();
        struct.setArriveTimeIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TMap _map42 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraMap = new HashMap<String,String>(2*_map42.size);
          for (int _i43 = 0; _i43 < _map42.size; ++_i43)
          {
            String _key44; // required
            String _val45; // required
            _key44 = iprot.readString();
            _val45 = iprot.readString();
            struct.extraMap.put(_key44, _val45);
          }
        }
        struct.setExtraMapIsSet(true);
      }
    }
  }

}

