

# FabricProviderResourceResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | IPWAN Connection URI |  [optional] [readonly] |
|**type** | **String** |  |  |
|**uuid** | **String** | Equinix-assigned ipwan connection identifier |  [optional] |
|**state** | **DeploymentState** |  |  |
|**name** | **String** |  |  |
|**location** | [**SimplifiedLocation**](SimplifiedLocation.md) |  |  |
|**_package** | [**CloudRouterPostRequestPackage**](CloudRouterPostRequestPackage.md) |  |  |
|**deploymentProperties** | [**TopologyProperties**](TopologyProperties.md) |  |  |
|**bandwidth** | **Integer** |  |  |
|**redundancy** | [**ConnectionRedundancy**](ConnectionRedundancy.md) |  |  |
|**aSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**zSide** | [**ConnectionSide**](ConnectionSide.md) |  |  |
|**bgpIpv4** | [**FabricBGPConnectionIpv4**](FabricBGPConnectionIpv4.md) |  |  |
|**customerAsn** | **Long** | Customer asn |  |
|**bgpAuthKey** | **String** | BGP authorization key |  |
|**asOverrideEnabled** | **Boolean** | Enable AS number override |  [optional] |
|**scope** | **NetworkScope** |  |  [optional] |



