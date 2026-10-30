# ApplicationLinksApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachAppDomainToAppLink**](ApplicationLinksApi.md#attachAppDomainToAppLink) | **PUT** /fabric/v4/appLinks/{appLinkId}/appDomains/{appDomainId} | Attach Domain to Link |
| [**attachAppProcessorToAppLink**](ApplicationLinksApi.md#attachAppProcessorToAppLink) | **PUT** /fabric/v4/appLinks/{appLinkId}/appProcessors/{appProcessorId} | Attach Processor to Link |
| [**attachAppServiceToAppLink**](ApplicationLinksApi.md#attachAppServiceToAppLink) | **PUT** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Attach Service to Link |
| [**createAppLink**](ApplicationLinksApi.md#createAppLink) | **POST** /fabric/v4/appLinks | Create Link |
| [**deleteAppLinkByUuid**](ApplicationLinksApi.md#deleteAppLinkByUuid) | **DELETE** /fabric/v4/appLinks/{appLinkId} | Delete Link |
| [**detachAppDomainFromAppLink**](ApplicationLinksApi.md#detachAppDomainFromAppLink) | **DELETE** /fabric/v4/appLinks/{appLinkId}/appDomains/{appDomainId} | Detach Domain from Link |
| [**detachAppProcessorFromAppLink**](ApplicationLinksApi.md#detachAppProcessorFromAppLink) | **DELETE** /fabric/v4/appLinks/{appLinkId}/appProcessors/{appProcessorId} | Detach App Processor from App Link |
| [**detachAppServiceFromAppLink**](ApplicationLinksApi.md#detachAppServiceFromAppLink) | **DELETE** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Detach Service from Link |
| [**getAppLinkByUuid**](ApplicationLinksApi.md#getAppLinkByUuid) | **GET** /fabric/v4/appLinks/{appLinkId} | Get Link |
| [**getAttachedAppDomainByUuid**](ApplicationLinksApi.md#getAttachedAppDomainByUuid) | **GET** /fabric/v4/appLinks/{appLinkId}/appDomains/{appDomainId} | Get Attached Domain for Link |
| [**getAttachedAppDomainsByAppLinkId**](ApplicationLinksApi.md#getAttachedAppDomainsByAppLinkId) | **GET** /fabric/v4/appLinks/{appLinkId}/appDomains | Get Attached Domains for Link |
| [**getAttachedAppProcessor**](ApplicationLinksApi.md#getAttachedAppProcessor) | **GET** /fabric/v4/appLinks/{appLinkId}/appProcessors/{appProcessorId} | Get attached App Processor for App Link |
| [**getAttachedAppProcessorsByAppLinkId**](ApplicationLinksApi.md#getAttachedAppProcessorsByAppLinkId) | **GET** /fabric/v4/appLinks/{appLinkId}/appProcessors | Get attached Processors for Link |
| [**getAttachedAppServiceByUuid**](ApplicationLinksApi.md#getAttachedAppServiceByUuid) | **GET** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Get Attached Service for Link |
| [**getAttachedAppServicesByAppLinkId**](ApplicationLinksApi.md#getAttachedAppServicesByAppLinkId) | **GET** /fabric/v4/appLinks/{appLinkId}/appServices | Get Attached Services for Link |
| [**searchAppLinks**](ApplicationLinksApi.md#searchAppLinks) | **POST** /fabric/v4/appLinks/search | Search Links |
| [**searchAttachedAppDomains**](ApplicationLinksApi.md#searchAttachedAppDomains) | **POST** /fabric/v4/appLinks/{appLinkId}/appDomains/search | Search Attached Domains for Link |
| [**searchAttachedAppProcessors**](ApplicationLinksApi.md#searchAttachedAppProcessors) | **POST** /fabric/v4/appLinks/{appLinkId}/appProcessors/search | Search attached Processors to Link |
| [**searchAttachedAppServices**](ApplicationLinksApi.md#searchAttachedAppServices) | **POST** /fabric/v4/appLinks/{appLinkId}/appServices/search | Search Attached Services for Link |
| [**updateAppLinkByUuid**](ApplicationLinksApi.md#updateAppLinkByUuid) | **PATCH** /fabric/v4/appLinks/{appLinkId} | Update Link |
| [**updateAppServiceAttachmentToAppLink**](ApplicationLinksApi.md#updateAppServiceAttachmentToAppLink) | **PATCH** /fabric/v4/appLinks/{appLinkId}/appServices/{appServiceId} | Update Service Attachment for Link |


<a id="attachAppDomainToAppLink"></a>
# **attachAppDomainToAppLink**
> AppLinkAppDomainAttachment attachAppDomainToAppLink(appLinkId, appDomainId)

Attach Domain to Link

This API provides ability to attach the user&#39;s App Domain to App Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appDomainId = UUID.fromString("20f3ef8e-d670-4236-86fa-bb0038adcfc3"); // UUID | App Domain UUID
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

<a id="attachAppProcessorToAppLink"></a>
# **attachAppProcessorToAppLink**
> AppLinkAppProcessorAttachment attachAppProcessorToAppLink(appLinkId, appProcessorId, appLinkAttachProcessorRequest)

Attach Processor to Link

This API provides ability to attach an App Processor to an App Link.

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appProcessorId = UUID.fromString("90ee425c-9988-454c-96d9-1128bc16350f"); // UUID | App Processor UUID
    AppLinkAttachProcessorRequest appLinkAttachProcessorRequest = new AppLinkAttachProcessorRequest(); // AppLinkAttachProcessorRequest | 
    try {
      AppLinkAppProcessorAttachment result = apiInstance.attachAppProcessorToAppLink(appLinkId, appProcessorId, appLinkAttachProcessorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#attachAppProcessorToAppLink");
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
| **appProcessorId** | **UUID**| App Processor UUID | |
| **appLinkAttachProcessorRequest** | [**AppLinkAttachProcessorRequest**](AppLinkAttachProcessorRequest.md)|  | |

### Return type

[**AppLinkAppProcessorAttachment**](AppLinkAppProcessorAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Attach App Processor object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="attachAppServiceToAppLink"></a>
# **attachAppServiceToAppLink**
> AppLinkAppServiceAttachment attachAppServiceToAppLink(appLinkId, appServiceId, appLinkAttachServiceRequest)

Attach Service to Link

This API provides ability to attach the user&#39;s App Service to App Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appServiceId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | App Service UUID
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

Create Link

This API provides capability to create user&#39;s Link

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

Delete Link

This API provides capability to delete user&#39;s Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
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

Detach Domain from Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appDomainId = UUID.fromString("20f3ef8e-d670-4236-86fa-bb0038adcfc3"); // UUID | App Domain UUID
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

<a id="detachAppProcessorFromAppLink"></a>
# **detachAppProcessorFromAppLink**
> AppLinkAppProcessorAttachment detachAppProcessorFromAppLink(appLinkId, appProcessorId)

Detach App Processor from App Link

This API provides ability to detach an App Processor from an App Link.

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appProcessorId = UUID.fromString("90ee425c-9988-454c-96d9-1128bc16350f"); // UUID | App Processor UUID
    try {
      AppLinkAppProcessorAttachment result = apiInstance.detachAppProcessorFromAppLink(appLinkId, appProcessorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#detachAppProcessorFromAppLink");
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
| **appProcessorId** | **UUID**| App Processor UUID | |

### Return type

[**AppLinkAppProcessorAttachment**](AppLinkAppProcessorAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Detach App Processor object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="detachAppServiceFromAppLink"></a>
# **detachAppServiceFromAppLink**
> AppLinkAppServiceAttachment detachAppServiceFromAppLink(appLinkId, appServiceId)

Detach Service from Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appServiceId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | App Service UUID
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

Get Link

This API provides capability to retrieve user&#39;s Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
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

Get Attached Domain for Link

This API provides ability to retrieve an App Domain attached to an App Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appDomainId = UUID.fromString("20f3ef8e-d670-4236-86fa-bb0038adcfc3"); // UUID | App Domain UUID
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

Get Attached Domains for Link

This API provides capability to retrieve App Domains attached to an App Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
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

<a id="getAttachedAppProcessor"></a>
# **getAttachedAppProcessor**
> AppLinkAppProcessorAttachment getAttachedAppProcessor(appLinkId, appProcessorId)

Get attached App Processor for App Link

This API provides ability to get an App Processor attached to an App Link.

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appProcessorId = UUID.fromString("90ee425c-9988-454c-96d9-1128bc16350f"); // UUID | App Processor UUID
    try {
      AppLinkAppProcessorAttachment result = apiInstance.getAttachedAppProcessor(appLinkId, appProcessorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#getAttachedAppProcessor");
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
| **appProcessorId** | **UUID**| App Processor UUID | |

### Return type

[**AppLinkAppProcessorAttachment**](AppLinkAppProcessorAttachment.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | App Processor attachment object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAttachedAppProcessorsByAppLinkId"></a>
# **getAttachedAppProcessorsByAppLinkId**
> AppLinkAttachedAppProcessors getAttachedAppProcessorsByAppLinkId(appLinkId, offset, limit, attachmentStatus, order, style)

Get attached Processors for Link

This API provides capability to retrieve App Processors attached to an App Link.

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    List<AppLinkAttachState> attachmentStatus = Arrays.asList(); // List<AppLinkAttachState> | Filter attached App Processors by one or more attachment lifecycle states.
    AttachedAppProcessorOrder order = AttachedAppProcessorOrder.fromValue("DESC"); // AttachedAppProcessorOrder | Sort order for attached App Processors.
    Style style = Style.fromValue("MIN"); // Style | Detail level of the response.
    try {
      AppLinkAttachedAppProcessors result = apiInstance.getAttachedAppProcessorsByAppLinkId(appLinkId, offset, limit, attachmentStatus, order, style);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#getAttachedAppProcessorsByAppLinkId");
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
| **attachmentStatus** | [**List&lt;AppLinkAttachState&gt;**](AppLinkAttachState.md)| Filter attached App Processors by one or more attachment lifecycle states. | [optional] |
| **order** | [**AttachedAppProcessorOrder**](.md)| Sort order for attached App Processors. | [optional] [default to DESC] [enum: DESC, ASC] |
| **style** | [**Style**](.md)| Detail level of the response. | [optional] [default to MEDIUM] [enum: MIN, MEDIUM, FULL] |

### Return type

[**AppLinkAttachedAppProcessors**](AppLinkAttachedAppProcessors.md)

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

Get Attached Service for Link

This API provides ability to retrieve an App Service attached to an App Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appServiceId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | App Service UUID
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

Get Attached Services for Link

This API provides capability to retrieve App Services attached to an App Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
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

Search Links

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

Search Attached Domains for Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
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

<a id="searchAttachedAppProcessors"></a>
# **searchAttachedAppProcessors**
> AppLinkAttachProcessorSearchResponse searchAttachedAppProcessors(appLinkId, appLinkAttachProcessorSearchRequest)

Search attached Processors to Link

The API provides capability to get list of App Processors attached to an App Link using search criteria, including optional filtering, pagination and sorting

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    AppLinkAttachProcessorSearchRequest appLinkAttachProcessorSearchRequest = new AppLinkAttachProcessorSearchRequest(); // AppLinkAttachProcessorSearchRequest | 
    try {
      AppLinkAttachProcessorSearchResponse result = apiInstance.searchAttachedAppProcessors(appLinkId, appLinkAttachProcessorSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationLinksApi#searchAttachedAppProcessors");
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
| **appLinkAttachProcessorSearchRequest** | [**AppLinkAttachProcessorSearchRequest**](AppLinkAttachProcessorSearchRequest.md)|  | |

### Return type

[**AppLinkAttachProcessorSearchResponse**](AppLinkAttachProcessorSearchResponse.md)

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

Search Attached Services for Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
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

Update Link

This API provides capability to update user&#39;s Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
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

Update Service Attachment for Link

This API provides ability to update the App Service attachment to App Link

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
    UUID appLinkId = UUID.fromString("23cd19ab-d3bb-478b-9f25-bd12a3af1914"); // UUID | App Link UUID
    UUID appServiceId = UUID.fromString("557400f8-d360-11e9-bb65-2a2ae2dbcce4"); // UUID | App Service UUID
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

