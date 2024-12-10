/*
Ory APIs

# Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

API version: v1.15.15
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
)


type WellknownAPI interface {

	/*
	DiscoverJsonWebKeys Discover Well-Known JSON Web Keys

	This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and,
if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like
[node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.

Adding custom keys requires first creating a keyset via the createJsonWebKeySet operation,
and then configuring the webfinger.jwks.broadcast_keys configuration value to include the keyset name.

	@param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
	@return WellknownAPIDiscoverJsonWebKeysRequest
	*/
	DiscoverJsonWebKeys(ctx context.Context) WellknownAPIDiscoverJsonWebKeysRequest

	// DiscoverJsonWebKeysExecute executes the request
	//  @return JsonWebKeySet
	DiscoverJsonWebKeysExecute(r WellknownAPIDiscoverJsonWebKeysRequest) (*JsonWebKeySet, *http.Response, error)
}

// WellknownAPIService WellknownAPI service
type WellknownAPIService service

type WellknownAPIDiscoverJsonWebKeysRequest struct {
	ctx context.Context
	ApiService WellknownAPI
}

func (r WellknownAPIDiscoverJsonWebKeysRequest) Execute() (*JsonWebKeySet, *http.Response, error) {
	return r.ApiService.DiscoverJsonWebKeysExecute(r)
}

/*
DiscoverJsonWebKeys Discover Well-Known JSON Web Keys

This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and,
if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like
[node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.

Adding custom keys requires first creating a keyset via the createJsonWebKeySet operation,
and then configuring the webfinger.jwks.broadcast_keys configuration value to include the keyset name.

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return WellknownAPIDiscoverJsonWebKeysRequest
*/
func (a *WellknownAPIService) DiscoverJsonWebKeys(ctx context.Context) WellknownAPIDiscoverJsonWebKeysRequest {
	return WellknownAPIDiscoverJsonWebKeysRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
//  @return JsonWebKeySet
func (a *WellknownAPIService) DiscoverJsonWebKeysExecute(r WellknownAPIDiscoverJsonWebKeysRequest) (*JsonWebKeySet, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *JsonWebKeySet
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "WellknownAPIService.DiscoverJsonWebKeys")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/.well-known/jwks.json"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{"application/json"}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
			var v ErrorOAuth2
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
