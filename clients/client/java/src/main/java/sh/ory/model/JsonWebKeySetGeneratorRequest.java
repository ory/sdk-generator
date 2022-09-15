/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.46
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * JsonWebKeySetGeneratorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T08:54:29.213545147Z[Etc/UTC]")
public class JsonWebKeySetGeneratorRequest {
  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private String use;

  public JsonWebKeySetGeneratorRequest() { 
  }

  public JsonWebKeySetGeneratorRequest alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * The algorithm to be used for creating the key. Supports \&quot;RS256\&quot;, \&quot;ES256\&quot;, \&quot;ES512\&quot;, \&quot;HS512\&quot;, and \&quot;HS256\&quot;
   * @return alg
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The algorithm to be used for creating the key. Supports \"RS256\", \"ES256\", \"ES512\", \"HS512\", and \"HS256\"")

  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public JsonWebKeySetGeneratorRequest kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The kid of the key to be created
   * @return kid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The kid of the key to be created")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public JsonWebKeySetGeneratorRequest use(String use) {
    
    this.use = use;
    return this;
  }

   /**
   * The \&quot;use\&quot; (public key use) parameter identifies the intended use of the public key. The \&quot;use\&quot; parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \&quot;enc\&quot; and \&quot;sig\&quot;.
   * @return use
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The \"use\" (public key use) parameter identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \"enc\" and \"sig\".")

  public String getUse() {
    return use;
  }


  public void setUse(String use) {
    this.use = use;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonWebKeySetGeneratorRequest jsonWebKeySetGeneratorRequest = (JsonWebKeySetGeneratorRequest) o;
    return Objects.equals(this.alg, jsonWebKeySetGeneratorRequest.alg) &&
        Objects.equals(this.kid, jsonWebKeySetGeneratorRequest.kid) &&
        Objects.equals(this.use, jsonWebKeySetGeneratorRequest.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alg, kid, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonWebKeySetGeneratorRequest {\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("alg");
    openapiFields.add("kid");
    openapiFields.add("use");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alg");
    openapiRequiredFields.add("kid");
    openapiRequiredFields.add("use");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JsonWebKeySetGeneratorRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JsonWebKeySetGeneratorRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JsonWebKeySetGeneratorRequest is not found in the empty JSON string", JsonWebKeySetGeneratorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JsonWebKeySetGeneratorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JsonWebKeySetGeneratorRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JsonWebKeySetGeneratorRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("alg") != null && !jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      if (jsonObj.get("kid") != null && !jsonObj.get("kid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kid").toString()));
      }
      if (jsonObj.get("use") != null && !jsonObj.get("use").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JsonWebKeySetGeneratorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JsonWebKeySetGeneratorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JsonWebKeySetGeneratorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JsonWebKeySetGeneratorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<JsonWebKeySetGeneratorRequest>() {
           @Override
           public void write(JsonWriter out, JsonWebKeySetGeneratorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JsonWebKeySetGeneratorRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JsonWebKeySetGeneratorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JsonWebKeySetGeneratorRequest
  * @throws IOException if the JSON string is invalid with respect to JsonWebKeySetGeneratorRequest
  */
  public static JsonWebKeySetGeneratorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonWebKeySetGeneratorRequest.class);
  }

 /**
  * Convert an instance of JsonWebKeySetGeneratorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

