

# CrossConnectZSideResponseDemarcationPoint

Z-Side demarcation point. <br> cageUniqueSpaceId and cabinetUniqueSpaceId identify the Z-Side space. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patchPanelId** | **String** | Patch Panel Identifier. |  [optional] |
|**patchPanelPortA** | **Integer** | Specify the desired port number. When ports are not provided, next available ports will be used.  |  [optional] |
|**patchPanelPortB** | **Integer** | Specify the desired port number. When ports are not provided, next available ports will be used. Required for Connector type FC and ST only.  |  [optional] |
|**connectorType** | **String** | Connector Type. |  [optional] |
|**cageUniqueSpaceId** | **String** | Unique identifier of the Cage. |  [optional] [readonly] |
|**cabinetUniqueSpaceId** | **String** | Unique identifier of the Cabinet. |  [optional] [readonly] |



