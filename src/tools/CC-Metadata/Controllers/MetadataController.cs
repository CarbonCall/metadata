using Microsoft.AspNetCore.Mvc;

namespace CarbonCall.Metadata.Controllers;

/// <summary>
/// Metadata controller
/// </summary>
[ApiController]
[Route("[controller]")]
public class MetadataController:ControllerBase
{
    private readonly ILogger<MetadataController> _logger;

    /// <summary>
    /// Constructor for MetadataController  
    /// </summary>
    /// <param name="logger"></param>
    public MetadataController(ILogger<MetadataController> logger)
    {
        _logger = logger;
    }
    
    /// <summary>
    /// Get the sustainability report
    /// </summary>
    /// <returns></returns>
    [HttpGet("getReport")]
    public SustainabilityReport GetReport()
    {
        _logger.Log(LogLevel.Information, "GetReport called");
        return EntityTools.GetReport();
    }

    /// <summary>
    /// Get the metadata
    /// </summary>
    /// <param name="grid"></param>
    /// <returns></returns>
    [HttpGet("getMetadata")]
    public Metadata GetMetadata(string grid)
    {
        _logger.Log(LogLevel.Information, "GetMetadata called");
        var retVal = EntityTools.GetMetadata();
        retVal.GRID = grid;
        return retVal;
    }
}