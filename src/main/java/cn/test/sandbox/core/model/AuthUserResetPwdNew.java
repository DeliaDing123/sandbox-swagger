package cn.test.sandbox.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuthUserResetPwdNew
 */
@Validated


public class AuthUserResetPwdNew   {
  @JsonProperty("userEmail")
  private String userEmail = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("randSid")
  private String randSid = null;

  public AuthUserResetPwdNew userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail
   * @return userEmail
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public AuthUserResetPwdNew password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AuthUserResetPwdNew randSid(String randSid) {
    this.randSid = randSid;
    return this;
  }

  /**
   * Get randSid
   * @return randSid
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getRandSid() {
    return randSid;
  }

  public void setRandSid(String randSid) {
    this.randSid = randSid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthUserResetPwdNew authUserResetPwdNew = (AuthUserResetPwdNew) o;
    return Objects.equals(this.userEmail, authUserResetPwdNew.userEmail) &&
        Objects.equals(this.password, authUserResetPwdNew.password) &&
        Objects.equals(this.randSid, authUserResetPwdNew.randSid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userEmail, password, randSid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthUserResetPwdNew {\n");
    
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    randSid: ").append(toIndentedString(randSid)).append("\n");
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
