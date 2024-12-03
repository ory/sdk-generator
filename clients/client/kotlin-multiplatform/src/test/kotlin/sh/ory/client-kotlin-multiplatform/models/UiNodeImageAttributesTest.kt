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

import sh.ory.client-kotlin-multiplatform.models.UiNodeImageAttributes

class UiNodeImageAttributesTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UiNodeImageAttributes
        //val modelInstance = UiNodeImageAttributes()

        // to test the property `height` - Height of the image
        should("test height") {
            // uncomment below to test the property
            //modelInstance.height shouldBe ("TODO")
        }

        // to test the property `id` - A unique identifier
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `nodeType` - NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"img\". text Text input Input img Image a Anchor script Script
        should("test nodeType") {
            // uncomment below to test the property
            //modelInstance.nodeType shouldBe ("TODO")
        }

        // to test the property `src` - The image's source URL.  format: uri
        should("test src") {
            // uncomment below to test the property
            //modelInstance.src shouldBe ("TODO")
        }

        // to test the property `width` - Width of the image
        should("test width") {
            // uncomment below to test the property
            //modelInstance.width shouldBe ("TODO")
        }

    }
}
