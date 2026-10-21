

# Layer1Create

A layer 1 Physical interconnections establishment between aSide and zSide

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerReferenceId** | **String** | Customer Reference Identifier / External Reference Identifier |  [optional] |
|**attachments** | [**List&lt;AttachmentRequest&gt;**](AttachmentRequest.md) | File(s) attached to the Cross Connect |  [optional] |
|**description** | **String** | Description of Cross Connect |  [optional] |
|**expediteDateTime** | **OffsetDateTime** | Expedite orders are delivered within the next 2 - 24 hours. Value must be in ISO-8601 UTC timezone format. |  [optional] |
|**details** | [**List&lt;Layer1Details&gt;**](Layer1Details.md) | Cross connections details |  |
|**purchaseOrder** | [**PurchaseOrder**](PurchaseOrder.md) |  |  [optional] |
|**contacts** | [**List&lt;Layer1CreateContactsInner&gt;**](Layer1CreateContactsInner.md) |  |  [optional] |



