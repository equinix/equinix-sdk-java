

# CrossConnectActionData

Action Data. <br> notes and attachments are applicable for XC_INFORMATION_UPDATE and XC_DEINSTALL. <br> schedule is required for XC_DEINSTALL, where liveTrafficConsentProvided, services, notifications and order are applicable. <br> Not applicable to the other action types. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notes** | [**List&lt;CrossConnectActionNote&gt;**](CrossConnectActionNote.md) | Applicable for XC_INFORMATION_UPDATE and XC_DEINSTALL. |  [optional] |
|**attachments** | [**List&lt;CrossConnectAttachment&gt;**](CrossConnectAttachment.md) | Applicable for XC_INFORMATION_UPDATE and XC_DEINSTALL. |  [optional] |
|**schedule** | [**DeinstallScheduleRequest**](DeinstallScheduleRequest.md) | Removal schedule. Required for XC_DEINSTALL - the requestedDateTime is mandatory and only the STANDARD schedule type is supported.  |  [optional] |
|**liveTrafficConsentProvided** | **Boolean** | Applicable for XC_DEINSTALL. Confirms the customer consents to the removal even though the Cross Connect may still be carrying live traffic.  |  [optional] |
|**services** | [**List&lt;CrossConnectServiceRequest&gt;**](CrossConnectServiceRequest.md) | Applicable for XC_DEINSTALL. Only XC_PATCH_EQUIPMENT is supported for deinstall.  |  [optional] |
|**notifications** | [**List&lt;CrossConnectNotification&gt;**](CrossConnectNotification.md) | Applicable for XC_DEINSTALL. The contacts are appended to the ones already held on the Cross Connect.  |  [optional] |
|**order** | [**OrderRequest**](OrderRequest.md) | Applicable for XC_DEINSTALL. The purchase order and the customer reference identifier replace the ones already held on the Cross Connect.  |  [optional] |



