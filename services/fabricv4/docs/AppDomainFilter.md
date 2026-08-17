

# AppDomainFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:   * &#x60;/project/projectId&#x60; - project id   * &#x60;/uuid&#x60; - App Domain uuid   * &#x60;/name&#x60; - App Domain name   * &#x60;/description&#x60; - App Domain description   * &#x60;/state&#x60; - App Domain status   * &#x60;/changeLog/createdDateTime&#x60; - App Domain creation timestamp   * &#x60;/changeLog/updatedDateTime&#x60; - App Domain last updated timestamp   * &#x60;/changeLog/deletedDateTime&#x60; - App Domain deletion timestamp  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:   * &#x60;&#x3D;&#x60; - equal   * &#x60;!&#x3D;&#x60; - not equal   * &#x60;&gt;&#x60; - greater than   * &#x60;&lt;&#x60; - less than   * &#x60;IN&#x60; - in   * &#x60;NOT IN&#x60; - not in   * &#x60;LIKE&#x60; - like   * &#x60;ILIKE&#x60; - case-insensitive like   * &#x60;BETWEEN&#x60; - between   * &#x60;NOT BETWEEN&#x60; - not between  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |
|**or** | [**List&lt;AppDomainSimpleExpression&gt;**](AppDomainSimpleExpression.md) |  |  [optional] |



