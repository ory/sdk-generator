/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.34
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
import sh.ory.model.GenericError;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * NeedsPrivilegedSessionError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T19:11:50.466866580Z[Etc/UTC]")
public class NeedsPrivilegedSessionError {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private GenericError error;

  public static final String SERIALIZED_NAME_REDIRECT_BROWSER_TO = "redirect_browser_to";
  @SerializedName(SERIALIZED_NAME_REDIRECT_BROWSER_TO)
  private String redirectBrowserTo;

  public NeedsPrivilegedSessionError() {
  }

  public NeedsPrivilegedSessionError error(GenericError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenericError getError() {
    return error;
  }


  public void setError(GenericError error) {
    this.error = error;
  }


  public NeedsPrivilegedSessionError redirectBrowserTo(String redirectBrowserTo) {
    
    this.redirectBrowserTo = redirectBrowserTo;
    return this;
  }

   /**
   * Points to where to redirect the user to next.
   * @return redirectBrowserTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Points to where to redirect the user to next.")

  public String getRedirectBrowserTo() {
    return redirectBrowserTo;
  }


  public void setRedirectBrowserTo(String redirectBrowserTo) {
    this.redirectBrowserTo = redirectBrowserTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NeedsPrivilegedSessionError needsPrivilegedSessionError = (NeedsPrivilegedSessionError) o;
    return Objects.equals(this.error, needsPrivilegedSessionError.error) &&
        Objects.equals(this.redirectBrowserTo, needsPrivilegedSessionError.redirectBrowserTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, redirectBrowserTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NeedsPrivilegedSessionError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    redirectBrowserTo: ").append(toIndentedString(redirectBrowserTo)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("redirect_browser_to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("redirect_browser_to");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NeedsPrivilegedSessionError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NeedsPrivilegedSessionError.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NeedsPrivilegedSessionError is not found in the empty JSON string", NeedsPrivilegedSessionError.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NeedsPrivilegedSessionError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NeedsPrivilegedSessionError` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NeedsPrivilegedSessionError.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        GenericError.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      if (!jsonObj.get("redirect_browser_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_browser_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redirect_browser_to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NeedsPrivilegedSessionError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NeedsPrivilegedSessionError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NeedsPrivilegedSessionError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NeedsPrivilegedSessionError.class));

       return (TypeAdapter<T>) new TypeAdapter<NeedsPrivilegedSessionError>() {
           @Override
           public void write(JsonWriter out, NeedsPrivilegedSessionError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NeedsPrivilegedSessionError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NeedsPrivilegedSessionError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NeedsPrivilegedSessionError
  * @throws IOException if the JSON string is invalid with respect to NeedsPrivilegedSessionError
  */
  public static NeedsPrivilegedSessionError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NeedsPrivilegedSessionError.class);
  }

 /**
  * Convert an instance of NeedsPrivilegedSessionError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

