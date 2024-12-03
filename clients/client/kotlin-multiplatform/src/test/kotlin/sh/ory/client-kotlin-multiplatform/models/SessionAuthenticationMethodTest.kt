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

import sh.ory.client-kotlin-multiplatform.models.SessionAuthenticationMethod
import sh.ory.client-kotlin-multiplatform.models.AuthenticatorAssuranceLevel

class SessionAuthenticationMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SessionAuthenticationMethod
        //val modelInstance = SessionAuthenticationMethod()

        // to test the property `aal`
        should("test aal") {
            // uncomment below to test the property
            //modelInstance.aal shouldBe ("TODO")
        }

        // to test the property `completedAt` - When the authentication challenge was completed.
        should("test completedAt") {
            // uncomment below to test the property
            //modelInstance.completedAt shouldBe ("TODO")
        }

        // to test the property `method`
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `organization` - The Organization id used for authentication
        should("test organization") {
            // uncomment below to test the property
            //modelInstance.organization shouldBe ("TODO")
        }

        // to test the property `provider` - OIDC or SAML provider id used for authentication
        should("test provider") {
            // uncomment below to test the property
            //modelInstance.provider shouldBe ("TODO")
        }

    }
}
