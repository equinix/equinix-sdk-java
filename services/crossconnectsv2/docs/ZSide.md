

# ZSide

Z-Side can be an existing or a new customer without patch panel. For an existing customer, only `patchPanel` and `connectorType` are required. For a new customer or patch panel, `providerName`, `ibx`, and `loaAttachmentId` are required

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notificationEmail** | **String** | Z-Side customer will be notified when cross connect is complete via specified email address |  [optional] |
|**loaAttachmentId** | **String** | Attachment ID of Letter of Authorization (LOA). Refer to Attachment API to upload documents via API. |  |
|**ibx** | **String** | IBX location code. |  |
|**providerName** | **String** | Account name of service provider. |  |
|**connectorType** | **ConnectorTypes** |  |  |
|**patchPanel** | [**PatchPanel**](PatchPanel.md) |  |  |
|**circuitId** | **String** | Customer or carrier circuit ID cable reference number for verification purposes. |  [optional] |



