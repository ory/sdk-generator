/*
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0
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

/**
 * ListOryAccessControlPolicyRoles list ory access control policy roles
 */
@ApiModel(description = "ListOryAccessControlPolicyRoles list ory access control policy roles")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-25T16:37:26.186454+01:00[Europe/Berlin]")
public class ListOryAccessControlPolicyRoles {
  public static final String SERIALIZED_NAME_FLAVOR = "flavor";
  @SerializedName(SERIALIZED_NAME_FLAVOR)
  private String flavor;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Long offset;


  public ListOryAccessControlPolicyRoles flavor(String flavor) {
    
    this.flavor = flavor;
    return this;
  }

   /**
   * The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;  in: path
   * @return flavor
  **/
  @ApiModelProperty(required = true, value = "The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\"  in: path")

  public String getFlavor() {
    return flavor;
  }


  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }


  public ListOryAccessControlPolicyRoles limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The maximum amount of policies returned.  in: query
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum amount of policies returned.  in: query")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  public ListOryAccessControlPolicyRoles offset(Long offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The offset from where to start looking.  in: query
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset from where to start looking.  in: query")

  public Long getOffset() {
    return offset;
  }


  public void setOffset(Long offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOryAccessControlPolicyRoles listOryAccessControlPolicyRoles = (ListOryAccessControlPolicyRoles) o;
    return Objects.equals(this.flavor, listOryAccessControlPolicyRoles.flavor) &&
        Objects.equals(this.limit, listOryAccessControlPolicyRoles.limit) &&
        Objects.equals(this.offset, listOryAccessControlPolicyRoles.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flavor, limit, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOryAccessControlPolicyRoles {\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

