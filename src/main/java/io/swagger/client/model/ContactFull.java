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
import io.swagger.client.model.Addresses;
import io.swagger.client.model.Emails;
import io.swagger.client.model.GroupListContacts;
import io.swagger.client.model.PhoneNumberContact;


/**
 * The Full Contact Object includes all of the properties in the Contact Summary Object, along with several more:
 */
@ApiModel(description = "The Full Contact Object includes all of the properties in the Contact Summary Object, along with several more:")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T13:11:20.199+02:00")
public class ContactFull   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("phonetic_first_name")
  private String phoneticFirstName = null;

  @SerializedName("phonetic_middle_name")
  private String phoneticMiddleName = null;

  @SerializedName("phonetic_last_name")
  private String phoneticLastName = null;

  @SerializedName("department")
  private String department = null;

  @SerializedName("job_title")
  private String jobTitle = null;

  @SerializedName("emails")
  private Emails emails = null;

  @SerializedName("phone_numbers")
  private PhoneNumberContact phoneNumbers = null;

  @SerializedName("addresses")
  private Addresses addresses = null;

  @SerializedName("group")
  private GroupListContacts group = null;

  @SerializedName("created_at")
  private Integer createdAt = null;

  @SerializedName("updated_at")
  private Integer updatedAt = null;

  public ContactFull id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Integer ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Integer ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ContactFull prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Salutation, such as Mr, Mrs, or Dr
   * @return prefix
  **/
  @ApiModelProperty(example = "null", value = "Salutation, such as Mr, Mrs, or Dr")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public ContactFull firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name or given name
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "First name or given name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ContactFull middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle or second name
   * @return middleName
  **/
  @ApiModelProperty(example = "null", value = "Middle or second name")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ContactFull lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name or surname
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Last name or surname")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ContactFull suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Suffix, such as \"Jr.\", \"Sr.\", \"II\", or \"III\"
   * @return suffix
  **/
  @ApiModelProperty(example = "null", value = "Suffix, such as \"Jr.\", \"Sr.\", \"II\", or \"III\"")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public ContactFull nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Nickname, or a shortened informal version of the contact's name
   * @return nickname
  **/
  @ApiModelProperty(example = "null", value = "Nickname, or a shortened informal version of the contact's name")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public ContactFull company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Name of the contact's company
   * @return company
  **/
  @ApiModelProperty(example = "null", value = "Name of the contact's company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public ContactFull phoneticFirstName(String phoneticFirstName) {
    this.phoneticFirstName = phoneticFirstName;
    return this;
  }

   /**
   * Phonetic first name. Useful for remembering how to pronounce the contact's name.
   * @return phoneticFirstName
  **/
  @ApiModelProperty(example = "null", value = "Phonetic first name. Useful for remembering how to pronounce the contact's name.")
  public String getPhoneticFirstName() {
    return phoneticFirstName;
  }

  public void setPhoneticFirstName(String phoneticFirstName) {
    this.phoneticFirstName = phoneticFirstName;
  }

  public ContactFull phoneticMiddleName(String phoneticMiddleName) {
    this.phoneticMiddleName = phoneticMiddleName;
    return this;
  }

   /**
   * Phonetic middle name. Useful for remembering how to pronounce the contact's name.
   * @return phoneticMiddleName
  **/
  @ApiModelProperty(example = "null", value = "Phonetic middle name. Useful for remembering how to pronounce the contact's name.")
  public String getPhoneticMiddleName() {
    return phoneticMiddleName;
  }

  public void setPhoneticMiddleName(String phoneticMiddleName) {
    this.phoneticMiddleName = phoneticMiddleName;
  }

  public ContactFull phoneticLastName(String phoneticLastName) {
    this.phoneticLastName = phoneticLastName;
    return this;
  }

   /**
   * Phonetic last name. Useful for remembering how to pronounce the contact's name.
   * @return phoneticLastName
  **/
  @ApiModelProperty(example = "null", value = "Phonetic last name. Useful for remembering how to pronounce the contact's name.")
  public String getPhoneticLastName() {
    return phoneticLastName;
  }

  public void setPhoneticLastName(String phoneticLastName) {
    this.phoneticLastName = phoneticLastName;
  }

  public ContactFull department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Name of the contact's department
   * @return department
  **/
  @ApiModelProperty(example = "null", value = "Name of the contact's department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public ContactFull jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Contact's job title
   * @return jobTitle
  **/
  @ApiModelProperty(example = "null", value = "Contact's job title")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public ContactFull emails(Emails emails) {
    this.emails = emails;
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(example = "null", value = "")
  public Emails getEmails() {
    return emails;
  }

  public void setEmails(Emails emails) {
    this.emails = emails;
  }

  public ContactFull phoneNumbers(PhoneNumberContact phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "")
  public PhoneNumberContact getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(PhoneNumberContact phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public ContactFull addresses(Addresses addresses) {
    this.addresses = addresses;
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "")
  public Addresses getAddresses() {
    return addresses;
  }

  public void setAddresses(Addresses addresses) {
    this.addresses = addresses;
  }

  public ContactFull group(GroupListContacts group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "")
  public GroupListContacts getGroup() {
    return group;
  }

  public void setGroup(GroupListContacts group) {
    this.group = group;
  }

  public ContactFull createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Integer UNIX timestamp when the contact was created. Read-only.
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "Integer UNIX timestamp when the contact was created. Read-only.")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public ContactFull updatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Integer UNIX timestamp when the contact was created. Read-only.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "Integer UNIX timestamp when the contact was created. Read-only.")
  public Integer getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Integer updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactFull contactFull = (ContactFull) o;
    return Objects.equals(this.id, contactFull.id) &&
        Objects.equals(this.prefix, contactFull.prefix) &&
        Objects.equals(this.firstName, contactFull.firstName) &&
        Objects.equals(this.middleName, contactFull.middleName) &&
        Objects.equals(this.lastName, contactFull.lastName) &&
        Objects.equals(this.suffix, contactFull.suffix) &&
        Objects.equals(this.nickname, contactFull.nickname) &&
        Objects.equals(this.company, contactFull.company) &&
        Objects.equals(this.phoneticFirstName, contactFull.phoneticFirstName) &&
        Objects.equals(this.phoneticMiddleName, contactFull.phoneticMiddleName) &&
        Objects.equals(this.phoneticLastName, contactFull.phoneticLastName) &&
        Objects.equals(this.department, contactFull.department) &&
        Objects.equals(this.jobTitle, contactFull.jobTitle) &&
        Objects.equals(this.emails, contactFull.emails) &&
        Objects.equals(this.phoneNumbers, contactFull.phoneNumbers) &&
        Objects.equals(this.addresses, contactFull.addresses) &&
        Objects.equals(this.group, contactFull.group) &&
        Objects.equals(this.createdAt, contactFull.createdAt) &&
        Objects.equals(this.updatedAt, contactFull.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, prefix, firstName, middleName, lastName, suffix, nickname, company, phoneticFirstName, phoneticMiddleName, phoneticLastName, department, jobTitle, emails, phoneNumbers, addresses, group, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    phoneticFirstName: ").append(toIndentedString(phoneticFirstName)).append("\n");
    sb.append("    phoneticMiddleName: ").append(toIndentedString(phoneticMiddleName)).append("\n");
    sb.append("    phoneticLastName: ").append(toIndentedString(phoneticLastName)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

