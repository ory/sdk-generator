/*
Ory Hydra API

Testing OAuth2APIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package client

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/ory/hydra-client-go"
)

func Test_client_OAuth2APIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test OAuth2APIService AcceptOAuth2ConsentRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.AcceptOAuth2ConsentRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService AcceptOAuth2LoginRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.AcceptOAuth2LoginRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService AcceptOAuth2LogoutRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.AcceptOAuth2LogoutRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService CreateOAuth2Client", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.CreateOAuth2Client(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService DeleteOAuth2Client", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id string

		httpRes, err := apiClient.OAuth2API.DeleteOAuth2Client(context.Background(), id).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService DeleteOAuth2Token", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		httpRes, err := apiClient.OAuth2API.DeleteOAuth2Token(context.Background()).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService DeleteTrustedOAuth2JwtGrantIssuer", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id string

		httpRes, err := apiClient.OAuth2API.DeleteTrustedOAuth2JwtGrantIssuer(context.Background(), id).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService GetOAuth2Client", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id string

		resp, httpRes, err := apiClient.OAuth2API.GetOAuth2Client(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService GetOAuth2ConsentRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.GetOAuth2ConsentRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService GetOAuth2LoginRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.GetOAuth2LoginRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService GetOAuth2LogoutRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.GetOAuth2LogoutRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService GetTrustedOAuth2JwtGrantIssuer", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id string

		resp, httpRes, err := apiClient.OAuth2API.GetTrustedOAuth2JwtGrantIssuer(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService IntrospectOAuth2Token", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.IntrospectOAuth2Token(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService ListOAuth2Clients", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.ListOAuth2Clients(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService ListOAuth2ConsentSessions", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.ListOAuth2ConsentSessions(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService ListTrustedOAuth2JwtGrantIssuers", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.ListTrustedOAuth2JwtGrantIssuers(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService OAuth2Authorize", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.OAuth2Authorize(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService Oauth2TokenExchange", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.Oauth2TokenExchange(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService PatchOAuth2Client", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id string

		resp, httpRes, err := apiClient.OAuth2API.PatchOAuth2Client(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService RejectOAuth2ConsentRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.RejectOAuth2ConsentRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService RejectOAuth2LoginRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.RejectOAuth2LoginRequest(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService RejectOAuth2LogoutRequest", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		httpRes, err := apiClient.OAuth2API.RejectOAuth2LogoutRequest(context.Background()).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService RevokeOAuth2ConsentSessions", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		httpRes, err := apiClient.OAuth2API.RevokeOAuth2ConsentSessions(context.Background()).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService RevokeOAuth2LoginSessions", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		httpRes, err := apiClient.OAuth2API.RevokeOAuth2LoginSessions(context.Background()).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService RevokeOAuth2Token", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		httpRes, err := apiClient.OAuth2API.RevokeOAuth2Token(context.Background()).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService SetOAuth2Client", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id string

		resp, httpRes, err := apiClient.OAuth2API.SetOAuth2Client(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService SetOAuth2ClientLifespans", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var id string

		resp, httpRes, err := apiClient.OAuth2API.SetOAuth2ClientLifespans(context.Background(), id).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test OAuth2APIService TrustOAuth2JwtGrantIssuer", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		resp, httpRes, err := apiClient.OAuth2API.TrustOAuth2JwtGrantIssuer(context.Background()).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
