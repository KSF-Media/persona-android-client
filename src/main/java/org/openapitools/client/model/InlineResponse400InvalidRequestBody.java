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
public class InlineResponse400InvalidRequestBody {
  
  public enum DescriptionEnum {
     Couldn&#39;t parse the request body., 
  };
  @SerializedName("description")
  private DescriptionEnum description = null;
  @SerializedName("message")
  private String message = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public DescriptionEnum getDescription() {
    return description;
  }
  public void setDescription(DescriptionEnum description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400InvalidRequestBody inlineResponse400InvalidRequestBody = (InlineResponse400InvalidRequestBody) o;
    return (this.description == null ? inlineResponse400InvalidRequestBody.description == null : this.description.equals(inlineResponse400InvalidRequestBody.description)) &&
        (this.message == null ? inlineResponse400InvalidRequestBody.message == null : this.message.equals(inlineResponse400InvalidRequestBody.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400InvalidRequestBody {\n");
    
    sb.append("  description: ").append(description).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
