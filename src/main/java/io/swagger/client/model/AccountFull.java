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
import io.swagger.client.model.AccountSummary;
import io.swagger.client.model.ContactAccount;

/**
 * The Full Account Object includes all of the properties in the Account Summary Object, along with the following:
 */
@ApiModel(description = "The Full Account Object includes all of the properties in the Account Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T15:20:10.092Z")
public class AccountFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("master_account")
  private AccountSummary masterAccount = null;

  @SerializedName("contact")
  private ContactAccount contact = null;

  @SerializedName("billing_contact")
  private ContactAccount billingContact = null;

  public AccountFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Account ID. Sometimes referred to as \"Voip ID\" or \"voip_id\".
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Account ID. Sometimes referred to as \"Voip ID\" or \"voip_id\".")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AccountFull name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name on the account. Read-only.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name on the account. Read-only.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountFull username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Account user name
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "Account user name")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AccountFull password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Account password. For security reason, this is masked as \"**\"
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "Account password. For security reason, this is masked as \"**\"")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AccountFull masterAccount(AccountSummary masterAccount) {
    this.masterAccount = masterAccount;
    return this;
  }

   /**
   * If this account is a subaccount, this property shows the master account that it belongs to. Otherwise it is NULL. Read-only. Output is an Account Summary Object.
   * @return masterAccount
  **/
  @ApiModelProperty(example = "null", value = "If this account is a subaccount, this property shows the master account that it belongs to. Otherwise it is NULL. Read-only. Output is an Account Summary Object.")
  public AccountSummary getMasterAccount() {
    return masterAccount;
  }

  public void setMasterAccount(AccountSummary masterAccount) {
    this.masterAccount = masterAccount;
  }

  public AccountFull contact(ContactAccount contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact Object. See below for details.
   * @return contact
  **/
  @ApiModelProperty(example = "null", value = "Contact Object. See below for details.")
  public ContactAccount getContact() {
    return contact;
  }

  public void setContact(ContactAccount contact) {
    this.contact = contact;
  }

  public AccountFull billingContact(ContactAccount billingContact) {
    this.billingContact = billingContact;
    return this;
  }

   /**
   * Contact Object for billing purposes. See below for details.
   * @return billingContact
  **/
  @ApiModelProperty(example = "null", value = "Contact Object for billing purposes. See below for details.")
  public ContactAccount getBillingContact() {
    return billingContact;
  }

  public void setBillingContact(ContactAccount billingContact) {
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
    AccountFull accountFull = (AccountFull) o;
    return Objects.equals(this.id, accountFull.id) &&
        Objects.equals(this.name, accountFull.name) &&
        Objects.equals(this.username, accountFull.username) &&
        Objects.equals(this.password, accountFull.password) &&
        Objects.equals(this.masterAccount, accountFull.masterAccount) &&
        Objects.equals(this.contact, accountFull.contact) &&
        Objects.equals(this.billingContact, accountFull.billingContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, username, password, masterAccount, contact, billingContact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    masterAccount: ").append(toIndentedString(masterAccount)).append("\n");
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

