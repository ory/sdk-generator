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
import type { Attribute } from './Attribute';
import {
    AttributeFromJSON,
    AttributeFromJSONTyped,
    AttributeToJSON,
} from './Attribute';

/**
 * 
 * @export
 * @interface ProjectEventsDatapoint
 */
export interface ProjectEventsDatapoint {
    /**
     * Event attributes with details
     * @type {Array<Attribute>}
     * @memberof ProjectEventsDatapoint
     */
    attributes: Array<Attribute>;
    /**
     * Name of the event
     * @type {string}
     * @memberof ProjectEventsDatapoint
     */
    name: string;
    /**
     * Time of occurence
     * @type {Date}
     * @memberof ProjectEventsDatapoint
     */
    timestamp: Date;
}

/**
 * Check if a given object implements the ProjectEventsDatapoint interface.
 */
export function instanceOfProjectEventsDatapoint(value: object): value is ProjectEventsDatapoint {
    if (!('attributes' in value) || value['attributes'] === undefined) return false;
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('timestamp' in value) || value['timestamp'] === undefined) return false;
    return true;
}

export function ProjectEventsDatapointFromJSON(json: any): ProjectEventsDatapoint {
    return ProjectEventsDatapointFromJSONTyped(json, false);
}

export function ProjectEventsDatapointFromJSONTyped(json: any, ignoreDiscriminator: boolean): ProjectEventsDatapoint {
    if (json == null) {
        return json;
    }
    return {
        
        'attributes': ((json['attributes'] as Array<any>).map(AttributeFromJSON)),
        'name': json['name'],
        'timestamp': (new Date(json['timestamp'])),
    };
}

export function ProjectEventsDatapointToJSON(value?: ProjectEventsDatapoint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'attributes': ((value['attributes'] as Array<any>).map(AttributeToJSON)),
        'name': value['name'],
        'timestamp': ((value['timestamp']).toISOString()),
    };
}

