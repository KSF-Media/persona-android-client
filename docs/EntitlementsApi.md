# EntitlementsApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlementsAllowDelete**](EntitlementsApi.md#entitlementsAllowDelete) | **DELETE** /entitlements/allow | Remove an entitlement
[**entitlementsAllowGet**](EntitlementsApi.md#entitlementsAllowGet) | **GET** /entitlements/allow | Check if global entitlements are enabled
[**entitlementsAllowPost**](EntitlementsApi.md#entitlementsAllowPost) | **POST** /entitlements/allow | Add an entitlement for all users
[**entitlementsAllowUuidPost**](EntitlementsApi.md#entitlementsAllowUuidPost) | **POST** /entitlements/allow/{uuid} | Grant product access to a customer
[**entitlementsGet**](EntitlementsApi.md#entitlementsGet) | **GET** /entitlements | List all entitlements
[**entitlementsGlobalGet**](EntitlementsApi.md#entitlementsGlobalGet) | **GET** /entitlements/global | Lists all past and future global entitlements



## entitlementsAllowDelete

> List&lt;Object&gt; entitlementsAllowDelete(body, authUser, authorization)

Remove an entitlement

### Example

```java
// Import classes:
//import org.openapitools.client.api.EntitlementsApi;

EntitlementsApi apiInstance = new EntitlementsApi();
Long body = 56L; // Long | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    List<Object> result = apiInstance.entitlementsAllowDelete(body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsAllowDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Long**|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## entitlementsAllowGet

> List&lt;PersistedEntitlementAccess&gt; entitlementsAllowGet(authUser, authorization, ip, paper)

Check if global entitlements are enabled

### Example

```java
// Import classes:
//import org.openapitools.client.api.EntitlementsApi;

EntitlementsApi apiInstance = new EntitlementsApi();
UUID authUser = null; // UUID | 
String authorization = null; // String | 
String ip = null; // String | 
String paper = null; // String | 
try {
    List<PersistedEntitlementAccess> result = apiInstance.entitlementsAllowGet(authUser, authorization, ip, paper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsAllowGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]
 **ip** | **String**|  | [optional] [default to null]
 **paper** | **String**|  | [optional] [default to null] [enum: HBL, ON, VN, HT, JUNIOR, FORUM, LS]

### Return type

[**List&lt;PersistedEntitlementAccess&gt;**](PersistedEntitlementAccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## entitlementsAllowPost

> List&lt;Object&gt; entitlementsAllowPost(body, authUser, authorization)

Add an entitlement for all users

### Example

```java
// Import classes:
//import org.openapitools.client.api.EntitlementsApi;

EntitlementsApi apiInstance = new EntitlementsApi();
EntitlementAccess body = new EntitlementAccess(); // EntitlementAccess | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    List<Object> result = apiInstance.entitlementsAllowPost(body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsAllowPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EntitlementAccess**](EntitlementAccess.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## entitlementsAllowUuidPost

> List&lt;Object&gt; entitlementsAllowUuidPost(uuid, body, authUser, authorization)

Grant product access to a customer

### Example

```java
// Import classes:
//import org.openapitools.client.api.EntitlementsApi;

EntitlementsApi apiInstance = new EntitlementsApi();
UUID uuid = null; // UUID | 
EntitlementAccess body = new EntitlementAccess(); // EntitlementAccess | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    List<Object> result = apiInstance.entitlementsAllowUuidPost(uuid, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsAllowUuidPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **body** | [**EntitlementAccess**](EntitlementAccess.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## entitlementsGet

> Map&lt;String, List&lt;String&gt;&gt; entitlementsGet()

List all entitlements

### Example

```java
// Import classes:
//import org.openapitools.client.api.EntitlementsApi;

EntitlementsApi apiInstance = new EntitlementsApi();
try {
    Map<String, List<String>> result = apiInstance.entitlementsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Map&lt;String, List&lt;String&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## entitlementsGlobalGet

> List&lt;PersistedEntitlementAccess&gt; entitlementsGlobalGet(authUser, authorization)

Lists all past and future global entitlements

### Example

```java
// Import classes:
//import org.openapitools.client.api.EntitlementsApi;

EntitlementsApi apiInstance = new EntitlementsApi();
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    List<PersistedEntitlementAccess> result = apiInstance.entitlementsGlobalGet(authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntitlementsApi#entitlementsGlobalGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**List&lt;PersistedEntitlementAccess&gt;**](PersistedEntitlementAccess.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

