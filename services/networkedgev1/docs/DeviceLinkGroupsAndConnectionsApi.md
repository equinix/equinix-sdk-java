# DeviceLinkGroupsAndConnectionsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeviceLinkGroup**](DeviceLinkGroupsAndConnectionsApi.md#createDeviceLinkGroup) | **POST** /ne/v1/links | Create Device Link |
| [**deleteDeviceLinkGroupByUuid**](DeviceLinkGroupsAndConnectionsApi.md#deleteDeviceLinkGroupByUuid) | **DELETE** /ne/v1/links/{uuid} | Delete Device Link By Uuid |
| [**getDeviceLinkGroupByUUID**](DeviceLinkGroupsAndConnectionsApi.md#getDeviceLinkGroupByUUID) | **GET** /ne/v1/links/{uuid} | Get Device Link By Uuid |
| [**getDeviceLinkGroups**](DeviceLinkGroupsAndConnectionsApi.md#getDeviceLinkGroups) | **GET** /ne/v1/links | Get Device Links |
| [**updateDeviceLinkGroupByUuid**](DeviceLinkGroupsAndConnectionsApi.md#updateDeviceLinkGroupByUuid) | **PATCH** /ne/v1/links/{uuid} | Update Device Link By Uuid |


<a id="createDeviceLinkGroup"></a>
# **createDeviceLinkGroup**
> DeviceLinkGroupResponse createDeviceLinkGroup(deviceLinkGroup)

Create Device Link

Call this API to create a device link between virtual devices. You can include any devices that are registered and provisioned.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceLinkGroupsAndConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceLinkGroupsAndConnectionsApi apiInstance = new DeviceLinkGroupsAndConnectionsApi(defaultClient);
    DeviceLinkRequest deviceLinkGroup = new DeviceLinkRequest(); // DeviceLinkRequest | New Device Link Group
    try {
      DeviceLinkGroupResponse result = apiInstance.createDeviceLinkGroup(deviceLinkGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceLinkGroupsAndConnectionsApi#createDeviceLinkGroup");
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
| **deviceLinkGroup** | [**DeviceLinkRequest**](DeviceLinkRequest.md)| New Device Link Group | |

### Return type

[**DeviceLinkGroupResponse**](DeviceLinkGroupResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Unique ID of the device link group. |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteDeviceLinkGroupByUuid"></a>
# **deleteDeviceLinkGroupByUuid**
> deleteDeviceLinkGroupByUuid(uuid)

Delete Device Link By Uuid

This method deletes a device link group. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceLinkGroupsAndConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceLinkGroupsAndConnectionsApi apiInstance = new DeviceLinkGroupsAndConnectionsApi(defaultClient);
    String uuid = "6ea5a0e4-2bf7-45c2-9aa7-e846a8cd5567"; // String | Unique Id of a device link group.
    try {
      apiInstance.deleteDeviceLinkGroupByUuid(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceLinkGroupsAndConnectionsApi#deleteDeviceLinkGroupByUuid");
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
| **uuid** | **String**| Unique Id of a device link group. | |

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
| **204** | Request fulfilled. |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDeviceLinkGroupByUUID"></a>
# **getDeviceLinkGroupByUUID**
> DeviceLinkGroup getDeviceLinkGroupByUUID(uuid)

Get Device Link By Uuid

This API will return a device link by its unique Id. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceLinkGroupsAndConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceLinkGroupsAndConnectionsApi apiInstance = new DeviceLinkGroupsAndConnectionsApi(defaultClient);
    String uuid = "6ea5a0e4-2bf7-45c2-9aa7-e846a8cd5567"; // String | Unique Id of a device link group.
    try {
      DeviceLinkGroup result = apiInstance.getDeviceLinkGroupByUUID(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceLinkGroupsAndConnectionsApi#getDeviceLinkGroupByUUID");
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
| **uuid** | **String**| Unique Id of a device link group. | |

### Return type

[**DeviceLinkGroup**](DeviceLinkGroup.md)

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

<a id="getDeviceLinkGroups"></a>
# **getDeviceLinkGroups**
> GetLinksResponse getDeviceLinkGroups(projectIds, metro, virtualDeviceUuid, accountUcmId, groupUuid, groupName, offset, limit)

Get Device Links

This method returns device links. You can link any two or more devices that are registered and provisioned.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceLinkGroupsAndConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceLinkGroupsAndConnectionsApi apiInstance = new DeviceLinkGroupsAndConnectionsApi(defaultClient);
    String projectIds = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | If projectIds are different from default projectIds, must pass a projectIds parameter
    String metro = "SV"; // String | Metro Code
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a virtual device.
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | Unique Id of the account. A reseller querying for a customer's link groups can pass the accountUcmId of the customer's account.
    String groupUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a link group
    String groupName = "linkGroup"; // String | The name of a link group
    Integer offset = 0; // Integer | Specifies where to start a page.
    Integer limit = 20; // Integer | Specifies the page size.
    try {
      GetLinksResponse result = apiInstance.getDeviceLinkGroups(projectIds, metro, virtualDeviceUuid, accountUcmId, groupUuid, groupName, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceLinkGroupsAndConnectionsApi#getDeviceLinkGroups");
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
| **projectIds** | **String**| If projectIds are different from default projectIds, must pass a projectIds parameter | [optional] |
| **metro** | **String**| Metro Code | [optional] |
| **virtualDeviceUuid** | **String**| Unique Id of a virtual device. | [optional] |
| **accountUcmId** | **String**| Unique Id of the account. A reseller querying for a customer&#39;s link groups can pass the accountUcmId of the customer&#39;s account. | [optional] |
| **groupUuid** | **String**| Unique Id of a link group | [optional] |
| **groupName** | **String**| The name of a link group | [optional] |
| **offset** | **Integer**| Specifies where to start a page. | [optional] [default to 0] |
| **limit** | **Integer**| Specifies the page size. | [optional] [default to 20] |

### Return type

[**GetLinksResponse**](GetLinksResponse.md)

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

<a id="updateDeviceLinkGroupByUuid"></a>
# **updateDeviceLinkGroupByUuid**
> updateDeviceLinkGroupByUuid(uuid, deviceLinkGroup)

Update Device Link By Uuid

Call this API to update a device link. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceLinkGroupsAndConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceLinkGroupsAndConnectionsApi apiInstance = new DeviceLinkGroupsAndConnectionsApi(defaultClient);
    String uuid = "6ea5a0e4-2bf7-45c2-9aa7-e846a8cd5567"; // String | Unique Id of a device link group.
    DeviceLinkRequest deviceLinkGroup = new DeviceLinkRequest(); // DeviceLinkRequest | Device Link Group
    try {
      apiInstance.updateDeviceLinkGroupByUuid(uuid, deviceLinkGroup);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceLinkGroupsAndConnectionsApi#updateDeviceLinkGroupByUuid");
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
| **uuid** | **String**| Unique Id of a device link group. | |
| **deviceLinkGroup** | [**DeviceLinkRequest**](DeviceLinkRequest.md)| Device Link Group | |

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
| **204** | Request fulfilled. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

