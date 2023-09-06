// package: carboncall.metadata
// file: metadata.proto

import * as jspb from "google-protobuf";

export class SustainabilityReport extends jspb.Message {
  getGRID(): string;
  setGRID(value: string): void;

  hasMetadata(): boolean;
  clearMetadata(): void;
  getMetadata(): Metadata | undefined;
  setMetadata(value?: Metadata): void;

  getReport(): string;
  setReport(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SustainabilityReport.AsObject;
  static toObject(includeInstance: boolean, msg: SustainabilityReport): SustainabilityReport.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: SustainabilityReport, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SustainabilityReport;
  static deserializeBinaryFromReader(message: SustainabilityReport, reader: jspb.BinaryReader): SustainabilityReport;
}

export namespace SustainabilityReport {
  export type AsObject = {
    gRID: string,
    metadata?: Metadata.AsObject,
    report: string,
  }
}

export class Metadata extends jspb.Message {
  getGRID(): string;
  setGRID(value: string): void;

  getOrganizationIdentifier(): string;
  setOrganizationIdentifier(value: string): void;

  getOrganizationName(): string;
  setOrganizationName(value: string): void;

  getDomicile(): ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap];
  setDomicile(value: ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap]): void;

  clearOperatingCountriesList(): void;
  getOperatingCountriesList(): Array<ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap]>;
  setOperatingCountriesList(value: Array<ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap]>): void;
  addOperatingCountries(value: ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap], index?: number): ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap];

  clearLanguagesList(): void;
  getLanguagesList(): Array<LanguageMap[keyof LanguageMap]>;
  setLanguagesList(value: Array<LanguageMap[keyof LanguageMap]>): void;
  addLanguages(value: LanguageMap[keyof LanguageMap], index?: number): LanguageMap[keyof LanguageMap];

  getReportType(): ReportTypeMap[keyof ReportTypeMap];
  setReportType(value: ReportTypeMap[keyof ReportTypeMap]): void;

  getReportIssueDate(): string;
  setReportIssueDate(value: string): void;

  hasReportingPeriod(): boolean;
  clearReportingPeriod(): void;
  getReportingPeriod(): TimePeriod | undefined;
  setReportingPeriod(value?: TimePeriod): void;

  getReportReplaces(): string;
  setReportReplaces(value: string): void;

  getLocation(): string;
  setLocation(value: string): void;

  hasIndustry(): boolean;
  clearIndustry(): void;
  getIndustry(): Industry | undefined;
  setIndustry(value?: Industry): void;

  getPerformance(): string;
  setPerformance(value: string): void;

  hasGoverance(): boolean;
  clearGoverance(): void;
  getGoverance(): Goverance | undefined;
  setGoverance(value?: Goverance): void;

  hasMethodology(): boolean;
  clearMethodology(): void;
  getMethodology(): Methodology | undefined;
  setMethodology(value?: Methodology): void;

  getReportFormat(): ReportFormatMap[keyof ReportFormatMap];
  setReportFormat(value: ReportFormatMap[keyof ReportFormatMap]): void;

  getReportingStandard(): ReportingStandardMap[keyof ReportingStandardMap];
  setReportingStandard(value: ReportingStandardMap[keyof ReportingStandardMap]): void;

  getAssurance(): string;
  setAssurance(value: string): void;

  getPriorReport(): string;
  setPriorReport(value: string): void;

  getReportHash(): string;
  setReportHash(value: string): void;

  clearActivitiesList(): void;
  getActivitiesList(): Array<Activity>;
  setActivitiesList(value: Array<Activity>): void;
  addActivities(value?: Activity, index?: number): Activity;

  clearReportContextList(): void;
  getReportContextList(): Array<Metatag>;
  setReportContextList(value: Array<Metatag>): void;
  addReportContext(value?: Metatag, index?: number): Metatag;

  clearPropertyContextsList(): void;
  getPropertyContextsList(): Array<PropertyContext>;
  setPropertyContextsList(value: Array<PropertyContext>): void;
  addPropertyContexts(value?: PropertyContext, index?: number): PropertyContext;

  clearMetatdataExtensionsList(): void;
  getMetatdataExtensionsList(): Array<MetadataExtension>;
  setMetatdataExtensionsList(value: Array<MetadataExtension>): void;
  addMetatdataExtensions(value?: MetadataExtension, index?: number): MetadataExtension;

  clearRelatedReportsList(): void;
  getRelatedReportsList(): Array<string>;
  setRelatedReportsList(value: Array<string>): void;
  addRelatedReports(value: string, index?: number): string;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Metadata.AsObject;
  static toObject(includeInstance: boolean, msg: Metadata): Metadata.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Metadata, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Metadata;
  static deserializeBinaryFromReader(message: Metadata, reader: jspb.BinaryReader): Metadata;
}

