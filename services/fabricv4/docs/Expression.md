

# Expression


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**and** | [**List&lt;Expression&gt;**](Expression.md) |  |  [optional] |
|**or** | [**List&lt;Expression&gt;**](Expression.md) |  |  [optional] |
|**property** | **SearchFieldName** |  |  [optional] |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;&#x3D;&quot; |
| NOT_EQUAL | &quot;!&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| LIKE | &quot;LIKE&quot; |
| IS_NOT_NULL | &quot;IS NOT NULL&quot; |
| IS_NULL | &quot;IS NULL&quot; |



