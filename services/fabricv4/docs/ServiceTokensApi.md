# ServiceTokensApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServiceToken**](ServiceTokensApi.md#createServiceToken) | **POST** /fabric/v4/serviceTokens | Create Service Token |
| [**createServiceTokenAction**](ServiceTokensApi.md#createServiceTokenAction) | **POST** /fabric/v4/serviceTokens/{serviceTokenId}/actions | ServiceToken Actions |
| [**deleteServiceTokenByUuid**](ServiceTokensApi.md#deleteServiceTokenByUuid) | **DELETE** /fabric/v4/serviceTokens/{serviceTokenId} | Delete Token by uuid |
| [**getServiceTokenByUuid**](ServiceTokensApi.md#getServiceTokenByUuid) | **GET** /fabric/v4/serviceTokens/{serviceTokenId} | Get Token by uuid |
| [**getServiceTokens**](ServiceTokensApi.md#getServiceTokens) | **GET** /fabric/v4/serviceTokens | Get All Tokens |
| [**searchServiceTokens**](ServiceTokensApi.md#searchServiceTokens) | **POST** /fabric/v4/serviceTokens/search | Search servicetokens |
| [**updateServiceTokenByUuid**](ServiceTokensApi.md#updateServiceTokenByUuid) | **PATCH** /fabric/v4/serviceTokens/{serviceTokenId} | Update Token By ID |


<a id="createServiceToken"></a>
# **createServiceToken**
> ServiceToken createServiceToken(serviceToken, dryRun)

Create Service Token

Create Service Tokens generates Equinix Fabric? service tokens. These tokens authorize users to access protected resources and services.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ServiceTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceTokensApi apiInstance = new ServiceTokensApi(defaultClient);
    ServiceToken serviceToken = new ServiceToken(); // ServiceToken | 
    Boolean dryRun = false; // Boolean | option to verify that API calls will succeed
    try {
      ServiceToken result = apiInstance.createServiceToken(serviceToken, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceTokensApi#createServiceToken");
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
| **serviceToken** | [**ServiceToken**](ServiceToken.md)|  | |
| **dryRun** | **Boolean**| option to verify that API calls will succeed | [optional] [default to false] |

### Return type

[**ServiceToken**](ServiceToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **201** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="createServiceTokenAction"></a>
# **createServiceTokenAction**
> ServiceToken createServiceTokenAction(serviceTokenId, serviceTokenActionRequest)

ServiceToken Actions

This API provides capability to accept/reject user&#39;s servicetokens

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ServiceTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceTokensApi apiInstance = new ServiceTokensApi(defaultClient);
    UUID serviceTokenId = UUID.randomUUID(); // UUID | Service Token UUID
    ServiceTokenActionRequest serviceTokenActionRequest = new ServiceTokenActionRequest(); // ServiceTokenActionRequest | 
    try {
      ServiceToken result = apiInstance.createServiceTokenAction(serviceTokenId, serviceTokenActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceTokensApi#createServiceTokenAction");
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
| **serviceTokenId** | **UUID**| Service Token UUID | |
| **serviceTokenActionRequest** | [**ServiceTokenActionRequest**](ServiceTokenActionRequest.md)|  | |

### Return type

[**ServiceToken**](ServiceToken.md)

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

<a id="deleteServiceTokenByUuid"></a>
# **deleteServiceTokenByUuid**
> ServiceToken deleteServiceTokenByUuid(serviceTokenId)

Delete Token by uuid

Delete Service Tokens removes an Equinix Fabric service token corresponding to the specified uuid which are in INACTIVE state.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ServiceTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceTokensApi apiInstance = new ServiceTokensApi(defaultClient);
    UUID serviceTokenId = UUID.randomUUID(); // UUID | Service Token UUID
    try {
      ServiceToken result = apiInstance.deleteServiceTokenByUuid(serviceTokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceTokensApi#deleteServiceTokenByUuid");
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
| **serviceTokenId** | **UUID**| Service Token UUID | |

### Return type

[**ServiceToken**](ServiceToken.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getServiceTokenByUuid"></a>
# **getServiceTokenByUuid**
> ServiceToken getServiceTokenByUuid(serviceTokenId)

Get Token by uuid

Get Specified Service Tokens uses the uuid of an Equinix Fabric service token to return details about the token&#39;s type, state, location, bandwidth, and other key properties.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ServiceTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceTokensApi apiInstance = new ServiceTokensApi(defaultClient);
    UUID serviceTokenId = UUID.randomUUID(); // UUID | Service Token UUID
    try {
      ServiceToken result = apiInstance.getServiceTokenByUuid(serviceTokenId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceTokensApi#getServiceTokenByUuid");
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
| **serviceTokenId** | **UUID**| Service Token UUID | |

### Return type

[**ServiceToken**](ServiceToken.md)

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
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getServiceTokens"></a>
# **getServiceTokens**
> ServiceTokens getServiceTokens(offset, limit)

Get All Tokens

Get All ServiceTokens creates a list of all Equinix Fabric service tokens associated with the subscriber&#39;s account.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ServiceTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceTokensApi apiInstance = new ServiceTokensApi(defaultClient);
    BigDecimal offset = new BigDecimal(78); // BigDecimal | offset
    BigDecimal limit = new BigDecimal(78); // BigDecimal | number of records to fetch
    try {
      ServiceTokens result = apiInstance.getServiceTokens(offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceTokensApi#getServiceTokens");
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
| **offset** | **BigDecimal**| offset | [optional] |
| **limit** | **BigDecimal**| number of records to fetch | [optional] |

### Return type

[**ServiceTokens**](ServiceTokens.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **403** | Forbidden |  -  |

<a id="searchServiceTokens"></a>
# **searchServiceTokens**
> ServiceTokens searchServiceTokens(serviceTokenSearchRequest, offset, limit)

Search servicetokens

The API provides capability to get list of user&#39;s servicetokens using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ServiceTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceTokensApi apiInstance = new ServiceTokensApi(defaultClient);
    ServiceTokenSearchRequest serviceTokenSearchRequest = new ServiceTokenSearchRequest(); // ServiceTokenSearchRequest | 
    BigDecimal offset = new BigDecimal(78); // BigDecimal | offset
    BigDecimal limit = new BigDecimal(78); // BigDecimal | number of records to fetch
    try {
      ServiceTokens result = apiInstance.searchServiceTokens(serviceTokenSearchRequest, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceTokensApi#searchServiceTokens");
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
| **serviceTokenSearchRequest** | [**ServiceTokenSearchRequest**](ServiceTokenSearchRequest.md)|  | |
| **offset** | **BigDecimal**| offset | [optional] |
| **limit** | **BigDecimal**| number of records to fetch | [optional] |

### Return type

[**ServiceTokens**](ServiceTokens.md)

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="updateServiceTokenByUuid"></a>
# **updateServiceTokenByUuid**
> ServiceToken updateServiceTokenByUuid(serviceTokenId, serviceTokenChangeOperation, dryRun)

Update Token By ID

This API provides capability to update user&#39;s Service Token

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ServiceTokensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ServiceTokensApi apiInstance = new ServiceTokensApi(defaultClient);
    UUID serviceTokenId = UUID.randomUUID(); // UUID | Service Token UUID
    List<ServiceTokenChangeOperation> serviceTokenChangeOperation = Arrays.asList(); // List<ServiceTokenChangeOperation> | 
    Boolean dryRun = false; // Boolean | option to verify that API calls will succeed
    try {
      ServiceToken result = apiInstance.updateServiceTokenByUuid(serviceTokenId, serviceTokenChangeOperation, dryRun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceTokensApi#updateServiceTokenByUuid");
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
| **serviceTokenId** | **UUID**| Service Token UUID | |
| **serviceTokenChangeOperation** | [**List&lt;ServiceTokenChangeOperation&gt;**](ServiceTokenChangeOperation.md)|  | |
| **dryRun** | **Boolean**| option to verify that API calls will succeed | [optional] [default to false] |

### Return type

[**ServiceToken**](ServiceToken.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

