

# CloudRouterRouteFilterExpression

Filter expression that can be AND, OR, or a simple expression

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**and** | [**List&lt;CloudRouterRouteFilterExpression&gt;**](CloudRouterRouteFilterExpression.md) |  |  [optional] |
|**or** | [**List&lt;CloudRouterRouteFilterExpression&gt;**](CloudRouterRouteFilterExpression.md) |  |  [optional] |
|**property** | [**PropertyEnum**](#PropertyEnum) |  |  [optional] |
|**operator** | **String** |  |  [optional] |
|**values** | **List&lt;String&gt;** |  |  [optional] |



## Enum: PropertyEnum

| Name | Value |
|---- | -----|
| TYPE | &quot;/type&quot; |
| DIRECTION | &quot;/direction&quot; |
| ATTACHMENTSTATUS | &quot;/attachmentStatus&quot; |
| CHANGELOG_CREATEDDATETIME | &quot;/changeLog/createdDateTime&quot; |
| CHANGELOG_UPDATEDDATETIME | &quot;/changeLog/updatedDateTime&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



