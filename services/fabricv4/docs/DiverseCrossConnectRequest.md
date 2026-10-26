

# DiverseCrossConnectRequest

Request to create several Cross Connects in a single order. Use it to order a diverse pair - one PRIMARY and one SECONDARY entry provisioned at the same time on separate paths - or to order multiple Cross Connects at once by sending one entry per Cross Connect. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**List&lt;CreateCrossConnect&gt;**](CreateCrossConnect.md) | For a diverse pair, send two entries - one with redundancy.priority PRIMARY and one with SECONDARY - and omit redundancy.group, which Equinix assigns.  |  |



