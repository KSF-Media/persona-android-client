

# Subscription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subsno** | **Integer** | Subscription Id - primary key together with extno | 
**extno** | **Integer** | Subscription Extension Id - how many times a subscription has been extended | 
**cusno** | **Integer** | Customer getting the subscription | 
**paycusno** | **Integer** | Customer paying for the subscription | 
**kind** | [**KindEnum**](#KindEnum) |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**pricegroup** | [**PricegroupEnum**](#PricegroupEnum) |  |  [optional]
**_package** | [**ModelPackage**](ModelPackage.md) |  | 
**dates** | [**SubscriptionDates**](SubscriptionDates.md) |  | 
**extsubsexists** | **Boolean** | If the extension of this subscription exists | 
**campaign** | [**PackageCampaign**](PackageCampaign.md) |  |  [optional]
**paused** | [**List&lt;PausedSubscription&gt;**](PausedSubscription.md) | Pause periods of this subscription |  [optional]
**receiver** | **String** | The name of subscription receiver |  [optional]
**deliveryAddress** | [**DeliveryAddress**](DeliveryAddress.md) |  |  [optional]
**pendingAddressChanges** | [**List&lt;PendingAddressChange&gt;**](PendingAddressChange.md) | Pending and ongoing temporary address changes |  [optional]
**orderNumber** | **String** | Order number of subscription |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  |  [optional]
**paymentMethodId** | **Integer** |  |  [optional]
**deliveryTroubleEnd** | [**Date**](Date.md) |  |  [optional]


## Enum: KindEnum

Name | Value
---- | -----


## Enum: StateEnum

Name | Value
---- | -----


## Enum: PricegroupEnum

Name | Value
---- | -----


## Enum: PaymentMethodEnum

Name | Value
---- | -----




