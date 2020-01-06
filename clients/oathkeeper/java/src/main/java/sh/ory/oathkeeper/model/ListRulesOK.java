/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.oathkeeper.model;

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
import sh.ory.oathkeeper.model.SwaggerRule;

/**
 * A list of rules
 */
@ApiModel(description = "A list of rules")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:25:55.424147+01:00[Europe/Berlin]")
public class ListRulesOK {
  public static final String SERIALIZED_NAME_PAYLOAD = "Payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private List<SwaggerRule> payload = null;


  public ListRulesOK payload(List<SwaggerRule> payload) {
    
    this.payload = payload;
    return this;
  }

  public ListRulesOK addPayloadItem(SwaggerRule payloadItem) {
    if (this.payload == null) {
      this.payload = new ArrayList<SwaggerRule>();
    }
    this.payload.add(payloadItem);
    return this;
  }

   /**
   * payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "payload")

  public List<SwaggerRule> getPayload() {
    return payload;
  }


  public void setPayload(List<SwaggerRule> payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRulesOK listRulesOK = (ListRulesOK) o;
    return Objects.equals(this.payload, listRulesOK.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRulesOK {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

