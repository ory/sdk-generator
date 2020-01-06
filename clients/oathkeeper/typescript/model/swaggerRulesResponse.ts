/**
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.33
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { SwaggerRule } from './swaggerRule';

/**
* SwaggerRulesResponse A list of rules
*/
export class SwaggerRulesResponse {
    /**
    * in: body type: array
    */
    'body'?: Array<SwaggerRule>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "body",
            "baseName": "Body",
            "type": "Array<SwaggerRule>"
        }    ];

    static getAttributeTypeMap() {
        return SwaggerRulesResponse.attributeTypeMap;
    }
}

