# EntitlementsApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entitlementsGet**](EntitlementsApi.md#entitlementsGet) | **GET** /entitlements | List all entitlements


<a name="entitlementsGet"></a>
# **entitlementsGet**
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

