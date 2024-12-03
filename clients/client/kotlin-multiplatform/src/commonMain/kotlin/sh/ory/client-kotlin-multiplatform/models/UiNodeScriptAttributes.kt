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
 * @param async The script async type
 * @param crossorigin The script cross origin policy
 * @param id A unique identifier
 * @param integrity The script's integrity hash
 * @param nodeType NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is \"script\". text Text input Input img Image a Anchor script Script
 * @param nonce Nonce for CSP  A nonce you may want to use to improve your Content Security Policy. You do not have to use this value but if you want to improve your CSP policies you may use it. You can also choose to use your own nonce value!
 * @param referrerpolicy The script referrer policy
 * @param src The script source
 * @param type The script MIME type
 */
@Serializable

data class UiNodeScriptAttributes (

    /* The script async type */
    @SerialName(value = "async") @Required val async: kotlin.Boolean,

    /* The script cross origin policy */
    @SerialName(value = "crossorigin") @Required val crossorigin: kotlin.String,

    /* A unique identifier */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The script's integrity hash */
    @SerialName(value = "integrity") @Required val integrity: kotlin.String,

    /* NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is \"script\". text Text input Input img Image a Anchor script Script */
    @SerialName(value = "node_type") @Required val nodeType: UiNodeScriptAttributes.NodeType,

    /* Nonce for CSP  A nonce you may want to use to improve your Content Security Policy. You do not have to use this value but if you want to improve your CSP policies you may use it. You can also choose to use your own nonce value! */
    @SerialName(value = "nonce") @Required val nonce: kotlin.String,

    /* The script referrer policy */
    @SerialName(value = "referrerpolicy") @Required val referrerpolicy: kotlin.String,

    /* The script source */
    @SerialName(value = "src") @Required val src: kotlin.String,

    /* The script MIME type */
    @SerialName(value = "type") @Required val type: kotlin.String

) {

    /**
     * NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is \"script\". text Text input Input img Image a Anchor script Script
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

