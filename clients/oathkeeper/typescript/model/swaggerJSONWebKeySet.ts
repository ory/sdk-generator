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

import { SwaggerJSONWebKey } from './swaggerJSONWebKey';

/**
* SwaggerJSONWebKeySet swagger JSON web key set
*/
export class SwaggerJSONWebKeySet {
    /**
    * The value of the \"keys\" parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.
    */
    'keys'?: Array<SwaggerJSONWebKey>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "keys",
            "baseName": "keys",
            "type": "Array<SwaggerJSONWebKey>"
        }    ];

    static getAttributeTypeMap() {
        return SwaggerJSONWebKeySet.attributeTypeMap;
    }
}

