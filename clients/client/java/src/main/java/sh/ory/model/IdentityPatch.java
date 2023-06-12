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
import sh.ory.model.CreateIdentityBody;

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
 * Payload for patching an identity
 */
@ApiModel(description = "Payload for patching an identity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T19:11:50.466866580Z[Etc/UTC]")
public class IdentityPatch {
  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private CreateIdentityBody create;

  public static final String SERIALIZED_NAME_PATCH_ID = "patch_id";
  @SerializedName(SERIALIZED_NAME_PATCH_ID)
  private String patchId;

  public IdentityPatch() {
  }

  public IdentityPatch create(CreateIdentityBody create) {
    
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateIdentityBody getCreate() {
    return create;
  }


  public void setCreate(CreateIdentityBody create) {
    this.create = create;
  }


  public IdentityPatch patchId(String patchId) {
    
    this.patchId = patchId;
    return this;
  }

   /**
   * The ID of this patch.  The patch ID is optional. If specified, the ID will be returned in the response, so consumers of this API can correlate the response with the patch.
   * @return patchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of this patch.  The patch ID is optional. If specified, the ID will be returned in the response, so consumers of this API can correlate the response with the patch.")

  public String getPatchId() {
    return patchId;
  }


  public void setPatchId(String patchId) {
    this.patchId = patchId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityPatch identityPatch = (IdentityPatch) o;
    return Objects.equals(this.create, identityPatch.create) &&
        Objects.equals(this.patchId, identityPatch.patchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, patchId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityPatch {\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    patchId: ").append(toIndentedString(patchId)).append("\n");
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
    openapiFields.add("create");
    openapiFields.add("patch_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IdentityPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityPatch is not found in the empty JSON string", IdentityPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `create`
      if (jsonObj.get("create") != null && !jsonObj.get("create").isJsonNull()) {
        CreateIdentityBody.validateJsonObject(jsonObj.getAsJsonObject("create"));
      }
      if ((jsonObj.get("patch_id") != null && !jsonObj.get("patch_id").isJsonNull()) && !jsonObj.get("patch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patch_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityPatch>() {
           @Override
           public void write(JsonWriter out, IdentityPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityPatch
  * @throws IOException if the JSON string is invalid with respect to IdentityPatch
  */
  public static IdentityPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityPatch.class);
  }

 /**
  * Convert an instance of IdentityPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

