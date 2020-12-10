# AdminApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminUuidGet**](AdminApi.md#adminUuidGet) | **GET** /admin/{uuid} | Get user by admin credentials.



## adminUuidGet

> User adminUuidGet(uuid, authUser, authorization, cacheControl)

Get user by admin credentials.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
String cacheControl = null; // String | 
try {
    User result = apiInstance.adminUuidGet(uuid, authUser, authorization, cacheControl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminUuidGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]
 **cacheControl** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

