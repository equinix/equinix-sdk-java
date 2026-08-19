

# OpticalConnectResponse

Optical Metro Connect connection with its current state and the resolved         physical termination points at both ends.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | URI of this Optical Connect resource. |  [optional] [readonly] |
|**uuid** | **UUID** | Unique identifier of this Optical Connect. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Connection Type. &lt;br&gt; OC - Optical Connect.  |  [optional] |
|**name** | **String** | Equinix-assigned name, derived from the account number and the two IBX locations.  |  [optional] [readonly] |
|**state** | **OpticalConnectState** |  |  [optional] |
|**bandwidth** | **Integer** | Provisioned connection bandwidth in Mbps. |  [optional] |
|**connectionDestinationType** | [**ConnectionDestinationTypeEnum**](#ConnectionDestinationTypeEnum) | Where the Z-side terminates. &lt;br&gt;  COLO - your own colocation space at another Equinix IBX. &lt;br&gt; BMMR - a Building Meet-Me Room. &lt;br&gt; REMOTE - another customer&#39;s colocation space at another Equinix IBX. &lt;br&gt;  |  [optional] |
|**pathType** | [**PathTypeEnum**](#PathTypeEnum) | Level of resilience for the connection. &lt;br&gt; UNPROTECTED - a single fiber path with no node redundancy. &lt;br&gt; PROTECTED - two diverse fiber paths between single nodes at each IBX. &lt;br&gt; DUAL_DIVERSE - two diverse fiber paths terminating on redundant nodes at both IBXs.  |  [optional] |
|**bmmrType** | [**BmmrTypeEnum**](#BmmrTypeEnum) | BMMR infrastructure ownership type. &lt;br&gt; EQUINIX - Equinix-operated. &lt;br&gt; SELF - customer-operated. &lt;br&gt; Required only when connectionDestinationType is BMMR.  |  [optional] |
|**redundancy** | [**OpticalConnectRedundancy**](OpticalConnectRedundancy.md) |  |  [optional] |
|**aSide** | [**OpticalConnectASideResponse**](OpticalConnectASideResponse.md) |  |  [optional] |
|**zSide** | [**OpticalConnectZSideResponse**](OpticalConnectZSideResponse.md) |  |  [optional] |
|**order** | [**OpticalConnectOrder**](OpticalConnectOrder.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;OpticalConnectNotification&gt;**](OpticalConnectNotification.md) | Preferences for notifications on connection configuration or status changes |  [optional] |
|**changeLog** | [**Changelog**](Changelog.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| OC | &quot;OC&quot; |



## Enum: ConnectionDestinationTypeEnum

| Name | Value |
|---- | -----|
| COLO | &quot;COLO&quot; |
| BMMR | &quot;BMMR&quot; |
| REMOTE | &quot;REMOTE&quot; |



## Enum: PathTypeEnum

| Name | Value |
|---- | -----|
| DUAL_DIVERSE | &quot;DUAL_DIVERSE&quot; |
| PROTECTED | &quot;PROTECTED&quot; |
| UNPROTECTED | &quot;UNPROTECTED&quot; |



## Enum: BmmrTypeEnum

| Name | Value |
|---- | -----|
| EQUINIX | &quot;EQUINIX&quot; |
| SELF | &quot;SELF&quot; |



