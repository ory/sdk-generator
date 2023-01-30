"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more.   # noqa: E501

    The version of the OpenAPI document: v0.11.1
    Contact: office@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_kratos_client
from ory_kratos_client.model.identity_state import IdentityState
from ory_kratos_client.model.identity_with_credentials import IdentityWithCredentials
from ory_kratos_client.model.recovery_identity_address import RecoveryIdentityAddress
from ory_kratos_client.model.verifiable_identity_address import VerifiableIdentityAddress
globals()['IdentityState'] = IdentityState
globals()['IdentityWithCredentials'] = IdentityWithCredentials
globals()['RecoveryIdentityAddress'] = RecoveryIdentityAddress
globals()['VerifiableIdentityAddress'] = VerifiableIdentityAddress
from ory_kratos_client.model.create_identity_body import CreateIdentityBody


class TestCreateIdentityBody(unittest.TestCase):
    """CreateIdentityBody unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testCreateIdentityBody(self):
        """Test CreateIdentityBody"""
        # FIXME: construct object with mandatory attributes with example values
        # model = CreateIdentityBody()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()