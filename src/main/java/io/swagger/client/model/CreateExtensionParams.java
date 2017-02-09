/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateExtensionParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T09:08:03.715Z")
public class CreateExtensionParams {
  @SerializedName("caller_id")
  private String callerId = null;

  @SerializedName("usage_type")
  private String usageType = null;

  @SerializedName("allows_call_waiting")
  private Boolean allowsCallWaiting = null;

  @SerializedName("extension")
  private Integer extension = null;

  @SerializedName("include_in_directory")
  private Boolean includeInDirectory = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("name_greeting")
  private Object nameGreeting = null;

  @SerializedName("voicemail[greeting][alternate]")
  private Object voicemailGreetingAlternate = null;

  @SerializedName("local_area_code")
  private Integer localAreaCode = null;

  @SerializedName("voicemail[greeting][enable_leave_message_prompt]")
  private Boolean voicemailGreetingEnableLeaveMessagePrompt = null;

  @SerializedName("voicemail[enabled]")
  private Boolean voicemailEnabled = null;

  @SerializedName("enable_outbound_calls")
  private Boolean enableOutboundCalls = null;

  @SerializedName("enable_call_waiting")
  private Boolean enableCallWaiting = null;

  @SerializedName("voicemail[password]")
  private Integer voicemailPassword = null;

  @SerializedName("voicemail[greeting][type]")
  private String voicemailGreetingType = null;

  @SerializedName("voicemail[greeting][standard]")
  private Object voicemailGreetingStandard = null;

  @SerializedName("voicemail[transcription]")
  private String voicemailTranscription = null;

  @SerializedName("voicemail[notifications][emails]")
  private List<String> voicemailNotificationsEmails = new ArrayList<String>();

  @SerializedName("voicemail[notifications][sms]")
  private String voicemailNotificationsSms = null;

  @SerializedName("call_notifications[emails]")
  private List<String> callNotificationsEmails = new ArrayList<String>();

  @SerializedName("call_notifications[sms]")
  private String callNotificationsSms = null;

  public CreateExtensionParams callerId(String callerId) {
    this.callerId = callerId;
    return this;
  }

   /**
   * Caller ID
   * @return callerId
  **/
  @ApiModelProperty(example = "null", value = "Caller ID")
  public String getCallerId() {
    return callerId;
  }

  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  public CreateExtensionParams usageType(String usageType) {
    this.usageType = usageType;
    return this;
  }

   /**
   * Extension type
   * @return usageType
  **/
  @ApiModelProperty(example = "null", value = "Extension type")
  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public CreateExtensionParams allowsCallWaiting(Boolean allowsCallWaiting) {
    this.allowsCallWaiting = allowsCallWaiting;
    return this;
  }

   /**
   * Allows call waiting
   * @return allowsCallWaiting
  **/
  @ApiModelProperty(example = "null", value = "Allows call waiting")
  public Boolean getAllowsCallWaiting() {
    return allowsCallWaiting;
  }

  public void setAllowsCallWaiting(Boolean allowsCallWaiting) {
    this.allowsCallWaiting = allowsCallWaiting;
  }

