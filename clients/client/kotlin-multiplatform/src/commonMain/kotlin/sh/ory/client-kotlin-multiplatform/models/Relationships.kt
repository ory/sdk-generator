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

import sh.ory.client-kotlin-multiplatform.models.Relationship

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Paginated Relationship List
 *
 * @param nextPageToken The opaque token to provide in a subsequent request to get the next page. It is the empty string iff this is the last page.
 * @param relationTuples 
 */
@Serializable

data class Relationships (

    /* The opaque token to provide in a subsequent request to get the next page. It is the empty string iff this is the last page. */
    @SerialName(value = "next_page_token") val nextPageToken: kotlin.String? = null,

    @SerialName(value = "relation_tuples") val relationTuples: kotlin.collections.List<Relationship>? = null

) {


}

