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

import sh.ory.client-kotlin-multiplatform.models.BatchCheckPermissionResult
import sh.ory.client-kotlin-multiplatform.models.CheckPermissionResultWithError

class BatchCheckPermissionResultTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BatchCheckPermissionResult
        //val modelInstance = BatchCheckPermissionResult()

        // to test the property `results` - An array of check results. The order aligns with the input order.
        should("test results") {
            // uncomment below to test the property
            //modelInstance.results shouldBe ("TODO")
        }

    }
}
