# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.AccountApi;

public class AccountApiExample {

    public static void main(String[] args) {
        AccountApi apiInstance = new AccountApi();
        String body = "body_example"; // String | 
        try {
            apiInstance.accountPasswordCheckTokenPost(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountPasswordCheckTokenPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://http:/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountPasswordCheckTokenPost**](docs/AccountApi.md#accountPasswordCheckTokenPost) | **POST** /account/password/check-token | Validate password reset token
*AccountApi* | [**accountPasswordForgotPost**](docs/AccountApi.md#accountPasswordForgotPost) | **POST** /account/password/forgot | Request password reset link
*AccountApi* | [**accountPasswordResetPost**](docs/AccountApi.md#accountPasswordResetPost) | **POST** /account/password/reset | Reset a forgotten password with a token
*AdminApi* | [**adminFreePassDelete**](docs/AdminApi.md#adminFreePassDelete) | **DELETE** /admin/free-pass | Revokes an existing free pass
*AdminApi* | [**adminFreePassPut**](docs/AdminApi.md#adminFreePassPut) | **PUT** /admin/free-pass | Creates a free pass to an article
*AdminApi* | [**adminFreePassesGet**](docs/AdminApi.md#adminFreePassesGet) | **GET** /admin/free-passes | Lists all free passes
*AdminApi* | [**adminSearchPost**](docs/AdminApi.md#adminSearchPost) | **POST** /admin/search | Search for users
*AdminApi* | [**adminTransferPassiveSubscribersListidPost**](docs/AdminApi.md#adminTransferPassiveSubscribersListidPost) | **POST** /admin/transfer-passive-subscribers/{listid} | Transfers passive customers from Kayak to Mailchimp
*AdminApi* | [**adminUserPost**](docs/AdminApi.md#adminUserPost) | **POST** /admin/user | Create a new user with admin options.
*AdminApi* | [**adminUserUuidDelete**](docs/AdminApi.md#adminUserUuidDelete) | **DELETE** /admin/user/{uuid} | Delete user
*EntitlementsApi* | [**entitlementsAllowDelete**](docs/EntitlementsApi.md#entitlementsAllowDelete) | **DELETE** /entitlements/allow | Remove an entitlement
*EntitlementsApi* | [**entitlementsAllowGet**](docs/EntitlementsApi.md#entitlementsAllowGet) | **GET** /entitlements/allow | Check if global entitlements are enabled
*EntitlementsApi* | [**entitlementsAllowPost**](docs/EntitlementsApi.md#entitlementsAllowPost) | **POST** /entitlements/allow | Add an entitlement for all users
*EntitlementsApi* | [**entitlementsAllowUuidPost**](docs/EntitlementsApi.md#entitlementsAllowUuidPost) | **POST** /entitlements/allow/{uuid} | Grant product access to a customer
*EntitlementsApi* | [**entitlementsFreePassGet**](docs/EntitlementsApi.md#entitlementsFreePassGet) | **GET** /entitlements/free-pass | Verify given free pass hash
*EntitlementsApi* | [**entitlementsGet**](docs/EntitlementsApi.md#entitlementsGet) | **GET** /entitlements | List all entitlements
*EntitlementsApi* | [**entitlementsGlobalGet**](docs/EntitlementsApi.md#entitlementsGlobalGet) | **GET** /entitlements/global | Lists all past and future global entitlements
*IdentificationApi* | [**identificationLoginGet**](docs/IdentificationApi.md#identificationLoginGet) | **GET** /identification/login | Authenticate with OpenID Connect
*IdentificationApi* | [**identificationLoginMonitorGet**](docs/IdentificationApi.md#identificationLoginMonitorGet) | **GET** /identification/login/monitor | Get token for off band response login flow monitor
*IdentificationApi* | [**identificationLoginReturnGet**](docs/IdentificationApi.md#identificationLoginReturnGet) | **GET** /identification/login/return | Redirect endpoint for OpenID Connect
*IdentificationApi* | [**identificationUserStampUuidPost**](docs/IdentificationApi.md#identificationUserStampUuidPost) | **POST** /identification/user/stamp/{uuid} | Query when the strong identification was last updated
*LoginApi* | [**loginIpGet**](docs/LoginApi.md#loginIpGet) | **GET** /login/ip | Login with IP
*LoginApi* | [**loginPost**](docs/LoginApi.md#loginPost) | **POST** /login | Login with email and password
*LoginApi* | [**loginSsoPost**](docs/LoginApi.md#loginSsoPost) | **POST** /login/sso | Disabled. Always returns 403.
*LoginApi* | [**loginUuidDelete**](docs/LoginApi.md#loginUuidDelete) | **DELETE** /login/{uuid} | Logout
*UsersApi* | [**usersPost**](docs/UsersApi.md#usersPost) | **POST** /users | Create a new user.
*UsersApi* | [**usersTemporaryPost**](docs/UsersApi.md#usersTemporaryPost) | **POST** /users/temporary | Create a new user with email.
*UsersApi* | [**usersUuidEntitlementGet**](docs/UsersApi.md#usersUuidEntitlementGet) | **GET** /users/{uuid}/entitlement | Get users entitlements.
*UsersApi* | [**usersUuidGdprPut**](docs/UsersApi.md#usersUuidGdprPut) | **PUT** /users/{uuid}/gdpr | Updates the GDPR consent settings for a given user.
*UsersApi* | [**usersUuidGet**](docs/UsersApi.md#usersUuidGet) | **GET** /users/{uuid} | Get user by UUID.
*UsersApi* | [**usersUuidLegalPut**](docs/UsersApi.md#usersUuidLegalPut) | **PUT** /users/{uuid}/legal | Updates the legal consent settings for a given user.
*UsersApi* | [**usersUuidNewslettersGet**](docs/UsersApi.md#usersUuidNewslettersGet) | **GET** /users/{uuid}/newsletters | Get newsletter subscriptions
*UsersApi* | [**usersUuidNewslettersPut**](docs/UsersApi.md#usersUuidNewslettersPut) | **PUT** /users/{uuid}/newsletters | Update newsletter subscriptions
*UsersApi* | [**usersUuidPasswordPut**](docs/UsersApi.md#usersUuidPasswordPut) | **PUT** /users/{uuid}/password | Set / Change user password
*UsersApi* | [**usersUuidPatch**](docs/UsersApi.md#usersUuidPatch) | **PATCH** /users/{uuid} | Update a user
*UsersApi* | [**usersUuidPaymentsGet**](docs/UsersApi.md#usersUuidPaymentsGet) | **GET** /users/{uuid}/payments | Get user&#39;s subscriptions and payment events
*UsersApi* | [**usersUuidScopeGet**](docs/UsersApi.md#usersUuidScopeGet) | **GET** /users/{uuid}/scope | Check if user has valid token for a scope
*UsersApi* | [**usersUuidSubscriptionsSubsnoAddressChangeDelete**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoAddressChangeDelete) | **DELETE** /users/{uuid}/subscriptions/{subsno}/addressChange | Delete temporary address change for subscription
*UsersApi* | [**usersUuidSubscriptionsSubsnoAddressChangePatch**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoAddressChangePatch) | **PATCH** /users/{uuid}/subscriptions/{subsno}/addressChange | Edit temporary address change dates of a subscription
*UsersApi* | [**usersUuidSubscriptionsSubsnoAddressChangePost**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoAddressChangePost) | **POST** /users/{uuid}/subscriptions/{subsno}/addressChange | Make a temporary address change for a subscription
*UsersApi* | [**usersUuidSubscriptionsSubsnoCancelPut**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoCancelPut) | **PUT** /users/{uuid}/subscriptions/{subsno}/cancel | Cancels user subscription
*UsersApi* | [**usersUuidSubscriptionsSubsnoPausePatch**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoPausePatch) | **PATCH** /users/{uuid}/subscriptions/{subsno}/pause | Edit pause duration
*UsersApi* | [**usersUuidSubscriptionsSubsnoPausePost**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoPausePost) | **POST** /users/{uuid}/subscriptions/{subsno}/pause | Pause users subscription
*UsersApi* | [**usersUuidSubscriptionsSubsnoReclamationPost**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoReclamationPost) | **POST** /users/{uuid}/subscriptions/{subsno}/reclamation | Create a new delivery reclamation for a subscription
*UsersApi* | [**usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoReclamationsReclaimnoGet) | **GET** /users/{uuid}/subscriptions/{subsno}/reclamations/{reclaimno} | Get a delivery reclamation
*UsersApi* | [**usersUuidSubscriptionsSubsnoUnpausePost**](docs/UsersApi.md#usersUuidSubscriptionsSubsnoUnpausePost) | **POST** /users/{uuid}/subscriptions/{subsno}/unpause | Unpause users subscription


## Documentation for Models

 - [ActiveDays](docs/ActiveDays.md)
 - [Address](docs/Address.md)
 - [AdminNewUser](docs/AdminNewUser.md)
 - [CancelSubscriptionReason](docs/CancelSubscriptionReason.md)
 - [DeleteTempAddressChangeDates](docs/DeleteTempAddressChangeDates.md)
 - [DeliveryAddress](docs/DeliveryAddress.md)
 - [DeliveryReclamation](docs/DeliveryReclamation.md)
 - [EntitlementAccess](docs/EntitlementAccess.md)
 - [FaroUser](docs/FaroUser.md)
 - [ForgotPasswordData](docs/ForgotPasswordData.md)
 - [FreePass](docs/FreePass.md)
 - [FreePassInput](docs/FreePassInput.md)
 - [GdprConsent](docs/GdprConsent.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse400InvalidRequestBody](docs/InlineResponse400InvalidRequestBody.md)
 - [InlineResponse403](docs/InlineResponse403.md)
 - [InlineResponse4031](docs/InlineResponse4031.md)
 - [InlineResponse4031AccessTokenExpired](docs/InlineResponse4031AccessTokenExpired.md)
 - [InlineResponse403InvalidCredentials](docs/InlineResponse403InvalidCredentials.md)
 - [InlineResponse415](docs/InlineResponse415.md)
 - [InlineResponse415UnsupportedMediaType](docs/InlineResponse415UnsupportedMediaType.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [InlineResponse500InternalServerError](docs/InlineResponse500InternalServerError.md)
 - [JanrainUser](docs/JanrainUser.md)
 - [LegalConsent](docs/LegalConsent.md)
 - [LoginData](docs/LoginData.md)
 - [LoginDataSSO](docs/LoginDataSSO.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [NewDeliveryReclamation](docs/NewDeliveryReclamation.md)
 - [NewTemporaryUser](docs/NewTemporaryUser.md)
 - [NewUser](docs/NewUser.md)
 - [Newsletter](docs/Newsletter.md)
 - [NewsletterSubscription](docs/NewsletterSubscription.md)
 - [PackageCampaign](docs/PackageCampaign.md)
 - [PackageOffer](docs/PackageOffer.md)
 - [Paper](docs/Paper.md)
 - [PastTemporaryAddress](docs/PastTemporaryAddress.md)
 - [PausedSubscription](docs/PausedSubscription.md)
 - [Payment](docs/Payment.md)
 - [PendingAddressChange](docs/PendingAddressChange.md)
 - [PersistedEntitlementAccess](docs/PersistedEntitlementAccess.md)
 - [Product](docs/Product.md)
 - [SearchQuery](docs/SearchQuery.md)
 - [SearchResult](docs/SearchResult.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionDates](docs/SubscriptionDates.md)
 - [SubscriptionPauseDates](docs/SubscriptionPauseDates.md)
 - [SubscriptionPauseEdit](docs/SubscriptionPauseEdit.md)
 - [SubscriptionPayments](docs/SubscriptionPayments.md)
 - [TemporaryAddressChange](docs/TemporaryAddressChange.md)
 - [TemporaryAddressChangeDates](docs/TemporaryAddressChangeDates.md)
 - [UpdatePasswordData](docs/UpdatePasswordData.md)
 - [User](docs/User.md)
 - [UserUpdate](docs/UserUpdate.md)
 - [UserUpdateAddress](docs/UserUpdateAddress.md)
 - [UserUpdatePassword](docs/UserUpdatePassword.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



