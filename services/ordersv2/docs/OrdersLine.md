

# OrdersLine

Orders Line contains information appplicable for all the orders type i.e smart hands, work visit and cross connect

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lineId** | **String** | Unique identifier associated with line item.  |  [optional] |
|**parentlineId** | **String** | Unique identifier associated with &#x60;lineId&#x60;to denote hierarchy of the product. When this field is null, item considered to be at root level. |  [optional] |
|**rootlineId** | **String** | Unique identifier to specify root item. Useful when product order hierarchy exceeds 2. |  [optional] |
|**status** | **String** | The current status of the order or service |  [optional] |
|**description** | **String** | Description of the orders. |  [optional] |
|**billingStartDateTime** | **String** | Billing commencement date and time in UTC provided in the RFC3339 format with timezone markers omitted, delimitting date and time with a space, e.g. 2024-12-31 23:59:59 |  [optional] |
|**estimatedCompletionDateTime** | **OffsetDateTime** | The estimated completion date and time in UTC timezone |  [optional] |
|**unitPricing** | [**List&lt;Price&gt;**](Price.md) | Unit Pricing details |  [optional] |
|**totalPricing** | [**List&lt;Price&gt;**](Price.md) | Total Pricing details |  [optional] |
|**productType** | **String** | Type of product. Known values include: CROSS_CONNECT, SMART_HANDS, WORK_VISIT, SECURITY_ACCESS, CONFERENCE_ROOM, TROUBLE_TICKET, SHIPMENTS, NETWORK_PORTS, DEINSTALL_CROSS_CONNECT, Equinix Fabric Port/Connection, OTHER |  [optional] |
|**productCode** | **String** | Product code associated with a particular product |  [optional] |
|**productName** | **String** | Product name |  [optional] |
|**ibx** | **String** | Location code of Equinix datacenter |  [optional] |
|**cage** | **String** | Cage ID |  [optional] |
|**cabinets** | **List&lt;String&gt;** | One or more cabinets ID |  [optional] |
|**requestType** | [**RequestTypeEnum**](#RequestTypeEnum) | Type of order request. ie &#x60;requestType&#x60; can be of &#x60;ADD&#x60; if you are adding new services/product. |  [optional] |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) | File(s) attached to the Orders. To learn about including attachments in your request, see POST Attachments API. |  [optional] |
|**additionalInfo** | [**List&lt;ProductAdditionalInfoInner&gt;**](ProductAdditionalInfoInner.md) | This section is reserved to display product specific information |  [optional] |
|**purchaseOrder** | [**PurchaseOrder**](PurchaseOrder.md) |  |  [optional] |
|**cancellable** | **Boolean** | When &#x60;true&#x60;, order can be cancelled |  [optional] |
|**modifiable** | **Boolean** | When &#x60;true&#x60;, order can be modified |  [optional] |



## Enum: RequestTypeEnum

| Name | Value |
|---- | -----|
| ADD | &quot;ADD&quot; |
| DELETE | &quot;DELETE&quot; |
| NO_CHANGE | &quot;NO_CHANGE&quot; |
| UPDATE | &quot;UPDATE&quot; |



