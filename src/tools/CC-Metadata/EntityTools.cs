using System.Text;
using Google.Protobuf;

namespace CarbonCall.Metadata;

/// <summary>
/// Tools for generating entities
/// </summary>
public static class EntityTools
{
    /// <summary>
    /// Get a sample report
    /// </summary>
    /// <returns></returns>
    public static SustainabilityReport GetReport()
    {
        var metadata = GetMetadata();
        var report = new SustainabilityReport
        {
            GRID = GenerateGrid(metadata.ToString()),
            Metadata = metadata,
        };
        report.Metadata.GRID = report.GRID;
        report.Report = metadata.ToByteString().ToBase64();
        
        return report;
    }
    /// <summary>
    /// Get sample metadata
    /// </summary>
    /// <returns></returns>
    public static Metadata GetMetadata()
    {
        var m = new Metadata
        {
            OrganizationIdentifier = "LEI: 254900OPPU84GM83MG36",
            OrganizationName = "CarbonCall",
            Domicile = ISO3166_CountryCode.US,
            OperatingCountries = { ISO3166_CountryCode.US, ISO3166_CountryCode.CN, ISO3166_CountryCode.GB },
            Languages = { Language.En, Language.Zh },
            ReportType = ReportType.SustainabilityReport,
            ReportIssueDate = "2021-01-01",
            ReportingPeriod = new TimePeriod
            {
                StartDate = "2020-01-01",
                EndDate = "2020-12-31"
            },
            ReportReplaces = "",
            Location = "https://carboncall.io/reportFromPeriod.json",
            Industry = new Industry
            {
                Prefix = IndustryCodePrefix.ISIC,
                Code = "6201"
            },
            Performance =
                "{'Perf1':{'name':'Perf1','type':'performance','value':127000,'unit':'tCO2e'},'Perf2':{'name':'Perf2','type':'performance','value':0,'min':0,'max':100,'step':1,'unit':'%'}} ",
            Goverance = new Goverance
            {
                IntendedUse = "Public",
                RestrictedAccess = false,
                ReportOwner = "CarbonCall"
            },
            Methodology = new Methodology
            {
                BoundaryApproach = Methodology.Types.BoundaryApproach.OperationalControl,
                MethodologyType = Methodology.Types.MethodologyType.GhgProtocol,
                PercentageOfTotalPortfolioReported = "100",
                PercentageOfEstimatedCalculations = "82"
            },
            ReportFormat = ReportFormat.IXBRL,
            ReportingStandard = ReportingStandard.ISSB,
            Assurance = "DE_BaFIN: 1234567890",
            PriorReport = "",
            ReportHash = "dftaae3297i89798adsdf832adfs912231azsdf",
            Activities = { GetActivities() },
            ReportContext = { GetReportMetaTags() },
            PropertyContexts = { GetPropertyContexts() },
            MetatdataExtensions = {  GetMetadataExtensions() },
            PFExtensions = { GetPfExtensions() },
            RelatedReports = { "SDJQ.BPUN.15", "ADCF.GPOM.16" },
        };
        return m;
    }

    private static ProductFootprintExtension GetPfExtensions()
    {
        var pfEx = new ProductFootprintExtension
        {
            PfId = Guid.NewGuid().ToString(),
            PCFPropertyData = { new PropertyContext
                {
                    PropertyName = "pcf/pCfExcludingBiogenic",
                    Metatags =
                    {
                        new Metatag
                        {
                            Key = "majorExcludingBiogenicSourcePCF_Id",
                            Value = Guid.NewGuid().ToString()
                        }
                    }
                } 
            }
        };
        return pfEx;
    }

    private static MetadataExtension GetMetadataExtensions()
    {
        return new MetadataExtension
        {
            DataSchema = "https://carboncall.io/schemas/2024/01/01/CarbonCallMetadata.json",
            Documentation = "https://carboncall.io/docs/2024/01/01/CarbonCallMetadata.html",
            Data =
                "{'@context':'compliancemetrics.org','@type':'compliancemetrics.org/ComplianceMetric','name':'compliancemetrics.org/ComplianceMetric/1.0/1','jurisdiction':'eu','factorCompliance':0.5,'factorCompleteness':0.73,'factorCorrectness':0.9,'accessibility':100}"
        };
    }

