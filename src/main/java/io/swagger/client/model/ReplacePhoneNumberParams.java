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
 * ReplacePhoneNumberParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T10:43:19.319+01:00")
public class ReplacePhoneNumberParams {
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

  @SerializedName("pool_item")
  private Object poolItem = null;

  @SerializedName("call_notifications[emails]")
  private List<String> callNotificationsEmails = new ArrayList<String>();

  @SerializedName("call_notifications[sms]")
  private String callNotificationsSms = null;

  public ReplacePhoneNumberParams route(Object route) {
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

  public ReplacePhoneNumberParams name(String name) {
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

  public ReplacePhoneNumberParams blockIncoming(Boolean blockIncoming) {
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

  public ReplacePhoneNumberParams blockAnonymous(Boolean blockAnonymous) {
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

  public ReplacePhoneNumberParams callerIdName(String callerIdName) {
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

  public ReplacePhoneNumberParams callerIdType(String callerIdType) {
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

  public ReplacePhoneNumberParams smsForwardingType(String smsForwardingType) {
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

  public ReplacePhoneNumberParams smsForwardingApplication(Object smsForwardingApplication) {
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

  public ReplacePhoneNumberParams smsForwardingExtension(Object smsForwardingExtension) {
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

  public ReplacePhoneNumberParams poolItem(Object poolItem) {
    this.poolItem = poolItem;
    return this;
  }

   /**
   * Pool lookup object
   * @return poolItem
  **/
  @ApiModelProperty(example = "null", value = "Pool lookup object")
  public Object getPoolItem() {
    return poolItem;
  }

  public void setPoolItem(Object poolItem) {
    this.poolItem = poolItem;
  }

  public ReplacePhoneNumberParams callNotificationsEmails(List<String> callNotificationsEmails) {
    this.callNotificationsEmails = callNotificationsEmails;
    return this;
  }

  public ReplacePhoneNumberParams addCallNotificationsEmailsItem(String callNotificationsEmailsItem) {
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

  public ReplacePhoneNumberParams callNotificationsSms(String callNotificationsSms) {
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
    ReplacePhoneNumberParams replacePhoneNumberParams = (ReplacePhoneNumberParams) o;
    return Objects.equals(this.route, replacePhoneNumberParams.route) &&
        Objects.equals(this.name, replacePhoneNumberParams.name) &&
        Objects.equals(this.blockIncoming, replacePhoneNumberParams.blockIncoming) &&
        Objects.equals(this.blockAnonymous, replacePhoneNumberParams.blockAnonymous) &&
        Objects.equals(this.callerIdName, replacePhoneNumberParams.callerIdName) &&
        Objects.equals(this.callerIdType, replacePhoneNumberParams.callerIdType) &&
        Objects.equals(this.smsForwardingType, replacePhoneNumberParams.smsForwardingType) &&
        Objects.equals(this.smsForwardingApplication, replacePhoneNumberParams.smsForwardingApplication) &&
        Objects.equals(this.smsForwardingExtension, replacePhoneNumberParams.smsForwardingExtension) &&
        Objects.equals(this.poolItem, replacePhoneNumberParams.poolItem) &&
        Objects.equals(this.callNotificationsEmails, replacePhoneNumberParams.callNotificationsEmails) &&
        Objects.equals(this.callNotificationsSms, replacePhoneNumberParams.callNotificationsSms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(route, name, blockIncoming, blockAnonymous, callerIdName, callerIdType, smsForwardingType, smsForwardingApplication, smsForwardingExtension, poolItem, callNotificationsEmails, callNotificationsSms);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplacePhoneNumberParams {\n");
    
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    blockIncoming: ").append(toIndentedString(blockIncoming)).append("\n");
    sb.append("    blockAnonymous: ").append(toIndentedString(blockAnonymous)).append("\n");
    sb.append("    callerIdName: ").append(toIndentedString(callerIdName)).append("\n");
    sb.append("    callerIdType: ").append(toIndentedString(callerIdType)).append("\n");
    sb.append("    smsForwardingType: ").append(toIndentedString(smsForwardingType)).append("\n");
    sb.append("    smsForwardingApplication: ").append(toIndentedString(smsForwardingApplication)).append("\n");
    sb.append("    smsForwardingExtension: ").append(toIndentedString(smsForwardingExtension)).append("\n");
    sb.append("    poolItem: ").append(toIndentedString(poolItem)).append("\n");
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

