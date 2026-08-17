

# ExchangeServiceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | Internet Exchange Service URI |  [optional] |
|**uuid** | **UUID** | Internet Exchange Service identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Internet Exchange Service Type |  [optional] |
|**name** | **String** | Name |  [optional] |
|**bandwidth** | **Integer** | bandwidth in Mbps |  [optional] |
|**description** | **String** | Description |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State |  [optional] |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  [optional] |
|**publicPeeringConnection** | [**PublicPeeringConnectionResponse**](PublicPeeringConnectionResponse.md) |  |  [optional] |
|**routingProtocol** | [**RoutingProtocolResponse**](RoutingProtocolResponse.md) |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;ExchangeServiceNotification&gt;**](ExchangeServiceNotification.md) | Preferences for notifications on Internet Exchange Service configuration or status changes |  [optional] |
|**changelog** | [**PlatformChangelog**](PlatformChangelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IX | &quot;IX&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONING_FAILED | &quot;PROVISIONING_FAILED&quot; |
| PENDING_ACTIVATION | &quot;PENDING_ACTIVATION&quot; |
| ACTIVATING | &quot;ACTIVATING&quot; |
| ACTIVATING_FAILED | &quot;ACTIVATING_FAILED&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| REPROVISIONING_FAILED | &quot;REPROVISIONING_FAILED&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| DEPROVISIONING_FAILED | &quot;DEPROVISIONING_FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



