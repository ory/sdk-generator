/**
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.2
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* Role Role Role Role Role Role Role Role Role represents a group of users that share the same role. A role could be an administrator, a moderator, a regular user or some other sort of role.
*/
export class Role {
    /**
    * ID is the role\'s unique id.
    */
    'id'?: string;
    /**
    * Members is who belongs to the role.
    */
    'members'?: Array<string>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "members",
            "baseName": "members",
            "type": "Array<string>"
        }    ];

    static getAttributeTypeMap() {
        return Role.attributeTypeMap;
    }
}

