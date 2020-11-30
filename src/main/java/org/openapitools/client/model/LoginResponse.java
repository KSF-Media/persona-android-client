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

import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LoginResponse {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("ssoCode")
  private String ssoCode = null;
  @SerializedName("uuid")
  private UUID uuid = null;
  @SerializedName("isAdmin")
  private Boolean isAdmin = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSsoCode() {
    return ssoCode;
  }
  public void setSsoCode(String ssoCode) {
    this.ssoCode = ssoCode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsAdmin() {
    return isAdmin;
  }
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse loginResponse = (LoginResponse) o;
    return (this.token == null ? loginResponse.token == null : this.token.equals(loginResponse.token)) &&
        (this.ssoCode == null ? loginResponse.ssoCode == null : this.ssoCode.equals(loginResponse.ssoCode)) &&
        (this.uuid == null ? loginResponse.uuid == null : this.uuid.equals(loginResponse.uuid)) &&
        (this.isAdmin == null ? loginResponse.isAdmin == null : this.isAdmin.equals(loginResponse.isAdmin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.ssoCode == null ? 0: this.ssoCode.hashCode());
    result = 31 * result + (this.uuid == null ? 0: this.uuid.hashCode());
    result = 31 * result + (this.isAdmin == null ? 0: this.isAdmin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  ssoCode: ").append(ssoCode).append("\n");
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("  isAdmin: ").append(isAdmin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
