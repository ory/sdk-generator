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

import sh.ory.client-kotlin-multiplatform.models.OAuth2ConsentSession
import sh.ory.client-kotlin-multiplatform.models.AcceptOAuth2ConsentRequestSession
import sh.ory.client-kotlin-multiplatform.models.OAuth2ConsentRequest
import sh.ory.client-kotlin-multiplatform.models.OAuth2ConsentSessionExpiresAt

class OAuth2ConsentSessionTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of OAuth2ConsentSession
        //val modelInstance = OAuth2ConsentSession()

        // to test the property `consentRequest`
        should("test consentRequest") {
            // uncomment below to test the property
            //modelInstance.consentRequest shouldBe ("TODO")
        }

        // to test the property `context`
        should("test context") {
            // uncomment below to test the property
            //modelInstance.context shouldBe ("TODO")
        }

        // to test the property `expiresAt`
        should("test expiresAt") {
            // uncomment below to test the property
            //modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property `grantAccessTokenAudience`
        should("test grantAccessTokenAudience") {
            // uncomment below to test the property
            //modelInstance.grantAccessTokenAudience shouldBe ("TODO")
        }

        // to test the property `grantScope`
        should("test grantScope") {
            // uncomment below to test the property
            //modelInstance.grantScope shouldBe ("TODO")
        }

        // to test the property `handledAt`
        should("test handledAt") {
            // uncomment below to test the property
            //modelInstance.handledAt shouldBe ("TODO")
        }

        // to test the property `remember` - Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
        should("test remember") {
            // uncomment below to test the property
            //modelInstance.remember shouldBe ("TODO")
        }

        // to test the property `rememberFor` - Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.
        should("test rememberFor") {
            // uncomment below to test the property
            //modelInstance.rememberFor shouldBe ("TODO")
        }

        // to test the property `session`
        should("test session") {
            // uncomment below to test the property
            //modelInstance.session shouldBe ("TODO")
        }

    }
}
