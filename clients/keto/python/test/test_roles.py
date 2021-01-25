"""
    ORY Keto

    A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.  # noqa: E501

    The version of the OpenAPI document: v0.0.0
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_keto_client
from ory_keto_client.model.role import Role
globals()['Role'] = Role
from ory_keto_client.model.roles import Roles


class TestRoles(unittest.TestCase):
    """Roles unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testRoles(self):
        """Test Roles"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Roles()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
