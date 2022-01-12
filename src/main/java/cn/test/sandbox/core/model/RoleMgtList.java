package cn.test.sandbox.core.model;

import java.util.Objects;
import cn.test.sandbox.core.model.RoleMgtItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoleMgtList
 */
@Validated


public class RoleMgtList   {
  @JsonProperty("items")
  @Valid
  private List<RoleMgtItem> items = null;

  public RoleMgtList items(List<RoleMgtItem> items) {
    this.items = items;
    return this;
  }

  public RoleMgtList addItemsItem(RoleMgtItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<RoleMgtItem>();
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
    public List<RoleMgtItem> getItems() {
    return items;
  }

  public void setItems(List<RoleMgtItem> items) {
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
    RoleMgtList roleMgtList = (RoleMgtList) o;
    return Objects.equals(this.items, roleMgtList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMgtList {\n");
    
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
