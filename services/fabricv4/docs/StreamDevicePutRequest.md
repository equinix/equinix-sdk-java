

# StreamDevicePutRequest

Attach Network Edge Device interfaces to a Stream

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metricsEnabled** | **Boolean** | enable metric. Must be true when interfaces are provided |  [optional] |
|**interfaces** | [**List&lt;StreamDeviceInterfaceRequest&gt;**](StreamDeviceInterfaceRequest.md) | Complete desired set of Network Edge Device interfaces attached to the stream. Interfaces not in the list are detached; an empty or absent list detaches all interfaces.  |  [optional] |



