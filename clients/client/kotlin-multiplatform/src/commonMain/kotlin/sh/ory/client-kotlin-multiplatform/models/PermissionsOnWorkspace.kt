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
 * Get Permissions on Project Request Parameters
 *
 * @param permissions 
 */
@Serializable

data class PermissionsOnWorkspace (

    @SerialName(value = "permissions") val permissions: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null

) {


}

