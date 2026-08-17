

# LoaNoteDetails

Represents a note added to a LOA by an  authorized user from either the issuer or requestor organization 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicates which party added the note. &lt;br&gt; ISSUER — note was added by a user from the issuer organization. &lt;br&gt; REQUESTOR — note was added by a user from the requestor organization.  |  [optional] |
|**href** | **URI** | URI to note resource. |  [optional] |
|**uuid** | **UUID** | Unique identifier of this note. |  [optional] |
|**comments** | **String** | Content of the note as submitted by the user. |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Date and time when the note was created. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ISSUER | &quot;ISSUER&quot; |
| REQUESTOR | &quot;REQUESTOR&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



