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
import java.util.Map;

/**
 * JudgeInternalServerErrorBody JudgeInternalServerErrorBody JudgeInternalServerErrorBody judge internal server error body
 */
@ApiModel(description = "JudgeInternalServerErrorBody JudgeInternalServerErrorBody JudgeInternalServerErrorBody judge internal server error body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:31:08.662984+01:00[Europe/Berlin]")
public class JudgeInternalServerErrorBody {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<Map<String, Object>> details = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public JudgeInternalServerErrorBody code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "code")

  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public JudgeInternalServerErrorBody details(List<Map<String, Object>> details) {
    
    this.details = details;
    return this;
  }

  public JudgeInternalServerErrorBody addDetailsItem(Map<String, Object> detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Map<String, Object>>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "details")

  public List<Map<String, Object>> getDetails() {
    return details;
  }


  public void setDetails(List<Map<String, Object>> details) {
    this.details = details;
  }


  public JudgeInternalServerErrorBody message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public JudgeInternalServerErrorBody reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "reason")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public JudgeInternalServerErrorBody request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * request
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "request")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public JudgeInternalServerErrorBody status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JudgeInternalServerErrorBody judgeInternalServerErrorBody = (JudgeInternalServerErrorBody) o;
    return Objects.equals(this.code, judgeInternalServerErrorBody.code) &&
        Objects.equals(this.details, judgeInternalServerErrorBody.details) &&
        Objects.equals(this.message, judgeInternalServerErrorBody.message) &&
        Objects.equals(this.reason, judgeInternalServerErrorBody.reason) &&
        Objects.equals(this.request, judgeInternalServerErrorBody.request) &&
        Objects.equals(this.status, judgeInternalServerErrorBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details, message, reason, request, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JudgeInternalServerErrorBody {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

