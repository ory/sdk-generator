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

import sh.ory.client-kotlin-multiplatform.models.ContinueWithRecoveryUi
import sh.ory.client-kotlin-multiplatform.models.ContinueWithRecoveryUiFlow
import sh.ory.client-kotlin-multiplatform.models.ContinueWithRedirectBrowserTo
import sh.ory.client-kotlin-multiplatform.models.ContinueWithSetOrySessionToken
import sh.ory.client-kotlin-multiplatform.models.ContinueWithSettingsUi
import sh.ory.client-kotlin-multiplatform.models.ContinueWithVerificationUi

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param action Action will always be `redirect_browser_to` redirect_browser_to ContinueWithActionRedirectBrowserToString
 * @param flow 
 * @param orySessionToken Token is the token of the session
 * @param redirectBrowserTo The URL to redirect the browser to
 */


interface ContinueWith {

    /* Action will always be `redirect_browser_to` redirect_browser_to ContinueWithActionRedirectBrowserToString */
    @SerialName(value = "action") @Required val action: ContinueWith.Action
    @SerialName(value = "flow") @Required val flow: ContinueWithRecoveryUiFlow
    /* Token is the token of the session */
    @SerialName(value = "ory_session_token") @Required val orySessionToken: kotlin.String
    /* The URL to redirect the browser to */
    @SerialName(value = "redirect_browser_to") @Required val redirectBrowserTo: kotlin.String
    /**
     * Action will always be `redirect_browser_to` redirect_browser_to ContinueWithActionRedirectBrowserToString
     *
     * Values: redirect_browser_to
     */
    @Serializable
    enum class Action(val value: kotlin.String) {
        @SerialName(value = "redirect_browser_to") redirect_browser_to("redirect_browser_to");
    }

}

