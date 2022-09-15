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
import java.time.OffsetDateTime;

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
 * FlushInactiveOAuth2TokensRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T08:54:29.213545147Z[Etc/UTC]")
public class FlushInactiveOAuth2TokensRequest {
  public static final String SERIALIZED_NAME_NOT_AFTER = "notAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private OffsetDateTime notAfter;

  public FlushInactiveOAuth2TokensRequest() { 
  }

  public FlushInactiveOAuth2TokensRequest notAfter(OffsetDateTime notAfter) {
    
    this.notAfter = notAfter;
    return this;
  }

   /**
   * NotAfter sets after which point tokens should not be flushed. This is useful when you want to keep a history of recently issued tokens for auditing.
   * @return notAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NotAfter sets after which point tokens should not be flushed. This is useful when you want to keep a history of recently issued tokens for auditing.")

  public OffsetDateTime getNotAfter() {
    return notAfter;
  }


  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlushInactiveOAuth2TokensRequest flushInactiveOAuth2TokensRequest = (FlushInactiveOAuth2TokensRequest) o;
    return Objects.equals(this.notAfter, flushInactiveOAuth2TokensRequest.notAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlushInactiveOAuth2TokensRequest {\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
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
    openapiFields.add("notAfter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FlushInactiveOAuth2TokensRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FlushInactiveOAuth2TokensRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FlushInactiveOAuth2TokensRequest is not found in the empty JSON string", FlushInactiveOAuth2TokensRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FlushInactiveOAuth2TokensRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FlushInactiveOAuth2TokensRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FlushInactiveOAuth2TokensRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FlushInactiveOAuth2TokensRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FlushInactiveOAuth2TokensRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FlushInactiveOAuth2TokensRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FlushInactiveOAuth2TokensRequest>() {
           @Override
           public void write(JsonWriter out, FlushInactiveOAuth2TokensRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FlushInactiveOAuth2TokensRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FlushInactiveOAuth2TokensRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FlushInactiveOAuth2TokensRequest
  * @throws IOException if the JSON string is invalid with respect to FlushInactiveOAuth2TokensRequest
  */
  public static FlushInactiveOAuth2TokensRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FlushInactiveOAuth2TokensRequest.class);
  }

 /**
  * Convert an instance of FlushInactiveOAuth2TokensRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

