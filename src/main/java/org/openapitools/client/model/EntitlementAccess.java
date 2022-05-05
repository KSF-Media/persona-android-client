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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EntitlementAccess {
  
  @SerializedName("startAt")
  private String startAt = null;
  @SerializedName("endAt")
  private String endAt = null;
  @SerializedName("onlyToProducts")
  private List<String> onlyToProducts = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStartAt() {
    return startAt;
  }
  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEndAt() {
    return endAt;
  }
  public void setEndAt(String endAt) {
    this.endAt = endAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getOnlyToProducts() {
    return onlyToProducts;
  }
  public void setOnlyToProducts(List<String> onlyToProducts) {
    this.onlyToProducts = onlyToProducts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementAccess entitlementAccess = (EntitlementAccess) o;
    return (this.startAt == null ? entitlementAccess.startAt == null : this.startAt.equals(entitlementAccess.startAt)) &&
        (this.endAt == null ? entitlementAccess.endAt == null : this.endAt.equals(entitlementAccess.endAt)) &&
        (this.onlyToProducts == null ? entitlementAccess.onlyToProducts == null : this.onlyToProducts.equals(entitlementAccess.onlyToProducts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.startAt == null ? 0: this.startAt.hashCode());
    result = 31 * result + (this.endAt == null ? 0: this.endAt.hashCode());
    result = 31 * result + (this.onlyToProducts == null ? 0: this.onlyToProducts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementAccess {\n");
    
    sb.append("  startAt: ").append(startAt).append("\n");
    sb.append("  endAt: ").append(endAt).append("\n");
    sb.append("  onlyToProducts: ").append(onlyToProducts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
