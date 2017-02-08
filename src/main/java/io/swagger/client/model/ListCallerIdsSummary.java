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
import io.swagger.client.model.CallerIdFull;
import io.swagger.client.model.FilterNameNumberArray;
import io.swagger.client.model.SortNameNumber;
import java.util.ArrayList;
import java.util.List;

/**
 * ListCallerIdsSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-08T15:20:10.092Z")
public class ListCallerIdsSummary {
  @SerializedName("filters")
  private FilterNameNumberArray filters = null;

  @SerializedName("sort")
  private SortNameNumber sort = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("items")
  private List<CallerIdFull> items = new ArrayList<CallerIdFull>();

  public ListCallerIdsSummary filters(FilterNameNumberArray filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(example = "null", value = "")
  public FilterNameNumberArray getFilters() {
    return filters;
  }

  public void setFilters(FilterNameNumberArray filters) {
    this.filters = filters;
  }

  public ListCallerIdsSummary sort(SortNameNumber sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "")
  public SortNameNumber getSort() {
    return sort;
  }

  public void setSort(SortNameNumber sort) {
    this.sort = sort;
  }

  public ListCallerIdsSummary total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ListCallerIdsSummary offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public ListCallerIdsSummary limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public ListCallerIdsSummary items(List<CallerIdFull> items) {
    this.items = items;
    return this;
  }

  public ListCallerIdsSummary addItemsItem(CallerIdFull itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CallerIdFull> getItems() {
    return items;
  }

  public void setItems(List<CallerIdFull> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCallerIdsSummary listCallerIdsSummary = (ListCallerIdsSummary) o;
    return Objects.equals(this.filters, listCallerIdsSummary.filters) &&
        Objects.equals(this.sort, listCallerIdsSummary.sort) &&
        Objects.equals(this.total, listCallerIdsSummary.total) &&
        Objects.equals(this.offset, listCallerIdsSummary.offset) &&
        Objects.equals(this.limit, listCallerIdsSummary.limit) &&
        Objects.equals(this.items, listCallerIdsSummary.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, sort, total, offset, limit, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCallerIdsSummary {\n");
    
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

