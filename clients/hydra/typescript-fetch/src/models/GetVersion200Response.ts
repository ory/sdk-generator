/* tslint:disable */
/* eslint-disable */
/**
 * Ory Hydra API
 * Documentation for all of Ory Hydra\'s APIs. 
 *
 * The version of the OpenAPI document: v2.2.1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface GetVersion200Response
 */
export interface GetVersion200Response {
    /**
     * The version of Ory Hydra.
     * @type {string}
     * @memberof GetVersion200Response
     */
    version?: string;
}

/**
 * Check if a given object implements the GetVersion200Response interface.
 */
export function instanceOfGetVersion200Response(value: object): value is GetVersion200Response {
    return true;
}

export function GetVersion200ResponseFromJSON(json: any): GetVersion200Response {
    return GetVersion200ResponseFromJSONTyped(json, false);
}

export function GetVersion200ResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetVersion200Response {
    if (json == null) {
        return json;
    }
    return {
        
        'version': json['version'] == null ? undefined : json['version'],
    };
}

export function GetVersion200ResponseToJSON(value?: GetVersion200Response | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'version': value['version'],
    };
}
