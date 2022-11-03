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
import java.util.Map;
import org.openapitools.client.model.NewsletterSubscription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Newsletter {
  
  @SerializedName("listId")
  private String listId = null;
  @SerializedName("paper")
  private String paper = null;
  @SerializedName("subscriptions")
  private Map<String, List<NewsletterSubscription>> subscriptions = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getListId() {
    return listId;
  }
  public void setListId(String listId) {
    this.listId = listId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPaper() {
    return paper;
  }
  public void setPaper(String paper) {
    this.paper = paper;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, List<NewsletterSubscription>> getSubscriptions() {
    return subscriptions;
  }
  public void setSubscriptions(Map<String, List<NewsletterSubscription>> subscriptions) {
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
    Newsletter newsletter = (Newsletter) o;
    return (this.listId == null ? newsletter.listId == null : this.listId.equals(newsletter.listId)) &&
        (this.paper == null ? newsletter.paper == null : this.paper.equals(newsletter.paper)) &&
        (this.subscriptions == null ? newsletter.subscriptions == null : this.subscriptions.equals(newsletter.subscriptions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.listId == null ? 0: this.listId.hashCode());
    result = 31 * result + (this.paper == null ? 0: this.paper.hashCode());
    result = 31 * result + (this.subscriptions == null ? 0: this.subscriptions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Newsletter {\n");
    
    sb.append("  listId: ").append(listId).append("\n");
    sb.append("  paper: ").append(paper).append("\n");
    sb.append("  subscriptions: ").append(subscriptions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
