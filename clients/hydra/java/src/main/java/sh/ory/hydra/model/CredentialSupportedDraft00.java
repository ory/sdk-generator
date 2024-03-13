/*
 * Ory Hydra API
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v2.2.0
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

import sh.ory.hydra.JSON;

/**
 * Includes information about the supported verifiable credentials.
 */
@ApiModel(description = "Includes information about the supported verifiable credentials.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-12T11:42:01.945599172Z[Etc/UTC]")
public class CredentialSupportedDraft00 {
  public static final String SERIALIZED_NAME_CRYPTOGRAPHIC_BINDING_METHODS_SUPPORTED = "cryptographic_binding_methods_supported";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAPHIC_BINDING_METHODS_SUPPORTED)
  private List<String> cryptographicBindingMethodsSupported = null;

  public static final String SERIALIZED_NAME_CRYPTOGRAPHIC_SUITES_SUPPORTED = "cryptographic_suites_supported";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAPHIC_SUITES_SUPPORTED)
  private List<String> cryptographicSuitesSupported = null;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<String> types = null;

  public CredentialSupportedDraft00() {
  }

  public CredentialSupportedDraft00 cryptographicBindingMethodsSupported(List<String> cryptographicBindingMethodsSupported) {
    
    this.cryptographicBindingMethodsSupported = cryptographicBindingMethodsSupported;
    return this;
  }

  public CredentialSupportedDraft00 addCryptographicBindingMethodsSupportedItem(String cryptographicBindingMethodsSupportedItem) {
    if (this.cryptographicBindingMethodsSupported == null) {
      this.cryptographicBindingMethodsSupported = new ArrayList<>();
    }
    this.cryptographicBindingMethodsSupported.add(cryptographicBindingMethodsSupportedItem);
    return this;
  }

   /**
   * OpenID Connect Verifiable Credentials Cryptographic Binding Methods Supported  Contains a list of cryptographic binding methods supported for signing the proof.
   * @return cryptographicBindingMethodsSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OpenID Connect Verifiable Credentials Cryptographic Binding Methods Supported  Contains a list of cryptographic binding methods supported for signing the proof.")

  public List<String> getCryptographicBindingMethodsSupported() {
    return cryptographicBindingMethodsSupported;
  }


  public void setCryptographicBindingMethodsSupported(List<String> cryptographicBindingMethodsSupported) {
    this.cryptographicBindingMethodsSupported = cryptographicBindingMethodsSupported;
  }


  public CredentialSupportedDraft00 cryptographicSuitesSupported(List<String> cryptographicSuitesSupported) {
    
    this.cryptographicSuitesSupported = cryptographicSuitesSupported;
    return this;
  }

  public CredentialSupportedDraft00 addCryptographicSuitesSupportedItem(String cryptographicSuitesSupportedItem) {
    if (this.cryptographicSuitesSupported == null) {
      this.cryptographicSuitesSupported = new ArrayList<>();
    }
    this.cryptographicSuitesSupported.add(cryptographicSuitesSupportedItem);
    return this;
  }

   /**
   * OpenID Connect Verifiable Credentials Cryptographic Suites Supported  Contains a list of cryptographic suites methods supported for signing the proof.
   * @return cryptographicSuitesSupported
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OpenID Connect Verifiable Credentials Cryptographic Suites Supported  Contains a list of cryptographic suites methods supported for signing the proof.")

  public List<String> getCryptographicSuitesSupported() {
    return cryptographicSuitesSupported;
  }


  public void setCryptographicSuitesSupported(List<String> cryptographicSuitesSupported) {
    this.cryptographicSuitesSupported = cryptographicSuitesSupported;
  }


  public CredentialSupportedDraft00 format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * OpenID Connect Verifiable Credentials Format  Contains the format that is supported by this authorization server.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OpenID Connect Verifiable Credentials Format  Contains the format that is supported by this authorization server.")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public CredentialSupportedDraft00 types(List<String> types) {
    
    this.types = types;
    return this;
  }

  public CredentialSupportedDraft00 addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * OpenID Connect Verifiable Credentials Types  Contains the types of verifiable credentials supported.
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OpenID Connect Verifiable Credentials Types  Contains the types of verifiable credentials supported.")

  public List<String> getTypes() {
    return types;
  }


  public void setTypes(List<String> types) {
    this.types = types;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CredentialSupportedDraft00 instance itself
   */
  public CredentialSupportedDraft00 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialSupportedDraft00 credentialSupportedDraft00 = (CredentialSupportedDraft00) o;
    return Objects.equals(this.cryptographicBindingMethodsSupported, credentialSupportedDraft00.cryptographicBindingMethodsSupported) &&
        Objects.equals(this.cryptographicSuitesSupported, credentialSupportedDraft00.cryptographicSuitesSupported) &&
        Objects.equals(this.format, credentialSupportedDraft00.format) &&
        Objects.equals(this.types, credentialSupportedDraft00.types)&&
        Objects.equals(this.additionalProperties, credentialSupportedDraft00.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptographicBindingMethodsSupported, cryptographicSuitesSupported, format, types, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialSupportedDraft00 {\n");
    sb.append("    cryptographicBindingMethodsSupported: ").append(toIndentedString(cryptographicBindingMethodsSupported)).append("\n");
    sb.append("    cryptographicSuitesSupported: ").append(toIndentedString(cryptographicSuitesSupported)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("cryptographic_binding_methods_supported");
    openapiFields.add("cryptographic_suites_supported");
    openapiFields.add("format");
    openapiFields.add("types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CredentialSupportedDraft00
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CredentialSupportedDraft00.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CredentialSupportedDraft00 is not found in the empty JSON string", CredentialSupportedDraft00.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cryptographic_binding_methods_supported") != null && !jsonObj.get("cryptographic_binding_methods_supported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cryptographic_binding_methods_supported` to be an array in the JSON string but got `%s`", jsonObj.get("cryptographic_binding_methods_supported").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cryptographic_suites_supported") != null && !jsonObj.get("cryptographic_suites_supported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cryptographic_suites_supported` to be an array in the JSON string but got `%s`", jsonObj.get("cryptographic_suites_supported").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("types") != null && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CredentialSupportedDraft00.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CredentialSupportedDraft00' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CredentialSupportedDraft00> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CredentialSupportedDraft00.class));

       return (TypeAdapter<T>) new TypeAdapter<CredentialSupportedDraft00>() {
           @Override
           public void write(JsonWriter out, CredentialSupportedDraft00 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CredentialSupportedDraft00 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CredentialSupportedDraft00 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CredentialSupportedDraft00 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CredentialSupportedDraft00
  * @throws IOException if the JSON string is invalid with respect to CredentialSupportedDraft00
  */
  public static CredentialSupportedDraft00 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CredentialSupportedDraft00.class);
  }

 /**
  * Convert an instance of CredentialSupportedDraft00 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

