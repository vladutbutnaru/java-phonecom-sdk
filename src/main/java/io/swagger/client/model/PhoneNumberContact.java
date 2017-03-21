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
 * PhoneNumberContact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T10:43:19.319+01:00")
public class PhoneNumberContact {
  @SerializedName("type")
  private String type = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("normalized")
  private String normalized = null;

  public PhoneNumberContact type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of phone number, must be one of: home, business, mobile, fax, pager. Default is home.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of phone number, must be one of: home, business, mobile, fax, pager. Default is home.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PhoneNumberContact number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Phone number, as entered. Does not need to be formatted in any particular way. Required.
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "Phone number, as entered. Does not need to be formatted in any particular way. Required.")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneNumberContact normalized(String normalized) {
    this.normalized = normalized;
    return this;
  }

   /**
   * Phone number in E.164 format. Read-only.
   * @return normalized
  **/
  @ApiModelProperty(example = "null", value = "Phone number in E.164 format. Read-only.")
  public String getNormalized() {
    return normalized;
  }

  public void setNormalized(String normalized) {
    this.normalized = normalized;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberContact phoneNumberContact = (PhoneNumberContact) o;
    return Objects.equals(this.type, phoneNumberContact.type) &&
        Objects.equals(this.number, phoneNumberContact.number) &&
        Objects.equals(this.normalized, phoneNumberContact.normalized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number, normalized);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberContact {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
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

