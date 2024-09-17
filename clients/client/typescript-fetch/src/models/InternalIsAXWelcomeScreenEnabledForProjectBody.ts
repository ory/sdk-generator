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
 * Is Account Experience Enabled For Project Request Body
 * @export
 * @interface InternalIsAXWelcomeScreenEnabledForProjectBody
 */
export interface InternalIsAXWelcomeScreenEnabledForProjectBody {
    /**
     * Path is the path of the request.
     * @type {string}
     * @memberof InternalIsAXWelcomeScreenEnabledForProjectBody
     */
    path: string;
    /**
     * ProjectSlug is the project's slug.
     * @type {string}
     * @memberof InternalIsAXWelcomeScreenEnabledForProjectBody
     */
    project_slug: string;
}

/**
 * Check if a given object implements the InternalIsAXWelcomeScreenEnabledForProjectBody interface.
 */
export function instanceOfInternalIsAXWelcomeScreenEnabledForProjectBody(value: object): value is InternalIsAXWelcomeScreenEnabledForProjectBody {
    if (!('path' in value) || value['path'] === undefined) return false;
    if (!('project_slug' in value) || value['project_slug'] === undefined) return false;
    return true;
}

export function InternalIsAXWelcomeScreenEnabledForProjectBodyFromJSON(json: any): InternalIsAXWelcomeScreenEnabledForProjectBody {
    return InternalIsAXWelcomeScreenEnabledForProjectBodyFromJSONTyped(json, false);
}

export function InternalIsAXWelcomeScreenEnabledForProjectBodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): InternalIsAXWelcomeScreenEnabledForProjectBody {
    if (json == null) {
        return json;
    }
    return {
        
        'path': json['path'],
        'project_slug': json['project_slug'],
    };
}

export function InternalIsAXWelcomeScreenEnabledForProjectBodyToJSON(value?: InternalIsAXWelcomeScreenEnabledForProjectBody | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'path': value['path'],
        'project_slug': value['project_slug'],
    };
}

