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

import sh.ory.client-kotlin-multiplatform.models.TrustedOAuth2JwtGrantJsonWebKey

class TrustedOAuth2JwtGrantJsonWebKeyTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TrustedOAuth2JwtGrantJsonWebKey
        //val modelInstance = TrustedOAuth2JwtGrantJsonWebKey()

        // to test the property `kid` - The \"key_id\" is key unique identifier (same as kid header in jws/jwt).
        should("test kid") {
            // uncomment below to test the property
            //modelInstance.kid shouldBe ("TODO")
        }

        // to test the property `set` - The \"set\" is basically a name for a group(set) of keys. Will be the same as \"issuer\" in grant.
        should("test set") {
            // uncomment below to test the property
            //modelInstance.set shouldBe ("TODO")
        }

    }
}
