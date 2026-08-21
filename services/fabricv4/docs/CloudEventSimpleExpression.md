

# CloudEventSimpleExpression


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/id&#x60; - Cloud Event identifier  * &#x60;/subject&#x60; - Cloud Event subject description  * &#x60;/type&#x60; - Cloud Event type  * &#x60;/time&#x60; - Time of Cloud Events  * &#x60;/equinixproject&#x60; - Equinix Project of Cloud Events  * &#x60;/equinixorganization&#x60; - Equinix Organization of Cloud Events  * &#x60;/equinixalert&#x60; - Equinix Alert Identifier for raise/clear Cloud Events  * &#x60;/severitytext&#x60; - cloud event severity text  * &#x60;/authid&#x60; - Equinix user key to identify the user that performed the action that triggered the Cloud Event  * &#x60;/authtype&#x60; - Equinix user type either user or system  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;!&#x3D;&#x60; - not equal  * &#x60;&gt;&#x60; - greater than  * &#x60;&gt;&#x3D;&#x60; - greater than or equal to  * &#x60;&lt;&#x60; - less than  * &#x60;&lt;&#x3D;&#x60; - less than or equal to  * &#x60;BETWEEN&#x60; - between  * &#x60;IN&#x60; - in  * &#x60;LIKE&#x60; - like  * &#x60;ILIKE&#x60; - like case-insensitive  * &#x60;IS NULL&#x60; - is null  * &#x60;IS NOT NULL&#x60; - is not null  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |



