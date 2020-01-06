/**
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1+1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { OryAccessControlPolicyRole } from './oryAccessControlPolicyRole';

/**
* oryAccessControlPolicyRole
*/
export class UpsertOryAccessControlPolicyRoleOK {
    'payload'?: OryAccessControlPolicyRole;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "payload",
            "baseName": "Payload",
            "type": "OryAccessControlPolicyRole"
        }    ];

    static getAttributeTypeMap() {
        return UpsertOryAccessControlPolicyRoleOK.attributeTypeMap;
    }
}

