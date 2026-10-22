

# Filters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ibxs** | **List&lt;String&gt;** | ibxs filter |  [optional] |
|**productTypes** | **List&lt;ProductTypesEnum&gt;** | Product(order type) filter |  [optional] |
|**orderStatus** | **List&lt;OrderHeaderStatusEnum&gt;** | order status filter |  [optional] |
|**dateRange** | [**DateRangeEnum**](#DateRangeEnum) | Date range filter |  [optional] |
|**fromDate** | **LocalDate** | Date Format Should be mm/dd/yyyy.&lt;br/&gt; Not applicable when dateRange is provided. |  [optional] |
|**toDate** | **LocalDate** | Date Format Should be mm/dd/yyyy.&lt;br/&gt; Not applicable when dateRange is provided |  [optional] |



## Enum: DateRangeEnum

| Name | Value |
|---- | -----|
| _7_DAYS | &quot;PAST_7_DAYS&quot; |
| _14_DAYS | &quot;PAST_14_DAYS&quot; |
| _30_DAYS | &quot;PAST_30_DAYS&quot; |
| _3_MONTHS | &quot;PAST_3_MONTHS&quot; |
| _6_MONTHS | &quot;PAST_6_MONTHS&quot; |
| YEAR | &quot;PAST_YEAR&quot; |



