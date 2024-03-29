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
public class PersistedEntitlementAccess {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("startAt")
  private String startAt = null;
  @SerializedName("endAt")
  private String endAt = null;
  @SerializedName("onlyToProducts")
  private List<String> onlyToProducts = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

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
    PersistedEntitlementAccess persistedEntitlementAccess = (PersistedEntitlementAccess) o;
    return (this.id == null ? persistedEntitlementAccess.id == null : this.id.equals(persistedEntitlementAccess.id)) &&
        (this.startAt == null ? persistedEntitlementAccess.startAt == null : this.startAt.equals(persistedEntitlementAccess.startAt)) &&
        (this.endAt == null ? persistedEntitlementAccess.endAt == null : this.endAt.equals(persistedEntitlementAccess.endAt)) &&
        (this.onlyToProducts == null ? persistedEntitlementAccess.onlyToProducts == null : this.onlyToProducts.equals(persistedEntitlementAccess.onlyToProducts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.startAt == null ? 0: this.startAt.hashCode());
    result = 31 * result + (this.endAt == null ? 0: this.endAt.hashCode());
    result = 31 * result + (this.onlyToProducts == null ? 0: this.onlyToProducts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistedEntitlementAccess {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  startAt: ").append(startAt).append("\n");
    sb.append("  endAt: ").append(endAt).append("\n");
    sb.append("  onlyToProducts: ").append(onlyToProducts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
