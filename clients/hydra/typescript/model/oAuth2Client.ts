/**
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.34
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { JSONWebKeySet } from './jSONWebKeySet';

export class OAuth2Client {
    /**
    * AllowedCORSOrigins are one or more URLs (scheme://host[:port]) which are allowed to make CORS requests to the /oauth/token endpoint. If this array is empty, the sever\'s CORS origin configuration (`CORS_ALLOWED_ORIGINS`) will be used instead. If this array is set, the allowed origins are appended to the server\'s CORS origin configuration. Be aware that environment variable `CORS_ENABLED` MUST be set to `true` for this to work.
    */
    'allowedCorsOrigins'?: Array<string>;
    /**
    * Audience is a whitelist defining the audiences this client is allowed to request tokens for. An audience limits the applicability of an OAuth 2.0 Access Token to, for example, certain API endpoints. The value is a list of URLs. URLs MUST NOT contain whitespaces.
    */
    'audience'?: Array<string>;
    /**
    * Boolean value specifying whether the RP requires that a sid (session ID) Claim be included in the Logout Token to identify the RP session with the OP when the backchannel_logout_uri is used. If omitted, the default value is false.
    */
    'backchannelLogoutSessionRequired'?: boolean;
    /**
    * RP URL that will cause the RP to log itself out when sent a Logout Token by the OP.
    */
    'backchannelLogoutUri'?: string;
    /**
    * ClientID  is the id for this client.
    */
    'clientId'?: string;
    /**
    * Name is the human-readable string name of the client to be presented to the end-user during authorization.
    */
    'clientName'?: string;
    /**
    * Secret is the client\'s secret. The secret will be included in the create request as cleartext, and then never again. The secret is stored using BCrypt so it is impossible to recover it. Tell your users that they need to write the secret down as it will not be made available again.
    */
    'clientSecret'?: string;
    /**
    * SecretExpiresAt is an integer holding the time at which the client secret will expire or 0 if it will not expire. The time is represented as the number of seconds from 1970-01-01T00:00:00Z as measured in UTC until the date/time of expiration.  This feature is currently not supported and it\'s value will always be set to 0.
    */
    'clientSecretExpiresAt'?: number;
    /**
    * ClientURI is an URL string of a web page providing information about the client. If present, the server SHOULD display this URL to the end-user in a clickable fashion.
    */
    'clientUri'?: string;
    /**
    * Contacts is a array of strings representing ways to contact people responsible for this client, typically email addresses.
    */
    'contacts'?: Array<string>;
    /**
    * CreatedAt returns the timestamp of the client\'s creation.
    */
    'createdAt'?: Date;
    /**
    * Boolean value specifying whether the RP requires that iss (issuer) and sid (session ID) query parameters be included to identify the RP session with the OP when the frontchannel_logout_uri is used. If omitted, the default value is false.
    */
    'frontchannelLogoutSessionRequired'?: boolean;
    /**
    * RP URL that will cause the RP to log itself out when rendered in an iframe by the OP. An iss (issuer) query parameter and a sid (session ID) query parameter MAY be included by the OP to enable the RP to validate the request and to determine which of the potentially multiple sessions is to be logged out; if either is included, both MUST be.
    */
    'frontchannelLogoutUri'?: string;
    /**
    * GrantTypes is an array of grant types the client is allowed to use.
    */
    'grantTypes'?: Array<string>;
    'jwks'?: JSONWebKeySet;
    /**
    * URL for the Client\'s JSON Web Key Set [JWK] document. If the Client signs requests to the Server, it contains the signing key(s) the Server uses to validate signatures from the Client. The JWK Set MAY also contain the Client\'s encryption keys(s), which are used by the Server to encrypt responses to the Client. When both signing and encryption keys are made available, a use (Key Use) parameter value is REQUIRED for all keys in the referenced JWK Set to indicate each key\'s intended usage. Although some algorithms allow the same key to be used for both signatures and encryption, doing so is NOT RECOMMENDED, as it is less secure. The JWK x5c parameter MAY be used to provide X.509 representations of keys provided. When used, the bare key values MUST still be present and MUST match those in the certificate.
    */
    'jwksUri'?: string;
    /**
    * LogoURI is an URL string that references a logo for the client.
    */
    'logoUri'?: string;
    /**
    * Metadata is arbitrary data.
    */
    'metadata'?: { [key: string]: object; };
    /**
    * Owner is a string identifying the owner of the OAuth 2.0 Client.
    */
    'owner'?: string;
    /**
    * PolicyURI is a URL string that points to a human-readable privacy policy document that describes how the deployment organization collects, uses, retains, and discloses personal data.
    */
    'policyUri'?: string;
    /**
    * Array of URLs supplied by the RP to which it MAY request that the End-User\'s User Agent be redirected using the post_logout_redirect_uri parameter after a logout has been performed.
    */
    'postLogoutRedirectUris'?: Array<string>;
    /**
    * RedirectURIs is an array of allowed redirect urls for the client, for example http://mydomain/oauth/callback .
    */
    'redirectUris'?: Array<string>;
    /**
    * JWS [JWS] alg algorithm [JWA] that MUST be used for signing Request Objects sent to the OP. All Request Objects from this Client MUST be rejected, if not signed with this algorithm.
    */
    'requestObjectSigningAlg'?: string;
    /**
    * Array of request_uri values that are pre-registered by the RP for use at the OP. Servers MAY cache the contents of the files referenced by these URIs and not retrieve them at the time they are used in a request. OPs can require that request_uri values used be pre-registered with the require_request_uri_registration discovery parameter.
    */
    'requestUris'?: Array<string>;
    /**
    * ResponseTypes is an array of the OAuth 2.0 response type strings that the client can use at the authorization endpoint.
    */
    'responseTypes'?: Array<string>;
    /**
    * Scope is a string containing a space-separated list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749]) that the client can use when requesting access tokens.
    */
    'scope'?: string;
    /**
    * URL using the https scheme to be used in calculating Pseudonymous Identifiers by the OP. The URL references a file with a single JSON array of redirect_uri values.
    */
    'sectorIdentifierUri'?: string;
    /**
    * SubjectType requested for responses to this Client. The subject_types_supported Discovery parameter contains a list of the supported subject_type values for this server. Valid types include `pairwise` and `public`.
    */
    'subjectType'?: string;
    /**
    * Requested Client Authentication method for the Token Endpoint. The options are client_secret_post, client_secret_basic, private_key_jwt, and none.
    */
    'tokenEndpointAuthMethod'?: string;
    /**
    * TermsOfServiceURI is a URL string that points to a human-readable terms of service document for the client that describes a contractual relationship between the end-user and the client that the end-user accepts when authorizing the client.
    */
    'tosUri'?: string;
    /**
    * UpdatedAt returns the timestamp of the last update.
    */
    'updatedAt'?: Date;
    /**
    * JWS alg algorithm [JWA] REQUIRED for signing UserInfo Responses. If this is specified, the response will be JWT [JWT] serialized, and signed using JWS. The default, if omitted, is for the UserInfo Response to return the Claims as a UTF-8 encoded JSON object using the application/json content-type.
    */
    'userinfoSignedResponseAlg'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "allowedCorsOrigins",
            "baseName": "allowed_cors_origins",
            "type": "Array<string>"
        },
        {
            "name": "audience",
            "baseName": "audience",
            "type": "Array<string>"
        },
        {
            "name": "backchannelLogoutSessionRequired",
            "baseName": "backchannel_logout_session_required",
            "type": "boolean"
        },
        {
            "name": "backchannelLogoutUri",
            "baseName": "backchannel_logout_uri",
            "type": "string"
        },
        {
            "name": "clientId",
            "baseName": "client_id",
            "type": "string"
        },
        {
            "name": "clientName",
            "baseName": "client_name",
            "type": "string"
        },
        {
            "name": "clientSecret",
            "baseName": "client_secret",
            "type": "string"
        },
        {
            "name": "clientSecretExpiresAt",
            "baseName": "client_secret_expires_at",
            "type": "number"
        },
        {
            "name": "clientUri",
            "baseName": "client_uri",
            "type": "string"
        },
        {
            "name": "contacts",
            "baseName": "contacts",
            "type": "Array<string>"
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "Date"
        },
        {
            "name": "frontchannelLogoutSessionRequired",
            "baseName": "frontchannel_logout_session_required",
            "type": "boolean"
        },
        {
            "name": "frontchannelLogoutUri",
            "baseName": "frontchannel_logout_uri",
            "type": "string"
        },
        {
            "name": "grantTypes",
            "baseName": "grant_types",
            "type": "Array<string>"
        },
        {
            "name": "jwks",
            "baseName": "jwks",
            "type": "JSONWebKeySet"
        },
        {
            "name": "jwksUri",
            "baseName": "jwks_uri",
            "type": "string"
        },
        {
            "name": "logoUri",
            "baseName": "logo_uri",
            "type": "string"
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "{ [key: string]: object; }"
        },
        {
            "name": "owner",
            "baseName": "owner",
            "type": "string"
        },
        {
            "name": "policyUri",
            "baseName": "policy_uri",
            "type": "string"
        },
        {
            "name": "postLogoutRedirectUris",
            "baseName": "post_logout_redirect_uris",
            "type": "Array<string>"
        },
        {
            "name": "redirectUris",
            "baseName": "redirect_uris",
            "type": "Array<string>"
        },
        {
            "name": "requestObjectSigningAlg",
            "baseName": "request_object_signing_alg",
            "type": "string"
        },
        {
            "name": "requestUris",
            "baseName": "request_uris",
            "type": "Array<string>"
        },
        {
            "name": "responseTypes",
            "baseName": "response_types",
            "type": "Array<string>"
        },
        {
            "name": "scope",
            "baseName": "scope",
            "type": "string"
        },
        {
            "name": "sectorIdentifierUri",
            "baseName": "sector_identifier_uri",
            "type": "string"
        },
        {
            "name": "subjectType",
            "baseName": "subject_type",
            "type": "string"
        },
        {
            "name": "tokenEndpointAuthMethod",
            "baseName": "token_endpoint_auth_method",
            "type": "string"
        },
        {
            "name": "tosUri",
            "baseName": "tos_uri",
            "type": "string"
        },
        {
            "name": "updatedAt",
            "baseName": "updated_at",
            "type": "Date"
        },
        {
            "name": "userinfoSignedResponseAlg",
            "baseName": "userinfo_signed_response_alg",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return OAuth2Client.attributeTypeMap;
    }
}

