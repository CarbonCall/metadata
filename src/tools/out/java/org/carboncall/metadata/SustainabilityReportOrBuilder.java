// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

public interface SustainabilityReportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:carboncall.metadata.SustainabilityReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string g_r_i_d = 1;</code>
   * @return The gRID.
   */
  java.lang.String getGRID();
  /**
   * <code>string g_r_i_d = 1;</code>
   * @return The bytes for gRID.
   */
  com.google.protobuf.ByteString
      getGRIDBytes();

  /**
   * <code>.carboncall.metadata.Metadata metadata = 2;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.carboncall.metadata.Metadata metadata = 2;</code>
   * @return The metadata.
   */
  org.carboncall.metadata.Metadata getMetadata();
  /**
   * <code>.carboncall.metadata.Metadata metadata = 2;</code>
   */
  org.carboncall.metadata.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   *could be google.protobuf.Any or bytes
   * </pre>
   *
   * <code>string report = 3;</code>
   * @return The report.
   */
  java.lang.String getReport();
  /**
   * <pre>
   *could be google.protobuf.Any or bytes
   * </pre>
   *
   * <code>string report = 3;</code>
   * @return The bytes for report.
   */
  com.google.protobuf.ByteString
      getReportBytes();
}
