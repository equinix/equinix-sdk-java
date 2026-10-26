

# CrossConnectServiceRequest

Service to order alongside the Cross Connect. <br> Send one entry per service. <br> device and description apply to the XC_PATCH_EQUIPMENT service only. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **CrossConnectServiceType** |  |  |
|**device** | [**PatchEquipmentRequest**](PatchEquipmentRequest.md) | Patch equipment device details. Required for the XC_PATCH_EQUIPMENT service.  |  [optional] |
|**description** | **String** | Additional notes for the service. Required for the XC_PATCH_EQUIPMENT service.  |  [optional] |



