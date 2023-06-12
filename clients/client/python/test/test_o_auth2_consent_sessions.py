"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.34
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.o_auth2_consent_session import OAuth2ConsentSession
globals()['OAuth2ConsentSession'] = OAuth2ConsentSession
from ory_client.model.o_auth2_consent_sessions import OAuth2ConsentSessions


class TestOAuth2ConsentSessions(unittest.TestCase):
    """OAuth2ConsentSessions unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testOAuth2ConsentSessions(self):
        """Test OAuth2ConsentSessions"""
        # FIXME: construct object with mandatory attributes with example values
        # model = OAuth2ConsentSessions()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
