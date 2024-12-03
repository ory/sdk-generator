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

import sh.ory.client-kotlin-multiplatform.models.IsOwnerForProjectBySlug

class IsOwnerForProjectBySlugTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of IsOwnerForProjectBySlug
        //val modelInstance = IsOwnerForProjectBySlug()

        // to test the property `projectSlug` - ProjectSlug is the project's slug.
        should("test projectSlug") {
            // uncomment below to test the property
            //modelInstance.projectSlug shouldBe ("TODO")
        }

        // to test the property `subject` - Subject is the subject from the API key.
        should("test subject") {
            // uncomment below to test the property
            //modelInstance.subject shouldBe ("TODO")
        }

    }
}
