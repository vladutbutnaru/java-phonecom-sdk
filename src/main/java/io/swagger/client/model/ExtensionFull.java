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
import io.swagger.client.model.DeviceMembership;
import io.swagger.client.model.MediaSummary;
import io.swagger.client.model.Notification;
import io.swagger.client.model.RouteSummary;
import io.swagger.client.model.Voicemail;

/**
 * The Full Extension Object has the same properties as the Extension Summary Object, along with the following:
 */
@ApiModel(description = "The Full Extension Object has the same properties as the Extension Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T15:20:10.092Z")
public class ExtensionFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("extension")
  private Integer extension = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("usage_type")
  private String usageType = null;

  @SerializedName("device_membership")
  private DeviceMembership deviceMembership = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("name_greeting")
  private MediaSummary nameGreeting = null;

  @SerializedName("include_in_directory")
  private Boolean includeInDirectory = null;

  @SerializedName("caller_id")
  private String callerId = null;

  @SerializedName("local_area_code")
  private String localAreaCode = null;

  @SerializedName("enable_call_waiting")
  private Boolean enableCallWaiting = null;

  @SerializedName("enable_outbound_calls")
  private Boolean enableOutboundCalls = null;

  @SerializedName("voicemail")
  private Voicemail voicemail = null;

  @SerializedName("call_notifications")
  private Notification callNotifications = null;

  @SerializedName("route")
  private RouteSummary route = null;

  public ExtensionFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the extension. This is the internal Phone.com ID, not the extension number callers may dial.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ExtensionFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "User-supplied name for the extension. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExtensionFull extension(Integer extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.
   * @return extension
  **/
  @ApiModelProperty(example = "null", required = true, value = "Extension number that callers may dial. On POST, leaving this empty will result in an auto-generated value. On PUT, this field is required.")
  public Integer getExtension() {
    return extension;
  }

  public void setExtension(Integer extension) {
    this.extension = extension;
  }

  public ExtensionFull fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of the individual or department to which this extension is assigned
   * @return fullName
  **/
  @ApiModelProperty(example = "null", required = true, value = "Full name of the individual or department to which this extension is assigned")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public ExtensionFull usageType(String usageType) {
    this.usageType = usageType;
    return this;
  }

   /**
   * Can be \"limited\" or \"unlimited\". In most cases, changing this will affect your monthly bill. Please see our Control Panel or contact Customer Service for pricing.
   * @return usageType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Can be \"limited\" or \"unlimited\". In most cases, changing this will affect your monthly bill. Please see our Control Panel or contact Customer Service for pricing.")
  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public ExtensionFull deviceMembership(DeviceMembership deviceMembership) {
    this.deviceMembership = deviceMembership;
    return this;
  }

   /**
   * Get deviceMembership
   * @return deviceMembership
  **/
  @ApiModelProperty(example = "null", value = "")
  public DeviceMembership getDeviceMembership() {
    return deviceMembership;
  }

  public void setDeviceMembership(DeviceMembership deviceMembership) {
    this.deviceMembership = deviceMembership;
  }

  public ExtensionFull timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time zone. Can be in any commonly recognized format, such as \"America/Los_Angeles\".
   * @return timezone
  **/
  @ApiModelProperty(example = "null", required = true, value = "Time zone. Can be in any commonly recognized format, such as \"America/Los_Angeles\".")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ExtensionFull nameGreeting(MediaSummary nameGreeting) {
    this.nameGreeting = nameGreeting;
    return this;
  }

   /**
   * Greeting that communicates the extension's name. Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.
   * @return nameGreeting
  **/
  @ApiModelProperty(example = "null", required = true, value = "Greeting that communicates the extension's name. Output is a Greeting Summary Object. Input must be a Greeting Lookup Object.")
  public MediaSummary getNameGreeting() {
    return nameGreeting;
  }

  public void setNameGreeting(MediaSummary nameGreeting) {
    this.nameGreeting = nameGreeting;
  }

  public ExtensionFull includeInDirectory(Boolean includeInDirectory) {
    this.includeInDirectory = includeInDirectory;
    return this;
  }

   /**
   * Whether this extension should be included in the dial-by-name directory for this account. Boolean.
   * @return includeInDirectory
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether this extension should be included in the dial-by-name directory for this account. Boolean.")
  public Boolean getIncludeInDirectory() {
    return includeInDirectory;
  }

  public void setIncludeInDirectory(Boolean includeInDirectory) {
    this.includeInDirectory = includeInDirectory;
  }

  public ExtensionFull callerId(String callerId) {
    this.callerId = callerId;
    return this;
  }

   /**
   * Phone number to use as Caller ID for outgoing calls. Must be a phone number belonging to this account, or one of any additional authorized phone numbers. You can use our List Caller Ids service to see a current list. To unassign, you may set this to \"private\", NULL, or an empty string.
   * @return callerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Phone number to use as Caller ID for outgoing calls. Must be a phone number belonging to this account, or one of any additional authorized phone numbers. You can use our List Caller Ids service to see a current list. To unassign, you may set this to \"private\", NULL, or an empty string.")
  public String getCallerId() {
    return callerId;
  }

  public void setCallerId(String callerId) {
    this.callerId = callerId;
  }

  public ExtensionFull localAreaCode(String localAreaCode) {
    this.localAreaCode = localAreaCode;
    return this;
  }

   /**
   * For outbound calls, this is the North American area code that this extension is calling from.
   * @return localAreaCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "For outbound calls, this is the North American area code that this extension is calling from.")
  public String getLocalAreaCode() {
    return localAreaCode;
  }

  public void setLocalAreaCode(String localAreaCode) {
    this.localAreaCode = localAreaCode;
  }

  public ExtensionFull enableCallWaiting(Boolean enableCallWaiting) {
    this.enableCallWaiting = enableCallWaiting;
    return this;
  }

   /**
   * Whether Call Waiting is enabled. Boolean. Default is TRUE.
   * @return enableCallWaiting
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether Call Waiting is enabled. Boolean. Default is TRUE.")
  public Boolean getEnableCallWaiting() {
    return enableCallWaiting;
  }

  public void setEnableCallWaiting(Boolean enableCallWaiting) {
    this.enableCallWaiting = enableCallWaiting;
  }

  public ExtensionFull enableOutboundCalls(Boolean enableOutboundCalls) {
    this.enableOutboundCalls = enableOutboundCalls;
    return this;
  }

   /**
   * Whether outgoing calls are enabled. Boolean. Default is TRUE.
   * @return enableOutboundCalls
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether outgoing calls are enabled. Boolean. Default is TRUE.")
  public Boolean getEnableOutboundCalls() {
    return enableOutboundCalls;
  }

  public void setEnableOutboundCalls(Boolean enableOutboundCalls) {
    this.enableOutboundCalls = enableOutboundCalls;
  }

  public ExtensionFull voicemail(Voicemail voicemail) {
    this.voicemail = voicemail;
    return this;
  }

   /**
   * Get voicemail
   * @return voicemail
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Voicemail getVoicemail() {
    return voicemail;
  }

  public void setVoicemail(Voicemail voicemail) {
    this.voicemail = voicemail;
  }

  public ExtensionFull callNotifications(Notification callNotifications) {
    this.callNotifications = callNotifications;
    return this;
  }

   /**
   * Call Notifications Object. See below for details.
   * @return callNotifications
  **/
  @ApiModelProperty(example = "null", required = true, value = "Call Notifications Object. See below for details.")
  public Notification getCallNotifications() {
    return callNotifications;
  }

  public void setCallNotifications(Notification callNotifications) {
    this.callNotifications = callNotifications;
  }

  public ExtensionFull route(RouteSummary route) {
    this.route = route;
    return this;
  }

   /**
   * Route which will handle incoming voice and fax calls. Only valid on PUT requests, not POST. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route. Route must belong to this extension already.
   * @return route
  **/
  @ApiModelProperty(example = "null", value = "Route which will handle incoming voice and fax calls. Only valid on PUT requests, not POST. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route. Route must belong to this extension already.")
  public RouteSummary getRoute() {
    return route;
  }

  public void setRoute(RouteSummary route) {
    this.route = route;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionFull extensionFull = (ExtensionFull) o;
    return Objects.equals(this.id, extensionFull.id) &&
        Objects.equals(this.name, extensionFull.name) &&
        Objects.equals(this.extension, extensionFull.extension) &&
        Objects.equals(this.fullName, extensionFull.fullName) &&
        Objects.equals(this.usageType, extensionFull.usageType) &&
        Objects.equals(this.deviceMembership, extensionFull.deviceMembership) &&
        Objects.equals(this.timezone, extensionFull.timezone) &&
        Objects.equals(this.nameGreeting, extensionFull.nameGreeting) &&
        Objects.equals(this.includeInDirectory, extensionFull.includeInDirectory) &&
        Objects.equals(this.callerId, extensionFull.callerId) &&
        Objects.equals(this.localAreaCode, extensionFull.localAreaCode) &&
        Objects.equals(this.enableCallWaiting, extensionFull.enableCallWaiting) &&
        Objects.equals(this.enableOutboundCalls, extensionFull.enableOutboundCalls) &&
        Objects.equals(this.voicemail, extensionFull.voicemail) &&
        Objects.equals(this.callNotifications, extensionFull.callNotifications) &&
        Objects.equals(this.route, extensionFull.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, extension, fullName, usageType, deviceMembership, timezone, nameGreeting, includeInDirectory, callerId, localAreaCode, enableCallWaiting, enableOutboundCalls, voicemail, callNotifications, route);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    deviceMembership: ").append(toIndentedString(deviceMembership)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    nameGreeting: ").append(toIndentedString(nameGreeting)).append("\n");
    sb.append("    includeInDirectory: ").append(toIndentedString(includeInDirectory)).append("\n");
    sb.append("    callerId: ").append(toIndentedString(callerId)).append("\n");
    sb.append("    localAreaCode: ").append(toIndentedString(localAreaCode)).append("\n");
    sb.append("    enableCallWaiting: ").append(toIndentedString(enableCallWaiting)).append("\n");
    sb.append("    enableOutboundCalls: ").append(toIndentedString(enableOutboundCalls)).append("\n");
    sb.append("    voicemail: ").append(toIndentedString(voicemail)).append("\n");
    sb.append("    callNotifications: ").append(toIndentedString(callNotifications)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

