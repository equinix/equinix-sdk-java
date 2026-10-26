

# CreateCrossConnect

Create Cross Connect request. A single request body supports all Cross Connect connection types - patch panel to patch panel, connection with LOA and connection to a BMMR (by Equinix or by Self). Refer to the request examples for each use case. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **CrossConnectType** |  |  |
|**name** | **String** | A short, descriptive name for this Cross Connect. |  |
|**bmmrType** | **BmmrType** | Required when connecting to a BMMR. &lt;br&gt; Use EQUINIX when BMMR Extension is required and Equinix installs it, or SELF when you install it yourself.  |  [optional] |
|**circuitId** | **String** | Circuit identifier of the Cross Connect. |  [optional] |
|**redundancy** | [**CrossConnectRedundancy**](CrossConnectRedundancy.md) | Provide it to place a diverse Cross Connect against an existing one - set group to the redundancy group id or the serial number of the existing Cross Connect, and priority to SECONDARY.  |  [optional] |
|**aSide** | [**CrossConnectASideRequest**](CrossConnectASideRequest.md) | A-Side connection details. |  |
|**zSide** | [**CrossConnectZSideRequest**](CrossConnectZSideRequest.md) | Z-Side connection details. &lt;br&gt; Provide the DemarcationPoint, the LOA reference or the BMMR location depending on the Cross Connect being requested.  |  |
|**schedule** | [**ScheduleRequest**](ScheduleRequest.md) | Preferred installation schedule. When omitted, the Cross Connect is scheduled with the STANDARD schedule code.  |  [optional] |
|**services** | [**List&lt;CrossConnectServiceRequest&gt;**](CrossConnectServiceRequest.md) | Cross Connect Services. |  [optional] |
|**notifications** | [**List&lt;CrossConnectNotification&gt;**](CrossConnectNotification.md) | Preferences for notifications on Cross Connect configuration or status changes.  |  [optional] |
|**order** | [**OrderRequest**](OrderRequest.md) |  |  [optional] |
|**notes** | [**List&lt;CrossConnectNoteRequest&gt;**](CrossConnectNoteRequest.md) | Additional Note. |  [optional] |
|**attachments** | [**List&lt;CrossConnectAttachment&gt;**](CrossConnectAttachment.md) | Additional Attachments. |  [optional] |



