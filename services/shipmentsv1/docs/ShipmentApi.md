# ShipmentApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocation**](ShipmentApi.md#getLocation) | **GET** /v1/orders/shipment/locations | Get Locations(ibx, cage) Details for Shipment  Based on Place Shipment Permission for User |
| [**outboundShipmentSubmit**](ShipmentApi.md#outboundShipmentSubmit) | **POST** /v1/orders/shipment/outbound | Created Outbound Shipment. |
| [**shipmentInbound**](ShipmentApi.md#shipmentInbound) | **POST** /v1/orders/shipment/inbound | Inbound Shipment Order |
| [**shipmentPending**](ShipmentApi.md#shipmentPending) | **POST** /v1/orders/shipment/pendingStorage | Pending Storage Order |


<a id="getLocation"></a>
# **getLocation**
> GetLocation200Response getLocation(authorization, detail, ibxs, cages)

Get Locations(ibx, cage) Details for Shipment  Based on Place Shipment Permission for User

This API is use to check user&#39;s permission&#39;s &amp; access to ibx

### Example
```java
// Import classes:
import com.equinix.sdk.shipmentsv1.ApiClient;
import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.Configuration;
import com.equinix.sdk.shipmentsv1.models.*;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    Boolean detail = true; // Boolean | When enable this flag returns detailed permission with Cage & Cabinets. Default value is false
    String ibxs = "ibxs_example"; // String | 
    String cages = "cages_example"; // String | 
    try {
      GetLocation200Response result = apiInstance.getLocation(authorization, detail, ibxs, cages);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#getLocation");
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
| **detail** | **Boolean**| When enable this flag returns detailed permission with Cage &amp; Cabinets. Default value is false | [optional] |
| **ibxs** | **String**|  | [optional] |
| **cages** | **String**|  | [optional] |

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

<a id="outboundShipmentSubmit"></a>
# **outboundShipmentSubmit**
> ShipmentOrderResponse outboundShipmentSubmit(authorization, body)

Created Outbound Shipment.

This API is used to submit an Outbound Shipment order.

### Example
```java
// Import classes:
import com.equinix.sdk.shipmentsv1.ApiClient;
import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.Configuration;
import com.equinix.sdk.shipmentsv1.models.*;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    OutboundShipmentRequest body = new OutboundShipmentRequest(); // OutboundShipmentRequest | 
    try {
      ShipmentOrderResponse result = apiInstance.outboundShipmentSubmit(authorization, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#outboundShipmentSubmit");
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
| **body** | [**OutboundShipmentRequest**](OutboundShipmentRequest.md)|  | [optional] |

### Return type

[**ShipmentOrderResponse**](ShipmentOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Outbound Shipment Order Successfully |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="shipmentInbound"></a>
# **shipmentInbound**
> ShipmentOrderResponse shipmentInbound(authorization, body)

Inbound Shipment Order

This API is used to submit an Inbound Shipment order.

### Example
```java
// Import classes:
import com.equinix.sdk.shipmentsv1.ApiClient;
import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.Configuration;
import com.equinix.sdk.shipmentsv1.models.*;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    InboundShipmentRequest body = new InboundShipmentRequest(); // InboundShipmentRequest | 
    try {
      ShipmentOrderResponse result = apiInstance.shipmentInbound(authorization, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#shipmentInbound");
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
| **body** | [**InboundShipmentRequest**](InboundShipmentRequest.md)|  | [optional] |

### Return type

[**ShipmentOrderResponse**](ShipmentOrderResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Inbound Shipment Order Successfully |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

<a id="shipmentPending"></a>
# **shipmentPending**
> List&lt;PendingStorageOrderResponseInner&gt; shipmentPending(authorization, body)

Pending Storage Order

This API is used to submit the Pending Inbound Shipment order.

### Example
```java
// Import classes:
import com.equinix.sdk.shipmentsv1.ApiClient;
import com.equinix.sdk.shipmentsv1.ApiException;
import com.equinix.sdk.shipmentsv1.Configuration;
import com.equinix.sdk.shipmentsv1.models.*;
import com.equinix.sdk.shipmentsv1.api.ShipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    ShipmentApi apiInstance = new ShipmentApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer'.
    PendingStorageRequest body = new PendingStorageRequest(); // PendingStorageRequest | 
    try {
      List<PendingStorageOrderResponseInner> result = apiInstance.shipmentPending(authorization, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ShipmentApi#shipmentPending");
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
| **body** | [**PendingStorageRequest**](PendingStorageRequest.md)|  | [optional] |

### Return type

[**List&lt;PendingStorageOrderResponseInner&gt;**](PendingStorageOrderResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Pending Shipment Order Successfully |  -  |
| **400** | Http Bad Request |  -  |
| **403** | Http Authorization Error |  -  |
| **500** | Http Internal Server Error |  -  |

