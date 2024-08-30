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
 * 
 * @export
 * @interface VerifiableCredentialPrimingResponse
 */
export interface VerifiableCredentialPrimingResponse {
    /**
     * 
     * @type {string}
     * @memberof VerifiableCredentialPrimingResponse
     */
    c_nonce?: string;
    /**
     * 
     * @type {number}
     * @memberof VerifiableCredentialPrimingResponse
     */
    c_nonce_expires_in?: number;
    /**
     * 
     * @type {string}
     * @memberof VerifiableCredentialPrimingResponse
     */
    error?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifiableCredentialPrimingResponse
     */
    error_debug?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifiableCredentialPrimingResponse
     */
    error_description?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifiableCredentialPrimingResponse
     */
    error_hint?: string;
    /**
     * 
     * @type {string}
     * @memberof VerifiableCredentialPrimingResponse
     */
    format?: string;
    /**
     * 
     * @type {number}
     * @memberof VerifiableCredentialPrimingResponse
     */
    status_code?: number;
}

/**
 * Check if a given object implements the VerifiableCredentialPrimingResponse interface.
 */
export function instanceOfVerifiableCredentialPrimingResponse(value: object): value is VerifiableCredentialPrimingResponse {
    return true;
}

export function VerifiableCredentialPrimingResponseFromJSON(json: any): VerifiableCredentialPrimingResponse {
    return VerifiableCredentialPrimingResponseFromJSONTyped(json, false);
}

export function VerifiableCredentialPrimingResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): VerifiableCredentialPrimingResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'c_nonce': json['c_nonce'] == null ? undefined : json['c_nonce'],
        'c_nonce_expires_in': json['c_nonce_expires_in'] == null ? undefined : json['c_nonce_expires_in'],
        'error': json['error'] == null ? undefined : json['error'],
        'error_debug': json['error_debug'] == null ? undefined : json['error_debug'],
        'error_description': json['error_description'] == null ? undefined : json['error_description'],
        'error_hint': json['error_hint'] == null ? undefined : json['error_hint'],
        'format': json['format'] == null ? undefined : json['format'],
        'status_code': json['status_code'] == null ? undefined : json['status_code'],
    };
}

export function VerifiableCredentialPrimingResponseToJSON(value?: VerifiableCredentialPrimingResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'c_nonce': value['c_nonce'],
        'c_nonce_expires_in': value['c_nonce_expires_in'],
        'error': value['error'],
        'error_debug': value['error_debug'],
        'error_description': value['error_description'],
        'error_hint': value['error_hint'],
        'format': value['format'],
        'status_code': value['status_code'],
    };
}

