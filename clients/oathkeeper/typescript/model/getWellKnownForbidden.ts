/**
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1+1
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { GetWellKnownForbiddenBody } from './getWellKnownForbiddenBody';

/**
* The standard error format
*/
export class GetWellKnownForbidden {
    'payload'?: GetWellKnownForbiddenBody;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "payload",
            "baseName": "Payload",
            "type": "GetWellKnownForbiddenBody"
        }    ];

    static getAttributeTypeMap() {
        return GetWellKnownForbidden.attributeTypeMap;
    }
}

