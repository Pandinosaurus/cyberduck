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
import org.joda.time.DateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T14:15:21.736+02:00")



public class User {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isAdmin")
  private Boolean isAdmin = null;

  @JsonProperty("isSubAdmin")
  private Boolean isSubAdmin = null;

  @JsonProperty("flags")
  private Integer flags = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("lastLogin")
  private DateTime lastLogin = null;

  @JsonProperty("ssn")
  private String ssn = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("company")
  private String company = null;

  public User id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The user id.
   * @return id
  **/
  @ApiModelProperty(value = "The user id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Is the user Admin
   * @return isAdmin
  **/
  @ApiModelProperty(value = "Is the user Admin")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public User isSubAdmin(Boolean isSubAdmin) {
    this.isSubAdmin = isSubAdmin;
    return this;
  }

   /**
   * Is the user Admin
   * @return isSubAdmin
  **/
  @ApiModelProperty(value = "Is the user Admin")
  public Boolean isIsSubAdmin() {
    return isSubAdmin;
  }

  public void setIsSubAdmin(Boolean isSubAdmin) {
    this.isSubAdmin = isSubAdmin;
  }

  public User flags(Integer flags) {
    this.flags = flags;
    return this;
  }

   /**
   * Account status (0 &#x3D; None, 1 &#x3D; TemporaryUser, 2 &#x3D; Disabled, 4 &#x3D; Pending, 8 &#x3D; LockedDuePayment, 16 &#x3D; RequireNewPassword, 32 &#x3D; TwoFactorEnabled, 64 &#x3D; UnVerified, 128 &#x3D; SingleSignOn, 256 &#x3D; ForceTwoFactor)
   * @return flags
  **/
  @ApiModelProperty(value = "Account status (0 = None, 1 = TemporaryUser, 2 = Disabled, 4 = Pending, 8 = LockedDuePayment, 16 = RequireNewPassword, 32 = TwoFactorEnabled, 64 = UnVerified, 128 = SingleSignOn, 256 = ForceTwoFactor)")
  public Integer getFlags() {
    return flags;
  }

  public void setFlags(Integer flags) {
    this.flags = flags;
  }

  public User created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * When the account was created.
   * @return created
  **/
  @ApiModelProperty(value = "When the account was created.")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public User lastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * When the user last was logged in.
   * @return lastLogin
  **/
  @ApiModelProperty(value = "When the user last was logged in.")
  public DateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public User ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

   /**
   * User SSN
   * @return ssn
  **/
  @ApiModelProperty(value = "User SSN")
  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The accounts e-mail address.
   * @return email
  **/
  @ApiModelProperty(value = "The accounts e-mail address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The account username.
   * @return username
  **/
  @ApiModelProperty(value = "The account username.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The users name.
   * @return firstName
  **/
  @ApiModelProperty(value = "The users name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The users surname.
   * @return lastName
  **/
  @ApiModelProperty(value = "The users surname.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User company(String company) {
    this.company = company;
    return this;
  }

   /**
   * The users company.
   * @return company
  **/
  @ApiModelProperty(value = "The users company.")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.isAdmin, user.isAdmin) &&
        Objects.equals(this.isSubAdmin, user.isSubAdmin) &&
        Objects.equals(this.flags, user.flags) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.ssn, user.ssn) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.company, user.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isAdmin, isSubAdmin, flags, created, lastLogin, ssn, email, username, firstName, lastName, company);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isSubAdmin: ").append(toIndentedString(isSubAdmin)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

