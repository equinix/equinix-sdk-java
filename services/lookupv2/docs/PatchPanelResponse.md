

# PatchPanelResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patchPanelId** | **String** | Patch panel unique ID / serial number |  [optional] |
|**availablePortCount** | **BigDecimal** | Available ports for use |  [optional] |
|**patchPanelReferenceId** | **String** | Unique reference ID associated with patch panel |  [optional] |
|**ifcEnabled** | **Boolean** | Patch panel will support only intra facility when &#x60;true&#x60; |  [optional] |
|**provisioningType** | [**ProvisioningTypeEnum**](#ProvisioningTypeEnum) | If &#x60;REGULAR&#x60;, order will be provisioned as per standard lead time. If &#x60;FAST_PROVISIONING&#x60;, order is typically provisioned in 30min through the support of fast provisioning scheduling. However, service may be delayed due to system maintenance |  [optional] |



## Enum: ProvisioningTypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;REGULAR&quot; |
| FAST_PROVISIONING | &quot;FAST_PROVISIONING&quot; |



