# CompanyProfilesApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachPrivateServiceToProfile**](CompanyProfilesApi.md#attachPrivateServiceToProfile) | **PUT** /fabric/v4/companyProfiles/{companyProfileId}/privateServices/{privateServiceId} | Attach Private Service |
| [**attachServiceProfileToProfile**](CompanyProfilesApi.md#attachServiceProfileToProfile) | **PUT** /fabric/v4/companyProfiles/{companyProfileId}/serviceProfiles/{serviceProfileId} | Attach Service Profile |
| [**attachTagToProfile**](CompanyProfilesApi.md#attachTagToProfile) | **PUT** /fabric/v4/companyProfiles/{companyProfileId}/tags/{tagId} | Attach Tag |
| [**createCompanyProfile**](CompanyProfilesApi.md#createCompanyProfile) | **POST** /fabric/v4/companyProfiles | Create Company Profile |
| [**deleteCompanyProfile**](CompanyProfilesApi.md#deleteCompanyProfile) | **DELETE** /fabric/v4/companyProfiles/{companyProfileId} | Delete Company Profile |
| [**detachPrivateServiceFromProfile**](CompanyProfilesApi.md#detachPrivateServiceFromProfile) | **DELETE** /fabric/v4/companyProfiles/{companyProfileId}/privateServices/{privateServiceId} | Detach Private Service |
| [**detachServiceProfileFromProfile**](CompanyProfilesApi.md#detachServiceProfileFromProfile) | **DELETE** /fabric/v4/companyProfiles/{companyProfileId}/serviceProfiles/{serviceProfileId} | Detach Service Profile |
| [**detachTagFromProfile**](CompanyProfilesApi.md#detachTagFromProfile) | **DELETE** /fabric/v4/companyProfiles/{companyProfileId}/tags/{tagId} | Detach Tag |
| [**getCompanyProfile**](CompanyProfilesApi.md#getCompanyProfile) | **GET** /fabric/v4/companyProfiles/{companyProfileId} | Get Company Profile by UUID |
| [**getCompanyProfilePrivateServices**](CompanyProfilesApi.md#getCompanyProfilePrivateServices) | **GET** /fabric/v4/companyProfiles/{companyProfileId}/privateServices | Get Private Services |
| [**getCompanyProfileServiceProfiles**](CompanyProfilesApi.md#getCompanyProfileServiceProfiles) | **GET** /fabric/v4/companyProfiles/{companyProfileId}/serviceProfiles | Get Service Profiles |
| [**getTags**](CompanyProfilesApi.md#getTags) | **GET** /fabric/v4/companyProfiles/{companyProfileId}/tags | Get Tags |
| [**searchCompanyProfile**](CompanyProfilesApi.md#searchCompanyProfile) | **POST** /fabric/v4/companyProfiles/search | Search Company Profiles |


<a id="attachPrivateServiceToProfile"></a>
# **attachPrivateServiceToProfile**
> AttachPrivateServiceResponse attachPrivateServiceToProfile(companyProfileId, privateServiceId)

Attach Private Service

Attach a private service to a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    String privateServiceId = "privateServiceId_example"; // String | Private Service UUID
    try {
      AttachPrivateServiceResponse result = apiInstance.attachPrivateServiceToProfile(companyProfileId, privateServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#attachPrivateServiceToProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |
| **privateServiceId** | **String**| Private Service UUID | |

### Return type

[**AttachPrivateServiceResponse**](AttachPrivateServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="attachServiceProfileToProfile"></a>
# **attachServiceProfileToProfile**
> AttachServiceProfileResponse attachServiceProfileToProfile(companyProfileId, serviceProfileId)

Attach Service Profile

Attach a service profile to a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    String serviceProfileId = "serviceProfileId_example"; // String | Service Profile UUID
    try {
      AttachServiceProfileResponse result = apiInstance.attachServiceProfileToProfile(companyProfileId, serviceProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#attachServiceProfileToProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |
| **serviceProfileId** | **String**| Service Profile UUID | |

### Return type

[**AttachServiceProfileResponse**](AttachServiceProfileResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="attachTagToProfile"></a>
# **attachTagToProfile**
> AttachTagResponse attachTagToProfile(companyProfileId, tagId)

Attach Tag

Attach a tag to a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    String tagId = "tagId_example"; // String | Tag UUID
    try {
      AttachTagResponse result = apiInstance.attachTagToProfile(companyProfileId, tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#attachTagToProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |
| **tagId** | **String**| Tag UUID | |

### Return type

[**AttachTagResponse**](AttachTagResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="createCompanyProfile"></a>
# **createCompanyProfile**
> CompanyProfileResponse createCompanyProfile(companyProfileRequest)

Create Company Profile

Create a new company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    CompanyProfileRequest companyProfileRequest = new CompanyProfileRequest(); // CompanyProfileRequest | 
    try {
      CompanyProfileResponse result = apiInstance.createCompanyProfile(companyProfileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#createCompanyProfile");
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
| **companyProfileRequest** | [**CompanyProfileRequest**](CompanyProfileRequest.md)|  | |

### Return type

[**CompanyProfileResponse**](CompanyProfileResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Company profile created successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a id="deleteCompanyProfile"></a>
# **deleteCompanyProfile**
> CompanyProfileResponse deleteCompanyProfile(companyProfileId)

Delete Company Profile

Delete company profile by UUID &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    try {
      CompanyProfileResponse result = apiInstance.deleteCompanyProfile(companyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#deleteCompanyProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |

### Return type

[**CompanyProfileResponse**](CompanyProfileResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="detachPrivateServiceFromProfile"></a>
# **detachPrivateServiceFromProfile**
> AttachPrivateServiceResponse detachPrivateServiceFromProfile(companyProfileId, privateServiceId)

Detach Private Service

Detach a private service from a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    String privateServiceId = "privateServiceId_example"; // String | Private Service UUID
    try {
      AttachPrivateServiceResponse result = apiInstance.detachPrivateServiceFromProfile(companyProfileId, privateServiceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#detachPrivateServiceFromProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |
| **privateServiceId** | **String**| Private Service UUID | |

### Return type

[**AttachPrivateServiceResponse**](AttachPrivateServiceResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="detachServiceProfileFromProfile"></a>
# **detachServiceProfileFromProfile**
> AttachServiceProfileResponse detachServiceProfileFromProfile(companyProfileId, serviceProfileId)

Detach Service Profile

Detach a service profile from a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    String serviceProfileId = "serviceProfileId_example"; // String | Service Profile UUID
    try {
      AttachServiceProfileResponse result = apiInstance.detachServiceProfileFromProfile(companyProfileId, serviceProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#detachServiceProfileFromProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |
| **serviceProfileId** | **String**| Service Profile UUID | |

### Return type

[**AttachServiceProfileResponse**](AttachServiceProfileResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="detachTagFromProfile"></a>
# **detachTagFromProfile**
> AttachTagResponse detachTagFromProfile(companyProfileId, tagId)

Detach Tag

Detach a tag from a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    String tagId = "tagId_example"; // String | Tag UUID
    try {
      AttachTagResponse result = apiInstance.detachTagFromProfile(companyProfileId, tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#detachTagFromProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |
| **tagId** | **String**| Tag UUID | |

### Return type

[**AttachTagResponse**](AttachTagResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="getCompanyProfile"></a>
# **getCompanyProfile**
> CompanyProfileResponse getCompanyProfile(companyProfileId)

Get Company Profile by UUID

Get company profile details by UUID &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    try {
      CompanyProfileResponse result = apiInstance.getCompanyProfile(companyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#getCompanyProfile");
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
| **companyProfileId** | **String**| Company Profile UUID | |

### Return type

[**CompanyProfileResponse**](CompanyProfileResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="getCompanyProfilePrivateServices"></a>
# **getCompanyProfilePrivateServices**
> PrivateServiceListResponse getCompanyProfilePrivateServices(companyProfileId)

Get Private Services

Get all private services attached to a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    try {
      PrivateServiceListResponse result = apiInstance.getCompanyProfilePrivateServices(companyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#getCompanyProfilePrivateServices");
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
| **companyProfileId** | **String**| Company Profile UUID | |

### Return type

[**PrivateServiceListResponse**](PrivateServiceListResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="getCompanyProfileServiceProfiles"></a>
# **getCompanyProfileServiceProfiles**
> ServiceProfileListResponse getCompanyProfileServiceProfiles(companyProfileId)

Get Service Profiles

Get all service profiles attached to a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    try {
      ServiceProfileListResponse result = apiInstance.getCompanyProfileServiceProfiles(companyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#getCompanyProfileServiceProfiles");
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
| **companyProfileId** | **String**| Company Profile UUID | |

### Return type

[**ServiceProfileListResponse**](ServiceProfileListResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="getTags"></a>
# **getTags**
> TagListResponse getTags(companyProfileId)

Get Tags

Get all tags attached to a company profile &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    String companyProfileId = "companyProfileId_example"; // String | Company Profile UUID
    try {
      TagListResponse result = apiInstance.getTags(companyProfileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#getTags");
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
| **companyProfileId** | **String**| Company Profile UUID | |

### Return type

[**TagListResponse**](TagListResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a id="searchCompanyProfile"></a>
# **searchCompanyProfile**
> CompanyProfileSearchResponse searchCompanyProfile(companyProfileSearchRequest, viewPoint)

Search Company Profiles

Search company profiles based on filter criteria &lt;font color&#x3D;\&quot;red\&quot;&gt; &lt;sup color&#x3D;&#39;red&#39;&gt;Beta&lt;/sup&gt;&lt;/font&gt;

### Example
```java
// Import classes:
import com.equinix.sdk.fabricv4.ApiClient;
import com.equinix.sdk.fabricv4.ApiException;
import com.equinix.sdk.fabricv4.Configuration;
import com.equinix.sdk.fabricv4.auth.*;
import com.equinix.sdk.fabricv4.models.*;
import com.equinix.sdk.fabricv4.api.CompanyProfilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CompanyProfilesApi apiInstance = new CompanyProfilesApi(defaultClient);
    CompanyProfileSearchRequest companyProfileSearchRequest = new CompanyProfileSearchRequest(); // CompanyProfileSearchRequest | 
    String viewPoint = "aSide"; // String | Viewpoint for the request, either 'aSide' or 'zSide'
    try {
      CompanyProfileSearchResponse result = apiInstance.searchCompanyProfile(companyProfileSearchRequest, viewPoint);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyProfilesApi#searchCompanyProfile");
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
| **companyProfileSearchRequest** | [**CompanyProfileSearchRequest**](CompanyProfileSearchRequest.md)|  | |
| **viewPoint** | **String**| Viewpoint for the request, either &#39;aSide&#39; or &#39;zSide&#39; | [optional] [default to aSide] |

### Return type

[**CompanyProfileSearchResponse**](CompanyProfileSearchResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |

