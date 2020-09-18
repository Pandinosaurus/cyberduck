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

/**
 * File permission.
 */
@ApiModel(description = "File permission.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T14:15:21.736+02:00")



public class FilePermission {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isGroup")
  private Boolean isGroup = null;

  @JsonProperty("permission")
  private Integer permission = null;

  @JsonProperty("parentPermission")
  private Integer parentPermission = null;

  public FilePermission id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The user/group id.
   * @return id
  **/
  @ApiModelProperty(value = "The user/group id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FilePermission isGroup(Boolean isGroup) {
    this.isGroup = isGroup;
    return this;
  }

   /**
   * Indicates if the permission is set for a user or group.
   * @return isGroup
  **/
  @ApiModelProperty(value = "Indicates if the permission is set for a user or group.")
  public Boolean isIsGroup() {
    return isGroup;
  }

  public void setIsGroup(Boolean isGroup) {
    this.isGroup = isGroup;
  }

  public FilePermission permission(Integer permission) {
    this.permission = permission;
    return this;
  }

   /**
   * The permission. (0 &#x3D; NoAccess, 1 &#x3D; ReadOnly, 2 &#x3D; ReadWrite, 4 &#x3D; Synchronize, 99 &#x3D; FullControl, -1 &#x3D; None)
   * @return permission
  **/
  @ApiModelProperty(value = "The permission. (0 = NoAccess, 1 = ReadOnly, 2 = ReadWrite, 4 = Synchronize, 99 = FullControl, -1 = None)")
  public Integer getPermission() {
    return permission;
  }

  public void setPermission(Integer permission) {
    this.permission = permission;
  }

  public FilePermission parentPermission(Integer parentPermission) {
    this.parentPermission = parentPermission;
    return this;
  }

   /**
   * The permission. (0 &#x3D; NoAccess, 1 &#x3D; ReadOnly, 2 &#x3D; ReadWrite, 4 &#x3D; Synchronize, 99 &#x3D; FullControl, -1 &#x3D; None)
   * @return parentPermission
  **/
  @ApiModelProperty(value = "The permission. (0 = NoAccess, 1 = ReadOnly, 2 = ReadWrite, 4 = Synchronize, 99 = FullControl, -1 = None)")
  public Integer getParentPermission() {
    return parentPermission;
  }

  public void setParentPermission(Integer parentPermission) {
    this.parentPermission = parentPermission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilePermission filePermission = (FilePermission) o;
    return Objects.equals(this.id, filePermission.id) &&
        Objects.equals(this.isGroup, filePermission.isGroup) &&
        Objects.equals(this.permission, filePermission.permission) &&
        Objects.equals(this.parentPermission, filePermission.parentPermission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isGroup, permission, parentPermission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePermission {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGroup: ").append(toIndentedString(isGroup)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    parentPermission: ").append(toIndentedString(parentPermission)).append("\n");
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

