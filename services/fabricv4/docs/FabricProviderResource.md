

# FabricProviderResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**name** | **String** |  |  [optional] |
|**uuid** | **UUID** | Equinix-assigned route protocol identifier |  [optional] |
|**location** | [**SimplifiedLocationWithoutIBX**](SimplifiedLocationWithoutIBX.md) |  |  [optional] |
|**_package** | [**CloudRouterPostRequestPackage**](CloudRouterPostRequestPackage.md) |  |  [optional] |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |
|**bandwidth** | **Integer** |  |  |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**bgpIpv4** | [**FabricBGPConnectionIpv4**](FabricBGPConnectionIpv4.md) |  |  |
|**customerAsn** | **Long** | Customer asn |  |
|**bgpAuthKey** | **String** | BGP authorization key |  |
|**asOverrideEnabled** | **Boolean** | Enable AS number override |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_ROUTER | &quot;XF_ROUTER&quot; |
| IP_VC | &quot;IP_VC&quot; |
| BGP | &quot;BGP&quot; |



