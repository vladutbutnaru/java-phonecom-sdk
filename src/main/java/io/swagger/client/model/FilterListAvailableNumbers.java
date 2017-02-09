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
 * FilterListAvailableNumbers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T09:08:03.715Z")
public class FilterListAvailableNumbers {
  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("npa")
  private List<Integer> npa = new ArrayList<Integer>();

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

  @SerializedName("price")
  private String price = null;

  @SerializedName("category")
  private String category = null;

  public FilterListAvailableNumbers phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public FilterListAvailableNumbers countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public FilterListAvailableNumbers npa(List<Integer> npa) {
    this.npa = npa;
    return this;
  }

  public FilterListAvailableNumbers addNpaItem(Integer npaItem) {
    this.npa.add(npaItem);
    return this;
  }

   /**
   * Get npa
   * @return npa
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getNpa() {
    return npa;
  }

  public void setNpa(List<Integer> npa) {
    this.npa = npa;
  }

  public FilterListAvailableNumbers nxx(String nxx) {
    this.nxx = nxx;
    return this;
  }

   /**
   * Get nxx
   * @return nxx
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNxx() {
    return nxx;
  }

  public void setNxx(String nxx) {
    this.nxx = nxx;
  }

  public FilterListAvailableNumbers xxxx(String xxxx) {
    this.xxxx = xxxx;
    return this;
  }

   /**
   * Get xxxx
   * @return xxxx
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getXxxx() {
    return xxxx;
  }

  public void setXxxx(String xxxx) {
    this.xxxx = xxxx;
  }

  public FilterListAvailableNumbers city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public FilterListAvailableNumbers province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public FilterListAvailableNumbers country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public FilterListAvailableNumbers price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public FilterListAvailableNumbers category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterListAvailableNumbers filterListAvailableNumbers = (FilterListAvailableNumbers) o;
    return Objects.equals(this.phoneNumber, filterListAvailableNumbers.phoneNumber) &&
        Objects.equals(this.countryCode, filterListAvailableNumbers.countryCode) &&
        Objects.equals(this.npa, filterListAvailableNumbers.npa) &&
        Objects.equals(this.nxx, filterListAvailableNumbers.nxx) &&
        Objects.equals(this.xxxx, filterListAvailableNumbers.xxxx) &&
        Objects.equals(this.city, filterListAvailableNumbers.city) &&
        Objects.equals(this.province, filterListAvailableNumbers.province) &&
        Objects.equals(this.country, filterListAvailableNumbers.country) &&
        Objects.equals(this.price, filterListAvailableNumbers.price) &&
        Objects.equals(this.category, filterListAvailableNumbers.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, countryCode, npa, nxx, xxxx, city, province, country, price, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterListAvailableNumbers {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
    sb.append("    xxxx: ").append(toIndentedString(xxxx)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

