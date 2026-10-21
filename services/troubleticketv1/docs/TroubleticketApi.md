# TroubleticketApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocation**](TroubleticketApi.md#getLocation) | **GET** /v1/orders/troubleticket/locations | Get Locations(ibx, cage) Details for Trouble Ticket  Based on Trouble Ticket Permission for User |
| [**getTroubleTicketType**](TroubleticketApi.md#getTroubleTicketType) | **GET** /v1/orders/troubleticket/types | Get list of all Equinix Trouble Ticket Types |
| [**placeTroubleTicketOrder**](TroubleticketApi.md#placeTroubleTicketOrder) | **POST** /v1/orders/troubleticket | If you are experiencing an issue that is impacting your service, please enter your information and submit a trouble ticket |


<a id="getLocation"></a>
# **getLocation**
> GetLocation200Response getLocation(authorization, detail, ibxs, cages)

Get Locations(ibx, cage) Details for Trouble Ticket  Based on Trouble Ticket Permission for User

This API returns list of permissible to ibx/cage/account/cabinets

### Example
```java
// Import classes:
import com.equinix.sdk.troubleticketv1.ApiClient;
import com.equinix.sdk.troubleticketv1.ApiException;
import com.equinix.sdk.troubleticketv1.Configuration;
import com.equinix.sdk.troubleticketv1.models.*;
import com.equinix.sdk.troubleticketv1.api.TroubleticketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    TroubleticketApi apiInstance = new TroubleticketApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    Boolean detail = false; // Boolean | When enable this flag returns detailed permission with Cage & Cabinets.
    String ibxs = "ibxs_example"; // String | CH1
    String cages = "cages_example"; // String | Eg: CH1:01:0101
    try {
      GetLocation200Response result = apiInstance.getLocation(authorization, detail, ibxs, cages);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TroubleticketApi#getLocation");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **detail** | **Boolean**| When enable this flag returns detailed permission with Cage &amp; Cabinets. | [optional] [default to false] |
| **ibxs** | **String**| CH1 | [optional] |
| **cages** | **String**| Eg: CH1:01:0101 | [optional] |

### Return type

[**GetLocation200Response**](GetLocation200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return list of Ibx, Cage, Cabinets where user has access |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="getTroubleTicketType"></a>
# **getTroubleTicketType**
> GetTroubleTicketType200Response getTroubleTicketType(authorization, category)

Get list of all Equinix Trouble Ticket Types

This operation will return all Equinix trouble ticket problems categories and corresponding details. API can be filtered by trouble ticket category.

### Example
```java
// Import classes:
import com.equinix.sdk.troubleticketv1.ApiClient;
import com.equinix.sdk.troubleticketv1.ApiException;
import com.equinix.sdk.troubleticketv1.Configuration;
import com.equinix.sdk.troubleticketv1.models.*;
import com.equinix.sdk.troubleticketv1.api.TroubleticketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    TroubleticketApi apiInstance = new TroubleticketApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    String category = "Cross Connect"; // String | To get results by trouble ticket category.
    try {
      GetTroubleTicketType200Response result = apiInstance.getTroubleTicketType(authorization, category);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TroubleticketApi#getTroubleTicketType");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **category** | **String**| To get results by trouble ticket category. | [optional] [enum: Cross Connect, Network, Power, Environment, Hardware, Security, Managed Services, Smartview] |

### Return type

[**GetTroubleTicketType200Response**](GetTroubleTicketType200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns Trouble Ticket Problem Types |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="placeTroubleTicketOrder"></a>
# **placeTroubleTicketOrder**
> TroubleTicketResponse placeTroubleTicketOrder(authorization, body)

If you are experiencing an issue that is impacting your service, please enter your information and submit a trouble ticket

If you are experiencing an issue that is impacting your service, please enter your information and submit a trouble ticket

### Example
```java
// Import classes:
import com.equinix.sdk.troubleticketv1.ApiClient;
import com.equinix.sdk.troubleticketv1.ApiException;
import com.equinix.sdk.troubleticketv1.Configuration;
import com.equinix.sdk.troubleticketv1.models.*;
import com.equinix.sdk.troubleticketv1.api.TroubleticketApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    TroubleticketApi apiInstance = new TroubleticketApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    TroubleTicketOrderRequest body = new TroubleTicketOrderRequest(); // TroubleTicketOrderRequest | 
    try {
      TroubleTicketResponse result = apiInstance.placeTroubleTicketOrder(authorization, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TroubleticketApi#placeTroubleTicketOrder");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | |
| **body** | [**TroubleTicketOrderRequest**](TroubleTicketOrderRequest.md)|  | [optional] |

### Return type

[**TroubleTicketResponse**](TroubleTicketResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Trouble Ticket Order Successfully |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

