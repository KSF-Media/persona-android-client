# LoginApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginPost**](LoginApi.md#loginPost) | **POST** /login | Login with email and password
[**loginSomePost**](LoginApi.md#loginSomePost) | **POST** /login/some | Login with social media
[**loginSsoPost**](LoginApi.md#loginSsoPost) | **POST** /login/sso | Login with the AccessToken given by the SSO auth


<a name="loginPost"></a>
# **loginPost**
> LoginResponse loginPost(loginData)

Login with email and password

### Example
```java
// Import classes:
//import org.openapitools.client.api.LoginApi;

LoginApi apiInstance = new LoginApi();
LoginData loginData = new LoginData(); // LoginData | 
try {
    LoginResponse result = apiInstance.loginPost(loginData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginData** | [**LoginData**](LoginData.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="loginSomePost"></a>
# **loginSomePost**
> LoginResponse loginSomePost(loginDataSoMe)

Login with social media

### Example
```java
// Import classes:
//import org.openapitools.client.api.LoginApi;

LoginApi apiInstance = new LoginApi();
LoginDataSoMe loginDataSoMe = new LoginDataSoMe(); // LoginDataSoMe | 
try {
    LoginResponse result = apiInstance.loginSomePost(loginDataSoMe);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginSomePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginDataSoMe** | [**LoginDataSoMe**](LoginDataSoMe.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="loginSsoPost"></a>
# **loginSsoPost**
> LoginResponse loginSsoPost(loginDataSSO)

Login with the AccessToken given by the SSO auth

### Example
```java
// Import classes:
//import org.openapitools.client.api.LoginApi;

LoginApi apiInstance = new LoginApi();
LoginDataSSO loginDataSSO = new LoginDataSSO(); // LoginDataSSO | 
try {
    LoginResponse result = apiInstance.loginSsoPost(loginDataSSO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApi#loginSsoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginDataSSO** | [**LoginDataSSO**](LoginDataSSO.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

