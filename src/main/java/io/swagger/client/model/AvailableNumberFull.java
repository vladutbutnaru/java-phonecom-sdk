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
 * The Full Available Phone Number Object includes the properties in the Summary Object, along with the following:
 */
@ApiModel(description = "The Full Available Phone Number Object includes the properties in the Summary Object, along with the following:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T15:20:10.092Z")
public class AvailableNumberFull {
  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("formatted")
  private String formatted = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("is_toll_free")
  private Boolean isTollFree = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("npa")
  private String npa = null;

  @SerializedName("nxx")
  private String nxx = null;

  @SerializedName("xxxx")
  private String xxxx = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("province")
  private String province = null;

  @SerializedName("country")
  private String country = null;

  public AvailableNumberFull phoneNumber(String phoneNumber) {
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

  public AvailableNumberFull formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

   /**
   * Human-readable formatted version of the phone number
   * @return formatted
  **/
  @ApiModelProperty(example = "null", value = "Human-readable formatted version of the phone number")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public AvailableNumberFull price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * The one-time initial price for this number, in USD. Some numbers show REQUEST_QUOTE here. Please contact our sales department if you are interested in these numbers.
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "The one-time initial price for this number, in USD. Some numbers show REQUEST_QUOTE here. Please contact our sales department if you are interested in these numbers.")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public AvailableNumberFull isTollFree(Boolean isTollFree) {
    this.isTollFree = isTollFree;
    return this;
  }

   /**
   * Whether the number is toll-free
   * @return isTollFree
  **/
  @ApiModelProperty(example = "null", value = "Whether the number is toll-free")
  public Boolean getIsTollFree() {
    return isTollFree;
  }

  public void setIsTollFree(Boolean isTollFree) {
    this.isTollFree = isTollFree;
  }

  public AvailableNumberFull countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The international dialing prefix for this number. For US and Canadian numbers, for example, this will be \"1\".
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "The international dialing prefix for this number. For US and Canadian numbers, for example, this will be \"1\".")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AvailableNumberFull npa(String npa) {
    this.npa = npa;
    return this;
  }

   /**
   * Area code (a.k.a. NPA). Included for North American numbers only.
   * @return npa
  **/
  @ApiModelProperty(example = "null", value = "Area code (a.k.a. NPA). Included for North American numbers only.")
  public String getNpa() {
    return npa;
  }

  public void setNpa(String npa) {
    this.npa = npa;
  }

  public AvailableNumberFull nxx(String nxx) {
    this.nxx = nxx;
    return this;
  }

   /**
   * Second 3 digits (a.k.a. NXX). Included for North American numbers only.
   * @return nxx
  **/
  @ApiModelProperty(example = "null", value = "Second 3 digits (a.k.a. NXX). Included for North American numbers only.")
  public String getNxx() {
    return nxx;
  }

  public void setNxx(String nxx) {
    this.nxx = nxx;
  }

  public AvailableNumberFull xxxx(String xxxx) {
    this.xxxx = xxxx;
    return this;
  }

   /**
   * Last 4 digits (a.k.a. XXXX). Included for North American numbers only.
   * @return xxxx
  **/
  @ApiModelProperty(example = "null", value = "Last 4 digits (a.k.a. XXXX). Included for North American numbers only.")
  public String getXxxx() {
    return xxxx;
  }

  public void setXxxx(String xxxx) {
    this.xxxx = xxxx;
  }

  public AvailableNumberFull city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City with which this number is associated, if known. Otherwise NULL.
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "City with which this number is associated, if known. Otherwise NULL.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AvailableNumberFull province(String province) {
    this.province = province;
    return this;
  }

   /**
   * State or Province with which this number is associated, if known. Postal Code. Otherwise NULL.
   * @return province
  **/
  @ApiModelProperty(example = "null", value = "State or Province with which this number is associated, if known. Postal Code. Otherwise NULL.")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public AvailableNumberFull country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country with which this number is associated, if known. Otherwise NULL.
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "Country with which this number is associated, if known. Otherwise NULL.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableNumberFull availableNumberFull = (AvailableNumberFull) o;
    return Objects.equals(this.phoneNumber, availableNumberFull.phoneNumber) &&
        Objects.equals(this.formatted, availableNumberFull.formatted) &&
        Objects.equals(this.price, availableNumberFull.price) &&
        Objects.equals(this.isTollFree, availableNumberFull.isTollFree) &&
        Objects.equals(this.countryCode, availableNumberFull.countryCode) &&
        Objects.equals(this.npa, availableNumberFull.npa) &&
        Objects.equals(this.nxx, availableNumberFull.nxx) &&
        Objects.equals(this.xxxx, availableNumberFull.xxxx) &&
        Objects.equals(this.city, availableNumberFull.city) &&
        Objects.equals(this.province, availableNumberFull.province) &&
        Objects.equals(this.country, availableNumberFull.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, formatted, price, isTollFree, countryCode, npa, nxx, xxxx, city, province, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableNumberFull {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    isTollFree: ").append(toIndentedString(isTollFree)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
    sb.append("    xxxx: ").append(toIndentedString(xxxx)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

