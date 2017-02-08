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
import io.swagger.client.model.ExtensionSummary;


/**
 * Array of Forward Item Objects. See below for details. Required.
 */
@ApiModel(description = "Array of Forward Item Objects. See below for details. Required.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T13:11:20.199+02:00")
public class RuleSetForwardItem   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("extension")
  private ExtensionSummary extension = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("screening")
  private Boolean screening = false;

  @SerializedName("caller_id")
  private String callerId = "calling_number";

  @SerializedName("voice_tag")
  private String voiceTag = null;

  @SerializedName("distinctive_ring")
  private String distinctiveRing = null;

  public RuleSetForwardItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Required. Must equal phone_number or extension.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Required. Must equal phone_number or extension.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RuleSetForwardItem extension(ExtensionSummary extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Required if type = \"extension\". Extension that callers should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Required if type = \"extension\". Extension that callers should be directed to. Output is an Extension Summary Object. Input must be an Extension Lookup Object.")
  public ExtensionSummary getExtension() {
    return extension;
  }

  public void setExtension(ExtensionSummary extension) {
    this.extension = extension;
  }

  public RuleSetForwardItem number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Required if type = \"phone_number\". Phone number that callers should be directed to. Must be a string in E.164 format.
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "Required if type = \"phone_number\". Phone number that callers should be directed to. Must be a string in E.164 format.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public RuleSetForwardItem screening(Boolean screening) {
    this.screening = screening;
    return this;
  }

   /**
   * Boolean. Optional. Default is FALSE. Use this to activate call screening. If TRUE, the timeout on the parent action should be at least 30 seconds.
   * @return screening
  **/
  @ApiModelProperty(example = "null", value = "Boolean. Optional. Default is FALSE. Use this to activate call screening. If TRUE, the timeout on the parent action should be at least 30 seconds.")
  public Boolean getScreening() {
    return screening;
  }

  public void setScreening(Boolean screening) {
    this.screening = screening;
  }

  public RuleSetForwardItem callerId(String callerId) {
    this.callerId = callerId;
    return this;
  }

   /**
   * Optional. Must equal calling_number or called_number. Defines which phone number should be used for Caller ID. Default is calling_number.
   * @return callerId
  **/
  @ApiModelProperty(example = "null", value = "Optional. Must equal calling_number or called_number. Defines which phone number should be used for Caller ID. Default is calling_number.")
  public String getCallerId() {
    return callerId;
  }

  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  public RuleSetForwardItem voiceTag(String voiceTag) {
    this.voiceTag = voiceTag;
    return this;
  }

   /**
   * Optional string. If screening = TRUE, this value will be passed into our Text-To-Speech engine and used to inform the caller of who they have reached.
   * @return voiceTag
  **/
  @ApiModelProperty(example = "null", value = "Optional string. If screening = TRUE, this value will be passed into our Text-To-Speech engine and used to inform the caller of who they have reached.")
  public String getVoiceTag() {
    return voiceTag;
  }

  public void setVoiceTag(String voiceTag) {
    this.voiceTag = voiceTag;
  }

  public RuleSetForwardItem distinctiveRing(String distinctiveRing) {
    this.distinctiveRing = distinctiveRing;
    return this;
  }

   /**
   * Optional. Must equal one of: DEFAULT, STYLE_2, STYLE_3, STYLE_4, STYLE_5, STYLE_6, STYLE_7, STYLE_8, or STYLE_9. Identifies the style of ring tone you will hear when an incoming call is waiting.
   * @return distinctiveRing
  **/
  @ApiModelProperty(example = "null", value = "Optional. Must equal one of: DEFAULT, STYLE_2, STYLE_3, STYLE_4, STYLE_5, STYLE_6, STYLE_7, STYLE_8, or STYLE_9. Identifies the style of ring tone you will hear when an incoming call is waiting.")
  public String getDistinctiveRing() {
    return distinctiveRing;
  }

  public void setDistinctiveRing(String distinctiveRing) {
    this.distinctiveRing = distinctiveRing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSetForwardItem ruleSetForwardItem = (RuleSetForwardItem) o;
    return Objects.equals(this.type, ruleSetForwardItem.type) &&
        Objects.equals(this.extension, ruleSetForwardItem.extension) &&
        Objects.equals(this.number, ruleSetForwardItem.number) &&
        Objects.equals(this.screening, ruleSetForwardItem.screening) &&
        Objects.equals(this.callerId, ruleSetForwardItem.callerId) &&
        Objects.equals(this.voiceTag, ruleSetForwardItem.voiceTag) &&
        Objects.equals(this.distinctiveRing, ruleSetForwardItem.distinctiveRing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, extension, number, screening, callerId, voiceTag, distinctiveRing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetForwardItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    screening: ").append(toIndentedString(screening)).append("\n");
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    voiceTag: ").append(toIndentedString(voiceTag)).append("\n");
    sb.append("    distinctiveRing: ").append(toIndentedString(distinctiveRing)).append("\n");
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

