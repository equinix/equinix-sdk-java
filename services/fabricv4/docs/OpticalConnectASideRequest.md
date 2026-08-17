

# OpticalConnectASideRequest

A-Side configuration. Always a patch panel port from your cage. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patchPanelId** | **String** | Unique identifier of the patch panel. |  [optional] |
|**patchPanelPortA** | **String** | Specify the desired port number for Port A. &lt;br&gt; When ports are not provided, next available ports will be used.  |  [optional] |
|**patchPanelPortB** | **String** | Specify the desired port number for Port B. &lt;br&gt; When ports are not provided, next available ports will be used. &lt;br&gt; Required for Connector type FC, SC and ST only.  |  [optional] |
|**connectorType** | [**ConnectorTypeEnum**](#ConnectorTypeEnum) | Type of Connector |  [optional] |



## Enum: ConnectorTypeEnum

| Name | Value |
|---- | -----|
| FC | &quot;FC&quot; |
| SC | &quot;SC&quot; |
| LC | &quot;LC&quot; |
| ST | &quot;ST&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



