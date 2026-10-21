# VirtualDeviceApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeviceReloadByUuid**](VirtualDeviceApi.md#createDeviceReloadByUuid) | **POST** /ne/v1/devices/{virtualDeviceUUID}/softReboot | Trigger Virtual Device Soft Reboot |
| [**createVirtualDevice**](VirtualDeviceApi.md#createVirtualDevice) | **POST** /ne/v1/devices | Create Virtual Device |
| [**createVirtualDeviceByUuid**](VirtualDeviceApi.md#createVirtualDeviceByUuid) | **PUT** /ne/v1/devices/{uuid} | Update Device Draft |
| [**deleteVirtualDeviceByUuid**](VirtualDeviceApi.md#deleteVirtualDeviceByUuid) | **DELETE** /ne/v1/devices/{uuid} | Delete Virtual Device By Uuid |
| [**getDeviceReloadByUuid**](VirtualDeviceApi.md#getDeviceReloadByUuid) | **GET** /ne/v1/devices/{virtualDeviceUUID}/softReboot | List Device Reload History By Uuid |
| [**getDeviceUpgradeByUuid**](VirtualDeviceApi.md#getDeviceUpgradeByUuid) | **GET** /ne/v1/devices/{virtualDeviceUuid}/resourceUpgrade | Get Device Upgrade History |
| [**getInterfaceStatisticsByUuid**](VirtualDeviceApi.md#getInterfaceStatisticsByUuid) | **GET** /ne/v1/devices/{virtualDeviceUuid}/interfaces/{interfaceId}/stats | Get Interface Statistics |
| [**getVirtualDeviceByUuid**](VirtualDeviceApi.md#getVirtualDeviceByUuid) | **GET** /ne/v1/devices/{uuid} | Get Virtual Device By Uuid |
| [**getVirtualDeviceInterfacesByUuid**](VirtualDeviceApi.md#getVirtualDeviceInterfacesByUuid) | **GET** /ne/v1/devices/{uuid}/interfaces | Get Device Interfaces |
| [**getVirtualDevices**](VirtualDeviceApi.md#getVirtualDevices) | **GET** /ne/v1/devices | Get Virtual Devices |
| [**pingDeviceByUuid**](VirtualDeviceApi.md#pingDeviceByUuid) | **GET** /ne/v1/devices/{uuid}/ping | Ping Virtual Device |
| [**updateAdditionalBandwidthByUuid**](VirtualDeviceApi.md#updateAdditionalBandwidthByUuid) | **PUT** /ne/v1/devices/{uuid}/additionalBandwidths | Update Additional Bandwidth of Virtual Device |
| [**updateVirtualDeviceByUuid**](VirtualDeviceApi.md#updateVirtualDeviceByUuid) | **PATCH** /ne/v1/devices/{uuid} | Update Virtual Device By Uuid |


<a id="createDeviceReloadByUuid"></a>
# **createDeviceReloadByUuid**
> createDeviceReloadByUuid(virtualDeviceUUID)

Trigger Virtual Device Soft Reboot

Triggers the soft reboot of a device. Please send the unique Id of the device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String virtualDeviceUUID = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique ID of a virtual device.
    try {
      apiInstance.createDeviceReloadByUuid(virtualDeviceUUID);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#createDeviceReloadByUuid");
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
| **virtualDeviceUUID** | **String**| Unique ID of a virtual device. | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | A request to reboot has been created. |  * Location - URL of the created RMA request. <br>  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="createVirtualDevice"></a>
# **createVirtualDevice**
> VirtualDeviceCreateResponse createVirtualDevice(virtualDevice, draft, draftUuid)

Create Virtual Device

Creates a virtual device. Sub-customers cannot choose the subscription licensing option. To create a device, you must accept the Order Terms. Call Get Order Terms to review the details. If you are creating an Equinix-Configured device, read your vendor&#39;s terms by calling Get Vendor Terms.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    VirtualDeviceRequest virtualDevice = new VirtualDeviceRequest(); // VirtualDeviceRequest | Create a virtual device (e.g., a router or a firewall)
    Boolean draft = false; // Boolean | Whether to save this as a draft.
    String draftUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | The unique ID of the draft to be promoted to a device.
    try {
      VirtualDeviceCreateResponse result = apiInstance.createVirtualDevice(virtualDevice, draft, draftUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#createVirtualDevice");
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
| **virtualDevice** | [**VirtualDeviceRequest**](VirtualDeviceRequest.md)| Create a virtual device (e.g., a router or a firewall) | |
| **draft** | **Boolean**| Whether to save this as a draft. | [optional] [default to false] |
| **draftUuid** | **String**| The unique ID of the draft to be promoted to a device. | [optional] |

### Return type

[**VirtualDeviceCreateResponse**](VirtualDeviceCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request accepted. To check the status of your device, please call Get virtual device {uuid} API. |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="createVirtualDeviceByUuid"></a>
# **createVirtualDeviceByUuid**
> createVirtualDeviceByUuid(uuid, draft, virtualDevice)

Update Device Draft

This API is for updating a virtual device draft &lt;br/&gt;and does not support device update as of now.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a Virtual Device
    Boolean draft = true; // Boolean | draft
    VirtualDeviceRequest virtualDevice = new VirtualDeviceRequest(); // VirtualDeviceRequest | Update virtual device details
    try {
      apiInstance.createVirtualDeviceByUuid(uuid, draft, virtualDevice);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#createVirtualDeviceByUuid");
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
| **uuid** | **String**| Unique Id of a Virtual Device | |
| **draft** | **Boolean**| draft | |
| **virtualDevice** | [**VirtualDeviceRequest**](VirtualDeviceRequest.md)| Update virtual device details | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteVirtualDeviceByUuid"></a>
# **deleteVirtualDeviceByUuid**
> deleteVirtualDeviceByUuid(uuid, deleteRedundantDevice, deletionInfo)

Delete Virtual Device By Uuid

Delete a virtual device. For some device types (e.g., Palo Alto devices), you also need to provide a deactivation key as a body parameter. For a device pair, the deleteRedundantDevice field must be marked True so we delete both the devices simultaneously.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a Virtual Device
    Boolean deleteRedundantDevice = false; // Boolean | Optional parameter in case you have a secondary device. As both the primary and secondary devices are deleted simultaneously, this field must be marked True so we delete both the devices simultaneously.
    VirtualDeviceDeleteRequest deletionInfo = new VirtualDeviceDeleteRequest(); // VirtualDeviceDeleteRequest | deletionInfo
    try {
      apiInstance.deleteVirtualDeviceByUuid(uuid, deleteRedundantDevice, deletionInfo);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#deleteVirtualDeviceByUuid");
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
| **uuid** | **String**| Unique Id of a Virtual Device | |
| **deleteRedundantDevice** | **Boolean**| Optional parameter in case you have a secondary device. As both the primary and secondary devices are deleted simultaneously, this field must be marked True so we delete both the devices simultaneously. | [optional] [default to false] |
| **deletionInfo** | [**VirtualDeviceDeleteRequest**](VirtualDeviceDeleteRequest.md)| deletionInfo | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The deletion is in progress. Call Get virtual device {uuid} API to check the status of your deletion. |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDeviceReloadByUuid"></a>
# **getDeviceReloadByUuid**
> GetDeviceReloadResponse getDeviceReloadByUuid(virtualDeviceUUID, offset, limit)

List Device Reload History By Uuid

Returns the reload history of a device. Please send the unique Id of the device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String virtualDeviceUUID = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique ID of a virtual device.
    Integer offset = 0; // Integer | Specifies where to start a page. It is the starting point of the collection returned from the server.
    Integer limit = 20; // Integer | Specifies the page size.
    try {
      GetDeviceReloadResponse result = apiInstance.getDeviceReloadByUuid(virtualDeviceUUID, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#getDeviceReloadByUuid");
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
| **virtualDeviceUUID** | **String**| Unique ID of a virtual device. | |
| **offset** | **Integer**| Specifies where to start a page. It is the starting point of the collection returned from the server. | [optional] [default to 0] |
| **limit** | **Integer**| Specifies the page size. | [optional] [default to 20] |

### Return type

[**GetDeviceReloadResponse**](GetDeviceReloadResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDeviceUpgradeByUuid"></a>
# **getDeviceUpgradeByUuid**
> GetDeviceUpgradeResponse getDeviceUpgradeByUuid(virtualDeviceUuid, offset, limit)

Get Device Upgrade History

Returns the upgrade history of a device. Please send the unique Id of the device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique ID of a virtual device.
    Integer offset = 0; // Integer | Specifies where to start a page. It is the starting point of the collection returned from the server.
    Integer limit = 20; // Integer | Specifies the page size.
    try {
      GetDeviceUpgradeResponse result = apiInstance.getDeviceUpgradeByUuid(virtualDeviceUuid, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#getDeviceUpgradeByUuid");
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
| **virtualDeviceUuid** | **String**| Unique ID of a virtual device. | |
| **offset** | **Integer**| Specifies where to start a page. It is the starting point of the collection returned from the server. | [optional] [default to 0] |
| **limit** | **Integer**| Specifies the page size. | [optional] [default to 20] |

### Return type

[**GetDeviceUpgradeResponse**](GetDeviceUpgradeResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getInterfaceStatisticsByUuid"></a>
# **getInterfaceStatisticsByUuid**
> InterfaceStatsObject getInterfaceStatisticsByUuid(virtualDeviceUuid, interfaceId, startDateTime, endDateTime)

Get Interface Statistics

Returns the throughput statistics of a device interface. Pass the unique Id of the device and the interface Id as path parameters.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a device
    String interfaceId = "1"; // String | Interface Id
    OffsetDateTime startDateTime = OffsetDateTime.parse("2023-11-10T19:06:06Z"); // OffsetDateTime | Start time of the duration for which you want stats. (YYYY-MM-DDThh:mm:ssZ)
    OffsetDateTime endDateTime = OffsetDateTime.parse("2023-11-17T19:06:06Z"); // OffsetDateTime | End time of the duration for which you want stats. (YYYY-MM-DDThh:mm:ssZ)
    try {
      InterfaceStatsObject result = apiInstance.getInterfaceStatisticsByUuid(virtualDeviceUuid, interfaceId, startDateTime, endDateTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#getInterfaceStatisticsByUuid");
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
| **virtualDeviceUuid** | **String**| Unique Id of a device | |
| **interfaceId** | **String**| Interface Id | |
| **startDateTime** | **OffsetDateTime**| Start time of the duration for which you want stats. (YYYY-MM-DDThh:mm:ssZ) | [optional] |
| **endDateTime** | **OffsetDateTime**| End time of the duration for which you want stats. (YYYY-MM-DDThh:mm:ssZ) | [optional] |

### Return type

[**InterfaceStatsObject**](InterfaceStatsObject.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Resource Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getVirtualDeviceByUuid"></a>
# **getVirtualDeviceByUuid**
> VirtualDeviceDetailsResponse getVirtualDeviceByUuid(uuid)

Get Virtual Device By Uuid

Returns the virtual device details of an existing device on the Network Edge platform. You must provide the unique ID of the existing device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | uuid
    try {
      VirtualDeviceDetailsResponse result = apiInstance.getVirtualDeviceByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#getVirtualDeviceByUuid");
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
| **uuid** | **String**| uuid | |

### Return type

[**VirtualDeviceDetailsResponse**](VirtualDeviceDetailsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getVirtualDeviceInterfacesByUuid"></a>
# **getVirtualDeviceInterfacesByUuid**
> List&lt;InterfaceBasicInfoResponse&gt; getVirtualDeviceInterfacesByUuid(uuid)

Get Device Interfaces

Returns the status of the interfaces of a device. You must pass the unique Id of the device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | uuid
    try {
      List<InterfaceBasicInfoResponse> result = apiInstance.getVirtualDeviceInterfacesByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#getVirtualDeviceInterfacesByUuid");
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
| **uuid** | **String**| uuid | |

### Return type

[**List&lt;InterfaceBasicInfoResponse&gt;**](InterfaceBasicInfoResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Resource Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getVirtualDevices"></a>
# **getVirtualDevices**
> GetDevicesResponse getVirtualDevices(offset, limit, metroCode, status, showOnlySubCustomerDevices, accountUcmId, searchText, sort, projectIds)

Get Virtual Devices

Returns all virtual devices available on the Network Edge platform.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    Integer offset = 0; // Integer | Specifies where to start a page. It is the starting point of the collection returned from the server.
    Integer limit = 20; // Integer | Specifies the page size.
    String metroCode = "SV"; // String | Two-letter metro code.
    String status = "PROVISIONED"; // String | The status of the device.
    Boolean showOnlySubCustomerDevices = false; // Boolean | Resellers may mark this Yes to see sub customer devices.
    String accountUcmId = "123456"; // String | Unique ID of the account.
    String searchText = "My-Device"; // String | Enter text to fetch only matching device names
    List<String> sort = Arrays.asList(); // List<String> | Sorts the output based on field names.
    String projectIds = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | If projectIds are different from default projectIds, must pass a projectIds parameter
    try {
      GetDevicesResponse result = apiInstance.getVirtualDevices(offset, limit, metroCode, status, showOnlySubCustomerDevices, accountUcmId, searchText, sort, projectIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#getVirtualDevices");
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
| **offset** | **Integer**| Specifies where to start a page. It is the starting point of the collection returned from the server. | [optional] [default to 0] |
| **limit** | **Integer**| Specifies the page size. | [optional] [default to 20] |
| **metroCode** | **String**| Two-letter metro code. | [optional] |
| **status** | **String**| The status of the device. | [optional] [enum: PROVISIONED, PROVISIONING, DEPROVISIONED, DEPROVISIONING, FAILED] |
| **showOnlySubCustomerDevices** | **Boolean**| Resellers may mark this Yes to see sub customer devices. | [optional] |
| **accountUcmId** | **String**| Unique ID of the account. | [optional] |
| **searchText** | **String**| Enter text to fetch only matching device names | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sorts the output based on field names. | [optional] |
| **projectIds** | **String**| If projectIds are different from default projectIds, must pass a projectIds parameter | [optional] |

### Return type

[**GetDevicesResponse**](GetDevicesResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

<a id="pingDeviceByUuid"></a>
# **pingDeviceByUuid**
> PingResponse pingDeviceByUuid(uuid)

Ping Virtual Device

Pings a virtual device to ensure it&#39;s reachable. At this point, you can only ping a few SELF-CONFIGURED devices.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Virtual Device unique Id
    try {
      PingResponse result = apiInstance.pingDeviceByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#pingDeviceByUuid");
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
| **uuid** | **String**| Virtual Device unique Id | |

### Return type

[**PingResponse**](PingResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The device is reachable. |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateAdditionalBandwidthByUuid"></a>
# **updateAdditionalBandwidthByUuid**
> updateAdditionalBandwidthByUuid(uuid, request)

Update Additional Bandwidth of Virtual Device

You can use this method to change or add additional bandwidth to a virtual device.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | The unique Id of a virtual device
    AdditionalBandwidthRequest request = new AdditionalBandwidthRequest(); // AdditionalBandwidthRequest | Additional Bandwidth
    try {
      apiInstance.updateAdditionalBandwidthByUuid(uuid, request);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#updateAdditionalBandwidthByUuid");
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
| **uuid** | **String**| The unique Id of a virtual device | |
| **request** | [**AdditionalBandwidthRequest**](AdditionalBandwidthRequest.md)| Additional Bandwidth | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateVirtualDeviceByUuid"></a>
# **updateVirtualDeviceByUuid**
> updateVirtualDeviceByUuid(uuid, virtualDeviceUpdateRequestDto)

Update Virtual Device By Uuid

Updates certain fields of a virtual device. You can only update the name, term length, status, and notification list of a virtual device.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.VirtualDeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    VirtualDeviceApi apiInstance = new VirtualDeviceApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a Virtual Device
    VirtualDeviceInternalPatchRequest virtualDeviceUpdateRequestDto = new VirtualDeviceInternalPatchRequest(); // VirtualDeviceInternalPatchRequest | 
    try {
      apiInstance.updateVirtualDeviceByUuid(uuid, virtualDeviceUpdateRequestDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualDeviceApi#updateVirtualDeviceByUuid");
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
| **uuid** | **String**| Unique Id of a Virtual Device | |
| **virtualDeviceUpdateRequestDto** | [**VirtualDeviceInternalPatchRequest**](VirtualDeviceInternalPatchRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The request was successfully processed. |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

