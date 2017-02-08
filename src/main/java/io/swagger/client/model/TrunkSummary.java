/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * The Trunk Summary Object is used to briefly represent a trunk. It can be seen in several places throughout this API. Here are the properties:
 */
@ApiModel(description = "The Trunk Summary Object is used to briefly represent a trunk. It can be seen in several places throughout this API. Here are the properties:")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T13:11:20.199+02:00")
public class TrunkSummary   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public TrunkSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Integer Trunk ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Integer Trunk ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TrunkSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name. Required.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name. Required.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkSummary trunkSummary = (TrunkSummary) o;
    return Objects.equals(this.id, trunkSummary.id) &&
        Objects.equals(this.name, trunkSummary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

