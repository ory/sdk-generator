# coding: utf-8

"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

    The version of the OpenAPI document: v1.14.5
    Contact: support@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ory_client.api.oidc_api import OidcApi


class TestOidcApi(unittest.TestCase):
    """OidcApi unit test stubs"""

    def setUp(self) -> None:
        self.api = OidcApi()

    def tearDown(self) -> None:
        pass

    def test_create_oidc_dynamic_client(self) -> None:
        """Test case for create_oidc_dynamic_client

        Register OAuth2 Client using OpenID Dynamic Client Registration
        """
        pass

    def test_create_verifiable_credential(self) -> None:
        """Test case for create_verifiable_credential

        Issues a Verifiable Credential
        """
        pass

    def test_delete_oidc_dynamic_client(self) -> None:
        """Test case for delete_oidc_dynamic_client

        Delete OAuth 2.0 Client using the OpenID Dynamic Client Registration Management Protocol
        """
        pass

    def test_discover_oidc_configuration(self) -> None:
        """Test case for discover_oidc_configuration

        OpenID Connect Discovery
        """
        pass

    def test_get_oidc_dynamic_client(self) -> None:
        """Test case for get_oidc_dynamic_client

        Get OAuth2 Client using OpenID Dynamic Client Registration
        """
        pass

    def test_get_oidc_user_info(self) -> None:
        """Test case for get_oidc_user_info

        OpenID Connect Userinfo
        """
        pass

    def test_revoke_oidc_session(self) -> None:
        """Test case for revoke_oidc_session

        OpenID Connect Front- and Back-channel Enabled Logout
        """
        pass

    def test_set_oidc_dynamic_client(self) -> None:
        """Test case for set_oidc_dynamic_client

        Set OAuth2 Client using OpenID Dynamic Client Registration
        """
        pass


if __name__ == '__main__':
    unittest.main()
