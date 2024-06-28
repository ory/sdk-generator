/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.1
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { CredentialSupportedDraft00 } from './CredentialSupportedDraft00';
import {
    CredentialSupportedDraft00FromJSON,
    CredentialSupportedDraft00FromJSONTyped,
    CredentialSupportedDraft00ToJSON,
} from './CredentialSupportedDraft00';

/**
 * Includes links to several endpoints (for example `/oauth2/token`) and exposes information on supported signature algorithms
 * among others.
 * @export
 * @interface OidcConfiguration
 */
export interface OidcConfiguration {
    /**
     * OAuth 2.0 Authorization Endpoint URL
     * @type {string}
     * @memberof OidcConfiguration
     */
    authorization_endpoint: string;
    /**
     * OpenID Connect Back-Channel Logout Session Required
     * 
     * Boolean value specifying whether the OP can pass a sid (session ID) Claim in the Logout Token to identify the RP
     * session with the OP. If supported, the sid Claim is also included in ID Tokens issued by the OP
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    backchannel_logout_session_supported?: boolean;
    /**
     * OpenID Connect Back-Channel Logout Supported
     * 
     * Boolean value specifying whether the OP supports back-channel logout, with true indicating support.
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    backchannel_logout_supported?: boolean;
    /**
     * OpenID Connect Claims Parameter Parameter Supported
     * 
     * Boolean value specifying whether the OP supports use of the claims parameter, with true indicating support.
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    claims_parameter_supported?: boolean;
    /**
     * OpenID Connect Supported Claims
     * 
     * JSON array containing a list of the Claim Names of the Claims that the OpenID Provider MAY be able to supply
     * values for. Note that for privacy or other reasons, this might not be an exhaustive list.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    claims_supported?: Array<string>;
    /**
     * OAuth 2.0 PKCE Supported Code Challenge Methods
     * 
     * JSON array containing a list of Proof Key for Code Exchange (PKCE) [RFC7636] code challenge methods supported
     * by this authorization server.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    code_challenge_methods_supported?: Array<string>;
    /**
     * OpenID Connect Verifiable Credentials Endpoint
     * 
     * Contains the URL of the Verifiable Credentials Endpoint.
     * @type {string}
     * @memberof OidcConfiguration
     */
    credentials_endpoint_draft_00?: string;
    /**
     * OpenID Connect Verifiable Credentials Supported
     * 
     * JSON array containing a list of the Verifiable Credentials supported by this authorization server.
     * @type {Array<CredentialSupportedDraft00>}
     * @memberof OidcConfiguration
     */
    credentials_supported_draft_00?: Array<CredentialSupportedDraft00>;
    /**
     * OpenID Connect End-Session Endpoint
     * 
     * URL at the OP to which an RP can perform a redirect to request that the End-User be logged out at the OP.
     * @type {string}
     * @memberof OidcConfiguration
     */
    end_session_endpoint?: string;
    /**
     * OpenID Connect Front-Channel Logout Session Required
     * 
     * Boolean value specifying whether the OP can pass iss (issuer) and sid (session ID) query parameters to identify
     * the RP session with the OP when the frontchannel_logout_uri is used. If supported, the sid Claim is also
     * included in ID Tokens issued by the OP.
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    frontchannel_logout_session_supported?: boolean;
    /**
     * OpenID Connect Front-Channel Logout Supported
     * 
     * Boolean value specifying whether the OP supports HTTP-based logout, with true indicating support.
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    frontchannel_logout_supported?: boolean;
    /**
     * OAuth 2.0 Supported Grant Types
     * 
     * JSON array containing a list of the OAuth 2.0 Grant Type values that this OP supports.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    grant_types_supported?: Array<string>;
    /**
     * OpenID Connect Default ID Token Signing Algorithms
     * 
     * Algorithm used to sign OpenID Connect ID Tokens.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    id_token_signed_response_alg: Array<string>;
    /**
     * OpenID Connect Supported ID Token Signing Algorithms
     * 
     * JSON array containing a list of the JWS signing algorithms (alg values) supported by the OP for the ID Token
     * to encode the Claims in a JWT.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    id_token_signing_alg_values_supported: Array<string>;
    /**
     * OpenID Connect Issuer URL
     * 
     * An URL using the https scheme with no query or fragment component that the OP asserts as its IssuerURL Identifier.
     * If IssuerURL discovery is supported , this value MUST be identical to the issuer value returned
     * by WebFinger. This also MUST be identical to the iss Claim value in ID Tokens issued from this IssuerURL.
     * @type {string}
     * @memberof OidcConfiguration
     */
    issuer: string;
    /**
     * OpenID Connect Well-Known JSON Web Keys URL
     * 
     * URL of the OP's JSON Web Key Set [JWK] document. This contains the signing key(s) the RP uses to validate
     * signatures from the OP. The JWK Set MAY also contain the Server's encryption key(s), which are used by RPs
     * to encrypt requests to the Server. When both signing and encryption keys are made available, a use (Key Use)
     * parameter value is REQUIRED for all keys in the referenced JWK Set to indicate each key's intended usage.
     * Although some algorithms allow the same key to be used for both signatures and encryption, doing so is
     * NOT RECOMMENDED, as it is less secure. The JWK x5c parameter MAY be used to provide X.509 representations of
     * keys provided. When used, the bare key values MUST still be present and MUST match those in the certificate.
     * @type {string}
     * @memberof OidcConfiguration
     */
    jwks_uri: string;
    /**
     * OpenID Connect Dynamic Client Registration Endpoint URL
     * @type {string}
     * @memberof OidcConfiguration
     */
    registration_endpoint?: string;
    /**
     * OpenID Connect Supported Request Object Signing Algorithms
     * 
     * JSON array containing a list of the JWS signing algorithms (alg values) supported by the OP for Request Objects,
     * which are described in Section 6.1 of OpenID Connect Core 1.0 [OpenID.Core]. These algorithms are used both when
     * the Request Object is passed by value (using the request parameter) and when it is passed by reference
     * (using the request_uri parameter).
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    request_object_signing_alg_values_supported?: Array<string>;
    /**
     * OpenID Connect Request Parameter Supported
     * 
     * Boolean value specifying whether the OP supports use of the request parameter, with true indicating support.
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    request_parameter_supported?: boolean;
    /**
     * OpenID Connect Request URI Parameter Supported
     * 
     * Boolean value specifying whether the OP supports use of the request_uri parameter, with true indicating support.
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    request_uri_parameter_supported?: boolean;
    /**
     * OpenID Connect Requires Request URI Registration
     * 
     * Boolean value specifying whether the OP requires any request_uri values used to be pre-registered
     * using the request_uris registration parameter.
     * @type {boolean}
     * @memberof OidcConfiguration
     */
    require_request_uri_registration?: boolean;
    /**
     * OAuth 2.0 Supported Response Modes
     * 
     * JSON array containing a list of the OAuth 2.0 response_mode values that this OP supports.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    response_modes_supported?: Array<string>;
    /**
     * OAuth 2.0 Supported Response Types
     * 
     * JSON array containing a list of the OAuth 2.0 response_type values that this OP supports. Dynamic OpenID
     * Providers MUST support the code, id_token, and the token id_token Response Type values.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    response_types_supported: Array<string>;
    /**
     * OAuth 2.0 Token Revocation URL
     * 
     * URL of the authorization server's OAuth 2.0 revocation endpoint.
     * @type {string}
     * @memberof OidcConfiguration
     */
    revocation_endpoint?: string;
    /**
     * OAuth 2.0 Supported Scope Values
     * 
     * JSON array containing a list of the OAuth 2.0 [RFC6749] scope values that this server supports. The server MUST
     * support the openid scope value. Servers MAY choose not to advertise some supported scope values even when this parameter is used
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    scopes_supported?: Array<string>;
    /**
     * OpenID Connect Supported Subject Types
     * 
     * JSON array containing a list of the Subject Identifier types that this OP supports. Valid types include
     * pairwise and public.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    subject_types_supported: Array<string>;
    /**
     * OAuth 2.0 Token Endpoint URL
     * @type {string}
     * @memberof OidcConfiguration
     */
    token_endpoint: string;
    /**
     * OAuth 2.0 Supported Client Authentication Methods
     * 
     * JSON array containing a list of Client Authentication methods supported by this Token Endpoint. The options are
     * client_secret_post, client_secret_basic, client_secret_jwt, and private_key_jwt, as described in Section 9 of OpenID Connect Core 1.0
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    token_endpoint_auth_methods_supported?: Array<string>;
    /**
     * OpenID Connect Userinfo URL
     * 
     * URL of the OP's UserInfo Endpoint.
     * @type {string}
     * @memberof OidcConfiguration
     */
    userinfo_endpoint?: string;
    /**
     * OpenID Connect User Userinfo Signing Algorithm
     * 
     * Algorithm used to sign OpenID Connect Userinfo Responses.
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    userinfo_signed_response_alg: Array<string>;
    /**
     * OpenID Connect Supported Userinfo Signing Algorithm
     * 
     * JSON array containing a list of the JWS [JWS] signing algorithms (alg values) [JWA] supported by the UserInfo Endpoint to encode the Claims in a JWT [JWT].
     * @type {Array<string>}
     * @memberof OidcConfiguration
     */
    userinfo_signing_alg_values_supported?: Array<string>;
}

