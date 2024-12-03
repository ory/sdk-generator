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

import sh.ory.client-kotlin-multiplatform.models.VerifiableIdentityAddress

class VerifiableIdentityAddressTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of VerifiableIdentityAddress
        //val modelInstance = VerifiableIdentityAddress()

        // to test the property `status` - VerifiableAddressStatus must not exceed 16 characters as that is the limitation in the SQL Schema
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property ``value`` - The address value  example foo@user.com
        should("test `value`") {
            // uncomment below to test the property
            //modelInstance.`value` shouldBe ("TODO")
        }

        // to test the property `verified` - Indicates if the address has already been verified
        should("test verified") {
            // uncomment below to test the property
            //modelInstance.verified shouldBe ("TODO")
        }

        // to test the property `via` - The delivery method
        should("test via") {
            // uncomment below to test the property
            //modelInstance.via shouldBe ("TODO")
        }

        // to test the property `createdAt` - When this entry was created
        should("test createdAt") {
            // uncomment below to test the property
            //modelInstance.createdAt shouldBe ("TODO")
        }

        // to test the property `id` - The ID
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `updatedAt` - When this entry was last updated
        should("test updatedAt") {
            // uncomment below to test the property
            //modelInstance.updatedAt shouldBe ("TODO")
        }

        // to test the property `verifiedAt`
        should("test verifiedAt") {
            // uncomment below to test the property
            //modelInstance.verifiedAt shouldBe ("TODO")
        }

    }
}
