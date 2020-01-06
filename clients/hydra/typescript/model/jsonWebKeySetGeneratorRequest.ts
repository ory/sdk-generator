/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.i+1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export class JsonWebKeySetGeneratorRequest {
    /**
    * The algorithm to be used for creating the key. Supports \"RS256\", \"ES512\", \"HS512\", and \"HS256\"
    */
    'alg': string;
    /**
    * The kid of the key to be created
    */
    'kid': string;
    /**
    * The \"use\" (public key use) parameter identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \"enc\" and \"sig\".
    */
    'use': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "alg",
            "baseName": "alg",
            "type": "string"
        },
        {
            "name": "kid",
            "baseName": "kid",
            "type": "string"
        },
        {
            "name": "use",
            "baseName": "use",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return JsonWebKeySetGeneratorRequest.attributeTypeMap;
    }
}

