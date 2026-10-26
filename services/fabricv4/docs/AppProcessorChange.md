

# AppProcessorChange

Current state of latest AppProcessor change

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of change |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current outcome of the change flow |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  [optional] |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  |
|**data** | [**List&lt;AppProcessorChangeOperation&gt;**](AppProcessorChangeOperation.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| APP_PROCESSOR_UPDATE | &quot;APP_PROCESSOR_UPDATE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| REQUESTED | &quot;REQUESTED&quot; |



