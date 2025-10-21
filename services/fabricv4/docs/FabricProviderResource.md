

# FabricProviderResource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |  |  |
|**name** | **String** |  |  |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  [optional] |
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
|**scope** | **NetworkScope** |  |  |



