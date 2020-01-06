/*
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.34
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.model;

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

/**
 * Input
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:45:32.523661+01:00[Europe/Berlin]")
public class Input {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Map<String, Object> context = null;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public Input action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action is the action that is requested on the resource.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Action is the action that is requested on the resource.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public Input context(Map<String, Object> context) {
    
    this.context = context;
    return this;
  }

  public Input putContextItem(String key, Object contextItem) {
    if (this.context == null) {
      this.context = new HashMap<String, Object>();
    }
    this.context.put(key, contextItem);
    return this;
  }

   /**
   * Context is the request&#39;s environmental context.
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Context is the request's environmental context.")

  public Map<String, Object> getContext() {
    return context;
  }


  public void setContext(Map<String, Object> context) {
    this.context = context;
  }


  public Input resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Resource is the resource that access is requested to.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource is the resource that access is requested to.")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public Input subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the subject that is requesting access.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject is the subject that is requesting access.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return Objects.equals(this.action, input.action) &&
        Objects.equals(this.context, input.context) &&
        Objects.equals(this.resource, input.resource) &&
        Objects.equals(this.subject, input.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, context, resource, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

