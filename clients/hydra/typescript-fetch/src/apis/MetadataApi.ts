/* tslint:disable */
/* eslint-disable */
/**
 * Ory Hydra API
 * Documentation for all of Ory Hydra\'s APIs. 
 *
 * The version of the OpenAPI document: v2.2.1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  GenericError,
  GetVersion200Response,
  HealthStatus,
  IsReady200Response,
  IsReady503Response,
} from '../models/index';
import {
    GenericErrorFromJSON,
    GenericErrorToJSON,
    GetVersion200ResponseFromJSON,
    GetVersion200ResponseToJSON,
    HealthStatusFromJSON,
    HealthStatusToJSON,
    IsReady200ResponseFromJSON,
    IsReady200ResponseToJSON,
    IsReady503ResponseFromJSON,
    IsReady503ResponseToJSON,
} from '../models/index';

/**
 * 
 */
export class MetadataApi extends runtime.BaseAPI {

    /**
     * This endpoint returns the version of Ory Hydra.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the version will never refer to the cluster state, only to a single instance.
     * Return Running Software Version.
     */
    async getVersionRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetVersion200Response>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/version`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetVersion200ResponseFromJSON(jsonValue));
    }

    /**
     * This endpoint returns the version of Ory Hydra.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the version will never refer to the cluster state, only to a single instance.
     * Return Running Software Version.
     */
    async getVersion(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetVersion200Response> {
        const response = await this.getVersionRaw(initOverrides);
        return await response.value();
    }

    /**
     * This endpoint returns a HTTP 200 status code when Ory Hydra is accepting incoming HTTP requests. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * Check HTTP Server Status
     */
    async isAliveRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<HealthStatus>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/health/alive`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => HealthStatusFromJSON(jsonValue));
    }

    /**
     * This endpoint returns a HTTP 200 status code when Ory Hydra is accepting incoming HTTP requests. This status does currently not include checks whether the database connection is working.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
     * Check HTTP Server Status
     */
    async isAlive(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<HealthStatus> {
        const response = await this.isAliveRaw(initOverrides);
        return await response.value();
    }

    /**
     * This endpoint returns a HTTP 200 status code when Ory Hydra is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of Ory Hydra, the health status will never refer to the cluster state, only to a single instance.
     * Check HTTP Server and Database Status
     */
    async isReadyRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IsReady200Response>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/health/ready`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IsReady200ResponseFromJSON(jsonValue));
    }

    /**
     * This endpoint returns a HTTP 200 status code when Ory Hydra is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of Ory Hydra, the health status will never refer to the cluster state, only to a single instance.
     * Check HTTP Server and Database Status
     */
    async isReady(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IsReady200Response> {
        const response = await this.isReadyRaw(initOverrides);
        return await response.value();
    }

}