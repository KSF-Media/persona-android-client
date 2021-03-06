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
public class NewsletterSubscriptions {
  
  @SerializedName("norden")
  private Boolean norden = null;
  @SerializedName("daily")
  private Boolean daily = null;
  @SerializedName("kultur")
  private Boolean kultur = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getNorden() {
    return norden;
  }
  public void setNorden(Boolean norden) {
    this.norden = norden;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDaily() {
    return daily;
  }
  public void setDaily(Boolean daily) {
    this.daily = daily;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getKultur() {
    return kultur;
  }
  public void setKultur(Boolean kultur) {
    this.kultur = kultur;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewsletterSubscriptions newsletterSubscriptions = (NewsletterSubscriptions) o;
    return (this.norden == null ? newsletterSubscriptions.norden == null : this.norden.equals(newsletterSubscriptions.norden)) &&
        (this.daily == null ? newsletterSubscriptions.daily == null : this.daily.equals(newsletterSubscriptions.daily)) &&
        (this.kultur == null ? newsletterSubscriptions.kultur == null : this.kultur.equals(newsletterSubscriptions.kultur));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.norden == null ? 0: this.norden.hashCode());
    result = 31 * result + (this.daily == null ? 0: this.daily.hashCode());
    result = 31 * result + (this.kultur == null ? 0: this.kultur.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewsletterSubscriptions {\n");
    
    sb.append("  norden: ").append(norden).append("\n");
    sb.append("  daily: ").append(daily).append("\n");
    sb.append("  kultur: ").append(kultur).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
