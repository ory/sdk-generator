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
import type { SourcePosition } from './SourcePosition';
import {
    SourcePositionFromJSON,
    SourcePositionFromJSONTyped,
    SourcePositionToJSON,
} from './SourcePosition';

/**
 * 
 * @export
 * @interface ParseError
 */
export interface ParseError {
    /**
     * 
     * @type {SourcePosition}
     * @memberof ParseError
     */
    end?: SourcePosition;
    /**
     * 
     * @type {string}
     * @memberof ParseError
     */
    message?: string;
    /**
     * 
     * @type {SourcePosition}
     * @memberof ParseError
     */
    start?: SourcePosition;
}

/**
 * Check if a given object implements the ParseError interface.
 */
export function instanceOfParseError(value: object): value is ParseError {
    return true;
}

export function ParseErrorFromJSON(json: any): ParseError {
    return ParseErrorFromJSONTyped(json, false);
}

export function ParseErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): ParseError {
    if (json == null) {
        return json;
    }
    return {
        
        'end': json['end'] == null ? undefined : SourcePositionFromJSON(json['end']),
        'message': json['message'] == null ? undefined : json['message'],
        'start': json['start'] == null ? undefined : SourcePositionFromJSON(json['start']),
    };
}

export function ParseErrorToJSON(value?: ParseError | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'end': SourcePositionToJSON(value['end']),
        'message': value['message'],
        'start': SourcePositionToJSON(value['start']),
    };
}

