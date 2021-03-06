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

import java.util.*;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.Subscription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class FaroUser {
  
  @SerializedName("cusno")
  private Integer cusno = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("address")
  private Address address = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("subscriptions")
  private List<Subscription> subscriptions = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCusno() {
    return cusno;
  }
  public void setCusno(Integer cusno) {
    this.cusno = cusno;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Subscription> getSubscriptions() {
    return subscriptions;
  }
  public void setSubscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaroUser faroUser = (FaroUser) o;
    return (this.cusno == null ? faroUser.cusno == null : this.cusno.equals(faroUser.cusno)) &&
        (this.name == null ? faroUser.name == null : this.name.equals(faroUser.name)) &&
        (this.address == null ? faroUser.address == null : this.address.equals(faroUser.address)) &&
        (this.email == null ? faroUser.email == null : this.email.equals(faroUser.email)) &&
        (this.subscriptions == null ? faroUser.subscriptions == null : this.subscriptions.equals(faroUser.subscriptions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cusno == null ? 0: this.cusno.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.subscriptions == null ? 0: this.subscriptions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaroUser {\n");
    
    sb.append("  cusno: ").append(cusno).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  subscriptions: ").append(subscriptions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
