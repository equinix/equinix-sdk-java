

# CrossConnectActionResponseData

Action Data. <br> notes and attachments are applicable for XC_INFORMATION_UPDATE and XC_DEINSTALL. <br> schedule, services, liveTrafficConsentProvided, notifications and order are applicable for XC_DEINSTALL. <br> Each schedule, service, note and attachment carries the href and the uuid of the sub-resource it refers to. <br> Not applicable to the other action types. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notes** | [**List&lt;CrossConnectActionNoteResponse&gt;**](CrossConnectActionNoteResponse.md) | Applicable for XC_INFORMATION_UPDATE and XC_DEINSTALL. |  [optional] [readonly] |
|**attachments** | [**List&lt;CrossConnectActionAttachmentResponse&gt;**](CrossConnectActionAttachmentResponse.md) | Applicable for XC_INFORMATION_UPDATE and XC_DEINSTALL. |  [optional] [readonly] |
|**schedule** | [**CrossConnectScheduleResponse**](CrossConnectScheduleResponse.md) | Applicable for XC_DEINSTALL. |  [optional] [readonly] |
|**liveTrafficConsentProvided** | **Boolean** | Applicable for XC_DEINSTALL. Confirms the customer consents to the removal even though the Cross Connect may still be carrying live traffic.  |  [optional] [readonly] |
|**services** | [**List&lt;CrossConnectServiceResponse&gt;**](CrossConnectServiceResponse.md) | Applicable for XC_DEINSTALL. Only XC_PATCH_EQUIPMENT is supported for deinstall.  |  [optional] [readonly] |
|**notifications** | [**List&lt;CrossConnectNotification&gt;**](CrossConnectNotification.md) | Applicable for XC_DEINSTALL. The contacts are appended to the ones already held on the Cross Connect.  |  [optional] [readonly] |
|**order** | [**OrderResponse**](OrderResponse.md) | Applicable for XC_DEINSTALL. The purchase order and the customer reference identifier replace the ones already held on the Cross Connect.  |  [optional] [readonly] |



