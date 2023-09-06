// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

/**
 * Protobuf type {@code carboncall.metadata.ReportingPeriod}
 */
public final class ReportingPeriod extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:carboncall.metadata.ReportingPeriod)
    ReportingPeriodOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportingPeriod.newBuilder() to construct.
  private ReportingPeriod(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportingPeriod() {
    startDate_ = "";
    endDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportingPeriod();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportingPeriod(
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

            startDate_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            endDate_ = s;
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
    return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_ReportingPeriod_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_ReportingPeriod_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.carboncall.metadata.ReportingPeriod.class, org.carboncall.metadata.ReportingPeriod.Builder.class);
  }

  public static final int START_DATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object startDate_;
  /**
   * <pre>
   *ISO 8601 date format
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public java.lang.String getStartDate() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *ISO 8601 date format
   * </pre>
   *
   * <code>string start_date = 1;</code>
   * @return The bytes for startDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartDateBytes() {
    java.lang.Object ref = startDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_DATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object endDate_;
  /**
   * <pre>
   *ISO 8601 date format4
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The endDate.
   */
  @java.lang.Override
  public java.lang.String getEndDate() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *ISO 8601 date format4
   * </pre>
   *
   * <code>string end_date = 2;</code>
   * @return The bytes for endDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndDateBytes() {
    java.lang.Object ref = endDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endDate_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, startDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, endDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, startDate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, endDate_);
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
    if (!(obj instanceof org.carboncall.metadata.ReportingPeriod)) {
      return super.equals(obj);
    }
    org.carboncall.metadata.ReportingPeriod other = (org.carboncall.metadata.ReportingPeriod) obj;

    if (!getStartDate()
        .equals(other.getStartDate())) return false;
    if (!getEndDate()
        .equals(other.getEndDate())) return false;
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
    hash = (37 * hash) + START_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getStartDate().hashCode();
    hash = (37 * hash) + END_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getEndDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.carboncall.metadata.ReportingPeriod parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.carboncall.metadata.ReportingPeriod parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.ReportingPeriod parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.ReportingPeriod parseFrom(
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
  public static Builder newBuilder(org.carboncall.metadata.ReportingPeriod prototype) {
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
   * Protobuf type {@code carboncall.metadata.ReportingPeriod}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:carboncall.metadata.ReportingPeriod)
      org.carboncall.metadata.ReportingPeriodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_ReportingPeriod_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_ReportingPeriod_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.carboncall.metadata.ReportingPeriod.class, org.carboncall.metadata.ReportingPeriod.Builder.class);
    }

    // Construct using org.carboncall.metadata.ReportingPeriod.newBuilder()
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
      startDate_ = "";

      endDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_ReportingPeriod_descriptor;
    }

    @java.lang.Override
    public org.carboncall.metadata.ReportingPeriod getDefaultInstanceForType() {
      return org.carboncall.metadata.ReportingPeriod.getDefaultInstance();
    }

    @java.lang.Override
    public org.carboncall.metadata.ReportingPeriod build() {
      org.carboncall.metadata.ReportingPeriod result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.carboncall.metadata.ReportingPeriod buildPartial() {
      org.carboncall.metadata.ReportingPeriod result = new org.carboncall.metadata.ReportingPeriod(this);
      result.startDate_ = startDate_;
      result.endDate_ = endDate_;
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
      if (other instanceof org.carboncall.metadata.ReportingPeriod) {
        return mergeFrom((org.carboncall.metadata.ReportingPeriod)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.carboncall.metadata.ReportingPeriod other) {
      if (other == org.carboncall.metadata.ReportingPeriod.getDefaultInstance()) return this;
      if (!other.getStartDate().isEmpty()) {
        startDate_ = other.startDate_;
        onChanged();
      }
      if (!other.getEndDate().isEmpty()) {
        endDate_ = other.endDate_;
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
      org.carboncall.metadata.ReportingPeriod parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.carboncall.metadata.ReportingPeriod) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object startDate_ = "";
    /**
     * <pre>
     *ISO 8601 date format
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @return The startDate.
     */
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *ISO 8601 date format
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @return The bytes for startDate.
     */
    public com.google.protobuf.ByteString
        getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *ISO 8601 date format
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ISO 8601 date format
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      
      startDate_ = getDefaultInstance().getStartDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ISO 8601 date format
     * </pre>
     *
     * <code>string start_date = 1;</code>
     * @param value The bytes for startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endDate_ = "";
    /**
     * <pre>
     *ISO 8601 date format4
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @return The endDate.
     */
    public java.lang.String getEndDate() {
      java.lang.Object ref = endDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *ISO 8601 date format4
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @return The bytes for endDate.
     */
    public com.google.protobuf.ByteString
        getEndDateBytes() {
      java.lang.Object ref = endDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *ISO 8601 date format4
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @param value The endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ISO 8601 date format4
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndDate() {
      
      endDate_ = getDefaultInstance().getEndDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ISO 8601 date format4
     * </pre>
     *
     * <code>string end_date = 2;</code>
     * @param value The bytes for endDate to set.
     * @return This builder for chaining.
     */
    public Builder setEndDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endDate_ = value;
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


    // @@protoc_insertion_point(builder_scope:carboncall.metadata.ReportingPeriod)
  }

  // @@protoc_insertion_point(class_scope:carboncall.metadata.ReportingPeriod)
  private static final org.carboncall.metadata.ReportingPeriod DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.carboncall.metadata.ReportingPeriod();
  }

  public static org.carboncall.metadata.ReportingPeriod getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportingPeriod>
      PARSER = new com.google.protobuf.AbstractParser<ReportingPeriod>() {
    @java.lang.Override
    public ReportingPeriod parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportingPeriod(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportingPeriod> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportingPeriod> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.carboncall.metadata.ReportingPeriod getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
