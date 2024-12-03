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
 * Contains a redirect URL used to complete a login, consent, or logout request.
 *
 * @param redirectTo RedirectURL is the URL which you should redirect the user's browser to once the authentication process is completed.
 */
@Serializable

data class OAuth2RedirectTo (

    /* RedirectURL is the URL which you should redirect the user's browser to once the authentication process is completed. */
    @SerialName(value = "redirect_to") @Required val redirectTo: kotlin.String

) {


}

