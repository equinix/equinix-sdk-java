

# OrderItem

Order details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**drawCapacity** | **Double** | Maximum, combined power draw of all cabinets in your order, measured in kVA. Applicable values, in 0.5 increments, depend on the IBX data center. |  |
|**fabricPort** | **Boolean** | Indicates if a single, primary Fabric port should be included and delivered to one of the ordered cabinets. |  |
|**numberOfCabinets** | **Integer** | The number of ordered cabinets. |  |
|**cabinetDimensions** | [**Dimensions**](Dimensions.md) |  |  |
|**pdus** | **Boolean** | Indicates if an Equinix-recommended set of two PDUs, for single-phase circuit, per cabinet should be installed. |  |



