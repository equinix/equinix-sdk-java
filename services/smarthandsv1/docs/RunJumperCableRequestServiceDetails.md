

# RunJumperCableRequestServiceDetails

Move Jumper Cable Service Details Object. Please fill out the Media Type, Connector Type, Cable ID(optional), 'Should Equinix provide you Tx/Rx light levels, Yes Or No?', Devices to Connect details for Device#1 (Name/Panel, Device Slot, Device Ports) and Device#2(Optional) (Name/Panel, Device Slot, Device Ports) details for each jumper cable and attach it to the form or complete scope of work text box when 'Quantity' is greater than 1. If any device is being shipped to Equinix, please include the shipment number. You may mix jumper types but if you require more than 12 jumpers ran, the site will contact you for scheduling of your request based on parts and availability. Please select the best option for your scheduling needs. If ‘Quantity’ is 1, then ‘Jumper Type’, Media Type, Connector Type, 'Should Equinix provide you Tx/Rx light levels?' and Device details are mandatory.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quantity** | [**QuantityEnum**](#QuantityEnum) | Quantity. |  |
|**jumperType** | [**JumperTypeEnum**](#JumperTypeEnum) | Jumper Type |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | Media Type |  [optional] |
|**connector** | [**ConnectorEnum**](#ConnectorEnum) | Connector Type |  [optional] |
|**cableId** | **String** | Cable ID |  [optional] |
|**provideTxRxLightLevels** | **Boolean** | Provide Tx/Rx Light Levels |  [optional] |
|**deviceDetails** | [**List&lt;Device&gt;**](Device.md) |  |  [optional] |
|**scopeOfWork** | **String** | Enter any additional details that will help our technicians execute your request. You may also attach your scope of work as a document if you exceed the character limit in this field. |  |



## Enum: QuantityEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _2 | &quot;2&quot; |
| _3 | &quot;3&quot; |
| _4 | &quot;4&quot; |
| _5 | &quot;5&quot; |
| _6 | &quot;6&quot; |
| _7 | &quot;7&quot; |
| _8 | &quot;8&quot; |
| _9 | &quot;9&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _12 | &quot;12&quot; |
| _12_ | &quot;12+&quot; |



## Enum: JumperTypeEnum

| Name | Value |
|---- | -----|
| JUMPER | &quot;Jumper&quot; |
| PRE_WIRING | &quot;Pre-Wiring&quot; |
| PATCH_CABLE | &quot;Patch Cable&quot; |
| OTHER | &quot;Other&quot; |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| MULTI_MODE_62_5MIC | &quot;Multi-mode 62.5mic&quot; |
| MULTI_MODE_50MIC | &quot;Multi-mode 50mic&quot; |
| SINGLE_MODE | &quot;Single-mode&quot; |
| CAT_5 | &quot;Cat-5&quot; |
| CAT_6 | &quot;Cat-6&quot; |
| COAX | &quot;Coax&quot; |
| POTS | &quot;POTS&quot; |
| T1 | &quot;T1&quot; |
| E1 | &quot;E1&quot; |



## Enum: ConnectorEnum

| Name | Value |
|---- | -----|
| RJ45 | &quot;RJ45&quot; |
| SC | &quot;SC&quot; |
| LC | &quot;LC&quot; |
| BNC | &quot;BNC&quot; |
| OTHER | &quot;Other&quot; |



