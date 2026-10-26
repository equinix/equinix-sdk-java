# PrecisionTimeServicesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTimeServices**](PrecisionTimeServicesApi.md#createTimeServices) | **POST** /fabric/v4/timeServices | Create Time Service |
| [**deleteTimeServiceById**](PrecisionTimeServicesApi.md#deleteTimeServiceById) | **DELETE** /fabric/v4/timeServices/{serviceId} | Delete Time Service by ID |
| [**fulfillTimeServices**](PrecisionTimeServicesApi.md#fulfillTimeServices) | **PUT** /fabric/v4/timeServices/{serviceId} | Update Time Service |
| [**getTimeServicesById**](PrecisionTimeServicesApi.md#getTimeServicesById) | **GET** /fabric/v4/timeServices/{serviceId} | Get Time Service by ID |
| [**getTimeServicesConnectionsByServiceId**](PrecisionTimeServicesApi.md#getTimeServicesConnectionsByServiceId) | **GET** /fabric/v4/timeServices/{serviceId}/connections | Get Connection Links |
| [**searchTimeServices**](PrecisionTimeServicesApi.md#searchTimeServices) | **POST** /fabric/v4/timeServices/search | Search Time Services |
| [**updateTimeServicesById**](PrecisionTimeServicesApi.md#updateTimeServicesById) | **PATCH** /fabric/v4/timeServices/{serviceId} | Update Time Service by ID |


<a id="createTimeServices"></a>
# **createTimeServices**
> PrecisionTimeServiceResponse createTimeServices(precisionTimeServiceRequest)

Create Time Service

The API provides capability to create Precision Time service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeServicesApi apiInstance = new PrecisionTimeServicesApi(defaultClient);
    PrecisionTimeServiceRequest precisionTimeServiceRequest = new PrecisionTimeServiceRequest(); // PrecisionTimeServiceRequest | 
    try {
      PrecisionTimeServiceResponse result = apiInstance.createTimeServices(precisionTimeServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeServicesApi#createTimeServices");
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
| **precisionTimeServiceRequest** | [**PrecisionTimeServiceRequest**](PrecisionTimeServiceRequest.md)|  | |

### Return type

[**PrecisionTimeServiceResponse**](PrecisionTimeServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Accepted operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteTimeServiceById"></a>
# **deleteTimeServiceById**
> PrecisionTimeServiceResponse deleteTimeServiceById(serviceId)

Delete Time Service by ID

The API provides capability to delete Precision Time Service by service id

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeServicesApi apiInstance = new PrecisionTimeServicesApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    try {
      PrecisionTimeServiceResponse result = apiInstance.deleteTimeServiceById(serviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeServicesApi#deleteTimeServiceById");
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
| **serviceId** | **UUID**| Service UUID | |

### Return type

[**PrecisionTimeServiceResponse**](PrecisionTimeServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Delete |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="fulfillTimeServices"></a>
# **fulfillTimeServices**
> PrecisionTimeServiceResponse fulfillTimeServices(serviceId, precisionTimeServiceRequest)

Update Time Service

The API provides capability to Configure/Fulfill the Precision Time Service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeServicesApi apiInstance = new PrecisionTimeServicesApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    PrecisionTimeServiceRequest precisionTimeServiceRequest = new PrecisionTimeServiceRequest(); // PrecisionTimeServiceRequest | 
    try {
      PrecisionTimeServiceResponse result = apiInstance.fulfillTimeServices(serviceId, precisionTimeServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeServicesApi#fulfillTimeServices");
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
| **serviceId** | **UUID**| Service UUID | |
| **precisionTimeServiceRequest** | [**PrecisionTimeServiceRequest**](PrecisionTimeServiceRequest.md)|  | |

### Return type

[**PrecisionTimeServiceResponse**](PrecisionTimeServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Accepted operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="getTimeServicesById"></a>
# **getTimeServicesById**
> PrecisionTimeServiceResponse getTimeServicesById(serviceId)

Get Time Service by ID

The API provides capability to get Precision Time Service details

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeServicesApi apiInstance = new PrecisionTimeServicesApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    try {
      PrecisionTimeServiceResponse result = apiInstance.getTimeServicesById(serviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeServicesApi#getTimeServicesById");
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
| **serviceId** | **UUID**| Service UUID | |

### Return type

[**PrecisionTimeServiceResponse**](PrecisionTimeServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="getTimeServicesConnectionsByServiceId"></a>
# **getTimeServicesConnectionsByServiceId**
> PrecisionTimeServiceConnectionsResponse getTimeServicesConnectionsByServiceId(serviceId)

Get Connection Links

The API provides capability to get prevision timing service&#39;s details

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeServicesApi apiInstance = new PrecisionTimeServicesApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    try {
      PrecisionTimeServiceConnectionsResponse result = apiInstance.getTimeServicesConnectionsByServiceId(serviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeServicesApi#getTimeServicesConnectionsByServiceId");
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
| **serviceId** | **UUID**| Service UUID | |

### Return type

[**PrecisionTimeServiceConnectionsResponse**](PrecisionTimeServiceConnectionsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return Time Service Connection |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="searchTimeServices"></a>
# **searchTimeServices**
> ServiceSearchResponse searchTimeServices(timeServicesSearchRequest)

Search Time Services

The API provides capability to get list of user&#39;s Time Services using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeServicesApi apiInstance = new PrecisionTimeServicesApi(defaultClient);
    TimeServicesSearchRequest timeServicesSearchRequest = new TimeServicesSearchRequest(); // TimeServicesSearchRequest | 
    try {
      ServiceSearchResponse result = apiInstance.searchTimeServices(timeServicesSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeServicesApi#searchTimeServices");
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
| **timeServicesSearchRequest** | [**TimeServicesSearchRequest**](TimeServicesSearchRequest.md)|  | |

### Return type

[**ServiceSearchResponse**](ServiceSearchResponse.md)

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

<a id="updateTimeServicesById"></a>
# **updateTimeServicesById**
> PrecisionTimeServiceResponse updateTimeServicesById(serviceId, precisionTimeChangeOperation)

Update Time Service by ID

The API provides capability to update Precision Time Service by service id

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.PrecisionTimeServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    PrecisionTimeServicesApi apiInstance = new PrecisionTimeServicesApi(defaultClient);
    UUID serviceId = UUID.randomUUID(); // UUID | Service UUID
    List<PrecisionTimeChangeOperation> precisionTimeChangeOperation = Arrays.asList(); // List<PrecisionTimeChangeOperation> | 
    try {
      PrecisionTimeServiceResponse result = apiInstance.updateTimeServicesById(serviceId, precisionTimeChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrecisionTimeServicesApi#updateTimeServicesById");
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
| **serviceId** | **UUID**| Service UUID | |
| **precisionTimeChangeOperation** | [**List&lt;PrecisionTimeChangeOperation&gt;**](PrecisionTimeChangeOperation.md)|  | |

### Return type

[**PrecisionTimeServiceResponse**](PrecisionTimeServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Accepted operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

