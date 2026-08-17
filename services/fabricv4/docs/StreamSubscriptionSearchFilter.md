

# StreamSubscriptionSearchFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/uuid&#x60; - Subscription uuid  * &#x60;/streamUuid&#x60; - Stream uuid the subscription belongs to  * &#x60;/state&#x60; - Subscription state (&#x60;DEPROVISIONED&#x60; returned only when explicitly requested)  * &#x60;/name&#x60; - Subscription name  * &#x60;/project/projectId&#x60; - Subscription project id  * &#x60;/description&#x60; - Subscription description  * &#x60;/changeLog/createdDateTime&#x60; - Subscription created date time  * &#x60;/changeLog/updatedDateTime&#x60; - Subscription updated date time  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;!&#x3D;&#x60; - not equal  * &#x60;&gt;&#x60; - greater than  * &#x60;&gt;&#x3D;&#x60; - greater than or equal to  * &#x60;&lt;&#x60; - less than  * &#x60;&lt;&#x3D;&#x60; - less than or equal to  * &#x60;BETWEEN&#x60; - between  * &#x60;NOT BETWEEN&#x60; - not between  * &#x60;LIKE&#x60; - like  * &#x60;ILIKE&#x60; - like case-insensitive  * &#x60;IN&#x60; - in  * &#x60;NOT IN&#x60; - not in  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |
|**or** | [**List&lt;StreamSubscriptionSearchSimpleExpression&gt;**](StreamSubscriptionSearchSimpleExpression.md) |  |  [optional] |



