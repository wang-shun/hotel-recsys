/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.meituan.hotel.rec.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum RecServiceStatus implements org.apache.thrift.TEnum {
  OK(200),
  FORBIDDEN(403),
  UNCONNECT(404),
  ERROR(500),
  DEGRADE(501);

  private final int value;

  private RecServiceStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static RecServiceStatus findByValue(int value) { 
    switch (value) {
      case 200:
        return OK;
      case 403:
        return FORBIDDEN;
      case 404:
        return UNCONNECT;
      case 500:
        return ERROR;
      case 501:
        return DEGRADE;
      default:
        return null;
    }
  }
}
