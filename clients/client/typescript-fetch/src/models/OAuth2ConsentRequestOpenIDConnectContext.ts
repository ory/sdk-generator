/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.15.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface OAuth2ConsentRequestOpenIDConnectContext
 */
export interface OAuth2ConsentRequestOpenIDConnectContext {
    /**
     * ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request.
     * It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.
     * 
     * OpenID Connect defines it as follows:
     * > Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values
     * that the Authorization Server is being requested to use for processing this Authentication Request, with the
     * values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication
     * performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a
     * Voluntary Claim by this parameter.
     * @type {Array<string>}
     * @memberof OAuth2ConsentRequestOpenIDConnectContext
     */
    acr_values?: Array<string>;
    /**
     * Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User.
     * The defined values are:
     * page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode.
     * popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over.
     * touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface.
     * wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a "feature phone" type display.
     * 
     * The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.
     * @type {string}
     * @memberof OAuth2ConsentRequestOpenIDConnectContext
     */
    display?: string;
    /**
     * IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the
     * End-User's current or past authenticated session with the Client.
     * @type {{ [key: string]: any; }}
     * @memberof OAuth2ConsentRequestOpenIDConnectContext
     */
    id_token_hint_claims?: { [key: string]: any; };
    /**
     * LoginHint hints about the login identifier the End-User might use to log in (if necessary).
     * This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier)
     * and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a
     * phone number in the format specified for the phone_number Claim. The use of this parameter is optional.
     * @type {string}
     * @memberof OAuth2ConsentRequestOpenIDConnectContext
     */
    login_hint?: string;
    /**
     * UILocales is the End-User'id preferred languages and scripts for the user interface, represented as a
     * space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value
     * "fr-CA fr en" represents a preference for French as spoken in Canada, then French (without a region designation),
     * followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested
     * locales are not supported by the OpenID Provider.
     * @type {Array<string>}
     * @memberof OAuth2ConsentRequestOpenIDConnectContext
     */
    ui_locales?: Array<string>;
}

/**
 * Check if a given object implements the OAuth2ConsentRequestOpenIDConnectContext interface.
 */
export function instanceOfOAuth2ConsentRequestOpenIDConnectContext(value: object): value is OAuth2ConsentRequestOpenIDConnectContext {
    return true;
}

export function OAuth2ConsentRequestOpenIDConnectContextFromJSON(json: any): OAuth2ConsentRequestOpenIDConnectContext {
    return OAuth2ConsentRequestOpenIDConnectContextFromJSONTyped(json, false);
}

export function OAuth2ConsentRequestOpenIDConnectContextFromJSONTyped(json: any, ignoreDiscriminator: boolean): OAuth2ConsentRequestOpenIDConnectContext {
    if (json == null) {
        return json;
    }
    return {
        
        'acr_values': json['acr_values'] == null ? undefined : json['acr_values'],
        'display': json['display'] == null ? undefined : json['display'],
        'id_token_hint_claims': json['id_token_hint_claims'] == null ? undefined : json['id_token_hint_claims'],
        'login_hint': json['login_hint'] == null ? undefined : json['login_hint'],
        'ui_locales': json['ui_locales'] == null ? undefined : json['ui_locales'],
    };
}

export function OAuth2ConsentRequestOpenIDConnectContextToJSON(value?: OAuth2ConsentRequestOpenIDConnectContext | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'acr_values': value['acr_values'],
        'display': value['display'],
        'id_token_hint_claims': value['id_token_hint_claims'],
        'login_hint': value['login_hint'],
        'ui_locales': value['ui_locales'],
    };
}

