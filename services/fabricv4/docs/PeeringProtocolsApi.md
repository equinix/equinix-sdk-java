# PeeringProtocolsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnectionPeeringProtocol**](PeeringProtocolsApi.md#createConnectionPeeringProtocol) | **POST** /fabric/v4/connections/{uuid}/peeringProtocols | Create Peering Protocol |


<a id="createConnectionPeeringProtocol"></a>
# **createConnectionPeeringProtocol**
> PeeringProtocolData createConnectionPeeringProtocol(uuid, connectionPeeringProtocolPostRequest)

Create Peering Protocol

This API provides capability to create Peering Protocol for connections

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PeeringProtocolsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PeeringProtocolsApi apiInstance = new PeeringProtocolsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | uuid
    ConnectionPeeringProtocolPostRequest connectionPeeringProtocolPostRequest = new ConnectionPeeringProtocolPostRequest(); // ConnectionPeeringProtocolPostRequest | 
    try {
      PeeringProtocolData result = apiInstance.createConnectionPeeringProtocol(uuid, connectionPeeringProtocolPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PeeringProtocolsApi#createConnectionPeeringProtocol");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| uuid | |
| **connectionPeeringProtocolPostRequest** | [**ConnectionPeeringProtocolPostRequest**](ConnectionPeeringProtocolPostRequest.md)|  | |

### Return type

[**PeeringProtocolData**](PeeringProtocolData.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Connection ID Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

