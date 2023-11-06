# AdminApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminFreePassDelete**](AdminApi.md#adminFreePassDelete) | **DELETE** /admin/free-pass | Revokes an existing free pass
[**adminFreePassPost**](AdminApi.md#adminFreePassPost) | **POST** /admin/free-pass | Creates a free pass to an article
[**adminFreePassesGet**](AdminApi.md#adminFreePassesGet) | **GET** /admin/free-passes | Lists all free passes
[**adminSearchPost**](AdminApi.md#adminSearchPost) | **POST** /admin/search | Search for users
[**adminTransferPassiveSubscribersListidPost**](AdminApi.md#adminTransferPassiveSubscribersListidPost) | **POST** /admin/transfer-passive-subscribers/{listid} | Transfers passive customers from Kayak to Mailchimp
[**adminUserPost**](AdminApi.md#adminUserPost) | **POST** /admin/user | Create a new user with admin options.



## adminFreePassDelete

> adminFreePassDelete(body, authUser, authorization)

Revokes an existing free pass

Marks a free pass as being revoked so that it can&#39;t be used anymore. Currently, revoked free passes can&#39;t be reinstated through Persona API (though it&#39;s possible to do so with an SQL query).

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
String body = "body_example"; // String | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    apiInstance.adminFreePassDelete(body, authUser, authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminFreePassDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: Not defined


## adminFreePassPost

> String adminFreePassPost(body, authUser, authorization)

Creates a free pass to an article

Free passes can be used to temporarily bypass the paywall for individual articles.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
FreePassInput body = new FreePassInput(); // FreePassInput | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    String result = apiInstance.adminFreePassPost(body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminFreePassPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FreePassInput**](FreePassInput.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## adminFreePassesGet

> List&lt;FreePass&gt; adminFreePassesGet(authUser, authorization)

Lists all free passes

This end point returns the list of all free passes, including those that have been expired or revoked.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    List<FreePass> result = apiInstance.adminFreePassesGet(authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminFreePassesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**List&lt;FreePass&gt;**](FreePass.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## adminSearchPost

> List&lt;SearchResult&gt; adminSearchPost(body, authUser, authorization)

Search for users

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
SearchQuery body = new SearchQuery(); // SearchQuery | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    List<SearchResult> result = apiInstance.adminSearchPost(body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminSearchPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchQuery**](SearchQuery.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**List&lt;SearchResult&gt;**](SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## adminTransferPassiveSubscribersListidPost

> Object adminTransferPassiveSubscribersListidPost(listid, authUser, authorization)

Transfers passive customers from Kayak to Mailchimp

Passive subscribers/members/customers are users who don&#39;t have active entitlements and haven&#39;t opted out from email marketing. For the given list (audience) ID, this endpoint transfers the list of passive subscribers from Kayak to Mailchimp (via Faro).

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
String listid = null; // String | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Object result = apiInstance.adminTransferPassiveSubscribersListidPost(listid, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminTransferPassiveSubscribersListidPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listid** | **String**|  | [default to null]
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## adminUserPost

> LoginResponse adminUserPost(body, authUser, authorization)

Create a new user with admin options.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AdminApi;

AdminApi apiInstance = new AdminApi();
AdminNewUser body = new AdminNewUser(); // AdminNewUser | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    LoginResponse result = apiInstance.adminUserPost(body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminUserPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminNewUser**](AdminNewUser.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8

