/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package sh.ory.client-kotlin-multiplatform.models


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Ory Identity Schema Validation Result
 *
 * @param message 
 * @param valid 
 */
@Serializable

data class ManagedIdentitySchemaValidationResult (

    @SerialName(value = "message") val message: kotlin.String? = null,

    @SerialName(value = "valid") val valid: kotlin.Boolean? = null

) {


}

