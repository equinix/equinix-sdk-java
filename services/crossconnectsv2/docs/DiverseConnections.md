

# DiverseConnections

Diversified cross connect or redundant cross connect for the availability. If its a new redundant connection, A-Side and Z-Side is mandatory. If it is existing connection, Cross Connect serial number and type is mandatory.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Redundant connection with existing connections or new connections |  [optional] |
|**serialNumber** | **String** | The serial number of Cross Connect is expecting when Diversified connection required from a previously provisioned connection |  [optional] |
|**aSide** | [**DiverseConnectionsASide**](DiverseConnectionsASide.md) |  |  [optional] |
|**zSide** | [**DiverseConnectionsZSide**](DiverseConnectionsZSide.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NEW | &quot;NEW&quot; |
| EXISTING | &quot;EXISTING&quot; |



