// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

public interface ReportingPeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:carboncall.metadata.ReportingPeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *ISO 8601 date format
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   *ISO 8601 date format
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   *ISO 8601 date format4
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   *ISO 8601 date format4
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}
