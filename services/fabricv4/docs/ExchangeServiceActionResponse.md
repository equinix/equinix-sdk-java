

# ExchangeServiceActionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**href** | **String** | Internet Exchange Service Action URI |  [optional] |
|**uuid** | **UUID** | Action identifier |  [optional] |
|**description** | **String** | Action description |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State |  [optional] |
|**changelog** | [**PlatformChangelog**](PlatformChangelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACTIVATE | &quot;EXCHANGE_SERVICE_ACTIVATE&quot; |
| VALIDATE | &quot;EXCHANGE_SERVICE_VALIDATE&quot; |
| RETRY_PROVISION | &quot;EXCHANGE_SERVICE_RETRY_PROVISION&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |



