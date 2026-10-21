# WorkvisitApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocation**](WorkvisitApi.md#getLocation) | **GET** /v1/orders/workvisit/locations | Get Work visit Locations |
| [**workVisitOrder**](WorkvisitApi.md#workVisitOrder) | **POST** /v1/orders/workvisit | Schedule Work Visit |


<a id="getLocation"></a>
# **getLocation**
> GetLocation200Response getLocation(authorization, detail, ibxs, cages)

Get Work visit Locations

The Get work visit locations API returns all IBXs and related cages where the user has &#39;IBX Access Services Request&#39; permission. The authorization token and content-type are the only headers that are passed to this API and a response is received based on the values passed.

### Example
```java
// Import classes:
import com.equinix.sdk.workvisitv1.ApiClient;
import com.equinix.sdk.workvisitv1.ApiException;
import com.equinix.sdk.workvisitv1.Configuration;
import com.equinix.sdk.workvisitv1.models.*;
import com.equinix.sdk.workvisitv1.api.WorkvisitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    WorkvisitApi apiInstance = new WorkvisitApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    Boolean detail = false; // Boolean | When enable this flag returns detailed permission with Cage & Cabinets.
    String ibxs = "ibxs_example"; // String | IBX Filter. Example: AM1, AM2
    String cages = "cages_example"; // String | Cage Filter. Example: AM1:0G:00EQ
    try {
      GetLocation200Response result = apiInstance.getLocation(authorization, detail, ibxs, cages);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkvisitApi#getLocation");
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
| **ibxs** | **String**| IBX Filter. Example: AM1, AM2 | [optional] |
| **cages** | **String**| Cage Filter. Example: AM1:0G:00EQ | [optional] |

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
| **200** | Return list of Ibx, Cage, Cabinets where user has access to place Work Visit Order |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="workVisitOrder"></a>
# **workVisitOrder**
> OrderItemResponse workVisitOrder(authorization, body)

Schedule Work Visit

The Post work visit API creates a work visit request to grant IBX visitors access for up to two weeks. This can only be done under a user with &#39;IBX Access Services Request&#39; permission.

### Example
```java
// Import classes:
import com.equinix.sdk.workvisitv1.ApiClient;
import com.equinix.sdk.workvisitv1.ApiException;
import com.equinix.sdk.workvisitv1.Configuration;
import com.equinix.sdk.workvisitv1.models.*;
import com.equinix.sdk.workvisitv1.api.WorkvisitApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    WorkvisitApi apiInstance = new WorkvisitApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    WorkVisitRequest body = new WorkVisitRequest(); // WorkVisitRequest | 
    try {
      OrderItemResponse result = apiInstance.workVisitOrder(authorization, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkvisitApi#workVisitOrder");
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
| **body** | [**WorkVisitRequest**](WorkVisitRequest.md)|  | [optional] |

### Return type

[**OrderItemResponse**](OrderItemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Order Created  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

