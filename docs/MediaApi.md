# MediaApi

All URIs are relative to *https://api.phone.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountMedia**](MediaApi.md#createAccountMedia) | **POST** /accounts/{account_id}/media | Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)
[**deleteAccountMedia**](MediaApi.md#deleteAccountMedia) | **DELETE** /accounts/{account_id}/media/{media_id} | Delete an individual media record
[**getAccountMedia**](MediaApi.md#getAccountMedia) | **GET** /accounts/{account_id}/media/{media_id} | Show details of an individual media recording (Greeting or Hold Music)
[**listAccountMedia**](MediaApi.md#listAccountMedia) | **GET** /accounts/{account_id}/media | Get a list of media recordings for an account
[**replaceAccountMedia**](MediaApi.md#replaceAccountMedia) | **PUT** /accounts/{account_id}/media/{media_id} | Update a media object to your account. Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB.


<a name="createAccountMedia"></a>
# **createAccountMedia**
> MediaFull createAccountMedia(accountId, data)

Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)

See Account Media for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
CreateMediaParams data = new CreateMediaParams(); // CreateMediaParams | Media data
try {
    MediaFull result = apiInstance.createAccountMedia(accountId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#createAccountMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **data** | [**CreateMediaParams**](CreateMediaParams.md)| Media data | [optional]

### Return type

[**MediaFull**](MediaFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountMedia"></a>
# **deleteAccountMedia**
> DeleteMedia deleteAccountMedia(accountId, mediaId)

Delete an individual media record

See Account Media for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
Integer mediaId = 56; // Integer | Media ID
try {
    DeleteMedia result = apiInstance.deleteAccountMedia(accountId, mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#deleteAccountMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **mediaId** | **Integer**| Media ID |

### Return type

[**DeleteMedia**](DeleteMedia.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountMedia"></a>
# **getAccountMedia**
> MediaFull getAccountMedia(accountId, mediaId)

Show details of an individual media recording (Greeting or Hold Music)

Get individual media recording

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
Integer mediaId = 56; // Integer | Media ID
try {
    MediaFull result = apiInstance.getAccountMedia(accountId, mediaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#getAccountMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **mediaId** | **Integer**| Media ID |

### Return type

[**MediaFull**](MediaFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAccountMedia"></a>
# **listAccountMedia**
> ListMedia listAccountMedia(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields)

Get a list of media recordings for an account

See Account Menus for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
List<String> filtersId = Arrays.asList("filtersId_example"); // List<String> | ID filter
List<String> filtersName = Arrays.asList("filtersName_example"); // List<String> | Name filter
String sortId = "sortId_example"; // String | ID sorting
String sortName = "sortName_example"; // String | Name sorting
Integer limit = 56; // Integer | Max results
Integer offset = 56; // Integer | Results to skip
String fields = "fields_example"; // String | Field set
try {
    ListMedia result = apiInstance.listAccountMedia(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#listAccountMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **filtersId** | [**List&lt;String&gt;**](String.md)| ID filter | [optional]
 **filtersName** | [**List&lt;String&gt;**](String.md)| Name filter | [optional]
 **sortId** | **String**| ID sorting | [optional]
 **sortName** | **String**| Name sorting | [optional]
 **limit** | **Integer**| Max results | [optional]
 **offset** | **Integer**| Results to skip | [optional]
 **fields** | **String**| Field set | [optional]

### Return type

[**ListMedia**](ListMedia.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceAccountMedia"></a>
# **replaceAccountMedia**
> MediaFull replaceAccountMedia(accountId, mediaId, data)

Update a media object to your account. Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB.

See Account Media for more info on the properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MediaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

MediaApi apiInstance = new MediaApi();
Integer accountId = 56; // Integer | Account ID
Integer mediaId = 56; // Integer | Media ID
CreateMediaParams data = new CreateMediaParams(); // CreateMediaParams | Media data
try {
    MediaFull result = apiInstance.replaceAccountMedia(accountId, mediaId, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaApi#replaceAccountMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Integer**| Account ID |
 **mediaId** | **Integer**| Media ID |
 **data** | [**CreateMediaParams**](CreateMediaParams.md)| Media data | [optional]

### Return type

[**MediaFull**](MediaFull.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

