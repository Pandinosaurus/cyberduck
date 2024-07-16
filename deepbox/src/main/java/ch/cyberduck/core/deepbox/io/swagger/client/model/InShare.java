/*
 * DeepBox
 * DeepBox API Documentation
 *
 * OpenAPI spec version: 1.0
 * Contact: info@deepcloud.swiss
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.deepbox.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.deepbox.io.swagger.client.model.InSharedNode;
import ch.cyberduck.core.deepbox.io.swagger.client.model.UserContext;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * InShare
 */



public class InShare {
  @JsonProperty("shareId")
  private String shareId = null;

  @JsonProperty("deepBoxNodeId")
  private String deepBoxNodeId = null;

  @JsonProperty("boxType")
  private String boxType = null;

  @JsonProperty("boxNodeId")
  private String boxNodeId = null;

  @JsonProperty("boxName")
  private String boxName = null;

  @JsonProperty("originCompanyId")
  private String originCompanyId = null;

  @JsonProperty("withCompanyId")
  private String withCompanyId = null;

  @JsonProperty("withEmail")
  private String withEmail = null;

  @JsonProperty("withOwner")
  private UserContext withOwner = null;

  @JsonProperty("sharedNodes")
  private List<InSharedNode> sharedNodes = null;

  public InShare shareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

   /**
   * Get shareId
   * @return shareId
  **/
  @Schema(description = "")
  public String getShareId() {
    return shareId;
  }

  public void setShareId(String shareId) {
    this.shareId = shareId;
  }

  public InShare deepBoxNodeId(String deepBoxNodeId) {
    this.deepBoxNodeId = deepBoxNodeId;
    return this;
  }

   /**
   * Get deepBoxNodeId
   * @return deepBoxNodeId
  **/
  @Schema(description = "")
  public String getDeepBoxNodeId() {
    return deepBoxNodeId;
  }

  public void setDeepBoxNodeId(String deepBoxNodeId) {
    this.deepBoxNodeId = deepBoxNodeId;
  }

  public InShare boxType(String boxType) {
    this.boxType = boxType;
    return this;
  }

   /**
   * Get boxType
   * @return boxType
  **/
  @Schema(description = "")
  public String getBoxType() {
    return boxType;
  }

  public void setBoxType(String boxType) {
    this.boxType = boxType;
  }

  public InShare boxNodeId(String boxNodeId) {
    this.boxNodeId = boxNodeId;
    return this;
  }

   /**
   * Get boxNodeId
   * @return boxNodeId
  **/
  @Schema(description = "")
  public String getBoxNodeId() {
    return boxNodeId;
  }

  public void setBoxNodeId(String boxNodeId) {
    this.boxNodeId = boxNodeId;
  }

  public InShare boxName(String boxName) {
    this.boxName = boxName;
    return this;
  }

   /**
   * Get boxName
   * @return boxName
  **/
  @Schema(description = "")
  public String getBoxName() {
    return boxName;
  }

  public void setBoxName(String boxName) {
    this.boxName = boxName;
  }

  public InShare originCompanyId(String originCompanyId) {
    this.originCompanyId = originCompanyId;
    return this;
  }

   /**
   * Get originCompanyId
   * @return originCompanyId
  **/
  @Schema(description = "")
  public String getOriginCompanyId() {
    return originCompanyId;
  }

  public void setOriginCompanyId(String originCompanyId) {
    this.originCompanyId = originCompanyId;
  }

  public InShare withCompanyId(String withCompanyId) {
    this.withCompanyId = withCompanyId;
    return this;
  }

   /**
   * Get withCompanyId
   * @return withCompanyId
  **/
  @Schema(description = "")
  public String getWithCompanyId() {
    return withCompanyId;
  }

  public void setWithCompanyId(String withCompanyId) {
    this.withCompanyId = withCompanyId;
  }

  public InShare withEmail(String withEmail) {
    this.withEmail = withEmail;
    return this;
  }

   /**
   * Get withEmail
   * @return withEmail
  **/
  @Schema(description = "")
  public String getWithEmail() {
    return withEmail;
  }

  public void setWithEmail(String withEmail) {
    this.withEmail = withEmail;
  }

  public InShare withOwner(UserContext withOwner) {
    this.withOwner = withOwner;
    return this;
  }

   /**
   * Get withOwner
   * @return withOwner
  **/
  @Schema(description = "")
  public UserContext getWithOwner() {
    return withOwner;
  }

  public void setWithOwner(UserContext withOwner) {
    this.withOwner = withOwner;
  }

  public InShare sharedNodes(List<InSharedNode> sharedNodes) {
    this.sharedNodes = sharedNodes;
    return this;
  }

  public InShare addSharedNodesItem(InSharedNode sharedNodesItem) {
    if (this.sharedNodes == null) {
      this.sharedNodes = new ArrayList<>();
    }
    this.sharedNodes.add(sharedNodesItem);
    return this;
  }

   /**
   * Get sharedNodes
   * @return sharedNodes
  **/
  @Schema(description = "")
  public List<InSharedNode> getSharedNodes() {
    return sharedNodes;
  }

  public void setSharedNodes(List<InSharedNode> sharedNodes) {
    this.sharedNodes = sharedNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InShare inShare = (InShare) o;
    return Objects.equals(this.shareId, inShare.shareId) &&
        Objects.equals(this.deepBoxNodeId, inShare.deepBoxNodeId) &&
        Objects.equals(this.boxType, inShare.boxType) &&
        Objects.equals(this.boxNodeId, inShare.boxNodeId) &&
        Objects.equals(this.boxName, inShare.boxName) &&
        Objects.equals(this.originCompanyId, inShare.originCompanyId) &&
        Objects.equals(this.withCompanyId, inShare.withCompanyId) &&
        Objects.equals(this.withEmail, inShare.withEmail) &&
        Objects.equals(this.withOwner, inShare.withOwner) &&
        Objects.equals(this.sharedNodes, inShare.sharedNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareId, deepBoxNodeId, boxType, boxNodeId, boxName, originCompanyId, withCompanyId, withEmail, withOwner, sharedNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InShare {\n");
    
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
    sb.append("    deepBoxNodeId: ").append(toIndentedString(deepBoxNodeId)).append("\n");
    sb.append("    boxType: ").append(toIndentedString(boxType)).append("\n");
    sb.append("    boxNodeId: ").append(toIndentedString(boxNodeId)).append("\n");
    sb.append("    boxName: ").append(toIndentedString(boxName)).append("\n");
    sb.append("    originCompanyId: ").append(toIndentedString(originCompanyId)).append("\n");
    sb.append("    withCompanyId: ").append(toIndentedString(withCompanyId)).append("\n");
    sb.append("    withEmail: ").append(toIndentedString(withEmail)).append("\n");
    sb.append("    withOwner: ").append(toIndentedString(withOwner)).append("\n");
    sb.append("    sharedNodes: ").append(toIndentedString(sharedNodes)).append("\n");
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