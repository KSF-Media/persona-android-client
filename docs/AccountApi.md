# AccountApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountPasswordForgotGet**](AccountApi.md#accountPasswordForgotGet) | **GET** /account/password/forgot | Request password reset link
[**accountPasswordForgotPost**](AccountApi.md#accountPasswordForgotPost) | **POST** /account/password/forgot | Request password reset link
[**accountPasswordResetPost**](AccountApi.md#accountPasswordResetPost) | **POST** /account/password/reset | Reset a forgotten password with a token



## accountPasswordForgotGet

> List&lt;Object&gt; accountPasswordForgotGet(email, redir)

Request password reset link

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String email = null; // String | 
Boolean redir = null; // Boolean | 
try {
    List<Object> result = apiInstance.accountPasswordForgotGet(email, redir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPasswordForgotGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  | [default to null]
 **redir** | **Boolean**|  | [optional] [default to null]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## accountPasswordForgotPost

> List&lt;Object&gt; accountPasswordForgotPost(body)

Request password reset link

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
ForgotPasswordData body = new ForgotPasswordData(); // ForgotPasswordData | 
try {
    List<Object> result = apiInstance.accountPasswordForgotPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPasswordForgotPost");
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


## accountPasswordResetPost

> List&lt;Object&gt; accountPasswordResetPost(body)

Reset a forgotten password with a token

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
UpdatePasswordData body = new UpdatePasswordData(); // UpdatePasswordData | 
try {
    List<Object> result = apiInstance.accountPasswordResetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#accountPasswordResetPost");
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

