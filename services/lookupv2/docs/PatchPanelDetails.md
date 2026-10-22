

# PatchPanelDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patchPanelId** | **String** | Patch panel ID / serial number |  [optional] |
|**ibx** | **String** | IBX location code |  [optional] |
|**cageId** | **String** | Cage ID |  [optional] |
|**cabinetId** | **String** | Cabinet ID |  [optional] |
|**accountNumber** | **String** | Customer cage account number |  [optional] |
|**accountName** | **String** | Customer cage account name |  [optional] |
|**dedicatedMediaType** | **String** | Type of dedicated media |  [optional] |
|**preWired** | **Boolean** | Prewired status of cross connects. When &#x60;true&#x60;, cross connects are prewired |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Patch panel type |  [optional] |
|**ifcEnabled** | **Boolean** | Identifies if intra-facility cable (IFC) connection is required for patch panel. When &#x60;true&#x60;, IFC connection is required. |  [optional] |
|**rackLocations** | **String** | Rack location of patch panel |  [optional] |
|**installLocations** | [**InstallLocationsEnum**](#InstallLocationsEnum) | Location of installed patch panel |  [optional] |
|**installationRequired** | **Boolean** | If &#x60;true&#x60;, Equinix will install cross connect from demarcation panel to customer equipment.  |  [optional] |
|**circuitAvailable** | **Boolean** | if &#x60;true&#x60;, circuits are available for patch panel |  [optional] |
|**availablePorts** | **List&lt;BigDecimal&gt;** | Individually identified ports that are available out of the total number of ports. |  [optional] |
|**connectionServices** | [**List&lt;ConnectionServicesDetailsInner&gt;**](ConnectionServicesDetailsInner.md) |  |  [optional] |
|**usedPortsDetails** | [**List&lt;UserPortDetails&gt;**](UserPortDetails.md) |  |  [optional] |
|**provisioningType** | [**ProvisioningTypeEnum**](#ProvisioningTypeEnum) | If &#x60;REGULAR&#x60;, order will be provisioned as per standard lead time. If &#x60;FAST_PROVISIONING&#x60;, order is typically provisioned in 30min through the support of fast provisioning scheduling. However, service may be delayed due to system maintenance |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOMER_PROVIDED | &quot;CUSTOMER_PROVIDED&quot; |
| EQUINIX_PROVIDED | &quot;EQUINIX_PROVIDED&quot; |



## Enum: InstallLocationsEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |



## Enum: ProvisioningTypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;REGULAR&quot; |
| FAST_PROVISIONING | &quot;FAST_PROVISIONING&quot; |



