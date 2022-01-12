package cn.test.sandbox.core.model;

import java.util.Objects;
import cn.test.sandbox.core.model.PageableElement;
import cn.test.sandbox.core.model.UserMgtItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserMgtList
 */
@Validated


public class UserMgtList   {
  @JsonProperty("pageable")
  private PageableElement pageable = null;

  @JsonProperty("items")
  @Valid
  private List<UserMgtItem> items = null;

  public UserMgtList pageable(PageableElement pageable) {
    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
   **/
  @Schema(description = "")
  
    @Valid
    public PageableElement getPageable() {
    return pageable;
  }

  public void setPageable(PageableElement pageable) {
    this.pageable = pageable;
  }

  public UserMgtList items(List<UserMgtItem> items) {
    this.items = items;
    return this;
  }

  public UserMgtList addItemsItem(UserMgtItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<UserMgtItem>();
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
    public List<UserMgtItem> getItems() {
    return items;
  }

  public void setItems(List<UserMgtItem> items) {
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
    UserMgtList userMgtList = (UserMgtList) o;
    return Objects.equals(this.pageable, userMgtList.pageable) &&
        Objects.equals(this.items, userMgtList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageable, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMgtList {\n");
    
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
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
