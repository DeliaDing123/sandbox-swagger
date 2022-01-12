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
 * RoleMgtUpdate
 */
@Validated


public class RoleMgtUpdate   {
  @JsonProperty("roleId")
  private String roleId = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("roleDesc")
  private String roleDesc = null;

  @JsonProperty("roleType")
  private String roleType = null;

  @JsonProperty("permissionIdList")
  @Valid
  private List<String> permissionIdList = new ArrayList<String>();

  public RoleMgtUpdate roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public RoleMgtUpdate roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public RoleMgtUpdate roleDesc(String roleDesc) {
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

  public RoleMgtUpdate roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * Get roleType
   * @return roleType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public RoleMgtUpdate permissionIdList(List<String> permissionIdList) {
    this.permissionIdList = permissionIdList;
    return this;
  }

  public RoleMgtUpdate addPermissionIdListItem(String permissionIdListItem) {
    this.permissionIdList.add(permissionIdListItem);
    return this;
  }

  /**
   * Get permissionIdList
   * @return permissionIdList
   **/
  @Schema(required = true, description = "")
      @NotNull

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
    RoleMgtUpdate roleMgtUpdate = (RoleMgtUpdate) o;
    return Objects.equals(this.roleId, roleMgtUpdate.roleId) &&
        Objects.equals(this.roleName, roleMgtUpdate.roleName) &&
        Objects.equals(this.roleDesc, roleMgtUpdate.roleDesc) &&
        Objects.equals(this.roleType, roleMgtUpdate.roleType) &&
        Objects.equals(this.permissionIdList, roleMgtUpdate.permissionIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, roleName, roleDesc, roleType, permissionIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMgtUpdate {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleDesc: ").append(toIndentedString(roleDesc)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
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
