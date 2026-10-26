# ApplicationProcessorsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAppProcessorByUuid**](ApplicationProcessorsApi.md#getAppProcessorByUuid) | **GET** /fabric/v4/appProcessors/{appProcessorId} | Get Processor |
| [**searchAppProcessors**](ApplicationProcessorsApi.md#searchAppProcessors) | **POST** /fabric/v4/appProcessors/search | Search Processors |


<a id="getAppProcessorByUuid"></a>
# **getAppProcessorByUuid**
> AppProcessor getAppProcessorByUuid(appProcessorId)

Get Processor

This API provides capability to retrieve user&#39;s App Processor

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationProcessorsApi apiInstance = new ApplicationProcessorsApi(defaultClient);
    UUID appProcessorId = UUID.randomUUID(); // UUID | App Processor UUID
    try {
      AppProcessor result = apiInstance.getAppProcessorByUuid(appProcessorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationProcessorsApi#getAppProcessorByUuid");
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
| **appProcessorId** | **UUID**| App Processor UUID | |

### Return type

[**AppProcessor**](AppProcessor.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | App Processor object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="searchAppProcessors"></a>
# **searchAppProcessors**
> AppProcessorSearchResponse searchAppProcessors(appProcessorSearchRequest)

Search Processors

The API provides capability to get list of user&#39;s App Processors using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationProcessorsApi apiInstance = new ApplicationProcessorsApi(defaultClient);
    AppProcessorSearchRequest appProcessorSearchRequest = new AppProcessorSearchRequest(); // AppProcessorSearchRequest | 
    try {
      AppProcessorSearchResponse result = apiInstance.searchAppProcessors(appProcessorSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationProcessorsApi#searchAppProcessors");
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
| **appProcessorSearchRequest** | [**AppProcessorSearchRequest**](AppProcessorSearchRequest.md)|  | |

### Return type

[**AppProcessorSearchResponse**](AppProcessorSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

