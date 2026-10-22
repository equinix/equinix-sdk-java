

# Note

Extra information about a given entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier of the note |  [optional] |
|**referenceId** | **String** | Unique identifier for referencing notes. |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Date and time of the note creation in UTC timezone |  [optional] |
|**text** | **String** | The content of the note |  [optional] |
|**author** | **String** | Author of the notes |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of notes |  [optional] |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | File(s) attached to the orders. To learn about including attachments in your request, refer to Attachments API. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOMER_QUERY | &quot;CUSTOMER_QUERY&quot; |
| CUSTOMER_NOTES | &quot;CUSTOMER_NOTES&quot; |
| TECHNICIAN_QUERY | &quot;TECHNICIAN_QUERY&quot; |
| TECHNICIAN_NOTES | &quot;TECHNICIAN_NOTES&quot; |



