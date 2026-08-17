# InternetExchangeServicesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExchangeServiceById**](InternetExchangeServicesApi.md#getExchangeServiceById) | **GET** /fabric/v4/exchangeServices/{exchangeServiceId} | Get Internet Exchange Service |
| [**searchExchangeService**](InternetExchangeServicesApi.md#searchExchangeService) | **POST** /fabric/v4/exchangeServices/search | Search Internet Exchange Service |


<a id="getExchangeServiceById"></a>
# **getExchangeServiceById**
> ExchangeServiceResponse getExchangeServiceById(exchangeServiceId)

Get Internet Exchange Service

The API provides capability to get Internet Exchange Service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.InternetExchangeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InternetExchangeServicesApi apiInstance = new InternetExchangeServicesApi(defaultClient);
    UUID exchangeServiceId = UUID.randomUUID(); // UUID | Internet Exchange Service Id
    try {
      ExchangeServiceResponse result = apiInstance.getExchangeServiceById(exchangeServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetExchangeServicesApi#getExchangeServiceById");
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
| **exchangeServiceId** | **UUID**| Internet Exchange Service Id | |

### Return type

[**ExchangeServiceResponse**](ExchangeServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

<a id="searchExchangeService"></a>
# **searchExchangeService**
> ExchangeServiceSearchResponse searchExchangeService(exchangeServiceSearchRequest)

Search Internet Exchange Service

The API provides capability to get list of user&#39;s Internet Exchange Service using search criteria, including optional filtering, pagination and sorting.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.InternetExchangeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    InternetExchangeServicesApi apiInstance = new InternetExchangeServicesApi(defaultClient);
    ExchangeServiceSearchRequest exchangeServiceSearchRequest = new ExchangeServiceSearchRequest(); // ExchangeServiceSearchRequest | 
    try {
      ExchangeServiceSearchResponse result = apiInstance.searchExchangeService(exchangeServiceSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetExchangeServicesApi#searchExchangeService");
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
| **exchangeServiceSearchRequest** | [**ExchangeServiceSearchRequest**](ExchangeServiceSearchRequest.md)|  | |

### Return type

[**ExchangeServiceSearchResponse**](ExchangeServiceSearchResponse.md)

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
| **500** | Internal Server error |  -  |

