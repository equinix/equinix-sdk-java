

# ProviderEnvironment

Provider Environment associated with an IC_PROFILE service profile <font color=\"red\"> <sup color='red'>Beta</sup></font>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Provider Environment URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned provider environment identifier |  [optional] |
|**type** | **ProviderEnvironmentTypeEnum** |  |  [optional] |
|**name** | **String** | Provider environment name |  [optional] |
|**description** | **String** | Provider environment description |  [optional] |
|**region** | **String** | Cloud provider region identifier |  [optional] |
|**supportedBandwidths** | **List&lt;Integer&gt;** | Supported bandwidths in Mbps |  [optional] |
|**metros** | [**List&lt;ServiceMetro&gt;**](ServiceMetro.md) | Derived response attribute. |  [optional] |
|**supportedFeatures** | **List&lt;String&gt;** | Supported Feature Types |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



