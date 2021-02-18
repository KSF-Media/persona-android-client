/**
 * Persona
 * KSF Media unified login service
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import java.util.Date;
import org.openapitools.client.model.PackageCampaign;
import org.openapitools.client.model.PackageDescription;
import org.openapitools.client.model.PackageOffer;
import org.openapitools.client.model.Paper;
import org.openapitools.client.model.Product;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ModelPackage {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("paper")
  private Paper paper = null;
  @SerializedName("digitalOnly")
  private Boolean digitalOnly = null;
  @SerializedName("products")
  private List<Product> products = null;
  @SerializedName("offers")
  private List<PackageOffer> offers = null;
  @SerializedName("campaigns")
  private List<PackageCampaign> campaigns = null;
  @SerializedName("nextDelivery")
  private Date nextDelivery = null;
  @SerializedName("description")
  private PackageDescription description = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Paper getPaper() {
    return paper;
  }
  public void setPaper(Paper paper) {
    this.paper = paper;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getDigitalOnly() {
    return digitalOnly;
  }
  public void setDigitalOnly(Boolean digitalOnly) {
    this.digitalOnly = digitalOnly;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Product> getProducts() {
    return products;
  }
  public void setProducts(List<Product> products) {
    this.products = products;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PackageOffer> getOffers() {
    return offers;
  }
  public void setOffers(List<PackageOffer> offers) {
    this.offers = offers;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<PackageCampaign> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<PackageCampaign> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getNextDelivery() {
    return nextDelivery;
  }
  public void setNextDelivery(Date nextDelivery) {
    this.nextDelivery = nextDelivery;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PackageDescription getDescription() {
    return description;
  }
  public void setDescription(PackageDescription description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return (this.id == null ? _package.id == null : this.id.equals(_package.id)) &&
        (this.name == null ? _package.name == null : this.name.equals(_package.name)) &&
        (this.paper == null ? _package.paper == null : this.paper.equals(_package.paper)) &&
        (this.digitalOnly == null ? _package.digitalOnly == null : this.digitalOnly.equals(_package.digitalOnly)) &&
        (this.products == null ? _package.products == null : this.products.equals(_package.products)) &&
        (this.offers == null ? _package.offers == null : this.offers.equals(_package.offers)) &&
        (this.campaigns == null ? _package.campaigns == null : this.campaigns.equals(_package.campaigns)) &&
        (this.nextDelivery == null ? _package.nextDelivery == null : this.nextDelivery.equals(_package.nextDelivery)) &&
        (this.description == null ? _package.description == null : this.description.equals(_package.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.paper == null ? 0: this.paper.hashCode());
    result = 31 * result + (this.digitalOnly == null ? 0: this.digitalOnly.hashCode());
    result = 31 * result + (this.products == null ? 0: this.products.hashCode());
    result = 31 * result + (this.offers == null ? 0: this.offers.hashCode());
    result = 31 * result + (this.campaigns == null ? 0: this.campaigns.hashCode());
    result = 31 * result + (this.nextDelivery == null ? 0: this.nextDelivery.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  paper: ").append(paper).append("\n");
    sb.append("  digitalOnly: ").append(digitalOnly).append("\n");
    sb.append("  products: ").append(products).append("\n");
    sb.append("  offers: ").append(offers).append("\n");
    sb.append("  campaigns: ").append(campaigns).append("\n");
    sb.append("  nextDelivery: ").append(nextDelivery).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
