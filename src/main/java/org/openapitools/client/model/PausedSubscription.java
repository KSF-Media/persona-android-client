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
public class PausedSubscription {
  
  @SerializedName("pausedSubscriptionSubsno")
  private Integer pausedSubscriptionSubsno = null;
  @SerializedName("pausedSubscriptionSleepStartDate")
  private Date pausedSubscriptionSleepStartDate = null;
  @SerializedName("pausedSubscriptionSleepEndDate")
  private Date pausedSubscriptionSleepEndDate = null;
  @SerializedName("pausedSubscriptionCreditType")
  private String pausedSubscriptionCreditType = null;
  @SerializedName("pausedSubscriptionCreditAmount")
  private Integer pausedSubscriptionCreditAmount = null;
  @SerializedName("pausedSubscriptionSleepType")
  private String pausedSubscriptionSleepType = null;
  @SerializedName("pausedSubscriptionCredited")
  private Boolean pausedSubscriptionCredited = null;
  @SerializedName("pausedSubscriptionCreditInvno")
  private Integer pausedSubscriptionCreditInvno = null;
  @SerializedName("pausedSubscriptionBookingDate")
  private String pausedSubscriptionBookingDate = null;
  @SerializedName("pausedSubscriptionAllowWebpaper")
  private Boolean pausedSubscriptionAllowWebpaper = null;
  @SerializedName("pausedSubscriptionReceiveType")
  private String pausedSubscriptionReceiveType = null;
  @SerializedName("pausedSubscriptionConfirmStatus")
  private String pausedSubscriptionConfirmStatus = null;
  @SerializedName("pausedSubscriptionStampUser")
  private String pausedSubscriptionStampUser = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPausedSubscriptionSubsno() {
    return pausedSubscriptionSubsno;
  }
  public void setPausedSubscriptionSubsno(Integer pausedSubscriptionSubsno) {
    this.pausedSubscriptionSubsno = pausedSubscriptionSubsno;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getPausedSubscriptionSleepStartDate() {
    return pausedSubscriptionSleepStartDate;
  }
  public void setPausedSubscriptionSleepStartDate(Date pausedSubscriptionSleepStartDate) {
    this.pausedSubscriptionSleepStartDate = pausedSubscriptionSleepStartDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getPausedSubscriptionSleepEndDate() {
    return pausedSubscriptionSleepEndDate;
  }
  public void setPausedSubscriptionSleepEndDate(Date pausedSubscriptionSleepEndDate) {
    this.pausedSubscriptionSleepEndDate = pausedSubscriptionSleepEndDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPausedSubscriptionCreditType() {
    return pausedSubscriptionCreditType;
  }
  public void setPausedSubscriptionCreditType(String pausedSubscriptionCreditType) {
    this.pausedSubscriptionCreditType = pausedSubscriptionCreditType;
  }

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPausedSubscriptionCreditAmount() {
    return pausedSubscriptionCreditAmount;
  }
  public void setPausedSubscriptionCreditAmount(Integer pausedSubscriptionCreditAmount) {
    this.pausedSubscriptionCreditAmount = pausedSubscriptionCreditAmount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPausedSubscriptionSleepType() {
    return pausedSubscriptionSleepType;
  }
  public void setPausedSubscriptionSleepType(String pausedSubscriptionSleepType) {
    this.pausedSubscriptionSleepType = pausedSubscriptionSleepType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getPausedSubscriptionCredited() {
    return pausedSubscriptionCredited;
  }
  public void setPausedSubscriptionCredited(Boolean pausedSubscriptionCredited) {
    this.pausedSubscriptionCredited = pausedSubscriptionCredited;
  }

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPausedSubscriptionCreditInvno() {
    return pausedSubscriptionCreditInvno;
  }
  public void setPausedSubscriptionCreditInvno(Integer pausedSubscriptionCreditInvno) {
    this.pausedSubscriptionCreditInvno = pausedSubscriptionCreditInvno;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPausedSubscriptionBookingDate() {
    return pausedSubscriptionBookingDate;
  }
  public void setPausedSubscriptionBookingDate(String pausedSubscriptionBookingDate) {
    this.pausedSubscriptionBookingDate = pausedSubscriptionBookingDate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getPausedSubscriptionAllowWebpaper() {
    return pausedSubscriptionAllowWebpaper;
  }
  public void setPausedSubscriptionAllowWebpaper(Boolean pausedSubscriptionAllowWebpaper) {
    this.pausedSubscriptionAllowWebpaper = pausedSubscriptionAllowWebpaper;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPausedSubscriptionReceiveType() {
    return pausedSubscriptionReceiveType;
  }
  public void setPausedSubscriptionReceiveType(String pausedSubscriptionReceiveType) {
    this.pausedSubscriptionReceiveType = pausedSubscriptionReceiveType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPausedSubscriptionConfirmStatus() {
    return pausedSubscriptionConfirmStatus;
  }
  public void setPausedSubscriptionConfirmStatus(String pausedSubscriptionConfirmStatus) {
    this.pausedSubscriptionConfirmStatus = pausedSubscriptionConfirmStatus;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPausedSubscriptionStampUser() {
    return pausedSubscriptionStampUser;
  }
  public void setPausedSubscriptionStampUser(String pausedSubscriptionStampUser) {
    this.pausedSubscriptionStampUser = pausedSubscriptionStampUser;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PausedSubscription pausedSubscription = (PausedSubscription) o;
    return (this.pausedSubscriptionSubsno == null ? pausedSubscription.pausedSubscriptionSubsno == null : this.pausedSubscriptionSubsno.equals(pausedSubscription.pausedSubscriptionSubsno)) &&
        (this.pausedSubscriptionSleepStartDate == null ? pausedSubscription.pausedSubscriptionSleepStartDate == null : this.pausedSubscriptionSleepStartDate.equals(pausedSubscription.pausedSubscriptionSleepStartDate)) &&
        (this.pausedSubscriptionSleepEndDate == null ? pausedSubscription.pausedSubscriptionSleepEndDate == null : this.pausedSubscriptionSleepEndDate.equals(pausedSubscription.pausedSubscriptionSleepEndDate)) &&
        (this.pausedSubscriptionCreditType == null ? pausedSubscription.pausedSubscriptionCreditType == null : this.pausedSubscriptionCreditType.equals(pausedSubscription.pausedSubscriptionCreditType)) &&
        (this.pausedSubscriptionCreditAmount == null ? pausedSubscription.pausedSubscriptionCreditAmount == null : this.pausedSubscriptionCreditAmount.equals(pausedSubscription.pausedSubscriptionCreditAmount)) &&
        (this.pausedSubscriptionSleepType == null ? pausedSubscription.pausedSubscriptionSleepType == null : this.pausedSubscriptionSleepType.equals(pausedSubscription.pausedSubscriptionSleepType)) &&
        (this.pausedSubscriptionCredited == null ? pausedSubscription.pausedSubscriptionCredited == null : this.pausedSubscriptionCredited.equals(pausedSubscription.pausedSubscriptionCredited)) &&
        (this.pausedSubscriptionCreditInvno == null ? pausedSubscription.pausedSubscriptionCreditInvno == null : this.pausedSubscriptionCreditInvno.equals(pausedSubscription.pausedSubscriptionCreditInvno)) &&
        (this.pausedSubscriptionBookingDate == null ? pausedSubscription.pausedSubscriptionBookingDate == null : this.pausedSubscriptionBookingDate.equals(pausedSubscription.pausedSubscriptionBookingDate)) &&
        (this.pausedSubscriptionAllowWebpaper == null ? pausedSubscription.pausedSubscriptionAllowWebpaper == null : this.pausedSubscriptionAllowWebpaper.equals(pausedSubscription.pausedSubscriptionAllowWebpaper)) &&
        (this.pausedSubscriptionReceiveType == null ? pausedSubscription.pausedSubscriptionReceiveType == null : this.pausedSubscriptionReceiveType.equals(pausedSubscription.pausedSubscriptionReceiveType)) &&
        (this.pausedSubscriptionConfirmStatus == null ? pausedSubscription.pausedSubscriptionConfirmStatus == null : this.pausedSubscriptionConfirmStatus.equals(pausedSubscription.pausedSubscriptionConfirmStatus)) &&
        (this.pausedSubscriptionStampUser == null ? pausedSubscription.pausedSubscriptionStampUser == null : this.pausedSubscriptionStampUser.equals(pausedSubscription.pausedSubscriptionStampUser));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pausedSubscriptionSubsno == null ? 0: this.pausedSubscriptionSubsno.hashCode());
    result = 31 * result + (this.pausedSubscriptionSleepStartDate == null ? 0: this.pausedSubscriptionSleepStartDate.hashCode());
    result = 31 * result + (this.pausedSubscriptionSleepEndDate == null ? 0: this.pausedSubscriptionSleepEndDate.hashCode());
    result = 31 * result + (this.pausedSubscriptionCreditType == null ? 0: this.pausedSubscriptionCreditType.hashCode());
    result = 31 * result + (this.pausedSubscriptionCreditAmount == null ? 0: this.pausedSubscriptionCreditAmount.hashCode());
    result = 31 * result + (this.pausedSubscriptionSleepType == null ? 0: this.pausedSubscriptionSleepType.hashCode());
    result = 31 * result + (this.pausedSubscriptionCredited == null ? 0: this.pausedSubscriptionCredited.hashCode());
    result = 31 * result + (this.pausedSubscriptionCreditInvno == null ? 0: this.pausedSubscriptionCreditInvno.hashCode());
    result = 31 * result + (this.pausedSubscriptionBookingDate == null ? 0: this.pausedSubscriptionBookingDate.hashCode());
    result = 31 * result + (this.pausedSubscriptionAllowWebpaper == null ? 0: this.pausedSubscriptionAllowWebpaper.hashCode());
    result = 31 * result + (this.pausedSubscriptionReceiveType == null ? 0: this.pausedSubscriptionReceiveType.hashCode());
    result = 31 * result + (this.pausedSubscriptionConfirmStatus == null ? 0: this.pausedSubscriptionConfirmStatus.hashCode());
    result = 31 * result + (this.pausedSubscriptionStampUser == null ? 0: this.pausedSubscriptionStampUser.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PausedSubscription {\n");
    
    sb.append("  pausedSubscriptionSubsno: ").append(pausedSubscriptionSubsno).append("\n");
    sb.append("  pausedSubscriptionSleepStartDate: ").append(pausedSubscriptionSleepStartDate).append("\n");
    sb.append("  pausedSubscriptionSleepEndDate: ").append(pausedSubscriptionSleepEndDate).append("\n");
    sb.append("  pausedSubscriptionCreditType: ").append(pausedSubscriptionCreditType).append("\n");
    sb.append("  pausedSubscriptionCreditAmount: ").append(pausedSubscriptionCreditAmount).append("\n");
    sb.append("  pausedSubscriptionSleepType: ").append(pausedSubscriptionSleepType).append("\n");
    sb.append("  pausedSubscriptionCredited: ").append(pausedSubscriptionCredited).append("\n");
    sb.append("  pausedSubscriptionCreditInvno: ").append(pausedSubscriptionCreditInvno).append("\n");
    sb.append("  pausedSubscriptionBookingDate: ").append(pausedSubscriptionBookingDate).append("\n");
    sb.append("  pausedSubscriptionAllowWebpaper: ").append(pausedSubscriptionAllowWebpaper).append("\n");
    sb.append("  pausedSubscriptionReceiveType: ").append(pausedSubscriptionReceiveType).append("\n");
    sb.append("  pausedSubscriptionConfirmStatus: ").append(pausedSubscriptionConfirmStatus).append("\n");
    sb.append("  pausedSubscriptionStampUser: ").append(pausedSubscriptionStampUser).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
