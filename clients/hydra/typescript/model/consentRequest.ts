/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.32
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { OAuth2Client } from './oAuth2Client';
import { OpenIDConnectContext } from './openIDConnectContext';

export class ConsentRequest {
    /**
    * ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
    */
    'acr'?: string;
    /**
    * Challenge is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.
    */
    'challenge'?: string;
    'client'?: OAuth2Client;
    /**
    * Context contains arbitrary information set by the login endpoint or is empty if not set.
    */
    'context'?: { [key: string]: object; };
    /**
    * LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.
    */
    'loginChallenge'?: string;
    /**
    * LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It\'s value can generally be used to associate consecutive login requests by a certain user.
    */
    'loginSessionId'?: string;
    'oidcContext'?: OpenIDConnectContext;
    /**
    * RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
    */
    'requestUrl'?: string;
    /**
    * RequestedScope contains the access token audience as requested by the OAuth 2.0 Client.
    */
    'requestedAccessTokenAudience'?: Array<string>;
    /**
    * RequestedScope contains the OAuth 2.0 Scope requested by the OAuth 2.0 Client.
    */
    'requestedScope'?: Array<string>;
    /**
    * Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
    */
    'skip'?: boolean;
    /**
    * Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
    */
    'subject'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "acr",
            "baseName": "acr",
            "type": "string"
        },
        {
            "name": "challenge",
            "baseName": "challenge",
            "type": "string"
        },
        {
            "name": "client",
            "baseName": "client",
            "type": "OAuth2Client"
        },
        {
            "name": "context",
            "baseName": "context",
            "type": "{ [key: string]: object; }"
        },
        {
            "name": "loginChallenge",
            "baseName": "login_challenge",
            "type": "string"
        },
        {
            "name": "loginSessionId",
            "baseName": "login_session_id",
            "type": "string"
        },
        {
            "name": "oidcContext",
            "baseName": "oidc_context",
            "type": "OpenIDConnectContext"
        },
        {
            "name": "requestUrl",
            "baseName": "request_url",
            "type": "string"
        },
        {
            "name": "requestedAccessTokenAudience",
            "baseName": "requested_access_token_audience",
            "type": "Array<string>"
        },
        {
            "name": "requestedScope",
            "baseName": "requested_scope",
            "type": "Array<string>"
        },
        {
            "name": "skip",
            "baseName": "skip",
            "type": "boolean"
        },
        {
            "name": "subject",
            "baseName": "subject",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return ConsentRequest.attributeTypeMap;
    }
}

