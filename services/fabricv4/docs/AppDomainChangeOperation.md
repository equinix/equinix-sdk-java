

# AppDomainChangeOperation

App Domain change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | operation type applied to the resource |  |
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
| _DESCRIPTION | &quot;/description&quot; |



