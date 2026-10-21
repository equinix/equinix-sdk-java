

# VirtualDeviceACLDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the virtual device associated with this template. |  [optional] |
|**uuid** | **String** | The unique Id of the virtual device associated with this template. |  [optional] |
|**interfaceType** | [**InterfaceTypeEnum**](#InterfaceTypeEnum) | Interface type, WAN or MGMT. |  [optional] |
|**aclStatus** | [**AclStatusEnum**](#AclStatusEnum) | Device ACL status |  [optional] |



## Enum: InterfaceTypeEnum

| Name | Value |
|---- | -----|
| MGMT | &quot;MGMT&quot; |
| WAN | &quot;WAN&quot; |



## Enum: AclStatusEnum

| Name | Value |
|---- | -----|
| PROVISIONED | &quot;PROVISIONED&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| FAILED | &quot;FAILED&quot; |



