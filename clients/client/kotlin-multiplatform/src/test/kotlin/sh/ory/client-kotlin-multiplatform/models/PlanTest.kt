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

import sh.ory.client-kotlin-multiplatform.models.Plan

class PlanTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of Plan
        //val modelInstance = Plan()

        // to test the property `name` - Name is the name of the plan.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `version` - Version is the version of the plan. The combination of `name@version` must be unique.
        should("test version") {
            // uncomment below to test the property
            //modelInstance.version shouldBe ("TODO")
        }

    }
}
