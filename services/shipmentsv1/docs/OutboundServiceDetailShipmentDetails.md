

# OutboundServiceDetailShipmentDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**outboundType** | [**OutboundTypeEnum**](#OutboundTypeEnum) | Outbound Type |  |
|**carrierName** | [**CarrierNameEnum**](#CarrierNameEnum) |  |  [optional] |
|**trackingNumber** | **String** |  |  [optional] |
|**noOfBoxes** | **Integer** |  |  [optional] |
|**declaredValue** | **String** |  |  [optional] |
|**labelExists** | **Boolean** |  |  [optional] |
|**shipToAddress** | [**OutboundServiceDetailShipmentDetailsShipToAddress**](OutboundServiceDetailShipmentDetailsShipToAddress.md) |  |  [optional] |
|**otherCarrierName** | **String** |  |  [optional] |
|**uploadedLabel** | [**Attachment**](Attachment.md) |  |  [optional] |
|**insureShipment** | **Boolean** |  |  [optional] |
|**pickUpFromCageSuite** | **Boolean** |  |  [optional] |
|**description** | **String** |  |  [optional] |



## Enum: OutboundTypeEnum

| Name | Value |
|---- | -----|
| CARRIER | &quot;CARRIER&quot; |
| CUSTOMER_CARRY | &quot;CUSTOMER_CARRY&quot; |



## Enum: CarrierNameEnum

| Name | Value |
|---- | -----|
| UPS | &quot;UPS&quot; |
| FEDEX | &quot;FEDEX&quot; |
| DHL | &quot;DHL&quot; |
| OTHER | &quot;OTHER&quot; |



