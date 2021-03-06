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
public class InlineResponse4032OauthFailed {
  
  public enum DescriptionEnum {
     Something wrong happened while authenticating Janrain with OAuth, 
  };
  @SerializedName("description")
  private DescriptionEnum description = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public DescriptionEnum getDescription() {
    return description;
  }
  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4032OauthFailed inlineResponse4032OauthFailed = (InlineResponse4032OauthFailed) o;
    return (this.description == null ? inlineResponse4032OauthFailed.description == null : this.description.equals(inlineResponse4032OauthFailed.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4032OauthFailed {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
