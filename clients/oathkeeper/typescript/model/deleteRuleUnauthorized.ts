/**
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.5
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { DeleteRuleUnauthorizedBody } from './deleteRuleUnauthorizedBody';

/**
* The standard error format
*/
export class DeleteRuleUnauthorized {
    'payload'?: DeleteRuleUnauthorizedBody;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "payload",
            "baseName": "Payload",
            "type": "DeleteRuleUnauthorizedBody"
        }    ];

    static getAttributeTypeMap() {
        return DeleteRuleUnauthorized.attributeTypeMap;
    }
}

