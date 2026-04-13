

# Agents

Agent object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Agent URI |  [optional] [readonly] |
|**type** | **String** | type |  [optional] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**name** | **String** | Customer-provided agent name |  [optional] |
|**description** | **String** | Customer-provided agent description |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Agent state |  [optional] |
|**enabled** | **Boolean** | Customer-provided agent enabled status |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**agentTemplate** | [**AgentTemplate**](AgentTemplate.md) |  |  [optional] |
|**_configuration** | [**ModelConfiguration**](ModelConfiguration.md) |  |  [optional] |
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



