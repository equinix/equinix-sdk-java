

# VirtualDeviceInternalPatchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**core** | **Integer** | Use this field to resize your device. When you call this API for device resizing, you cannot change other fields simultaneously. |  [optional] |
|**notifications** | **List&lt;String&gt;** |  |  [optional] |
|**termLength** | **String** | Term length in months. |  [optional] |
|**termLengthEffectiveImmediate** | **Boolean** | By default, this field is true. Set it to false if you want to change the term length at the end of the current term. You cannot downgrade the term length before the end of your current term. |  [optional] |
|**virtualDeviceName** | **String** | Virtual device name. This should be a minimum of 3 and a maximum of 50 characters. |  [optional] |
|**clusterName** | **String** | Cluster name. This should be a minimum of 3 and a maximum of 50 characters. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the device. Use this field to update the license status of a device. |  [optional] |
|**autoRenewalOptOut** | **Boolean** | By default, the autoRenewalOptOut field is false. Set it to true if you do not want to automatically renew your terms. Your device will move to a monthly cycle at the expiration of the current terms. |  [optional] |
|**vendorConfig** | [**VirtualDeviceInternalPatchRequestVendorConfig**](VirtualDeviceInternalPatchRequestVendorConfig.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| FAILED | &quot;FAILED&quot; |



