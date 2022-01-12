package cn.test.sandbox.core.model;

import java.util.Objects;
import cn.test.sandbox.core.model.AuthorizedProductFileList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuthorizedProductFiles
 */
@Validated


public class AuthorizedProductFiles   {
  @JsonProperty("dtFrontToken")
  private String dtFrontToken = null;

  @JsonProperty("authorizedProductFileList")
  private AuthorizedProductFileList authorizedProductFileList = null;

  public AuthorizedProductFiles dtFrontToken(String dtFrontToken) {
    this.dtFrontToken = dtFrontToken;
    return this;
  }

  /**
   * Get dtFrontToken
   * @return dtFrontToken
   **/
  @Schema(description = "")
  
    public String getDtFrontToken() {
    return dtFrontToken;
  }

  public void setDtFrontToken(String dtFrontToken) {
    this.dtFrontToken = dtFrontToken;
  }

  public AuthorizedProductFiles authorizedProductFileList(AuthorizedProductFileList authorizedProductFileList) {
    this.authorizedProductFileList = authorizedProductFileList;
    return this;
  }

  /**
   * Get authorizedProductFileList
   * @return authorizedProductFileList
   **/
  @Schema(description = "")
  
    @Valid
    public AuthorizedProductFileList getAuthorizedProductFileList() {
    return authorizedProductFileList;
  }

  public void setAuthorizedProductFileList(AuthorizedProductFileList authorizedProductFileList) {
    this.authorizedProductFileList = authorizedProductFileList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizedProductFiles authorizedProductFiles = (AuthorizedProductFiles) o;
    return Objects.equals(this.dtFrontToken, authorizedProductFiles.dtFrontToken) &&
        Objects.equals(this.authorizedProductFileList, authorizedProductFiles.authorizedProductFileList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtFrontToken, authorizedProductFileList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizedProductFiles {\n");
    
    sb.append("    dtFrontToken: ").append(toIndentedString(dtFrontToken)).append("\n");
    sb.append("    authorizedProductFileList: ").append(toIndentedString(authorizedProductFileList)).append("\n");
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
