package cn.test.sandbox.core.model;

import java.util.Objects;
import cn.test.sandbox.core.model.ProductList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuthorizedProductItem
 */
@Validated


public class AuthorizedProductItem   {
  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("descCN")
  private String descCN = null;

  @JsonProperty("productList")
  @Valid
  private List<ProductList> productList = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("isDownloadAvailable")
  private Boolean isDownloadAvailable = null;

  public AuthorizedProductItem icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   **/
  @Schema(description = "")
  
    public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public AuthorizedProductItem desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * Get desc
   * @return desc
   **/
  @Schema(description = "")
  
    public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public AuthorizedProductItem descCN(String descCN) {
    this.descCN = descCN;
    return this;
  }

  /**
   * Get descCN
   * @return descCN
   **/
  @Schema(description = "")
  
    public String getDescCN() {
    return descCN;
  }

  public void setDescCN(String descCN) {
    this.descCN = descCN;
  }

  public AuthorizedProductItem productList(List<ProductList> productList) {
    this.productList = productList;
    return this;
  }

  public AuthorizedProductItem addProductListItem(ProductList productListItem) {
    if (this.productList == null) {
      this.productList = new ArrayList<ProductList>();
    }
    this.productList.add(productListItem);
    return this;
  }

  /**
   * Get productList
   * @return productList
   **/
  @Schema(description = "")
      @Valid
    public List<ProductList> getProductList() {
    return productList;
  }

  public void setProductList(List<ProductList> productList) {
    this.productList = productList;
  }

  public AuthorizedProductItem productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
   **/
  @Schema(description = "")
  
    public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public AuthorizedProductItem isDownloadAvailable(Boolean isDownloadAvailable) {
    this.isDownloadAvailable = isDownloadAvailable;
    return this;
  }

  /**
   * Get isDownloadAvailable
   * @return isDownloadAvailable
   **/
  @Schema(description = "")
  
    public Boolean isIsDownloadAvailable() {
    return isDownloadAvailable;
  }

  public void setIsDownloadAvailable(Boolean isDownloadAvailable) {
    this.isDownloadAvailable = isDownloadAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedProductItem authorizedProductItem = (AuthorizedProductItem) o;
    return Objects.equals(this.icon, authorizedProductItem.icon) &&
        Objects.equals(this.desc, authorizedProductItem.desc) &&
        Objects.equals(this.descCN, authorizedProductItem.descCN) &&
        Objects.equals(this.productList, authorizedProductItem.productList) &&
        Objects.equals(this.productType, authorizedProductItem.productType) &&
        Objects.equals(this.isDownloadAvailable, authorizedProductItem.isDownloadAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, desc, descCN, productList, productType, isDownloadAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedProductItem {\n");
    
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    descCN: ").append(toIndentedString(descCN)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    isDownloadAvailable: ").append(toIndentedString(isDownloadAvailable)).append("\n");
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
