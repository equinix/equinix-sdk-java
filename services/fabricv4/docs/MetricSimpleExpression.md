

# MetricSimpleExpression


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/subject&#x60; - Metric subject description (required and limited to 1 value)  * &#x60;/name&#x60; - Metric names (required)  * &#x60;/dataPoints/endDateTime&#x60; - Time of Metrics  * &#x60;/time&#x60; - Time of Metrics  * &#x60;/interval&#x60; - ISO-8601 duration format to specify the interval of metrics data points  * &#x60;/value&#x60; - specific data points of the metric to return (e.g. &#39;last&#39; - for metros only)  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;&gt;&#x60; - greater than  * &#x60;&gt;&#x3D;&#x60; - greater than or equal to  * &#x60;&lt;&#x60; - less than  * &#x60;&lt;&#x3D;&#x60; - less than or equal to  * &#x60;BETWEEN&#x60; - between  * &#x60;IN&#x60; - in  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |



