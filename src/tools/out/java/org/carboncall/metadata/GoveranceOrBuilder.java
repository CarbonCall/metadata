// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

public interface GoveranceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:carboncall.metadata.Goverance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *how the report is intended to be used
   * </pre>
   *
   * <code>string intended_use = 1;</code>
   * @return The intendedUse.
   */
  java.lang.String getIntendedUse();
  /**
   * <pre>
   *how the report is intended to be used
   * </pre>
   *
   * <code>string intended_use = 1;</code>
   * @return The bytes for intendedUse.
   */
  com.google.protobuf.ByteString
      getIntendedUseBytes();

  /**
   * <pre>
   *whether the report is restricted access
   * </pre>
   *
   * <code>bool restricted_access = 2;</code>
   * @return The restrictedAccess.
   */
  boolean getRestrictedAccess();

  /**
   * <pre>
   *Id of the report owner
   * </pre>
   *
   * <code>string report_owner = 3;</code>
   * @return The reportOwner.
   */
  java.lang.String getReportOwner();
  /**
   * <pre>
   *Id of the report owner
   * </pre>
   *
   * <code>string report_owner = 3;</code>
   * @return The bytes for reportOwner.
   */
  com.google.protobuf.ByteString
      getReportOwnerBytes();
}