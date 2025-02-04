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
 * BoxRelation
 */



public class BoxRelation {
  @JsonProperty("deepBoxNodeId")
  private String deepBoxNodeId = null;

  @JsonProperty("deepBoxName")
  private String deepBoxName = null;

  @JsonProperty("boxNodeId")
  private String boxNodeId = null;

  @JsonProperty("boxName")
  private String boxName = null;

  @JsonProperty("boxType")
  private String boxType = null;

  @JsonProperty("boxVariant")
  private String boxVariant = null;

  public BoxRelation deepBoxNodeId(String deepBoxNodeId) {
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

  public BoxRelation deepBoxName(String deepBoxName) {
    this.deepBoxName = deepBoxName;
    return this;
  }

   /**
   * Get deepBoxName
   * @return deepBoxName
  **/
  @Schema(description = "")
  public String getDeepBoxName() {
    return deepBoxName;
  }

  public void setDeepBoxName(String deepBoxName) {
    this.deepBoxName = deepBoxName;
  }

  public BoxRelation boxNodeId(String boxNodeId) {
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

  public BoxRelation boxName(String boxName) {
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

  public BoxRelation boxType(String boxType) {
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

  public BoxRelation boxVariant(String boxVariant) {
    this.boxVariant = boxVariant;
    return this;
  }

   /**
   * Box Variant. null is simple box.
   * @return boxVariant
  **/
  @Schema(description = "Box Variant. null is simple box.")
  public String getBoxVariant() {
    return boxVariant;
  }

  public void setBoxVariant(String boxVariant) {
    this.boxVariant = boxVariant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxRelation boxRelation = (BoxRelation) o;
    return Objects.equals(this.deepBoxNodeId, boxRelation.deepBoxNodeId) &&
        Objects.equals(this.deepBoxName, boxRelation.deepBoxName) &&
        Objects.equals(this.boxNodeId, boxRelation.boxNodeId) &&
        Objects.equals(this.boxName, boxRelation.boxName) &&
        Objects.equals(this.boxType, boxRelation.boxType) &&
        Objects.equals(this.boxVariant, boxRelation.boxVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepBoxNodeId, deepBoxName, boxNodeId, boxName, boxType, boxVariant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxRelation {\n");
    
    sb.append("    deepBoxNodeId: ").append(toIndentedString(deepBoxNodeId)).append("\n");
    sb.append("    deepBoxName: ").append(toIndentedString(deepBoxName)).append("\n");
    sb.append("    boxNodeId: ").append(toIndentedString(boxNodeId)).append("\n");
    sb.append("    boxName: ").append(toIndentedString(boxName)).append("\n");
    sb.append("    boxType: ").append(toIndentedString(boxType)).append("\n");
    sb.append("    boxVariant: ").append(toIndentedString(boxVariant)).append("\n");
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
