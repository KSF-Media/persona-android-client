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

import org.openapitools.client.model.InlineResponse500InternalServerError;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse500 {
  
  @SerializedName("http_code")
  private Integer httpCode = null;
  public enum HttpStatusEnum {
     Internal server error, 
  };
  @SerializedName("http_status")
  private HttpStatusEnum httpStatus = null;
  @SerializedName("internal_server_error")
  private InlineResponse500InternalServerError internalServerError = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getHttpCode() {
    return httpCode;
  }
  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public HttpStatusEnum getHttpStatus() {
    return httpStatus;
  }
  public void setHttpStatus(HttpStatusEnum httpStatus) {
    this.httpStatus = httpStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse500InternalServerError getInternalServerError() {
    return internalServerError;
  }
  public void setInternalServerError(InlineResponse500InternalServerError internalServerError) {
    this.internalServerError = internalServerError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse500 inlineResponse500 = (InlineResponse500) o;
    return (this.httpCode == null ? inlineResponse500.httpCode == null : this.httpCode.equals(inlineResponse500.httpCode)) &&
        (this.httpStatus == null ? inlineResponse500.httpStatus == null : this.httpStatus.equals(inlineResponse500.httpStatus)) &&
        (this.internalServerError == null ? inlineResponse500.internalServerError == null : this.internalServerError.equals(inlineResponse500.internalServerError));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.httpCode == null ? 0: this.httpCode.hashCode());
    result = 31 * result + (this.httpStatus == null ? 0: this.httpStatus.hashCode());
    result = 31 * result + (this.internalServerError == null ? 0: this.internalServerError.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse500 {\n");
    
    sb.append("  httpCode: ").append(httpCode).append("\n");
    sb.append("  httpStatus: ").append(httpStatus).append("\n");
    sb.append("  internalServerError: ").append(internalServerError).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
