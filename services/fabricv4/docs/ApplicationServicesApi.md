# ApplicationServicesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppService**](ApplicationServicesApi.md#createAppService) | **POST** /fabric/v4/appServices | Create App Service |
| [**deleteAppServiceByUuid**](ApplicationServicesApi.md#deleteAppServiceByUuid) | **DELETE** /fabric/v4/appServices/{appServiceId} | Delete App Service |
| [**getAppServiceByUuid**](ApplicationServicesApi.md#getAppServiceByUuid) | **GET** /fabric/v4/appServices/{appServiceId} | Get App Service |
| [**getAttachedAppLinksByAppServiceId**](ApplicationServicesApi.md#getAttachedAppLinksByAppServiceId) | **GET** /fabric/v4/appServices/{appServiceId}/appLinks | Get attached App Links for App Service |
| [**getAttachedAppSubscriptionsByAppServiceId**](ApplicationServicesApi.md#getAttachedAppSubscriptionsByAppServiceId) | **GET** /fabric/v4/appServices/{appServiceId}/appSubscriptions | Get attached App Subscriptions for App Service |
| [**searchAppServices**](ApplicationServicesApi.md#searchAppServices) | **POST** /fabric/v4/appServices/search | Search App Services |
| [**searchAttachedAppSubscriptionsByAppServiceId**](ApplicationServicesApi.md#searchAttachedAppSubscriptionsByAppServiceId) | **POST** /fabric/v4/appServices/{appServiceId}/appSubscriptions/search | Search attached App Subscriptions |
| [**updateAppServiceByUuid**](ApplicationServicesApi.md#updateAppServiceByUuid) | **PATCH** /fabric/v4/appServices/{appServiceId} | Update App Service |


<a id="createAppService"></a>
# **createAppService**
> AppService createAppService(appServicePostRequest)

Create App Service

This API provides capability to create user&#39;s App Service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    AppServicePostRequest appServicePostRequest = new AppServicePostRequest(); // AppServicePostRequest | 
    try {
      AppService result = apiInstance.createAppService(appServicePostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#createAppService");
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
| **appServicePostRequest** | [**AppServicePostRequest**](AppServicePostRequest.md)|  | |

### Return type

[**AppService**](AppService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Service object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteAppServiceByUuid"></a>
# **deleteAppServiceByUuid**
> AppService deleteAppServiceByUuid(appServiceId)

Delete App Service

This API provides capability to delete user&#39;s App Service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    try {
      AppService result = apiInstance.deleteAppServiceByUuid(appServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#deleteAppServiceByUuid");
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
| **appServiceId** | **UUID**| App Service UUID | |

### Return type

[**AppService**](AppService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Service object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAppServiceByUuid"></a>
# **getAppServiceByUuid**
> AppService getAppServiceByUuid(appServiceId)

Get App Service

This API provides capability to retrieve user&#39;s App Service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    try {
      AppService result = apiInstance.getAppServiceByUuid(appServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#getAppServiceByUuid");
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
| **appServiceId** | **UUID**| App Service UUID | |

### Return type

[**AppService**](AppService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | App Service object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAttachedAppLinksByAppServiceId"></a>
# **getAttachedAppLinksByAppServiceId**
> AppServiceAttachedAppLinks getAttachedAppLinksByAppServiceId(appServiceId, offset, limit, state, order, style)

Get attached App Links for App Service

This API provides capability to retrieve App Links attached to an App Service.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    List<AppLinkState> state = Arrays.asList(); // List<AppLinkState> | Filter attached App Links by one or more lifecycle states.
    AttachedAppLinkOrder order = AttachedAppLinkOrder.fromValue("DESC"); // AttachedAppLinkOrder | Sort order for attached App Links.
    Style style = Style.fromValue("MIN"); // Style | Detail level of the response.
    try {
      AppServiceAttachedAppLinks result = apiInstance.getAttachedAppLinksByAppServiceId(appServiceId, offset, limit, state, order, style);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#getAttachedAppLinksByAppServiceId");
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
| **appServiceId** | **UUID**| App Service UUID | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |
| **state** | [**List&lt;AppLinkState&gt;**](AppLinkState.md)| Filter attached App Links by one or more lifecycle states. | [optional] |
| **order** | [**AttachedAppLinkOrder**](.md)| Sort order for attached App Links. | [optional] [default to DESC] [enum: DESC, ASC] |
| **style** | [**Style**](.md)| Detail level of the response. | [optional] [default to MEDIUM] [enum: MIN, MEDIUM, FULL] |

### Return type

[**AppServiceAttachedAppLinks**](AppServiceAttachedAppLinks.md)

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

<a id="getAttachedAppSubscriptionsByAppServiceId"></a>
# **getAttachedAppSubscriptionsByAppServiceId**
> AppServiceAttachedAppSubscriptions getAttachedAppSubscriptionsByAppServiceId(appServiceId, offset, limit, state, order, style)

Get attached App Subscriptions for App Service

This API provides capability to retrieve App Subscriptions attached to an App Service.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    Integer offset = 1; // Integer | offset
    Integer limit = 10; // Integer | number of records to fetch
    List<AppSubscriptionState> state = Arrays.asList(); // List<AppSubscriptionState> | Filter attached App Subscriptions by one or more lifecycle states.
    AttachedAppSubscriptionOrder order = AttachedAppSubscriptionOrder.fromValue("DESC"); // AttachedAppSubscriptionOrder | Sort order for attached App Subscriptions.
    Style style = Style.fromValue("MIN"); // Style | Detail level of the response.
    try {
      AppServiceAttachedAppSubscriptions result = apiInstance.getAttachedAppSubscriptionsByAppServiceId(appServiceId, offset, limit, state, order, style);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#getAttachedAppSubscriptionsByAppServiceId");
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
| **appServiceId** | **UUID**| App Service UUID | |
| **offset** | **Integer**| offset | [optional] |
| **limit** | **Integer**| number of records to fetch | [optional] |
| **state** | [**List&lt;AppSubscriptionState&gt;**](AppSubscriptionState.md)| Filter attached App Subscriptions by one or more lifecycle states. | [optional] |
| **order** | [**AttachedAppSubscriptionOrder**](.md)| Sort order for attached App Subscriptions. | [optional] [default to DESC] [enum: DESC, ASC] |
| **style** | [**Style**](.md)| Detail level of the response. | [optional] [default to MEDIUM] [enum: MIN, MEDIUM, FULL] |

### Return type

[**AppServiceAttachedAppSubscriptions**](AppServiceAttachedAppSubscriptions.md)

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

<a id="searchAppServices"></a>
# **searchAppServices**
> AppServiceSearchResponse searchAppServices(appServiceSearchRequest)

Search App Services

The API provides capability to get list of user&#39;s App Services using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    AppServiceSearchRequest appServiceSearchRequest = new AppServiceSearchRequest(); // AppServiceSearchRequest | 
    try {
      AppServiceSearchResponse result = apiInstance.searchAppServices(appServiceSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#searchAppServices");
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
| **appServiceSearchRequest** | [**AppServiceSearchRequest**](AppServiceSearchRequest.md)|  | |

### Return type

[**AppServiceSearchResponse**](AppServiceSearchResponse.md)

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

<a id="searchAttachedAppSubscriptionsByAppServiceId"></a>
# **searchAttachedAppSubscriptionsByAppServiceId**
> AppServiceAttachedAppSubscriptionSearchResponse searchAttachedAppSubscriptionsByAppServiceId(appServiceId, appServiceAttachedAppSubscriptionSearchRequest)

Search attached App Subscriptions

The API provides capability to get list of App Subscriptions attached to an App Service using search criteria.

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    AppServiceAttachedAppSubscriptionSearchRequest appServiceAttachedAppSubscriptionSearchRequest = new AppServiceAttachedAppSubscriptionSearchRequest(); // AppServiceAttachedAppSubscriptionSearchRequest | 
    try {
      AppServiceAttachedAppSubscriptionSearchResponse result = apiInstance.searchAttachedAppSubscriptionsByAppServiceId(appServiceId, appServiceAttachedAppSubscriptionSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#searchAttachedAppSubscriptionsByAppServiceId");
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
| **appServiceId** | **UUID**| App Service UUID | |
| **appServiceAttachedAppSubscriptionSearchRequest** | [**AppServiceAttachedAppSubscriptionSearchRequest**](AppServiceAttachedAppSubscriptionSearchRequest.md)|  | |

### Return type

[**AppServiceAttachedAppSubscriptionSearchResponse**](AppServiceAttachedAppSubscriptionSearchResponse.md)

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

<a id="updateAppServiceByUuid"></a>
# **updateAppServiceByUuid**
> AppService updateAppServiceByUuid(appServiceId, appServiceChangeOperation)

Update App Service

This API provides capability to update user&#39;s App Service

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationServicesApi apiInstance = new ApplicationServicesApi(defaultClient);
    UUID appServiceId = UUID.randomUUID(); // UUID | App Service UUID
    List<AppServiceChangeOperation> appServiceChangeOperation = Arrays.asList(); // List<AppServiceChangeOperation> | 
    try {
      AppService result = apiInstance.updateAppServiceByUuid(appServiceId, appServiceChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationServicesApi#updateAppServiceByUuid");
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
| **appServiceId** | **UUID**| App Service UUID | |
| **appServiceChangeOperation** | [**List&lt;AppServiceChangeOperation&gt;**](AppServiceChangeOperation.md)|  | |

### Return type

[**AppService**](AppService.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Service object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

