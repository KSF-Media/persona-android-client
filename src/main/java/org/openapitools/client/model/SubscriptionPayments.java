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
import org.openapitools.client.model.Payment;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SubscriptionPayments {
  
  @SerializedName("subsno")
  private Integer subsno = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("startDate")
  private Date startDate = null;
  @SerializedName("lastDate")
  private Date lastDate = null;
  @SerializedName("payments")
  private List<Payment> payments = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSubsno() {
    return subsno;
  }
  public void setSubsno(Integer subsno) {
    this.subsno = subsno;
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
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getLastDate() {
    return lastDate;
  }
  public void setLastDate(Date lastDate) {
    this.lastDate = lastDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Payment> getPayments() {
    return payments;
  }
  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPayments subscriptionPayments = (SubscriptionPayments) o;
    return (this.subsno == null ? subscriptionPayments.subsno == null : this.subsno.equals(subscriptionPayments.subsno)) &&
        (this.name == null ? subscriptionPayments.name == null : this.name.equals(subscriptionPayments.name)) &&
        (this.startDate == null ? subscriptionPayments.startDate == null : this.startDate.equals(subscriptionPayments.startDate)) &&
        (this.lastDate == null ? subscriptionPayments.lastDate == null : this.lastDate.equals(subscriptionPayments.lastDate)) &&
        (this.payments == null ? subscriptionPayments.payments == null : this.payments.equals(subscriptionPayments.payments));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.subsno == null ? 0: this.subsno.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.lastDate == null ? 0: this.lastDate.hashCode());
    result = 31 * result + (this.payments == null ? 0: this.payments.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPayments {\n");
    
    sb.append("  subsno: ").append(subsno).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  lastDate: ").append(lastDate).append("\n");
    sb.append("  payments: ").append(payments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}