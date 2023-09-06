// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

public interface FactorAndSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:carboncall.metadata.FactorAndSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.carboncall.metadata.FactorAndSource.FactorType factor_type = 1;</code>
   * @return The enum numeric value on the wire for factorType.
   */
  int getFactorTypeValue();
  /**
   * <code>.carboncall.metadata.FactorAndSource.FactorType factor_type = 1;</code>
   * @return The factorType.
   */
  org.carboncall.metadata.FactorAndSource.FactorType getFactorType();

  /**
   * <code>.carboncall.metadata.Unit factor_unit = 2;</code>
   * @return The enum numeric value on the wire for factorUnit.
   */
  int getFactorUnitValue();
  /**
   * <code>.carboncall.metadata.Unit factor_unit = 2;</code>
   * @return The factorUnit.
   */
  org.carboncall.metadata.Unit getFactorUnit();

  /**
   * <code>string factor_source = 3;</code>
   * @return The factorSource.
   */
  java.lang.String getFactorSource();
  /**
   * <code>string factor_source = 3;</code>
   * @return The bytes for factorSource.
   */
  com.google.protobuf.ByteString
      getFactorSourceBytes();

  /**
   * <code>.carboncall.metadata.FactorAndSource.PrecisionMix factor_precision = 4;</code>
   * @return Whether the factorPrecision field is set.
   */
  boolean hasFactorPrecision();
  /**
   * <code>.carboncall.metadata.FactorAndSource.PrecisionMix factor_precision = 4;</code>
   * @return The factorPrecision.
   */
  org.carboncall.metadata.FactorAndSource.PrecisionMix getFactorPrecision();
  /**
   * <code>.carboncall.metadata.FactorAndSource.PrecisionMix factor_precision = 4;</code>
   */
  org.carboncall.metadata.FactorAndSource.PrecisionMixOrBuilder getFactorPrecisionOrBuilder();
}