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
import ch.cyberduck.core.deepbox.io.swagger.client.model.OutSharedNode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * OutShare
 */



public class OutShare {
  @JsonProperty("shareId")
  private String shareId = null;

  @JsonProperty("deepBoxNodeId")
  private String deepBoxNodeId = null;

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

  @JsonProperty("pending")
  private Boolean pending = null;

  @JsonProperty("sharedNodes")
  private List<OutSharedNode> sharedNodes = null;

  public OutShare shareId(String shareId) {
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

  public OutShare deepBoxNodeId(String deepBoxNodeId) {
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

  public OutShare boxNodeId(String boxNodeId) {
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

  public OutShare boxName(String boxName) {
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

  public OutShare originCompanyId(String originCompanyId) {
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

  public OutShare withCompanyId(String withCompanyId) {
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

  public OutShare withEmail(String withEmail) {
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

  public OutShare pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @Schema(description = "")
  public Boolean isPending() {
    return pending;
  }

  public void setPending(Boolean pending) {
    this.pending = pending;
  }

  public OutShare sharedNodes(List<OutSharedNode> sharedNodes) {
    this.sharedNodes = sharedNodes;
    return this;
  }

  public OutShare addSharedNodesItem(OutSharedNode sharedNodesItem) {
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
  public List<OutSharedNode> getSharedNodes() {
    return sharedNodes;
  }

  public void setSharedNodes(List<OutSharedNode> sharedNodes) {
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
    OutShare outShare = (OutShare) o;
    return Objects.equals(this.shareId, outShare.shareId) &&
        Objects.equals(this.deepBoxNodeId, outShare.deepBoxNodeId) &&
        Objects.equals(this.boxNodeId, outShare.boxNodeId) &&
        Objects.equals(this.boxName, outShare.boxName) &&
        Objects.equals(this.originCompanyId, outShare.originCompanyId) &&
        Objects.equals(this.withCompanyId, outShare.withCompanyId) &&
        Objects.equals(this.withEmail, outShare.withEmail) &&
        Objects.equals(this.pending, outShare.pending) &&
        Objects.equals(this.sharedNodes, outShare.sharedNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareId, deepBoxNodeId, boxNodeId, boxName, originCompanyId, withCompanyId, withEmail, pending, sharedNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutShare {\n");
    
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
    sb.append("    deepBoxNodeId: ").append(toIndentedString(deepBoxNodeId)).append("\n");
    sb.append("    boxNodeId: ").append(toIndentedString(boxNodeId)).append("\n");
    sb.append("    boxName: ").append(toIndentedString(boxName)).append("\n");
    sb.append("    originCompanyId: ").append(toIndentedString(originCompanyId)).append("\n");
    sb.append("    withCompanyId: ").append(toIndentedString(withCompanyId)).append("\n");
    sb.append("    withEmail: ").append(toIndentedString(withEmail)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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
