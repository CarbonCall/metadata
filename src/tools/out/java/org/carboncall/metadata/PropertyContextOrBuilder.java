// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

public interface PropertyContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:carboncall.metadata.PropertyContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string property_name = 1;</code>
   * @return The propertyName.
   */
  java.lang.String getPropertyName();
  /**
   * <code>string property_name = 1;</code>
   * @return The bytes for propertyName.
   */
  com.google.protobuf.ByteString
      getPropertyNameBytes();

  /**
   * <code>repeated .carboncall.metadata.Metatag metatags = 2;</code>
   */
  java.util.List<org.carboncall.metadata.Metatag> 
      getMetatagsList();
  /**
   * <code>repeated .carboncall.metadata.Metatag metatags = 2;</code>
   */
  org.carboncall.metadata.Metatag getMetatags(int index);
  /**
   * <code>repeated .carboncall.metadata.Metatag metatags = 2;</code>
   */
  int getMetatagsCount();
  /**
   * <code>repeated .carboncall.metadata.Metatag metatags = 2;</code>
   */
  java.util.List<? extends org.carboncall.metadata.MetatagOrBuilder> 
      getMetatagsOrBuilderList();
  /**
   * <code>repeated .carboncall.metadata.Metatag metatags = 2;</code>
   */
  org.carboncall.metadata.MetatagOrBuilder getMetatagsOrBuilder(
      int index);

  /**
   * <pre>
   *links to related metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.Metalink related_metadata = 3;</code>
   */
  java.util.List<org.carboncall.metadata.Metalink> 
      getRelatedMetadataList();
  /**
   * <pre>
   *links to related metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.Metalink related_metadata = 3;</code>
   */
  org.carboncall.metadata.Metalink getRelatedMetadata(int index);
  /**
   * <pre>
   *links to related metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.Metalink related_metadata = 3;</code>
   */
  int getRelatedMetadataCount();
  /**
   * <pre>
   *links to related metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.Metalink related_metadata = 3;</code>
   */
  java.util.List<? extends org.carboncall.metadata.MetalinkOrBuilder> 
      getRelatedMetadataOrBuilderList();
  /**
   * <pre>
   *links to related metadata
   * </pre>
   *
   * <code>repeated .carboncall.metadata.Metalink related_metadata = 3;</code>
   */
  org.carboncall.metadata.MetalinkOrBuilder getRelatedMetadataOrBuilder(
      int index);
}
