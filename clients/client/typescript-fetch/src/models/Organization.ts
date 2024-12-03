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
 * B2B SSO Organization
 * @export
 * @interface Organization
 */
export interface Organization {
    /**
     * The organization's creation date.
     * @type {Date}
     * @memberof Organization
     */
    readonly created_at: Date;
    /**
     * 
     * @type {Array<string>}
     * @memberof Organization
     */
    domains: Array<string>;
    /**
     * The organization's ID.
     * @type {string}
     * @memberof Organization
     */
    id: string;
    /**
     * The organization's human-readable label.
     * @type {string}
     * @memberof Organization
     */
    label: string;
    /**
     * The project's ID.
     * @type {string}
     * @memberof Organization
     */
    project_id: string;
    /**
     * The last time the organization was updated.
     * @type {Date}
     * @memberof Organization
     */
    readonly updated_at: Date;
}

/**
 * Check if a given object implements the Organization interface.
 */
export function instanceOfOrganization(value: object): value is Organization {
    if (!('created_at' in value) || value['created_at'] === undefined) return false;
    if (!('domains' in value) || value['domains'] === undefined) return false;
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('label' in value) || value['label'] === undefined) return false;
    if (!('project_id' in value) || value['project_id'] === undefined) return false;
    if (!('updated_at' in value) || value['updated_at'] === undefined) return false;
    return true;
}

export function OrganizationFromJSON(json: any): Organization {
    return OrganizationFromJSONTyped(json, false);
}

export function OrganizationFromJSONTyped(json: any, ignoreDiscriminator: boolean): Organization {
    if (json == null) {
        return json;
    }
    return {
        
        'created_at': (new Date(json['created_at'])),
        'domains': json['domains'],
        'id': json['id'],
        'label': json['label'],
        'project_id': json['project_id'],
        'updated_at': (new Date(json['updated_at'])),
    };
}

export function OrganizationToJSON(value?: Omit<Organization, 'created_at'|'updated_at'> | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'domains': value['domains'],
        'id': value['id'],
        'label': value['label'],
        'project_id': value['project_id'],
    };
}

