

# PortExpression

Either use 'and' for AND operations, 'or' for OR operations,  or specify 'property', 'operator', and 'values' for field filtering. Only one of these patterns should be used at a time. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**and** | [**List&lt;PortExpression&gt;**](PortExpression.md) |  |  [optional] |
|**or** | [**List&lt;PortExpression&gt;**](PortExpression.md) |  |  [optional] |
|**property** | **PortSearchFieldName** |  |  [optional] |
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
| ILIKE | &quot;ILIKE&quot; |
| IN | &quot;IN&quot; |
| NOT_IN | &quot;NOT IN&quot; |
| BETWEEN | &quot;BETWEEN&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



