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

import sh.ory.client-kotlin-multiplatform.models.IdentityWithCredentialsOidcConfig
import sh.ory.client-kotlin-multiplatform.models.IdentityWithCredentialsOidcConfigProvider
import sh.ory.client-kotlin-multiplatform.models.IdentityWithCredentialsPasswordConfig

class IdentityWithCredentialsOidcConfigTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of IdentityWithCredentialsOidcConfig
        //val modelInstance = IdentityWithCredentialsOidcConfig()

        // to test the property `config`
        should("test config") {
            // uncomment below to test the property
            //modelInstance.config shouldBe ("TODO")
        }

        // to test the property `providers` - A list of OpenID Connect Providers
        should("test providers") {
            // uncomment below to test the property
            //modelInstance.providers shouldBe ("TODO")
        }

    }
}
