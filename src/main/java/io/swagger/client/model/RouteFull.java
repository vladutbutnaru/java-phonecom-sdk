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
import io.swagger.client.model.ExtensionSummary;
import io.swagger.client.model.RuleSet;
import java.util.ArrayList;
import java.util.List;

/**
 * The root level of the Full Route Object includes all of the properties in the Route Summary Object, along with two more:
 */
@ApiModel(description = "The root level of the Full Route Object includes all of the properties in the Route Summary Object, along with two more:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T10:43:19.319+01:00")
public class RouteFull {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("extension")
  private ExtensionSummary extension = null;

  @SerializedName("rules")
  private List<RuleSet> rules = new ArrayList<RuleSet>();

  public RouteFull id(Integer id) {
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

  public RouteFull name(String name) {
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

  public RouteFull extension(ExtensionSummary extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension to which this route belongs. Output is an Extension Summary Object. Input must be an Extension Lookup Object. Optional. Cannot be changed after a route is created.
   * @return extension
  **/
  @ApiModelProperty(example = "null", value = "Extension to which this route belongs. Output is an Extension Summary Object. Input must be an Extension Lookup Object. Optional. Cannot be changed after a route is created.")
  public ExtensionSummary getExtension() {
    return extension;
  }

  public void setExtension(ExtensionSummary extension) {
    this.extension = extension;
  }

  public RouteFull rules(List<RuleSet> rules) {
    this.rules = rules;
    return this;
  }

  public RouteFull addRulesItem(RuleSet rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Array of Rule Set Objects. Required. See below for details. When processing incoming calls, the first matching rule set will be used, and all others will be ignored.
   * @return rules
  **/
  @ApiModelProperty(example = "null", value = "Array of Rule Set Objects. Required. See below for details. When processing incoming calls, the first matching rule set will be used, and all others will be ignored.")
  public List<RuleSet> getRules() {
    return rules;
  }

  public void setRules(List<RuleSet> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteFull routeFull = (RouteFull) o;
    return Objects.equals(this.id, routeFull.id) &&
        Objects.equals(this.name, routeFull.name) &&
        Objects.equals(this.extension, routeFull.extension) &&
        Objects.equals(this.rules, routeFull.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, extension, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

