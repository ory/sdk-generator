/**
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.34
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export class AddOryAccessControlPolicyRoleMembersBody {
    /**
    * The members to be added.
    */
    'members'?: Array<string>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "members",
            "baseName": "members",
            "type": "Array<string>"
        }    ];

    static getAttributeTypeMap() {
        return AddOryAccessControlPolicyRoleMembersBody.attributeTypeMap;
    }
}

