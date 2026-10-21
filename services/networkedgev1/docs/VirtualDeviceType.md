

# VirtualDeviceType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deviceTypeCode** | **DeviceTypeCode** |  |  [optional] |
|**name** | **String** | The name of the device. |  [optional] |
|**description** | **String** | The description of the device. |  [optional] |
|**vendor** | **String** | The vendor of the device. |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | The type of the virtual device, whether router or firewall. |  [optional] |
|**maxInterfaceCount** | **Integer** | The maximum available number of interfaces. |  [optional] |
|**defaultInterfaceCount** | **Integer** | The default number of interfaces. |  [optional] |
|**clusterMaxInterfaceCount** | **Integer** | The maximum number of available interfaces in case you are clustering. |  [optional] |
|**clusterDefaultInterfaceCount** | **Integer** | The default number of available interfaces in case you are clustering. |  [optional] |
|**availableMetros** | [**List&lt;Metro&gt;**](Metro.md) | An array of metros where the device is available. |  [optional] |
|**softwarePackages** | [**List&lt;SoftwarePackage&gt;**](SoftwarePackage.md) | An array of available software packages |  [optional] |
|**deviceManagementTypes** | [**List&lt;DeviceManagementTypesEnum&gt;**](#List&lt;DeviceManagementTypesEnum&gt;) | Device management types configuration |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ROUTER | &quot;ROUTER&quot; |
| FIREWALL | &quot;FIREWALL&quot; |
| SDWAN | &quot;SDWAN&quot; |



## Enum: List&lt;DeviceManagementTypesEnum&gt;

| Name | Value |
|---- | -----|
| SELF_CONFIGURED | &quot;SELF-CONFIGURED&quot; |
| EQUINIX_CONFIGURED | &quot;EQUINIX-CONFIGURED&quot; |



