

# ChangeBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Uniquely identifies a change |  |
|**type** | **ChangeType** |  |  |
|**status** | **String** | Current outcome of the change flow. Allowed values: - REQUESTED - SUBMITTED_FOR_APPROVAL - APPROVED - REJECTED - COMPLETED - FAILED  |  |
|**createdDateTime** | **OffsetDateTime** | Set when change flow starts |  |
|**updatedDateTime** | **OffsetDateTime** | Set when change object is updated |  [optional] |
|**information** | **String** | Additional information |  [optional] |
|**data** | [**ChangeData**](ChangeData.md) |  |  |



