/**
 * Persona
 * KSF Media unified login service
 *
 * OpenAPI spec version: 1.3.0
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
public class SubscriptionDates {
  
  @SerializedName("lenMonths")
  private Integer lenMonths = null;
  @SerializedName("lenDays")
  private Integer lenDays = null;
  @SerializedName("start")
  private Date start = null;
  @SerializedName("end")
  private Date end = null;
  @SerializedName("unpaidBreak")
  private Date unpaidBreak = null;
  @SerializedName("invoicingStart")
  private Date invoicingStart = null;
  @SerializedName("paidUntil")
  private Date paidUntil = null;
  @SerializedName("suspend")
  private Date suspend = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(value = "")
  public Integer getLenMonths() {
    return lenMonths;
  }
  public void setLenMonths(Integer lenMonths) {
    this.lenMonths = lenMonths;
  }

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(value = "")
  public Integer getLenDays() {
    return lenDays;
  }
  public void setLenDays(Integer lenDays) {
    this.lenDays = lenDays;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getUnpaidBreak() {
    return unpaidBreak;
  }
  public void setUnpaidBreak(Date unpaidBreak) {
    this.unpaidBreak = unpaidBreak;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getInvoicingStart() {
    return invoicingStart;
  }
  public void setInvoicingStart(Date invoicingStart) {
    this.invoicingStart = invoicingStart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getPaidUntil() {
    return paidUntil;
  }
  public void setPaidUntil(Date paidUntil) {
    this.paidUntil = paidUntil;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getSuspend() {
    return suspend;
  }
  public void setSuspend(Date suspend) {
    this.suspend = suspend;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDates subscriptionDates = (SubscriptionDates) o;
    return (this.lenMonths == null ? subscriptionDates.lenMonths == null : this.lenMonths.equals(subscriptionDates.lenMonths)) &&
        (this.lenDays == null ? subscriptionDates.lenDays == null : this.lenDays.equals(subscriptionDates.lenDays)) &&
        (this.start == null ? subscriptionDates.start == null : this.start.equals(subscriptionDates.start)) &&
        (this.end == null ? subscriptionDates.end == null : this.end.equals(subscriptionDates.end)) &&
        (this.unpaidBreak == null ? subscriptionDates.unpaidBreak == null : this.unpaidBreak.equals(subscriptionDates.unpaidBreak)) &&
        (this.invoicingStart == null ? subscriptionDates.invoicingStart == null : this.invoicingStart.equals(subscriptionDates.invoicingStart)) &&
        (this.paidUntil == null ? subscriptionDates.paidUntil == null : this.paidUntil.equals(subscriptionDates.paidUntil)) &&
        (this.suspend == null ? subscriptionDates.suspend == null : this.suspend.equals(subscriptionDates.suspend));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.lenMonths == null ? 0: this.lenMonths.hashCode());
    result = 31 * result + (this.lenDays == null ? 0: this.lenDays.hashCode());
    result = 31 * result + (this.start == null ? 0: this.start.hashCode());
    result = 31 * result + (this.end == null ? 0: this.end.hashCode());
    result = 31 * result + (this.unpaidBreak == null ? 0: this.unpaidBreak.hashCode());
    result = 31 * result + (this.invoicingStart == null ? 0: this.invoicingStart.hashCode());
    result = 31 * result + (this.paidUntil == null ? 0: this.paidUntil.hashCode());
    result = 31 * result + (this.suspend == null ? 0: this.suspend.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDates {\n");
    
    sb.append("  lenMonths: ").append(lenMonths).append("\n");
    sb.append("  lenDays: ").append(lenDays).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  unpaidBreak: ").append(unpaidBreak).append("\n");
    sb.append("  invoicingStart: ").append(invoicingStart).append("\n");
    sb.append("  paidUntil: ").append(paidUntil).append("\n");
    sb.append("  suspend: ").append(suspend).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
