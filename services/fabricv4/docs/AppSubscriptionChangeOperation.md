

# AppSubscriptionChangeOperation

App Subscription change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | Handy shortcut for operation name |  |
|**path** | **String** | path inside document leading to updated parameter |  |
|**value** | **Object** | new value for updated parameter |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



