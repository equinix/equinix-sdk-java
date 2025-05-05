# MarketplaceSubscriptionsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSubscriptionById**](MarketplaceSubscriptionsApi.md#getSubscriptionById) | **GET** /fabric/v4/marketplaceSubscriptions/{subscriptionId} | Get Subscription |


<a id="getSubscriptionById"></a>
# **getSubscriptionById**
> SubscriptionResponse getSubscriptionById(subscriptionId)

Get Subscription

The API provides capability to get subscription

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.MarketplaceSubscriptionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MarketplaceSubscriptionsApi apiInstance = new MarketplaceSubscriptionsApi(defaultClient);
    UUID subscriptionId = UUID.randomUUID(); // UUID | Subscription UUID
    try {
      SubscriptionResponse result = apiInstance.getSubscriptionById(subscriptionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketplaceSubscriptionsApi#getSubscriptionById");
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
| **subscriptionId** | **UUID**| Subscription UUID | |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal server error |  -  |

