

# CloudRouterFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/project/projectId&#x60; - project id (mandatory)  * &#x60;/name&#x60; - Fabric Cloud Router name  * &#x60;/uuid&#x60; - Fabric Cloud Router uuid  * &#x60;/state&#x60; - Fabric Cloud Router status  * &#x60;/location/metroCode&#x60; - Fabric Cloud Router metro code  * &#x60;/location/metroName&#x60; - Fabric Cloud Router metro name  * &#x60;/package/code&#x60; - Fabric Cloud Router package  * &#x60;/type&#x60; - Fabric Cloud Router type  * &#x60;/connectionsCount&#x60; - Fabric Cloud Router attached connections count  * &#x60;/changeLog/createdDateTime&#x60; - Fabric Cloud Router creation timestamp  * &#x60;/changeLog/updatedDateTime&#x60; - Fabric Cloud Router last updated timestamp  * &#x60;/changeLog/deletedDateTime&#x60; - Fabric Cloud Router deletion timestamp  * &#x60;/_*&#x60; - all-category search  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;!&#x3D;&#x60; - not equal  * &#x60;&gt;&#x60; - greater than  * &#x60;&gt;&#x3D;&#x60; - greater than or equal to  * &#x60;&lt;&#x60; - less than  * &#x60;&lt;&#x3D;&#x60; - less than or equal to  * &#x60;[NOT] BETWEEN&#x60; - (not) between  * &#x60;[NOT] LIKE&#x60; - (not) like  * &#x60;[NOT] IN&#x60; - (not) in  * &#x60;ILIKE&#x60; - case-insensitive like  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |
|**or** | [**List&lt;CloudRouterSimpleExpression&gt;**](CloudRouterSimpleExpression.md) |  |  [optional] |



