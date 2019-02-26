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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ActiveDays {
  
  @SerializedName("mon")
  private Boolean mon = null;
  @SerializedName("tue")
  private Boolean tue = null;
  @SerializedName("wed")
  private Boolean wed = null;
  @SerializedName("thu")
  private Boolean thu = null;
  @SerializedName("fri")
  private Boolean fri = null;
  @SerializedName("sat")
  private Boolean sat = null;
  @SerializedName("sun")
  private Boolean sun = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getMon() {
    return mon;
  }
  public void setMon(Boolean mon) {
    this.mon = mon;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getTue() {
    return tue;
  }
  public void setTue(Boolean tue) {
    this.tue = tue;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getWed() {
    return wed;
  }
  public void setWed(Boolean wed) {
    this.wed = wed;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getThu() {
    return thu;
  }
  public void setThu(Boolean thu) {
    this.thu = thu;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getFri() {
    return fri;
  }
  public void setFri(Boolean fri) {
    this.fri = fri;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getSat() {
    return sat;
  }
  public void setSat(Boolean sat) {
    this.sat = sat;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getSun() {
    return sun;
  }
  public void setSun(Boolean sun) {
    this.sun = sun;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDays activeDays = (ActiveDays) o;
    return (this.mon == null ? activeDays.mon == null : this.mon.equals(activeDays.mon)) &&
        (this.tue == null ? activeDays.tue == null : this.tue.equals(activeDays.tue)) &&
        (this.wed == null ? activeDays.wed == null : this.wed.equals(activeDays.wed)) &&
        (this.thu == null ? activeDays.thu == null : this.thu.equals(activeDays.thu)) &&
        (this.fri == null ? activeDays.fri == null : this.fri.equals(activeDays.fri)) &&
        (this.sat == null ? activeDays.sat == null : this.sat.equals(activeDays.sat)) &&
        (this.sun == null ? activeDays.sun == null : this.sun.equals(activeDays.sun));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mon == null ? 0: this.mon.hashCode());
    result = 31 * result + (this.tue == null ? 0: this.tue.hashCode());
    result = 31 * result + (this.wed == null ? 0: this.wed.hashCode());
    result = 31 * result + (this.thu == null ? 0: this.thu.hashCode());
    result = 31 * result + (this.fri == null ? 0: this.fri.hashCode());
    result = 31 * result + (this.sat == null ? 0: this.sat.hashCode());
    result = 31 * result + (this.sun == null ? 0: this.sun.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDays {\n");
    
    sb.append("  mon: ").append(mon).append("\n");
    sb.append("  tue: ").append(tue).append("\n");
    sb.append("  wed: ").append(wed).append("\n");
    sb.append("  thu: ").append(thu).append("\n");
    sb.append("  fri: ").append(fri).append("\n");
    sb.append("  sat: ").append(sat).append("\n");
    sb.append("  sun: ").append(sun).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