  public CreateExtensionParams extension(Integer extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension number (auto-generated if empty)
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Extension number (auto-generated if empty)")
  public Integer getExtension() {
    return extension;
  }

  public void setExtension(Integer extension) {
    this.extension = extension;
  }

  public CreateExtensionParams includeInDirectory(Boolean includeInDirectory) {
    this.includeInDirectory = includeInDirectory;
    return this;
  }

   /**
   * Include in dial-by-name directory
   * @return includeInDirectory
  **/
  @ApiModelProperty(example = "null", value = "Include in dial-by-name directory")
  public Boolean getIncludeInDirectory() {
    return includeInDirectory;
  }

  public void setIncludeInDirectory(Boolean includeInDirectory) {
    this.includeInDirectory = includeInDirectory;
  }

  public CreateExtensionParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name (auto-generated if empty)
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name (auto-generated if empty)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateExtensionParams fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Contact name
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "Contact name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CreateExtensionParams timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "Timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public CreateExtensionParams nameGreeting(Object nameGreeting) {
    this.nameGreeting = nameGreeting;
    return this;
  }

   /**
   * Recording lookup object
   * @return nameGreeting
  **/
  @ApiModelProperty(example = "null", value = "Recording lookup object")
  public Object getNameGreeting() {
    return nameGreeting;
  }

  public void setNameGreeting(Object nameGreeting) {
    this.nameGreeting = nameGreeting;
  }

  public CreateExtensionParams voicemailGreetingAlternate(Object voicemailGreetingAlternate) {
    this.voicemailGreetingAlternate = voicemailGreetingAlternate;
    return this;
  }

   /**
   * Recording lookup object
   * @return voicemailGreetingAlternate
  **/
  @ApiModelProperty(example = "null", value = "Recording lookup object")
  public Object getVoicemailGreetingAlternate() {
    return voicemailGreetingAlternate;
  }

  public void setVoicemailGreetingAlternate(Object voicemailGreetingAlternate) {
    this.voicemailGreetingAlternate = voicemailGreetingAlternate;
  }

  public CreateExtensionParams localAreaCode(Integer localAreaCode) {
    this.localAreaCode = localAreaCode;
    return this;
  }

   /**
   * Local area code
   * @return localAreaCode
  **/
  @ApiModelProperty(example = "null", value = "Local area code")
  public Integer getLocalAreaCode() {
    return localAreaCode;
  }

  public void setLocalAreaCode(Integer localAreaCode) {
    this.localAreaCode = localAreaCode;
  }

  public CreateExtensionParams voicemailGreetingEnableLeaveMessagePrompt(Boolean voicemailGreetingEnableLeaveMessagePrompt) {
    this.voicemailGreetingEnableLeaveMessagePrompt = voicemailGreetingEnableLeaveMessagePrompt;
    return this;
  }

   /**
   * Enable the \"leave a message\" prompt for voicemail
   * @return voicemailGreetingEnableLeaveMessagePrompt
  **/
  @ApiModelProperty(example = "null", value = "Enable the \"leave a message\" prompt for voicemail")
  public Boolean getVoicemailGreetingEnableLeaveMessagePrompt() {
    return voicemailGreetingEnableLeaveMessagePrompt;
  }

  public void setVoicemailGreetingEnableLeaveMessagePrompt(Boolean voicemailGreetingEnableLeaveMessagePrompt) {
    this.voicemailGreetingEnableLeaveMessagePrompt = voicemailGreetingEnableLeaveMessagePrompt;
  }

  public CreateExtensionParams voicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
    return this;
  }

   /**
   * Voicemail enabled
   * @return voicemailEnabled
  **/
  @ApiModelProperty(example = "null", value = "Voicemail enabled")
  public Boolean getVoicemailEnabled() {
    return voicemailEnabled;
  }

  public void setVoicemailEnabled(Boolean voicemailEnabled) {
    this.voicemailEnabled = voicemailEnabled;
  }

  public CreateExtensionParams enableOutboundCalls(Boolean enableOutboundCalls) {
    this.enableOutboundCalls = enableOutboundCalls;
    return this;
  }

   /**
   * Enable outgoing calls
   * @return enableOutboundCalls
  **/
  @ApiModelProperty(example = "null", value = "Enable outgoing calls")
  public Boolean getEnableOutboundCalls() {
    return enableOutboundCalls;
  }

  public void setEnableOutboundCalls(Boolean enableOutboundCalls) {
    this.enableOutboundCalls = enableOutboundCalls;
  }

  public CreateExtensionParams enableCallWaiting(Boolean enableCallWaiting) {
    this.enableCallWaiting = enableCallWaiting;
    return this;
  }

   /**
   * Enable Call Waiting
   * @return enableCallWaiting
  **/
  @ApiModelProperty(example = "null", value = "Enable Call Waiting")
  public Boolean getEnableCallWaiting() {
    return enableCallWaiting;
  }

  public void setEnableCallWaiting(Boolean enableCallWaiting) {
    this.enableCallWaiting = enableCallWaiting;
  }

  public CreateExtensionParams voicemailPassword(Integer voicemailPassword) {
    this.voicemailPassword = voicemailPassword;
    return this;
  }

   /**
   * Voicemail password
   * @return voicemailPassword
  **/
  @ApiModelProperty(example = "null", value = "Voicemail password")
  public Integer getVoicemailPassword() {
    return voicemailPassword;
  }

  public void setVoicemailPassword(Integer voicemailPassword) {
    this.voicemailPassword = voicemailPassword;
  }

  public CreateExtensionParams voicemailGreetingType(String voicemailGreetingType) {
    this.voicemailGreetingType = voicemailGreetingType;
    return this;
  }

   /**
   * Voicemail greeting type
   * @return voicemailGreetingType
  **/
  @ApiModelProperty(example = "null", value = "Voicemail greeting type")
  public String getVoicemailGreetingType() {
    return voicemailGreetingType;
  }

