

# StreamPostRequest

Create Stream

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** | Customer-provided stream name |  |
|**description** | **String** | Customer-provided stream description |  [optional] |
|**project** | [**Project**](Project.md) |  |  |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;SimplifiedNotification&gt;**](SimplifiedNotification.md) | Preferences for stream notifications. Optional; at most one entry, of type ALL, with up to 12 emails. Set at creation only. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TELEMETRY_STREAM | &quot;TELEMETRY_STREAM&quot; |



