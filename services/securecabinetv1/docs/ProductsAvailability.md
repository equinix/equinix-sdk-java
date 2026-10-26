

# ProductsAvailability

Information about availability of products in one ibx. Missing pdu configuration means that we don't offer pdu there. Missing fabric port speed means that fabric port is not available there. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ibx** | **String** | IBX data center identifier. |  |
|**maximumNumberOfCabinetsToOrder** | **Integer** | Maximum number of cabinets that can be ordered in one order in this ibx. |  |
|**minimumDrawCapacityPerCabinet** | **Double** | The minimum power draw capacity per ordered cabinet. |  |
|**maximumDrawCapacityPerCabinet** | **Double** | The maximum power draw capacity per ordered cabinet. |  |
|**cabinetDimensions** | [**Dimensions**](Dimensions.md) |  |  |
|**acCircuitConfiguration** | [**AcCircuitConfig**](AcCircuitConfig.md) |  |  |
|**pduConfiguration** | [**PduConfig**](PduConfig.md) |  |  [optional] |
|**fabricPortSpeed** | **FabricPortSpeed** |  |  [optional] |