  public void setVoicemailGreetingType(String voicemailGreetingType) {
    this.voicemailGreetingType = voicemailGreetingType;
  }

  public CreateExtensionParams voicemailGreetingStandard(Object voicemailGreetingStandard) {
    this.voicemailGreetingStandard = voicemailGreetingStandard;
    return this;
  }

   /**
   * Recording lookup object
   * @return voicemailGreetingStandard
  **/
  @ApiModelProperty(example = "null", value = "Recording lookup object")
  public Object getVoicemailGreetingStandard() {
    return voicemailGreetingStandard;
  }

  public void setVoicemailGreetingStandard(Object voicemailGreetingStandard) {
    this.voicemailGreetingStandard = voicemailGreetingStandard;
  }

  public CreateExtensionParams voicemailTranscription(String voicemailTranscription) {
    this.voicemailTranscription = voicemailTranscription;
    return this;
  }

   /**
   * Voicemail transcription type
   * @return voicemailTranscription
  **/
  @ApiModelProperty(example = "null", value = "Voicemail transcription type")
  public String getVoicemailTranscription() {
    return voicemailTranscription;
  }

  public void setVoicemailTranscription(String voicemailTranscription) {
    this.voicemailTranscription = voicemailTranscription;
  }

  public CreateExtensionParams voicemailNotificationsEmails(List<String> voicemailNotificationsEmails) {
    this.voicemailNotificationsEmails = voicemailNotificationsEmails;
    return this;
  }

  public CreateExtensionParams addVoicemailNotificationsEmailsItem(String voicemailNotificationsEmailsItem) {
    this.voicemailNotificationsEmails.add(voicemailNotificationsEmailsItem);
    return this;
  }

   /**
   * Email notifications for voicemails. Can be a single email or an array of emails
   * @return voicemailNotificationsEmails
  **/
  @ApiModelProperty(example = "null", value = "Email notifications for voicemails. Can be a single email or an array of emails")
  public List<String> getVoicemailNotificationsEmails() {
    return voicemailNotificationsEmails;
  }

  public void setVoicemailNotificationsEmails(List<String> voicemailNotificationsEmails) {
    this.voicemailNotificationsEmails = voicemailNotificationsEmails;
  }

  public CreateExtensionParams voicemailNotificationsSms(String voicemailNotificationsSms) {
    this.voicemailNotificationsSms = voicemailNotificationsSms;
    return this;
  }

   /**
   * SMS notifications for voicemails
   * @return voicemailNotificationsSms
  **/
  @ApiModelProperty(example = "null", value = "SMS notifications for voicemails")
  public String getVoicemailNotificationsSms() {
    return voicemailNotificationsSms;
  }

  public void setVoicemailNotificationsSms(String voicemailNotificationsSms) {
    this.voicemailNotificationsSms = voicemailNotificationsSms;
  }

  public CreateExtensionParams callNotificationsEmails(List<String> callNotificationsEmails) {
    this.callNotificationsEmails = callNotificationsEmails;
    return this;
  }

  public CreateExtensionParams addCallNotificationsEmailsItem(String callNotificationsEmailsItem) {
    this.callNotificationsEmails.add(callNotificationsEmailsItem);
    return this;
  }

   /**
   * Email notifications for calls. Can be a single email or an array of emails
   * @return callNotificationsEmails
  **/
  @ApiModelProperty(example = "null", value = "Email notifications for calls. Can be a single email or an array of emails")
  public List<String> getCallNotificationsEmails() {
    return callNotificationsEmails;
  }

  public void setCallNotificationsEmails(List<String> callNotificationsEmails) {
    this.callNotificationsEmails = callNotificationsEmails;
  }

  public CreateExtensionParams callNotificationsSms(String callNotificationsSms) {
    this.callNotificationsSms = callNotificationsSms;
    return this;
  }

   /**
   * SMS notifications for calls
   * @return callNotificationsSms
  **/
  @ApiModelProperty(example = "null", value = "SMS notifications for calls")
  public String getCallNotificationsSms() {
    return callNotificationsSms;
  }

