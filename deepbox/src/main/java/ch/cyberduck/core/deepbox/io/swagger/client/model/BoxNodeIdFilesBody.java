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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * BoxNodeIdFilesBody
 */



public class BoxNodeIdFilesBody {
  @JsonProperty("files")
  private List<File> files = null;

  @JsonProperty("fileAttributes")
  private String fileAttributes = null;

  @JsonProperty("fileTags")
  private String fileTags = null;

  public BoxNodeIdFilesBody files(List<File> files) {
    this.files = files;
    return this;
  }

  public BoxNodeIdFilesBody addFilesItem(File filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @Schema(description = "")
  public List<File> getFiles() {
    return files;
  }

  public void setFiles(List<File> files) {
    this.files = files;
  }

  public BoxNodeIdFilesBody fileAttributes(String fileAttributes) {
    this.fileAttributes = fileAttributes;
    return this;
  }

   /**
   * key/value json
   * @return fileAttributes
  **/
  @Schema(description = "key/value json")
  public String getFileAttributes() {
    return fileAttributes;
  }

  public void setFileAttributes(String fileAttributes) {
    this.fileAttributes = fileAttributes;
  }

  public BoxNodeIdFilesBody fileTags(String fileTags) {
    this.fileTags = fileTags;
    return this;
  }

   /**
   * array of tags
   * @return fileTags
  **/
  @Schema(description = "array of tags")
  public String getFileTags() {
    return fileTags;
  }

  public void setFileTags(String fileTags) {
    this.fileTags = fileTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxNodeIdFilesBody boxNodeIdFilesBody = (BoxNodeIdFilesBody) o;
    return Objects.equals(this.files, boxNodeIdFilesBody.files) &&
        Objects.equals(this.fileAttributes, boxNodeIdFilesBody.fileAttributes) &&
        Objects.equals(this.fileTags, boxNodeIdFilesBody.fileTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, fileAttributes, fileTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxNodeIdFilesBody {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    fileAttributes: ").append(toIndentedString(fileAttributes)).append("\n");
    sb.append("    fileTags: ").append(toIndentedString(fileTags)).append("\n");
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
