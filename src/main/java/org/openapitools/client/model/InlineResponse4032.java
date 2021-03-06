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

import org.openapitools.client.model.InlineResponse4032EmailAddressInUse;
import org.openapitools.client.model.InlineResponse4032EmailNotAuthorized;
import org.openapitools.client.model.InlineResponse4032OauthFailed;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse4032 {
  
  @SerializedName("email_address_in_use")
  private InlineResponse4032EmailAddressInUse emailAddressInUse = null;
  @SerializedName("http_code")
  private Integer httpCode = null;
  @SerializedName("oauth_failed")
  private InlineResponse4032OauthFailed oauthFailed = null;
  public enum HttpStatusEnum {
     Forbidden, 
  };
  @SerializedName("http_status")
  private HttpStatusEnum httpStatus = null;
  @SerializedName("email_not_authorized")
  private InlineResponse4032EmailNotAuthorized emailNotAuthorized = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse4032EmailAddressInUse getEmailAddressInUse() {
    return emailAddressInUse;
  }
  public void setEmailAddressInUse(InlineResponse4032EmailAddressInUse emailAddressInUse) {
    this.emailAddressInUse = emailAddressInUse;
  }

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
  public InlineResponse4032OauthFailed getOauthFailed() {
    return oauthFailed;
  }
  public void setOauthFailed(InlineResponse4032OauthFailed oauthFailed) {
    this.oauthFailed = oauthFailed;
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
  public InlineResponse4032EmailNotAuthorized getEmailNotAuthorized() {
    return emailNotAuthorized;
  }
  public void setEmailNotAuthorized(InlineResponse4032EmailNotAuthorized emailNotAuthorized) {
    this.emailNotAuthorized = emailNotAuthorized;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4032 inlineResponse4032 = (InlineResponse4032) o;
    return (this.emailAddressInUse == null ? inlineResponse4032.emailAddressInUse == null : this.emailAddressInUse.equals(inlineResponse4032.emailAddressInUse)) &&
        (this.httpCode == null ? inlineResponse4032.httpCode == null : this.httpCode.equals(inlineResponse4032.httpCode)) &&
        (this.oauthFailed == null ? inlineResponse4032.oauthFailed == null : this.oauthFailed.equals(inlineResponse4032.oauthFailed)) &&
        (this.httpStatus == null ? inlineResponse4032.httpStatus == null : this.httpStatus.equals(inlineResponse4032.httpStatus)) &&
        (this.emailNotAuthorized == null ? inlineResponse4032.emailNotAuthorized == null : this.emailNotAuthorized.equals(inlineResponse4032.emailNotAuthorized));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.emailAddressInUse == null ? 0: this.emailAddressInUse.hashCode());
    result = 31 * result + (this.httpCode == null ? 0: this.httpCode.hashCode());
    result = 31 * result + (this.oauthFailed == null ? 0: this.oauthFailed.hashCode());
    result = 31 * result + (this.httpStatus == null ? 0: this.httpStatus.hashCode());
    result = 31 * result + (this.emailNotAuthorized == null ? 0: this.emailNotAuthorized.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4032 {\n");
    
    sb.append("  emailAddressInUse: ").append(emailAddressInUse).append("\n");
    sb.append("  httpCode: ").append(httpCode).append("\n");
    sb.append("  oauthFailed: ").append(oauthFailed).append("\n");
    sb.append("  httpStatus: ").append(httpStatus).append("\n");
    sb.append("  emailNotAuthorized: ").append(emailNotAuthorized).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
