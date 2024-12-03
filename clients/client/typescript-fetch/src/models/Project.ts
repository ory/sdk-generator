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
import type { ProjectServices } from './ProjectServices';
import {
    ProjectServicesFromJSON,
    ProjectServicesFromJSONTyped,
    ProjectServicesToJSON,
} from './ProjectServices';
import type { ProjectCors } from './ProjectCors';
import {
    ProjectCorsFromJSON,
    ProjectCorsFromJSONTyped,
    ProjectCorsToJSON,
} from './ProjectCors';

/**
 * 
 * @export
 * @interface Project
 */
export interface Project {
    /**
     * 
     * @type {ProjectCors}
     * @memberof Project
     */
    cors_admin?: ProjectCors;
    /**
     * 
     * @type {ProjectCors}
     * @memberof Project
     */
    cors_public?: ProjectCors;
    /**
     * The environment of the project.
     * prod Production
     * stage Staging
     * dev Development
     * @type {string}
     * @memberof Project
     */
    environment: ProjectEnvironmentEnum;
    /**
     * The project home region.
     * 
     * This is used to set where the project data is stored and where the project's endpoints are located.
     * eu-central EUCentral
     * asia-northeast AsiaNorthEast
     * us-east USEast
     * us-west USWest
     * us US
     * global Global
     * @type {string}
     * @memberof Project
     */
    home_region: ProjectHomeRegionEnum;
    /**
     * The project's ID.
     * @type {string}
     * @memberof Project
     */
    readonly id: string;
    /**
     * The name of the project.
     * @type {string}
     * @memberof Project
     */
    name: string;
    /**
     * The configuration revision ID.
     * @type {string}
     * @memberof Project
     */
    readonly revision_id: string;
    /**
     * 
     * @type {ProjectServices}
     * @memberof Project
     */
    services: ProjectServices;
    /**
     * The project's slug
     * @type {string}
     * @memberof Project
     */
    readonly slug: string;
    /**
     * The state of the project.
     * running Running
     * halted Halted
     * deleted Deleted
     * @type {string}
     * @memberof Project
     */
    readonly state: ProjectStateEnum;
    /**
     * 
     * @type {string}
     * @memberof Project
     */
    workspace_id?: string | null;
}


/**
 * @export
 */
export const ProjectEnvironmentEnum = {
    Prod: 'prod',
    Stage: 'stage',
    Dev: 'dev'
} as const;
export type ProjectEnvironmentEnum = typeof ProjectEnvironmentEnum[keyof typeof ProjectEnvironmentEnum];

/**
 * @export
 */
export const ProjectHomeRegionEnum = {
    EuCentral: 'eu-central',
    AsiaNortheast: 'asia-northeast',
    UsEast: 'us-east',
    UsWest: 'us-west',
    Us: 'us',
    Global: 'global'
} as const;
export type ProjectHomeRegionEnum = typeof ProjectHomeRegionEnum[keyof typeof ProjectHomeRegionEnum];

/**
 * @export
 */
export const ProjectStateEnum = {
    Running: 'running',
    Halted: 'halted',
    Deleted: 'deleted'
} as const;
export type ProjectStateEnum = typeof ProjectStateEnum[keyof typeof ProjectStateEnum];


/**
 * Check if a given object implements the Project interface.
 */
export function instanceOfProject(value: object): value is Project {
    if (!('environment' in value) || value['environment'] === undefined) return false;
    if (!('home_region' in value) || value['home_region'] === undefined) return false;
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('revision_id' in value) || value['revision_id'] === undefined) return false;
    if (!('services' in value) || value['services'] === undefined) return false;
    if (!('slug' in value) || value['slug'] === undefined) return false;
    if (!('state' in value) || value['state'] === undefined) return false;
    return true;
}

export function ProjectFromJSON(json: any): Project {
    return ProjectFromJSONTyped(json, false);
}

export function ProjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): Project {
    if (json == null) {
        return json;
    }
    return {
        
        'cors_admin': json['cors_admin'] == null ? undefined : ProjectCorsFromJSON(json['cors_admin']),
        'cors_public': json['cors_public'] == null ? undefined : ProjectCorsFromJSON(json['cors_public']),
        'environment': json['environment'],
        'home_region': json['home_region'],
        'id': json['id'],
        'name': json['name'],
        'revision_id': json['revision_id'],
        'services': ProjectServicesFromJSON(json['services']),
        'slug': json['slug'],
        'state': json['state'],
        'workspace_id': json['workspace_id'] == null ? undefined : json['workspace_id'],
    };
}

export function ProjectToJSON(value?: Omit<Project, 'id'|'revision_id'|'slug'|'state'> | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'cors_admin': ProjectCorsToJSON(value['cors_admin']),
        'cors_public': ProjectCorsToJSON(value['cors_public']),
        'environment': value['environment'],
        'home_region': value['home_region'],
        'name': value['name'],
        'services': ProjectServicesToJSON(value['services']),
        'workspace_id': value['workspace_id'],
    };
}

