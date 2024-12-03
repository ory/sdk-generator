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
/**
 * Error
 * @export
 * @interface ErrorOAuth2
 */
export interface ErrorOAuth2 {
    /**
     * Error
     * @type {string}
     * @memberof ErrorOAuth2
     */
    error?: string;
    /**
     * Error Debug Information
     * 
     * Only available in dev mode.
     * @type {string}
     * @memberof ErrorOAuth2
     */
    error_debug?: string;
    /**
     * Error Description
     * @type {string}
     * @memberof ErrorOAuth2
     */
    error_description?: string;
    /**
     * Error Hint
     * 
     * Helps the user identify the error cause.
     * @type {string}
     * @memberof ErrorOAuth2
     */
    error_hint?: string;
    /**
     * HTTP Status Code
     * @type {number}
     * @memberof ErrorOAuth2
     */
    status_code?: number;
}

/**
 * Check if a given object implements the ErrorOAuth2 interface.
 */
export function instanceOfErrorOAuth2(value: object): value is ErrorOAuth2 {
    return true;
}

export function ErrorOAuth2FromJSON(json: any): ErrorOAuth2 {
    return ErrorOAuth2FromJSONTyped(json, false);
}

export function ErrorOAuth2FromJSONTyped(json: any, ignoreDiscriminator: boolean): ErrorOAuth2 {
    if (json == null) {
        return json;
    }
    return {
        
        'error': json['error'] == null ? undefined : json['error'],
        'error_debug': json['error_debug'] == null ? undefined : json['error_debug'],
        'error_description': json['error_description'] == null ? undefined : json['error_description'],
        'error_hint': json['error_hint'] == null ? undefined : json['error_hint'],
        'status_code': json['status_code'] == null ? undefined : json['status_code'],
    };
}

export function ErrorOAuth2ToJSON(value?: ErrorOAuth2 | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'error': value['error'],
        'error_debug': value['error_debug'],
        'error_description': value['error_description'],
        'error_hint': value['error_hint'],
        'status_code': value['status_code'],
    };
}

