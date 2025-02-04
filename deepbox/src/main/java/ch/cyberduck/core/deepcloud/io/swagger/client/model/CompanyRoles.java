/*
 * DeepAdmin API
 * General API for DeepCloud Admin / Subscription Service
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@deepcloud.swiss
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.deepcloud.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.deepcloud.io.swagger.client.model.Address;
import ch.cyberduck.core.deepcloud.io.swagger.client.model.StructureEnum;
import ch.cyberduck.core.deepcloud.io.swagger.client.model.VerificationProcessStatusEnum;
import ch.cyberduck.core.deepcloud.io.swagger.client.model.VerificationStateEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * CompanyRoles
 */



public class CompanyRoles {
  @JsonProperty("group_id")
  private String groupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("default_address")
  private Address defaultAddress = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  @JsonProperty("logo")
  private String logo = null;

  @JsonProperty("roles")
  private List<String> roles = new ArrayList<>();

  @JsonProperty("verification_state")
  private VerificationStateEnum verificationState = null;

  @JsonProperty("verification_process_status")
  private VerificationProcessStatusEnum verificationProcessStatus = null;

  @JsonProperty("structure")
  private StructureEnum structure = null;

   /**
   * Get groupId
   * @return groupId
  **/
  @Schema(required = true, description = "")
  public String getGroupId() {
    return groupId;
  }

  public CompanyRoles name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A unique email address (which could not exist) to reference this entity
   * @return name
  **/
  @Schema(required = true, description = "A unique email address (which could not exist) to reference this entity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CompanyRoles displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(required = true, description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CompanyRoles defaultAddress(Address defaultAddress) {
    this.defaultAddress = defaultAddress;
    return this;
  }

   /**
   * Get defaultAddress
   * @return defaultAddress
  **/
  @Schema(required = true, description = "")
  public Address getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(Address defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(required = true, description = "")
  public Object getMetadata() {
    return metadata;
  }

  public CompanyRoles logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * For reading, it returns the URL. For writing you need to provide the image base64 encoded, like \&quot;data:image/png;base64,&lt;BASE64_DATA&gt;\&quot;.
   * @return logo
  **/
  @Schema(description = "For reading, it returns the URL. For writing you need to provide the image base64 encoded, like \"data:image/png;base64,<BASE64_DATA>\".")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(required = true, description = "")
  public List<String> getRoles() {
    return roles;
  }

  public CompanyRoles verificationState(VerificationStateEnum verificationState) {
    this.verificationState = verificationState;
    return this;
  }

   /**
   * Get verificationState
   * @return verificationState
  **/
  @Schema(required = true, description = "")
  public VerificationStateEnum getVerificationState() {
    return verificationState;
  }

  public void setVerificationState(VerificationStateEnum verificationState) {
    this.verificationState = verificationState;
  }

  public CompanyRoles verificationProcessStatus(VerificationProcessStatusEnum verificationProcessStatus) {
    this.verificationProcessStatus = verificationProcessStatus;
    return this;
  }

   /**
   * Get verificationProcessStatus
   * @return verificationProcessStatus
  **/
  @Schema(required = true, description = "")
  public VerificationProcessStatusEnum getVerificationProcessStatus() {
    return verificationProcessStatus;
  }

  public void setVerificationProcessStatus(VerificationProcessStatusEnum verificationProcessStatus) {
    this.verificationProcessStatus = verificationProcessStatus;
  }

  public CompanyRoles structure(StructureEnum structure) {
    this.structure = structure;
    return this;
  }

   /**
   * Get structure
   * @return structure
  **/
  @Schema(description = "")
  public StructureEnum getStructure() {
    return structure;
  }

  public void setStructure(StructureEnum structure) {
    this.structure = structure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyRoles companyRoles = (CompanyRoles) o;
    return Objects.equals(this.groupId, companyRoles.groupId) &&
        Objects.equals(this.name, companyRoles.name) &&
        Objects.equals(this.displayName, companyRoles.displayName) &&
        Objects.equals(this.defaultAddress, companyRoles.defaultAddress) &&
        Objects.equals(this.metadata, companyRoles.metadata) &&
        Objects.equals(this.logo, companyRoles.logo) &&
        Objects.equals(this.roles, companyRoles.roles) &&
        Objects.equals(this.verificationState, companyRoles.verificationState) &&
        Objects.equals(this.verificationProcessStatus, companyRoles.verificationProcessStatus) &&
        Objects.equals(this.structure, companyRoles.structure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, name, displayName, defaultAddress, metadata, logo, roles, verificationState, verificationProcessStatus, structure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyRoles {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    defaultAddress: ").append(toIndentedString(defaultAddress)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    verificationState: ").append(toIndentedString(verificationState)).append("\n");
    sb.append("    verificationProcessStatus: ").append(toIndentedString(verificationProcessStatus)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
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
