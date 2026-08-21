# ApplicationSubscriptionsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppSubscription**](ApplicationSubscriptionsApi.md#createAppSubscription) | **POST** /fabric/v4/appSubscriptions | Create App Subscription |
| [**deleteAppSubscriptionByUuid**](ApplicationSubscriptionsApi.md#deleteAppSubscriptionByUuid) | **DELETE** /fabric/v4/appSubscriptions/{appSubscriptionId} | Delete App Subscription |
| [**getAppSubscriptionByUuid**](ApplicationSubscriptionsApi.md#getAppSubscriptionByUuid) | **GET** /fabric/v4/appSubscriptions/{appSubscriptionId} | Get App Subscription |
| [**searchAppSubscriptions**](ApplicationSubscriptionsApi.md#searchAppSubscriptions) | **POST** /fabric/v4/appSubscriptions/search | Search App Subscriptions |
| [**updateAppSubscriptionByUuid**](ApplicationSubscriptionsApi.md#updateAppSubscriptionByUuid) | **PATCH** /fabric/v4/appSubscriptions/{appSubscriptionId} | Update App Subscription |


<a id="createAppSubscription"></a>
# **createAppSubscription**
> AppSubscription createAppSubscription(appSubscriptionPostRequest)

Create App Subscription

This API provides capability to create user&#39;s App Subscription

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationSubscriptionsApi apiInstance = new ApplicationSubscriptionsApi(defaultClient);
    AppSubscriptionPostRequest appSubscriptionPostRequest = new AppSubscriptionPostRequest(); // AppSubscriptionPostRequest | 
    try {
      AppSubscription result = apiInstance.createAppSubscription(appSubscriptionPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSubscriptionsApi#createAppSubscription");
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
| **appSubscriptionPostRequest** | [**AppSubscriptionPostRequest**](AppSubscriptionPostRequest.md)|  | |

### Return type

[**AppSubscription**](AppSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Subscription object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

<a id="deleteAppSubscriptionByUuid"></a>
# **deleteAppSubscriptionByUuid**
> AppSubscription deleteAppSubscriptionByUuid(appSubscriptionId)

Delete App Subscription

This API provides capability to delete user&#39;s App Subscription

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationSubscriptionsApi apiInstance = new ApplicationSubscriptionsApi(defaultClient);
    UUID appSubscriptionId = UUID.randomUUID(); // UUID | App Subscription UUID
    try {
      AppSubscription result = apiInstance.deleteAppSubscriptionByUuid(appSubscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSubscriptionsApi#deleteAppSubscriptionByUuid");
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
| **appSubscriptionId** | **UUID**| App Subscription UUID | |

### Return type

[**AppSubscription**](AppSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Subscription object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="getAppSubscriptionByUuid"></a>
# **getAppSubscriptionByUuid**
> AppSubscription getAppSubscriptionByUuid(appSubscriptionId)

Get App Subscription

This API provides capability to retrieve user&#39;s App Subscription

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationSubscriptionsApi apiInstance = new ApplicationSubscriptionsApi(defaultClient);
    UUID appSubscriptionId = UUID.randomUUID(); // UUID | App Subscription UUID
    try {
      AppSubscription result = apiInstance.getAppSubscriptionByUuid(appSubscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSubscriptionsApi#getAppSubscriptionByUuid");
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
| **appSubscriptionId** | **UUID**| App Subscription UUID | |

### Return type

[**AppSubscription**](AppSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | App Subscription object |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="searchAppSubscriptions"></a>
# **searchAppSubscriptions**
> AppSubscriptionSearchResponse searchAppSubscriptions(appSubscriptionSearchRequest)

Search App Subscriptions

The API provides capability to get list of user&#39;s App Subscriptions using search criteria, including optional filtering, pagination and sorting

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationSubscriptionsApi apiInstance = new ApplicationSubscriptionsApi(defaultClient);
    AppSubscriptionSearchRequest appSubscriptionSearchRequest = new AppSubscriptionSearchRequest(); // AppSubscriptionSearchRequest | 
    try {
      AppSubscriptionSearchResponse result = apiInstance.searchAppSubscriptions(appSubscriptionSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSubscriptionsApi#searchAppSubscriptions");
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
| **appSubscriptionSearchRequest** | [**AppSubscriptionSearchRequest**](AppSubscriptionSearchRequest.md)|  | |

### Return type

[**AppSubscriptionSearchResponse**](AppSubscriptionSearchResponse.md)

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

<a id="updateAppSubscriptionByUuid"></a>
# **updateAppSubscriptionByUuid**
> AppSubscription updateAppSubscriptionByUuid(appSubscriptionId, appSubscriptionChangeOperation)

Update App Subscription

This API provides capability to update user&#39;s App Subscription

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.ApplicationSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApplicationSubscriptionsApi apiInstance = new ApplicationSubscriptionsApi(defaultClient);
    UUID appSubscriptionId = UUID.randomUUID(); // UUID | App Subscription UUID
    List<AppSubscriptionChangeOperation> appSubscriptionChangeOperation = Arrays.asList(); // List<AppSubscriptionChangeOperation> | 
    try {
      AppSubscription result = apiInstance.updateAppSubscriptionByUuid(appSubscriptionId, appSubscriptionChangeOperation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSubscriptionsApi#updateAppSubscriptionByUuid");
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
| **appSubscriptionId** | **UUID**| App Subscription UUID | |
| **appSubscriptionChangeOperation** | [**List&lt;AppSubscriptionChangeOperation&gt;**](AppSubscriptionChangeOperation.md)|  | |

### Return type

[**AppSubscription**](AppSubscription.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json-patch+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | App Subscription object |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

