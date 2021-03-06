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
import io.swagger.client.model.RouteSummary;

/**
 * Option
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T10:43:19.319+01:00")
public class Option {
  @SerializedName("key")
  private String key = null;

  @SerializedName("route")
  private RouteSummary route = null;

  public Option key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Keypad key. Must equal a single digit or the pound sign (\"#\").
   * @return key
  **/
  @ApiModelProperty(example = "null", value = "Keypad key. Must equal a single digit or the pound sign (\"#\").")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Option route(RouteSummary route) {
    this.route = route;
    return this;
  }

   /**
   * Route which will be entered when the user presses the designated key. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route.
   * @return route
  **/
  @ApiModelProperty(example = "null", value = "Route which will be entered when the user presses the designated key. Output is a Route Summary Object if the route is named, otherwise the Full Route Object will be shown. Input must be a Route Lookup Object pointing to a named route.")
  public RouteSummary getRoute() {
    return route;
  }

  public void setRoute(RouteSummary route) {
    this.route = route;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Option option = (Option) o;
    return Objects.equals(this.key, option.key) &&
        Objects.equals(this.route, option.route);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, route);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
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

