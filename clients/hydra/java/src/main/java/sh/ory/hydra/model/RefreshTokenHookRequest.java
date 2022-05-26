/*
 * Ory Hydra API
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v1.11.8
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * RefreshTokenHookRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-04T11:09:50.946388738Z[Etc/UTC]")
public class RefreshTokenHookRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_GRANTED_AUDIENCE = "granted_audience";
  @SerializedName(SERIALIZED_NAME_GRANTED_AUDIENCE)
  private List<String> grantedAudience = null;

  public static final String SERIALIZED_NAME_GRANTED_SCOPES = "granted_scopes";
  @SerializedName(SERIALIZED_NAME_GRANTED_SCOPES)
  private List<String> grantedScopes = null;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public RefreshTokenHookRequest() { 
  }

  public RefreshTokenHookRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * ClientID is the identifier of the OAuth 2.0 client.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ClientID is the identifier of the OAuth 2.0 client.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public RefreshTokenHookRequest grantedAudience(List<String> grantedAudience) {
    
    this.grantedAudience = grantedAudience;
    return this;
  }

  public RefreshTokenHookRequest addGrantedAudienceItem(String grantedAudienceItem) {
    if (this.grantedAudience == null) {
      this.grantedAudience = new ArrayList<>();
    }
    this.grantedAudience.add(grantedAudienceItem);
    return this;
  }

   /**
   * GrantedAudience is the list of audiences granted to the OAuth 2.0 client.
   * @return grantedAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GrantedAudience is the list of audiences granted to the OAuth 2.0 client.")

  public List<String> getGrantedAudience() {
    return grantedAudience;
  }


  public void setGrantedAudience(List<String> grantedAudience) {
    this.grantedAudience = grantedAudience;
  }


  public RefreshTokenHookRequest grantedScopes(List<String> grantedScopes) {
    
    this.grantedScopes = grantedScopes;
    return this;
  }

  public RefreshTokenHookRequest addGrantedScopesItem(String grantedScopesItem) {
    if (this.grantedScopes == null) {
      this.grantedScopes = new ArrayList<>();
    }
    this.grantedScopes.add(grantedScopesItem);
    return this;
  }

   /**
   * GrantedScopes is the list of scopes granted to the OAuth 2.0 client.
   * @return grantedScopes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GrantedScopes is the list of scopes granted to the OAuth 2.0 client.")

  public List<String> getGrantedScopes() {
    return grantedScopes;
  }


  public void setGrantedScopes(List<String> grantedScopes) {
    this.grantedScopes = grantedScopes;
  }


  public RefreshTokenHookRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the identifier of the authenticated end-user.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject is the identifier of the authenticated end-user.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshTokenHookRequest refreshTokenHookRequest = (RefreshTokenHookRequest) o;
    return Objects.equals(this.clientId, refreshTokenHookRequest.clientId) &&
        Objects.equals(this.grantedAudience, refreshTokenHookRequest.grantedAudience) &&
        Objects.equals(this.grantedScopes, refreshTokenHookRequest.grantedScopes) &&
        Objects.equals(this.subject, refreshTokenHookRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, grantedAudience, grantedScopes, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshTokenHookRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    grantedAudience: ").append(toIndentedString(grantedAudience)).append("\n");
    sb.append("    grantedScopes: ").append(toIndentedString(grantedScopes)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

