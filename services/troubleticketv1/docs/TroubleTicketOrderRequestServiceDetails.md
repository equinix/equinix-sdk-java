

# TroubleTicketOrderRequestServiceDetails

Use this object to pass all trouble related information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**incidentDateTime** | **OffsetDateTime** | Date and time of received event (ISO Date)&lt;br&gt; Cannot be in the future.  |  |
|**problemCode** | [**ProblemCodeEnum**](#ProblemCodeEnum) | Code matching the problem description. For more details see API /orders/troubleticket/types |  |
|**serviceName** | **String** | Subcategory for managed services. It will be a mandatory field for managed services trouble ticket |  [optional] |
|**callFromCage** | **Boolean** | Allow the technician to call from the cage. |  [optional] |
|**needSupportFromASubmarineCableStationEngineer** | **Boolean** | This flag is only applicable to Submarine Cable IBXs |  [optional] |
|**additionalDetails** | **String** | Use this field to enter any information that applies to this trouble ticket request. |  [optional] |



## Enum: ProblemCodeEnum

| Name | Value |
|---- | -----|
| CC01 | &quot;cc01&quot; |
| CC02 | &quot;cc02&quot; |
| CC03 | &quot;cc03&quot; |
| NET01 | &quot;net01&quot; |
| NET02 | &quot;net02&quot; |
| ENV01 | &quot;env01&quot; |
| ENV02 | &quot;env02&quot; |
| ENV03 | &quot;env03&quot; |
| ENV04 | &quot;env04&quot; |
| HDW01 | &quot;hdw01&quot; |
| PWR01 | &quot;pwr01&quot; |
| PWR02 | &quot;pwr02&quot; |
| SEC01 | &quot;sec01&quot; |
| SEC02 | &quot;sec02&quot; |
| MS01 | &quot;ms01&quot; |
| MS04 | &quot;ms04&quot; |
| MS05 | &quot;ms05&quot; |
| MS06 | &quot;ms06&quot; |
| MS07 | &quot;ms07&quot; |
| MS08 | &quot;ms08&quot; |
| MS12 | &quot;ms12&quot; |
| MS13 | &quot;ms13&quot; |
| SV04 | &quot;sv04&quot; |
| SV02 | &quot;sv02&quot; |
| SV03 | &quot;sv03&quot; |
| SV05 | &quot;sv05&quot; |
| SV01 | &quot;sv01&quot; |



