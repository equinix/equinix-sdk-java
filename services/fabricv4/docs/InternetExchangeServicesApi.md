# InternetExchangeServicesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExchangeService**](InternetExchangeServicesApi.md#createExchangeService) | **POST** /fabric/v4/exchangeServices | Create Internet Exchange Service |
| [**createExchangeServiceAction**](InternetExchangeServicesApi.md#createExchangeServiceAction) | **POST** /fabric/v4/exchangeServices/{exchangeServiceId}/actions | Create Internet Exchange Service Action |
| [**getExchangeServiceById**](InternetExchangeServicesApi.md#getExchangeServiceById) | **GET** /fabric/v4/exchangeServices/{exchangeServiceId} | Get Internet Exchange Service |
| [**searchExchangeService**](InternetExchangeServicesApi.md#searchExchangeService) | **POST** /fabric/v4/exchangeServices/search | Search Internet Exchange Services |
| [**updateExchangeServiceById**](InternetExchangeServicesApi.md#updateExchangeServiceById) | **PATCH** /fabric/v4/exchangeServices/{exchangeServiceId} | Update Internet Exchange Service |


<a id="createExchangeService"></a>
# **createExchangeService**
> ExchangeServiceResponse createExchangeService(exchangeServiceCreateRequest)

Create Internet Exchange Service

This API provides capability to create Internet Exchange Service

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
    ExchangeServiceCreateRequest exchangeServiceCreateRequest = new ExchangeServiceCreateRequest(); // ExchangeServiceCreateRequest | 
    try {
      ExchangeServiceResponse result = apiInstance.createExchangeService(exchangeServiceCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetExchangeServicesApi#createExchangeService");
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
| **exchangeServiceCreateRequest** | [**ExchangeServiceCreateRequest**](ExchangeServiceCreateRequest.md)|  | |

### Return type

[**ExchangeServiceResponse**](ExchangeServiceResponse.md)

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
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

<a id="createExchangeServiceAction"></a>
# **createExchangeServiceAction**
> ExchangeServiceActionResponse createExchangeServiceAction(exchangeServiceId, exchangeServiceActionRequest)

Create Internet Exchange Service Action

This API provides capability to perform actions on Internet Exchange Service

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
    UUID exchangeServiceId = UUID.fromString("a8ba52de-faae-43b5-b0b1-6904d37ee011"); // UUID | Internet Exchange Service Id
    ExchangeServiceActionRequest exchangeServiceActionRequest = new ExchangeServiceActionRequest(); // ExchangeServiceActionRequest | 
    try {
      ExchangeServiceActionResponse result = apiInstance.createExchangeServiceAction(exchangeServiceId, exchangeServiceActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetExchangeServicesApi#createExchangeServiceAction");
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
| **exchangeServiceActionRequest** | [**ExchangeServiceActionRequest**](ExchangeServiceActionRequest.md)|  | |

### Return type

[**ExchangeServiceActionResponse**](ExchangeServiceActionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

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
    UUID exchangeServiceId = UUID.fromString("a8ba52de-faae-43b5-b0b1-6904d37ee011"); // UUID | Internet Exchange Service Id
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

Search Internet Exchange Services

The API provides capability to get list of user&#39;s Internet Exchange Service using search criteria, including optional filtering, pagination and sorting

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

<a id="updateExchangeServiceById"></a>
# **updateExchangeServiceById**
> ExchangeServiceResponse updateExchangeServiceById(exchangeServiceId, exchangeServiceReplaceOperation)

Update Internet Exchange Service

The API provides capability to update Internet Exchange Service

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
    UUID exchangeServiceId = UUID.fromString("a8ba52de-faae-43b5-b0b1-6904d37ee011"); // UUID | Internet Exchange Service Id
    List<ExchangeServiceReplaceOperation> exchangeServiceReplaceOperation = Arrays.asList(); // List<ExchangeServiceReplaceOperation> | 
    try {
      ExchangeServiceResponse result = apiInstance.updateExchangeServiceById(exchangeServiceId, exchangeServiceReplaceOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetExchangeServicesApi#updateExchangeServiceById");
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
| **exchangeServiceReplaceOperation** | [**List&lt;ExchangeServiceReplaceOperation&gt;**](ExchangeServiceReplaceOperation.md)|  | |

### Return type

[**ExchangeServiceResponse**](ExchangeServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

