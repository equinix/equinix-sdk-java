

# ServiceCreateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**type** | **ServiceType** |  |  |
|**connections** | [**List&lt;Connection&gt;**](Connection.md) | Collection of service connections uuids |  |
|**routingProtocol** | [**RoutingProtocolReadModel**](RoutingProtocolReadModel.md) |  |  |
|**bandwidth** | **Integer** | Service bandwidth in Mbps |  [optional] |
|**project** | [**ProjectReadModel**](ProjectReadModel.md) |  |  [optional] |
|**account** | [**Account**](Account.md) |  |  [optional] |
|**change** | [**Change**](Change.md) |  |  |
|**changeLog** | [**ChangeLog**](ChangeLog.md) |  |  [optional] |
|**order** | [**ServiceOrderReadModel**](ServiceOrderReadModel.md) |  |  [optional] |
|**uuid** | **UUID** | Service identifier |  |
|**state** | **ServiceState** |  |  |
|**useCase** | **UseCase** |  |  |



