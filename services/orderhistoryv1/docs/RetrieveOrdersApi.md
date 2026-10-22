# RetrieveOrdersApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gETRetrieveOrdersLocations**](RetrieveOrdersApi.md#gETRetrieveOrdersLocations) | **GET** /v1/retrieve-orders/locations | Retrieve order permissible IBX locations |
| [**pOSTOrdersHistory**](RetrieveOrdersApi.md#pOSTOrdersHistory) | **POST** /v1/retrieve-orders | Search Orders History |


<a id="gETRetrieveOrdersLocations"></a>
# **gETRetrieveOrdersLocations**
> List&lt;PermissibleLocation&gt; gETRetrieveOrdersLocations(authorization)

Retrieve order permissible IBX locations

The API returns locations (IBXs and Cages) where the user&#39;s organization has a presence. The user may be able to view orders related to these locations, depending on their permissions.

### Example
```java
// Import classes:
import com.equinix.sdk.orderhistoryv1.ApiClient;
import com.equinix.sdk.orderhistoryv1.ApiException;
import com.equinix.sdk.orderhistoryv1.Configuration;
import com.equinix.sdk.orderhistoryv1.models.*;
import com.equinix.sdk.orderhistoryv1.api.RetrieveOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    RetrieveOrdersApi apiInstance = new RetrieveOrdersApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    try {
      List<PermissibleLocation> result = apiInstance.gETRetrieveOrdersLocations(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrieveOrdersApi#gETRetrieveOrdersLocations");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | [optional] |

### Return type

[**List&lt;PermissibleLocation&gt;**](PermissibleLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | IBX and cage location details where  customer has access to view service history of organization.  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="pOSTOrdersHistory"></a>
# **pOSTOrdersHistory**
> OrderHistoryResponse pOSTOrdersHistory(authorization, body)

Search Orders History

Based on filtering criteria, this method returns a list of orders from the last 12 months for IBX locations where the user has permissions.

### Example
```java
// Import classes:
import com.equinix.sdk.orderhistoryv1.ApiClient;
import com.equinix.sdk.orderhistoryv1.ApiException;
import com.equinix.sdk.orderhistoryv1.Configuration;
import com.equinix.sdk.orderhistoryv1.models.*;
import com.equinix.sdk.orderhistoryv1.api.RetrieveOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    RetrieveOrdersApi apiInstance = new RetrieveOrdersApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    Orderhistoryapirequest body = new Orderhistoryapirequest(); // Orderhistoryapirequest | 
    try {
      OrderHistoryResponse result = apiInstance.pOSTOrdersHistory(authorization, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RetrieveOrdersApi#pOSTOrdersHistory");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer&#39;. | [optional] |
| **body** | [**Orderhistoryapirequest**](Orderhistoryapirequest.md)|  | [optional] |

### Return type

[**OrderHistoryResponse**](OrderHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

