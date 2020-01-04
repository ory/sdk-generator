/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.19
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
    * Debug contains debug information. This is usually not available and has to be enabled.
    */
    'debug'?: string;
    /**
    * Name is the error name.
    */
    'error': string;
    /**
    * Description contains further information on the nature of the error.
    */
    'errorDescription'?: string;
    /**
    * Code represents the error status code (404, 403, 401, ...).
    */
    'statusCode'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "debug",
            "baseName": "debug",
            "type": "string"
        },
        {
            "name": "error",
            "baseName": "error",
            "type": "string"
        },
        {
            "name": "errorDescription",
            "baseName": "error_description",
            "type": "string"
        },
        {
            "name": "statusCode",
            "baseName": "status_code",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return GenericError.attributeTypeMap;
    }
}

