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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DeliveryReclamation {
  
  @SerializedName("number")
  private Integer number = null;
  @SerializedName("customerNumber")
  private Integer customerNumber = null;
  @SerializedName("subscriptionNumber")
  private Integer subscriptionNumber = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("publicationDate")
  private Date publicationDate = null;
  @SerializedName("claim")
  private String claim = null;
  @SerializedName("status")
  private String status = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCustomerNumber() {
    return customerNumber;
  }
  public void setCustomerNumber(Integer customerNumber) {
    this.customerNumber = customerNumber;
  }

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSubscriptionNumber() {
    return subscriptionNumber;
  }
  public void setSubscriptionNumber(Integer subscriptionNumber) {
    this.subscriptionNumber = subscriptionNumber;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getPublicationDate() {
    return publicationDate;
  }
  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getClaim() {
    return claim;
  }
  public void setClaim(String claim) {
    this.claim = claim;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryReclamation deliveryReclamation = (DeliveryReclamation) o;
    return (this.number == null ? deliveryReclamation.number == null : this.number.equals(deliveryReclamation.number)) &&
        (this.customerNumber == null ? deliveryReclamation.customerNumber == null : this.customerNumber.equals(deliveryReclamation.customerNumber)) &&
        (this.subscriptionNumber == null ? deliveryReclamation.subscriptionNumber == null : this.subscriptionNumber.equals(deliveryReclamation.subscriptionNumber)) &&
        (this.date == null ? deliveryReclamation.date == null : this.date.equals(deliveryReclamation.date)) &&
        (this.publicationDate == null ? deliveryReclamation.publicationDate == null : this.publicationDate.equals(deliveryReclamation.publicationDate)) &&
        (this.claim == null ? deliveryReclamation.claim == null : this.claim.equals(deliveryReclamation.claim)) &&
        (this.status == null ? deliveryReclamation.status == null : this.status.equals(deliveryReclamation.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this.customerNumber == null ? 0: this.customerNumber.hashCode());
    result = 31 * result + (this.subscriptionNumber == null ? 0: this.subscriptionNumber.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.publicationDate == null ? 0: this.publicationDate.hashCode());
    result = 31 * result + (this.claim == null ? 0: this.claim.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryReclamation {\n");
    
    sb.append("  number: ").append(number).append("\n");
    sb.append("  customerNumber: ").append(customerNumber).append("\n");
    sb.append("  subscriptionNumber: ").append(subscriptionNumber).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  publicationDate: ").append(publicationDate).append("\n");
    sb.append("  claim: ").append(claim).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
