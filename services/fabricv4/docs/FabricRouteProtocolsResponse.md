

# FabricRouteProtocolsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Routing protocol type |  |
|**name** | **String** |  |  [optional] |
|**uuid** | **String** | Equinix-assigned route protocol identifier |  [optional] |
|**bgpIpv4** | [**FabricBGPConnectionIpv4**](FabricBGPConnectionIpv4.md) |  |  |
|**customerAsn** | **Long** | Customer asn |  |
|**bgpAuthKey** | **String** | BGP authorization key |  |
|**asOverrideEnabled** | **Boolean** | Enable AS number override |  [optional] |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  [optional] |
|**href** | **URI** | Route Protocol URI |  [optional] [readonly] |
|**state** | **DeploymentState** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BGP | &quot;BGP&quot; |