export namespace Metadata {
  export type AsObject = {
    gRID: string,
    organizationIdentifier: string,
    organizationName: string,
    domicile: ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap],
    operatingCountriesList: Array<ISO3166_CountryCodeMap[keyof ISO3166_CountryCodeMap]>,
    languagesList: Array<LanguageMap[keyof LanguageMap]>,
    reportType: ReportTypeMap[keyof ReportTypeMap],
    reportIssueDate: string,
    reportingPeriod?: TimePeriod.AsObject,
    reportReplaces: string,
    location: string,
    industry?: Industry.AsObject,
    performance: string,
    goverance?: Goverance.AsObject,
    methodology?: Methodology.AsObject,
    reportFormat: ReportFormatMap[keyof ReportFormatMap],
    reportingStandard: ReportingStandardMap[keyof ReportingStandardMap],
    assurance: string,
    priorReport: string,
    reportHash: string,
    activitiesList: Array<Activity.AsObject>,
    reportContextList: Array<Metatag.AsObject>,
    propertyContextsList: Array<PropertyContext.AsObject>,
    metatdataExtensionsList: Array<MetadataExtension.AsObject>,
    relatedReportsList: Array<string>,
  }
}

export class Activity extends jspb.Message {
  getActivityType(): string;
  setActivityType(value: string): void;

  getUnitOfMeasure(): UnitMap[keyof UnitMap];
  setUnitOfMeasure(value: UnitMap[keyof UnitMap]): void;

  getActivityAmount(): string;
  setActivityAmount(value: string): void;

  hasActivityPeriod(): boolean;
  clearActivityPeriod(): void;
  getActivityPeriod(): TimePeriod | undefined;
  setActivityPeriod(value?: TimePeriod): void;

  getActivityDescription(): string;
  setActivityDescription(value: string): void;

  hasActivityLocation(): boolean;
  clearActivityLocation(): void;
  getActivityLocation(): GeographicLocation | undefined;
  setActivityLocation(value?: GeographicLocation): void;

  hasActivityFactorAndSource(): boolean;
  clearActivityFactorAndSource(): void;
  getActivityFactorAndSource(): FactorAndSource | undefined;
  setActivityFactorAndSource(value?: FactorAndSource): void;

  clearRelatedMetadataList(): void;
  getRelatedMetadataList(): Array<Metalink>;
  setRelatedMetadataList(value: Array<Metalink>): void;
  addRelatedMetadata(value?: Metalink, index?: number): Metalink;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Activity.AsObject;
  static toObject(includeInstance: boolean, msg: Activity): Activity.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Activity, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Activity;
  static deserializeBinaryFromReader(message: Activity, reader: jspb.BinaryReader): Activity;
}

export namespace Activity {
  export type AsObject = {
    activityType: string,
    unitOfMeasure: UnitMap[keyof UnitMap],
    activityAmount: string,
    activityPeriod?: TimePeriod.AsObject,
    activityDescription: string,
    activityLocation?: GeographicLocation.AsObject,
    activityFactorAndSource?: FactorAndSource.AsObject,
    relatedMetadataList: Array<Metalink.AsObject>,
  }
}

export class FactorAndSource extends jspb.Message {
  getFactorType(): FactorAndSource.FactorTypeMap[keyof FactorAndSource.FactorTypeMap];
  setFactorType(value: FactorAndSource.FactorTypeMap[keyof FactorAndSource.FactorTypeMap]): void;

  getFactorUnit(): UnitMap[keyof UnitMap];
  setFactorUnit(value: UnitMap[keyof UnitMap]): void;

  getFactorSource(): string;
  setFactorSource(value: string): void;

  hasFactorPrecision(): boolean;
  clearFactorPrecision(): void;
  getFactorPrecision(): FactorAndSource.PrecisionMix | undefined;
  setFactorPrecision(value?: FactorAndSource.PrecisionMix): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): FactorAndSource.AsObject;
  static toObject(includeInstance: boolean, msg: FactorAndSource): FactorAndSource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: FactorAndSource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): FactorAndSource;
  static deserializeBinaryFromReader(message: FactorAndSource, reader: jspb.BinaryReader): FactorAndSource;
}

