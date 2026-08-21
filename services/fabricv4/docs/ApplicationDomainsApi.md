# ApplicationDomainsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppDomain**](ApplicationDomainsApi.md#createAppDomain) | **POST** /fabric/v4/appDomains | Create App Domain |
| [**deleteAppDomainByUuid**](ApplicationDomainsApi.md#deleteAppDomainByUuid) | **DELETE** /fabric/v4/appDomains/{appDomainId} | Delete App Domain |
| [**getAppDomainByUuid**](ApplicationDomainsApi.md#getAppDomainByUuid) | **GET** /fabric/v4/appDomains/{appDomainId} | Get App Domain |
| [**getAttachedAppLinksByAppDomainId**](ApplicationDomainsApi.md#getAttachedAppLinksByAppDomainId) | **GET** /fabric/v4/appDomains/{appDomainId}/appLinks | Get attached App Links for App Domain |
| [**searchAppDomains**](ApplicationDomainsApi.md#searchAppDomains) | **POST** /fabric/v4/appDomains/search | Search App Domains |
| [**updateAppDomainByUuid**](ApplicationDomainsApi.md#updateAppDomainByUuid) | **PATCH** /fabric/v4/appDomains/{appDomainId} | Update App Domain |


<a id="createAppDomain"></a>
# **createAppDomain**
> AppDomain createAppDomain(appDomainPostRequest)

Create App Domain

This API provides capability to create user&#39;s App Domain

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationDomainsApi apiInstance = new ApplicationDomainsApi(defaultClient);
    AppDomainPostRequest appDomainPostRequest = new AppDomainPostRequest(); // AppDomainPostRequest | 
    try {
      AppDomain result = apiInstance.createAppDomain(appDomainPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationDomainsApi#createAppDomain");
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
| **appDomainPostRequest** | [**AppDomainPostRequest**](AppDomainPostRequest.md)|  | |

### Return type

[**AppDomain**](AppDomain.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Domain object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteAppDomainByUuid"></a>
# **deleteAppDomainByUuid**
> AppDomain deleteAppDomainByUuid(appDomainId)

Delete App Domain

This API provides capability to delete user&#39;s App Domain

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationDomainsApi apiInstance = new ApplicationDomainsApi(defaultClient);
    UUID appDomainId = UUID.randomUUID(); // UUID | App Domain UUID
    try {
      AppDomain result = apiInstance.deleteAppDomainByUuid(appDomainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationDomainsApi#deleteAppDomainByUuid");
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
| **appDomainId** | **UUID**| App Domain UUID | |

### Return type

[**AppDomain**](AppDomain.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Domain object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAppDomainByUuid"></a>
# **getAppDomainByUuid**
> AppDomain getAppDomainByUuid(appDomainId)

Get App Domain

This API provides capability to retrieve user&#39;s App Domain

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationDomainsApi apiInstance = new ApplicationDomainsApi(defaultClient);
    UUID appDomainId = UUID.randomUUID(); // UUID | App Domain UUID
    try {
      AppDomain result = apiInstance.getAppDomainByUuid(appDomainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationDomainsApi#getAppDomainByUuid");
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
| **appDomainId** | **UUID**| App Domain UUID | |

### Return type

[**AppDomain**](AppDomain.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | App Domain object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAttachedAppLinksByAppDomainId"></a>
# **getAttachedAppLinksByAppDomainId**
> AppDomainAttachedAppLinks getAttachedAppLinksByAppDomainId(appDomainId, offset, limit, state, order, style)

Get attached App Links for App Domain

This API provides capability to retrieve App Links attached to an App Domain.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationDomainsApi apiInstance = new ApplicationDomainsApi(defaultClient);
    UUID appDomainId = UUID.randomUUID(); // UUID | App Domain UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    List<AppLinkState> state = Arrays.asList(); // List<AppLinkState> | Filter attached App Links by one or more lifecycle states.
    AttachedAppLinkOrder order = AttachedAppLinkOrder.fromValue("DESC"); // AttachedAppLinkOrder | Sort order for attached App Links.
    Style style = Style.fromValue("MIN"); // Style | Detail level of the response.
    try {
      AppDomainAttachedAppLinks result = apiInstance.getAttachedAppLinksByAppDomainId(appDomainId, offset, limit, state, order, style);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationDomainsApi#getAttachedAppLinksByAppDomainId");
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
| **appDomainId** | **UUID**| App Domain UUID | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |
| **state** | [**List&lt;AppLinkState&gt;**](AppLinkState.md)| Filter attached App Links by one or more lifecycle states. | [optional] |
| **order** | [**AttachedAppLinkOrder**](.md)| Sort order for attached App Links. | [optional] [default to DESC] [enum: DESC, ASC] |
| **style** | [**Style**](.md)| Detail level of the response. | [optional] [default to MEDIUM] [enum: MIN, MEDIUM, FULL] |

### Return type

[**AppDomainAttachedAppLinks**](AppDomainAttachedAppLinks.md)

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
| **500** | Internal server error |  -  |

<a id="searchAppDomains"></a>
# **searchAppDomains**
> AppDomainSearchResponse searchAppDomains(appDomainSearchRequest)

Search App Domains

The API provides capability to get list of user&#39;s App Domains using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationDomainsApi apiInstance = new ApplicationDomainsApi(defaultClient);
    AppDomainSearchRequest appDomainSearchRequest = new AppDomainSearchRequest(); // AppDomainSearchRequest | 
    try {
      AppDomainSearchResponse result = apiInstance.searchAppDomains(appDomainSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationDomainsApi#searchAppDomains");
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
| **appDomainSearchRequest** | [**AppDomainSearchRequest**](AppDomainSearchRequest.md)|  | |

### Return type

[**AppDomainSearchResponse**](AppDomainSearchResponse.md)

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

<a id="updateAppDomainByUuid"></a>
# **updateAppDomainByUuid**
> AppDomain updateAppDomainByUuid(appDomainId, appDomainChangeOperation)

Update App Domain

This API provides capability to update user&#39;s App Domain

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationDomainsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationDomainsApi apiInstance = new ApplicationDomainsApi(defaultClient);
    UUID appDomainId = UUID.randomUUID(); // UUID | App Domain UUID
    List<AppDomainChangeOperation> appDomainChangeOperation = Arrays.asList(); // List<AppDomainChangeOperation> | 
    try {
      AppDomain result = apiInstance.updateAppDomainByUuid(appDomainId, appDomainChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationDomainsApi#updateAppDomainByUuid");
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
| **appDomainId** | **UUID**| App Domain UUID | |
| **appDomainChangeOperation** | [**List&lt;AppDomainChangeOperation&gt;**](AppDomainChangeOperation.md)|  | |

### Return type

[**AppDomain**](AppDomain.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Domain object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

