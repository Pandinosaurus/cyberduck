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
/**
 * WatchAdd
 */



public class WatchAdd {
  @JsonProperty("recursive")
  private Boolean recursive = null;

  public WatchAdd recursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

   /**
   * true -&gt; watch also for changes in any subfolder
   * @return recursive
  **/
  @Schema(example = "false", description = "true -> watch also for changes in any subfolder")
  public Boolean isRecursive() {
    return recursive;
  }

  public void setRecursive(Boolean recursive) {
    this.recursive = recursive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchAdd watchAdd = (WatchAdd) o;
    return Objects.equals(this.recursive, watchAdd.recursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recursive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchAdd {\n");
    
    sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
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
