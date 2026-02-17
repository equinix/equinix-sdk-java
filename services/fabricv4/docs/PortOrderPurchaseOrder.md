

# PortOrderPurchaseOrder

purchase order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | purchase order number |  [optional] |
|**amount** | **String** | purchase order amount |  [optional] |
|**startDate** | **OffsetDateTime** |  |  [optional] |
|**endDate** | **OffsetDateTime** |  |  [optional] |
|**attachmentId** | **UUID** |  |  [optional] |
|**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |



## Enum: SelectionTypeEnum

| Name | Value |
|---- | -----|
| EXEMPTION | &quot;EXEMPTION&quot; |
| EXISTING | &quot;EXISTING&quot; |
| NEW | &quot;NEW&quot; |
| BLANKET | &quot;BLANKET&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXEMPTION | &quot;EXEMPTION&quot; |
| EXISTING | &quot;EXISTING&quot; |
| NEW | &quot;NEW&quot; |
| BLANKET | &quot;BLANKET&quot; |