    private static IEnumerable<Activity> GetActivities()
    {
        var retVal = new List<Activity>();

        retVal.Add(new Activity
        {
            ActivityAmount = "198.31",
            UnitOfMeasure = Unit.TonneCo2E,
            ActivityType = "Heating",
            ActivityDescription = "Heating of buildings",
            ActivityPeriod = new TimePeriod
            {
                StartDate = "2020-01-01",
                EndDate = "2020-12-31"
            },
            ActivityLocation = new GeographicLocation
            {
                Longitude = "123.456",
                Latitude = "0.12123"
            },
            ActivityFactorAndSource = GetFactorAndSource(),
            RelatedMetadata = { GetRelatedMetadata() }
        });

        return retVal;
    }

    private static Metalink GetRelatedMetadata()
    {
        return new Metalink
        {
            RelatedMetadataPath = "Metadata/Activities/Heating/ActivityFactorAndSource"
        };
    }

    private static FactorAndSource GetFactorAndSource()
    {
        return new FactorAndSource
        {
            FactorType = FactorAndSource.Types.FactorType.Factored,
            FactorSource =
                "https://www.epa.gov/energy/greenhouse-gases-equivalencies-calculator-calculations-and-references",
            FactorUnit = Unit.TonneHfc,
            FactorPrecision = new FactorAndSource.Types.PrecisionMix
            {
                Low = 70,
                Medium = 20,
                High = 10
            }
        };
    }

    private static IEnumerable<PropertyContext> GetPropertyContexts()
    {
        var retVal = new List<PropertyContext>();

        var prop1 = new PropertyContext
        {
            PropertyName = "Section 1.2.1",
            Metatags =
            {
                new Metatag
                {
                    Key = "Carbon Offset Ratio",
                    Value = "1.2"
                }
            }
        };
        
        var prop2 = new PropertyContext
        {
            PropertyName = "Section 1.2.2",
            Metatags =
            {
                new Metatag
                {
                    Key = "GHG Adjustment Exception",
                    Value = "GGP-1_2_2"
                }
            }
        };
        retVal.Add(prop1);
        retVal.Add(prop2);
        return retVal;
    }

    private static IEnumerable<Metatag> GetReportMetaTags()
    {
        var retVal = new List<Metatag>();
        
        var mt1 = new Metatag
        {
            Key = "Author Contact Email",
            Value = "someone@somewhere.com"
        };
        
        var mt2 = new Metatag
        {
            Key = "Author Contact Phone",
            Value = "123-456-7890"
        };
        retVal.Add(mt1);
        retVal.Add(mt2);
        return retVal;
    }

    //Unique 8 digit alphanumeric identifier. Omits [0/O | 1/I] to avoid ambiguity, case insensitive. Example: R3AK.XF9B.24
    //where part1 = R3AK and part2 = XF9B, separated by a dot.
    //the postfix checksum is 24 separated by a dot.
    //has a 2 digit numeric checksum, postfix, used to avoid typos in situations where the GRID is retyped.
    private static string GenerateGrid(string metadata)
    {
        string? part1, part2;
        int checksum;
        do
        {
            part1 = GenerateRandomGridString(4);
            part2 = GenerateRandomGridString(4);
            checksum = GenerateChecksum(part1, part2);
        } while (checksum == 0);

        return $"{part1}.{part2}.{checksum}";
        
    }

    //returns a 2 digit checksum
    private static int GenerateChecksum(string? part1, string? part2)
    {
        var sb = new StringBuilder();
        sb.Append(part1);
        sb.Append(part2);
        var sum = 0;
        for (var i = 0; i < sb.Length; i++)
        {
            sum += sb[i];
        }

        return sum % 100;
    }

    //excludes 1, I, 0, O
    private static string GenerateRandomGridString(int p0)
    {
        var chars = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
        var stringChars = new char[p0];
        var random = new Random();
        //assign each char a random value from chars
        for (var i = 0; i < stringChars.Length; i++)
        {
            stringChars[i] = chars[random.Next(chars.Length)];
        }

        return new string(stringChars);
    }
}