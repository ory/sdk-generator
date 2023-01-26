/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.7
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * Create Subscription Request Body
 */
@ApiModel(description = "Create Subscription Request Body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-26T14:09:51.510212934Z[Etc/UTC]")
public class CreateSubscriptionBody {
  public static final String SERIALIZED_NAME_PLAN_OR_PRICE = "plan_or_price";
  @SerializedName(SERIALIZED_NAME_PLAN_OR_PRICE)
  private String planOrPrice;

  public static final String SERIALIZED_NAME_PROVISION_FIRST_PROJECT = "provision_first_project";
  @SerializedName(SERIALIZED_NAME_PROVISION_FIRST_PROJECT)
  private String provisionFirstProject;

  public static final String SERIALIZED_NAME_RETURN_TO = "return_to";
  @SerializedName(SERIALIZED_NAME_RETURN_TO)
  private String returnTo;

  public CreateSubscriptionBody() {
  }

  public CreateSubscriptionBody planOrPrice(String planOrPrice) {
    
    this.planOrPrice = planOrPrice;
    return this;
  }

   /**
   * Get planOrPrice
   * @return planOrPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPlanOrPrice() {
    return planOrPrice;
  }


  public void setPlanOrPrice(String planOrPrice) {
    this.planOrPrice = planOrPrice;
  }


  public CreateSubscriptionBody provisionFirstProject(String provisionFirstProject) {
    
    this.provisionFirstProject = provisionFirstProject;
    return this;
  }

   /**
   * Get provisionFirstProject
   * @return provisionFirstProject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProvisionFirstProject() {
    return provisionFirstProject;
  }


  public void setProvisionFirstProject(String provisionFirstProject) {
    this.provisionFirstProject = provisionFirstProject;
  }


  public CreateSubscriptionBody returnTo(String returnTo) {
    
    this.returnTo = returnTo;
    return this;
  }

   /**
   * Get returnTo
   * @return returnTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReturnTo() {
    return returnTo;
  }


  public void setReturnTo(String returnTo) {
    this.returnTo = returnTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionBody createSubscriptionBody = (CreateSubscriptionBody) o;
    return Objects.equals(this.planOrPrice, createSubscriptionBody.planOrPrice) &&
        Objects.equals(this.provisionFirstProject, createSubscriptionBody.provisionFirstProject) &&
        Objects.equals(this.returnTo, createSubscriptionBody.returnTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planOrPrice, provisionFirstProject, returnTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionBody {\n");
    sb.append("    planOrPrice: ").append(toIndentedString(planOrPrice)).append("\n");
    sb.append("    provisionFirstProject: ").append(toIndentedString(provisionFirstProject)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
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
    openapiFields.add("plan_or_price");
    openapiFields.add("provision_first_project");
    openapiFields.add("return_to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("plan_or_price");
    openapiRequiredFields.add("provision_first_project");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSubscriptionBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSubscriptionBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscriptionBody is not found in the empty JSON string", CreateSubscriptionBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSubscriptionBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubscriptionBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("plan_or_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_or_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_or_price").toString()));
      }
      if (!jsonObj.get("provision_first_project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provision_first_project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provision_first_project").toString()));
      }
      if ((jsonObj.get("return_to") != null && !jsonObj.get("return_to").isJsonNull()) && !jsonObj.get("return_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_to").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionBody>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionBody
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionBody
  */
  public static CreateSubscriptionBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionBody.class);
  }

 /**
  * Convert an instance of CreateSubscriptionBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

