

# AgentTemplates

Agent Template object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **UUID** | Agent Template URI |  [optional] |
|**type** | **String** | type |  [optional] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**name** | **String** | Equinix-provided agent template name |  [optional] |
|**description** | **String** | Equinix-provided agent template description |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Agent state |  [optional] |
|**enabled** | **Boolean** | Equinix-provided agent template enabled status |  [optional] |
|**agentDefinition** | [**AgentDefinition**](AgentDefinition.md) |  |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| FAILED | &quot;FAILED&quot; |



