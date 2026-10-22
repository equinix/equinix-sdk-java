

# ChangeOperationUpdate

Change operation data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | **String** | Operation type. Allowed values: - replace - add - remove  |  |
|**path** | **String** | Path inside document leading to updated parameter. Allowed values: - /bandwidth - /routingProtocol/ipv4/customerRoutes[*] - /routingProtocol/ipv6/customerRoutes[*]  |  |
|**value** | **String** | New value for updated parameter.  Allowed value for PA is prefixLength, e.g. \&quot;30\&quot; Allowed value for PI is prefix with subnetSize. e.g. \&quot;192.168.1.0/24\&quot;  |  |
|**order** | [**ServiceOrder**](ServiceOrder.md) |  |  [optional] |