export namespace FactorAndSource {
  export type AsObject = {
    factorType: FactorAndSource.FactorTypeMap[keyof FactorAndSource.FactorTypeMap],
    factorUnit: UnitMap[keyof UnitMap],
    factorSource: string,
    factorPrecision?: FactorAndSource.PrecisionMix.AsObject,
  }

  export class PrecisionMix extends jspb.Message {
    getLow(): number;
    setLow(value: number): void;

    getMedium(): number;
    setMedium(value: number): void;

    getHigh(): number;
    setHigh(value: number): void;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): PrecisionMix.AsObject;
    static toObject(includeInstance: boolean, msg: PrecisionMix): PrecisionMix.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: PrecisionMix, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): PrecisionMix;
    static deserializeBinaryFromReader(message: PrecisionMix, reader: jspb.BinaryReader): PrecisionMix;
  }

  export namespace PrecisionMix {
    export type AsObject = {
      low: number,
      medium: number,
      high: number,
    }
  }

  export interface FactorTypeMap {
    UNKNOWN: 0;
    ESTIMATED: 1;
    FACTORED: 2;
    MEASURED: 3;
  }

  export const FactorType: FactorTypeMap;
}

export class Methodology extends jspb.Message {
  getMethodologyType(): Methodology.MethodologyTypeMap[keyof Methodology.MethodologyTypeMap];
  setMethodologyType(value: Methodology.MethodologyTypeMap[keyof Methodology.MethodologyTypeMap]): void;

  getPercentageOfTotalPortfolioReported(): string;
  setPercentageOfTotalPortfolioReported(value: string): void;

  getPercentageOfEstimatedCalculations(): string;
  setPercentageOfEstimatedCalculations(value: string): void;

  getBoundaryApproach(): Methodology.BoundaryApproachMap[keyof Methodology.BoundaryApproachMap];
  setBoundaryApproach(value: Methodology.BoundaryApproachMap[keyof Methodology.BoundaryApproachMap]): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Methodology.AsObject;
  static toObject(includeInstance: boolean, msg: Methodology): Methodology.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Methodology, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Methodology;
  static deserializeBinaryFromReader(message: Methodology, reader: jspb.BinaryReader): Methodology;
}

export namespace Methodology {
  export type AsObject = {
    methodologyType: Methodology.MethodologyTypeMap[keyof Methodology.MethodologyTypeMap],
    percentageOfTotalPortfolioReported: string,
    percentageOfEstimatedCalculations: string,
    boundaryApproach: Methodology.BoundaryApproachMap[keyof Methodology.BoundaryApproachMap],
  }

  export interface MethodologyTypeMap {
    UNKNOWN: 0;
    GHG_PROTOCOL: 1;
    ISO_14067: 2;
    OTHER: 100;
  }

  export const MethodologyType: MethodologyTypeMap;

  export interface BoundaryApproachMap {
    OPERATIONAL_CONTROL: 0;
    FINANCIAL_CONTROL: 1;
    EQUITY_SHARE: 2;
  }

  export const BoundaryApproach: BoundaryApproachMap;
}

export class Goverance extends jspb.Message {
  getIntendedUse(): string;
  setIntendedUse(value: string): void;

  getRestrictedAccess(): boolean;
  setRestrictedAccess(value: boolean): void;

  getReportOwner(): string;
  setReportOwner(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Goverance.AsObject;
  static toObject(includeInstance: boolean, msg: Goverance): Goverance.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Goverance, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Goverance;
  static deserializeBinaryFromReader(message: Goverance, reader: jspb.BinaryReader): Goverance;
}

export namespace Goverance {
  export type AsObject = {
    intendedUse: string,
    restrictedAccess: boolean,
    reportOwner: string,
  }
}

export class TimePeriod extends jspb.Message {
  getStartDate(): string;
  setStartDate(value: string): void;

  getEndDate(): string;
  setEndDate(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TimePeriod.AsObject;
  static toObject(includeInstance: boolean, msg: TimePeriod): TimePeriod.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: TimePeriod, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TimePeriod;
  static deserializeBinaryFromReader(message: TimePeriod, reader: jspb.BinaryReader): TimePeriod;
}

export namespace TimePeriod {
  export type AsObject = {
    startDate: string,
    endDate: string,
  }
}

export class GeographicLocation extends jspb.Message {
  getLongitude(): string;
  setLongitude(value: string): void;

  getLatitude(): string;
  setLatitude(value: string): void;

