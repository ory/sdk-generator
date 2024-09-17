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
 * Custom Hostname
 * @export
 * @interface CustomDomain
 */
export interface CustomDomain {
    /**
     * 
     * @type {string}
     * @memberof CustomDomain
     */
    cookie_domain?: string;
    /**
     * 
     * @type {Array<string>}
     * @memberof CustomDomain
     */
    cors_allowed_origins?: Array<string>;
    /**
     * 
     * @type {boolean}
     * @memberof CustomDomain
     */
    cors_enabled?: boolean;
    /**
     * 
     * @type {Date}
     * @memberof CustomDomain
     */
    created_at?: Date;
    /**
     * 
     * @type {string}
     * @memberof CustomDomain
     */
    custom_ui_base_url?: string;
    /**
     * 
     * @type {string}
     * @memberof CustomDomain
     */
    hostname?: string;
    /**
     * 
     * @type {string}
     * @memberof CustomDomain
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof CustomDomain
     */
    ssl_status?: CustomDomainSslStatusEnum;
    /**
     * 
     * @type {Date}
     * @memberof CustomDomain
     */
    updated_at?: Date;
    /**
     * 
     * @type {Array<string>}
     * @memberof CustomDomain
     */
    verification_errors?: Array<string>;
    /**
     * 
     * @type {string}
     * @memberof CustomDomain
     */
    verification_status?: string;
}


/**
 * @export
 */
export const CustomDomainSslStatusEnum = {
    Initializing: 'initializing',
    PendingValidation: 'pending_validation',
    Deleted: 'deleted',
    PendingIssuance: 'pending_issuance',
    PendingDeployment: 'pending_deployment',
    PendingDeletion: 'pending_deletion',
    PendingExpiration: 'pending_expiration',
    Expired: 'expired',
    Active: 'active',
    InitializingTimedOut: 'initializing_timed_out',
    ValidationTimedOut: 'validation_timed_out',
    IssuanceTimedOut: 'issuance_timed_out',
    DeploymentTimedOut: 'deployment_timed_out',
    DeletionTimedOut: 'deletion_timed_out',
    PendingCleanup: 'pending_cleanup',
    StagingDeployment: 'staging_deployment',
    StagingActive: 'staging_active',
    Deactivating: 'deactivating',
    Inactive: 'inactive',
    BackupIssued: 'backup_issued',
    HoldingDeployment: 'holding_deployment',
    Empty: ''
} as const;
export type CustomDomainSslStatusEnum = typeof CustomDomainSslStatusEnum[keyof typeof CustomDomainSslStatusEnum];


/**
 * Check if a given object implements the CustomDomain interface.
 */
export function instanceOfCustomDomain(value: object): value is CustomDomain {
    return true;
}

export function CustomDomainFromJSON(json: any): CustomDomain {
    return CustomDomainFromJSONTyped(json, false);
}

export function CustomDomainFromJSONTyped(json: any, ignoreDiscriminator: boolean): CustomDomain {
    if (json == null) {
        return json;
    }
    return {
        
        'cookie_domain': json['cookie_domain'] == null ? undefined : json['cookie_domain'],
        'cors_allowed_origins': json['cors_allowed_origins'] == null ? undefined : json['cors_allowed_origins'],
        'cors_enabled': json['cors_enabled'] == null ? undefined : json['cors_enabled'],
        'created_at': json['created_at'] == null ? undefined : (new Date(json['created_at'])),
        'custom_ui_base_url': json['custom_ui_base_url'] == null ? undefined : json['custom_ui_base_url'],
        'hostname': json['hostname'] == null ? undefined : json['hostname'],
        'id': json['id'] == null ? undefined : json['id'],
        'ssl_status': json['ssl_status'] == null ? undefined : json['ssl_status'],
        'updated_at': json['updated_at'] == null ? undefined : (new Date(json['updated_at'])),
        'verification_errors': json['verification_errors'] == null ? undefined : json['verification_errors'],
        'verification_status': json['verification_status'] == null ? undefined : json['verification_status'],
    };
}

export function CustomDomainToJSON(value?: CustomDomain | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cookie_domain': value['cookie_domain'],
        'cors_allowed_origins': value['cors_allowed_origins'],
        'cors_enabled': value['cors_enabled'],
        'created_at': value['created_at'] == null ? undefined : ((value['created_at']).toISOString()),
        'custom_ui_base_url': value['custom_ui_base_url'],
        'hostname': value['hostname'],
        'id': value['id'],
        'ssl_status': value['ssl_status'],
        'updated_at': value['updated_at'] == null ? undefined : ((value['updated_at']).toISOString()),
        'verification_errors': value['verification_errors'],
        'verification_status': value['verification_status'],
    };
}

