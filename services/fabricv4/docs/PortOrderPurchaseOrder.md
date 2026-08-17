

# PortOrderPurchaseOrder

Purchase Order information associate to the account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | purchase order number |  [optional] |
|**amount** | **String** | purchase order amount |  [optional] |
|**startDate** | **String** |  |  [optional] |
|**endDate** | **String** |  |  [optional] |
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
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXEMPTION | &quot;EXEMPTION&quot; |
| EXISTING | &quot;EXISTING&quot; |
| NEW | &quot;NEW&quot; |
| BLANKET | &quot;BLANKET&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



