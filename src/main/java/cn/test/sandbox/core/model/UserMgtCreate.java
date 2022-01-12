package cn.test.sandbox.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserMgtCreate
 */
@Validated


public class UserMgtCreate   {
  @JsonProperty("userEmail")
  private String userEmail = null;

  @JsonProperty("userType")
  private String userType = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("partnerId")
  private String partnerId = null;

  @JsonProperty("organizationType")
  private String organizationType = null;

  @JsonProperty("roleIdList")
  @Valid
  private List<String> roleIdList = new ArrayList<String>();

  @JsonProperty("isSendEmail")
  private String isSendEmail = "true";

  public UserMgtCreate userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public UserMgtCreate userType(String userType) {
    this.userType = userType;
    return this;
  }

  /**
   * Get userType
   * @return userType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public UserMgtCreate phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   **/
  @Schema(description = "")
  
    public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UserMgtCreate companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UserMgtCreate partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Get partnerId
   * @return partnerId
   **/
  @Schema(description = "")
  
    public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public UserMgtCreate organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  /**
   * Get organizationType
   * @return organizationType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public UserMgtCreate roleIdList(List<String> roleIdList) {
    this.roleIdList = roleIdList;
    return this;
  }

  public UserMgtCreate addRoleIdListItem(String roleIdListItem) {
    this.roleIdList.add(roleIdListItem);
    return this;
  }

  /**
   * Get roleIdList
   * @return roleIdList
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getRoleIdList() {
    return roleIdList;
  }

  public void setRoleIdList(List<String> roleIdList) {
    this.roleIdList = roleIdList;
  }

  public UserMgtCreate isSendEmail(String isSendEmail) {
    this.isSendEmail = isSendEmail;
    return this;
  }

  /**
   * Get isSendEmail
   * @return isSendEmail
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getIsSendEmail() {
    return isSendEmail;
  }

  public void setIsSendEmail(String isSendEmail) {
    this.isSendEmail = isSendEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMgtCreate userMgtCreate = (UserMgtCreate) o;
    return Objects.equals(this.userEmail, userMgtCreate.userEmail) &&
        Objects.equals(this.userType, userMgtCreate.userType) &&
        Objects.equals(this.phoneNumber, userMgtCreate.phoneNumber) &&
        Objects.equals(this.companyName, userMgtCreate.companyName) &&
        Objects.equals(this.partnerId, userMgtCreate.partnerId) &&
        Objects.equals(this.organizationType, userMgtCreate.organizationType) &&
        Objects.equals(this.roleIdList, userMgtCreate.roleIdList) &&
        Objects.equals(this.isSendEmail, userMgtCreate.isSendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmail, userType, phoneNumber, companyName, partnerId, organizationType, roleIdList, isSendEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMgtCreate {\n");
    
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    roleIdList: ").append(toIndentedString(roleIdList)).append("\n");
    sb.append("    isSendEmail: ").append(toIndentedString(isSendEmail)).append("\n");
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
