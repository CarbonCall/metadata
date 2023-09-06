// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

/**
 * Protobuf type {@code carboncall.metadata.Goverance}
 */
public final class Goverance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:carboncall.metadata.Goverance)
    GoveranceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Goverance.newBuilder() to construct.
  private Goverance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Goverance() {
    intendedUse_ = "";
    reportOwner_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Goverance();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Goverance(
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

            intendedUse_ = s;
            break;
          }
          case 16: {

            restrictedAccess_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            reportOwner_ = s;
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
    return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Goverance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Goverance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.carboncall.metadata.Goverance.class, org.carboncall.metadata.Goverance.Builder.class);
  }

  public static final int INTENDED_USE_FIELD_NUMBER = 1;
  private volatile java.lang.Object intendedUse_;
  /**
   * <pre>
   *how the report is intended to be used
   * </pre>
   *
   * <code>string intended_use = 1;</code>
   * @return The intendedUse.
   */
  @java.lang.Override
  public java.lang.String getIntendedUse() {
    java.lang.Object ref = intendedUse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      intendedUse_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *how the report is intended to be used
   * </pre>
   *
   * <code>string intended_use = 1;</code>
   * @return The bytes for intendedUse.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntendedUseBytes() {
    java.lang.Object ref = intendedUse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      intendedUse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESTRICTED_ACCESS_FIELD_NUMBER = 2;
  private boolean restrictedAccess_;
  /**
   * <pre>
   *whether the report is restricted access
   * </pre>
   *
   * <code>bool restricted_access = 2;</code>
   * @return The restrictedAccess.
   */
  @java.lang.Override
  public boolean getRestrictedAccess() {
    return restrictedAccess_;
  }

  public static final int REPORT_OWNER_FIELD_NUMBER = 3;
  private volatile java.lang.Object reportOwner_;
  /**
   * <pre>
   *Id of the report owner
   * </pre>
   *
   * <code>string report_owner = 3;</code>
   * @return The reportOwner.
   */
  @java.lang.Override
  public java.lang.String getReportOwner() {
    java.lang.Object ref = reportOwner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reportOwner_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *Id of the report owner
   * </pre>
   *
   * <code>string report_owner = 3;</code>
   * @return The bytes for reportOwner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReportOwnerBytes() {
    java.lang.Object ref = reportOwner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reportOwner_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(intendedUse_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, intendedUse_);
    }
    if (restrictedAccess_ != false) {
      output.writeBool(2, restrictedAccess_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportOwner_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, reportOwner_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(intendedUse_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, intendedUse_);
    }
    if (restrictedAccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, restrictedAccess_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reportOwner_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, reportOwner_);
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
    if (!(obj instanceof org.carboncall.metadata.Goverance)) {
      return super.equals(obj);
    }
    org.carboncall.metadata.Goverance other = (org.carboncall.metadata.Goverance) obj;

    if (!getIntendedUse()
        .equals(other.getIntendedUse())) return false;
    if (getRestrictedAccess()
        != other.getRestrictedAccess()) return false;
    if (!getReportOwner()
        .equals(other.getReportOwner())) return false;
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
    hash = (37 * hash) + INTENDED_USE_FIELD_NUMBER;
    hash = (53 * hash) + getIntendedUse().hashCode();
    hash = (37 * hash) + RESTRICTED_ACCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRestrictedAccess());
    hash = (37 * hash) + REPORT_OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getReportOwner().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.carboncall.metadata.Goverance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.Goverance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.Goverance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.Goverance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.Goverance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.carboncall.metadata.Goverance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.carboncall.metadata.Goverance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.Goverance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.carboncall.metadata.Goverance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.Goverance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.carboncall.metadata.Goverance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.carboncall.metadata.Goverance parseFrom(
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
  public static Builder newBuilder(org.carboncall.metadata.Goverance prototype) {
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
   * Protobuf type {@code carboncall.metadata.Goverance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:carboncall.metadata.Goverance)
      org.carboncall.metadata.GoveranceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Goverance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Goverance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.carboncall.metadata.Goverance.class, org.carboncall.metadata.Goverance.Builder.class);
    }

    // Construct using org.carboncall.metadata.Goverance.newBuilder()
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
      intendedUse_ = "";

      restrictedAccess_ = false;

      reportOwner_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.carboncall.metadata.MetadataOuterClass.internal_static_carboncall_metadata_Goverance_descriptor;
    }

    @java.lang.Override
    public org.carboncall.metadata.Goverance getDefaultInstanceForType() {
      return org.carboncall.metadata.Goverance.getDefaultInstance();
    }

    @java.lang.Override
    public org.carboncall.metadata.Goverance build() {
      org.carboncall.metadata.Goverance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.carboncall.metadata.Goverance buildPartial() {
      org.carboncall.metadata.Goverance result = new org.carboncall.metadata.Goverance(this);
      result.intendedUse_ = intendedUse_;
      result.restrictedAccess_ = restrictedAccess_;
      result.reportOwner_ = reportOwner_;
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
      if (other instanceof org.carboncall.metadata.Goverance) {
        return mergeFrom((org.carboncall.metadata.Goverance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.carboncall.metadata.Goverance other) {
      if (other == org.carboncall.metadata.Goverance.getDefaultInstance()) return this;
      if (!other.getIntendedUse().isEmpty()) {
        intendedUse_ = other.intendedUse_;
        onChanged();
      }
      if (other.getRestrictedAccess() != false) {
        setRestrictedAccess(other.getRestrictedAccess());
      }
      if (!other.getReportOwner().isEmpty()) {
        reportOwner_ = other.reportOwner_;
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
      org.carboncall.metadata.Goverance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.carboncall.metadata.Goverance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object intendedUse_ = "";
    /**
     * <pre>
     *how the report is intended to be used
     * </pre>
     *
     * <code>string intended_use = 1;</code>
     * @return The intendedUse.
     */
    public java.lang.String getIntendedUse() {
      java.lang.Object ref = intendedUse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        intendedUse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *how the report is intended to be used
     * </pre>
     *
     * <code>string intended_use = 1;</code>
     * @return The bytes for intendedUse.
     */
    public com.google.protobuf.ByteString
        getIntendedUseBytes() {
      java.lang.Object ref = intendedUse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        intendedUse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *how the report is intended to be used
     * </pre>
     *
     * <code>string intended_use = 1;</code>
     * @param value The intendedUse to set.
     * @return This builder for chaining.
     */
    public Builder setIntendedUse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      intendedUse_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *how the report is intended to be used
     * </pre>
     *
     * <code>string intended_use = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntendedUse() {
      
      intendedUse_ = getDefaultInstance().getIntendedUse();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *how the report is intended to be used
     * </pre>
     *
     * <code>string intended_use = 1;</code>
     * @param value The bytes for intendedUse to set.
     * @return This builder for chaining.
     */
    public Builder setIntendedUseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      intendedUse_ = value;
      onChanged();
      return this;
    }

    private boolean restrictedAccess_ ;
    /**
     * <pre>
     *whether the report is restricted access
     * </pre>
     *
     * <code>bool restricted_access = 2;</code>
     * @return The restrictedAccess.
     */
    @java.lang.Override
    public boolean getRestrictedAccess() {
      return restrictedAccess_;
    }
    /**
     * <pre>
     *whether the report is restricted access
     * </pre>
     *
     * <code>bool restricted_access = 2;</code>
     * @param value The restrictedAccess to set.
     * @return This builder for chaining.
     */
    public Builder setRestrictedAccess(boolean value) {
      
      restrictedAccess_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *whether the report is restricted access
     * </pre>
     *
     * <code>bool restricted_access = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRestrictedAccess() {
      
      restrictedAccess_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object reportOwner_ = "";
    /**
     * <pre>
     *Id of the report owner
     * </pre>
     *
     * <code>string report_owner = 3;</code>
     * @return The reportOwner.
     */
    public java.lang.String getReportOwner() {
      java.lang.Object ref = reportOwner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reportOwner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *Id of the report owner
     * </pre>
     *
     * <code>string report_owner = 3;</code>
     * @return The bytes for reportOwner.
     */
    public com.google.protobuf.ByteString
        getReportOwnerBytes() {
      java.lang.Object ref = reportOwner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reportOwner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *Id of the report owner
     * </pre>
     *
     * <code>string report_owner = 3;</code>
     * @param value The reportOwner to set.
     * @return This builder for chaining.
     */
    public Builder setReportOwner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reportOwner_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Id of the report owner
     * </pre>
     *
     * <code>string report_owner = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReportOwner() {
      
      reportOwner_ = getDefaultInstance().getReportOwner();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Id of the report owner
     * </pre>
     *
     * <code>string report_owner = 3;</code>
     * @param value The bytes for reportOwner to set.
     * @return This builder for chaining.
     */
    public Builder setReportOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reportOwner_ = value;
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


    // @@protoc_insertion_point(builder_scope:carboncall.metadata.Goverance)
  }

  // @@protoc_insertion_point(class_scope:carboncall.metadata.Goverance)
  private static final org.carboncall.metadata.Goverance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.carboncall.metadata.Goverance();
  }

  public static org.carboncall.metadata.Goverance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Goverance>
      PARSER = new com.google.protobuf.AbstractParser<Goverance>() {
    @java.lang.Override
    public Goverance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Goverance(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Goverance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Goverance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.carboncall.metadata.Goverance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

