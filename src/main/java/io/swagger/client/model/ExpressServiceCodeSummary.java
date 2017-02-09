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
 * The Express Service Code Summary Object is used to briefly represent a Express Service Code. It consists of the ID and code:
 */
@ApiModel(description = "The Express Service Code Summary Object is used to briefly represent a Express Service Code. It consists of the ID and code:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T09:08:03.715Z")
public class ExpressServiceCodeSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("express_service_code")
  private String expressServiceCode = null;

  public ExpressServiceCodeSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ExpressServiceCodeSummary expressServiceCode(String expressServiceCode) {
    this.expressServiceCode = expressServiceCode;
    return this;
  }

   /**
   * An 8-digit number in string format
   * @return expressServiceCode
  **/
  @ApiModelProperty(example = "null", value = "An 8-digit number in string format")
  public String getExpressServiceCode() {
    return expressServiceCode;
  }

  public void setExpressServiceCode(String expressServiceCode) {
    this.expressServiceCode = expressServiceCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressServiceCodeSummary expressServiceCodeSummary = (ExpressServiceCodeSummary) o;
    return Objects.equals(this.id, expressServiceCodeSummary.id) &&
        Objects.equals(this.expressServiceCode, expressServiceCodeSummary.expressServiceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, expressServiceCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressServiceCodeSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expressServiceCode: ").append(toIndentedString(expressServiceCode)).append("\n");
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

