# GatewaysApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGateway**](GatewaysApi.md#createGateway) | **POST** /fabric/v4/gateways | Create Gateway |
| [**deleteGatewayByUuid**](GatewaysApi.md#deleteGatewayByUuid) | **DELETE** /fabric/v4/gateways/{gatewayId} | Delete Gateway |
| [**getGatewayByUuid**](GatewaysApi.md#getGatewayByUuid) | **GET** /fabric/v4/gateways/{gatewayId} | Get Gateway |
| [**updateGatewayByUuid**](GatewaysApi.md#updateGatewayByUuid) | **PATCH** /fabric/v4/gateways/{gatewayId} | Update Gateway by ID |


<a id="createGateway"></a>
# **createGateway**
> Gateway createGateway(gatewayPostRequest)

Create Gateway

This API provides capability to create user&#39;s Gateways

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    GatewayPostRequest gatewayPostRequest = new GatewayPostRequest(); // GatewayPostRequest | 
    try {
      Gateway result = apiInstance.createGateway(gatewayPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#createGateway");
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
| **gatewayPostRequest** | [**GatewayPostRequest**](GatewayPostRequest.md)|  | |

### Return type

[**Gateway**](Gateway.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Gateway object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteGatewayByUuid"></a>
# **deleteGatewayByUuid**
> Gateway deleteGatewayByUuid(gatewayId)

Delete Gateway

This API provides capability to delete user&#39;s Gateways

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    try {
      Gateway result = apiInstance.deleteGatewayByUuid(gatewayId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#deleteGatewayByUuid");
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
| **gatewayId** | **UUID**| Gateway UUID | |

### Return type

[**Gateway**](Gateway.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Gateway object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getGatewayByUuid"></a>
# **getGatewayByUuid**
> Gateway getGatewayByUuid(gatewayId)

Get Gateway

This API provides capability to retrieve user&#39;s Gateways

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    try {
      Gateway result = apiInstance.getGatewayByUuid(gatewayId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#getGatewayByUuid");
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
| **gatewayId** | **UUID**| Gateway UUID | |

### Return type

[**Gateway**](Gateway.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gateway object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="updateGatewayByUuid"></a>
# **updateGatewayByUuid**
> Gateway updateGatewayByUuid(gatewayId, gatewayChangeOperation)

Update Gateway by ID

Update Gateway by Uuid

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    UUID gatewayId = UUID.randomUUID(); // UUID | Gateway UUID
    List<GatewayChangeOperation> gatewayChangeOperation = Arrays.asList(); // List<GatewayChangeOperation> | 
    try {
      Gateway result = apiInstance.updateGatewayByUuid(gatewayId, gatewayChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#updateGatewayByUuid");
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
| **gatewayId** | **UUID**| Gateway UUID | |
| **gatewayChangeOperation** | [**List&lt;GatewayChangeOperation&gt;**](GatewayChangeOperation.md)|  | |

### Return type

[**Gateway**](Gateway.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Gateway object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

