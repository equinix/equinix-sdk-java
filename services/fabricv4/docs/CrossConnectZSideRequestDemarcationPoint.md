

# CrossConnectZSideRequestDemarcationPoint

Z-Side demarcation point. <br> Specify the destination patch panel and ports. <br> Specify cageUniqueSpaceId and cabinetUniqueSpaceId to identify the destination space. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patchPanelId** | **String** | Patch Panel Identifier. |  [optional] |
|**patchPanelPortA** | **Integer** | Specify the desired port number. When ports are not provided, next available ports will be used.  |  [optional] |
|**patchPanelPortB** | **Integer** | Specify the desired port number. When ports are not provided, next available ports will be used. Required for Connector type FC and ST only.  |  [optional] |
|**connectorType** | **String** | Connector Type. |  [optional] |
|**cageUniqueSpaceId** | **String** | Unique identifier of the Cage. |  [optional] |
|**cabinetUniqueSpaceId** | **String** | Unique identifier of the Cabinet. |  [optional] |