  getGeoJsonOrKml(): string;
  setGeoJsonOrKml(value: string): void;

  getGeographicLocationFile(): string;
  setGeographicLocationFile(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): GeographicLocation.AsObject;
  static toObject(includeInstance: boolean, msg: GeographicLocation): GeographicLocation.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: GeographicLocation, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): GeographicLocation;
  static deserializeBinaryFromReader(message: GeographicLocation, reader: jspb.BinaryReader): GeographicLocation;
}

export namespace GeographicLocation {
  export type AsObject = {
    longitude: string,
    latitude: string,
    geoJsonOrKml: string,
    geographicLocationFile: string,
  }
}

export class Metatag extends jspb.Message {
  getKey(): string;
  setKey(value: string): void;

  getValue(): string;
  setValue(value: string): void;

  clearRelatedMetadataList(): void;
  getRelatedMetadataList(): Array<Metalink>;
  setRelatedMetadataList(value: Array<Metalink>): void;
  addRelatedMetadata(value?: Metalink, index?: number): Metalink;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Metatag.AsObject;
  static toObject(includeInstance: boolean, msg: Metatag): Metatag.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Metatag, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Metatag;
  static deserializeBinaryFromReader(message: Metatag, reader: jspb.BinaryReader): Metatag;
}

export namespace Metatag {
  export type AsObject = {
    key: string,
    value: string,
    relatedMetadataList: Array<Metalink.AsObject>,
  }
}

export class PropertyContext extends jspb.Message {
  getPropertyName(): string;
  setPropertyName(value: string): void;

  clearMetatagsList(): void;
  getMetatagsList(): Array<Metatag>;
  setMetatagsList(value: Array<Metatag>): void;
  addMetatags(value?: Metatag, index?: number): Metatag;

  clearRelatedMetadataList(): void;
  getRelatedMetadataList(): Array<Metalink>;
  setRelatedMetadataList(value: Array<Metalink>): void;
  addRelatedMetadata(value?: Metalink, index?: number): Metalink;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PropertyContext.AsObject;
  static toObject(includeInstance: boolean, msg: PropertyContext): PropertyContext.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PropertyContext, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PropertyContext;
  static deserializeBinaryFromReader(message: PropertyContext, reader: jspb.BinaryReader): PropertyContext;
}

export namespace PropertyContext {
  export type AsObject = {
    propertyName: string,
    metatagsList: Array<Metatag.AsObject>,
    relatedMetadataList: Array<Metalink.AsObject>,
  }
}

export class Metalink extends jspb.Message {
  getRelatedMetadataPath(): string;
  setRelatedMetadataPath(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Metalink.AsObject;
  static toObject(includeInstance: boolean, msg: Metalink): Metalink.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Metalink, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Metalink;
  static deserializeBinaryFromReader(message: Metalink, reader: jspb.BinaryReader): Metalink;
}

export namespace Metalink {
  export type AsObject = {
    relatedMetadataPath: string,
  }
}

export class MetadataExtension extends jspb.Message {
  getDataschema(): string;
  setDataschema(value: string): void;

  getDocumentation(): string;
  setDocumentation(value: string): void;

  getData(): string;
  setData(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): MetadataExtension.AsObject;
  static toObject(includeInstance: boolean, msg: MetadataExtension): MetadataExtension.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: MetadataExtension, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): MetadataExtension;
  static deserializeBinaryFromReader(message: MetadataExtension, reader: jspb.BinaryReader): MetadataExtension;
}

export namespace MetadataExtension {
  export type AsObject = {
    dataschema: string,
    documentation: string,
    data: string,
  }
}

export class Industry extends jspb.Message {
  getPrefix(): IndustryCodePrefixMap[keyof IndustryCodePrefixMap];
  setPrefix(value: IndustryCodePrefixMap[keyof IndustryCodePrefixMap]): void;

