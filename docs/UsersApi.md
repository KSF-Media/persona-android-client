# UsersApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersPost**](UsersApi.md#usersPost) | **POST** /users | Create a new user.
[**usersTemporaryPost**](UsersApi.md#usersTemporaryPost) | **POST** /users/temporary | Create a new user with email.
[**usersUuidEntitlementGet**](UsersApi.md#usersUuidEntitlementGet) | **GET** /users/{uuid}/entitlement | Get users entitlements.
[**usersUuidGdprPut**](UsersApi.md#usersUuidGdprPut) | **PUT** /users/{uuid}/gdpr | Updates the GDPR consent settings for a given user.
[**usersUuidGet**](UsersApi.md#usersUuidGet) | **GET** /users/{uuid} | Get user by UUID.
[**usersUuidLegalPut**](UsersApi.md#usersUuidLegalPut) | **PUT** /users/{uuid}/legal | Updates the legal consent settings for a given user.
[**usersUuidPasswordPut**](UsersApi.md#usersUuidPasswordPut) | **PUT** /users/{uuid}/password | Set / Change user password
[**usersUuidPatch**](UsersApi.md#usersUuidPatch) | **PATCH** /users/{uuid} | Update a user
[**usersUuidPaymentsGet**](UsersApi.md#usersUuidPaymentsGet) | **GET** /users/{uuid}/payments | Get user&#39;s subscriptions and payment events
[**usersUuidSubscriptionsSubsnoAddressChangeDelete**](UsersApi.md#usersUuidSubscriptionsSubsnoAddressChangeDelete) | **DELETE** /users/{uuid}/subscriptions/{subsno}/addressChange | Delete temporary address change for subscription
[**usersUuidSubscriptionsSubsnoAddressChangePatch**](UsersApi.md#usersUuidSubscriptionsSubsnoAddressChangePatch) | **PATCH** /users/{uuid}/subscriptions/{subsno}/addressChange | Edit temporary address change dates of a subscription
[**usersUuidSubscriptionsSubsnoAddressChangePost**](UsersApi.md#usersUuidSubscriptionsSubsnoAddressChangePost) | **POST** /users/{uuid}/subscriptions/{subsno}/addressChange | Make a temporary address change for a subscription
[**usersUuidSubscriptionsSubsnoCancelPut**](UsersApi.md#usersUuidSubscriptionsSubsnoCancelPut) | **PUT** /users/{uuid}/subscriptions/{subsno}/cancel | Cancels user subscription
[**usersUuidSubscriptionsSubsnoPausePatch**](UsersApi.md#usersUuidSubscriptionsSubsnoPausePatch) | **PATCH** /users/{uuid}/subscriptions/{subsno}/pause | Edit pause duration
[**usersUuidSubscriptionsSubsnoPausePost**](UsersApi.md#usersUuidSubscriptionsSubsnoPausePost) | **POST** /users/{uuid}/subscriptions/{subsno}/pause | Pause users subscription
[**usersUuidSubscriptionsSubsnoReclamationPost**](UsersApi.md#usersUuidSubscriptionsSubsnoReclamationPost) | **POST** /users/{uuid}/subscriptions/{subsno}/reclamation | Create a new delivery reclamation for a subscription
[**usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet**](UsersApi.md#usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet) | **GET** /users/{uuid}/subscriptions/{subsno}/reclamations/{reclaimno} | Get a delivery reclamation
[**usersUuidSubscriptionsSubsnoUnpausePost**](UsersApi.md#usersUuidSubscriptionsSubsnoUnpausePost) | **POST** /users/{uuid}/subscriptions/{subsno}/unpause | Pause users subscription



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


## usersTemporaryPost

> LoginResponse usersTemporaryPost(body)

Create a new user with email.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
NewTemporaryUser body = new NewTemporaryUser(); // NewTemporaryUser | 
try {
    LoginResponse result = apiInstance.usersTemporaryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersTemporaryPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewTemporaryUser**](NewTemporaryUser.md)|  |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidEntitlementGet

> List&lt;String&gt; usersUuidEntitlementGet(uuid, authUser, authorization, cacheControl)

Get users entitlements.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
String cacheControl = null; // String | 
try {
    List<String> result = apiInstance.usersUuidEntitlementGet(uuid, authUser, authorization, cacheControl);
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
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
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

> User usersUuidGdprPut(uuid, body, authUser, authorization)

Updates the GDPR consent settings for a given user.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
List<GdprConsent> body = Arrays.asList(new List()); // List<GdprConsent> | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    User result = apiInstance.usersUuidGdprPut(uuid, body, authUser, authorization);
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
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidGet

> User usersUuidGet(uuid, authUser, authorization, cacheControl)

Get user by UUID.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
String cacheControl = null; // String | 
try {
    User result = apiInstance.usersUuidGet(uuid, authUser, authorization, cacheControl);
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
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
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

> User usersUuidLegalPut(uuid, body, authUser, authorization)

Updates the legal consent settings for a given user.

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
List<LegalConsent> body = Arrays.asList(new List()); // List<LegalConsent> | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    User result = apiInstance.usersUuidLegalPut(uuid, body, authUser, authorization);
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
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidPasswordPut

> User usersUuidPasswordPut(uuid, body, authUser, authorization)

Set / Change user password

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
UserUpdatePassword body = new UserUpdatePassword(); // UserUpdatePassword | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    User result = apiInstance.usersUuidPasswordPut(uuid, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidPasswordPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **body** | [**UserUpdatePassword**](UserUpdatePassword.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidPatch

> User usersUuidPatch(uuid, body, authUser, authorization)

Update a user

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
UserUpdate body = new UserUpdate(); // UserUpdate | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    User result = apiInstance.usersUuidPatch(uuid, body, authUser, authorization);
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
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidPaymentsGet

> List&lt;SubscriptionPayments&gt; usersUuidPaymentsGet(uuid, authUser, authorization)

Get user&#39;s subscriptions and payment events

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    List<SubscriptionPayments> result = apiInstance.usersUuidPaymentsGet(uuid, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidPaymentsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**List&lt;SubscriptionPayments&gt;**](SubscriptionPayments.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoAddressChangeDelete

> Subscription usersUuidSubscriptionsSubsnoAddressChangeDelete(uuid, subsno, body, authUser, authorization)

Delete temporary address change for subscription

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
DeleteTempAddressChangeDates body = new DeleteTempAddressChangeDates(); // DeleteTempAddressChangeDates | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Subscription result = apiInstance.usersUuidSubscriptionsSubsnoAddressChangeDelete(uuid, subsno, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoAddressChangeDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **body** | [**DeleteTempAddressChangeDates**](DeleteTempAddressChangeDates.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoAddressChangePatch

> Subscription usersUuidSubscriptionsSubsnoAddressChangePatch(uuid, subsno, body, authUser, authorization)

Edit temporary address change dates of a subscription

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
TemporaryAddressChangeDates body = new TemporaryAddressChangeDates(); // TemporaryAddressChangeDates | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Subscription result = apiInstance.usersUuidSubscriptionsSubsnoAddressChangePatch(uuid, subsno, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoAddressChangePatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **body** | [**TemporaryAddressChangeDates**](TemporaryAddressChangeDates.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoAddressChangePost

> Subscription usersUuidSubscriptionsSubsnoAddressChangePost(uuid, subsno, body, authUser, authorization)

Make a temporary address change for a subscription

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
TemporaryAddressChange body = new TemporaryAddressChange(); // TemporaryAddressChange | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Subscription result = apiInstance.usersUuidSubscriptionsSubsnoAddressChangePost(uuid, subsno, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoAddressChangePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **body** | [**TemporaryAddressChange**](TemporaryAddressChange.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoCancelPut

> Subscription usersUuidSubscriptionsSubsnoCancelPut(uuid, subsno, body, authUser, authorization)

Cancels user subscription

The subscription continues to be valid until the end of the billing period. Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
CancelSubscriptionReason body = new CancelSubscriptionReason(); // CancelSubscriptionReason | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Subscription result = apiInstance.usersUuidSubscriptionsSubsnoCancelPut(uuid, subsno, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoCancelPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **body** | [**CancelSubscriptionReason**](CancelSubscriptionReason.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoPausePatch

> Subscription usersUuidSubscriptionsSubsnoPausePatch(uuid, subsno, body, authUser, authorization)

Edit pause duration

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
SubscriptionPauseEdit body = new SubscriptionPauseEdit(); // SubscriptionPauseEdit | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Subscription result = apiInstance.usersUuidSubscriptionsSubsnoPausePatch(uuid, subsno, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoPausePatch");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **body** | [**SubscriptionPauseEdit**](SubscriptionPauseEdit.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoPausePost

> Subscription usersUuidSubscriptionsSubsnoPausePost(uuid, subsno, body, authUser, authorization)

Pause users subscription

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
SubscriptionPauseDates body = new SubscriptionPauseDates(); // SubscriptionPauseDates | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Subscription result = apiInstance.usersUuidSubscriptionsSubsnoPausePost(uuid, subsno, body, authUser, authorization);
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
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoReclamationPost

> DeliveryReclamation usersUuidSubscriptionsSubsnoReclamationPost(uuid, subsno, body, authUser, authorization)

Create a new delivery reclamation for a subscription

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
NewDeliveryReclamation body = new NewDeliveryReclamation(); // NewDeliveryReclamation | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    DeliveryReclamation result = apiInstance.usersUuidSubscriptionsSubsnoReclamationPost(uuid, subsno, body, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoReclamationPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **body** | [**NewDeliveryReclamation**](NewDeliveryReclamation.md)|  |
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**DeliveryReclamation**](DeliveryReclamation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet

> DeliveryReclamation usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet(uuid, subsno, reclaimno, authUser, authorization)

Get a delivery reclamation

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
Integer reclaimno = null; // Integer | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    DeliveryReclamation result = apiInstance.usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet(uuid, subsno, reclaimno, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **reclaimno** | **Integer**|  | [default to null]
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**DeliveryReclamation**](DeliveryReclamation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## usersUuidSubscriptionsSubsnoUnpausePost

> Subscription usersUuidSubscriptionsSubsnoUnpausePost(uuid, subsno, authUser, authorization)

Pause users subscription

Authorization header expects the following format ‘OAuth {token}’

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UUID uuid = null; // UUID | 
Integer subsno = null; // Integer | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Subscription result = apiInstance.usersUuidSubscriptionsSubsnoUnpausePost(uuid, subsno, authUser, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUuidSubscriptionsSubsnoUnpausePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **subsno** | **Integer**|  | [default to null]
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

