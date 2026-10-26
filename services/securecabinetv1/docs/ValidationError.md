

# ValidationError

Error responses are included with 4xx and 5xx HTTP responses from the API service. Either \"error\" or \"errors\" will be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorCode** | **String** | Application error code. Format :EQ-&lt;error code&gt; |  |
|**errorMessage** | **String** | Application error message |  |
|**correlationId** | **String** | Correlation ID without any sensitive or meaningful information. |  [optional] |
|**details** | **String** | More information on errors. |  [optional] |
|**help** | **String** | Help message or URL to a help page for the corresponding errorCode. |  [optional] |
|**additionalInfo** | [**List&lt;ValidationErrorAdditionalInfo&gt;**](ValidationErrorAdditionalInfo.md) | Contains application specific information for this error. The object inside this array can have any number of application specific properties. |  [optional] |



