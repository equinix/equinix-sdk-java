

# PurchaseOrder

Purchase Order information associated with the account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | Purchase Order number. |  [optional] |
|**amount** | **String** | Purchase Order amount. |  [optional] |
|**startDate** | **LocalDate** | Date the Purchase Order takes effect. |  [optional] |
|**endDate** | **LocalDate** | Date the Purchase Order expires. |  [optional] |
|**attachmentId** | **UUID** | Identifier of the uploaded purchase order document. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Purchase Order type. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXEMPTION | &quot;EXEMPTION&quot; |
| EXISTING | &quot;EXISTING&quot; |
| NEW | &quot;NEW&quot; |



