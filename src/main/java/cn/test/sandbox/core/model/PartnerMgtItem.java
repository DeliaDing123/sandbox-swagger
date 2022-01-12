package cn.test.sandbox.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PartnerMgtItem
 */
@Validated


public class PartnerMgtItem   {
  @JsonProperty("partnerId")
  private String partnerId = null;

  @JsonProperty("partnerName")
  private String partnerName = null;

  public PartnerMgtItem partnerId(String partnerId) {
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

  public PartnerMgtItem partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * Get partnerName
   * @return partnerName
   **/
  @Schema(description = "")
  
    public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerMgtItem partnerMgtItem = (PartnerMgtItem) o;
    return Objects.equals(this.partnerId, partnerMgtItem.partnerId) &&
        Objects.equals(this.partnerName, partnerMgtItem.partnerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, partnerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerMgtItem {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
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