/**
 * Check if a given object implements the OidcConfiguration interface.
 */
export function instanceOfOidcConfiguration(value: object): boolean {
    if (!('authorization_endpoint' in value)) return false;
    if (!('id_token_signed_response_alg' in value)) return false;
    if (!('id_token_signing_alg_values_supported' in value)) return false;
    if (!('issuer' in value)) return false;
    if (!('jwks_uri' in value)) return false;
    if (!('response_types_supported' in value)) return false;
    if (!('subject_types_supported' in value)) return false;
    if (!('token_endpoint' in value)) return false;
    if (!('userinfo_signed_response_alg' in value)) return false;
    return true;
}

export function OidcConfigurationFromJSON(json: any): OidcConfiguration {
    return OidcConfigurationFromJSONTyped(json, false);
}

export function OidcConfigurationFromJSONTyped(json: any, ignoreDiscriminator: boolean): OidcConfiguration {
    if (json == null) {
        return json;
    }
    return {
        
        'authorization_endpoint': json['authorization_endpoint'],
        'backchannel_logout_session_supported': json['backchannel_logout_session_supported'] == null ? undefined : json['backchannel_logout_session_supported'],
        'backchannel_logout_supported': json['backchannel_logout_supported'] == null ? undefined : json['backchannel_logout_supported'],
        'claims_parameter_supported': json['claims_parameter_supported'] == null ? undefined : json['claims_parameter_supported'],
        'claims_supported': json['claims_supported'] == null ? undefined : json['claims_supported'],
        'code_challenge_methods_supported': json['code_challenge_methods_supported'] == null ? undefined : json['code_challenge_methods_supported'],
        'credentials_endpoint_draft_00': json['credentials_endpoint_draft_00'] == null ? undefined : json['credentials_endpoint_draft_00'],
        'credentials_supported_draft_00': json['credentials_supported_draft_00'] == null ? undefined : ((json['credentials_supported_draft_00'] as Array<any>).map(CredentialSupportedDraft00FromJSON)),
        'end_session_endpoint': json['end_session_endpoint'] == null ? undefined : json['end_session_endpoint'],
        'frontchannel_logout_session_supported': json['frontchannel_logout_session_supported'] == null ? undefined : json['frontchannel_logout_session_supported'],
        'frontchannel_logout_supported': json['frontchannel_logout_supported'] == null ? undefined : json['frontchannel_logout_supported'],
        'grant_types_supported': json['grant_types_supported'] == null ? undefined : json['grant_types_supported'],
        'id_token_signed_response_alg': json['id_token_signed_response_alg'],
        'id_token_signing_alg_values_supported': json['id_token_signing_alg_values_supported'],
        'issuer': json['issuer'],
        'jwks_uri': json['jwks_uri'],
        'registration_endpoint': json['registration_endpoint'] == null ? undefined : json['registration_endpoint'],
        'request_object_signing_alg_values_supported': json['request_object_signing_alg_values_supported'] == null ? undefined : json['request_object_signing_alg_values_supported'],
        'request_parameter_supported': json['request_parameter_supported'] == null ? undefined : json['request_parameter_supported'],
        'request_uri_parameter_supported': json['request_uri_parameter_supported'] == null ? undefined : json['request_uri_parameter_supported'],
        'require_request_uri_registration': json['require_request_uri_registration'] == null ? undefined : json['require_request_uri_registration'],
        'response_modes_supported': json['response_modes_supported'] == null ? undefined : json['response_modes_supported'],
        'response_types_supported': json['response_types_supported'],
        'revocation_endpoint': json['revocation_endpoint'] == null ? undefined : json['revocation_endpoint'],
        'scopes_supported': json['scopes_supported'] == null ? undefined : json['scopes_supported'],
        'subject_types_supported': json['subject_types_supported'],
        'token_endpoint': json['token_endpoint'],
        'token_endpoint_auth_methods_supported': json['token_endpoint_auth_methods_supported'] == null ? undefined : json['token_endpoint_auth_methods_supported'],
        'userinfo_endpoint': json['userinfo_endpoint'] == null ? undefined : json['userinfo_endpoint'],
        'userinfo_signed_response_alg': json['userinfo_signed_response_alg'],
        'userinfo_signing_alg_values_supported': json['userinfo_signing_alg_values_supported'] == null ? undefined : json['userinfo_signing_alg_values_supported'],
    };
}

export function OidcConfigurationToJSON(value?: OidcConfiguration | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'authorization_endpoint': value['authorization_endpoint'],
        'backchannel_logout_session_supported': value['backchannel_logout_session_supported'],
        'backchannel_logout_supported': value['backchannel_logout_supported'],
        'claims_parameter_supported': value['claims_parameter_supported'],
        'claims_supported': value['claims_supported'],
        'code_challenge_methods_supported': value['code_challenge_methods_supported'],
        'credentials_endpoint_draft_00': value['credentials_endpoint_draft_00'],
        'credentials_supported_draft_00': value['credentials_supported_draft_00'] == null ? undefined : ((value['credentials_supported_draft_00'] as Array<any>).map(CredentialSupportedDraft00ToJSON)),
        'end_session_endpoint': value['end_session_endpoint'],
        'frontchannel_logout_session_supported': value['frontchannel_logout_session_supported'],
        'frontchannel_logout_supported': value['frontchannel_logout_supported'],
        'grant_types_supported': value['grant_types_supported'],
        'id_token_signed_response_alg': value['id_token_signed_response_alg'],
        'id_token_signing_alg_values_supported': value['id_token_signing_alg_values_supported'],
        'issuer': value['issuer'],
        'jwks_uri': value['jwks_uri'],
        'registration_endpoint': value['registration_endpoint'],
        'request_object_signing_alg_values_supported': value['request_object_signing_alg_values_supported'],
        'request_parameter_supported': value['request_parameter_supported'],
        'request_uri_parameter_supported': value['request_uri_parameter_supported'],
        'require_request_uri_registration': value['require_request_uri_registration'],
        'response_modes_supported': value['response_modes_supported'],
        'response_types_supported': value['response_types_supported'],
        'revocation_endpoint': value['revocation_endpoint'],
        'scopes_supported': value['scopes_supported'],
        'subject_types_supported': value['subject_types_supported'],
        'token_endpoint': value['token_endpoint'],
        'token_endpoint_auth_methods_supported': value['token_endpoint_auth_methods_supported'],
        'userinfo_endpoint': value['userinfo_endpoint'],
        'userinfo_signed_response_alg': value['userinfo_signed_response_alg'],
        'userinfo_signing_alg_values_supported': value['userinfo_signing_alg_values_supported'],
    };
}
