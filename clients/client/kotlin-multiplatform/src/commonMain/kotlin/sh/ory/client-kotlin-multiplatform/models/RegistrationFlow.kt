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

import sh.ory.client-kotlin-multiplatform.models.OAuth2LoginRequest
import sh.ory.client-kotlin-multiplatform.models.UiContainer

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param expiresAt ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
 * @param id ID represents the flow's unique ID. When performing the registration flow, this represents the id in the registration ui's query parameter: http://<selfservice.flows.registration.ui_url>/?flow=<id>
 * @param issuedAt IssuedAt is the time (UTC) when the flow occurred.
 * @param requestUrl RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.
 * @param state State represents the state of this request:  choose_method: ask the user to choose a method (e.g. registration with email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the registration challenge was passed.
 * @param type The flow type can either be `api` or `browser`.
 * @param ui 
 * @param active Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
 * @param oauth2LoginChallenge Ory OAuth 2.0 Login Challenge.  This value is set using the `login_challenge` query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider.
 * @param oauth2LoginRequest 
 * @param organizationId 
 * @param returnTo ReturnTo contains the requested return_to URL.
 * @param sessionTokenExchangeCode SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \"api\", and only on creating the flow.
 * @param transientPayload TransientPayload is used to pass data from the registration to a webhook
 */
@Serializable

data class RegistrationFlow (

    /* ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated. */
    @SerialName(value = "expires_at") @Required val expiresAt: kotlinx.datetime.Instant,

    /* ID represents the flow's unique ID. When performing the registration flow, this represents the id in the registration ui's query parameter: http://<selfservice.flows.registration.ui_url>/?flow=<id> */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* IssuedAt is the time (UTC) when the flow occurred. */
    @SerialName(value = "issued_at") @Required val issuedAt: kotlinx.datetime.Instant,

    /* RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example. */
    @SerialName(value = "request_url") @Required val requestUrl: kotlin.String,

    /* State represents the state of this request:  choose_method: ask the user to choose a method (e.g. registration with email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the registration challenge was passed. */
    @SerialName(value = "state") @Required val state: kotlin.Any?,

    /* The flow type can either be `api` or `browser`. */
    @SerialName(value = "type") @Required val type: kotlin.String,

    @SerialName(value = "ui") @Required val ui: UiContainer,

    /* Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode */
    @SerialName(value = "active") val active: RegistrationFlow.Active? = null,

    /* Ory OAuth 2.0 Login Challenge.  This value is set using the `login_challenge` query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider. */
    @SerialName(value = "oauth2_login_challenge") val oauth2LoginChallenge: kotlin.String? = null,

    @SerialName(value = "oauth2_login_request") val oauth2LoginRequest: OAuth2LoginRequest? = null,

    @SerialName(value = "organization_id") val organizationId: kotlin.String? = null,

    /* ReturnTo contains the requested return_to URL. */
    @SerialName(value = "return_to") val returnTo: kotlin.String? = null,

    /* SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \"api\", and only on creating the flow. */
    @SerialName(value = "session_token_exchange_code") val sessionTokenExchangeCode: kotlin.String? = null,

    /* TransientPayload is used to pass data from the registration to a webhook */
    @SerialName(value = "transient_payload") val transientPayload: kotlin.String? = null

) {

    /**
     * Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
     *
     * Values: password,oidc,totp,lookup_secret,webauthn,code,passkey,profile,link_recovery,code_recovery
     */
    @Serializable
    enum class Active(val value: kotlin.String) {
        @SerialName(value = "password") password("password"),
        @SerialName(value = "oidc") oidc("oidc"),
        @SerialName(value = "totp") totp("totp"),
        @SerialName(value = "lookup_secret") lookup_secret("lookup_secret"),
        @SerialName(value = "webauthn") webauthn("webauthn"),
        @SerialName(value = "code") code("code"),
        @SerialName(value = "passkey") passkey("passkey"),
        @SerialName(value = "profile") profile("profile"),
        @SerialName(value = "link_recovery") link_recovery("link_recovery"),
        @SerialName(value = "code_recovery") code_recovery("code_recovery");
    }

}

