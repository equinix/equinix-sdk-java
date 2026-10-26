

# CrossConnectAttachmentResponse

Document attached to a Cross Connect.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | URI to the attachment resource. |  [optional] [readonly] |
|**uuid** | **UUID** | Attachment resource Identifier. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Sub-resource type. |  [optional] [readonly] |
|**source** | [**SourceEnum**](#SourceEnum) | Attachment Source. |  [optional] [readonly] |
|**attachmentId** | **UUID** | Attachment Identifier. |  [optional] [readonly] |
|**downloadHref** | **URI** | URI to download the attachment file content from the Equinix attachment service.  |  [optional] [readonly] |
|**changeLog** | [**CrossConnectChangelog**](CrossConnectChangelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ATTACHMENT | &quot;ATTACHMENT&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;CUSTOMER&quot; |
| EQUINIX | &quot;EQUINIX&quot; |



