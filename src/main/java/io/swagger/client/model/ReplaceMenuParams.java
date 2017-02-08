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
import java.util.ArrayList;
import java.util.List;


/**
 * ReplaceMenuParams
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T13:11:20.199+02:00")
public class ReplaceMenuParams   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("greeting")
  private Object greeting = null;

  @SerializedName("invalid_keypress")
  private Object invalidKeypress = null;

  @SerializedName("allow_extension_dial")
  private Boolean allowExtensionDial = null;

  @SerializedName("keypress_wait_time")
  private Integer keypressWaitTime = null;

  @SerializedName("timeout_handler")
  private Object timeoutHandler = null;

  @SerializedName("options")
  private List<Object> options = new ArrayList<Object>();

  public ReplaceMenuParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReplaceMenuParams greeting(Object greeting) {
    this.greeting = greeting;
    return this;
  }

   /**
   * Get greeting
   * @return greeting
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getGreeting() {
    return greeting;
  }

  public void setGreeting(Object greeting) {
    this.greeting = greeting;
  }

  public ReplaceMenuParams invalidKeypress(Object invalidKeypress) {
    this.invalidKeypress = invalidKeypress;
    return this;
  }

   /**
   * Get invalidKeypress
   * @return invalidKeypress
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getInvalidKeypress() {
    return invalidKeypress;
  }

  public void setInvalidKeypress(Object invalidKeypress) {
    this.invalidKeypress = invalidKeypress;
  }

  public ReplaceMenuParams allowExtensionDial(Boolean allowExtensionDial) {
    this.allowExtensionDial = allowExtensionDial;
    return this;
  }

   /**
   * Get allowExtensionDial
   * @return allowExtensionDial
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAllowExtensionDial() {
    return allowExtensionDial;
  }

  public void setAllowExtensionDial(Boolean allowExtensionDial) {
    this.allowExtensionDial = allowExtensionDial;
  }

  public ReplaceMenuParams keypressWaitTime(Integer keypressWaitTime) {
    this.keypressWaitTime = keypressWaitTime;
    return this;
  }

   /**
   * Get keypressWaitTime
   * @return keypressWaitTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getKeypressWaitTime() {
    return keypressWaitTime;
  }

  public void setKeypressWaitTime(Integer keypressWaitTime) {
    this.keypressWaitTime = keypressWaitTime;
  }

  public ReplaceMenuParams timeoutHandler(Object timeoutHandler) {
    this.timeoutHandler = timeoutHandler;
    return this;
  }

   /**
   * Get timeoutHandler
   * @return timeoutHandler
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getTimeoutHandler() {
    return timeoutHandler;
  }

  public void setTimeoutHandler(Object timeoutHandler) {
    this.timeoutHandler = timeoutHandler;
  }

  public ReplaceMenuParams options(List<Object> options) {
    this.options = options;
    return this;
  }

  public ReplaceMenuParams addOptionsItem(Object optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Object> getOptions() {
    return options;
  }

  public void setOptions(List<Object> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceMenuParams replaceMenuParams = (ReplaceMenuParams) o;
    return Objects.equals(this.name, replaceMenuParams.name) &&
        Objects.equals(this.greeting, replaceMenuParams.greeting) &&
        Objects.equals(this.invalidKeypress, replaceMenuParams.invalidKeypress) &&
        Objects.equals(this.allowExtensionDial, replaceMenuParams.allowExtensionDial) &&
        Objects.equals(this.keypressWaitTime, replaceMenuParams.keypressWaitTime) &&
        Objects.equals(this.timeoutHandler, replaceMenuParams.timeoutHandler) &&
        Objects.equals(this.options, replaceMenuParams.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, greeting, invalidKeypress, allowExtensionDial, keypressWaitTime, timeoutHandler, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceMenuParams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    greeting: ").append(toIndentedString(greeting)).append("\n");
    sb.append("    invalidKeypress: ").append(toIndentedString(invalidKeypress)).append("\n");
    sb.append("    allowExtensionDial: ").append(toIndentedString(allowExtensionDial)).append("\n");
    sb.append("    keypressWaitTime: ").append(toIndentedString(keypressWaitTime)).append("\n");
    sb.append("    timeoutHandler: ").append(toIndentedString(timeoutHandler)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

