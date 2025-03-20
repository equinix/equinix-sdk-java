

# PrecisionTimeChangeOperation

Fabric Precision Timing change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | Handy shortcut for operation name |  |
|**path** | [**PathEnum**](#PathEnum) | path inside document leading to updated parameter |  |
|**value** | **Object** | new value for updated parameter |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |



## Enum: PathEnum

| Name | Value |
|---- | -----|
| _NAME | &quot;/name&quot; |
| _PACKAGE_CODE | &quot;/package/code&quot; |
| _IPV4 | &quot;/ipv4&quot; |
| _NTP_ADVANCED_CONFIGURATION | &quot;/ntpAdvancedConfiguration&quot; |
| _PTP_ADVANCED_CONFIGURATION | &quot;/ptpAdvancedConfiguration&quot; |



