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


export class RuleHandler {
    /**
    * Config contains the configuration for the handler. Please read the user guide for a complete list of each handler\'s available settings.
    */
    'config'?: object;
    /**
    * Handler identifies the implementation which will be used to handle this specific request. Please read the user guide for a complete list of available handlers.
    */
    'handler'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "config",
            "baseName": "config",
            "type": "object"
        },
        {
            "name": "handler",
            "baseName": "handler",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return RuleHandler.attributeTypeMap;
    }
}

