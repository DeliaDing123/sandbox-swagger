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
 * AuthUserLogonResp
 */
@Validated


public class AuthUserLogonResp   {
  @JsonProperty("userEmail")
  private String userEmail = null;

  @JsonProperty("userToken")
  private String userToken = null;

  @JsonProperty("isResetPwdRequired")
  private Boolean isResetPwdRequired = null;

  @JsonProperty("permissionIdList")
  @Valid
  private List<String> permissionIdList = null;

  public AuthUserLogonResp userEmail(String userEmail) {
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

  public AuthUserLogonResp userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

  /**
   * Get userToken
   * @return userToken
   **/
  @Schema(description = "")
  
    public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }

  public AuthUserLogonResp isResetPwdRequired(Boolean isResetPwdRequired) {
    this.isResetPwdRequired = isResetPwdRequired;
    return this;
  }

  /**
   * Get isResetPwdRequired
   * @return isResetPwdRequired
   **/
  @Schema(description = "")
  
    public Boolean isIsResetPwdRequired() {
    return isResetPwdRequired;
  }

  public void setIsResetPwdRequired(Boolean isResetPwdRequired) {
    this.isResetPwdRequired = isResetPwdRequired;
  }

  public AuthUserLogonResp permissionIdList(List<String> permissionIdList) {
    this.permissionIdList = permissionIdList;
    return this;
  }

  public AuthUserLogonResp addPermissionIdListItem(String permissionIdListItem) {
    if (this.permissionIdList == null) {
      this.permissionIdList = new ArrayList<String>();
    }
    this.permissionIdList.add(permissionIdListItem);
    return this;
  }

  /**
   * Get permissionIdList
   * @return permissionIdList
   **/
  @Schema(description = "")
  
    public List<String> getPermissionIdList() {
    return permissionIdList;
  }

  public void setPermissionIdList(List<String> permissionIdList) {
    this.permissionIdList = permissionIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthUserLogonResp authUserLogonResp = (AuthUserLogonResp) o;
    return Objects.equals(this.userEmail, authUserLogonResp.userEmail) &&
        Objects.equals(this.userToken, authUserLogonResp.userToken) &&
        Objects.equals(this.isResetPwdRequired, authUserLogonResp.isResetPwdRequired) &&
        Objects.equals(this.permissionIdList, authUserLogonResp.permissionIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmail, userToken, isResetPwdRequired, permissionIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUserLogonResp {\n");
    
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    isResetPwdRequired: ").append(toIndentedString(isResetPwdRequired)).append("\n");
    sb.append("    permissionIdList: ").append(toIndentedString(permissionIdList)).append("\n");
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
