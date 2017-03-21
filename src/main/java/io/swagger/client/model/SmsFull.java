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
import io.swagger.client.model.Recipient;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * The Full SMS Object is identical to the SMS Summary Object. See above for details.
 */
@ApiModel(description = "The Full SMS Object is identical to the SMS Summary Object. See above for details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-21T10:43:19.319+01:00")
public class SmsFull {
  @SerializedName("id")
  private String id = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private List<Recipient> to = new ArrayList<Recipient>();

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("created_epoch")
  private Integer createdEpoch = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("text")
  private String text = null;

  public SmsFull id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique SMS ID. Read-only.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique SMS ID. Read-only.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmsFull from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Caller ID number to display on the incoming/outgoing SMS message. For an outgoing message, it must be a phone number associated with your Phone.com account.
   * @return from
  **/
  @ApiModelProperty(example = "null", required = true, value = "Caller ID number to display on the incoming/outgoing SMS message. For an outgoing message, it must be a phone number associated with your Phone.com account.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public SmsFull to(List<Recipient> to) {
    this.to = to;
    return this;
  }

  public SmsFull addToItem(Recipient toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * An array of SMS recipients.
   * @return to
  **/
  @ApiModelProperty(example = "null", required = true, value = "An array of SMS recipients.")
  public List<Recipient> getTo() {
    return to;
  }

  public void setTo(List<Recipient> to) {
    this.to = to;
  }

  public SmsFull direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Direction of SMS. 'in' for Incoming messages, 'out' for Outgoing messages.
   * @return direction
  **/
  @ApiModelProperty(example = "null", required = true, value = "Direction of SMS. 'in' for Incoming messages, 'out' for Outgoing messages.")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public SmsFull createdEpoch(Integer createdEpoch) {
    this.createdEpoch = createdEpoch;
    return this;
  }

   /**
   * Unix time stamp representing the UTC time that the object was created in the Phone.com API system.
   * @return createdEpoch
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unix time stamp representing the UTC time that the object was created in the Phone.com API system.")
  public Integer getCreatedEpoch() {
    return createdEpoch;
  }

  public void setCreatedEpoch(Integer createdEpoch) {
    this.createdEpoch = createdEpoch;
  }

  public SmsFull createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date string representing the UTC time that the object was created in the Phone.com API system.
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", required = true, value = "Date string representing the UTC time that the object was created in the Phone.com API system.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SmsFull text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Body of the SMS text
   * @return text
  **/
  @ApiModelProperty(example = "null", required = true, value = "Body of the SMS text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsFull smsFull = (SmsFull) o;
    return Objects.equals(this.id, smsFull.id) &&
        Objects.equals(this.from, smsFull.from) &&
        Objects.equals(this.to, smsFull.to) &&
        Objects.equals(this.direction, smsFull.direction) &&
        Objects.equals(this.createdEpoch, smsFull.createdEpoch) &&
        Objects.equals(this.createdAt, smsFull.createdAt) &&
        Objects.equals(this.text, smsFull.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, from, to, direction, createdEpoch, createdAt, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsFull {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    createdEpoch: ").append(toIndentedString(createdEpoch)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

