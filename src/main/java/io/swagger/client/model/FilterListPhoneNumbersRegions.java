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
 * FilterListPhoneNumbersRegions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T10:43:19.319+01:00")
public class FilterListPhoneNumbersRegions {
  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("npa")
  private String npa = null;

  @SerializedName("nxx")
  private String nxx = null;

  @SerializedName("is_toll_free")
  private String isTollFree = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("province_postal_code")
  private String provincePostalCode = null;

  @SerializedName("country_postal_code")
  private String countryPostalCode = null;

  public FilterListPhoneNumbersRegions countryCode(String countryCode) {
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

  public FilterListPhoneNumbersRegions npa(String npa) {
    this.npa = npa;
    return this;
  }

   /**
   * Get npa
   * @return npa
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNpa() {
    return npa;
  }

  public void setNpa(String npa) {
    this.npa = npa;
  }

  public FilterListPhoneNumbersRegions nxx(String nxx) {
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

  public FilterListPhoneNumbersRegions isTollFree(String isTollFree) {
    this.isTollFree = isTollFree;
    return this;
  }

   /**
   * Get isTollFree
   * @return isTollFree
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsTollFree() {
    return isTollFree;
  }

  public void setIsTollFree(String isTollFree) {
    this.isTollFree = isTollFree;
  }

  public FilterListPhoneNumbersRegions city(String city) {
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

  public FilterListPhoneNumbersRegions provincePostalCode(String provincePostalCode) {
    this.provincePostalCode = provincePostalCode;
    return this;
  }

   /**
   * Get provincePostalCode
   * @return provincePostalCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProvincePostalCode() {
    return provincePostalCode;
  }

  public void setProvincePostalCode(String provincePostalCode) {
    this.provincePostalCode = provincePostalCode;
  }

  public FilterListPhoneNumbersRegions countryPostalCode(String countryPostalCode) {
    this.countryPostalCode = countryPostalCode;
    return this;
  }

   /**
   * Get countryPostalCode
   * @return countryPostalCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryPostalCode() {
    return countryPostalCode;
  }

  public void setCountryPostalCode(String countryPostalCode) {
    this.countryPostalCode = countryPostalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterListPhoneNumbersRegions filterListPhoneNumbersRegions = (FilterListPhoneNumbersRegions) o;
    return Objects.equals(this.countryCode, filterListPhoneNumbersRegions.countryCode) &&
        Objects.equals(this.npa, filterListPhoneNumbersRegions.npa) &&
        Objects.equals(this.nxx, filterListPhoneNumbersRegions.nxx) &&
        Objects.equals(this.isTollFree, filterListPhoneNumbersRegions.isTollFree) &&
        Objects.equals(this.city, filterListPhoneNumbersRegions.city) &&
        Objects.equals(this.provincePostalCode, filterListPhoneNumbersRegions.provincePostalCode) &&
        Objects.equals(this.countryPostalCode, filterListPhoneNumbersRegions.countryPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, npa, nxx, isTollFree, city, provincePostalCode, countryPostalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterListPhoneNumbersRegions {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    npa: ").append(toIndentedString(npa)).append("\n");
    sb.append("    nxx: ").append(toIndentedString(nxx)).append("\n");
    sb.append("    isTollFree: ").append(toIndentedString(isTollFree)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    provincePostalCode: ").append(toIndentedString(provincePostalCode)).append("\n");
    sb.append("    countryPostalCode: ").append(toIndentedString(countryPostalCode)).append("\n");
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

