# DeviceBackupAndRestoreApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkRestoreAnalysisOfBackupByUuid**](DeviceBackupAndRestoreApi.md#checkRestoreAnalysisOfBackupByUuid) | **GET** /ne/v1/devices/{uuid}/restoreAnalysis | Checks Feasibility of Restore |
| [**createDeviceBackup**](DeviceBackupAndRestoreApi.md#createDeviceBackup) | **POST** /ne/v1/deviceBackups | Creates Device Backup |
| [**deleteDeviceBackupByUuid**](DeviceBackupAndRestoreApi.md#deleteDeviceBackupByUuid) | **DELETE** /ne/v1/deviceBackups/{uuid} | Delete Backup of Device |
| [**downloadDeviceBackupByUuid**](DeviceBackupAndRestoreApi.md#downloadDeviceBackupByUuid) | **GET** /ne/v1/deviceBackups/{uuid}/download | Download a Backup |
| [**getDetailsOfBackupsByUuid**](DeviceBackupAndRestoreApi.md#getDetailsOfBackupsByUuid) | **GET** /ne/v1/deviceBackups/{uuid} | Get Backups of Device By Uuid |
| [**getDeviceBackups**](DeviceBackupAndRestoreApi.md#getDeviceBackups) | **GET** /ne/v1/deviceBackups | Get Backups of Device |
| [**restoreDeviceBackupByUuid**](DeviceBackupAndRestoreApi.md#restoreDeviceBackupByUuid) | **PATCH** /ne/v1/devices/{uuid}/restore | Restores a backup |
| [**updateDeviceBackupByUuid**](DeviceBackupAndRestoreApi.md#updateDeviceBackupByUuid) | **PATCH** /ne/v1/deviceBackups/{uuid} | Update Device Backup |


<a id="checkRestoreAnalysisOfBackupByUuid"></a>
# **checkRestoreAnalysisOfBackupByUuid**
> RestoreBackupInfoVerbose checkRestoreAnalysisOfBackupByUuid(uuid, backupUuid)

Checks Feasibility of Restore

Checks the feasibility of restoring the backup of a virtual device. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique ID of a device
    String backupUuid = "4cfb5675-5c3f-4275-adba-0c9e3c26c96b"; // String | Unique ID of a backup
    try {
      RestoreBackupInfoVerbose result = apiInstance.checkRestoreAnalysisOfBackupByUuid(uuid, backupUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#checkRestoreAnalysisOfBackupByUuid");
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
| **uuid** | **String**| Unique ID of a device | |
| **backupUuid** | **String**| Unique ID of a backup | [optional] |

### Return type

[**RestoreBackupInfoVerbose**](RestoreBackupInfoVerbose.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="createDeviceBackup"></a>
# **createDeviceBackup**
> SshUserCreateResponse createDeviceBackup(request)

Creates Device Backup

Creates the backup of a virtual device. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    DeviceBackupCreateRequest request = new DeviceBackupCreateRequest(); // DeviceBackupCreateRequest | Device backup info
    try {
      SshUserCreateResponse result = apiInstance.createDeviceBackup(request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#createDeviceBackup");
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
| **request** | [**DeviceBackupCreateRequest**](DeviceBackupCreateRequest.md)| Device backup info | |

### Return type

[**SshUserCreateResponse**](SshUserCreateResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Unauthorized User |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteDeviceBackupByUuid"></a>
# **deleteDeviceBackupByUuid**
> deleteDeviceBackupByUuid(uuid)

Delete Backup of Device

Deletes a backup by its unique ID. Authorization checks are performed on users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    String uuid = "4cfb5675-5c3f-4275-adba-0c9e3c26c96b"; // String | Unique Id a backup
    try {
      apiInstance.deleteDeviceBackupByUuid(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#deleteDeviceBackupByUuid");
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
| **uuid** | **String**| Unique Id a backup | |

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
| **204** | Deleted successfully. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="downloadDeviceBackupByUuid"></a>
# **downloadDeviceBackupByUuid**
> String downloadDeviceBackupByUuid(uuid)

Download a Backup

Downloads the backup of a device by its backup ID. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    String uuid = "4cfb5675-5c3f-4275-adba-0c9e3c26c96b"; // String | Unique ID of a backup
    try {
      String result = apiInstance.downloadDeviceBackupByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#downloadDeviceBackupByUuid");
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
| **uuid** | **String**| Unique ID of a backup | |

### Return type

**String**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDetailsOfBackupsByUuid"></a>
# **getDetailsOfBackupsByUuid**
> DeviceBackupInfoVerbose getDetailsOfBackupsByUuid(uuid)

Get Backups of Device By Uuid

Returns the details of a backup by its unique ID. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    String uuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique ID of a backup
    try {
      DeviceBackupInfoVerbose result = apiInstance.getDetailsOfBackupsByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#getDetailsOfBackupsByUuid");
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
| **uuid** | **String**| Unique ID of a backup | |

### Return type

[**DeviceBackupInfoVerbose**](DeviceBackupInfoVerbose.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDeviceBackups"></a>
# **getDeviceBackups**
> GetDeviceBackupsResponse getDeviceBackups(projectIds, virtualDeviceUuid, status, offset, limit)

Get Backups of Device

Returns the backups of a virtual device. Authorization checks are performed on the users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    String projectIds = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | If projectIds are different from default projectIds, must pass a projectIds parameter
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique ID of a virtual device
    String status = "COMPLETED"; // String | An array of status values
    Integer offset = 0; // Integer | Specifies where to start a page. It is the starting point of the collection returned from the server.
    Integer limit = 20; // Integer | Specifies the page size.
    try {
      GetDeviceBackupsResponse result = apiInstance.getDeviceBackups(projectIds, virtualDeviceUuid, status, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#getDeviceBackups");
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
| **virtualDeviceUuid** | **String**| Unique ID of a virtual device | [optional] |
| **status** | **String**| An array of status values | [optional] [enum: COMPLETED, FAILED, IN_PROGRESS] |
| **offset** | **Integer**| Specifies where to start a page. It is the starting point of the collection returned from the server. | [optional] [default to 0] |
| **limit** | **Integer**| Specifies the page size. | [optional] [default to 20] |

### Return type

[**GetDeviceBackupsResponse**](GetDeviceBackupsResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a id="restoreDeviceBackupByUuid"></a>
# **restoreDeviceBackupByUuid**
> restoreDeviceBackupByUuid(uuid, request)

Restores a backup

Restores any backup of a device. Authorization checks are performed on users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    String uuid = "4cfb5675-5c3f-4275-adba-0c9e3c26c96b"; // String | Unique ID of a backup
    DeviceBackupUpdateRequest request = new DeviceBackupUpdateRequest(); // DeviceBackupUpdateRequest | Update device backup
    try {
      apiInstance.restoreDeviceBackupByUuid(uuid, request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#restoreDeviceBackupByUuid");
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
| **uuid** | **String**| Unique ID of a backup | |
| **request** | [**DeviceBackupUpdateRequest**](DeviceBackupUpdateRequest.md)| Update device backup | |

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
| **204** | The backup was successfully restored |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateDeviceBackupByUuid"></a>
# **updateDeviceBackupByUuid**
> updateDeviceBackupByUuid(uuid, request)

Update Device Backup

Updates the name of a backup. Authorization checks are performed on users of this API.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.DeviceBackupAndRestoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DeviceBackupAndRestoreApi apiInstance = new DeviceBackupAndRestoreApi(defaultClient);
    String uuid = "4cfb5675-5c3f-4275-adba-0c9e3c26c96b"; // String | Unique ID of a backup
    DeviceBackupUpdateRequest request = new DeviceBackupUpdateRequest(); // DeviceBackupUpdateRequest | Update device backup
    try {
      apiInstance.updateDeviceBackupByUuid(uuid, request);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceBackupAndRestoreApi#updateDeviceBackupByUuid");
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
| **uuid** | **String**| Unique ID of a backup | |
| **request** | [**DeviceBackupUpdateRequest**](DeviceBackupUpdateRequest.md)| Update device backup | |

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
| **204** | Updated successfully |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

