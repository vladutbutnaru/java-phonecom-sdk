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
 * The Region Object may include any of several fields describing the group, as well as the quantity of phone numbers available in that group. Here are the properties:
 */
@ApiModel(description = "The Region Object may include any of several fields describing the group, as well as the quantity of phone numbers available in that group. Here are the properties:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T10:43:19.319+01:00")
public class PhoneNumbersRegionFull {
  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("npa")
  private Integer npa = null;

  @SerializedName("nxx")
  private Integer nxx = null;

  @SerializedName("is_toll_free")
  private Integer isTollFree = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("province_postal_code")
  private String provincePostalCode = null;

  @SerializedName("country_postal_code")
  private String countryPostalCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public PhoneNumbersRegionFull countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Optional. Integer representing the international calling code for the phone number's country.
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "Optional. Integer representing the international calling code for the phone number's country.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public PhoneNumbersRegionFull npa(Integer npa) {
    this.npa = npa;
    return this;
  }

   /**
   * Optional. Area Code, for North American phone numbers.
   * @return npa
  **/
  @ApiModelProperty(example = "null", value = "Optional. Area Code, for North American phone numbers.")
  public Integer getNpa() {
    return npa;
  }

  public void setNpa(Integer npa) {
    this.npa = npa;
  }

  public PhoneNumbersRegionFull nxx(Integer nxx) {
    this.nxx = nxx;
    return this;
  }

   /**
   * Optional. Second set of 3 digits, for North American phone numbers.
   * @return nxx
  **/
  @ApiModelProperty(example = "null", value = "Optional. Second set of 3 digits, for North American phone numbers.")
  public Integer getNxx() {
    return nxx;
  }

  public void setNxx(Integer nxx) {
    this.nxx = nxx;
  }

  public PhoneNumbersRegionFull isTollFree(Integer isTollFree) {
    this.isTollFree = isTollFree;
    return this;
  }

   /**
   * Optional. Boolean describing whether the phone numbers in this group are toll free.
   * @return isTollFree
  **/
  @ApiModelProperty(example = "null", value = "Optional. Boolean describing whether the phone numbers in this group are toll free.")
  public Integer getIsTollFree() {
    return isTollFree;
  }

  public void setIsTollFree(Integer isTollFree) {
    this.isTollFree = isTollFree;
  }

  public PhoneNumbersRegionFull city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Optional. City name.
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "Optional. City name.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PhoneNumbersRegionFull provincePostalCode(String provincePostalCode) {
    this.provincePostalCode = provincePostalCode;
    return this;
  }

   /**
   * Optional. Two-letter postal code for the state or province.
   * @return provincePostalCode
  **/
  @ApiModelProperty(example = "null", value = "Optional. Two-letter postal code for the state or province.")
  public String getProvincePostalCode() {
    return provincePostalCode;
  }

  public void setProvincePostalCode(String provincePostalCode) {
    this.provincePostalCode = provincePostalCode;
  }

  public PhoneNumbersRegionFull countryPostalCode(String countryPostalCode) {
    this.countryPostalCode = countryPostalCode;
    return this;
  }

   /**
   * Optional. Two-letter postal code for the country.
   * @return countryPostalCode
  **/
  @ApiModelProperty(example = "null", value = "Optional. Two-letter postal code for the country.")
  public String getCountryPostalCode() {
    return countryPostalCode;
  }

  public void setCountryPostalCode(String countryPostalCode) {
    this.countryPostalCode = countryPostalCode;
  }

  public PhoneNumbersRegionFull quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Integer. Quantity of phone numbers currently available in the given region.
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Integer. Quantity of phone numbers currently available in the given region.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumbersRegionFull phoneNumbersRegionFull = (PhoneNumbersRegionFull) o;
    return Objects.equals(this.countryCode, phoneNumbersRegionFull.countryCode) &&
        Objects.equals(this.npa, phoneNumbersRegionFull.npa) &&
        Objects.equals(this.nxx, phoneNumbersRegionFull.nxx) &&
        Objects.equals(this.isTollFree, phoneNumbersRegionFull.isTollFree) &&
        Objects.equals(this.city, phoneNumbersRegionFull.city) &&
        Objects.equals(this.provincePostalCode, phoneNumbersRegionFull.provincePostalCode) &&
        Objects.equals(this.countryPostalCode, phoneNumbersRegionFull.countryPostalCode) &&
        Objects.equals(this.quantity, phoneNumbersRegionFull.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, npa, nxx, isTollFree, city, provincePostalCode, countryPostalCode, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumbersRegionFull {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
    sb.append("    isTollFree: ").append(toIndentedString(isTollFree)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    provincePostalCode: ").append(toIndentedString(provincePostalCode)).append("\n");
    sb.append("    countryPostalCode: ").append(toIndentedString(countryPostalCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

