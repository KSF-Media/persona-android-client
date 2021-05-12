

# ModelPackage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Package identifier | 
**name** | **String** | Package name | 
**description** | **List&lt;String&gt;** | Package description | 
**paper** | [**Paper**](Paper.md) |  | 
**digitalOnly** | **Boolean** | All products in this package are digital | 
**products** | [**List&lt;Product&gt;**](Product.md) | The Products contained in a package | 
**offers** | [**List&lt;PackageOffer&gt;**](PackageOffer.md) | Offers for the package | 
**campaigns** | [**List&lt;PackageCampaign&gt;**](PackageCampaign.md) | Active campaigns for the package | 
**nextDelivery** | [**Date**](Date.md) |  |  [optional]
**canPause** | **Boolean** | Does the package allow delivery pauses | 
**canTempAddr** | **Boolean** | Does the package allow temporary address changes | 




