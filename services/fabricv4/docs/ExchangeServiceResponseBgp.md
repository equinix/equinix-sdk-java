

# ExchangeServiceResponseBgp


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerPeerIp** | **String** | Customer peer IP address |  [optional] |
|**domainName** | **String** | Domain name for BGP |  [optional] |
|**primaryRouteServerIp** | **String** | Primary route server IP address with prefix length |  [optional] |
|**secondaryRouteServerIp** | **String** | Secondary route server IP address with prefix length |  [optional] |
|**asSet** | **String** | AS-SET used to filter the prefixes announced by the customer |  [optional] |
|**mlpeEnabled** | **Boolean** | Whether Multi-Lateral Peering Exchange (MLPE) is enabled |  [optional] |
|**md5AuthKey** | **String** | MD5 key for BGP |  [optional] |
|**rcMd5AuthKey** | **String** | RC MD5 key for BGP |  [optional] |
|**prefixes** | **List&lt;String&gt;** | List of IP prefix |  [optional] |
|**maxPrefixLimit** | **Long** | Max Prefix Limit number |  [optional] |
|**prependSelfEnabled** | **Boolean** | Prepend Self Enabled |  [optional] |



