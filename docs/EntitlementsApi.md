# EntitlementsApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlementsAllowPost**](EntitlementsApi.md#entitlementsAllowPost) | **POST** /entitlements/allow | 
[**entitlementsAllowUuidPost**](EntitlementsApi.md#entitlementsAllowUuidPost) | **POST** /entitlements/allow/{uuid} | Grant product access to a customer
[**entitlementsGet**](EntitlementsApi.md#entitlementsGet) | **GET** /entitlements | List all entitlements



## entitlementsAllowPost

> List&lt;Object&gt; entitlementsAllowPost(body, authUser, authorization)



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

