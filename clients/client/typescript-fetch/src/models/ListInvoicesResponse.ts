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
import type { BillingPeriodBucket } from './BillingPeriodBucket';
import {
    BillingPeriodBucketFromJSON,
    BillingPeriodBucketFromJSONTyped,
    BillingPeriodBucketToJSON,
} from './BillingPeriodBucket';

/**
 * 
 * @export
 * @interface ListInvoicesResponse
 */
export interface ListInvoicesResponse {
    /**
     * 
     * @type {Array<BillingPeriodBucket>}
     * @memberof ListInvoicesResponse
     */
    buckets: Array<BillingPeriodBucket>;
    /**
     * 
     * @type {boolean}
     * @memberof ListInvoicesResponse
     */
    has_next_page: boolean;
    /**
     * 
     * @type {string}
     * @memberof ListInvoicesResponse
     */
    next_page_token: string;
}

/**
 * Check if a given object implements the ListInvoicesResponse interface.
 */
export function instanceOfListInvoicesResponse(value: object): value is ListInvoicesResponse {
    if (!('buckets' in value) || value['buckets'] === undefined) return false;
    if (!('has_next_page' in value) || value['has_next_page'] === undefined) return false;
    if (!('next_page_token' in value) || value['next_page_token'] === undefined) return false;
    return true;
}

export function ListInvoicesResponseFromJSON(json: any): ListInvoicesResponse {
    return ListInvoicesResponseFromJSONTyped(json, false);
}

export function ListInvoicesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListInvoicesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'buckets': ((json['buckets'] as Array<any>).map(BillingPeriodBucketFromJSON)),
        'has_next_page': json['has_next_page'],
        'next_page_token': json['next_page_token'],
    };
}

export function ListInvoicesResponseToJSON(value?: ListInvoicesResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'buckets': ((value['buckets'] as Array<any>).map(BillingPeriodBucketToJSON)),
        'has_next_page': value['has_next_page'],
        'next_page_token': value['next_page_token'],
    };
}

