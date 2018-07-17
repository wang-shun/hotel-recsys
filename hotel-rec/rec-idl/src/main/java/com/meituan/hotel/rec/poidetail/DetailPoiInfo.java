/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.meituan.hotel.rec.poidetail;

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

public class DetailPoiInfo implements org.apache.thrift.TBase<DetailPoiInfo, DetailPoiInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DetailPoiInfo");

  private static final org.apache.thrift.protocol.TField POI_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("poiId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DEAL_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("dealIdList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField GOODS_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("goodsIdList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField EXTRA_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("extraMap", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DetailPoiInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DetailPoiInfoTupleSchemeFactory());
  }

  public int poiId; // required
  public List<Integer> dealIdList; // optional
  public List<Integer> goodsIdList; // optional
  public Map<String,String> extraMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POI_ID((short)1, "poiId"),
    DEAL_ID_LIST((short)2, "dealIdList"),
    GOODS_ID_LIST((short)3, "goodsIdList"),
    EXTRA_MAP((short)4, "extraMap");

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
        case 1: // POI_ID
          return POI_ID;
        case 2: // DEAL_ID_LIST
          return DEAL_ID_LIST;
        case 3: // GOODS_ID_LIST
          return GOODS_ID_LIST;
        case 4: // EXTRA_MAP
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
  private static final int __POIID_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  private _Fields optionals[] = {_Fields.DEAL_ID_LIST,_Fields.GOODS_ID_LIST,_Fields.EXTRA_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POI_ID, new org.apache.thrift.meta_data.FieldMetaData("poiId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DEAL_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("dealIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.GOODS_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("goodsIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.EXTRA_MAP, new org.apache.thrift.meta_data.FieldMetaData("extraMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DetailPoiInfo.class, metaDataMap);
  }

  public DetailPoiInfo() {
  }

  public DetailPoiInfo(
    int poiId)
  {
    this();
    this.poiId = poiId;
    setPoiIdIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DetailPoiInfo(DetailPoiInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.poiId = other.poiId;
    if (other.isSetDealIdList()) {
      List<Integer> __this__dealIdList = new ArrayList<Integer>();
      for (Integer other_element : other.dealIdList) {
        __this__dealIdList.add(other_element);
      }
      this.dealIdList = __this__dealIdList;
    }
    if (other.isSetGoodsIdList()) {
      List<Integer> __this__goodsIdList = new ArrayList<Integer>();
      for (Integer other_element : other.goodsIdList) {
        __this__goodsIdList.add(other_element);
      }
      this.goodsIdList = __this__goodsIdList;
    }
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

  public DetailPoiInfo deepCopy() {
    return new DetailPoiInfo(this);
  }

  @Override
  public void clear() {
    setPoiIdIsSet(false);
    this.poiId = 0;
    this.dealIdList = null;
    this.goodsIdList = null;
    this.extraMap = null;
  }

  public int getPoiId() {
    return this.poiId;
  }

  public DetailPoiInfo setPoiId(int poiId) {
    this.poiId = poiId;
    setPoiIdIsSet(true);
    return this;
  }

  public void unsetPoiId() {
    __isset_bit_vector.clear(__POIID_ISSET_ID);
  }

  /** Returns true if field poiId is set (has been assigned a value) and false otherwise */
  public boolean isSetPoiId() {
    return __isset_bit_vector.get(__POIID_ISSET_ID);
  }

  public void setPoiIdIsSet(boolean value) {
    __isset_bit_vector.set(__POIID_ISSET_ID, value);
  }

  public int getDealIdListSize() {
    return (this.dealIdList == null) ? 0 : this.dealIdList.size();
  }

  public java.util.Iterator<Integer> getDealIdListIterator() {
    return (this.dealIdList == null) ? null : this.dealIdList.iterator();
  }

  public void addToDealIdList(int elem) {
    if (this.dealIdList == null) {
      this.dealIdList = new ArrayList<Integer>();
    }
    this.dealIdList.add(elem);
  }

  public List<Integer> getDealIdList() {
    return this.dealIdList;
  }

  public DetailPoiInfo setDealIdList(List<Integer> dealIdList) {
    this.dealIdList = dealIdList;
    return this;
  }

  public void unsetDealIdList() {
    this.dealIdList = null;
  }

  /** Returns true if field dealIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetDealIdList() {
    return this.dealIdList != null;
  }

  public void setDealIdListIsSet(boolean value) {
    if (!value) {
      this.dealIdList = null;
    }
  }

  public int getGoodsIdListSize() {
    return (this.goodsIdList == null) ? 0 : this.goodsIdList.size();
  }

  public java.util.Iterator<Integer> getGoodsIdListIterator() {
    return (this.goodsIdList == null) ? null : this.goodsIdList.iterator();
  }

  public void addToGoodsIdList(int elem) {
    if (this.goodsIdList == null) {
      this.goodsIdList = new ArrayList<Integer>();
    }
    this.goodsIdList.add(elem);
  }

  public List<Integer> getGoodsIdList() {
    return this.goodsIdList;
  }

  public DetailPoiInfo setGoodsIdList(List<Integer> goodsIdList) {
    this.goodsIdList = goodsIdList;
    return this;
  }

  public void unsetGoodsIdList() {
    this.goodsIdList = null;
  }

  /** Returns true if field goodsIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetGoodsIdList() {
    return this.goodsIdList != null;
  }

  public void setGoodsIdListIsSet(boolean value) {
    if (!value) {
      this.goodsIdList = null;
    }
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

  public DetailPoiInfo setExtraMap(Map<String,String> extraMap) {
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
    case POI_ID:
      if (value == null) {
        unsetPoiId();
      } else {
        setPoiId((Integer)value);
      }
      break;

    case DEAL_ID_LIST:
      if (value == null) {
        unsetDealIdList();
      } else {
        setDealIdList((List<Integer>)value);
      }
      break;

    case GOODS_ID_LIST:
      if (value == null) {
        unsetGoodsIdList();
      } else {
        setGoodsIdList((List<Integer>)value);
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
    case POI_ID:
      return Integer.valueOf(getPoiId());

    case DEAL_ID_LIST:
      return getDealIdList();

    case GOODS_ID_LIST:
      return getGoodsIdList();

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
    case POI_ID:
      return isSetPoiId();
    case DEAL_ID_LIST:
      return isSetDealIdList();
    case GOODS_ID_LIST:
      return isSetGoodsIdList();
    case EXTRA_MAP:
      return isSetExtraMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DetailPoiInfo)
      return this.equals((DetailPoiInfo)that);
    return false;
  }

  public boolean equals(DetailPoiInfo that) {
    if (that == null)
      return false;

    boolean this_present_poiId = true;
    boolean that_present_poiId = true;
    if (this_present_poiId || that_present_poiId) {
      if (!(this_present_poiId && that_present_poiId))
        return false;
      if (this.poiId != that.poiId)
        return false;
    }

    boolean this_present_dealIdList = true && this.isSetDealIdList();
    boolean that_present_dealIdList = true && that.isSetDealIdList();
    if (this_present_dealIdList || that_present_dealIdList) {
      if (!(this_present_dealIdList && that_present_dealIdList))
        return false;
      if (!this.dealIdList.equals(that.dealIdList))
        return false;
    }

    boolean this_present_goodsIdList = true && this.isSetGoodsIdList();
    boolean that_present_goodsIdList = true && that.isSetGoodsIdList();
    if (this_present_goodsIdList || that_present_goodsIdList) {
      if (!(this_present_goodsIdList && that_present_goodsIdList))
        return false;
      if (!this.goodsIdList.equals(that.goodsIdList))
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

  public int compareTo(DetailPoiInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DetailPoiInfo typedOther = (DetailPoiInfo)other;

    lastComparison = Boolean.valueOf(isSetPoiId()).compareTo(typedOther.isSetPoiId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoiId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poiId, typedOther.poiId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDealIdList()).compareTo(typedOther.isSetDealIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDealIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dealIdList, typedOther.dealIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGoodsIdList()).compareTo(typedOther.isSetGoodsIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGoodsIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.goodsIdList, typedOther.goodsIdList);
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
    StringBuilder sb = new StringBuilder("DetailPoiInfo(");
    boolean first = true;

    sb.append("poiId:");
    sb.append(this.poiId);
    first = false;
    if (isSetDealIdList()) {
      if (!first) sb.append(", ");
      sb.append("dealIdList:");
      if (this.dealIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.dealIdList);
      }
      first = false;
    }
    if (isSetGoodsIdList()) {
      if (!first) sb.append(", ");
      sb.append("goodsIdList:");
      if (this.goodsIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.goodsIdList);
      }
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
    // alas, we cannot check 'poiId' because it's a primitive and you chose the non-beans generator.
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

  private static class DetailPoiInfoStandardSchemeFactory implements SchemeFactory {
    public DetailPoiInfoStandardScheme getScheme() {
      return new DetailPoiInfoStandardScheme();
    }
  }

  private static class DetailPoiInfoStandardScheme extends StandardScheme<DetailPoiInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DetailPoiInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POI_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.poiId = iprot.readI32();
              struct.setPoiIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEAL_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.dealIdList = new ArrayList<Integer>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  int _elem2; // required
                  _elem2 = iprot.readI32();
                  struct.dealIdList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setDealIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GOODS_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.goodsIdList = new ArrayList<Integer>(_list3.size);
                for (int _i4 = 0; _i4 < _list3.size; ++_i4)
                {
                  int _elem5; // required
                  _elem5 = iprot.readI32();
                  struct.goodsIdList.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.setGoodsIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTRA_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin();
                struct.extraMap = new HashMap<String,String>(2*_map6.size);
                for (int _i7 = 0; _i7 < _map6.size; ++_i7)
                {
                  String _key8; // required
                  String _val9; // required
                  _key8 = iprot.readString();
                  _val9 = iprot.readString();
                  struct.extraMap.put(_key8, _val9);
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
      if (!struct.isSetPoiId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'poiId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DetailPoiInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(POI_ID_FIELD_DESC);
      oprot.writeI32(struct.poiId);
      oprot.writeFieldEnd();
      if (struct.dealIdList != null) {
        if (struct.isSetDealIdList()) {
          oprot.writeFieldBegin(DEAL_ID_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.dealIdList.size()));
            for (int _iter10 : struct.dealIdList)
            {
              oprot.writeI32(_iter10);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.goodsIdList != null) {
        if (struct.isSetGoodsIdList()) {
          oprot.writeFieldBegin(GOODS_ID_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.goodsIdList.size()));
            for (int _iter11 : struct.goodsIdList)
            {
              oprot.writeI32(_iter11);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraMap != null) {
        if (struct.isSetExtraMap()) {
          oprot.writeFieldBegin(EXTRA_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraMap.size()));
            for (Map.Entry<String, String> _iter12 : struct.extraMap.entrySet())
            {
              oprot.writeString(_iter12.getKey());
              oprot.writeString(_iter12.getValue());
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

  private static class DetailPoiInfoTupleSchemeFactory implements SchemeFactory {
    public DetailPoiInfoTupleScheme getScheme() {
      return new DetailPoiInfoTupleScheme();
    }
  }

  private static class DetailPoiInfoTupleScheme extends TupleScheme<DetailPoiInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DetailPoiInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.poiId);
      BitSet optionals = new BitSet();
      if (struct.isSetDealIdList()) {
        optionals.set(0);
      }
      if (struct.isSetGoodsIdList()) {
        optionals.set(1);
      }
      if (struct.isSetExtraMap()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDealIdList()) {
        {
          oprot.writeI32(struct.dealIdList.size());
          for (int _iter13 : struct.dealIdList)
          {
            oprot.writeI32(_iter13);
          }
        }
      }
      if (struct.isSetGoodsIdList()) {
        {
          oprot.writeI32(struct.goodsIdList.size());
          for (int _iter14 : struct.goodsIdList)
          {
            oprot.writeI32(_iter14);
          }
        }
      }
      if (struct.isSetExtraMap()) {
        {
          oprot.writeI32(struct.extraMap.size());
          for (Map.Entry<String, String> _iter15 : struct.extraMap.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            oprot.writeString(_iter15.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DetailPoiInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.poiId = iprot.readI32();
      struct.setPoiIdIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list16 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.dealIdList = new ArrayList<Integer>(_list16.size);
          for (int _i17 = 0; _i17 < _list16.size; ++_i17)
          {
            int _elem18; // required
            _elem18 = iprot.readI32();
            struct.dealIdList.add(_elem18);
          }
        }
        struct.setDealIdListIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list19 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.goodsIdList = new ArrayList<Integer>(_list19.size);
          for (int _i20 = 0; _i20 < _list19.size; ++_i20)
          {
            int _elem21; // required
            _elem21 = iprot.readI32();
            struct.goodsIdList.add(_elem21);
          }
        }
        struct.setGoodsIdListIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map22 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraMap = new HashMap<String,String>(2*_map22.size);
          for (int _i23 = 0; _i23 < _map22.size; ++_i23)
          {
            String _key24; // required
            String _val25; // required
            _key24 = iprot.readString();
            _val25 = iprot.readString();
            struct.extraMap.put(_key24, _val25);
          }
        }
        struct.setExtraMapIsSet(true);
      }
    }
  }

}

