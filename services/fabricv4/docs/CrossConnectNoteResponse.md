

# CrossConnectNoteResponse

Cross Connect Note.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Note URI. |  [optional] [readonly] |
|**uuid** | **UUID** | Note Identifier. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Sub-resource type. |  [optional] [readonly] |
|**source** | [**SourceEnum**](#SourceEnum) | Party that added the note. |  [optional] [readonly] |
|**comments** | **String** | Note comments. |  [optional] [readonly] |
|**parentNote** | [**CrossConnectParentNote**](CrossConnectParentNote.md) | The note this note is responding to. Returned when the note was added in response to an Equinix note.  |  [optional] [readonly] |
|**changeLog** | [**CrossConnectChangelog**](CrossConnectChangelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NOTE | &quot;NOTE&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;CUSTOMER&quot; |
| EQUINIX | &quot;EQUINIX&quot; |



