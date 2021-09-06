/*
 * Files.com API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@files.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.brick.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * Show History Export
 */
@Schema(description = "Show History Export")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-25T22:25:43.390877+02:00[Europe/Paris]")
public class HistoryExportEntity {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("history_version")
  private String historyVersion = null;

  @JsonProperty("start_at")
  private DateTime startAt = null;

  @JsonProperty("end_at")
  private DateTime endAt = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("query_action")
  private String queryAction = null;

  @JsonProperty("query_interface")
  private String queryInterface = null;

  @JsonProperty("query_user_id")
  private String queryUserId = null;

  @JsonProperty("query_file_id")
  private String queryFileId = null;

  @JsonProperty("query_parent_id")
  private String queryParentId = null;

  @JsonProperty("query_path")
  private String queryPath = null;

  @JsonProperty("query_folder")
  private String queryFolder = null;

  @JsonProperty("query_src")
  private String querySrc = null;

  @JsonProperty("query_destination")
  private String queryDestination = null;

  @JsonProperty("query_ip")
  private String queryIp = null;

  @JsonProperty("query_username")
  private String queryUsername = null;

  @JsonProperty("query_failure_type")
  private String queryFailureType = null;

  @JsonProperty("query_target_id")
  private String queryTargetId = null;

  @JsonProperty("query_target_name")
  private String queryTargetName = null;

  @JsonProperty("query_target_permission")
  private String queryTargetPermission = null;

  @JsonProperty("query_target_user_id")
  private String queryTargetUserId = null;

  @JsonProperty("query_target_username")
  private String queryTargetUsername = null;

  @JsonProperty("query_target_platform")
  private String queryTargetPlatform = null;

  @JsonProperty("query_target_permission_set")
  private String queryTargetPermissionSet = null;

  @JsonProperty("results_url")
  private String resultsUrl = null;

  public HistoryExportEntity id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * History Export ID
   * @return id
  **/
  @Schema(example = "1", description = "History Export ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public HistoryExportEntity historyVersion(String historyVersion) {
    this.historyVersion = historyVersion;
    return this;
  }

   /**
   * Version of the history for the export.
   * @return historyVersion
  **/
  @Schema(example = "20201213.2", description = "Version of the history for the export.")
  public String getHistoryVersion() {
    return historyVersion;
  }

  public void setHistoryVersion(String historyVersion) {
    this.historyVersion = historyVersion;
  }

