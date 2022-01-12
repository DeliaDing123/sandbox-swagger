package cn.test.sandbox.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuthorizedProductFileItem
 */
@Validated


public class AuthorizedProductFileItem   {
  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileDesc")
  private String fileDesc = null;

  @JsonProperty("cosObjectKey")
  private String cosObjectKey = null;

  public AuthorizedProductFileItem fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   **/
  @Schema(description = "")
  
    public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AuthorizedProductFileItem fileDesc(String fileDesc) {
    this.fileDesc = fileDesc;
    return this;
  }

  /**
   * Get fileDesc
   * @return fileDesc
   **/
  @Schema(description = "")
  
    public String getFileDesc() {
    return fileDesc;
  }

  public void setFileDesc(String fileDesc) {
    this.fileDesc = fileDesc;
  }

  public AuthorizedProductFileItem cosObjectKey(String cosObjectKey) {
    this.cosObjectKey = cosObjectKey;
    return this;
  }

  /**
   * Get cosObjectKey
   * @return cosObjectKey
   **/
  @Schema(description = "")
  
    public String getCosObjectKey() {
    return cosObjectKey;
  }

  public void setCosObjectKey(String cosObjectKey) {
    this.cosObjectKey = cosObjectKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedProductFileItem authorizedProductFileItem = (AuthorizedProductFileItem) o;
    return Objects.equals(this.fileName, authorizedProductFileItem.fileName) &&
        Objects.equals(this.fileDesc, authorizedProductFileItem.fileDesc) &&
        Objects.equals(this.cosObjectKey, authorizedProductFileItem.cosObjectKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileDesc, cosObjectKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedProductFileItem {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileDesc: ").append(toIndentedString(fileDesc)).append("\n");
    sb.append("    cosObjectKey: ").append(toIndentedString(cosObjectKey)).append("\n");
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
