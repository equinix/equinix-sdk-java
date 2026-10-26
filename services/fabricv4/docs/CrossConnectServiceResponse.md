

# CrossConnectServiceResponse

Service ordered alongside the Cross Connect.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Service URI. |  [optional] [readonly] |
|**uuid** | **UUID** | Service Identifier. |  [optional] [readonly] |
|**type** | **CrossConnectServiceType** |  |  [optional] [readonly] |
|**state** | **CrossConnectServiceState** |  |  [optional] [readonly] |
|**device** | [**PatchEquipmentResponse**](PatchEquipmentResponse.md) | Patch equipment device details. Returned for the XC_PATCH_EQUIPMENT service. |  [optional] [readonly] |
|**description** | **String** | Additional notes captured for the service. |  [optional] [readonly] |
|**changeLog** | [**CrossConnectChangelog**](CrossConnectChangelog.md) |  |  [optional] |



