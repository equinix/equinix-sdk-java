

# SearchFilterExpression

Filter expression that can be AND, OR, or a simple expression

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**and** | [**List&lt;SearchFilterExpression&gt;**](SearchFilterExpression.md) |  |  |
|**or** | [**List&lt;SearchFilterExpression&gt;**](SearchFilterExpression.md) |  |  |
|**property** | **String** |  |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  |
|**values** | **List&lt;String&gt;** |  |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;&#x3D;&quot; |
| NOT_EQUAL | &quot;!&#x3D;&quot; |
| IN | &quot;IN&quot; |
| NOT_IN | &quot;NOT IN&quot; |
| LIKE | &quot;LIKE&quot; |
| ILIKE | &quot;ILIKE&quot; |
| BETWEEN | &quot;BETWEEN&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |



