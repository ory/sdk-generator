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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param height Height of the image
 * @param id A unique identifier
 * @param nodeType NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"img\". text Text input Input img Image a Anchor script Script
 * @param src The image's source URL.  format: uri
 * @param width Width of the image
 */
@Serializable

data class UiNodeImageAttributes (

    /* Height of the image */
    @SerialName(value = "height") @Required val height: kotlin.Long,

    /* A unique identifier */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"img\". text Text input Input img Image a Anchor script Script */
    @SerialName(value = "node_type") @Required val nodeType: UiNodeImageAttributes.NodeType,

    /* The image's source URL.  format: uri */
    @SerialName(value = "src") @Required val src: kotlin.String,

    /* Width of the image */
    @SerialName(value = "width") @Required val width: kotlin.Long

) {

    /**
     * NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"img\". text Text input Input img Image a Anchor script Script
     *
     * Values: text,input,img,a,script
     */
    @Serializable
    enum class NodeType(val value: kotlin.String) {
        @SerialName(value = "text") text("text"),
        @SerialName(value = "input") input("input"),
        @SerialName(value = "img") img("img"),
        @SerialName(value = "a") a("a"),
        @SerialName(value = "script") script("script");
    }

}

