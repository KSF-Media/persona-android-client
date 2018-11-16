/**
 * Persona
 * KSF Media unified login service
 *
 * OpenAPI spec version: 1.2.0
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
public class InlineResponse403InvalidCredentials {
  
  public enum DescriptionEnum {
     Wrong username or password, 
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
    InlineResponse403InvalidCredentials inlineResponse403InvalidCredentials = (InlineResponse403InvalidCredentials) o;
    return (this.description == null ? inlineResponse403InvalidCredentials.description == null : this.description.equals(inlineResponse403InvalidCredentials.description));
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
    sb.append("class InlineResponse403InvalidCredentials {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
