

# Layer1DeinstallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerReferenceId** | **String** | Customer Reference Identifier / External Reference Identifier |  [optional] |
|**purchaseOrder** | [**PurchaseOrder**](PurchaseOrder.md) |  |  [optional] |
|**contacts** | [**List&lt;Layer1CreateContactsInner&gt;**](Layer1CreateContactsInner.md) |  |  [optional] |
|**attachments** | [**List&lt;AttachmentRequest&gt;**](AttachmentRequest.md) | File(s) attached to the layer #1 connections |  [optional] |
|**description** | **String** | Description of deinstallation |  [optional] |
|**details** | [**List&lt;Layer1DeinstallDetails&gt;**](Layer1DeinstallDetails.md) |  layer #1 connections details |  |
|**removalDate** | **LocalDate** | Equinix will aim to terminate this Cross Connect at this date subjected to operation availability. |  |



