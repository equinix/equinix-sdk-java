

# StreamAssetInterface

Network Edge Device interface attached to a stream

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Network Edge Device interface URI |  [optional] [readonly] |
|**id** | **Integer** | Network Edge Device interface identifier |  [optional] |
|**uuid** | **UUID** | Network Edge Device interface UUID |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Network Edge Device interface type |  [optional] |
|**state** | **String** | Network Edge Device interface usage status |  [optional] |
|**attachmentStatus** | [**AttachmentStatusEnum**](#AttachmentStatusEnum) | interface attachment status |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DATA | &quot;DATA&quot; |
| MGMT | &quot;MGMT&quot; |
| SSH | &quot;SSH&quot; |
| FAB | &quot;FAB&quot; |
| CTRL | &quot;CTRL&quot; |



## Enum: AttachmentStatusEnum

| Name | Value |
|---- | -----|
| ATTACHING | &quot;ATTACHING&quot; |
| ATTACHED | &quot;ATTACHED&quot; |
| DETACHED | &quot;DETACHED&quot; |
| DETACHING | &quot;DETACHING&quot; |
| FAILED | &quot;FAILED&quot; |



