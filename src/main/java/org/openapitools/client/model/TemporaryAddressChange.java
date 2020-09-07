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
public class TemporaryAddressChange {
  
  @SerializedName("zipCode")
  private String zipCode = null;
  @SerializedName("streetAddress")
  private String streetAddress = null;
  @SerializedName("countryCode")
  private String countryCode = null;
  @SerializedName("startDate")
  private Date startDate = null;
  @SerializedName("endDate")
  private Date endDate = null;
  @SerializedName("temporaryName")
  private String temporaryName = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
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
  @ApiModelProperty(required = true, value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
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
  @ApiModelProperty(value = "")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTemporaryName() {
    return temporaryName;
  }
  public void setTemporaryName(String temporaryName) {
    this.temporaryName = temporaryName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemporaryAddressChange temporaryAddressChange = (TemporaryAddressChange) o;
    return (this.zipCode == null ? temporaryAddressChange.zipCode == null : this.zipCode.equals(temporaryAddressChange.zipCode)) &&
        (this.streetAddress == null ? temporaryAddressChange.streetAddress == null : this.streetAddress.equals(temporaryAddressChange.streetAddress)) &&
        (this.countryCode == null ? temporaryAddressChange.countryCode == null : this.countryCode.equals(temporaryAddressChange.countryCode)) &&
        (this.startDate == null ? temporaryAddressChange.startDate == null : this.startDate.equals(temporaryAddressChange.startDate)) &&
        (this.endDate == null ? temporaryAddressChange.endDate == null : this.endDate.equals(temporaryAddressChange.endDate)) &&
        (this.temporaryName == null ? temporaryAddressChange.temporaryName == null : this.temporaryName.equals(temporaryAddressChange.temporaryName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.zipCode == null ? 0: this.zipCode.hashCode());
    result = 31 * result + (this.streetAddress == null ? 0: this.streetAddress.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.startDate == null ? 0: this.startDate.hashCode());
    result = 31 * result + (this.endDate == null ? 0: this.endDate.hashCode());
    result = 31 * result + (this.temporaryName == null ? 0: this.temporaryName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemporaryAddressChange {\n");
    
    sb.append("  zipCode: ").append(zipCode).append("\n");
    sb.append("  streetAddress: ").append(streetAddress).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  endDate: ").append(endDate).append("\n");
    sb.append("  temporaryName: ").append(temporaryName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
