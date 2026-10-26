

# ExchangeServiceCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Internet Exchange Service type |  |
|**name** | **String** | Customer-provided internet exchange service name |  |
|**description** | **String** | Customer-provided internet exchange service description |  [optional] |
|**publicPeeringConnection** | [**PublicPeeringConnectionRequest**](PublicPeeringConnectionRequest.md) |  |  |
|**routingProtocol** | [**RoutingProtocolRequest**](RoutingProtocolRequest.md) |  |  |
|**order** | [**ExchangeServiceOrder**](ExchangeServiceOrder.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;ExchangeServiceNotification&gt;**](ExchangeServiceNotification.md) | Preferences for notifications on Internet Exchange Service configuration or status changes |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IX | &quot;IX&quot; |



