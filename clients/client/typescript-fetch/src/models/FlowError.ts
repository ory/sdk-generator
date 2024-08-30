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
 * @interface FlowError
 */
export interface FlowError {
    /**
     * CreatedAt is a helper struct field for gobuffalo.pop.
     * @type {Date}
     * @memberof FlowError
     */
    created_at?: Date;
    /**
     * 
     * @type {object}
     * @memberof FlowError
     */
    error?: object;
    /**
     * ID of the error container.
     * @type {string}
     * @memberof FlowError
     */
    id: string;
    /**
     * UpdatedAt is a helper struct field for gobuffalo.pop.
     * @type {Date}
     * @memberof FlowError
     */
    updated_at?: Date;
}

/**
 * Check if a given object implements the FlowError interface.
 */
export function instanceOfFlowError(value: object): value is FlowError {
    if (!('id' in value) || value['id'] === undefined) return false;
    return true;
}

export function FlowErrorFromJSON(json: any): FlowError {
    return FlowErrorFromJSONTyped(json, false);
}

export function FlowErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): FlowError {
    if (json == null) {
        return json;
    }
    return {
        
        'created_at': json['created_at'] == null ? undefined : (new Date(json['created_at'])),
        'error': json['error'] == null ? undefined : json['error'],
        'id': json['id'],
        'updated_at': json['updated_at'] == null ? undefined : (new Date(json['updated_at'])),
    };
}

export function FlowErrorToJSON(value?: FlowError | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'created_at': value['created_at'] == null ? undefined : ((value['created_at']).toISOString()),
        'error': value['error'],
        'id': value['id'],
        'updated_at': value['updated_at'] == null ? undefined : ((value['updated_at']).toISOString()),
    };
}

