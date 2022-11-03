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
public class NewsletterSubscription {
  
  @SerializedName("listName")
  private String listName = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("subscribed")
  private Boolean subscribed = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getListName() {
    return listName;
  }
  public void setListName(String listName) {
    this.listName = listName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getSubscribed() {
    return subscribed;
  }
  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewsletterSubscription newsletterSubscription = (NewsletterSubscription) o;
    return (this.listName == null ? newsletterSubscription.listName == null : this.listName.equals(newsletterSubscription.listName)) &&
        (this.id == null ? newsletterSubscription.id == null : this.id.equals(newsletterSubscription.id)) &&
        (this.subscribed == null ? newsletterSubscription.subscribed == null : this.subscribed.equals(newsletterSubscription.subscribed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.listName == null ? 0: this.listName.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.subscribed == null ? 0: this.subscribed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewsletterSubscription {\n");
    
    sb.append("  listName: ").append(listName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  subscribed: ").append(subscribed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
