

# ServiceReadModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**href** | **URI** | Internet access URI |  |
|**uuid** | **UUID** | Service identifier |  |
|**type** | **ServiceType** |  |  |
|**name** | **String** | Name of the service This name should only contain spaces, the characters \&quot;_\&quot;, \&quot;-\&quot;, letters or numbers. The name cannot start or end with a \&quot;-\&quot;. This name can have only maximum of 24 characters  |  |
|**description** | **String** | Description of the service |  [optional] |
|**bandwidth** | **Long** | Bandwidth of the service in Mbps |  |
|**billing** | **ServiceBilling** |  |  |
|**billingEnabled** | **Boolean** | Indicates whether the service is billed |  |
|**billingStartDate** | **LocalDate** | Contains billing start date, if the service is billed |  [optional] |
|**state** | **ServiceState** |  |  |
|**change** | [**Change**](Change.md) |  |  |
|**changeLog** | [**ChangeLog**](ChangeLog.md) |  |  |
|**connections** | [**List&lt;ConnectionReadModel&gt;**](ConnectionReadModel.md) |  |  |
|**routingProtocol** | [**RoutingProtocolReadModel**](RoutingProtocolReadModel.md) |  |  |
|**locations** | [**List&lt;Location&gt;**](Location.md) |  |  |
|**account** | [**Account**](Account.md) |  |  |
|**project** | [**ProjectReadModel**](ProjectReadModel.md) |  |  |
|**order** | [**ServiceOrderReadModel**](ServiceOrderReadModel.md) |  |  |
|**useCase** | **UseCase** |  |  |



