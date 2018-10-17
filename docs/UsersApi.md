# UsersApi

All URIs are relative to *http://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUuidGet**](UsersApi.md#usersUuidGet) | **GET** /users/{uuid} | Get user by UUID.


<a name="usersUuidGet"></a>
# **usersUuidGet**
> User usersUuidGet(uuid, authorization)

Get user by UUID.

Authorization header expects the following format ‘OAuth {token}’

### Example
```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = new UUID(); // UUID | 
String authorization = "authorization_example"; // String | 
try {
    User result = apiInstance.usersUuidGet(uuid, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  |
 **authorization** | **String**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

