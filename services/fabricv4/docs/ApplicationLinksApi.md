# ApplicationLinksApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachAppDomainToAppLink**](ApplicationLinksApi.md#attachAppDomainToAppLink) | **PUT** /fabric/v4/appLinks/{appLinkId}/appDomains/{appDomainId} | Attach App Domain to App Link |
| [**attachAppServiceToAppLink**](ApplicationLinksApi.md#attachAppServiceToAppLink) | **PUT** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Attach App Service to App Link |
| [**createAppLink**](ApplicationLinksApi.md#createAppLink) | **POST** /fabric/v4/appLinks | Create App Link |
| [**deleteAppLinkByUuid**](ApplicationLinksApi.md#deleteAppLinkByUuid) | **DELETE** /fabric/v4/appLinks/{appLinkId} | Delete App Link |
| [**detachAppDomainFromAppLink**](ApplicationLinksApi.md#detachAppDomainFromAppLink) | **DELETE** /fabric/v4/appLinks/{appLinkId}/appDomains/{appDomainId} | Detach App Domain from App Link |
| [**detachAppServiceFromAppLink**](ApplicationLinksApi.md#detachAppServiceFromAppLink) | **DELETE** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Detach App Service from App Link |
| [**getAppLinkByUuid**](ApplicationLinksApi.md#getAppLinkByUuid) | **GET** /fabric/v4/appLinks/{appLinkId} | Get App Link |
| [**getAttachedAppDomainByUuid**](ApplicationLinksApi.md#getAttachedAppDomainByUuid) | **GET** /fabric/v4/appLinks/{appLinkId}/appDomains/{appDomainId} | Get attached App Domain for App Link |
| [**getAttachedAppDomainsByAppLinkId**](ApplicationLinksApi.md#getAttachedAppDomainsByAppLinkId) | **GET** /fabric/v4/appLinks/{appLinkId}/appDomains | Get attached App Domains for App Link |
| [**getAttachedAppServiceByUuid**](ApplicationLinksApi.md#getAttachedAppServiceByUuid) | **GET** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Get attached App Service for App Link |
| [**getAttachedAppServicesByAppLinkId**](ApplicationLinksApi.md#getAttachedAppServicesByAppLinkId) | **GET** /fabric/v4/appLinks/{appLinkId}/appServices | Get attached App Services for App Link |
| [**searchAppLinks**](ApplicationLinksApi.md#searchAppLinks) | **POST** /fabric/v4/appLinks/search | Search App Links |
| [**searchAttachedAppDomains**](ApplicationLinksApi.md#searchAttachedAppDomains) | **POST** /fabric/v4/appLinks/{appLinkId}/appDomains/search | Search attached App Domain to App Link |
| [**searchAttachedAppServices**](ApplicationLinksApi.md#searchAttachedAppServices) | **POST** /fabric/v4/appLinks/{appLinkId}/appServices/search | Search attached App Service to App Link |
| [**updateAppLinkByUuid**](ApplicationLinksApi.md#updateAppLinkByUuid) | **PATCH** /fabric/v4/appLinks/{appLinkId} | Update App Link |
| [**updateAppServiceAttachmentToAppLink**](ApplicationLinksApi.md#updateAppServiceAttachmentToAppLink) | **PATCH** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Update App Service attachment to App Link |


<a id="attachAppDomainToAppLink"></a>
# **attachAppDomainToAppLink**
> AppLinkAppDomainAttachment attachAppDomainToAppLink(appLinkId, appDomainId)

Attach App Domain to App Link

This API provides ability to attach the user&#39;s App Domain to App Link.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    UUID appDomainId = UUID.randomUUID(); // UUID | App Domain UUID
    try {
      AppLinkAppDomainAttachment result = apiInstance.attachAppDomainToAppLink(appLinkId, appDomainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#attachAppDomainToAppLink");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appDomainId** | **UUID**| App Domain UUID | |

### Return type

[**AppLinkAppDomainAttachment**](AppLinkAppDomainAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Attach App Domain object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="attachAppServiceToAppLink"></a>
# **attachAppServiceToAppLink**
> AppLinkAppServiceAttachment attachAppServiceToAppLink(appLinkId, appServiceId, appLinkAttachServiceRequest)

Attach App Service to App Link

This API provides ability to attach the user&#39;s App Service to App Link.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    AppLinkAttachServiceRequest appLinkAttachServiceRequest = new AppLinkAttachServiceRequest(); // AppLinkAttachServiceRequest | 
    try {
      AppLinkAppServiceAttachment result = apiInstance.attachAppServiceToAppLink(appLinkId, appServiceId, appLinkAttachServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#attachAppServiceToAppLink");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appServiceId** | **UUID**| App Service UUID | |
| **appLinkAttachServiceRequest** | [**AppLinkAttachServiceRequest**](AppLinkAttachServiceRequest.md)|  | |

### Return type

[**AppLinkAppServiceAttachment**](AppLinkAppServiceAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Attach App Service object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="createAppLink"></a>
# **createAppLink**
> AppLink createAppLink(appLinkPostRequest)

Create App Link

This API provides capability to create user&#39;s App Link

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    AppLinkPostRequest appLinkPostRequest = new AppLinkPostRequest(); // AppLinkPostRequest | 
    try {
      AppLink result = apiInstance.createAppLink(appLinkPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#createAppLink");
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
| **appLinkPostRequest** | [**AppLinkPostRequest**](AppLinkPostRequest.md)|  | |

### Return type

[**AppLink**](AppLink.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Link object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteAppLinkByUuid"></a>
# **deleteAppLinkByUuid**
> AppLink deleteAppLinkByUuid(appLinkId)

Delete App Link

This API provides capability to delete user&#39;s App Link

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    try {
      AppLink result = apiInstance.deleteAppLinkByUuid(appLinkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#deleteAppLinkByUuid");
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
| **appLinkId** | **UUID**| App Link UUID | |

### Return type

[**AppLink**](AppLink.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Link object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="detachAppDomainFromAppLink"></a>
# **detachAppDomainFromAppLink**
> AppLinkAppDomainAttachment detachAppDomainFromAppLink(appLinkId, appDomainId)

Detach App Domain from App Link

This API provides ability to detach App Domain from App Link

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    UUID appDomainId = UUID.randomUUID(); // UUID | App Domain UUID
    try {
      AppLinkAppDomainAttachment result = apiInstance.detachAppDomainFromAppLink(appLinkId, appDomainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#detachAppDomainFromAppLink");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appDomainId** | **UUID**| App Domain UUID | |

### Return type

[**AppLinkAppDomainAttachment**](AppLinkAppDomainAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Detach App Domain object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="detachAppServiceFromAppLink"></a>
# **detachAppServiceFromAppLink**
> AppLinkAppServiceAttachment detachAppServiceFromAppLink(appLinkId, appServiceId)

Detach App Service from App Link

This API provides ability to detach App Service from App Link

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    try {
      AppLinkAppServiceAttachment result = apiInstance.detachAppServiceFromAppLink(appLinkId, appServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#detachAppServiceFromAppLink");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appServiceId** | **UUID**| App Service UUID | |

### Return type

[**AppLinkAppServiceAttachment**](AppLinkAppServiceAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Detach App Service object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAppLinkByUuid"></a>
# **getAppLinkByUuid**
> AppLink getAppLinkByUuid(appLinkId)

Get App Link

This API provides capability to retrieve user&#39;s App Link

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    try {
      AppLink result = apiInstance.getAppLinkByUuid(appLinkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#getAppLinkByUuid");
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
| **appLinkId** | **UUID**| App Link UUID | |

### Return type

[**AppLink**](AppLink.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | App Link object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAttachedAppDomainByUuid"></a>
# **getAttachedAppDomainByUuid**
> AppLinkAppDomainAttachment getAttachedAppDomainByUuid(appLinkId, appDomainId)

Get attached App Domain for App Link

This API provides ability to retrieve an App Domain attached to an App Link.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    UUID appDomainId = UUID.randomUUID(); // UUID | App Domain UUID
    try {
      AppLinkAppDomainAttachment result = apiInstance.getAttachedAppDomainByUuid(appLinkId, appDomainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#getAttachedAppDomainByUuid");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appDomainId** | **UUID**| App Domain UUID | |

### Return type

[**AppLinkAppDomainAttachment**](AppLinkAppDomainAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attached App Domain object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAttachedAppDomainsByAppLinkId"></a>
# **getAttachedAppDomainsByAppLinkId**
> AppLinkAttachedAppDomains getAttachedAppDomainsByAppLinkId(appLinkId, offset, limit, attachmentStatus, order, style)

Get attached App Domains for App Link

This API provides capability to retrieve App Domains attached to an App Link.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    List<AppLinkAttachState> attachmentStatus = Arrays.asList(); // List<AppLinkAttachState> | Filter attached App Domains by one or more attachment lifecycle states.
    AttachedAppDomainOrder order = AttachedAppDomainOrder.fromValue("DESC"); // AttachedAppDomainOrder | Sort order for attached App Domains.
    Style style = Style.fromValue("MIN"); // Style | Detail level of the response.
    try {
      AppLinkAttachedAppDomains result = apiInstance.getAttachedAppDomainsByAppLinkId(appLinkId, offset, limit, attachmentStatus, order, style);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#getAttachedAppDomainsByAppLinkId");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |
| **attachmentStatus** | [**List&lt;AppLinkAttachState&gt;**](AppLinkAttachState.md)| Filter attached App Domains by one or more attachment lifecycle states. | [optional] |
| **order** | [**AttachedAppDomainOrder**](.md)| Sort order for attached App Domains. | [optional] [default to DESC] [enum: DESC, ASC] |
| **style** | [**Style**](.md)| Detail level of the response. | [optional] [default to MEDIUM] [enum: MIN, MEDIUM, FULL] |

### Return type

[**AppLinkAttachedAppDomains**](AppLinkAttachedAppDomains.md)

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

<a id="getAttachedAppServiceByUuid"></a>
# **getAttachedAppServiceByUuid**
> AppLinkAppServiceAttachment getAttachedAppServiceByUuid(appLinkId, appServiceId)

Get attached App Service for App Link

This API provides ability to retrieve an App Service attached to an App Link.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    try {
      AppLinkAppServiceAttachment result = apiInstance.getAttachedAppServiceByUuid(appLinkId, appServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#getAttachedAppServiceByUuid");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appServiceId** | **UUID**| App Service UUID | |

### Return type

[**AppLinkAppServiceAttachment**](AppLinkAppServiceAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Attached App Service object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAttachedAppServicesByAppLinkId"></a>
# **getAttachedAppServicesByAppLinkId**
> AppLinkAttachedAppServices getAttachedAppServicesByAppLinkId(appLinkId, offset, limit, attachmentStatus, order, style)

Get attached App Services for App Link

This API provides capability to retrieve App Services attached to an App Link.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    List<AppLinkAttachState> attachmentStatus = Arrays.asList(); // List<AppLinkAttachState> | Filter attached App Services by one or more attachment lifecycle states.
    AttachedAppServiceOrder order = AttachedAppServiceOrder.fromValue("DESC"); // AttachedAppServiceOrder | Sort order for attached App Services.
    Style style = Style.fromValue("MIN"); // Style | Detail level of the response.
    try {
      AppLinkAttachedAppServices result = apiInstance.getAttachedAppServicesByAppLinkId(appLinkId, offset, limit, attachmentStatus, order, style);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#getAttachedAppServicesByAppLinkId");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |
| **attachmentStatus** | [**List&lt;AppLinkAttachState&gt;**](AppLinkAttachState.md)| Filter attached App Services by one or more attachment lifecycle states. | [optional] |
| **order** | [**AttachedAppServiceOrder**](.md)| Sort order for attached App Services. | [optional] [default to DESC] [enum: DESC, ASC] |
| **style** | [**Style**](.md)| Detail level of the response. | [optional] [default to MEDIUM] [enum: MIN, MEDIUM, FULL] |

### Return type

[**AppLinkAttachedAppServices**](AppLinkAttachedAppServices.md)

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

<a id="searchAppLinks"></a>
# **searchAppLinks**
> AppLinkSearchResponse searchAppLinks(appLinkSearchRequest)

Search App Links

The API provides capability to get list of user&#39;s App Links using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    AppLinkSearchRequest appLinkSearchRequest = new AppLinkSearchRequest(); // AppLinkSearchRequest | 
    try {
      AppLinkSearchResponse result = apiInstance.searchAppLinks(appLinkSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#searchAppLinks");
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
| **appLinkSearchRequest** | [**AppLinkSearchRequest**](AppLinkSearchRequest.md)|  | |

### Return type

[**AppLinkSearchResponse**](AppLinkSearchResponse.md)

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

<a id="searchAttachedAppDomains"></a>
# **searchAttachedAppDomains**
> AppLinkAttachDomainSearchResponse searchAttachedAppDomains(appLinkId, appLinkAttachDomainSearchRequest)

Search attached App Domain to App Link

The API provides capability to get list of user&#39;s attached App Domains using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    AppLinkAttachDomainSearchRequest appLinkAttachDomainSearchRequest = new AppLinkAttachDomainSearchRequest(); // AppLinkAttachDomainSearchRequest | 
    try {
      AppLinkAttachDomainSearchResponse result = apiInstance.searchAttachedAppDomains(appLinkId, appLinkAttachDomainSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#searchAttachedAppDomains");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appLinkAttachDomainSearchRequest** | [**AppLinkAttachDomainSearchRequest**](AppLinkAttachDomainSearchRequest.md)|  | |

### Return type

[**AppLinkAttachDomainSearchResponse**](AppLinkAttachDomainSearchResponse.md)

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

<a id="searchAttachedAppServices"></a>
# **searchAttachedAppServices**
> AppLinkAttachServiceSearchResponse searchAttachedAppServices(appLinkId, appLinkAttachServiceSearchRequest)

Search attached App Service to App Link

The API provides capability to get list of user&#39;s attached App Services using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    AppLinkAttachServiceSearchRequest appLinkAttachServiceSearchRequest = new AppLinkAttachServiceSearchRequest(); // AppLinkAttachServiceSearchRequest | 
    try {
      AppLinkAttachServiceSearchResponse result = apiInstance.searchAttachedAppServices(appLinkId, appLinkAttachServiceSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#searchAttachedAppServices");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appLinkAttachServiceSearchRequest** | [**AppLinkAttachServiceSearchRequest**](AppLinkAttachServiceSearchRequest.md)|  | |

### Return type

[**AppLinkAttachServiceSearchResponse**](AppLinkAttachServiceSearchResponse.md)

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

<a id="updateAppLinkByUuid"></a>
# **updateAppLinkByUuid**
> AppLink updateAppLinkByUuid(appLinkId, appLinkChangeOperation)

Update App Link

This API provides capability to update user&#39;s App Link

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    List<AppLinkChangeOperation> appLinkChangeOperation = Arrays.asList(); // List<AppLinkChangeOperation> | 
    try {
      AppLink result = apiInstance.updateAppLinkByUuid(appLinkId, appLinkChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#updateAppLinkByUuid");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appLinkChangeOperation** | [**List&lt;AppLinkChangeOperation&gt;**](AppLinkChangeOperation.md)|  | |

### Return type

[**AppLink**](AppLink.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Link object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="updateAppServiceAttachmentToAppLink"></a>
# **updateAppServiceAttachmentToAppLink**
> AppLinkAppServiceAttachment updateAppServiceAttachmentToAppLink(appLinkId, appServiceId, appLinkAppServiceAttachmentChangeOperation)

Update App Service attachment to App Link

This API provides ability to update the App Service attachment to App Link.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationLinksApi apiInstance = new ApplicationLinksApi(defaultClient);
    UUID appLinkId = UUID.randomUUID(); // UUID | App Link UUID
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    List<AppLinkAppServiceAttachmentChangeOperation> appLinkAppServiceAttachmentChangeOperation = Arrays.asList(); // List<AppLinkAppServiceAttachmentChangeOperation> | 
    try {
      AppLinkAppServiceAttachment result = apiInstance.updateAppServiceAttachmentToAppLink(appLinkId, appServiceId, appLinkAppServiceAttachmentChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#updateAppServiceAttachmentToAppLink");
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
| **appLinkId** | **UUID**| App Link UUID | |
| **appServiceId** | **UUID**| App Service UUID | |
| **appLinkAppServiceAttachmentChangeOperation** | [**List&lt;AppLinkAppServiceAttachmentChangeOperation&gt;**](AppLinkAppServiceAttachmentChangeOperation.md)|  | |

### Return type

[**AppLinkAppServiceAttachment**](AppLinkAppServiceAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Update App Service attachment object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

