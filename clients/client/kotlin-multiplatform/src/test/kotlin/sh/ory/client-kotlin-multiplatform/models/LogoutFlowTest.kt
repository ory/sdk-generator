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

import sh.ory.client-kotlin-multiplatform.models.LogoutFlow

class LogoutFlowTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of LogoutFlow
        //val modelInstance = LogoutFlow()

        // to test the property `logoutToken` - LogoutToken can be used to perform logout using AJAX.
        should("test logoutToken") {
            // uncomment below to test the property
            //modelInstance.logoutToken shouldBe ("TODO")
        }

        // to test the property `logoutUrl` - LogoutURL can be opened in a browser to sign the user out.  format: uri
        should("test logoutUrl") {
            // uncomment below to test the property
            //modelInstance.logoutUrl shouldBe ("TODO")
        }

    }
}
