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
import io.swagger.client.model.AccountSummary;
import io.swagger.client.model.FilterIdArray;
import io.swagger.client.model.SortId;
import java.util.ArrayList;
import java.util.List;

/**
 * ListAccountsSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T10:24:24.257Z")
public class ListAccountsSummary {
  @SerializedName("filters")
  private FilterIdArray filters = null;

  @SerializedName("sort")
  private SortId sort = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("items")
  private List<AccountSummary> items = new ArrayList<AccountSummary>();

  public ListAccountsSummary filters(FilterIdArray filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(example = "null", value = "")
  public FilterIdArray getFilters() {
    return filters;
  }

  public void setFilters(FilterIdArray filters) {
    this.filters = filters;
  }

  public ListAccountsSummary sort(SortId sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "")
  public SortId getSort() {
    return sort;
  }

  public void setSort(SortId sort) {
    this.sort = sort;
  }

  public ListAccountsSummary total(Integer total) {
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

  public ListAccountsSummary offset(Integer offset) {
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

  public ListAccountsSummary limit(Integer limit) {
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

  public ListAccountsSummary items(List<AccountSummary> items) {
    this.items = items;
    return this;
  }

  public ListAccountsSummary addItemsItem(AccountSummary itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AccountSummary> getItems() {
    return items;
  }

  public void setItems(List<AccountSummary> items) {
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
    ListAccountsSummary listAccountsSummary = (ListAccountsSummary) o;
    return Objects.equals(this.filters, listAccountsSummary.filters) &&
        Objects.equals(this.sort, listAccountsSummary.sort) &&
        Objects.equals(this.total, listAccountsSummary.total) &&
        Objects.equals(this.offset, listAccountsSummary.offset) &&
        Objects.equals(this.limit, listAccountsSummary.limit) &&
        Objects.equals(this.items, listAccountsSummary.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, sort, total, offset, limit, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAccountsSummary {\n");
    
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

