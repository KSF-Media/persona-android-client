# AccountApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCodeForTokenPost**](AccountApi.md#accountCodeForTokenPost) | **POST** /account/codeForToken | Get a password reset token
[**accountForgotPassPost**](AccountApi.md#accountForgotPassPost) | **POST** /account/forgotPass | Forgot Password
[**accountResetForgottenPasswordPost**](AccountApi.md#accountResetForgottenPasswordPost) | **POST** /account/resetForgottenPassword | Reset a forgotten password with a token



## accountCodeForTokenPost

> TokenResponse accountCodeForTokenPost(body)

Get a password reset token

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
CodeForTokenData body = new CodeForTokenData(); // CodeForTokenData | 
try {
    TokenResponse result = apiInstance.accountCodeForTokenPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountCodeForTokenPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CodeForTokenData**](CodeForTokenData.md)|  |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## accountForgotPassPost

> List&lt;Object&gt; accountForgotPassPost(body)

Forgot Password

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
ForgotPasswordData body = new ForgotPasswordData(); // ForgotPasswordData | 
try {
    List<Object> result = apiInstance.accountForgotPassPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountForgotPassPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ForgotPasswordData**](ForgotPasswordData.md)|  |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## accountResetForgottenPasswordPost

> List&lt;Object&gt; accountResetForgottenPasswordPost(body)

Reset a forgotten password with a token

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
UpdatePasswordData body = new UpdatePasswordData(); // UpdatePasswordData | 
try {
    List<Object> result = apiInstance.accountResetForgottenPasswordPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountResetForgottenPasswordPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdatePasswordData**](UpdatePasswordData.md)|  |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8

