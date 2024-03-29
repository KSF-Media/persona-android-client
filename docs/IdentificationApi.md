# IdentificationApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**identificationLoginGet**](IdentificationApi.md#identificationLoginGet) | **GET** /identification/login | Authenticate with OpenID Connect
[**identificationLoginMonitorGet**](IdentificationApi.md#identificationLoginMonitorGet) | **GET** /identification/login/monitor | Get token for off band response login flow monitor
[**identificationLoginReturnGet**](IdentificationApi.md#identificationLoginReturnGet) | **GET** /identification/login/return | Redirect endpoint for OpenID Connect
[**identificationUserStampUuidPost**](IdentificationApi.md#identificationUserStampUuidPost) | **POST** /identification/user/stamp/{uuid} | Query when the strong identification was last updated



## identificationLoginGet

> identificationLoginGet(monitor)

Authenticate with OpenID Connect

### Example

```java
// Import classes:
//import org.openapitools.client.api.IdentificationApi;

IdentificationApi apiInstance = new IdentificationApi();
String monitor = null; // String | 
try {
    apiInstance.identificationLoginGet(monitor);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentificationApi#identificationLoginGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitor** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## identificationLoginMonitorGet

> identificationLoginMonitorGet()

Get token for off band response login flow monitor

### Example

```java
// Import classes:
//import org.openapitools.client.api.IdentificationApi;

IdentificationApi apiInstance = new IdentificationApi();
try {
    apiInstance.identificationLoginMonitorGet();
} catch (ApiException e) {
    System.err.println("Exception when calling IdentificationApi#identificationLoginMonitorGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## identificationLoginReturnGet

> String identificationLoginReturnGet(code, state, cookie, cookie2)

Redirect endpoint for OpenID Connect

### Example

```java
// Import classes:
//import org.openapitools.client.api.IdentificationApi;

IdentificationApi apiInstance = new IdentificationApi();
String code = null; // String | 
String state = null; // String | 
File cookie = null; // File | 
File cookie2 = null; // File | 
try {
    String result = apiInstance.identificationLoginReturnGet(code, state, cookie, cookie2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentificationApi#identificationLoginReturnGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  | [default to null]
 **state** | **String**|  | [default to null]
 **cookie** | **File**|  | [default to null]
 **cookie2** | **File**|  | [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html;charset=utf-8


## identificationUserStampUuidPost

> String identificationUserStampUuidPost(uuid, authUser, authorization)

Query when the strong identification was last updated

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.IdentificationApi;

IdentificationApi apiInstance = new IdentificationApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    String result = apiInstance.identificationUserStampUuidPost(uuid, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentificationApi#identificationUserStampUuidPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

