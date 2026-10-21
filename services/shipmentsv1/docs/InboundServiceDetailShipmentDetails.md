

# InboundServiceDetailShipmentDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**noOfBoxes** | **Integer** | No of boxes |  |
|**isOverSized** | **Boolean** | if Box is oversized |  [optional] |
|**description** | **String** | description of inbound shipment |  [optional] |
|**trackingNumber** | **List&lt;String&gt;** | Tracking number |  [optional] |
|**inboundType** | [**InboundTypeEnum**](#InboundTypeEnum) | Inbound Type |  |
|**carrierName** | [**CarrierNameEnum**](#CarrierNameEnum) | Carrier Name of shipment |  [optional] |
|**otherCarrierName** | **String** | Other Carrier Name |  [optional] |



## Enum: InboundTypeEnum

| Name | Value |
|---- | -----|
| CARRIER | &quot;CARRIER&quot; |
| CUSTOMER_CARRY | &quot;CUSTOMER_CARRY&quot; |



## Enum: CarrierNameEnum

| Name | Value |
|---- | -----|
| FEDEX | &quot;FEDEX&quot; |
| DHL | &quot;DHL&quot; |
| UPS | &quot;UPS&quot; |
| OTHER | &quot;OTHER&quot; |



