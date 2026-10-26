

# CrossConnectZSideRequest

Z-Side connection details. Provide the demarcationPoint for a patch panel to patch panel Cross Connect, or location when connecting to a BMMR. loa is mandatory for a Cross Connect with LOA and when bmmrType is EQUINIX - provide either loa.uuid or loa.digitalLoaId. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**demarcationPoint** | [**CrossConnectZSideRequestDemarcationPoint**](CrossConnectZSideRequestDemarcationPoint.md) | Required for a patch panel to patch panel Cross Connect. |  [optional] |
|**location** | [**CrossConnectLocation**](CrossConnectLocation.md) | Required when connecting to a BMMR. |  [optional] |
|**loa** | [**CrossConnectLoaRef**](CrossConnectLoaRef.md) | Required for a Cross Connect with LOA and when bmmrType is EQUINIX. |  [optional] |



