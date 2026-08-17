# OpticalMetroConnectsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBulkOpticalConnect**](OpticalMetroConnectsApi.md#createBulkOpticalConnect) | **POST** /fabric/v4/opticalConnects/bulk | Create Dual Diverse Optical Metro Connect Service |
| [**createOpticalConnect**](OpticalMetroConnectsApi.md#createOpticalConnect) | **POST** /fabric/v4/opticalConnects | Create Optical Metro Connect Service |
| [**getOpticalConnectByUuid**](OpticalMetroConnectsApi.md#getOpticalConnectByUuid) | **GET** /fabric/v4/opticalConnects/{opticalConnectId} | Get Optical Metro Connect Service |
| [**searchOpticalConnect**](OpticalMetroConnectsApi.md#searchOpticalConnect) | **POST** /fabric/v4/opticalConnects/search | Search Optical Metro Connect Services |


<a id="createBulkOpticalConnect"></a>
# **createBulkOpticalConnect**
> OpticalConnectBulk createBulkOpticalConnect(bulkOpticalConnectRequest)

Create Dual Diverse Optical Metro Connect Service

Create a dual diverse pair of circuits on separate optical paths. 

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.OpticalMetroConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OpticalMetroConnectsApi apiInstance = new OpticalMetroConnectsApi(defaultClient);
    BulkOpticalConnectRequest bulkOpticalConnectRequest = new BulkOpticalConnectRequest(); // BulkOpticalConnectRequest | 
    try {
      OpticalConnectBulk result = apiInstance.createBulkOpticalConnect(bulkOpticalConnectRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpticalMetroConnectsApi#createBulkOpticalConnect");
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
| **bulkOpticalConnectRequest** | [**BulkOpticalConnectRequest**](BulkOpticalConnectRequest.md)|  | |

### Return type

[**OpticalConnectBulk**](OpticalConnectBulk.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted Operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

<a id="createOpticalConnect"></a>
# **createOpticalConnect**
> OpticalConnectResponse createOpticalConnect(opticalConnectPostRequest)

Create Optical Metro Connect Service

Create a single Optical Metro Connect circuit. 

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.OpticalMetroConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OpticalMetroConnectsApi apiInstance = new OpticalMetroConnectsApi(defaultClient);
    OpticalConnectPostRequest opticalConnectPostRequest = new OpticalConnectPostRequest(); // OpticalConnectPostRequest | 
    try {
      OpticalConnectResponse result = apiInstance.createOpticalConnect(opticalConnectPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpticalMetroConnectsApi#createOpticalConnect");
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
| **opticalConnectPostRequest** | [**OpticalConnectPostRequest**](OpticalConnectPostRequest.md)|  | |

### Return type

[**OpticalConnectResponse**](OpticalConnectResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted Operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

<a id="getOpticalConnectByUuid"></a>
# **getOpticalConnectByUuid**
> OpticalConnectResponse getOpticalConnectByUuid(opticalConnectId)

Get Optical Metro Connect Service

Get a single Optical Metro Connect by UUID. 

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.OpticalMetroConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OpticalMetroConnectsApi apiInstance = new OpticalMetroConnectsApi(defaultClient);
    UUID opticalConnectId = UUID.randomUUID(); // UUID | Unique identifier of an Optical Connect.
    try {
      OpticalConnectResponse result = apiInstance.getOpticalConnectByUuid(opticalConnectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpticalMetroConnectsApi#getOpticalConnectByUuid");
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
| **opticalConnectId** | **UUID**| Unique identifier of an Optical Connect. | |

### Return type

[**OpticalConnectResponse**](OpticalConnectResponse.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

<a id="searchOpticalConnect"></a>
# **searchOpticalConnect**
> OpticalConnectServiceSearchResponse searchOpticalConnect(opticalConnectSearchRequest)

Search Optical Metro Connect Services

Get Optical Metro Connects matching the supplied criteria, with optional filtering, pagination and sorting. 

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.OpticalMetroConnectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    OpticalMetroConnectsApi apiInstance = new OpticalMetroConnectsApi(defaultClient);
    OpticalConnectSearchRequest opticalConnectSearchRequest = new OpticalConnectSearchRequest(); // OpticalConnectSearchRequest | 
    try {
      OpticalConnectServiceSearchResponse result = apiInstance.searchOpticalConnect(opticalConnectSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpticalMetroConnectsApi#searchOpticalConnect");
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
| **opticalConnectSearchRequest** | [**OpticalConnectSearchRequest**](OpticalConnectSearchRequest.md)|  | |

### Return type

[**OpticalConnectServiceSearchResponse**](OpticalConnectServiceSearchResponse.md)

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
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

