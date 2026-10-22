

# Negotiations

Negotiations message with alternative date and time

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceId** | **String** | Reference id / internal id for customer to identify the actionable order line |  [optional] |
|**orderRequestedDateTime** | **OffsetDateTime** | Customer requested order date and time at point of order. |  [optional] |
|**proposedDateTime** | **OffsetDateTime** | Alternative / revised date and time proposed by Equinix for fulfilling the order request. |  [optional] |
|**expirationDateTime** | **OffsetDateTime** | Validity date and time of the negotiation. Negotiations request after this date will no longer be valid. |  [optional] |
|**createdDateTime** | **OffsetDateTime** | Negotiations message created date and time by operations team |  [optional] |
|**expedited** | **Boolean** | When &#x60;true,&#x60; requested order is an expedite order |  [optional] |
|**message** | **String** | Negotiations message |  [optional] |



