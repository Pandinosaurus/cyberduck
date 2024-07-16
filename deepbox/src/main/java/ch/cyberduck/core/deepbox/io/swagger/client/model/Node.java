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
import ch.cyberduck.core.deepbox.io.swagger.client.model.NodePolicy;
import ch.cyberduck.core.deepbox.io.swagger.client.model.Tag;
import ch.cyberduck.core.deepbox.io.swagger.client.model.TimeUserContext;
import ch.cyberduck.core.deepbox.io.swagger.client.model.UserContext;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Node
 */



public class Node {
  @JsonProperty("nodeId")
  private String nodeId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FOLDER("folder"),
    FILE("file");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("ownerUser")
  private UserContext ownerUser = null;

  @JsonProperty("created")
  private TimeUserContext created = null;

  @JsonProperty("modified")
  private TimeUserContext modified = null;

  @JsonProperty("deleted")
  private TimeUserContext deleted = null;

  @JsonProperty("policy")
  private NodePolicy policy = null;

  @JsonProperty("hasAccesses")
  private Boolean hasAccesses = null;

  @JsonProperty("commentCount")
  private Long commentCount = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("analysisStatus")
  private String analysisStatus = null;

  @JsonProperty("signStatus")
  private String signStatus = null;

  @JsonProperty("documentType")
  private String documentType = null;

  @JsonProperty("tags")
  private List<Tag> tags = null;

  public Node nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public Node name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Node mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @Schema(description = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Node type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Node ownerUser(UserContext ownerUser) {
    this.ownerUser = ownerUser;
    return this;
  }

   /**
   * Get ownerUser
   * @return ownerUser
  **/
  @Schema(description = "")
  public UserContext getOwnerUser() {
    return ownerUser;
  }

  public void setOwnerUser(UserContext ownerUser) {
    this.ownerUser = ownerUser;
  }

  public Node created(TimeUserContext created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public TimeUserContext getCreated() {
    return created;
  }

  public void setCreated(TimeUserContext created) {
    this.created = created;
  }

  public Node modified(TimeUserContext modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @Schema(description = "")
  public TimeUserContext getModified() {
    return modified;
  }

  public void setModified(TimeUserContext modified) {
    this.modified = modified;
  }

  public Node deleted(TimeUserContext deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public TimeUserContext getDeleted() {
    return deleted;
  }

  public void setDeleted(TimeUserContext deleted) {
    this.deleted = deleted;
  }

  public Node policy(NodePolicy policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Schema(description = "")
  public NodePolicy getPolicy() {
    return policy;
  }

  public void setPolicy(NodePolicy policy) {
    this.policy = policy;
  }

  public Node hasAccesses(Boolean hasAccesses) {
    this.hasAccesses = hasAccesses;
    return this;
  }

   /**
   * Get hasAccesses
   * @return hasAccesses
  **/
  @Schema(description = "")
  public Boolean isHasAccesses() {
    return hasAccesses;
  }

  public void setHasAccesses(Boolean hasAccesses) {
    this.hasAccesses = hasAccesses;
  }

  public Node commentCount(Long commentCount) {
    this.commentCount = commentCount;
    return this;
  }

   /**
   * Get commentCount
   * @return commentCount
  **/
  @Schema(description = "")
  public Long getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Long commentCount) {
    this.commentCount = commentCount;
  }

  public Node size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Node analysisStatus(String analysisStatus) {
    this.analysisStatus = analysisStatus;
    return this;
  }

   /**
   * Get analysisStatus
   * @return analysisStatus
  **/
  @Schema(description = "")
  public String getAnalysisStatus() {
    return analysisStatus;
  }

  public void setAnalysisStatus(String analysisStatus) {
    this.analysisStatus = analysisStatus;
  }

  public Node signStatus(String signStatus) {
    this.signStatus = signStatus;
    return this;
  }

   /**
   * Get signStatus
   * @return signStatus
  **/
  @Schema(description = "")
  public String getSignStatus() {
    return signStatus;
  }

  public void setSignStatus(String signStatus) {
    this.signStatus = signStatus;
  }

  public Node documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @Schema(description = "")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Node tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Node addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.nodeId, node.nodeId) &&
        Objects.equals(this.name, node.name) &&
        Objects.equals(this.displayName, node.displayName) &&
        Objects.equals(this.mimeType, node.mimeType) &&
        Objects.equals(this.type, node.type) &&
        Objects.equals(this.ownerUser, node.ownerUser) &&
        Objects.equals(this.created, node.created) &&
        Objects.equals(this.modified, node.modified) &&
        Objects.equals(this.deleted, node.deleted) &&
        Objects.equals(this.policy, node.policy) &&
        Objects.equals(this.hasAccesses, node.hasAccesses) &&
        Objects.equals(this.commentCount, node.commentCount) &&
        Objects.equals(this.size, node.size) &&
        Objects.equals(this.analysisStatus, node.analysisStatus) &&
        Objects.equals(this.signStatus, node.signStatus) &&
        Objects.equals(this.documentType, node.documentType) &&
        Objects.equals(this.tags, node.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, name, displayName, mimeType, type, ownerUser, created, modified, deleted, policy, hasAccesses, commentCount, size, analysisStatus, signStatus, documentType, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ownerUser: ").append(toIndentedString(ownerUser)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    hasAccesses: ").append(toIndentedString(hasAccesses)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    analysisStatus: ").append(toIndentedString(analysisStatus)).append("\n");
    sb.append("    signStatus: ").append(toIndentedString(signStatus)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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