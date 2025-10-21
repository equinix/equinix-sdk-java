# MetricsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMetricByAssetId**](MetricsApi.md#getMetricByAssetId) | **GET** /fabric/v4/{asset}/{assetId}/metrics | Get Metrics by Asset Id |
| [**searchMetrics**](MetricsApi.md#searchMetrics) | **POST** /fabric/v4/metrics/search | Search Metrics |


<a id="getMetricByAssetId"></a>
# **getMetricByAssetId**
> GetMetricsByAssetResponse getMetricByAssetId(asset, assetId, name, fromDateTime, toDateTime, offset, limit)

Get Metrics by Asset Id

This API provides capability to retrieve Metrics of an asset id

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    MetricAssetType asset = MetricAssetType.fromValue("ports"); // MetricAssetType | asset
    UUID assetId = UUID.randomUUID(); // UUID | asset UUID
    String name = "name_example"; // String | Name of the metric types: <br> - equinix.fabric.connection.bandwidth_rx.usage <br> - equinix.fabric.connection.bandwidth_tx.usage <br> - equinix.fabric.connection.packets_dropped_rx_aside_rateexceeded.count <br> - equinix.fabric.connection.packets_dropped_tx_aside_rateexceeded.count <br> - equinix.fabric.connection.packets_dropped_rx_zside_rateexceeded.count <br> - equinix.fabric.connection.packets_dropped_tx_zside_rateexceeded.count <br> - equinix.fabric.port.bandwidth_rx.usage <br> - equinix.fabric.port.bandwidth_tx.usage <br> - equinix.fabric.port.packets_dropped_rx.count <br> - equinix.fabric.port.packets_dropped_tx.count <br> - equinix.fabric.port.packets_erred_rx.count <br> - equinix.fabric.port.packets_erred_tx.count <br> - equinix.fabric.metro.{source_metro_code}_{destination_metro_code}.latency <br> - equinix.fabric.metro.{source_metro_code}_{destination_metro_code}.jitter_avg <br> 
    OffsetDateTime fromDateTime = OffsetDateTime.now(); // OffsetDateTime | Start date and time
    OffsetDateTime toDateTime = OffsetDateTime.now(); // OffsetDateTime | End date and time
    Integer offset = 0; // Integer | offset
    Integer limit = 20; // Integer | limit
    try {
      GetMetricsByAssetResponse result = apiInstance.getMetricByAssetId(asset, assetId, name, fromDateTime, toDateTime, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#getMetricByAssetId");
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
| **asset** | [**MetricAssetType**](.md)| asset | [enum: ports, connections, metros] |
| **assetId** | **UUID**| asset UUID | |
| **name** | **String**| Name of the metric types: &lt;br&gt; - equinix.fabric.connection.bandwidth_rx.usage &lt;br&gt; - equinix.fabric.connection.bandwidth_tx.usage &lt;br&gt; - equinix.fabric.connection.packets_dropped_rx_aside_rateexceeded.count &lt;br&gt; - equinix.fabric.connection.packets_dropped_tx_aside_rateexceeded.count &lt;br&gt; - equinix.fabric.connection.packets_dropped_rx_zside_rateexceeded.count &lt;br&gt; - equinix.fabric.connection.packets_dropped_tx_zside_rateexceeded.count &lt;br&gt; - equinix.fabric.port.bandwidth_rx.usage &lt;br&gt; - equinix.fabric.port.bandwidth_tx.usage &lt;br&gt; - equinix.fabric.port.packets_dropped_rx.count &lt;br&gt; - equinix.fabric.port.packets_dropped_tx.count &lt;br&gt; - equinix.fabric.port.packets_erred_rx.count &lt;br&gt; - equinix.fabric.port.packets_erred_tx.count &lt;br&gt; - equinix.fabric.metro.{source_metro_code}_{destination_metro_code}.latency &lt;br&gt; - equinix.fabric.metro.{source_metro_code}_{destination_metro_code}.jitter_avg &lt;br&gt;  | |
| **fromDateTime** | **OffsetDateTime**| Start date and time | [optional] |
| **toDateTime** | **OffsetDateTime**| End date and time | [optional] |
| **offset** | **Integer**| offset | [optional] [default to 0] |
| **limit** | **Integer**| limit | [optional] [default to 20] |

### Return type

[**GetMetricsByAssetResponse**](GetMetricsByAssetResponse.md)

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
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

<a id="searchMetrics"></a>
# **searchMetrics**
> GetMetricsByAssetResponse searchMetrics(metricsSearchRequest)

Search Metrics

This API provides capability to search metrics from a filtered query

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    MetricsApi apiInstance = new MetricsApi(defaultClient);
    MetricsSearchRequest metricsSearchRequest = new MetricsSearchRequest(); // MetricsSearchRequest | 
    try {
      GetMetricsByAssetResponse result = apiInstance.searchMetrics(metricsSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#searchMetrics");
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
| **metricsSearchRequest** | [**MetricsSearchRequest**](MetricsSearchRequest.md)|  | |

### Return type

[**GetMetricsByAssetResponse**](GetMetricsByAssetResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal server error |  -  |

