

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
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| LIKE | &quot;LIKE&quot; |
| ILKE | &quot;ILKE&quot; |
| IS_NOT_NULL | &quot;IS NOT NULL&quot; |
| IS_NULL | &quot;IS NULL&quot; |
| IN | &quot;IN&quot; |
| BETWEEN | &quot;BETWEEN&quot; |



