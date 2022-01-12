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
 * AuthUserPermissionList
 */
@Validated


public class AuthUserPermissionList   {
  @JsonProperty("permissionIdList")
  @Valid
  private List<String> permissionIdList = null;

  public AuthUserPermissionList permissionIdList(List<String> permissionIdList) {
    this.permissionIdList = permissionIdList;
    return this;
  }

  public AuthUserPermissionList addPermissionIdListItem(String permissionIdListItem) {
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
    AuthUserPermissionList authUserPermissionList = (AuthUserPermissionList) o;
    return Objects.equals(this.permissionIdList, authUserPermissionList.permissionIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUserPermissionList {\n");
    
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
