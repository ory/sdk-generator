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
 * 
 *
 * @param country Country of the events
 * @param failed Number of events that failed in the given timeframe
 * @param succeeded Number of events that succeeded in the given timeframe
 */
@Serializable

data class SessionActivityDatapoint (

    /* Country of the events */
    @SerialName(value = "country") @Required val country: kotlin.String,

    /* Number of events that failed in the given timeframe */
    @SerialName(value = "failed") @Required val failed: kotlin.Long,

    /* Number of events that succeeded in the given timeframe */
    @SerialName(value = "succeeded") @Required val succeeded: kotlin.Long

) {


}

