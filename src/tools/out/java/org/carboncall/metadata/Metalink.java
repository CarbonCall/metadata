// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

/**
 * <pre>
 *TODO: add more here about linking metadata with other data in other contexts
 * </pre>
 *
 * Protobuf type {@code carboncall.metadata.Metalink}
 */
public final class Metalink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:carboncall.metadata.Metalink)
    MetalinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metalink.newBuilder() to construct.
  private Metalink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metalink() {
    relatedMetadataPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Metalink();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metalink(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            relatedMetadataPath_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Metalink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Metalink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.carboncall.metadata.Metalink.class, org.carboncall.metadata.Metalink.Builder.class);
  }

  public static final int RELATED_METADATA_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object relatedMetadataPath_;
  /**
   * <pre>
   *path in the metadata json tree to the related metadata
   * </pre>
   *
   * <code>string related_metadata_path = 1;</code>
   * @return The relatedMetadataPath.
   */
  @java.lang.Override
  public java.lang.String getRelatedMetadataPath() {
    java.lang.Object ref = relatedMetadataPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relatedMetadataPath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *path in the metadata json tree to the related metadata
   * </pre>
   *
   * <code>string related_metadata_path = 1;</code>
   * @return The bytes for relatedMetadataPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelatedMetadataPathBytes() {
    java.lang.Object ref = relatedMetadataPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relatedMetadataPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relatedMetadataPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, relatedMetadataPath_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relatedMetadataPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, relatedMetadataPath_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.carboncall.metadata.Metalink)) {
      return super.equals(obj);
    }
    org.carboncall.metadata.Metalink other = (org.carboncall.metadata.Metalink) obj;

    if (!getRelatedMetadataPath()
        .equals(other.getRelatedMetadataPath())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RELATED_METADATA_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getRelatedMetadataPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.carboncall.metadata.Metalink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.Metalink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.Metalink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.Metalink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.Metalink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.Metalink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.Metalink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.Metalink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.carboncall.metadata.Metalink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.Metalink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.carboncall.metadata.Metalink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.Metalink parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.carboncall.metadata.Metalink prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *TODO: add more here about linking metadata with other data in other contexts
   * </pre>
   *
   * Protobuf type {@code carboncall.metadata.Metalink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:carboncall.metadata.Metalink)
      org.carboncall.metadata.MetalinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Metalink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Metalink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.carboncall.metadata.Metalink.class, org.carboncall.metadata.Metalink.Builder.class);
    }

    // Construct using org.carboncall.metadata.Metalink.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      relatedMetadataPath_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Metalink_descriptor;
    }

    @java.lang.Override
    public org.carboncall.metadata.Metalink getDefaultInstanceForType() {
      return org.carboncall.metadata.Metalink.getDefaultInstance();
    }

    @java.lang.Override
    public org.carboncall.metadata.Metalink build() {
      org.carboncall.metadata.Metalink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.carboncall.metadata.Metalink buildPartial() {
      org.carboncall.metadata.Metalink result = new org.carboncall.metadata.Metalink(this);
      result.relatedMetadataPath_ = relatedMetadataPath_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.carboncall.metadata.Metalink) {
        return mergeFrom((org.carboncall.metadata.Metalink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.carboncall.metadata.Metalink other) {
      if (other == org.carboncall.metadata.Metalink.getDefaultInstance()) return this;
      if (!other.getRelatedMetadataPath().isEmpty()) {
        relatedMetadataPath_ = other.relatedMetadataPath_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.carboncall.metadata.Metalink parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.carboncall.metadata.Metalink) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object relatedMetadataPath_ = "";
    /**
     * <pre>
     *path in the metadata json tree to the related metadata
     * </pre>
     *
     * <code>string related_metadata_path = 1;</code>
     * @return The relatedMetadataPath.
     */
    public java.lang.String getRelatedMetadataPath() {
      java.lang.Object ref = relatedMetadataPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relatedMetadataPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *path in the metadata json tree to the related metadata
     * </pre>
     *
     * <code>string related_metadata_path = 1;</code>
     * @return The bytes for relatedMetadataPath.
     */
    public com.google.protobuf.ByteString
        getRelatedMetadataPathBytes() {
      java.lang.Object ref = relatedMetadataPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relatedMetadataPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *path in the metadata json tree to the related metadata
     * </pre>
     *
     * <code>string related_metadata_path = 1;</code>
     * @param value The relatedMetadataPath to set.
     * @return This builder for chaining.
     */
    public Builder setRelatedMetadataPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      relatedMetadataPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *path in the metadata json tree to the related metadata
     * </pre>
     *
     * <code>string related_metadata_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRelatedMetadataPath() {
      
      relatedMetadataPath_ = getDefaultInstance().getRelatedMetadataPath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *path in the metadata json tree to the related metadata
     * </pre>
     *
     * <code>string related_metadata_path = 1;</code>
     * @param value The bytes for relatedMetadataPath to set.
     * @return This builder for chaining.
     */
    public Builder setRelatedMetadataPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      relatedMetadataPath_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:carboncall.metadata.Metalink)
  }

  // @@protoc_insertion_point(class_scope:carboncall.metadata.Metalink)
  private static final org.carboncall.metadata.Metalink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.carboncall.metadata.Metalink();
  }

  public static org.carboncall.metadata.Metalink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metalink>
      PARSER = new com.google.protobuf.AbstractParser<Metalink>() {
    @java.lang.Override
    public Metalink parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metalink(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metalink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metalink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.carboncall.metadata.Metalink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