  getCode(): string;
  setCode(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Industry.AsObject;
  static toObject(includeInstance: boolean, msg: Industry): Industry.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Industry, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Industry;
  static deserializeBinaryFromReader(message: Industry, reader: jspb.BinaryReader): Industry;
}

export namespace Industry {
  export type AsObject = {
    prefix: IndustryCodePrefixMap[keyof IndustryCodePrefixMap],
    code: string,
  }
}

export interface ISO3166_CountryCodeMap {
  UNKNOWN: 0;
  A_F: 1;
  A_X: 2;
  A_L: 3;
  D_Z: 4;
  A_S: 5;
  A_D: 6;
  A_O: 7;
  A_I: 8;
  A_Q: 9;
  A_G: 10;
  A_R: 11;
  A_M: 12;
  A_W: 13;
  A_U: 14;
  A_T: 15;
  A_Z: 16;
  B_S: 17;
  B_H: 18;
  B_D: 19;
  B_B: 20;
  B_Y: 21;
  B_E: 22;
  B_Z: 23;
  B_J: 24;
  B_M: 25;
  B_T: 26;
  B_O: 27;
  B_Q: 28;
  B_A: 29;
  B_W: 30;
  B_V: 31;
  B_R: 32;
  I_O: 33;
  B_N: 34;
  B_G: 35;
  B_F: 36;
  B_I: 37;
  C_V: 38;
  K_H: 39;
  C_M: 40;
  C_A: 41;
  K_Y: 42;
  C_F: 43;
  T_D: 44;
  C_L: 45;
  C_N: 46;
  C_X: 47;
  C_C: 48;
  C_O: 49;
  K_M: 50;
  C_G: 51;
  C_D: 52;
  C_K: 53;
  C_R: 54;
  C_I: 55;
  H_R: 56;
  C_U: 57;
  C_W: 58;
  C_Y: 59;
  C_Z: 60;
  D_K: 61;
  D_J: 62;
  D_M: 63;
  D_O: 64;
  E_C: 65;
  E_G: 66;
  S_V: 67;
  G_Q: 68;
  E_R: 69;
  E_E: 70;
  E_T: 71;
  F_K: 72;
  F_O: 73;
  F_J: 74;
  F_I: 75;
  F_R: 76;
  G_F: 77;
  P_F: 78;
  T_F: 79;
  G_A: 80;
  G_M: 81;
  G_E: 82;
  D_E: 83;
  G_H: 84;
  G_I: 85;
  G_R: 86;
  G_L: 87;
  G_D: 88;
  G_P: 89;
  G_U: 90;
  G_T: 91;
  G_G: 92;
  G_N: 93;
  G_W: 94;
  G_Y: 95;
  H_T: 96;
  H_M: 97;
  V_A: 98;
  H_N: 99;
  H_K: 100;
  H_U: 101;
  I_S: 102;
  I_N: 103;
  I_D: 104;
  I_R: 105;
  I_Q: 106;
  I_E: 107;
  I_M: 108;
  I_L: 109;
  I_T: 110;
  J_M: 111;
  J_P: 112;
  J_E: 113;
  J_O: 114;
  K_Z: 115;
  K_E: 116;
  K_I: 117;
  K_P: 118;
  K_R: 119;
  K_W: 120;
  K_G: 121;
  L_A: 122;
  L_V: 123;
  L_B: 124;
  L_S: 125;
  L_R: 126;
  L_Y: 127;
  L_I: 128;
  L_T: 129;
  L_U: 130;
  M_O: 131;
  M_K: 132;
  M_G: 133;
  M_W: 134;
  M_Y: 135;
  M_V: 136;
  M_L: 137;
  M_T: 138;
  M_H: 139;
  M_Q: 140;
  M_R: 141;
  M_U: 142;
  Y_T: 143;
  M_X: 144;
  F_M: 145;
  M_D: 146;
  M_C: 147;
  M_N: 148;
  M_E: 149;
  M_S: 150;
  M_A: 151;
  M_Z: 152;
  M_M: 153;
  N_A: 154;
  N_R: 155;
  N_P: 156;
  N_L: 157;
  N_C: 158;
  N_Z: 159;
  N_I: 160;
  N_E: 161;
  N_G: 162;
  N_U: 163;
  N_F: 164;
  M_P: 165;
  N_O: 166;
  O_M: 167;
  P_K: 168;
  P_W: 169;
  P_S: 170;
  P_A: 171;
  P_G: 172;
  P_Y: 173;
  P_E: 174;
  P_H: 175;
  P_N: 176;
  P_L: 177;
  P_T: 178;
  P_R: 179;
  Q_A: 180;
  R_E: 181;
  R_O: 182;
  R_U: 183;
  R_W: 184;
  B_L: 185;
  S_H: 186;
  K_N: 187;
  L_C: 188;
  M_F: 189;
  P_M: 190;
  V_C: 191;
  W_S: 192;
  S_M: 193;
  S_T: 194;
  S_A: 195;
  S_N: 196;
  R_S: 197;
  S_C: 198;
  S_L: 199;
  S_G: 200;
  S_X: 201;
  S_K: 202;
  S_I: 203;
  S_B: 204;
  S_O: 205;
  Z_A: 206;
  G_S: 207;
  S_S: 208;
  E_S: 209;
  L_K: 210;
  S_D: 211;
  S_R: 212;
  S_J: 213;
  S_Z: 214;
  S_E: 215;
  C_H: 216;
  S_Y: 217;
  T_W: 218;
  T_J: 219;
  T_Z: 220;
  T_H: 221;
  T_L: 222;
  T_G: 223;
  T_K: 224;
  T_O: 225;
  T_T: 226;
  T_N: 227;
  T_R: 228;
  T_M: 229;
  T_C: 230;
  T_V: 231;
  U_G: 232;
  U_A: 233;
  A_E: 234;
  G_B: 235;
  U_S: 236;
  U_M: 237;
  U_Y: 238;
  U_Z: 239;
  V_U: 240;
  V_E: 241;
  V_N: 242;
  V_G: 243;
  V_I: 244;
  W_F: 245;
  E_H: 246;
  Y_E: 247;
  Z_M: 248;
  Z_W: 249;
}

export const ISO3166_CountryCode: ISO3166_CountryCodeMap;

export interface LanguageMap {
  EN: 0;
  ES: 1;
  ZH: 2;
  FR: 3;
}

export const Language: LanguageMap;

export interface ReportTypeMap {
  INTEGRATED_REPORT: 0;
  FINANCIAL_REPORT: 1;
  SUSTAINABILITY_REPORT: 2;
  ANNUAL_REPORT: 3;
  PROXY_STATEMENT: 4;
  REGISTRATION_STATEMENT: 5;
  QUARTERLY_REPORT: 6;
  HALF_YEARLY_REPORT: 7;
  OTHER: 8;
}

export const ReportType: ReportTypeMap;

export interface IndustryCodePrefixMap {
  I_S_I_C: 0;
  N_A_I_C_S: 1;
  G_I_C_S: 2;
  S_I_C: 3;
}

export const IndustryCodePrefix: IndustryCodePrefixMap;

export interface ReportFormatMap {
  P_D_F: 0;
  I_X_B_R_L: 1;
  OPEN_XML: 2;
}

export const ReportFormat: ReportFormatMap;

export interface ReportingStandardMap {
  G_A_A_P: 0;
  I_F_R_S: 1;
  I_S_S_B: 2;
  E_F_R_A_G: 3;
  G_R_I: 4;
}

export const ReportingStandard: ReportingStandardMap;

export interface UnitMap {
  TONNE_CO2E: 0;
  TONNE_CO2: 1;
  TONNE_CH4: 2;
  TONNE_N2O: 3;
  TONNE_S: 4;
  TONNE_NOX: 5;
  TONNE_SOX: 6;
  TONNE_PM10: 7;
  TONNE_PM2_5: 8;
  TONNE_VOC: 9;
  TONNE_NH3: 10;
  TONNE_PFC: 11;
  TONNE_SF6: 12;
  TONNE_HFC: 13;
  TONNE_CFC: 14;
  TONNE_HFC23: 15;
  TONNE_HFC32: 16;
  TONNE_HFC125: 17;
  TONNE_HFC134A: 18;
  TONNE_HFC143A: 19;
  TONNE_HFC227EA: 20;
  TONNE_HFC245FA: 21;
  TONNE_HFC365MFC: 22;
  TONNE_HFC4310MEE: 23;
  TONNE_C2F6: 24;
  TONNE_C3F8: 25;
  TONNE_C4F10: 26;
  TONNE_C5F12: 27;
  TONNE_C6F14: 28;
  TONNE_C7F16: 29;
  TONNE_C8F18: 30;
  TONNE_C10F18: 31;
  TONNE_C12F18: 32;
  TONNE_C14F18: 33;
  TONNE_C16F18: 34;
  TONNE_C18F18: 35;
  TONNE_C20F18: 36;
  TONNE_C22F18: 37;
  TONNE_C24F18: 38;
  TONNE_C26F18: 39;
  TONNE_C28F18: 40;
  TONNE_C30F18: 41;
  TONNE_C32F18: 42;
  TONNE_C34F18: 43;
  LITER: 100;
  KILOGRAM: 101;
  CUBIC_METER: 102;
  KILOWATT: 103;
  MEGAWATT: 104;
  MEGAJUOLE: 105;
  KILOMETER: 106;
  SQUARE_METER: 107;
  TONNE: 108;
  MW_H: 109;
  KW_H: 110;
}

export const Unit: UnitMap;

