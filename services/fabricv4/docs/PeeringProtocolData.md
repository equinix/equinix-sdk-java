

# PeeringProtocolData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | Peering Protocol URI |  [optional] |
|**uuid** | **UUID** | Peering protocol identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Peering Protocol Type |  [optional] |
|**name** | **String** | Protocol Name |  [optional] |
|**description** | **String** | Protocol Description |  [optional] |
|**customerAsn** | **Long** | Customer ASN |  [optional] |
|**equinixAsn** | **Long** | Equinix ASN |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Protocol State |  [optional] |
|**macAddress** | **String** | MAC Address of The Peering Protocol |  [optional] |
|**bgpIpv4** | [**PeeringConnectionResIpv4**](PeeringConnectionResIpv4.md) |  |  [optional] |
|**bgpIpv6** | [**PeeringConnectionResIpv6**](PeeringConnectionResIpv6.md) |  |  [optional] |
|**routeCollectors** | [**PeeringProtocolDataRouteCollectors**](PeeringProtocolDataRouteCollectors.md) |  |  [optional] |
|**changelog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| FAILED | &quot;FAILED&quot; |



