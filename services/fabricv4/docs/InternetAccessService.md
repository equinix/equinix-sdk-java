

# InternetAccessService


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Service URL path |  |
|**type** | **InternetAccessServiceType** |  |  |
|**uuid** | **UUID** | Unique identifier for the EIA Service |  |
|**name** | **String** | The name of the EIA Service |  |
|**bandwidth** | **Integer** | Bandwidth of the service |  [optional] |
|**bandwidthCommit** | **Integer** | Minimum bandwidth commit for burst billing variant of the service |  [optional] |
|**state** | **InternetAccessServiceState** |  |  |
|**change** | [**InternetAccessChange**](InternetAccessChange.md) |  |  |
|**locations** | [**List&lt;InternetAccessLocation&gt;**](InternetAccessLocation.md) | List of locations associated with the service |  [optional] |
|**routingProtocol** | [**InternetAccessRoutingProtocol**](InternetAccessRoutingProtocol.md) |  |  |
|**billing** | [**InternetAccessBilling**](InternetAccessBilling.md) |  |  |
|**account** | [**InternetAccessAccount**](InternetAccessAccount.md) |  |  |
|**project** | [**Project**](Project.md) |  |  |
|**order** | [**InternetAccessOrder**](InternetAccessOrder.md) |  |  |
|**changeLog** | [**Changelog**](Changelog.md) |  |  |
|**useCase** | **InternetAccessUseCase** |  |  |



