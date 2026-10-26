

# ExchangeServiceReplaceOperation

Replace attribute value or sub-resource in the existing model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | **ExchangeServiceOpEnum** |  |  |
|**path** | **String** | ### A JSON Pointer path.   * &#x60;/name&#x60; - Name of the Internet Exchange Service   * &#x60;/description&#x60; - Description of the Internet Exchange Service   * &#x60;routingProtocol/macAddress&#x60; - MAC Address   * &#x60;routingProtocol/bgpIpv4/domainName&#x60; - Domain Name for BGP IPv4   * &#x60;routingProtocol/bgpIpv4/asSet&#x60; - AS Set for BGP IPv4   * &#x60;routingProtocol/bgpIpv4/md5AuthKey&#x60; - MD5 Auth Key for BGP IPv4   * &#x60;routingProtocol/bgpIpv4/rcMd5AuthKey&#x60; - RC MD5 Auth Key for BGP IPv4   * &#x60;routingProtocol/bgpIpv4/ipPrefixes&#x60; - IP Prefixes for BGP IPv4   * &#x60;routingProtocol/bgpIpv6/mlpeEnabled&#x60; - MLPE Enabled for BGP IPv4   * &#x60;routingProtocol/bgpIpv6/domainName&#x60;- Domain Name for BGP IPv6   * &#x60;routingProtocol/bgpIpv6/asSet&#x60;- AS Set for BGP IPv6   * &#x60;routingProtocol/bgpIpv6/md5AuthKey&#x60; - MD5 Auth Key for BGP IPv6   * &#x60;routingProtocol/bgpIpv6/rcMd5AuthKey&#x60; - RC MD5 Auth Key for BGP IPv6   * &#x60;routingProtocol/bgpIpv6/ipPrefixes&#x60; - IP Prefixes for BGP IPv6   * &#x60;routingProtocol/bgpIpv6/mlpeEnabled&#x60; - MLPE Enabled for BGP IPv6  |  |
|**value** | **Object** | value to replace with |  |



