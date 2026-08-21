

# AppLinkAttachedAppService

App Service object associated with App Link

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Resource URI |  [optional] [readonly] |
|**type** | **AppServiceType** |  |  |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  |
|**name** | **String** | Customer-provided App Service name |  [optional] |
|**description** | **String** | Customer-provided App Service description |  [optional] |
|**state** | **AppServiceState** |  |  [optional] |
|**endpoint** | **String** | Accessible endpoint through this service |  [optional] |
|**sourceDomains** | **List&lt;String&gt;** | List of source domains from where traffic is allowed |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**geoScope** | **String** | Geo scope for the App Service |  |
|**destinationIp** | **String** | Target IP for forwarding API requests |  |
|**attachmentStatus** | **AppLinkAttachState** |  |  [optional] |



