package cn.test.sandbox.core.model;

import java.util.Objects;
import cn.test.sandbox.core.model.AuthorizedProductList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LicensePortalDetails
 */
@Validated


public class LicensePortalDetails   {
  @JsonProperty("currentUser")
  private String currentUser = null;

  @JsonProperty("partnerName")
  private String partnerName = null;

  @JsonProperty("partnerStatus")
  private String partnerStatus = null;

  @JsonProperty("partnerEmail")
  private String partnerEmail = null;

  @JsonProperty("partnerPhoneNumber")
  private String partnerPhoneNumber = null;

  @JsonProperty("partnerRepresentative")
  private String partnerRepresentative = null;

  @JsonProperty("authorizedTo")
  private String authorizedTo = null;

  @JsonProperty("authorizedProductList")
  private AuthorizedProductList authorizedProductList = null;

  public LicensePortalDetails currentUser(String currentUser) {
    this.currentUser = currentUser;
    return this;
  }

  /**
   * Get currentUser
   * @return currentUser
   **/
  @Schema(description = "")
  
    public String getCurrentUser() {
    return currentUser;
  }

  public void setCurrentUser(String currentUser) {
    this.currentUser = currentUser;
  }

  public LicensePortalDetails partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * Get partnerName
   * @return partnerName
   **/
  @Schema(description = "")
  
    public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public LicensePortalDetails partnerStatus(String partnerStatus) {
    this.partnerStatus = partnerStatus;
    return this;
  }

  /**
   * Get partnerStatus
   * @return partnerStatus
   **/
  @Schema(description = "")
  
    public String getPartnerStatus() {
    return partnerStatus;
  }

  public void setPartnerStatus(String partnerStatus) {
    this.partnerStatus = partnerStatus;
  }

  public LicensePortalDetails partnerEmail(String partnerEmail) {
    this.partnerEmail = partnerEmail;
    return this;
  }

  /**
   * Get partnerEmail
   * @return partnerEmail
   **/
  @Schema(description = "")
  
    public String getPartnerEmail() {
    return partnerEmail;
  }

  public void setPartnerEmail(String partnerEmail) {
    this.partnerEmail = partnerEmail;
  }

  public LicensePortalDetails partnerPhoneNumber(String partnerPhoneNumber) {
    this.partnerPhoneNumber = partnerPhoneNumber;
    return this;
  }

  /**
   * Get partnerPhoneNumber
   * @return partnerPhoneNumber
   **/
  @Schema(description = "")
  
    public String getPartnerPhoneNumber() {
    return partnerPhoneNumber;
  }

  public void setPartnerPhoneNumber(String partnerPhoneNumber) {
    this.partnerPhoneNumber = partnerPhoneNumber;
  }

  public LicensePortalDetails partnerRepresentative(String partnerRepresentative) {
    this.partnerRepresentative = partnerRepresentative;
    return this;
  }

  /**
   * Get partnerRepresentative
   * @return partnerRepresentative
   **/
  @Schema(description = "")
  
    public String getPartnerRepresentative() {
    return partnerRepresentative;
  }

  public void setPartnerRepresentative(String partnerRepresentative) {
    this.partnerRepresentative = partnerRepresentative;
  }

  public LicensePortalDetails authorizedTo(String authorizedTo) {
    this.authorizedTo = authorizedTo;
    return this;
  }

  /**
   * Get authorizedTo
   * @return authorizedTo
   **/
  @Schema(description = "")
  
    public String getAuthorizedTo() {
    return authorizedTo;
  }

  public void setAuthorizedTo(String authorizedTo) {
    this.authorizedTo = authorizedTo;
  }

  public LicensePortalDetails authorizedProductList(AuthorizedProductList authorizedProductList) {
    this.authorizedProductList = authorizedProductList;
    return this;
  }

  /**
   * Get authorizedProductList
   * @return authorizedProductList
   **/
  @Schema(description = "")
  
    @Valid
    public AuthorizedProductList getAuthorizedProductList() {
    return authorizedProductList;
  }

  public void setAuthorizedProductList(AuthorizedProductList authorizedProductList) {
    this.authorizedProductList = authorizedProductList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicensePortalDetails licensePortalDetails = (LicensePortalDetails) o;
    return Objects.equals(this.currentUser, licensePortalDetails.currentUser) &&
        Objects.equals(this.partnerName, licensePortalDetails.partnerName) &&
        Objects.equals(this.partnerStatus, licensePortalDetails.partnerStatus) &&
        Objects.equals(this.partnerEmail, licensePortalDetails.partnerEmail) &&
        Objects.equals(this.partnerPhoneNumber, licensePortalDetails.partnerPhoneNumber) &&
        Objects.equals(this.partnerRepresentative, licensePortalDetails.partnerRepresentative) &&
        Objects.equals(this.authorizedTo, licensePortalDetails.authorizedTo) &&
        Objects.equals(this.authorizedProductList, licensePortalDetails.authorizedProductList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentUser, partnerName, partnerStatus, partnerEmail, partnerPhoneNumber, partnerRepresentative, authorizedTo, authorizedProductList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicensePortalDetails {\n");
    
    sb.append("    currentUser: ").append(toIndentedString(currentUser)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    partnerStatus: ").append(toIndentedString(partnerStatus)).append("\n");
    sb.append("    partnerEmail: ").append(toIndentedString(partnerEmail)).append("\n");
    sb.append("    partnerPhoneNumber: ").append(toIndentedString(partnerPhoneNumber)).append("\n");
    sb.append("    partnerRepresentative: ").append(toIndentedString(partnerRepresentative)).append("\n");
    sb.append("    authorizedTo: ").append(toIndentedString(authorizedTo)).append("\n");
    sb.append("    authorizedProductList: ").append(toIndentedString(authorizedProductList)).append("\n");
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
