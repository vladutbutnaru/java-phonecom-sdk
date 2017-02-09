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
import io.swagger.client.model.ContactSubaccount;

/**
 * CreateSubaccountParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T09:08:03.715Z")
public class CreateSubaccountParams {
  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("contact")
  private ContactSubaccount contact = null;

  @SerializedName("billing_contact")
  private ContactSubaccount billingContact = null;

  public CreateSubaccountParams username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Sub account user name
   * @return username
  **/
  @ApiModelProperty(example = "null", required = true, value = "Sub account user name")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CreateSubaccountParams password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Sub account password
   * @return password
  **/
  @ApiModelProperty(example = "null", required = true, value = "Sub account password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateSubaccountParams contact(ContactSubaccount contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact Object. See below for details.
   * @return contact
  **/
  @ApiModelProperty(example = "null", value = "Contact Object. See below for details.")
  public ContactSubaccount getContact() {
    return contact;
  }

  public void setContact(ContactSubaccount contact) {
    this.contact = contact;
  }

  public CreateSubaccountParams billingContact(ContactSubaccount billingContact) {
    this.billingContact = billingContact;
    return this;
  }

   /**
   * Contact Object for billing purposes. See below for details.
   * @return billingContact
  **/
  @ApiModelProperty(example = "null", value = "Contact Object for billing purposes. See below for details.")
  public ContactSubaccount getBillingContact() {
    return billingContact;
  }

  public void setBillingContact(ContactSubaccount billingContact) {
    this.billingContact = billingContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubaccountParams createSubaccountParams = (CreateSubaccountParams) o;
    return Objects.equals(this.username, createSubaccountParams.username) &&
        Objects.equals(this.password, createSubaccountParams.password) &&
        Objects.equals(this.contact, createSubaccountParams.contact) &&
        Objects.equals(this.billingContact, createSubaccountParams.billingContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, contact, billingContact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubaccountParams {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
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

