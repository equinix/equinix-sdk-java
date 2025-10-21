# PortPackagesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPortPackages**](PortPackagesApi.md#getPortPackages) | **GET** /fabric/v4/portPackages | Get All Port Packages |


<a id="getPortPackages"></a>
# **getPortPackages**
> AllPortPackagesResponse getPortPackages()

Get All Port Packages

Get All Port Packages returns details of all available port packages for the specified user credentials.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PortPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PortPackagesApi apiInstance = new PortPackagesApi(defaultClient);
    try {
      AllPortPackagesResponse result = apiInstance.getPortPackages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PortPackagesApi#getPortPackages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AllPortPackagesResponse**](AllPortPackagesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |

