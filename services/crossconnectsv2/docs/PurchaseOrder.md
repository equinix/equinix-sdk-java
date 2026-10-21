

# PurchaseOrder

Purchase Order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the Purchase Order |  |
|**number** | **String** | Purchase order number is applicable when &#x60;type&#x60; is EXISTING or NEW |  |
|**amount** | **BigDecimal** | This is only applicable when &#x60;type&#x60; is NEW |  [optional] |
|**startDate** | **LocalDate** | This is only applicable when &#x60;type&#x60; is NEW |  [optional] |
|**endDate** | **LocalDate** | This is only applicable when &#x60;type&#x60; is NEW |  [optional] |
|**attachmentId** | **String** | Attachment ID of Purchase Order document. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXEMPTED | &quot;EXEMPTED&quot; |
| NEW | &quot;NEW&quot; |
| EXISTING | &quot;EXISTING&quot; |



