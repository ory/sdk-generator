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
 * Create B2B SSO Organization Request Body
 *
 * @param domains Domains contains the list of organization's domains.
 * @param label Label contains the organization's label.
 */
@Serializable

data class OrganizationBody (

    /* Domains contains the list of organization's domains. */
    @SerialName(value = "domains") val domains: kotlin.collections.List<kotlin.String>? = null,

    /* Label contains the organization's label. */
    @SerialName(value = "label") val label: kotlin.String? = null

) {


}

