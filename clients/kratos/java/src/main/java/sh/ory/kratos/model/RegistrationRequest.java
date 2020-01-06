/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.34
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import sh.ory.kratos.model.RegistrationRequestMethod;

/**
 * RegistrationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:46:21.535894+01:00[Europe/Berlin]")
public class RegistrationRequest {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private Map<String, RegistrationRequestMethod> methods = null;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;


  public RegistrationRequest active(String active) {
    
    this.active = active;
    return this;
  }

   /**
   * and so on.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "and so on.")

  public String getActive() {
    return active;
  }


  public void setActive(String active) {
    this.active = active;
  }


  public RegistrationRequest expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to log in, a new request has to be initiated.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExpiresAt is the time (UTC) when the request expires. If the user still wishes to log in, a new request has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RegistrationRequest id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RegistrationRequest issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the request occurred.
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IssuedAt is the time (UTC) when the request occurred.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public RegistrationRequest methods(Map<String, RegistrationRequestMethod> methods) {
    
    this.methods = methods;
    return this;
  }

  public RegistrationRequest putMethodsItem(String key, RegistrationRequestMethod methodsItem) {
    if (this.methods == null) {
      this.methods = new HashMap<String, RegistrationRequestMethod>();
    }
    this.methods.put(key, methodsItem);
    return this;
  }

   /**
   * Methods contains context for all enabled registration methods. If a registration request has been processed, but for example the password is incorrect, this will contain error messages.
   * @return methods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Methods contains context for all enabled registration methods. If a registration request has been processed, but for example the password is incorrect, this will contain error messages.")

  public Map<String, RegistrationRequestMethod> getMethods() {
    return methods;
  }


  public void setMethods(Map<String, RegistrationRequestMethod> methods) {
    this.methods = methods;
  }


  public RegistrationRequest requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationRequest registrationRequest = (RegistrationRequest) o;
    return Objects.equals(this.active, registrationRequest.active) &&
        Objects.equals(this.expiresAt, registrationRequest.expiresAt) &&
        Objects.equals(this.id, registrationRequest.id) &&
        Objects.equals(this.issuedAt, registrationRequest.issuedAt) &&
        Objects.equals(this.methods, registrationRequest.methods) &&
        Objects.equals(this.requestUrl, registrationRequest.requestUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expiresAt, id, issuedAt, methods, requestUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationRequest {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
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

