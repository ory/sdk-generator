/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* The token response
*/
export class OauthTokenResponse {
    /**
    * The access token issued by the authorization server.
    */
    'accessToken'?: string;
    /**
    * The lifetime in seconds of the access token.  For example, the value \"3600\" denotes that the access token will expire in one hour from the time the response was generated.
    */
    'expiresIn'?: number;
    /**
    * To retrieve a refresh token request the id_token scope.
    */
    'idToken'?: number;
    /**
    * The refresh token, which can be used to obtain new access tokens. To retrieve it add the scope \"offline\" to your access token request.
    */
    'refreshToken'?: string;
    /**
    * The scope of the access token
    */
    'scope'?: number;
    /**
    * The type of the token issued
    */
    'tokenType'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "accessToken",
            "baseName": "access_token",
            "type": "string"
        },
        {
            "name": "expiresIn",
            "baseName": "expires_in",
            "type": "number"
        },
        {
            "name": "idToken",
            "baseName": "id_token",
            "type": "number"
        },
        {
            "name": "refreshToken",
            "baseName": "refresh_token",
            "type": "string"
        },
        {
            "name": "scope",
            "baseName": "scope",
            "type": "number"
        },
        {
            "name": "tokenType",
            "baseName": "token_type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return OauthTokenResponse.attributeTypeMap;
    }
}

