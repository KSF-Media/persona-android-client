# UsersApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUuidGdprPut**](UsersApi.md#usersUuidGdprPut) | **PUT** /users/{uuid}/gdpr | Updates the GDPR consent settings for a given user.
[**usersUuidGet**](UsersApi.md#usersUuidGet) | **GET** /users/{uuid} | Get user by UUID.


<a name="usersUuidGdprPut"></a>
# **usersUuidGdprPut**
> List&lt;Object&gt; usersUuidGdprPut(uuid, gdprConsent, authorization)

Updates the GDPR consent settings for a given user.

Authorization header expects the following format ‘OAuth {token}’

### Example
```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
List<GdprConsent> gdprConsent = Arrays.asList(new List()); // List<GdprConsent> | 
String authorization = null; // String | 
try {
    List<Object> result = apiInstance.usersUuidGdprPut(uuid, gdprConsent, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidGdprPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **gdprConsent** | [**List&lt;GdprConsent&gt;**](List.md)|  |
 **authorization** | **String**|  | [optional] [default to null]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

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
UUID uuid = null; // UUID | 
String authorization = null; // String | 
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
 **uuid** | [**UUID**](.md)|  | [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

