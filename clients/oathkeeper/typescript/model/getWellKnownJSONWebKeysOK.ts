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

import { SwaggerJSONWebKeySet } from './swaggerJSONWebKeySet';

/**
* jsonWebKeySet
*/
export class GetWellKnownJSONWebKeysOK {
    'payload'?: SwaggerJSONWebKeySet;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "payload",
            "baseName": "Payload",
            "type": "SwaggerJSONWebKeySet"
        }    ];

    static getAttributeTypeMap() {
        return GetWellKnownJSONWebKeysOK.attributeTypeMap;
    }
}

