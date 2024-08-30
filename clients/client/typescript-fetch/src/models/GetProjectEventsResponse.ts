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
import type { ProjectEventsDatapoint } from './ProjectEventsDatapoint';
import {
    ProjectEventsDatapointFromJSON,
    ProjectEventsDatapointFromJSONTyped,
    ProjectEventsDatapointToJSON,
} from './ProjectEventsDatapoint';

/**
 * Response of the getProjectEvents endpoint
 * @export
 * @interface GetProjectEventsResponse
 */
export interface GetProjectEventsResponse {
    /**
     * The list of data points.
     * @type {Array<ProjectEventsDatapoint>}
     * @memberof GetProjectEventsResponse
     */
    readonly events: Array<ProjectEventsDatapoint>;
    /**
     * Pagination token to be included in next page request
     * @type {string}
     * @memberof GetProjectEventsResponse
     */
    readonly page_token?: string;
}

/**
 * Check if a given object implements the GetProjectEventsResponse interface.
 */
export function instanceOfGetProjectEventsResponse(value: object): value is GetProjectEventsResponse {
    if (!('events' in value) || value['events'] === undefined) return false;
    return true;
}

export function GetProjectEventsResponseFromJSON(json: any): GetProjectEventsResponse {
    return GetProjectEventsResponseFromJSONTyped(json, false);
}

export function GetProjectEventsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetProjectEventsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'events': ((json['events'] as Array<any>).map(ProjectEventsDatapointFromJSON)),
        'page_token': json['page_token'] == null ? undefined : json['page_token'],
    };
}

export function GetProjectEventsResponseToJSON(value?: Omit<GetProjectEventsResponse, 'events'|'page_token'> | null): any {
    if (value == null) {
        return value;
    }
    return {
        
    };
}

