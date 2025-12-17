

# Stream

Stream object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Stream URI |  [optional] [readonly] |
|**uuid** | **UUID** | Equinix-assigned access point identifier |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | type |  [optional] |
|**name** | **String** | Customer-provided stream name |  [optional] |
|**description** | **String** | Customer-provided stream description |  [optional] |
|**project** | [**Project**](Project.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Stream provision state |  [optional] |
|**assetsCount** | **Integer** | Stream assets count |  [optional] |
|**streamSubscriptionsCount** | **Integer** | Stream subscriptions count |  [optional] |
|**alertRulesCount** | **Integer** | Stream alert rules count |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TELEMETRY_STREAM | &quot;TELEMETRY_STREAM&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| REPROVISIONING | &quot;REPROVISIONING&quot; |
| DEPROVISIONING | &quot;DEPROVISIONING&quot; |
| DEPROVISIONED | &quot;DEPROVISIONED&quot; |
| FAILED | &quot;FAILED&quot; |



