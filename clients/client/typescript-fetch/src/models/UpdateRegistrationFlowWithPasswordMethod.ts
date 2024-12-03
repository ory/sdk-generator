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
 * Update Registration Flow with Password Method
 * @export
 * @interface UpdateRegistrationFlowWithPasswordMethod
 */
export interface UpdateRegistrationFlowWithPasswordMethod {
    /**
     * The CSRF Token
     * @type {string}
     * @memberof UpdateRegistrationFlowWithPasswordMethod
     */
    csrf_token?: string;
    /**
     * Method to use
     * 
     * This field must be set to `password` when using the password method.
     * @type {string}
     * @memberof UpdateRegistrationFlowWithPasswordMethod
     */
    method: string;
    /**
     * Password to sign the user up with
     * @type {string}
     * @memberof UpdateRegistrationFlowWithPasswordMethod
     */
    password: string;
    /**
     * The identity's traits
     * @type {object}
     * @memberof UpdateRegistrationFlowWithPasswordMethod
     */
    traits: object;
    /**
     * Transient data to pass along to any webhooks
     * @type {object}
     * @memberof UpdateRegistrationFlowWithPasswordMethod
     */
    transient_payload?: object;
}

/**
 * Check if a given object implements the UpdateRegistrationFlowWithPasswordMethod interface.
 */
export function instanceOfUpdateRegistrationFlowWithPasswordMethod(value: object): value is UpdateRegistrationFlowWithPasswordMethod {
    if (!('method' in value) || value['method'] === undefined) return false;
    if (!('password' in value) || value['password'] === undefined) return false;
    if (!('traits' in value) || value['traits'] === undefined) return false;
    return true;
}

export function UpdateRegistrationFlowWithPasswordMethodFromJSON(json: any): UpdateRegistrationFlowWithPasswordMethod {
    return UpdateRegistrationFlowWithPasswordMethodFromJSONTyped(json, false);
}

export function UpdateRegistrationFlowWithPasswordMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateRegistrationFlowWithPasswordMethod {
    if (json == null) {
        return json;
    }
    return {
        
        'csrf_token': json['csrf_token'] == null ? undefined : json['csrf_token'],
        'method': json['method'],
        'password': json['password'],
        'traits': json['traits'],
        'transient_payload': json['transient_payload'] == null ? undefined : json['transient_payload'],
    };
}

export function UpdateRegistrationFlowWithPasswordMethodToJSON(value?: UpdateRegistrationFlowWithPasswordMethod | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'csrf_token': value['csrf_token'],
        'method': value['method'],
        'password': value['password'],
        'traits': value['traits'],
        'transient_payload': value['transient_payload'],
    };
}

