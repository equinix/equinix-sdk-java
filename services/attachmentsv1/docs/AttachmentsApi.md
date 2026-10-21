# AttachmentsApi

All URIs are relative to *https://api.equinix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttachment**](AttachmentsApi.md#createAttachment) | **POST** /v1/attachments/file | Upload a Multipart File |
| [**deleteAttachment**](AttachmentsApi.md#deleteAttachment) | **DELETE** /v1/attachments/{attachmentId} | Delete Attachment by Id |
| [**getAttachedFile**](AttachmentsApi.md#getAttachedFile) | **GET** /v1/attachments/{attachmentId}/file | Download Attachment File |
| [**getAttachment**](AttachmentsApi.md#getAttachment) | **GET** /v1/attachments/{attachmentId} | Get Attachment by Id |
| [**getAttachments**](AttachmentsApi.md#getAttachments) | **GET** /v1/attachments | Get List of Attachments |


<a id="createAttachment"></a>
# **createAttachment**
> Attachment createAttachment(authorization, uploadFile, purpose)

Upload a Multipart File

This method can be used to upload an attachment as a multipart file.

### Example
```java
// Import classes:
import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.ApiException;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.models.*;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer '.
    File uploadFile = new File("/path/to/file"); // File | The file to be uploaded
    String purpose = "LOA"; // String | Purpose of the file is uploaded. [ ex. LOA is for Cross connect, PO is for Purchar order ]
    try {
      Attachment result = apiInstance.createAttachment(authorization, uploadFile, purpose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#createAttachment");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer &#39;. | |
| **uploadFile** | **File**| The file to be uploaded | |
| **purpose** | **String**| Purpose of the file is uploaded. [ ex. LOA is for Cross connect, PO is for Purchar order ] | [optional] [enum: LOA, PO_DOCUMENT] |

### Return type

[**Attachment**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **405** | method not allowed |  -  |
| **500** |  |  -  |
| **503** |  |  -  |

<a id="deleteAttachment"></a>
# **deleteAttachment**
> Status deleteAttachment(attachmentId, authorization)

Delete Attachment by Id

This method deletes the attachment with a specific id value.

### Example
```java
// Import classes:
import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.ApiException;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.models.*;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    UUID attachmentId = UUID.randomUUID(); // UUID | The id of the attachment.
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer '.
    try {
      Status result = apiInstance.deleteAttachment(attachmentId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#deleteAttachment");
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
| **attachmentId** | **UUID**| The id of the attachment. | |
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer &#39;. | |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **405** | method not allowed |  -  |
| **500** |  |  -  |
| **503** |  |  -  |

<a id="getAttachedFile"></a>
# **getAttachedFile**
> getAttachedFile(attachmentId, authorization)

Download Attachment File

This method gets the binary file attachment with a specific attachment id value.

### Example
```java
// Import classes:
import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.ApiException;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.models.*;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    UUID attachmentId = UUID.randomUUID(); // UUID | The id of the attachment record you want to get binary data from.
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer '.
    try {
      apiInstance.getAttachedFile(attachmentId, authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#getAttachedFile");
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
| **attachmentId** | **UUID**| The id of the attachment record you want to get binary data from. | |
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer &#39;. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | FileName will be mentioned in the CONTENT_DISPOSITION Header, File will be downloaded automatically if used browser |  -  |
| **404** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |
| **405** | method not allowed |  -  |

<a id="getAttachment"></a>
# **getAttachment**
> Attachment getAttachment(attachmentId, authorization)

Get Attachment by Id

This method gets the metadata for the attachment file with a specific. attachment id value. 

### Example
```java
// Import classes:
import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.ApiException;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.models.*;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    UUID attachmentId = UUID.randomUUID(); // UUID | The id of the attachment.
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer '.
    try {
      Attachment result = apiInstance.getAttachment(attachmentId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#getAttachment");
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
| **attachmentId** | **UUID**| The id of the attachment. | |
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer &#39;. | |

### Return type

[**Attachment**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** |  |  -  |
| **403** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |
| **405** | method not allowed |  -  |

<a id="getAttachments"></a>
# **getAttachments**
> Records getAttachments(authorization, offset, limit, attachmentIds)

Get List of Attachments

This method gets the metadata for multiple attachments. The response is paginated and will output limited number of records per page.

### Example
```java
// Import classes:
import com.equinix.sdk.attachmentsv1.ApiClient;
import com.equinix.sdk.attachmentsv1.ApiException;
import com.equinix.sdk.attachmentsv1.Configuration;
import com.equinix.sdk.attachmentsv1.models.*;
import com.equinix.sdk.attachmentsv1.api.AttachmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.equinix.com");

    AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
    String authorization = "authorization_example"; // String | Specify the Access token with prefix 'Bearer '.
    Integer offset = 0; // Integer | Page number to skip the results
    Integer limit = 20; // Integer | Number of expected records in the response
    Set<String> attachmentIds = Arrays.asList(); // Set<String> | Comma separated attachment ids to search
    try {
      Records result = apiInstance.getAttachments(authorization, offset, limit, attachmentIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentsApi#getAttachments");
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
| **authorization** | **String**| Specify the Access token with prefix &#39;Bearer &#39;. | |
| **offset** | **Integer**| Page number to skip the results | [optional] [default to 0] |
| **limit** | **Integer**| Number of expected records in the response | [optional] [default to 20] |
| **attachmentIds** | [**Set&lt;String&gt;**](String.md)| Comma separated attachment ids to search | [optional] |

### Return type

[**Records**](Records.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **500** |  |  -  |
| **503** |  |  -  |
| **405** | method not allowed |  -  |

