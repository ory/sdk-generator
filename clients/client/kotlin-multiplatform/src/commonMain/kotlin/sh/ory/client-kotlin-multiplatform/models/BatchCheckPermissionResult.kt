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

import sh.ory.client-kotlin-multiplatform.models.CheckPermissionResultWithError

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Batch Check Permission Result
 *
 * @param results An array of check results. The order aligns with the input order.
 */
@Serializable

data class BatchCheckPermissionResult (

    /* An array of check results. The order aligns with the input order. */
    @SerialName(value = "results") @Required val results: kotlin.collections.List<CheckPermissionResultWithError>

) {


}

