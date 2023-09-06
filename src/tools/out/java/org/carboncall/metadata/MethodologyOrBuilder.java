// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package org.carboncall.metadata;

public interface MethodologyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:carboncall.metadata.Methodology)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.carboncall.metadata.Methodology.MethodologyType methodology_type = 1;</code>
   * @return The enum numeric value on the wire for methodologyType.
   */
  int getMethodologyTypeValue();
  /**
   * <code>.carboncall.metadata.Methodology.MethodologyType methodology_type = 1;</code>
   * @return The methodologyType.
   */
  org.carboncall.metadata.Methodology.MethodologyType getMethodologyType();

  /**
   * <pre>
   *% of total portfolio scope 1, scope 2, and scope 3 emissions reported
   * </pre>
   *
   * <code>string percentage_of_total_portfolio_reported = 2;</code>
   * @return The percentageOfTotalPortfolioReported.
   */
  java.lang.String getPercentageOfTotalPortfolioReported();
  /**
   * <pre>
   *% of total portfolio scope 1, scope 2, and scope 3 emissions reported
   * </pre>
   *
   * <code>string percentage_of_total_portfolio_reported = 2;</code>
   * @return The bytes for percentageOfTotalPortfolioReported.
   */
  com.google.protobuf.ByteString
      getPercentageOfTotalPortfolioReportedBytes();

  /**
   * <pre>
   *% of reported scope1, scope2, &amp; scope3 emissions calculated based on actual data vs. estimated data
   * </pre>
   *
   * <code>string percentage_of_estimated_calculations = 3;</code>
   * @return The percentageOfEstimatedCalculations.
   */
  java.lang.String getPercentageOfEstimatedCalculations();
  /**
   * <pre>
   *% of reported scope1, scope2, &amp; scope3 emissions calculated based on actual data vs. estimated data
   * </pre>
   *
   * <code>string percentage_of_estimated_calculations = 3;</code>
   * @return The bytes for percentageOfEstimatedCalculations.
   */
  com.google.protobuf.ByteString
      getPercentageOfEstimatedCalculationsBytes();

  /**
   * <code>.carboncall.metadata.Methodology.BoundaryApproach boundary_approach = 4;</code>
   * @return The enum numeric value on the wire for boundaryApproach.
   */
  int getBoundaryApproachValue();
  /**
   * <code>.carboncall.metadata.Methodology.BoundaryApproach boundary_approach = 4;</code>
   * @return The boundaryApproach.
   */
  org.carboncall.metadata.Methodology.BoundaryApproach getBoundaryApproach();
}
