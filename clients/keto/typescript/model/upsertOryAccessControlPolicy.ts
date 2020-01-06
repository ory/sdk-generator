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

import { OryAccessControlPolicy } from './oryAccessControlPolicy';

/**
* UpsertOryAccessControlPolicy upsert ory access control policy
*/
export class UpsertOryAccessControlPolicy {
    'body'?: OryAccessControlPolicy;
    /**
    * The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".  in: path
    */
    'flavor': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "body",
            "baseName": "Body",
            "type": "OryAccessControlPolicy"
        },
        {
            "name": "flavor",
            "baseName": "flavor",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return UpsertOryAccessControlPolicy.attributeTypeMap;
    }
}

