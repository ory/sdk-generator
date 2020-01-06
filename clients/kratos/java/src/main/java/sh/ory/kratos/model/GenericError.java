/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

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
 * Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.
 */
@ApiModel(description = "Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:27:34.032060+01:00[Europe/Berlin]")
public class GenericError {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private Long errorCode;

  public static final String SERIALIZED_NAME_ERROR_DEBUG = "error_debug";
  @SerializedName(SERIALIZED_NAME_ERROR_DEBUG)
  private String errorDebug;

  public static final String SERIALIZED_NAME_ERROR_HINT = "error_hint";
  @SerializedName(SERIALIZED_NAME_ERROR_HINT)
  private String errorHint;


  public GenericError error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Name is the error name.
   * @return error
  **/
  @ApiModelProperty(example = "The requested resource could not be found", required = true, value = "Name is the error name.")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public GenericError errorCode(Long errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Code represents the error status code (404, 403, 401, ...).
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "404", value = "Code represents the error status code (404, 403, 401, ...).")

  public Long getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
  }


  public GenericError errorDebug(String errorDebug) {
    
    this.errorDebug = errorDebug;
    return this;
  }

   /**
   * Debug contains debug information. This is usually not available and has to be enabled.
   * @return errorDebug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The database adapter was unable to find the element", value = "Debug contains debug information. This is usually not available and has to be enabled.")

  public String getErrorDebug() {
    return errorDebug;
  }


  public void setErrorDebug(String errorDebug) {
    this.errorDebug = errorDebug;
  }


  public GenericError errorHint(String errorHint) {
    
    this.errorHint = errorHint;
    return this;
  }

   /**
   * Hint contains further information on the nature of the error.
   * @return errorHint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Object with RequestID 12345 does not exist", value = "Hint contains further information on the nature of the error.")

  public String getErrorHint() {
    return errorHint;
  }


  public void setErrorHint(String errorHint) {
    this.errorHint = errorHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericError genericError = (GenericError) o;
    return Objects.equals(this.error, genericError.error) &&
        Objects.equals(this.errorCode, genericError.errorCode) &&
        Objects.equals(this.errorDebug, genericError.errorDebug) &&
        Objects.equals(this.errorHint, genericError.errorHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorCode, errorDebug, errorHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDebug: ").append(toIndentedString(errorDebug)).append("\n");
    sb.append("    errorHint: ").append(toIndentedString(errorHint)).append("\n");
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

