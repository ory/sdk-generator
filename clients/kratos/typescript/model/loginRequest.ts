/**
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.36
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { LoginRequestMethod } from './loginRequestMethod';

export class LoginRequest {
    /**
    * and so on.
    */
    'active'?: string;
    /**
    * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to log in, a new request has to be initiated.
    */
    'expiresAt'?: Date;
    'id'?: string;
    /**
    * IssuedAt is the time (UTC) when the request occurred.
    */
    'issuedAt'?: Date;
    /**
    * Methods contains context for all enabled login methods. If a login request has been processed, but for example the password is incorrect, this will contain error messages.
    */
    'methods'?: { [key: string]: LoginRequestMethod; };
    /**
    * RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL\'s path or query for example.
    */
    'requestUrl'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "active",
            "baseName": "active",
            "type": "string"
        },
        {
            "name": "expiresAt",
            "baseName": "expires_at",
            "type": "Date"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "issuedAt",
            "baseName": "issued_at",
            "type": "Date"
        },
        {
            "name": "methods",
            "baseName": "methods",
            "type": "{ [key: string]: LoginRequestMethod; }"
        },
        {
            "name": "requestUrl",
            "baseName": "request_url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return LoginRequest.attributeTypeMap;
    }
}

