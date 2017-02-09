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
 * CreatePhoneNumberParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T09:08:03.715Z")
public class CreatePhoneNumberParams {
  @SerializedName("phone_number")
  private Object phoneNumber = null;

  @SerializedName("route")
  private Object route = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("block_incoming")
  private Boolean blockIncoming = null;

  @SerializedName("block_anonymous")
  private Boolean blockAnonymous = null;

  @SerializedName("caller_id[name]")
  private String callerIdName = null;

  @SerializedName("caller_id[type]")
  private String callerIdType = null;

  @SerializedName("sms_forwarding[type]")
  private String smsForwardingType = null;

  @SerializedName("sms_forwarding[application]")
  private Object smsForwardingApplication = null;

  @SerializedName("sms_forwarding[extension]")
  private Object smsForwardingExtension = null;

  @SerializedName("call_notifications[emails]")
  private List<String> callNotificationsEmails = new ArrayList<String>();

  @SerializedName("call_notifications[sms]")
  private String callNotificationsSms = null;

  public CreatePhoneNumberParams phoneNumber(Object phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "Phone number")
  public Object getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(Object phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CreatePhoneNumberParams route(Object route) {
    this.route = route;
    return this;
  }

   /**
   * Route lookup object
   * @return route
  **/
  @ApiModelProperty(example = "null", value = "Route lookup object")
  public Object getRoute() {
    return route;
  }

  public void setRoute(Object route) {
    this.route = route;
  }

  public CreatePhoneNumberParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Phone Name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Phone Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreatePhoneNumberParams blockIncoming(Boolean blockIncoming) {
    this.blockIncoming = blockIncoming;
    return this;
  }

   /**
   * Block incoming calls
   * @return blockIncoming
  **/
  @ApiModelProperty(example = "null", value = "Block incoming calls")
  public Boolean getBlockIncoming() {
    return blockIncoming;
  }

  public void setBlockIncoming(Boolean blockIncoming) {
    this.blockIncoming = blockIncoming;
  }

  public CreatePhoneNumberParams blockAnonymous(Boolean blockAnonymous) {
    this.blockAnonymous = blockAnonymous;
    return this;
  }

   /**
   * Block anonymous calls
   * @return blockAnonymous
  **/
  @ApiModelProperty(example = "null", value = "Block anonymous calls")
  public Boolean getBlockAnonymous() {
    return blockAnonymous;
  }

  public void setBlockAnonymous(Boolean blockAnonymous) {
    this.blockAnonymous = blockAnonymous;
  }

  public CreatePhoneNumberParams callerIdName(String callerIdName) {
    this.callerIdName = callerIdName;
    return this;
  }

   /**
   * Caller ID name
   * @return callerIdName
  **/
  @ApiModelProperty(example = "null", value = "Caller ID name")
  public String getCallerIdName() {
    return callerIdName;
  }

  public void setCallerIdName(String callerIdName) {
    this.callerIdName = callerIdName;
  }

  public CreatePhoneNumberParams callerIdType(String callerIdType) {
    this.callerIdType = callerIdType;
    return this;
  }

   /**
   * Caller ID type
   * @return callerIdType
  **/
  @ApiModelProperty(example = "null", value = "Caller ID type")
  public String getCallerIdType() {
    return callerIdType;
  }

  public void setCallerIdType(String callerIdType) {
    this.callerIdType = callerIdType;
  }

  public CreatePhoneNumberParams smsForwardingType(String smsForwardingType) {
    this.smsForwardingType = smsForwardingType;
    return this;
  }

   /**
   * 'application' or 'extension'
   * @return smsForwardingType
  **/
  @ApiModelProperty(example = "null", value = "'application' or 'extension'")
  public String getSmsForwardingType() {
    return smsForwardingType;
  }

  public void setSmsForwardingType(String smsForwardingType) {
    this.smsForwardingType = smsForwardingType;
  }

  public CreatePhoneNumberParams smsForwardingApplication(Object smsForwardingApplication) {
    this.smsForwardingApplication = smsForwardingApplication;
    return this;
  }

   /**
   * Application lookup object
   * @return smsForwardingApplication
  **/
  @ApiModelProperty(example = "null", value = "Application lookup object")
  public Object getSmsForwardingApplication() {
    return smsForwardingApplication;
  }

  public void setSmsForwardingApplication(Object smsForwardingApplication) {
    this.smsForwardingApplication = smsForwardingApplication;
  }

  public CreatePhoneNumberParams smsForwardingExtension(Object smsForwardingExtension) {
    this.smsForwardingExtension = smsForwardingExtension;
    return this;
  }

   /**
   * Extension lookup object
   * @return smsForwardingExtension
  **/
  @ApiModelProperty(example = "null", value = "Extension lookup object")
  public Object getSmsForwardingExtension() {
    return smsForwardingExtension;
  }

  public void setSmsForwardingExtension(Object smsForwardingExtension) {
    this.smsForwardingExtension = smsForwardingExtension;
  }

  public CreatePhoneNumberParams callNotificationsEmails(List<String> callNotificationsEmails) {
    this.callNotificationsEmails = callNotificationsEmails;
    return this;
  }

  public CreatePhoneNumberParams addCallNotificationsEmailsItem(String callNotificationsEmailsItem) {
    this.callNotificationsEmails.add(callNotificationsEmailsItem);
    return this;
  }

   /**
   * Call notifications for emails. Can be a single email or an array of emails
   * @return callNotificationsEmails
  **/
  @ApiModelProperty(example = "null", value = "Call notifications for emails. Can be a single email or an array of emails")
  public List<String> getCallNotificationsEmails() {
    return callNotificationsEmails;
  }

  public void setCallNotificationsEmails(List<String> callNotificationsEmails) {
    this.callNotificationsEmails = callNotificationsEmails;
  }

  public CreatePhoneNumberParams callNotificationsSms(String callNotificationsSms) {
    this.callNotificationsSms = callNotificationsSms;
    return this;
  }

   /**
   * Call notification for SMS
   * @return callNotificationsSms
  **/
  @ApiModelProperty(example = "null", value = "Call notification for SMS")
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
    CreatePhoneNumberParams createPhoneNumberParams = (CreatePhoneNumberParams) o;
    return Objects.equals(this.phoneNumber, createPhoneNumberParams.phoneNumber) &&
        Objects.equals(this.route, createPhoneNumberParams.route) &&
        Objects.equals(this.name, createPhoneNumberParams.name) &&
        Objects.equals(this.blockIncoming, createPhoneNumberParams.blockIncoming) &&
        Objects.equals(this.blockAnonymous, createPhoneNumberParams.blockAnonymous) &&
        Objects.equals(this.callerIdName, createPhoneNumberParams.callerIdName) &&
        Objects.equals(this.callerIdType, createPhoneNumberParams.callerIdType) &&
        Objects.equals(this.smsForwardingType, createPhoneNumberParams.smsForwardingType) &&
        Objects.equals(this.smsForwardingApplication, createPhoneNumberParams.smsForwardingApplication) &&
        Objects.equals(this.smsForwardingExtension, createPhoneNumberParams.smsForwardingExtension) &&
        Objects.equals(this.callNotificationsEmails, createPhoneNumberParams.callNotificationsEmails) &&
        Objects.equals(this.callNotificationsSms, createPhoneNumberParams.callNotificationsSms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, route, name, blockIncoming, blockAnonymous, callerIdName, callerIdType, smsForwardingType, smsForwardingApplication, smsForwardingExtension, callNotificationsEmails, callNotificationsSms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePhoneNumberParams {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    blockIncoming: ").append(toIndentedString(blockIncoming)).append("\n");
    sb.append("    blockAnonymous: ").append(toIndentedString(blockAnonymous)).append("\n");
    sb.append("    callerIdName: ").append(toIndentedString(callerIdName)).append("\n");
    sb.append("    callerIdType: ").append(toIndentedString(callerIdType)).append("\n");
    sb.append("    smsForwardingType: ").append(toIndentedString(smsForwardingType)).append("\n");
    sb.append("    smsForwardingApplication: ").append(toIndentedString(smsForwardingApplication)).append("\n");
    sb.append("    smsForwardingExtension: ").append(toIndentedString(smsForwardingExtension)).append("\n");
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

