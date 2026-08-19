

# OpticalConnectPostRequest

Request to order a single connection. The A-side is always a patch panel         port in your own cage; the Z-side shape depends on         connectionDestinationType.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | OC - Optical Connect Type |  |
|**bandwidth** | **Integer** | Connection bandwidth Mbps. &lt;br&gt; Available bandwidths depend on the IBX pair. &lt;br&gt; 1000 - 1 Gbps. &lt;br&gt; 10000 - 10 Gbps. &lt;br&gt; 100000 - 100 Gbps. &lt;br&gt;  |  |
|**connectionDestinationType** | [**ConnectionDestinationTypeEnum**](#ConnectionDestinationTypeEnum) | Where the Z-side terminates. &lt;br&gt;  COLO - your own colocation space at another Equinix IBX. &lt;br&gt; BMMR - a Building Meet-Me Room. &lt;br&gt; REMOTE - another customer&#39;s colocation space at another Equinix IBX. &lt;br&gt; BMMR and REMOTE require a Letter of Authorization on the Z-side.  |  |
|**pathType** | [**PathTypeEnum**](#PathTypeEnum) | Level of resilience for the connection. &lt;br&gt; UNPROTECTED - a single fiber path with no node redundancy. &lt;br&gt; PROTECTED - two diverse fiber paths between single nodes at each IBX. &lt;br&gt; DUAL_DIVERSE - two diverse fiber paths terminating on redundant nodes at both IBXs.  |  |
|**redundancy** | [**OpticalConnectRedundancy**](OpticalConnectRedundancy.md) |  |  [optional] |
|**aSide** | [**OpticalConnectASideRequest**](OpticalConnectASideRequest.md) |  |  |
|**zSide** | [**OpticalConnectZSideRequest**](OpticalConnectZSideRequest.md) |  |  |
|**order** | [**OpticalConnectOrder**](OpticalConnectOrder.md) |  |  [optional] |
|**account** | [**SimplifiedAccount**](SimplifiedAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;OpticalConnectNotification&gt;**](OpticalConnectNotification.md) | Contacts to notify about connection configuration and status changes |  [optional] |
|**bmmrType** | [**BmmrTypeEnum**](#BmmrTypeEnum) | BMMR infrastructure ownership type. &lt;br&gt; EQUINIX - Equinix-operated. &lt;br&gt; SELF - customer-operated. &lt;br&gt; Required only when connectionDestinationType is BMMR.  |  [optional] |



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



