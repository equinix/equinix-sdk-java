

# LoaDemarcationPoint

Specifies the demarcation point. <br> For CAGE_LOA - cageUniqueSpaceId is required. <br> For PATCH_PANEL_LOA - patchPanelId is required. <br> For PATCH_PANEL_PORT_LOA - patchPanelId, patchPanelPortA, patchPanelPortB      and connectorType is required. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cageUniqueSpaceId** | **String** | Unique identifier of the Cage. |  [optional] |
|**patchPanelId** | **String** | Unique identifier of the Patch Panel.  |  [optional] |
|**patchPanelPortA** | **Integer** | Specify the desired port number. &lt;br&gt; When ports are not provided, next available ports will be used.  |  [optional] |
|**patchPanelPortB** | **Integer** | Specify the desired port number. &lt;br&gt; When ports are not provided, next available ports will be used. &lt;br&gt; Required for Connector type FC and ST only.  |  [optional] |
|**connectorType** | **LoaPatchPanelConnectorType** |  |  [optional] |



