/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T14:15:21.736+02:00")



public class UpdateFilePropertiesRequest {
  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("modified")
  private DateTime modified = null;

  @JsonProperty("accessed")
  private DateTime accessed = null;

  @JsonProperty("attributes")
  private Integer attributes = null;

  public UpdateFilePropertiesRequest created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The date and time the item was created.
   * @return created
  **/
  @ApiModelProperty(value = "The date and time the item was created.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public UpdateFilePropertiesRequest modified(DateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * The date and time the item was last modified.
   * @return modified
  **/
  @ApiModelProperty(value = "The date and time the item was last modified.")
  public DateTime getModified() {
    return modified;
  }

  public void setModified(DateTime modified) {
    this.modified = modified;
  }

  public UpdateFilePropertiesRequest accessed(DateTime accessed) {
    this.accessed = accessed;
    return this;
  }

   /**
   * The date and time the item was last accessed.
   * @return accessed
  **/
  @ApiModelProperty(value = "The date and time the item was last accessed.")
  public DateTime getAccessed() {
    return accessed;
  }

  public void setAccessed(DateTime accessed) {
    this.accessed = accessed;
  }

  public UpdateFilePropertiesRequest attributes(Integer attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * File attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "File attributes")
  public Integer getAttributes() {
    return attributes;
  }

  public void setAttributes(Integer attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFilePropertiesRequest updateFilePropertiesRequest = (UpdateFilePropertiesRequest) o;
    return Objects.equals(this.created, updateFilePropertiesRequest.created) &&
        Objects.equals(this.modified, updateFilePropertiesRequest.modified) &&
        Objects.equals(this.accessed, updateFilePropertiesRequest.accessed) &&
        Objects.equals(this.attributes, updateFilePropertiesRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, modified, accessed, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFilePropertiesRequest {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    accessed: ").append(toIndentedString(accessed)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

