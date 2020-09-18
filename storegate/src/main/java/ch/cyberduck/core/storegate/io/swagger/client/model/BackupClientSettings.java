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
 * Contains setttings for a backup client.
 */
@ApiModel(description = "Contains setttings for a backup client.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T14:15:21.736+02:00")



public class BackupClientSettings {
  @JsonProperty("alertsEnabled")
  private Boolean alertsEnabled = null;

  @JsonProperty("reportsEnabled")
  private Boolean reportsEnabled = null;

  public BackupClientSettings alertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Get alertsEnabled
   * @return alertsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isAlertsEnabled() {
    return alertsEnabled;
  }

  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }

  public BackupClientSettings reportsEnabled(Boolean reportsEnabled) {
    this.reportsEnabled = reportsEnabled;
    return this;
  }

   /**
   * Get reportsEnabled
   * @return reportsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isReportsEnabled() {
    return reportsEnabled;
  }

  public void setReportsEnabled(Boolean reportsEnabled) {
    this.reportsEnabled = reportsEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupClientSettings backupClientSettings = (BackupClientSettings) o;
    return Objects.equals(this.alertsEnabled, backupClientSettings.alertsEnabled) &&
        Objects.equals(this.reportsEnabled, backupClientSettings.reportsEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertsEnabled, reportsEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupClientSettings {\n");
    
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    reportsEnabled: ").append(toIndentedString(reportsEnabled)).append("\n");
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

