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
 * The Application Summary Object is used to briefly represent an application. It can occur in several places throughout this API. Here are the properties:
 */
@ApiModel(description = "The Application Summary Object is used to briefly represent an application. It can occur in several places throughout this API. Here are the properties:")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T15:20:10.092Z")
public class ApplicationSummary {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  public ApplicationSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Application ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Application ID. Read-only.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ApplicationSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Application name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Application name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationSummary applicationSummary = (ApplicationSummary) o;
    return Objects.equals(this.id, applicationSummary.id) &&
        Objects.equals(this.name, applicationSummary.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

