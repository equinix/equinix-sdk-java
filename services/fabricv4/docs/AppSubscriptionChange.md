

# AppSubscriptionChange

Current state of latest AppSubscription change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  |
|**data** | [**List&lt;AppSubscriptionChangeOperation&gt;**](AppSubscriptionChangeOperation.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APP_SUBSCRIPTION_UPDATE | &quot;APP_SUBSCRIPTION_UPDATE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



