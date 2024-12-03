/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.11
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { UiContainer } from './UiContainer';
import {
    UiContainerFromJSON,
    UiContainerFromJSONTyped,
    UiContainerToJSON,
} from './UiContainer';

/**
 * Used to verify an out-of-band communication
 * channel such as an email address or a phone number.
 * 
 * For more information head over to: https://www.ory.sh/docs/kratos/self-service/flows/verify-email-account-activation
 * @export
 * @interface VerificationFlow
 */
export interface VerificationFlow {
    /**
     * Active, if set, contains the registration method that is being used. It is initially
     * not set.
     * @type {string}
     * @memberof VerificationFlow
     */
    active?: string;
    /**
     * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to verify the address,
     * a new request has to be initiated.
     * @type {Date}
     * @memberof VerificationFlow
     */
    expires_at?: Date;
    /**
     * ID represents the request's unique ID. When performing the verification flow, this
     * represents the id in the verify ui's query parameter: http://<selfservice.flows.verification.ui_url>?request=<id>
     * 
     * type: string
     * format: uuid
     * @type {string}
     * @memberof VerificationFlow
     */
    id: string;
    /**
     * IssuedAt is the time (UTC) when the request occurred.
     * @type {Date}
     * @memberof VerificationFlow
     */
    issued_at?: Date;
    /**
     * RequestURL is the initial URL that was requested from Ory Kratos. It can be used
     * to forward information contained in the URL's path or query for example.
     * @type {string}
     * @memberof VerificationFlow
     */
    request_url?: string;
    /**
     * ReturnTo contains the requested return_to URL.
     * @type {string}
     * @memberof VerificationFlow
     */
    return_to?: string;
    /**
     * State represents the state of this request:
     * 
     * choose_method: ask the user to choose a method (e.g. verify your email)
     * sent_email: the email has been sent to the user
     * passed_challenge: the request was successful and the verification challenge was passed.
     * @type {any}
     * @memberof VerificationFlow
     */
    state: any | null;
    /**
     * TransientPayload is used to pass data from the verification flow to hooks and email templates
     * @type {object}
     * @memberof VerificationFlow
     */
    transient_payload?: object;
    /**
     * The flow type can either be `api` or `browser`.
     * @type {string}
     * @memberof VerificationFlow
     */
    type: string;
    /**
     * 
     * @type {UiContainer}
     * @memberof VerificationFlow
     */
    ui: UiContainer;
}

/**
 * Check if a given object implements the VerificationFlow interface.
 */
export function instanceOfVerificationFlow(value: object): value is VerificationFlow {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('state' in value) || value['state'] === undefined) return false;
    if (!('type' in value) || value['type'] === undefined) return false;
    if (!('ui' in value) || value['ui'] === undefined) return false;
    return true;
}

export function VerificationFlowFromJSON(json: any): VerificationFlow {
    return VerificationFlowFromJSONTyped(json, false);
}

export function VerificationFlowFromJSONTyped(json: any, ignoreDiscriminator: boolean): VerificationFlow {
    if (json == null) {
        return json;
    }
    return {
        
        'active': json['active'] == null ? undefined : json['active'],
        'expires_at': json['expires_at'] == null ? undefined : (new Date(json['expires_at'])),
        'id': json['id'],
        'issued_at': json['issued_at'] == null ? undefined : (new Date(json['issued_at'])),
        'request_url': json['request_url'] == null ? undefined : json['request_url'],
        'return_to': json['return_to'] == null ? undefined : json['return_to'],
        'state': json['state'],
        'transient_payload': json['transient_payload'] == null ? undefined : json['transient_payload'],
        'type': json['type'],
        'ui': UiContainerFromJSON(json['ui']),
    };
}

export function VerificationFlowToJSON(value?: VerificationFlow | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'active': value['active'],
        'expires_at': value['expires_at'] == null ? undefined : ((value['expires_at']).toISOString()),
        'id': value['id'],
        'issued_at': value['issued_at'] == null ? undefined : ((value['issued_at']).toISOString()),
        'request_url': value['request_url'],
        'return_to': value['return_to'],
        'state': value['state'],
        'transient_payload': value['transient_payload'],
        'type': value['type'],
        'ui': UiContainerToJSON(value['ui']),
    };
}

