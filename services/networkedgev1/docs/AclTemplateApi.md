# AclTemplateApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDeviceACLTemplate**](AclTemplateApi.md#createDeviceACLTemplate) | **POST** /ne/v1/aclTemplates | Create ACL Template |
| [**createDeviceTemplatesbyUuid**](AclTemplateApi.md#createDeviceTemplatesbyUuid) | **POST** /ne/v1/devices/{virtualDeviceUuid}/acl | Add ACL to Virtual Device |
| [**deleteDeviceACLByUuid**](AclTemplateApi.md#deleteDeviceACLByUuid) | **DELETE** /ne/v1/aclTemplates/{uuid} | Delete ACL template By Uuid |
| [**getDeviceACLTemplate**](AclTemplateApi.md#getDeviceACLTemplate) | **GET** /ne/v1/aclTemplates | Get ACL Templates |
| [**getDeviceTemplateByUuid**](AclTemplateApi.md#getDeviceTemplateByUuid) | **GET** /ne/v1/aclTemplates/{uuid} | Get ACL Template By Uuid |
| [**getDeviceTemplatesByUuid**](AclTemplateApi.md#getDeviceTemplatesByUuid) | **GET** /ne/v1/devices/{virtualDeviceUuid}/acl | Get ACL of Virtual Device |
| [**updateDeviceACLTemplateByUuid**](AclTemplateApi.md#updateDeviceACLTemplateByUuid) | **PUT** /ne/v1/aclTemplates/{uuid} | Update ACL Template By Uuid |
| [**updateDeviceTemplatesbyUuid**](AclTemplateApi.md#updateDeviceTemplatesbyUuid) | **PATCH** /ne/v1/devices/{virtualDeviceUuid}/acl | Update ACL of Virtual Device |


<a id="createDeviceACLTemplate"></a>
# **createDeviceACLTemplate**
> VirtualDeviceCreateResponse createDeviceACLTemplate(aclTemplateRequest, accountUcmId)

Create ACL Template

Creates ACL templates. You can find the unique ID of the ACL template in the location header.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    DeviceACLTemplateRequest aclTemplateRequest = new DeviceACLTemplateRequest(); // DeviceACLTemplateRequest | Creates an ACL template.
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | A reseller creating an ACL template for a customer can pass the accountUcmId of the customer.
    try {
      VirtualDeviceCreateResponse result = apiInstance.createDeviceACLTemplate(aclTemplateRequest, accountUcmId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#createDeviceACLTemplate");
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
| **aclTemplateRequest** | [**DeviceACLTemplateRequest**](DeviceACLTemplateRequest.md)| Creates an ACL template. | |
| **accountUcmId** | **String**| A reseller creating an ACL template for a customer can pass the accountUcmId of the customer. | [optional] |

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
| **201** | ACL template created. The response is the unique ID of the ACL template. |  -  |
| **400** | Bad request |  -  |
| **404** | Resource Not found |  -  |
| **500** | Internal Server Error |  -  |

<a id="createDeviceTemplatesbyUuid"></a>
# **createDeviceTemplatesbyUuid**
> createDeviceTemplatesbyUuid(virtualDeviceUuid, aclTemplateRequest, accountUcmId)

Add ACL to Virtual Device

Updates the details of ACL templates associated with a device. You must provide the unique ID of an existing virtual device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a virtual device.
    UpdateDeviceACLTemplateRequest aclTemplateRequest = new UpdateDeviceACLTemplateRequest(); // UpdateDeviceACLTemplateRequest | Update the ACL of a device.
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | A reseller updating a device ACL template for a customer can pass the accountUcmId of the customer.
    try {
      apiInstance.createDeviceTemplatesbyUuid(virtualDeviceUuid, aclTemplateRequest, accountUcmId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#createDeviceTemplatesbyUuid");
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
| **virtualDeviceUuid** | **String**| Unique Id of a virtual device. | |
| **aclTemplateRequest** | [**UpdateDeviceACLTemplateRequest**](UpdateDeviceACLTemplateRequest.md)| Update the ACL of a device. | |
| **accountUcmId** | **String**| A reseller updating a device ACL template for a customer can pass the accountUcmId of the customer. | [optional] |

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
| **204** | Successfully updated |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteDeviceACLByUuid"></a>
# **deleteDeviceACLByUuid**
> deleteDeviceACLByUuid(uuid, accountUcmId)

Delete ACL template By Uuid

Deletes an ACL template. You must provide the unique Id of the ACL template as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    String uuid = "be7ef79e-31e7-4769-be5b-e192496f48aa"; // String | Unique ID of an ACL template
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | A reseller deleting an ACL template for a customer must pass the accountUcmId of the customer.
    try {
      apiInstance.deleteDeviceACLByUuid(uuid, accountUcmId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#deleteDeviceACLByUuid");
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
| **uuid** | **String**| Unique ID of an ACL template | |
| **accountUcmId** | **String**| A reseller deleting an ACL template for a customer must pass the accountUcmId of the customer. | [optional] |

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
| **204** | The deletion is in progress. |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDeviceACLTemplate"></a>
# **getDeviceACLTemplate**
> GetACLTemplateResponse getDeviceACLTemplate(offset, limit, accountUcmId, projectIds)

Get ACL Templates

Returns all ACL templates. The ACL templates list the networks that require access to the device.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    Integer offset = 0; // Integer | Specifies where to start a page. It is the starting point of the collection returned from the server.
    Integer limit = 20; // Integer | Specifies the page size.
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | Unique ID of the account. A reseller querying for the ACLs of a customer should input the accountUcmId of the customer.
    String projectIds = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | If projectIds are different from default projectIds, must pass a projectIds parameter
    try {
      GetACLTemplateResponse result = apiInstance.getDeviceACLTemplate(offset, limit, accountUcmId, projectIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#getDeviceACLTemplate");
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
| **accountUcmId** | **String**| Unique ID of the account. A reseller querying for the ACLs of a customer should input the accountUcmId of the customer. | [optional] |
| **projectIds** | **String**| If projectIds are different from default projectIds, must pass a projectIds parameter | [optional] |

### Return type

[**GetACLTemplateResponse**](GetACLTemplateResponse.md)

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

<a id="getDeviceTemplateByUuid"></a>
# **getDeviceTemplateByUuid**
> ACLTemplateDetailsResponse getDeviceTemplateByUuid(uuid)

Get ACL Template By Uuid

Returns details of any existing template. You must provide the unique ID of an existing template as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    String uuid = "be7ef79e-31e7-4769-be5b-e192496f48aa"; // String | Unique Id of an ACL template
    try {
      ACLTemplateDetailsResponse result = apiInstance.getDeviceTemplateByUuid(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#getDeviceTemplateByUuid");
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
| **uuid** | **String**| Unique Id of an ACL template | |

### Return type

[**ACLTemplateDetailsResponse**](ACLTemplateDetailsResponse.md)

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

<a id="getDeviceTemplatesByUuid"></a>
# **getDeviceTemplatesByUuid**
> InitialDeviceACLResponse getDeviceTemplatesByUuid(virtualDeviceUuid)

Get ACL of Virtual Device

Returns the details of ACL templates associated with a device. You must provide the unique ID of an existing virtual device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a virtual device.
    try {
      InitialDeviceACLResponse result = apiInstance.getDeviceTemplatesByUuid(virtualDeviceUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#getDeviceTemplatesByUuid");
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
| **virtualDeviceUuid** | **String**| Unique Id of a virtual device. | |

### Return type

[**InitialDeviceACLResponse**](InitialDeviceACLResponse.md)

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

<a id="updateDeviceACLTemplateByUuid"></a>
# **updateDeviceACLTemplateByUuid**
> updateDeviceACLTemplateByUuid(uuid, aclTemplateRequest, accountUcmId)

Update ACL Template By Uuid

Updates an ACL template. You must pass the unique Id of the ACL template as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    String uuid = "be7ef79e-31e7-4769-be5b-e192496f48aa"; // String | Unique ID of an ACL template
    DeviceACLTemplateRequest aclTemplateRequest = new DeviceACLTemplateRequest(); // DeviceACLTemplateRequest | Update an ACL template.
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | A reseller updating an ACL template for a customer must pass the accountUcmId of the customer.
    try {
      apiInstance.updateDeviceACLTemplateByUuid(uuid, aclTemplateRequest, accountUcmId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#updateDeviceACLTemplateByUuid");
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
| **uuid** | **String**| Unique ID of an ACL template | |
| **aclTemplateRequest** | [**DeviceACLTemplateRequest**](DeviceACLTemplateRequest.md)| Update an ACL template. | |
| **accountUcmId** | **String**| A reseller updating an ACL template for a customer must pass the accountUcmId of the customer. | [optional] |

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
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateDeviceTemplatesbyUuid"></a>
# **updateDeviceTemplatesbyUuid**
> updateDeviceTemplatesbyUuid(virtualDeviceUuid, aclTemplateRequest, accountUcmId)

Update ACL of Virtual Device

Updates or removes the details of ACL templates associated with a device. You must provide the unique ID of an existing virtual device as a path parameter.

### Example
```java
// Import classes:
import com.equinix.sdk.networkedgev1.ApiClient;
import com.equinix.sdk.networkedgev1.ApiException;
import com.equinix.sdk.networkedgev1.Configuration;
import com.equinix.sdk.networkedgev1.auth.*;
import com.equinix.sdk.networkedgev1.models.*;
import com.equinix.sdk.networkedgev1.api.AclTemplateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AclTemplateApi apiInstance = new AclTemplateApi(defaultClient);
    String virtualDeviceUuid = "3da0a663-20d9-4b8f-8c5d-d5cf706840c8"; // String | Unique Id of a virtual device.
    UpdateDeviceACLTemplateRequest aclTemplateRequest = new UpdateDeviceACLTemplateRequest(); // UpdateDeviceACLTemplateRequest | Update the ACL of a device.
    String accountUcmId = "92D27009-EA33-4b60-B4FB-D3C4ED589649"; // String | A reseller updating a device ACL template for a customer can pass the accountUcmId of the customer.
    try {
      apiInstance.updateDeviceTemplatesbyUuid(virtualDeviceUuid, aclTemplateRequest, accountUcmId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AclTemplateApi#updateDeviceTemplatesbyUuid");
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
| **virtualDeviceUuid** | **String**| Unique Id of a virtual device. | |
| **aclTemplateRequest** | [**UpdateDeviceACLTemplateRequest**](UpdateDeviceACLTemplateRequest.md)| Update the ACL of a device. | |
| **accountUcmId** | **String**| A reseller updating a device ACL template for a customer can pass the accountUcmId of the customer. | [optional] |

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
| **204** | Successfully updated |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

