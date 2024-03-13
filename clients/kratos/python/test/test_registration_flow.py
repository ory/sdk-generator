"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more.   # noqa: E501

    The version of the OpenAPI document: v1.1.0
    Contact: office@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_kratos_client
from ory_kratos_client.model.o_auth2_login_request import OAuth2LoginRequest
from ory_kratos_client.model.ui_container import UiContainer
globals()['OAuth2LoginRequest'] = OAuth2LoginRequest
globals()['UiContainer'] = UiContainer
from ory_kratos_client.model.registration_flow import RegistrationFlow


class TestRegistrationFlow(unittest.TestCase):
    """RegistrationFlow unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRegistrationFlow(self):
        """Test RegistrationFlow"""
        # FIXME: construct object with mandatory attributes with example values
        # model = RegistrationFlow()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
