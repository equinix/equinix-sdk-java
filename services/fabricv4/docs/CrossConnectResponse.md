

# CrossConnectResponse

Cross Connect Response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**href** | **URI** | Cross Connect URI. |  [optional] |
|**type** | **CrossConnectType** |  |  [optional] |
|**uuid** | **UUID** | Cross Connect Identifier. |  [optional] |
|**name** | **String** | A short, descriptive name for this Cross Connect. |  [optional] |
|**state** | **CrossConnectState** |  |  [optional] |
|**allowedActions** | [**List&lt;CrossConnectResponseAllowedActions&gt;**](CrossConnectResponseAllowedActions.md) | List of actions that can be performed on the Cross Connect based on its current state. Use these values to determine which action types are valid to submit to the actions endpoint.  |  [optional] [readonly] |
|**bmmrType** | **BmmrType** |  |  [optional] |
|**mediaType** | **String** | Media type of the Cross Connect. |  [optional] |
|**mediaSubType** | **String** | Media sub-type of the Cross Connect. |  [optional] |
|**circuitId** | **String** | Circuit identifier of the Cross Connect. |  [optional] |
|**serialNumber** | **String** | Serial number of the Cross Connect. |  [optional] [readonly] |
|**redundancy** | [**CrossConnectRedundancy**](CrossConnectRedundancy.md) |  |  [optional] |
|**aSide** | [**CrossConnectASideResponse**](CrossConnectASideResponse.md) |  |  [optional] |
|**zSide** | [**CrossConnectZSideResponse**](CrossConnectZSideResponse.md) |  |  [optional] |
|**account** | [**CrossConnectAccount**](CrossConnectAccount.md) |  |  [optional] |
|**notifications** | [**List&lt;CrossConnectNotification&gt;**](CrossConnectNotification.md) | Preferences for notifications on Cross Connect configuration or status changes.  |  [optional] |
|**order** | [**OrderResponse**](OrderResponse.md) |  |  [optional] |
|**links** | [**List&lt;CrossConnectLink&gt;**](CrossConnectLink.md) | Links to the Cross Connect sub-resources - schedules, services, notes and attachments.  |  [optional] [readonly] |
|**changeLog** | [**CrossConnectChangelog**](CrossConnectChangelog.md) |  |  [optional] |



