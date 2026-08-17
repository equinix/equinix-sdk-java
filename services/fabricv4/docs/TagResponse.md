

# TagResponse

Equinix Fabric Tag Response Object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** |  |  [optional] |
|**uuid** | **UUID** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**displayName** | **String** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Status of the Tag request. Can be APPROVED, PENDING_APPROVAL, REJECT |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot; |
| REJECTED | &quot;REJECTED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



