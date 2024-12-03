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

import sh.ory.client-kotlin-multiplatform.models.RecoveryFlow
import sh.ory.client-kotlin-multiplatform.models.ContinueWith
import sh.ory.client-kotlin-multiplatform.models.UiContainer

class RecoveryFlowTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RecoveryFlow
        //val modelInstance = RecoveryFlow()

        // to test the property `expiresAt` - ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the setting, a new request has to be initiated.
        should("test expiresAt") {
            // uncomment below to test the property
            //modelInstance.expiresAt shouldBe ("TODO")
        }

        // to test the property `id` - ID represents the request's unique ID. When performing the recovery flow, this represents the id in the recovery ui's query parameter: http://<selfservice.flows.recovery.ui_url>?request=<id>
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `issuedAt` - IssuedAt is the time (UTC) when the request occurred.
        should("test issuedAt") {
            // uncomment below to test the property
            //modelInstance.issuedAt shouldBe ("TODO")
        }

        // to test the property `requestUrl` - RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.
        should("test requestUrl") {
            // uncomment below to test the property
            //modelInstance.requestUrl shouldBe ("TODO")
        }

        // to test the property `state` - State represents the state of this request:  choose_method: ask the user to choose a method (e.g. recover account via email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the recovery challenge was passed.
        should("test state") {
            // uncomment below to test the property
            //modelInstance.state shouldBe ("TODO")
        }

        // to test the property `type` - The flow type can either be `api` or `browser`.
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `ui`
        should("test ui") {
            // uncomment below to test the property
            //modelInstance.ui shouldBe ("TODO")
        }

        // to test the property `active` - Active, if set, contains the recovery method that is being used. It is initially not set.
        should("test active") {
            // uncomment below to test the property
            //modelInstance.active shouldBe ("TODO")
        }

        // to test the property `continueWith` - Contains possible actions that could follow this flow
        should("test continueWith") {
            // uncomment below to test the property
            //modelInstance.continueWith shouldBe ("TODO")
        }

        // to test the property `returnTo` - ReturnTo contains the requested return_to URL.
        should("test returnTo") {
            // uncomment below to test the property
            //modelInstance.returnTo shouldBe ("TODO")
        }

        // to test the property `transientPayload` - TransientPayload is used to pass data from the recovery flow to hooks and email templates
        should("test transientPayload") {
            // uncomment below to test the property
            //modelInstance.transientPayload shouldBe ("TODO")
        }

    }
}
