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

import sh.ory.client-kotlin-multiplatform.models.UpdateLoginFlowWithPasskeyMethod

class UpdateLoginFlowWithPasskeyMethodTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UpdateLoginFlowWithPasskeyMethod
        //val modelInstance = UpdateLoginFlowWithPasskeyMethod()

        // to test the property `method` - Method should be set to \"passkey\" when logging in using the Passkey strategy.
        should("test method") {
            // uncomment below to test the property
            //modelInstance.method shouldBe ("TODO")
        }

        // to test the property `csrfToken` - Sending the anti-csrf token is only required for browser login flows.
        should("test csrfToken") {
            // uncomment below to test the property
            //modelInstance.csrfToken shouldBe ("TODO")
        }

        // to test the property `passkeyLogin` - Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
        should("test passkeyLogin") {
            // uncomment below to test the property
            //modelInstance.passkeyLogin shouldBe ("TODO")
        }

    }
}
