

# MoveJumperCableRequestServiceDetails

Move Jumper Cable Service Details Object. Please fill out the Cable ID, Current Device (Name, Slot, Port) and New Device (Name, Slot, Port) details for each jumper cable and attach it to the form or complete scope of work text box when 'Quantity' is greater than 1. You may mix jumper types but if you require more than 12 jumpers ran, the site will contact you for scheduling of your request based on parts and availability. Please select the best option for your scheduling needs. If 'Quantity' is 1, then below 'currentDeviceDetails' and 'newDeviceDetails' objects are mandatory.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quantity** | [**QuantityEnum**](#QuantityEnum) | Quantity. |  |
|**cableId** | **String** | Enter Cable ID or ‘None’ if not applicable. This field is mandatory if &#39;Quantity&#39; is 1. |  [optional] |
|**currentDeviceDetails** | [**Device**](Device.md) |  |  [optional] |
|**newDeviceDetails** | [**Device**](Device.md) |  |  [optional] |
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