  public HistoryExportEntity startAt(DateTime startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Start date/time of export range.
   * @return startAt
  **/
  @Schema(description = "Start date/time of export range.")
  public DateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(DateTime startAt) {
    this.startAt = startAt;
  }

  public HistoryExportEntity endAt(DateTime endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * End date/time of export range.
   * @return endAt
  **/
  @Schema(description = "End date/time of export range.")
  public DateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(DateTime endAt) {
    this.endAt = endAt;
  }

  public HistoryExportEntity status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of export.  Will be: &#x60;building&#x60;, &#x60;ready&#x60;, or &#x60;failed&#x60;
   * @return status
  **/
  @Schema(example = "ready", description = "Status of export.  Will be: `building`, `ready`, or `failed`")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public HistoryExportEntity queryAction(String queryAction) {
    this.queryAction = queryAction;
    return this;
  }

   /**
   * Filter results by this this action type. Valid values: &#x60;create&#x60;, &#x60;read&#x60;, &#x60;update&#x60;, &#x60;destroy&#x60;, &#x60;move&#x60;, &#x60;login&#x60;, &#x60;failedlogin&#x60;, &#x60;copy&#x60;, &#x60;user_create&#x60;, &#x60;user_update&#x60;, &#x60;user_destroy&#x60;, &#x60;group_create&#x60;, &#x60;group_update&#x60;, &#x60;group_destroy&#x60;, &#x60;permission_create&#x60;, &#x60;permission_destroy&#x60;, &#x60;api_key_create&#x60;, &#x60;api_key_update&#x60;, &#x60;api_key_destroy&#x60;
   * @return queryAction
  **/
  @Schema(example = "read", description = "Filter results by this this action type. Valid values: `create`, `read`, `update`, `destroy`, `move`, `login`, `failedlogin`, `copy`, `user_create`, `user_update`, `user_destroy`, `group_create`, `group_update`, `group_destroy`, `permission_create`, `permission_destroy`, `api_key_create`, `api_key_update`, `api_key_destroy`")
  public String getQueryAction() {
    return queryAction;
  }

  public void setQueryAction(String queryAction) {
    this.queryAction = queryAction;
  }

  public HistoryExportEntity queryInterface(String queryInterface) {
    this.queryInterface = queryInterface;
    return this;
  }

   /**
   * Filter results by this this interface type. Valid values: &#x60;web&#x60;, &#x60;ftp&#x60;, &#x60;robot&#x60;, &#x60;jsapi&#x60;, &#x60;webdesktopapi&#x60;, &#x60;sftp&#x60;, &#x60;dav&#x60;, &#x60;desktop&#x60;, &#x60;restapi&#x60;, &#x60;scim&#x60;, &#x60;office&#x60;
   * @return queryInterface
  **/
  @Schema(example = "ftp", description = "Filter results by this this interface type. Valid values: `web`, `ftp`, `robot`, `jsapi`, `webdesktopapi`, `sftp`, `dav`, `desktop`, `restapi`, `scim`, `office`")
  public String getQueryInterface() {
    return queryInterface;
  }

  public void setQueryInterface(String queryInterface) {
    this.queryInterface = queryInterface;
  }

  public HistoryExportEntity queryUserId(String queryUserId) {
    this.queryUserId = queryUserId;
    return this;
  }

   /**
   * Return results that are actions performed by the user indiciated by this User ID
   * @return queryUserId
  **/
  @Schema(example = "1", description = "Return results that are actions performed by the user indiciated by this User ID")
  public String getQueryUserId() {
    return queryUserId;
  }

  public void setQueryUserId(String queryUserId) {
    this.queryUserId = queryUserId;
  }

  public HistoryExportEntity queryFileId(String queryFileId) {
    this.queryFileId = queryFileId;
    return this;
  }

   /**
   * Return results that are file actions related to the file indicated by this File ID
   * @return queryFileId
  **/
  @Schema(example = "1", description = "Return results that are file actions related to the file indicated by this File ID")
  public String getQueryFileId() {
    return queryFileId;
  }

  public void setQueryFileId(String queryFileId) {
    this.queryFileId = queryFileId;
  }

  public HistoryExportEntity queryParentId(String queryParentId) {
    this.queryParentId = queryParentId;
    return this;
  }

   /**
   * Return results that are file actions inside the parent folder specified by this folder ID
   * @return queryParentId
  **/
  @Schema(example = "1", description = "Return results that are file actions inside the parent folder specified by this folder ID")
  public String getQueryParentId() {
    return queryParentId;
  }

  public void setQueryParentId(String queryParentId) {
    this.queryParentId = queryParentId;
  }

  public HistoryExportEntity queryPath(String queryPath) {
    this.queryPath = queryPath;
    return this;
  }

   /**
   * Return results that are file actions related to this path.
   * @return queryPath
  **/
  @Schema(example = "MyFile.txt", description = "Return results that are file actions related to this path.")
  public String getQueryPath() {
    return queryPath;
  }

  public void setQueryPath(String queryPath) {
    this.queryPath = queryPath;
  }

  public HistoryExportEntity queryFolder(String queryFolder) {
    this.queryFolder = queryFolder;
    return this;
  }

   /**
   * Return results that are file actions related to files or folders inside this folder path.
   * @return queryFolder
  **/
  @Schema(example = "Folder", description = "Return results that are file actions related to files or folders inside this folder path.")
  public String getQueryFolder() {
    return queryFolder;
  }

  public void setQueryFolder(String queryFolder) {
    this.queryFolder = queryFolder;
  }

  public HistoryExportEntity querySrc(String querySrc) {
    this.querySrc = querySrc;
    return this;
  }

   /**
   * Return results that are file moves originating from this path.
   * @return querySrc
  **/
  @Schema(example = "SrcFolder", description = "Return results that are file moves originating from this path.")
  public String getQuerySrc() {
    return querySrc;
  }

  public void setQuerySrc(String querySrc) {
    this.querySrc = querySrc;
  }

  public HistoryExportEntity queryDestination(String queryDestination) {
    this.queryDestination = queryDestination;
    return this;
  }

   /**
   * Return results that are file moves with this path as destination.
   * @return queryDestination
  **/
  @Schema(example = "DestFolder", description = "Return results that are file moves with this path as destination.")
  public String getQueryDestination() {
    return queryDestination;
  }

  public void setQueryDestination(String queryDestination) {
    this.queryDestination = queryDestination;
  }

  public HistoryExportEntity queryIp(String queryIp) {
    this.queryIp = queryIp;
    return this;
  }

   /**
   * Filter results by this IP address.
   * @return queryIp
  **/
  @Schema(example = "127.0.0.1", description = "Filter results by this IP address.")
  public String getQueryIp() {
    return queryIp;
  }

  public void setQueryIp(String queryIp) {
    this.queryIp = queryIp;
  }

  public HistoryExportEntity queryUsername(String queryUsername) {
    this.queryUsername = queryUsername;
    return this;
  }

   /**
   * Filter results by this username.
   * @return queryUsername
  **/
  @Schema(example = "jerry", description = "Filter results by this username.")
  public String getQueryUsername() {
    return queryUsername;
  }

  public void setQueryUsername(String queryUsername) {
    this.queryUsername = queryUsername;
  }

  public HistoryExportEntity queryFailureType(String queryFailureType) {
    this.queryFailureType = queryFailureType;
    return this;
  }

   /**
   * If searching for Histories about login failures, this parameter restricts results to failures of this specific type.  Valid values: &#x60;expired_trial&#x60;, &#x60;account_overdue&#x60;, &#x60;locked_out&#x60;, &#x60;ip_mismatch&#x60;, &#x60;password_mismatch&#x60;, &#x60;site_mismatch&#x60;, &#x60;username_not_found&#x60;, &#x60;none&#x60;, &#x60;no_ftp_permission&#x60;, &#x60;no_web_permission&#x60;, &#x60;no_directory&#x60;, &#x60;errno_enoent&#x60;, &#x60;no_sftp_permission&#x60;, &#x60;no_dav_permission&#x60;, &#x60;no_restapi_permission&#x60;, &#x60;key_mismatch&#x60;, &#x60;region_mismatch&#x60;, &#x60;expired_access&#x60;, &#x60;desktop_ip_mismatch&#x60;, &#x60;desktop_api_key_not_used_quickly_enough&#x60;, &#x60;disabled&#x60;, &#x60;country_mismatch&#x60;
   * @return queryFailureType
  **/
  @Schema(example = "bad_password", description = "If searching for Histories about login failures, this parameter restricts results to failures of this specific type.  Valid values: `expired_trial`, `account_overdue`, `locked_out`, `ip_mismatch`, `password_mismatch`, `site_mismatch`, `username_not_found`, `none`, `no_ftp_permission`, `no_web_permission`, `no_directory`, `errno_enoent`, `no_sftp_permission`, `no_dav_permission`, `no_restapi_permission`, `key_mismatch`, `region_mismatch`, `expired_access`, `desktop_ip_mismatch`, `desktop_api_key_not_used_quickly_enough`, `disabled`, `country_mismatch`")
  public String getQueryFailureType() {
    return queryFailureType;
  }

  public void setQueryFailureType(String queryFailureType) {
    this.queryFailureType = queryFailureType;
  }

  public HistoryExportEntity queryTargetId(String queryTargetId) {
    this.queryTargetId = queryTargetId;
    return this;
  }

   /**
   * If searching for Histories about specific objects (such as Users, or API Keys), this paremeter restricts results to objects that match this ID.
   * @return queryTargetId
  **/
  @Schema(example = "1", description = "If searching for Histories about specific objects (such as Users, or API Keys), this paremeter restricts results to objects that match this ID.")
  public String getQueryTargetId() {
    return queryTargetId;
  }

  public void setQueryTargetId(String queryTargetId) {
    this.queryTargetId = queryTargetId;
  }

  public HistoryExportEntity queryTargetName(String queryTargetName) {
    this.queryTargetName = queryTargetName;
    return this;
  }

   /**
   * If searching for Histories about Users, Groups or other objects with names, this parameter restricts results to objects with this name/username.
   * @return queryTargetName
  **/
  @Schema(example = "full", description = "If searching for Histories about Users, Groups or other objects with names, this parameter restricts results to objects with this name/username.")
  public String getQueryTargetName() {
    return queryTargetName;
  }

  public void setQueryTargetName(String queryTargetName) {
    this.queryTargetName = queryTargetName;
  }

  public HistoryExportEntity queryTargetPermission(String queryTargetPermission) {
    this.queryTargetPermission = queryTargetPermission;
    return this;
  }

   /**
   * If searching for Histories about Permisisons, this parameter restricts results to permissions of this level.
   * @return queryTargetPermission
  **/
  @Schema(example = "full", description = "If searching for Histories about Permisisons, this parameter restricts results to permissions of this level.")
  public String getQueryTargetPermission() {
    return queryTargetPermission;
  }

  public void setQueryTargetPermission(String queryTargetPermission) {
    this.queryTargetPermission = queryTargetPermission;
  }

  public HistoryExportEntity queryTargetUserId(String queryTargetUserId) {
    this.queryTargetUserId = queryTargetUserId;
    return this;
  }

   /**
   * If searching for Histories about API keys, this parameter restricts results to API keys created by/for this user ID.
   * @return queryTargetUserId
  **/
  @Schema(example = "1", description = "If searching for Histories about API keys, this parameter restricts results to API keys created by/for this user ID.")
  public String getQueryTargetUserId() {
    return queryTargetUserId;
  }

  public void setQueryTargetUserId(String queryTargetUserId) {
    this.queryTargetUserId = queryTargetUserId;
  }

  public HistoryExportEntity queryTargetUsername(String queryTargetUsername) {
    this.queryTargetUsername = queryTargetUsername;
    return this;
  }

   /**
   * If searching for Histories about API keys, this parameter restricts results to API keys created by/for this username.
   * @return queryTargetUsername
  **/
  @Schema(example = "jerry", description = "If searching for Histories about API keys, this parameter restricts results to API keys created by/for this username.")
  public String getQueryTargetUsername() {
    return queryTargetUsername;
  }

  public void setQueryTargetUsername(String queryTargetUsername) {
    this.queryTargetUsername = queryTargetUsername;
  }

  public HistoryExportEntity queryTargetPlatform(String queryTargetPlatform) {
    this.queryTargetPlatform = queryTargetPlatform;
    return this;
  }

   /**
   * If searching for Histories about API keys, this parameter restricts results to API keys associated with this platform.
   * @return queryTargetPlatform
  **/
  @Schema(example = "windows", description = "If searching for Histories about API keys, this parameter restricts results to API keys associated with this platform.")
  public String getQueryTargetPlatform() {
    return queryTargetPlatform;
  }

  public void setQueryTargetPlatform(String queryTargetPlatform) {
    this.queryTargetPlatform = queryTargetPlatform;
  }

  public HistoryExportEntity queryTargetPermissionSet(String queryTargetPermissionSet) {
    this.queryTargetPermissionSet = queryTargetPermissionSet;
    return this;
  }

   /**
   * If searching for Histories about API keys, this parameter restricts results to API keys with this permission set.
   * @return queryTargetPermissionSet
  **/
  @Schema(example = "desktop_app", description = "If searching for Histories about API keys, this parameter restricts results to API keys with this permission set.")
  public String getQueryTargetPermissionSet() {
    return queryTargetPermissionSet;
  }

  public void setQueryTargetPermissionSet(String queryTargetPermissionSet) {
    this.queryTargetPermissionSet = queryTargetPermissionSet;
  }

  public HistoryExportEntity resultsUrl(String resultsUrl) {
    this.resultsUrl = resultsUrl;
    return this;
  }

   /**
   * If &#x60;status&#x60; is &#x60;ready&#x60;, this will be a URL where all the results can be downloaded at once as a CSV.
   * @return resultsUrl
  **/
  @Schema(example = "https://files.com/history_results.csv", description = "If `status` is `ready`, this will be a URL where all the results can be downloaded at once as a CSV.")
  public String getResultsUrl() {
    return resultsUrl;
  }

  public void setResultsUrl(String resultsUrl) {
    this.resultsUrl = resultsUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryExportEntity historyExportEntity = (HistoryExportEntity) o;
    return Objects.equals(this.id, historyExportEntity.id) &&
        Objects.equals(this.historyVersion, historyExportEntity.historyVersion) &&
        Objects.equals(this.startAt, historyExportEntity.startAt) &&
        Objects.equals(this.endAt, historyExportEntity.endAt) &&
        Objects.equals(this.status, historyExportEntity.status) &&
        Objects.equals(this.queryAction, historyExportEntity.queryAction) &&
        Objects.equals(this.queryInterface, historyExportEntity.queryInterface) &&
        Objects.equals(this.queryUserId, historyExportEntity.queryUserId) &&
        Objects.equals(this.queryFileId, historyExportEntity.queryFileId) &&
        Objects.equals(this.queryParentId, historyExportEntity.queryParentId) &&
        Objects.equals(this.queryPath, historyExportEntity.queryPath) &&
        Objects.equals(this.queryFolder, historyExportEntity.queryFolder) &&
        Objects.equals(this.querySrc, historyExportEntity.querySrc) &&
        Objects.equals(this.queryDestination, historyExportEntity.queryDestination) &&
        Objects.equals(this.queryIp, historyExportEntity.queryIp) &&
        Objects.equals(this.queryUsername, historyExportEntity.queryUsername) &&
        Objects.equals(this.queryFailureType, historyExportEntity.queryFailureType) &&
        Objects.equals(this.queryTargetId, historyExportEntity.queryTargetId) &&
        Objects.equals(this.queryTargetName, historyExportEntity.queryTargetName) &&
        Objects.equals(this.queryTargetPermission, historyExportEntity.queryTargetPermission) &&
        Objects.equals(this.queryTargetUserId, historyExportEntity.queryTargetUserId) &&
        Objects.equals(this.queryTargetUsername, historyExportEntity.queryTargetUsername) &&
        Objects.equals(this.queryTargetPlatform, historyExportEntity.queryTargetPlatform) &&
        Objects.equals(this.queryTargetPermissionSet, historyExportEntity.queryTargetPermissionSet) &&
        Objects.equals(this.resultsUrl, historyExportEntity.resultsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, historyVersion, startAt, endAt, status, queryAction, queryInterface, queryUserId, queryFileId, queryParentId, queryPath, queryFolder, querySrc, queryDestination, queryIp, queryUsername, queryFailureType, queryTargetId, queryTargetName, queryTargetPermission, queryTargetUserId, queryTargetUsername, queryTargetPlatform, queryTargetPermissionSet, resultsUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryExportEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    historyVersion: ").append(toIndentedString(historyVersion)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    queryAction: ").append(toIndentedString(queryAction)).append("\n");
    sb.append("    queryInterface: ").append(toIndentedString(queryInterface)).append("\n");
    sb.append("    queryUserId: ").append(toIndentedString(queryUserId)).append("\n");
    sb.append("    queryFileId: ").append(toIndentedString(queryFileId)).append("\n");
    sb.append("    queryParentId: ").append(toIndentedString(queryParentId)).append("\n");
    sb.append("    queryPath: ").append(toIndentedString(queryPath)).append("\n");
    sb.append("    queryFolder: ").append(toIndentedString(queryFolder)).append("\n");
    sb.append("    querySrc: ").append(toIndentedString(querySrc)).append("\n");
    sb.append("    queryDestination: ").append(toIndentedString(queryDestination)).append("\n");
    sb.append("    queryIp: ").append(toIndentedString(queryIp)).append("\n");
    sb.append("    queryUsername: ").append(toIndentedString(queryUsername)).append("\n");
    sb.append("    queryFailureType: ").append(toIndentedString(queryFailureType)).append("\n");
    sb.append("    queryTargetId: ").append(toIndentedString(queryTargetId)).append("\n");
    sb.append("    queryTargetName: ").append(toIndentedString(queryTargetName)).append("\n");
    sb.append("    queryTargetPermission: ").append(toIndentedString(queryTargetPermission)).append("\n");
    sb.append("    queryTargetUserId: ").append(toIndentedString(queryTargetUserId)).append("\n");
    sb.append("    queryTargetUsername: ").append(toIndentedString(queryTargetUsername)).append("\n");
    sb.append("    queryTargetPlatform: ").append(toIndentedString(queryTargetPlatform)).append("\n");
    sb.append("    queryTargetPermissionSet: ").append(toIndentedString(queryTargetPermissionSet)).append("\n");
    sb.append("    resultsUrl: ").append(toIndentedString(resultsUrl)).append("\n");
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