  public void setCallNotificationsSms(String callNotificationsSms) {
    this.callNotificationsSms = callNotificationsSms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExtensionParams createExtensionParams = (CreateExtensionParams) o;
    return Objects.equals(this.callerId, createExtensionParams.callerId) &&
        Objects.equals(this.usageType, createExtensionParams.usageType) &&
        Objects.equals(this.allowsCallWaiting, createExtensionParams.allowsCallWaiting) &&
        Objects.equals(this.extension, createExtensionParams.extension) &&
        Objects.equals(this.includeInDirectory, createExtensionParams.includeInDirectory) &&
        Objects.equals(this.name, createExtensionParams.name) &&
        Objects.equals(this.fullName, createExtensionParams.fullName) &&
        Objects.equals(this.timezone, createExtensionParams.timezone) &&
        Objects.equals(this.nameGreeting, createExtensionParams.nameGreeting) &&
        Objects.equals(this.voicemailGreetingAlternate, createExtensionParams.voicemailGreetingAlternate) &&
        Objects.equals(this.localAreaCode, createExtensionParams.localAreaCode) &&
        Objects.equals(this.voicemailGreetingEnableLeaveMessagePrompt, createExtensionParams.voicemailGreetingEnableLeaveMessagePrompt) &&
        Objects.equals(this.voicemailEnabled, createExtensionParams.voicemailEnabled) &&
        Objects.equals(this.enableOutboundCalls, createExtensionParams.enableOutboundCalls) &&
        Objects.equals(this.enableCallWaiting, createExtensionParams.enableCallWaiting) &&
        Objects.equals(this.voicemailPassword, createExtensionParams.voicemailPassword) &&
        Objects.equals(this.voicemailGreetingType, createExtensionParams.voicemailGreetingType) &&
        Objects.equals(this.voicemailGreetingStandard, createExtensionParams.voicemailGreetingStandard) &&
        Objects.equals(this.voicemailTranscription, createExtensionParams.voicemailTranscription) &&
        Objects.equals(this.voicemailNotificationsEmails, createExtensionParams.voicemailNotificationsEmails) &&
        Objects.equals(this.voicemailNotificationsSms, createExtensionParams.voicemailNotificationsSms) &&
        Objects.equals(this.callNotificationsEmails, createExtensionParams.callNotificationsEmails) &&
        Objects.equals(this.callNotificationsSms, createExtensionParams.callNotificationsSms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callerId, usageType, allowsCallWaiting, extension, includeInDirectory, name, fullName, timezone, nameGreeting, voicemailGreetingAlternate, localAreaCode, voicemailGreetingEnableLeaveMessagePrompt, voicemailEnabled, enableOutboundCalls, enableCallWaiting, voicemailPassword, voicemailGreetingType, voicemailGreetingStandard, voicemailTranscription, voicemailNotificationsEmails, voicemailNotificationsSms, callNotificationsEmails, callNotificationsSms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExtensionParams {\n");
    
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    allowsCallWaiting: ").append(toIndentedString(allowsCallWaiting)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    includeInDirectory: ").append(toIndentedString(includeInDirectory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    nameGreeting: ").append(toIndentedString(nameGreeting)).append("\n");
    sb.append("    voicemailGreetingAlternate: ").append(toIndentedString(voicemailGreetingAlternate)).append("\n");
    sb.append("    localAreaCode: ").append(toIndentedString(localAreaCode)).append("\n");
    sb.append("    voicemailGreetingEnableLeaveMessagePrompt: ").append(toIndentedString(voicemailGreetingEnableLeaveMessagePrompt)).append("\n");
    sb.append("    voicemailEnabled: ").append(toIndentedString(voicemailEnabled)).append("\n");
    sb.append("    enableOutboundCalls: ").append(toIndentedString(enableOutboundCalls)).append("\n");
    sb.append("    enableCallWaiting: ").append(toIndentedString(enableCallWaiting)).append("\n");
    sb.append("    voicemailPassword: ").append(toIndentedString(voicemailPassword)).append("\n");
    sb.append("    voicemailGreetingType: ").append(toIndentedString(voicemailGreetingType)).append("\n");
    sb.append("    voicemailGreetingStandard: ").append(toIndentedString(voicemailGreetingStandard)).append("\n");
    sb.append("    voicemailTranscription: ").append(toIndentedString(voicemailTranscription)).append("\n");
    sb.append("    voicemailNotificationsEmails: ").append(toIndentedString(voicemailNotificationsEmails)).append("\n");
    sb.append("    voicemailNotificationsSms: ").append(toIndentedString(voicemailNotificationsSms)).append("\n");
    sb.append("    callNotificationsEmails: ").append(toIndentedString(callNotificationsEmails)).append("\n");
    sb.append("    callNotificationsSms: ").append(toIndentedString(callNotificationsSms)).append("\n");
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

