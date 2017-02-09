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

/**
 * The Phone Number Summary Object is used to briefly represent a phone number that is registered to your Phone.com account. Here are the properties:
 */
@ApiModel(description = "The Phone Number Summary Object is used to briefly represent a phone number that is registered to your Phone.com account. Here are the properties:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T09:08:03.715Z")
public class PhoneNumberSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  public PhoneNumberSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Integer Phone number ID. This is the internal Phone.com ID for this number, not the phone number itself. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Integer Phone number ID. This is the internal Phone.com ID for this number, not the phone number itself. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PhoneNumberSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PhoneNumberSummary phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number, in E.164 format
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "Phone number, in E.164 format")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberSummary phoneNumberSummary = (PhoneNumberSummary) o;
    return Objects.equals(this.id, phoneNumberSummary.id) &&
        Objects.equals(this.name, phoneNumberSummary.name) &&
        Objects.equals(this.phoneNumber, phoneNumberSummary.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

