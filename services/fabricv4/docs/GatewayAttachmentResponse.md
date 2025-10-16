

# GatewayAttachmentResponse

Schema representing a Gateway attaching or detaching on a Cloud Router. This schema defines the structure of the response returned when a Gateway is attached or detached to a Cloud Router.

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
| VPN_GATEWAY | &quot;VPN_GATEWAY&quot; |



## Enum: AttachmentStatusEnum

| Name | Value |
|---- | -----|
| ATTACHING | &quot;ATTACHING&quot; |
| ATTACHED | &quot;ATTACHED&quot; |
| DETACHING | &quot;DETACHING&quot; |
| DETACHED | &quot;DETACHED&quot; |
| FAILED | &quot;FAILED&quot; |



