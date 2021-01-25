//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: lines_longer_than_80_chars

import 'package:ory_hydra_client/api.dart';
import 'package:test/test.dart';


/// tests for PublicApi
void main() {
  final instance = PublicApi();

  group('tests for PublicApi', () {
    // OpenID Connect Front-Backchannel enabled Logout
    //
    // This endpoint initiates and completes user logout at ORY Hydra and initiates OpenID Connect Front-/Back-channel logout:  https://openid.net/specs/openid-connect-frontchannel-1_0.html https://openid.net/specs/openid-connect-backchannel-1_0.html
    //
    //Future disconnectUser() async
    test('test disconnectUser', () async {
      // TODO
    });

    // OpenID Connect Discovery
    //
    // The well known endpoint an be used to retrieve information for OpenID Connect clients. We encourage you to not roll your own OpenID Connect client but to use an OpenID Connect client library instead. You can learn more on this flow at https://openid.net/specs/openid-connect-discovery-1_0.html .  Popular libraries for OpenID Connect clients include oidc-client-js (JavaScript), go-oidc (Golang), and others. For a full list of clients go here: https://openid.net/developers/certified/
    //
    //Future<WellKnown> discoverOpenIDConfiguration() async
    test('test discoverOpenIDConfiguration', () async {
      // TODO
    });

    // Check readiness status
    //
    // This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the `X-Forwarded-Proto` header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
    //
    //Future<HealthStatus> isInstanceReady() async
    test('test isInstanceReady', () async {
      // TODO
    });

    // The OAuth 2.0 token endpoint
    //
    // The client makes a request to the token endpoint by sending the following parameters using the \"application/x-www-form-urlencoded\" HTTP request entity-body.  > Do not implement a client for this endpoint yourself. Use a library. There are many libraries > available for any programming language. You can find a list of libraries here: https://oauth.net/code/ > > Do not the the Hydra SDK does not implement this endpoint properly. Use one of the libraries listed above!
    //
    //Future<Oauth2TokenResponse> oauth2Token(String grantType, { String code, String refreshToken, String redirectUri, String clientId }) async
    test('test oauth2Token', () async {
      // TODO
    });

    // The OAuth 2.0 authorize endpoint
    //
    // This endpoint is not documented here because you should never use your own implementation to perform OAuth2 flows. OAuth2 is a very popular protocol and a library for your programming language will exists.  To learn more about this flow please refer to the specification: https://tools.ietf.org/html/rfc6749
    //
    //Future oauthAuth() async
    test('test oauthAuth', () async {
      // TODO
    });

    // Revoke OAuth2 tokens
    //
    // Revoking a token (both access and refresh) means that the tokens will be invalid. A revoked access token can no longer be used to make access requests, and a revoked refresh token can no longer be used to refresh an access token. Revoking a refresh token also invalidates the access token that was created with it. A token may only be revoked by the client the token was generated for.
    //
    //Future revokeOAuth2Token(String token) async
    test('test revokeOAuth2Token', () async {
      // TODO
    });

    // OpenID Connect Userinfo
    //
    // This endpoint returns the payload of the ID Token, including the idTokenExtra values, of the provided OAuth 2.0 Access Token.  For more information please [refer to the spec](http://openid.net/specs/openid-connect-core-1_0.html#UserInfo).
    //
    //Future<UserinfoResponse> userinfo() async
    test('test userinfo', () async {
      // TODO
    });

    // JSON Web Keys Discovery
    //
    // This endpoint returns JSON Web Keys to be used as public keys for verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
    //
    //Future<JSONWebKeySet> wellKnown() async
    test('test wellKnown', () async {
      // TODO
    });

  });
}
