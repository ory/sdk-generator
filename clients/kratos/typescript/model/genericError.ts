/**
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.34
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.
*/
export class GenericError {
    /**
    * Name is the error name.
    */
    'error': string;
    /**
    * Code represents the error status code (404, 403, 401, ...).
    */
    'errorCode'?: number;
    /**
    * Debug contains debug information. This is usually not available and has to be enabled.
    */
    'errorDebug'?: string;
    /**
    * Hint contains further information on the nature of the error.
    */
    'errorHint'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "error",
            "baseName": "error",
            "type": "string"
        },
        {
            "name": "errorCode",
            "baseName": "error_code",
            "type": "number"
        },
        {
            "name": "errorDebug",
            "baseName": "error_debug",
            "type": "string"
        },
        {
            "name": "errorHint",
            "baseName": "error_hint",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return GenericError.attributeTypeMap;
    }
}

