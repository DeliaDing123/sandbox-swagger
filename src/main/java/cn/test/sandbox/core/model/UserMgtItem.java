package cn.test.sandbox.core.model;

import java.util.Objects;
import cn.test.sandbox.core.model.RoleMgtItem;
import cn.test.sandbox.core.model.UserStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserMgtItem
 */
@Validated


public class UserMgtItem   {
  @JsonProperty("userEmail")
  private String userEmail = null;

  @JsonProperty("userType")
  private String userType = null;

  @JsonProperty("userStatus")
  private UserStatus userStatus = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("partnerId")
  private String partnerId = null;

  @JsonProperty("organizationType")
  private String organizationType = null;

  @JsonProperty("roleList")
  @Valid
  private List<RoleMgtItem> roleList = null;

  public UserMgtItem userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
   **/
  @Schema(description = "")
  
    public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public UserMgtItem userType(String userType) {
    this.userType = userType;
    return this;
  }

  /**
   * Get userType
   * @return userType
   **/
  @Schema(description = "")
  
    public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public UserMgtItem userStatus(UserStatus userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
   **/
  @Schema(description = "")
  
    @Valid
    public UserStatus getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(UserStatus userStatus) {
    this.userStatus = userStatus;
  }

  public UserMgtItem phoneNumber(String phoneNumber) {
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

  public UserMgtItem companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
   **/
  @Schema(description = "")
  
    public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public UserMgtItem partnerId(String partnerId) {
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

  public UserMgtItem organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  /**
   * Get organizationType
   * @return organizationType
   **/
  @Schema(description = "")
  
    public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public UserMgtItem roleList(List<RoleMgtItem> roleList) {
    this.roleList = roleList;
    return this;
  }

  public UserMgtItem addRoleListItem(RoleMgtItem roleListItem) {
    if (this.roleList == null) {
      this.roleList = new ArrayList<RoleMgtItem>();
    }
    this.roleList.add(roleListItem);
    return this;
  }

  /**
   * Get roleList
   * @return roleList
   **/
  @Schema(description = "")
      @Valid
    public List<RoleMgtItem> getRoleList() {
    return roleList;
  }

  public void setRoleList(List<RoleMgtItem> roleList) {
    this.roleList = roleList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMgtItem userMgtItem = (UserMgtItem) o;
    return Objects.equals(this.userEmail, userMgtItem.userEmail) &&
        Objects.equals(this.userType, userMgtItem.userType) &&
        Objects.equals(this.userStatus, userMgtItem.userStatus) &&
        Objects.equals(this.phoneNumber, userMgtItem.phoneNumber) &&
        Objects.equals(this.companyName, userMgtItem.companyName) &&
        Objects.equals(this.partnerId, userMgtItem.partnerId) &&
        Objects.equals(this.organizationType, userMgtItem.organizationType) &&
        Objects.equals(this.roleList, userMgtItem.roleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmail, userType, userStatus, phoneNumber, companyName, partnerId, organizationType, roleList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMgtItem {\n");
    
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
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
