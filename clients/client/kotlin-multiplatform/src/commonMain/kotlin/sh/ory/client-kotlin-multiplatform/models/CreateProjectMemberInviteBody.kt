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
 * Create Project MemberInvite Request Body
 *
 * @param inviteeEmail A email to invite
 */
@Serializable

data class CreateProjectMemberInviteBody (

    /* A email to invite */
    @SerialName(value = "invitee_email") val inviteeEmail: kotlin.String? = null

) {


}

