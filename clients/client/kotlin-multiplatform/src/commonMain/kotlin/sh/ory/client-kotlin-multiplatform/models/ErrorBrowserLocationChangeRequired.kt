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

import sh.ory.client-kotlin-multiplatform.models.ErrorGeneric

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param error 
 * @param redirectBrowserTo Points to where to redirect the user to next.
 */
@Serializable

data class ErrorBrowserLocationChangeRequired (

    @SerialName(value = "error") val error: ErrorGeneric? = null,

    /* Points to where to redirect the user to next. */
    @SerialName(value = "redirect_browser_to") val redirectBrowserTo: kotlin.String? = null

) {


}

