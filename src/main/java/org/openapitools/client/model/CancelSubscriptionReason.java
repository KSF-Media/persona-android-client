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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Cancel reason
 **/
@ApiModel(description = "Cancel reason")
public class CancelSubscriptionReason {
  
  public enum ReasonEnum {
     Price,  Distribution,  Content,  OldAge,  Deceased,  Digital,  Other,  ChangeProduct, 
  };
  @SerializedName("reason")
  private ReasonEnum reason = null;
  @SerializedName("notes")
  private String notes = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  /**
   * Cancel reason explanation
   **/
  @ApiModelProperty(value = "Cancel reason explanation")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelSubscriptionReason cancelSubscriptionReason = (CancelSubscriptionReason) o;
    return (this.reason == null ? cancelSubscriptionReason.reason == null : this.reason.equals(cancelSubscriptionReason.reason)) &&
        (this.notes == null ? cancelSubscriptionReason.notes == null : this.notes.equals(cancelSubscriptionReason.notes));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    result = 31 * result + (this.notes == null ? 0: this.notes.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelSubscriptionReason {\n");
    
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
