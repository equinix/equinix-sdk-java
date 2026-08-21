

# StreamAssetFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | **String** | Possible field names to use on filters:  * &#x60;/uuid&#x60; - Asset uuid (&#x60;&#x3D;&#x60; and &#x60;IN&#x60; only)  * &#x60;/streamUuid&#x60; - Stream uuid (&#x60;&#x3D;&#x60; and &#x60;IN&#x60; only)  * &#x60;/attachmentStatus&#x60; - Asset attachment status (&#x60;&#x3D;&#x60;, &#x60;IN&#x60;, and &#x60;NOT IN&#x60;)  |  [optional] |
|**operator** | **String** | Possible operators to use on filters:  * &#x60;&#x3D;&#x60; - equal  * &#x60;IN&#x60; - in  * &#x60;NOT IN&#x60; - not in  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |
|**or** | [**List&lt;StreamAssetSimpleExpression&gt;**](StreamAssetSimpleExpression.md) |  |  [optional] |



