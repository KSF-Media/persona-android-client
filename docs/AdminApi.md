# AdminApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminSearchPost**](AdminApi.md#adminSearchPost) | **POST** /admin/search | Search for users
[**adminTransferPassiveSubscribersListidPost**](AdminApi.md#adminTransferPassiveSubscribersListidPost) | **POST** /admin/transfer-passive-subscribers/{listid} | Transfers passive customers from Kayak to Mailchimp
[**adminUserPost**](AdminApi.md#adminUserPost) | **POST** /admin/user | Create a new user with admin options.



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

