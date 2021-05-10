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
public class UpdatePasswordData {
  
  @SerializedName("password")
  private String password = null;
  @SerializedName("confirmPassword")
  private String confirmPassword = null;
  @SerializedName("token")
  private String token = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getConfirmPassword() {
    return confirmPassword;
  }
  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePasswordData updatePasswordData = (UpdatePasswordData) o;
    return (this.password == null ? updatePasswordData.password == null : this.password.equals(updatePasswordData.password)) &&
        (this.confirmPassword == null ? updatePasswordData.confirmPassword == null : this.confirmPassword.equals(updatePasswordData.confirmPassword)) &&
        (this.token == null ? updatePasswordData.token == null : this.token.equals(updatePasswordData.token));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.confirmPassword == null ? 0: this.confirmPassword.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePasswordData {\n");
    
    sb.append("  password: ").append(password).append("\n");
    sb.append("  confirmPassword: ").append(confirmPassword).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
