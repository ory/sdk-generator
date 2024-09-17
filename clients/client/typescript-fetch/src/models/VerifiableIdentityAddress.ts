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
 * VerifiableAddress is an identity's verifiable address
 * @export
 * @interface VerifiableIdentityAddress
 */
export interface VerifiableIdentityAddress {
    /**
     * When this entry was created
     * @type {Date}
     * @memberof VerifiableIdentityAddress
     */
    created_at?: Date;
    /**
     * The ID
     * @type {string}
     * @memberof VerifiableIdentityAddress
     */
    id?: string;
    /**
     * VerifiableAddressStatus must not exceed 16 characters as that is the limitation in the SQL Schema
     * @type {string}
     * @memberof VerifiableIdentityAddress
     */
    status: string;
    /**
     * When this entry was last updated
     * @type {Date}
     * @memberof VerifiableIdentityAddress
     */
    updated_at?: Date;
    /**
     * The address value
     * 
     * example foo@user.com
     * @type {string}
     * @memberof VerifiableIdentityAddress
     */
    value: string;
    /**
     * Indicates if the address has already been verified
     * @type {boolean}
     * @memberof VerifiableIdentityAddress
     */
    verified: boolean;
    /**
     * 
     * @type {Date}
     * @memberof VerifiableIdentityAddress
     */
    verified_at?: Date;
    /**
     * The delivery method
     * @type {string}
     * @memberof VerifiableIdentityAddress
     */
    via: VerifiableIdentityAddressViaEnum;
}


/**
 * @export
 */
export const VerifiableIdentityAddressViaEnum = {
    Email: 'email',
    Sms: 'sms'
} as const;
export type VerifiableIdentityAddressViaEnum = typeof VerifiableIdentityAddressViaEnum[keyof typeof VerifiableIdentityAddressViaEnum];


/**
 * Check if a given object implements the VerifiableIdentityAddress interface.
 */
export function instanceOfVerifiableIdentityAddress(value: object): value is VerifiableIdentityAddress {
    if (!('status' in value) || value['status'] === undefined) return false;
    if (!('value' in value) || value['value'] === undefined) return false;
    if (!('verified' in value) || value['verified'] === undefined) return false;
    if (!('via' in value) || value['via'] === undefined) return false;
    return true;
}

export function VerifiableIdentityAddressFromJSON(json: any): VerifiableIdentityAddress {
    return VerifiableIdentityAddressFromJSONTyped(json, false);
}

export function VerifiableIdentityAddressFromJSONTyped(json: any, ignoreDiscriminator: boolean): VerifiableIdentityAddress {
    if (json == null) {
        return json;
    }
    return {
        
        'created_at': json['created_at'] == null ? undefined : (new Date(json['created_at'])),
        'id': json['id'] == null ? undefined : json['id'],
        'status': json['status'],
        'updated_at': json['updated_at'] == null ? undefined : (new Date(json['updated_at'])),
        'value': json['value'],
        'verified': json['verified'],
        'verified_at': json['verified_at'] == null ? undefined : (new Date(json['verified_at'])),
        'via': json['via'],
    };
}

export function VerifiableIdentityAddressToJSON(value?: VerifiableIdentityAddress | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'created_at': value['created_at'] == null ? undefined : ((value['created_at']).toISOString()),
        'id': value['id'],
        'status': value['status'],
        'updated_at': value['updated_at'] == null ? undefined : ((value['updated_at']).toISOString()),
        'value': value['value'],
        'verified': value['verified'],
        'verified_at': value['verified_at'] == null ? undefined : ((value['verified_at']).toISOString()),
        'via': value['via'],
    };
}

