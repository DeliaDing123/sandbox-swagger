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
 * PermissionMgtList
 */
@Validated


public class PermissionMgtList   {
  @JsonProperty("items")
  @Valid
  private List<PermissionMgtItem> items = null;

  public PermissionMgtList items(List<PermissionMgtItem> items) {
    this.items = items;
    return this;
  }

  public PermissionMgtList addItemsItem(PermissionMgtItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<PermissionMgtItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @Schema(description = "")
      @Valid
    public List<PermissionMgtItem> getItems() {
    return items;
  }

  public void setItems(List<PermissionMgtItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionMgtList permissionMgtList = (PermissionMgtList) o;
    return Objects.equals(this.items, permissionMgtList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionMgtList {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
