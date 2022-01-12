package cn.test.sandbox.core.model;

import java.util.Objects;
import cn.test.sandbox.core.model.PermissionMgtItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleMgtItem
 */
@Validated


public class RoleMgtItem   {
  @JsonProperty("roleId")
  private String roleId = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("roleDesc")
  private String roleDesc = null;

  @JsonProperty("roleType")
  private String roleType = null;

  @JsonProperty("permissionList")
  @Valid
  private List<PermissionMgtItem> permissionList = null;

  public RoleMgtItem roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
   **/
  @Schema(description = "")
  
    public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public RoleMgtItem roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
   **/
  @Schema(description = "")
  
    public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RoleMgtItem roleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
    return this;
  }

  /**
   * Get roleDesc
   * @return roleDesc
   **/
  @Schema(description = "")
  
    public String getRoleDesc() {
    return roleDesc;
  }

  public void setRoleDesc(String roleDesc) {
    this.roleDesc = roleDesc;
  }

  public RoleMgtItem roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * Get roleType
   * @return roleType
   **/
  @Schema(description = "")
  
    public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public RoleMgtItem permissionList(List<PermissionMgtItem> permissionList) {
    this.permissionList = permissionList;
    return this;
  }

  public RoleMgtItem addPermissionListItem(PermissionMgtItem permissionListItem) {
    if (this.permissionList == null) {
      this.permissionList = new ArrayList<PermissionMgtItem>();
    }
    this.permissionList.add(permissionListItem);
    return this;
  }

  /**
   * Get permissionList
   * @return permissionList
   **/
  @Schema(description = "")
      @Valid
    public List<PermissionMgtItem> getPermissionList() {
    return permissionList;
  }

  public void setPermissionList(List<PermissionMgtItem> permissionList) {
    this.permissionList = permissionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMgtItem roleMgtItem = (RoleMgtItem) o;
    return Objects.equals(this.roleId, roleMgtItem.roleId) &&
        Objects.equals(this.roleName, roleMgtItem.roleName) &&
        Objects.equals(this.roleDesc, roleMgtItem.roleDesc) &&
        Objects.equals(this.roleType, roleMgtItem.roleType) &&
        Objects.equals(this.permissionList, roleMgtItem.permissionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, roleName, roleDesc, roleType, permissionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMgtItem {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleDesc: ").append(toIndentedString(roleDesc)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    permissionList: ").append(toIndentedString(permissionList)).append("\n");
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
