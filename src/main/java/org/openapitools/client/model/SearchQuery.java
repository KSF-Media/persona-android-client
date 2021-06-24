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
public class SearchQuery {
  
  @SerializedName("faroLimit")
  private Integer faroLimit = null;
  @SerializedName("query")
  private String query = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFaroLimit() {
    return faroLimit;
  }
  public void setFaroLimit(Integer faroLimit) {
    this.faroLimit = faroLimit;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchQuery searchQuery = (SearchQuery) o;
    return (this.faroLimit == null ? searchQuery.faroLimit == null : this.faroLimit.equals(searchQuery.faroLimit)) &&
        (this.query == null ? searchQuery.query == null : this.query.equals(searchQuery.query));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.faroLimit == null ? 0: this.faroLimit.hashCode());
    result = 31 * result + (this.query == null ? 0: this.query.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchQuery {\n");
    
    sb.append("  faroLimit: ").append(faroLimit).append("\n");
    sb.append("  query: ").append(query).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}