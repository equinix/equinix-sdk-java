

# Orderhistoryapirequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**Filters**](Filters.md) |  |  [optional] |
|**source** | [**List&lt;SourceEnum&gt;**](#List&lt;SourceEnum&gt;) | &lt;b&gt;ORDER_NUMBER:&lt;/b&gt; Search by order number(1-123456789).&lt;br&gt;&lt;b&gt;CUSTOMER_REFERENCE_NUMBER:&lt;/b&gt; Search by customer reference number which was entered as part place order.&lt;br&gt;&lt;b&gt;TROUBLE_TICKET_NUMBER:&lt;/b&gt; Search by trouble ticket numnber(5-123456).&lt;br&gt;&lt;b&gt;WORK_ACTIVITY_NUMBER:&lt;/b&gt; Search by work order activity number(3-123456).  |  [optional] |
|**q** | **String** | Query value to be queried against source values(Or operation against all sources).&lt;br/&gt;Supports partial text search |  [optional] |
|**sorts** | [**List&lt;Sort&gt;**](Sort.md) |  |  [optional] |
|**page** | [**PageRequestModel**](PageRequestModel.md) |  |  [optional] |



## Enum: List&lt;SourceEnum&gt;

| Name | Value |
|---- | -----|
| ORDER_NUMBER | &quot;ORDER_NUMBER&quot; |
| PO_NUMBER | &quot;PO_NUMBER&quot; |
| CUSTOMER_REFERENCE_NUMBER | &quot;CUSTOMER_REFERENCE_NUMBER&quot; |
| CONTACT_LAST_NAME | &quot;CONTACT_LAST_NAME&quot; |
| SR_NUMBER | &quot;SR_NUMBER&quot; |
| TROUBLE_TICKET_NUMBER | &quot;TROUBLE_TICKET_NUMBER&quot; |
| WORK_ACTIVITY_NUMBER | &quot;WORK_ACTIVITY_NUMBER&quot; |



