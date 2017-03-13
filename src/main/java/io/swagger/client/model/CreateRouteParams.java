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
 * CreateRouteParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-13T08:15:06.119Z")
public class CreateRouteParams {
  @SerializedName("name")
  private String name = null;

  @SerializedName("rules")
  private List<Object> rules = new ArrayList<Object>();

  @SerializedName("extension")
  private Object extension = null;

  public CreateRouteParams name(String name) {
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

  public CreateRouteParams rules(List<Object> rules) {
    this.rules = rules;
    return this;
  }

  public CreateRouteParams addRulesItem(Object rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Rule Sets
   * @return rules
  **/
  @ApiModelProperty(example = "null", value = "Rule Sets")
  public List<Object> getRules() {
    return rules;
  }

  public void setRules(List<Object> rules) {
    this.rules = rules;
  }

  public CreateRouteParams extension(Object extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension Reference
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Extension Reference")
  public Object getExtension() {
    return extension;
  }

  public void setExtension(Object extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRouteParams createRouteParams = (CreateRouteParams) o;
    return Objects.equals(this.name, createRouteParams.name) &&
        Objects.equals(this.rules, createRouteParams.rules) &&
        Objects.equals(this.extension, createRouteParams.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rules, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRouteParams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

