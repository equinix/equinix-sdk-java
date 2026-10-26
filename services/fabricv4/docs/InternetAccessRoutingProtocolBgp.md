

# InternetAccessRoutingProtocolBgp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exportPolicy** | **InternetAccessExportPolicy** |  |  |
|**asn** | [**InternetAccessRoutingProtocolBgpAsn**](InternetAccessRoutingProtocolBgpAsn.md) |  |  [optional] |
|**customerAsn** | **Long** | Customer ASN. Valid range is 1-64495 or 131072-4199999999. Currently this option is only available for EIA over dedicated port. |  [optional] |
|**bgpAuthKey** | **String** | BGP authentication key. This field is deprecated and will be removed in future releases. Please use bgpAuthType instead to determine if a BGP authentication key is configured. |  [optional] |
|**bgpAuthType** | **InternetAccessBgpAuthType** |  |  [optional] |
|**customerAsnRange** | **InternetAccessCustomerAsnRange** |  |  [optional] |



