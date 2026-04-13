

# RouteAggregationRuleSimpleExpression

Simple filter expression with property, operator, and values

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/type&#x60; - Route Aggregation Rules Type  * &#x60;/name&#x60; - Route Aggregation Rules Name  * &#x60;/uuid&#x60; - Route Aggregation Rules uuid  * &#x60;/state&#x60; - Route Aggregation Rules status  * &#x60;/prefix&#x60; - Route Aggregation Rule Prefix  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;!&#x3D;&#x60; - not equal  * &#x60;[NOT] LIKE&#x60; - (not) like  * &#x60;[NOT] IN&#x60; - (not) in  * &#x60;ILIKE&#x60; - case-insensitive like  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |



