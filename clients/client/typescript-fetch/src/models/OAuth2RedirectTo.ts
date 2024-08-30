/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.5
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * Contains a redirect URL used to complete a login, consent, or logout request.
 * @export
 * @interface OAuth2RedirectTo
 */
export interface OAuth2RedirectTo {
    /**
     * RedirectURL is the URL which you should redirect the user's browser to once the authentication process is completed.
     * @type {string}
     * @memberof OAuth2RedirectTo
     */
    redirect_to: string;
}

/**
 * Check if a given object implements the OAuth2RedirectTo interface.
 */
export function instanceOfOAuth2RedirectTo(value: object): value is OAuth2RedirectTo {
    if (!('redirect_to' in value) || value['redirect_to'] === undefined) return false;
    return true;
}

export function OAuth2RedirectToFromJSON(json: any): OAuth2RedirectTo {
    return OAuth2RedirectToFromJSONTyped(json, false);
}

export function OAuth2RedirectToFromJSONTyped(json: any, ignoreDiscriminator: boolean): OAuth2RedirectTo {
    if (json == null) {
        return json;
    }
    return {
        
        'redirect_to': json['redirect_to'],
    };
}

export function OAuth2RedirectToToJSON(value?: OAuth2RedirectTo | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'redirect_to': value['redirect_to'],
    };
}

