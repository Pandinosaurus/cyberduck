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
import ch.cyberduck.core.storegate.io.swagger.client.model.PaymentMethod;
import ch.cyberduck.core.storegate.io.swagger.client.model.PaymentPeriod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-18T14:15:21.736+02:00")



public class PaymentInfo {
  @JsonProperty("paymentMethodId")
  private String paymentMethodId = null;

  @JsonProperty("paymentPeriodId")
  private String paymentPeriodId = null;

  @JsonProperty("paymentMethods")
  private List<PaymentMethod> paymentMethods = null;

  @JsonProperty("paymentPeriods")
  private List<PaymentPeriod> paymentPeriods = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("isCompany")
  private Boolean isCompany = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("coAddress")
  private String coAddress = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("eInvoice")
  private Boolean eInvoice = null;

  @JsonProperty("hasRegNumber")
  private Boolean hasRegNumber = null;

  @JsonProperty("vatNumber")
  private String vatNumber = null;

  @JsonProperty("creditCardNumber")
  private String creditCardNumber = null;

  @JsonProperty("redirectUrl")
  private String redirectUrl = null;

  public PaymentInfo paymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * 
   * @return paymentMethodId
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public PaymentInfo paymentPeriodId(String paymentPeriodId) {
    this.paymentPeriodId = paymentPeriodId;
    return this;
  }

   /**
   * 
   * @return paymentPeriodId
  **/
  @ApiModelProperty(value = "")
  public String getPaymentPeriodId() {
    return paymentPeriodId;
  }

  public void setPaymentPeriodId(String paymentPeriodId) {
    this.paymentPeriodId = paymentPeriodId;
  }

  public PaymentInfo paymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentInfo addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * 
   * @return paymentMethods
  **/
  @ApiModelProperty(value = "")
  public List<PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public PaymentInfo paymentPeriods(List<PaymentPeriod> paymentPeriods) {
    this.paymentPeriods = paymentPeriods;
    return this;
  }

  public PaymentInfo addPaymentPeriodsItem(PaymentPeriod paymentPeriodsItem) {
    if (this.paymentPeriods == null) {
      this.paymentPeriods = new ArrayList<>();
    }
    this.paymentPeriods.add(paymentPeriodsItem);
    return this;
  }

   /**
   * 
   * @return paymentPeriods
  **/
  @ApiModelProperty(value = "")
  public List<PaymentPeriod> getPaymentPeriods() {
    return paymentPeriods;
  }

  public void setPaymentPeriods(List<PaymentPeriod> paymentPeriods) {
    this.paymentPeriods = paymentPeriods;
  }

  public PaymentInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * 
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PaymentInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * 
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PaymentInfo company(String company) {
    this.company = company;
    return this;
  }

   /**
   * 
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public PaymentInfo country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PaymentInfo isCompany(Boolean isCompany) {
    this.isCompany = isCompany;
    return this;
  }

   /**
   * 
   * @return isCompany
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCompany() {
    return isCompany;
  }

  public void setIsCompany(Boolean isCompany) {
    this.isCompany = isCompany;
  }

  public PaymentInfo reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * 
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PaymentInfo coAddress(String coAddress) {
    this.coAddress = coAddress;
    return this;
  }

   /**
   * 
   * @return coAddress
  **/
  @ApiModelProperty(value = "")
  public String getCoAddress() {
    return coAddress;
  }

  public void setCoAddress(String coAddress) {
    this.coAddress = coAddress;
  }

  public PaymentInfo address(String address) {
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PaymentInfo zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * 
   * @return zipCode
  **/
  @ApiModelProperty(value = "")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public PaymentInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PaymentInfo eInvoice(Boolean eInvoice) {
    this.eInvoice = eInvoice;
    return this;
  }

   /**
   * 
   * @return eInvoice
  **/
  @ApiModelProperty(value = "")
  public Boolean isEInvoice() {
    return eInvoice;
  }

  public void setEInvoice(Boolean eInvoice) {
    this.eInvoice = eInvoice;
  }

  public PaymentInfo hasRegNumber(Boolean hasRegNumber) {
    this.hasRegNumber = hasRegNumber;
    return this;
  }

   /**
   * 
   * @return hasRegNumber
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasRegNumber() {
    return hasRegNumber;
  }

  public void setHasRegNumber(Boolean hasRegNumber) {
    this.hasRegNumber = hasRegNumber;
  }

  public PaymentInfo vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * 
   * @return vatNumber
  **/
  @ApiModelProperty(value = "")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public PaymentInfo creditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
    return this;
  }

   /**
   * 
   * @return creditCardNumber
  **/
  @ApiModelProperty(value = "")
  public String getCreditCardNumber() {
    return creditCardNumber;
  }

  public void setCreditCardNumber(String creditCardNumber) {
    this.creditCardNumber = creditCardNumber;
  }

  public PaymentInfo redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * 
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInfo paymentInfo = (PaymentInfo) o;
    return Objects.equals(this.paymentMethodId, paymentInfo.paymentMethodId) &&
        Objects.equals(this.paymentPeriodId, paymentInfo.paymentPeriodId) &&
        Objects.equals(this.paymentMethods, paymentInfo.paymentMethods) &&
        Objects.equals(this.paymentPeriods, paymentInfo.paymentPeriods) &&
        Objects.equals(this.firstName, paymentInfo.firstName) &&
        Objects.equals(this.lastName, paymentInfo.lastName) &&
        Objects.equals(this.company, paymentInfo.company) &&
        Objects.equals(this.country, paymentInfo.country) &&
        Objects.equals(this.isCompany, paymentInfo.isCompany) &&
        Objects.equals(this.reference, paymentInfo.reference) &&
        Objects.equals(this.coAddress, paymentInfo.coAddress) &&
        Objects.equals(this.address, paymentInfo.address) &&
        Objects.equals(this.zipCode, paymentInfo.zipCode) &&
        Objects.equals(this.city, paymentInfo.city) &&
        Objects.equals(this.eInvoice, paymentInfo.eInvoice) &&
        Objects.equals(this.hasRegNumber, paymentInfo.hasRegNumber) &&
        Objects.equals(this.vatNumber, paymentInfo.vatNumber) &&
        Objects.equals(this.creditCardNumber, paymentInfo.creditCardNumber) &&
        Objects.equals(this.redirectUrl, paymentInfo.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodId, paymentPeriodId, paymentMethods, paymentPeriods, firstName, lastName, company, country, isCompany, reference, coAddress, address, zipCode, city, eInvoice, hasRegNumber, vatNumber, creditCardNumber, redirectUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInfo {\n");
    
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    paymentPeriodId: ").append(toIndentedString(paymentPeriodId)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    paymentPeriods: ").append(toIndentedString(paymentPeriods)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    isCompany: ").append(toIndentedString(isCompany)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    coAddress: ").append(toIndentedString(coAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    eInvoice: ").append(toIndentedString(eInvoice)).append("\n");
    sb.append("    hasRegNumber: ").append(toIndentedString(hasRegNumber)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    creditCardNumber: ").append(toIndentedString(creditCardNumber)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

