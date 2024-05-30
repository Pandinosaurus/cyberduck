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
import ch.cyberduck.core.deepbox.io.swagger.client.model.CommentPolicy;
import ch.cyberduck.core.deepbox.io.swagger.client.model.TimeUserContext;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
/**
 * Comment
 */



public class Comment {
  @JsonProperty("commentId")
  private UUID commentId = null;

  @JsonProperty("created")
  private TimeUserContext created = null;

  @JsonProperty("modified")
  private TimeUserContext modified = null;

  @JsonProperty("commentPolicy")
  private CommentPolicy commentPolicy = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("hasMore")
  private Boolean hasMore = null;

  public Comment commentId(UUID commentId) {
    this.commentId = commentId;
    return this;
  }

   /**
   * Get commentId
   * @return commentId
  **/
  @Schema(description = "")
  public UUID getCommentId() {
    return commentId;
  }

  public void setCommentId(UUID commentId) {
    this.commentId = commentId;
  }

  public Comment created(TimeUserContext created) {
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

  public Comment modified(TimeUserContext modified) {
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

  public Comment commentPolicy(CommentPolicy commentPolicy) {
    this.commentPolicy = commentPolicy;
    return this;
  }

   /**
   * Get commentPolicy
   * @return commentPolicy
  **/
  @Schema(description = "")
  public CommentPolicy getCommentPolicy() {
    return commentPolicy;
  }

  public void setCommentPolicy(CommentPolicy commentPolicy) {
    this.commentPolicy = commentPolicy;
  }

  public Comment text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Comment hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @Schema(description = "")
  public Boolean isHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.commentId, comment.commentId) &&
        Objects.equals(this.created, comment.created) &&
        Objects.equals(this.modified, comment.modified) &&
        Objects.equals(this.commentPolicy, comment.commentPolicy) &&
        Objects.equals(this.text, comment.text) &&
        Objects.equals(this.hasMore, comment.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, created, modified, commentPolicy, text, hasMore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    commentPolicy: ").append(toIndentedString(commentPolicy)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
