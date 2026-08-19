

# AppLinkChangeOperation

App Link change operation data

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
| NAME | &quot;/name&quot; |
| DESCRIPTION | &quot;/description&quot; |
| BANDWIDTH | &quot;/bandwidth&quot; |
| IPV4ADDRESS | &quot;/ipv4Address&quot; |



