

# DowntimeNotification

Details of a downtime notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notificationType** | [**NotificationTypeEnum**](#NotificationTypeEnum) | Type of notification, whether planned or unplanned. |  [optional] |
|**startDateTime** | **OffsetDateTime** | Start of the downtime. |  [optional] |
|**endDateTime** | **OffsetDateTime** | End of the downtime. |  [optional] |
|**impactedServices** | [**List&lt;ImpactedServices&gt;**](ImpactedServices.md) | An array of services impacted by the downtime. |  [optional] |
|**additionalMessage** | **String** | Any additional messages. |  [optional] |



## Enum: NotificationTypeEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;PLANNED&quot; |
| UNPLANNED | &quot;UNPLANNED&quot; |



