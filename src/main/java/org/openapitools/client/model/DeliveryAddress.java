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

@ApiModel(description = "")
public class DeliveryAddress {
  
  @SerializedName("streetAddress")
  private String streetAddress = null;
  @SerializedName("zipcode")
  private String zipcode = null;
  @SerializedName("city")
  private String city = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryAddress deliveryAddress = (DeliveryAddress) o;
    return (this.streetAddress == null ? deliveryAddress.streetAddress == null : this.streetAddress.equals(deliveryAddress.streetAddress)) &&
        (this.zipcode == null ? deliveryAddress.zipcode == null : this.zipcode.equals(deliveryAddress.zipcode)) &&
        (this.city == null ? deliveryAddress.city == null : this.city.equals(deliveryAddress.city));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.streetAddress == null ? 0: this.streetAddress.hashCode());
    result = 31 * result + (this.zipcode == null ? 0: this.zipcode.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryAddress {\n");
    
    sb.append("  streetAddress: ").append(streetAddress).append("\n");
    sb.append("  zipcode: ").append(zipcode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}