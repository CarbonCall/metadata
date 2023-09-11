// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

public interface ProductFootprintExtensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:carboncall.metadata.ProductFootprintExtension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Id of the product footprint
   * </pre>
   *
   * <code>string pfId = 1;</code>
   * @return The pfId.
   */
  java.lang.String getPfId();
  /**
   * <pre>
   *Id of the product footprint
   * </pre>
   *
   * <code>string pfId = 1;</code>
   * @return The bytes for pfId.
   */
  com.google.protobuf.ByteString
      getPfIdBytes();

  /**
   * <pre>
   *Property contexts that provide additional context for the product footprint, i.e., section metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.PropertyContext p_c_f_property_data = 2;</code>
   */
  java.util.List<org.carboncall.metadata.PropertyContext> 
      getPCFPropertyDataList();
  /**
   * <pre>
   *Property contexts that provide additional context for the product footprint, i.e., section metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.PropertyContext p_c_f_property_data = 2;</code>
   */
  org.carboncall.metadata.PropertyContext getPCFPropertyData(int index);
  /**
   * <pre>
   *Property contexts that provide additional context for the product footprint, i.e., section metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.PropertyContext p_c_f_property_data = 2;</code>
   */
  int getPCFPropertyDataCount();
  /**
   * <pre>
   *Property contexts that provide additional context for the product footprint, i.e., section metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.PropertyContext p_c_f_property_data = 2;</code>
   */
  java.util.List<? extends org.carboncall.metadata.PropertyContextOrBuilder> 
      getPCFPropertyDataOrBuilderList();
  /**
   * <pre>
   *Property contexts that provide additional context for the product footprint, i.e., section metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.PropertyContext p_c_f_property_data = 2;</code>
   */
  org.carboncall.metadata.PropertyContextOrBuilder getPCFPropertyDataOrBuilder(
      int index);
}
