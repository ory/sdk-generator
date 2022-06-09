/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.188
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubmitSelfServiceSettingsFlowWithPasswordMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T13:48:24.946825497Z[Etc/UTC]")
public class SubmitSelfServiceSettingsFlowWithPasswordMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public SubmitSelfServiceSettingsFlowWithPasswordMethodBody() { 
  }

  public SubmitSelfServiceSettingsFlowWithPasswordMethodBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * CSRFToken is the anti-CSRF token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSRFToken is the anti-CSRF token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceSettingsFlowWithPasswordMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to password when trying to update a password.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method  Should be set to password when trying to update a password.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceSettingsFlowWithPasswordMethodBody password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password is the updated password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Password is the updated password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceSettingsFlowWithPasswordMethodBody submitSelfServiceSettingsFlowWithPasswordMethodBody = (SubmitSelfServiceSettingsFlowWithPasswordMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceSettingsFlowWithPasswordMethodBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceSettingsFlowWithPasswordMethodBody.method) &&
        Objects.equals(this.password, submitSelfServiceSettingsFlowWithPasswordMethodBody.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceSettingsFlowWithPasswordMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

