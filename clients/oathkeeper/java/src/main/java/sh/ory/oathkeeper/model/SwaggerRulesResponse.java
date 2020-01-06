/*
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1+1
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
 * SwaggerRulesResponse A list of rules
 */
@ApiModel(description = "SwaggerRulesResponse A list of rules")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:31:08.662984+01:00[Europe/Berlin]")
public class SwaggerRulesResponse {
  public static final String SERIALIZED_NAME_BODY = "Body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private List<SwaggerRule> body = null;


  public SwaggerRulesResponse body(List<SwaggerRule> body) {
    
    this.body = body;
    return this;
  }

  public SwaggerRulesResponse addBodyItem(SwaggerRule bodyItem) {
    if (this.body == null) {
      this.body = new ArrayList<SwaggerRule>();
    }
    this.body.add(bodyItem);
    return this;
  }

   /**
   * in: body type: array
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "in: body type: array")

  public List<SwaggerRule> getBody() {
    return body;
  }


  public void setBody(List<SwaggerRule> body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwaggerRulesResponse swaggerRulesResponse = (SwaggerRulesResponse) o;
    return Objects.equals(this.body, swaggerRulesResponse.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerRulesResponse {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

