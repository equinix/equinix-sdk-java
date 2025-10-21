

# CloudRouterForGatewayAttachmentResponse

Response schema showing the Fabric Cloud Router on a Gateway Attachment. This schema defines the structure of the response showing the Cloud Router when a Gateway Attachment is done on it.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**uuid** | **UUID** |  |  [optional] |
|**attachmentStatus** | [**AttachmentStatusEnum**](#AttachmentStatusEnum) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_ROUTER | &quot;XF_ROUTER&quot; |



## Enum: AttachmentStatusEnum

| Name | Value |
|---- | -----|
| ATTACHING | &quot;ATTACHING&quot; |
| ATTACHED | &quot;ATTACHED&quot; |
| DETACHING | &quot;DETACHING&quot; |
| DETACHED | &quot;DETACHED&quot; |
| FAILED | &quot;FAILED&quot; |



