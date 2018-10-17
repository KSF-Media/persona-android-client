/**
 * Persona
 * KSF Media unified login service
 *
 * OpenAPI spec version: 1.1.0
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
public class Address {
  
  @SerializedName("countryCode")
  private String countryCode = null;
  @SerializedName("zipCode")
  private String zipCode = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("streetAddress")
  private String streetAddress = null;
  @SerializedName("streetName")
  private String streetName = null;
  @SerializedName("houseNo")
  private String houseNo = null;
  @SerializedName("staircase")
  private String staircase = null;
  @SerializedName("apartment")
  private String apartment = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

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
  @ApiModelProperty(value = "")
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHouseNo() {
    return houseNo;
  }
  public void setHouseNo(String houseNo) {
    this.houseNo = houseNo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStaircase() {
    return staircase;
  }
  public void setStaircase(String staircase) {
    this.staircase = staircase;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApartment() {
    return apartment;
  }
  public void setApartment(String apartment) {
    this.apartment = apartment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return (this.countryCode == null ? address.countryCode == null : this.countryCode.equals(address.countryCode)) &&
        (this.zipCode == null ? address.zipCode == null : this.zipCode.equals(address.zipCode)) &&
        (this.city == null ? address.city == null : this.city.equals(address.city)) &&
        (this.streetAddress == null ? address.streetAddress == null : this.streetAddress.equals(address.streetAddress)) &&
        (this.streetName == null ? address.streetName == null : this.streetName.equals(address.streetName)) &&
        (this.houseNo == null ? address.houseNo == null : this.houseNo.equals(address.houseNo)) &&
        (this.staircase == null ? address.staircase == null : this.staircase.equals(address.staircase)) &&
        (this.apartment == null ? address.apartment == null : this.apartment.equals(address.apartment));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.zipCode == null ? 0: this.zipCode.hashCode());
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.streetAddress == null ? 0: this.streetAddress.hashCode());
    result = 31 * result + (this.streetName == null ? 0: this.streetName.hashCode());
    result = 31 * result + (this.houseNo == null ? 0: this.houseNo.hashCode());
    result = 31 * result + (this.staircase == null ? 0: this.staircase.hashCode());
    result = 31 * result + (this.apartment == null ? 0: this.apartment.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  zipCode: ").append(zipCode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  streetAddress: ").append(streetAddress).append("\n");
    sb.append("  streetName: ").append(streetName).append("\n");
    sb.append("  houseNo: ").append(houseNo).append("\n");
    sb.append("  staircase: ").append(staircase).append("\n");
    sb.append("  apartment: ").append(apartment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
