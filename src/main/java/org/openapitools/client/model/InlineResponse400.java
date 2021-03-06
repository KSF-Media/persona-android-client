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

import org.openapitools.client.model.InlineResponse400InvalidRequestBody;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse400 {
  
  @SerializedName("http_code")
  private Integer httpCode = null;
  @SerializedName("invalid_request_body")
  private InlineResponse400InvalidRequestBody invalidRequestBody = null;
  public enum HttpStatusEnum {
     Bad request, 
  };
  @SerializedName("http_status")
  private HttpStatusEnum httpStatus = null;

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
  public InlineResponse400InvalidRequestBody getInvalidRequestBody() {
    return invalidRequestBody;
  }
  public void setInvalidRequestBody(InlineResponse400InvalidRequestBody invalidRequestBody) {
    this.invalidRequestBody = invalidRequestBody;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return (this.httpCode == null ? inlineResponse400.httpCode == null : this.httpCode.equals(inlineResponse400.httpCode)) &&
        (this.invalidRequestBody == null ? inlineResponse400.invalidRequestBody == null : this.invalidRequestBody.equals(inlineResponse400.invalidRequestBody)) &&
        (this.httpStatus == null ? inlineResponse400.httpStatus == null : this.httpStatus.equals(inlineResponse400.httpStatus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.httpCode == null ? 0: this.httpCode.hashCode());
    result = 31 * result + (this.invalidRequestBody == null ? 0: this.invalidRequestBody.hashCode());
    result = 31 * result + (this.httpStatus == null ? 0: this.httpStatus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("  httpCode: ").append(httpCode).append("\n");
    sb.append("  invalidRequestBody: ").append(invalidRequestBody).append("\n");
    sb.append("  httpStatus: ").append(httpStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
