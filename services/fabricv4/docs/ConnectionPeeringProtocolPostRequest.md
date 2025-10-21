

# ConnectionPeeringProtocolPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Peering protocol type |  |
|**name** | **String** | Customer-provided peering protocol name |  |
|**description** | **String** | Customer-provided peering protocol description |  |
|**customerAsn** | **Long** | Customer ASN |  |
|**macAddress** | **String** | MAC address of the peering protocol |  |
|**bgpIpv4** | [**PeeringConnectionIpv4**](PeeringConnectionIpv4.md) |  |  |
|**bgpIpv6** | [**PeeringConnectionIpv6**](PeeringConnectionIpv6.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |



