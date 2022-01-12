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
 * PermissionMgtItem
 */
@Validated


public class PermissionMgtItem   {
  @JsonProperty("permissionId")
  private String permissionId = null;

  @JsonProperty("permissionName")
  private String permissionName = null;

  @JsonProperty("childNodes")
  @Valid
  private List<PermissionMgtItem> childNodes = null;

  public PermissionMgtItem permissionId(String permissionId) {
    this.permissionId = permissionId;
    return this;
  }

  /**
   * Get permissionId
   * @return permissionId
   **/
  @Schema(description = "")
  
    public String getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(String permissionId) {
    this.permissionId = permissionId;
  }

  public PermissionMgtItem permissionName(String permissionName) {
    this.permissionName = permissionName;
    return this;
  }

  /**
   * Get permissionName
   * @return permissionName
   **/
  @Schema(description = "")
  
    public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }

  public PermissionMgtItem childNodes(List<PermissionMgtItem> childNodes) {
    this.childNodes = childNodes;
    return this;
  }

  public PermissionMgtItem addChildNodesItem(PermissionMgtItem childNodesItem) {
    if (this.childNodes == null) {
      this.childNodes = new ArrayList<PermissionMgtItem>();
    }
    this.childNodes.add(childNodesItem);
    return this;
  }

  /**
   * Get childNodes
   * @return childNodes
   **/
  @Schema(description = "")
      @Valid
    public List<PermissionMgtItem> getChildNodes() {
    return childNodes;
  }

  public void setChildNodes(List<PermissionMgtItem> childNodes) {
    this.childNodes = childNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionMgtItem permissionMgtItem = (PermissionMgtItem) o;
    return Objects.equals(this.permissionId, permissionMgtItem.permissionId) &&
        Objects.equals(this.permissionName, permissionMgtItem.permissionName) &&
        Objects.equals(this.childNodes, permissionMgtItem.childNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionId, permissionName, childNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionMgtItem {\n");
    
    sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
    sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
    sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
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
