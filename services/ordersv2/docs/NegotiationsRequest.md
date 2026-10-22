

# NegotiationsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceId** | **String** | Unique identifier to reference specific activity or order line id.  |  |
|**action** | [**ActionEnum**](#ActionEnum) | Type of actions to be carried out with negotiation. Use &#x60;APPROVE&#x60; to accept order with new proposed date, &#x60;APPROVE_NON_EXPEDITE&#x60; to accept order without expedite and &#x60;CANCEL&#x60; to cancel order |  |
|**reason** | **String** | Reason for cancelling the negotiation |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;APPROVE&quot; |
| APPROVE_NON_EXPEDITE | &quot;APPROVE_NON_EXPEDITE&quot; |
| CANCEL | &quot;CANCEL&quot; |



