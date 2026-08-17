

# Interconnect

Interconnect specification <font color=\"red\"> <sup color='red'>Beta</sup></font>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **String** | Interconnect URI |  [optional] |
|**uuid** | **UUID** | Equinix-assigned interconnect identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Interconnect type |  [optional] |
|**name** | **String** | Interconnect name |  [optional] |
|**description** | **String** | Interconnect description |  [optional] |
|**state** | **InterconnectState** |  |  [optional] |
|**location** | [**InterconnectLocation**](InterconnectLocation.md) |  |  [optional] |
|**usedBandwidth** | **Integer** | Interconnect used bandwidth in Mbps |  [optional] |
|**_package** | [**InterconnectPackage**](InterconnectPackage.md) |  |  [optional] |
|**router** | [**InterconnectRouter**](InterconnectRouter.md) |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**notifications** | [**List&lt;InterconnectNotification&gt;**](InterconnectNotification.md) | Interconnect notification preferences |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| XF_IC | &quot;XF_IC&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



