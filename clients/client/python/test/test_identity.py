"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.8.1
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.identity_credentials import IdentityCredentials
from ory_client.model.recovery_identity_address import RecoveryIdentityAddress
from ory_client.model.verifiable_identity_address import VerifiableIdentityAddress
globals()['IdentityCredentials'] = IdentityCredentials
globals()['RecoveryIdentityAddress'] = RecoveryIdentityAddress
globals()['VerifiableIdentityAddress'] = VerifiableIdentityAddress
from ory_client.model.identity import Identity


class TestIdentity(unittest.TestCase):
    """Identity unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIdentity(self):
        """Test Identity"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Identity()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
