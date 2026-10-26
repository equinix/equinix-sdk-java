

# DeleteCrossConnect

Delete Cross Connect request. Carries the removal schedule together with the notification and order details to apply to the removal order. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schedule** | [**DeinstallScheduleRequest**](DeinstallScheduleRequest.md) | Removal schedule. The requestedDateTime is mandatory. Only the STANDARD schedule type is supported for a removal.  |  |
|**notifications** | [**List&lt;CrossConnectNotification&gt;**](CrossConnectNotification.md) | Optional. The contacts are appended to the ones already held on the Cross Connect.  |  [optional] |
|**order** | [**OrderRequest**](OrderRequest.md) | Optional. The purchase order and the customer reference identifier replace the ones already held on the Cross Connect.  |  [optional] |



