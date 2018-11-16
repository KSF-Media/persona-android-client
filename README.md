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

* target/openapi-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.LoginApi;

public class LoginApiExample {

    public static void main(String[] args) {
        LoginApi apiInstance = new LoginApi();
        LoginData loginData = new LoginData(); // LoginData | 
        try {
            LoginResponse result = apiInstance.loginPost(loginData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoginApi#loginPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://http:/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LoginApi* | [**loginPost**](docs/LoginApi.md#loginPost) | **POST** /login | Login with email and password
*LoginApi* | [**loginSomePost**](docs/LoginApi.md#loginSomePost) | **POST** /login/some | Login with social media
*LoginApi* | [**loginSsoPost**](docs/LoginApi.md#loginSsoPost) | **POST** /login/sso | Login with the AccessToken given by the SSO auth
*UsersApi* | [**usersUuidGdprPut**](docs/UsersApi.md#usersUuidGdprPut) | **PUT** /users/{uuid}/gdpr | Updates the GDPR consent settings for a given user.
*UsersApi* | [**usersUuidGet**](docs/UsersApi.md#usersUuidGet) | **GET** /users/{uuid} | Get user by UUID.


## Documentation for Models

 - [ActiveDays](docs/ActiveDays.md)
 - [Address](docs/Address.md)
 - [Campaign](docs/Campaign.md)
 - [DescriptionFrequency](docs/DescriptionFrequency.md)
 - [GdprConsent](docs/GdprConsent.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse400InvalidRequestBody](docs/InlineResponse400InvalidRequestBody.md)
 - [InlineResponse403](docs/InlineResponse403.md)
 - [InlineResponse4031](docs/InlineResponse4031.md)
 - [InlineResponse4031AccessTokenExpired](docs/InlineResponse4031AccessTokenExpired.md)
 - [InlineResponse4032](docs/InlineResponse4032.md)
 - [InlineResponse4032EmailAddressInUse](docs/InlineResponse4032EmailAddressInUse.md)
 - [InlineResponse4032EmailNotAuthorized](docs/InlineResponse4032EmailNotAuthorized.md)
 - [InlineResponse4032OauthFailed](docs/InlineResponse4032OauthFailed.md)
 - [InlineResponse403InvalidCredentials](docs/InlineResponse403InvalidCredentials.md)
 - [InlineResponse415](docs/InlineResponse415.md)
 - [InlineResponse415UnsupportedMediaType](docs/InlineResponse415UnsupportedMediaType.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [InlineResponse500InternalServerError](docs/InlineResponse500InternalServerError.md)
 - [LoginData](docs/LoginData.md)
 - [LoginDataSSO](docs/LoginDataSSO.md)
 - [LoginDataSoMe](docs/LoginDataSoMe.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [PackageDescription](docs/PackageDescription.md)
 - [PackageOffer](docs/PackageOffer.md)
 - [Paper](docs/Paper.md)
 - [Product](docs/Product.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionDates](docs/SubscriptionDates.md)
 - [User](docs/User.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



