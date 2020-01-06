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


/**
* DeleteOryAccessControlPolicyInternalServerErrorBody DeleteOryAccessControlPolicyInternalServerErrorBody delete ory access control policy internal server error body
*/
export class DeleteOryAccessControlPolicyInternalServerErrorBody {
    /**
    * code
    */
    'code'?: number;
    /**
    * details
    */
    'details'?: Array<{ [key: string]: object; }>;
    /**
    * message
    */
    'message'?: string;
    /**
    * reason
    */
    'reason'?: string;
    /**
    * request
    */
    'request'?: string;
    /**
    * status
    */
    'status'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "code",
            "baseName": "code",
            "type": "number"
        },
        {
            "name": "details",
            "baseName": "details",
            "type": "Array<{ [key: string]: object; }>"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string"
        },
        {
            "name": "reason",
            "baseName": "reason",
            "type": "string"
        },
        {
            "name": "request",
            "baseName": "request",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return DeleteOryAccessControlPolicyInternalServerErrorBody.attributeTypeMap;
    }
}

