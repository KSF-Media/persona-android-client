# LoginApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginIpGet**](LoginApi.md#loginIpGet) | **GET** /login/ip | Login with IP
[**loginPost**](LoginApi.md#loginPost) | **POST** /login | Login with email and password
[**loginSsoPost**](LoginApi.md#loginSsoPost) | **POST** /login/sso | Disabled. Always returns 403.
[**loginUuidDelete**](LoginApi.md#loginUuidDelete) | **DELETE** /login/{uuid} | Logout



## loginIpGet

> LoginResponse loginIpGet(xRealIP, paper)

Login with IP

Returns auth &amp; token for customers with IP based entitlement

### Example

```java
// Import classes:
//import org.openapitools.client.api.LoginApi;

LoginApi apiInstance = new LoginApi();
String xRealIP = null; // String | 
String paper = null; // String | 
try {
    LoginResponse result = apiInstance.loginIpGet(xRealIP, paper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginIpGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRealIP** | **String**|  | [default to null]
 **paper** | **String**|  | [default to null] [enum: HBL, ON, VN, HT, JUNIOR, FORUM, LS]

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## loginPost

> LoginResponse loginPost(body)

Login with email and password

### Example

```java
// Import classes:
//import org.openapitools.client.api.LoginApi;

LoginApi apiInstance = new LoginApi();
LoginData body = new LoginData(); // LoginData | 
try {
    LoginResponse result = apiInstance.loginPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginData**](LoginData.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## loginSsoPost

> LoginResponse loginSsoPost(body)

Disabled. Always returns 403.

### Example

```java
// Import classes:
//import org.openapitools.client.api.LoginApi;

LoginApi apiInstance = new LoginApi();
LoginDataSSO body = new LoginDataSSO(); // LoginDataSSO | 
try {
    LoginResponse result = apiInstance.loginSsoPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginSsoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginDataSSO**](LoginDataSSO.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## loginUuidDelete

> List&lt;Object&gt; loginUuidDelete(uuid, authorization, everywhere)

Logout

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.LoginApi;

LoginApi apiInstance = new LoginApi();
UUID uuid = null; // UUID | 
String authorization = null; // String | 
Boolean everywhere = false; // Boolean | 
try {
    List<Object> result = apiInstance.loginUuidDelete(uuid, authorization, everywhere);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginUuidDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **authorization** | **String**|  | [optional] [default to null]
 **everywhere** | **Boolean**|  | [optional] [default to false]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

