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
public class InlineResponse4032EmailNotAuthorized {
  
  public enum DescriptionEnum {
     Email address not authorized by the user on the social site., 
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
    InlineResponse4032EmailNotAuthorized inlineResponse4032EmailNotAuthorized = (InlineResponse4032EmailNotAuthorized) o;
    return (this.description == null ? inlineResponse4032EmailNotAuthorized.description == null : this.description.equals(inlineResponse4032EmailNotAuthorized.description));
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
    sb.append("class InlineResponse4032EmailNotAuthorized {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
