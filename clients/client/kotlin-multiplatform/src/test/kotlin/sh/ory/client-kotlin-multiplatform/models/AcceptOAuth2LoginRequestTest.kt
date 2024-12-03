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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import sh.ory.client-kotlin-multiplatform.models.AcceptOAuth2LoginRequest

class AcceptOAuth2LoginRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AcceptOAuth2LoginRequest
        //val modelInstance = AcceptOAuth2LoginRequest()

        // to test the property `subject` - Subject is the user ID of the end-user that authenticated.
        should("test subject") {
            // uncomment below to test the property
            //modelInstance.subject shouldBe ("TODO")
        }

        // to test the property `acr` - ACR sets the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
        should("test acr") {
            // uncomment below to test the property
            //modelInstance.acr shouldBe ("TODO")
        }

        // to test the property `amr`
        should("test amr") {
            // uncomment below to test the property
            //modelInstance.amr shouldBe ("TODO")
        }

        // to test the property `context`
        should("test context") {
            // uncomment below to test the property
            //modelInstance.context shouldBe ("TODO")
        }

        // to test the property `extendSessionLifespan` - Extend OAuth2 authentication session lifespan  If set to `true`, the OAuth2 authentication cookie lifespan is extended. This is for example useful if you want the user to be able to use `prompt=none` continuously.  This value can only be set to `true` if the user has an authentication, which is the case if the `skip` value is `true`.
        should("test extendSessionLifespan") {
            // uncomment below to test the property
            //modelInstance.extendSessionLifespan shouldBe ("TODO")
        }

        // to test the property `forceSubjectIdentifier` - ForceSubjectIdentifier forces the \"pairwise\" user ID of the end-user that authenticated. The \"pairwise\" user ID refers to the (Pairwise Identifier Algorithm)[http://openid.net/specs/openid-connect-core-1_0.html#PairwiseAlg] of the OpenID Connect specification. It allows you to set an obfuscated subject (\"user\") identifier that is unique to the client.  Please note that this changes the user ID on endpoint /userinfo and sub claim of the ID Token. It does not change the sub claim in the OAuth 2.0 Introspection.  Per default, ORY Hydra handles this value with its own algorithm. In case you want to set this yourself you can use this field. Please note that setting this field has no effect if `pairwise` is not configured in ORY Hydra or the OAuth 2.0 Client does not expect a pairwise identifier (set via `subject_type` key in the client's configuration).  Please also be aware that ORY Hydra is unable to properly compute this value during authentication. This implies that you have to compute this value on every authentication process (probably depending on the client ID or some other unique value).  If you fail to compute the proper value, then authentication processes which have id_token_hint set might fail.
        should("test forceSubjectIdentifier") {
            // uncomment below to test the property
            //modelInstance.forceSubjectIdentifier shouldBe ("TODO")
        }

        // to test the property `identityProviderSessionId` - IdentityProviderSessionID is the session ID of the end-user that authenticated. If specified, we will use this value to propagate the logout.
        should("test identityProviderSessionId") {
            // uncomment below to test the property
            //modelInstance.identityProviderSessionId shouldBe ("TODO")
        }

        // to test the property `remember` - Remember, if set to true, tells ORY Hydra to remember this user by telling the user agent (browser) to store a cookie with authentication data. If the same user performs another OAuth 2.0 Authorization Request, he/she will not be asked to log in again.
        should("test remember") {
            // uncomment below to test the property
            //modelInstance.remember shouldBe ("TODO")
        }

        // to test the property `rememberFor` - RememberFor sets how long the authentication should be remembered for in seconds. If set to `0`, the authorization will be remembered for the duration of the browser session (using a session cookie).
        should("test rememberFor") {
            // uncomment below to test the property
            //modelInstance.rememberFor shouldBe ("TODO")
        }

    }
}
