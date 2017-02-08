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
 * The Device Summary Object is used to briefly represent a VoIP device. It consists of the ID and name only:
 */
@ApiModel(description = "The Device Summary Object is used to briefly represent a VoIP device. It consists of the ID and name only:")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T13:11:20.199+02:00")
public class DeviceSummary   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public DeviceSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DeviceSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-supplied name, otherwise NULL
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "User-supplied name, otherwise NULL")
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
    DeviceSummary deviceSummary = (DeviceSummary) o;
    return Objects.equals(this.id, deviceSummary.id) &&
        Objects.equals(this.name, deviceSummary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceSummary {\n");
    
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

