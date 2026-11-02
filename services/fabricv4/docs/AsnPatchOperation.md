

# AsnPatchOperation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | JSON Patch operation |  |
|**path** | **String** | JSON Pointer to the field to update |  |
|**value** | **Object** | New value for add or replace operations |  |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |
| REPLACE | &quot;replace&quot; |



