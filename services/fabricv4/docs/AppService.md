

# AppService

App Service object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Resource URI |  [optional] [readonly] |
|**type** | **AppServiceType** |  |  |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**name** | **String** | Customer-provided App Service name |  |
|**description** | **String** | Customer-provided App Service description |  [optional] |
|**state** | **AppServiceState** |  |  [optional] |
|**endpoint** | **String** | Accessible endpoint through this service |  [optional] |
|**sourceDomains** | **List&lt;String&gt;** | List of source domains from where traffic is allowed |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |
|**change** | [**AppServiceChange**](AppServiceChange.md) |  |  [optional] |



