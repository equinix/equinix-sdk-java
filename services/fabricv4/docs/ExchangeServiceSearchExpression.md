

# ExchangeServiceSearchExpression


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**and** | [**List&lt;ExchangeServiceSearchExpression&gt;**](ExchangeServiceSearchExpression.md) |  |  |
|**or** | [**List&lt;ExchangeServiceSearchExpression&gt;**](ExchangeServiceSearchExpression.md) |  |  |
|**property** | [**PropertyEnum**](#PropertyEnum) | Possible field names to use on filters |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) |  |  |
|**values** | **List&lt;String&gt;** |  |  |



## Enum: PropertyEnum

| Name | Value |
|---- | -----|
| PROJECT_PROJECTID | &quot;/project/projectId&quot; |
| UUID | &quot;/uuid&quot; |
| STATE | &quot;/state&quot; |
| NAME | &quot;/name&quot; |
| BANDWIDTH | &quot;/bandwidth&quot; |
| CHANGELOG_CREATEDDATETIME | &quot;/changelog/createdDateTime&quot; |
| CHANGELOG_UPDATEDDATETIME | &quot;/changelog/updatedDateTime&quot; |
| CHANGELOG_DELETEDDATETIME | &quot;/changelog/deletedDateTime&quot; |
| LOCATION_METROCODE | &quot;/location/metroCode&quot; |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| EQUAL | &quot;&#x3D;&quot; |
| NOT_EQUAL | &quot;!&#x3D;&quot; |
| BETWEEN | &quot;BETWEEN&quot; |
| LESS_THAN | &quot;&lt;&quot; |
| LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot; |
| GREATER_THAN | &quot;&gt;&quot; |
| GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot; |
| LIKE | &quot;LIKE&quot; |
| ILIKE | &quot;ILIKE&quot; |
| IN | &quot;IN&quot; |



