# UsersApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersPost**](UsersApi.md#usersPost) | **POST** /users | Create a new user.
[**usersUuidEntitlementGet**](UsersApi.md#usersUuidEntitlementGet) | **GET** /users/{uuid}/entitlement | Get users entitlements.
[**usersUuidGdprPut**](UsersApi.md#usersUuidGdprPut) | **PUT** /users/{uuid}/gdpr | Updates the GDPR consent settings for a given user.
[**usersUuidGet**](UsersApi.md#usersUuidGet) | **GET** /users/{uuid} | Get user by UUID.
[**usersUuidLegalPut**](UsersApi.md#usersUuidLegalPut) | **PUT** /users/{uuid}/legal | Updates the legal consent settings for a given user.
[**usersUuidPatch**](UsersApi.md#usersUuidPatch) | **PATCH** /users/{uuid} | Update a user
[**usersUuidSubscriptionsSubsnoPausePost**](UsersApi.md#usersUuidSubscriptionsSubsnoPausePost) | **POST** /users/{uuid}/subscriptions/{subsno}/pause | Pause users subscription



## usersPost

> LoginResponse usersPost(body)

Create a new user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
NewUser body = new NewUser(); // NewUser | 
try {
    LoginResponse result = apiInstance.usersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewUser**](NewUser.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidEntitlementGet

> List&lt;String&gt; usersUuidEntitlementGet(uuid, authorization, cacheControl)

Get users entitlements.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
String authorization = null; // String | 
String cacheControl = null; // String | 
try {
    List<String> result = apiInstance.usersUuidEntitlementGet(uuid, authorization, cacheControl);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidEntitlementGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **authorization** | **String**|  | [optional] [default to null]
 **cacheControl** | **String**|  | [optional] [default to null]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## usersUuidGdprPut

> User usersUuidGdprPut(uuid, body, authorization)

Updates the GDPR consent settings for a given user.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
List<GdprConsent> body = Arrays.asList(new List()); // List<GdprConsent> | 
String authorization = null; // String | 
try {
    User result = apiInstance.usersUuidGdprPut(uuid, body, authorization);
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
 **body** | [**List&lt;GdprConsent&gt;**](List.md)|  |
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidGet

> User usersUuidGet(uuid, authorization, cacheControl)

Get user by UUID.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
String authorization = null; // String | 
String cacheControl = null; // String | 
try {
    User result = apiInstance.usersUuidGet(uuid, authorization, cacheControl);
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
 **cacheControl** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## usersUuidLegalPut

> User usersUuidLegalPut(uuid, body, authorization)

Updates the legal consent settings for a given user.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
List<LegalConsent> body = Arrays.asList(new List()); // List<LegalConsent> | 
String authorization = null; // String | 
try {
    User result = apiInstance.usersUuidLegalPut(uuid, body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidLegalPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **body** | [**List&lt;LegalConsent&gt;**](List.md)|  |
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidPatch

> User usersUuidPatch(uuid, body, authorization)

Update a user

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
UserUpdate body = new UserUpdate(); // UserUpdate | 
String authorization = null; // String | 
try {
    User result = apiInstance.usersUuidPatch(uuid, body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidPatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **body** | [**UserUpdate**](UserUpdate.md)|  |
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoPausePost

> List&lt;PausedSubscription&gt; usersUuidSubscriptionsSubsnoPausePost(uuid, subsno, body, authorization)

Pause users subscription

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
SubscriptionPauseDates body = new SubscriptionPauseDates(); // SubscriptionPauseDates | 
String authorization = null; // String | 
try {
    List<PausedSubscription> result = apiInstance.usersUuidSubscriptionsSubsnoPausePost(uuid, subsno, body, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoPausePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **body** | [**SubscriptionPauseDates**](SubscriptionPauseDates.md)|  |
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**List&lt;PausedSubscription&gt;**](PausedSubscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8

