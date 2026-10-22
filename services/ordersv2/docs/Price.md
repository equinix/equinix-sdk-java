

# Price

Pricing details for a particular service or order, This can be one time charge or recurring charge

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **BigDecimal** | To be used with &#x60;valueType&#x60; and &#x60;type&#x60;. Can be used to denote price or discount for an order or service |  [optional] |
|**valueType** | [**ValueTypeEnum**](#ValueTypeEnum) | To indicate if &#x60;value&#x60; is of absolute or percentage value. i.e Use ABSOLUTE for $50 or PERCENTAGE for 50% |  [optional] |
|**type** | **String** | To indicate the type of &#x60;value&#x60; and &#x60;valueType&#x60;. Known values include: ONE_TIME_CHARGE, MONTHLY_CHARGE, MONTHLY_DISCOUNT, ONE_TIME_DISCOUNT, NET_MONTHLY_CHARGE, NET_ONE_TIME_CHARGE |  [optional] |



## Enum: ValueTypeEnum

| Name | Value |
|---- | -----|
| ABSOLUTE | &quot;ABSOLUTE&quot; |
| PERCENTAGE | &quot;PERCENTAGE&quot; |



