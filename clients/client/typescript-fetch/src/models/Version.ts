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
 * @interface Version
 */
export interface Version {
    /**
     * Version is the service's version.
     * @type {string}
     * @memberof Version
     */
    version?: string;
}

/**
 * Check if a given object implements the Version interface.
 */
export function instanceOfVersion(value: object): value is Version {
    return true;
}

export function VersionFromJSON(json: any): Version {
    return VersionFromJSONTyped(json, false);
}

export function VersionFromJSONTyped(json: any, ignoreDiscriminator: boolean): Version {
    if (json == null) {
        return json;
    }
    return {
        
        'version': json['version'] == null ? undefined : json['version'],
    };
}

export function VersionToJSON(value?: Version | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'version': value['version'],
    };
}

