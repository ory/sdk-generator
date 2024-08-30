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

from ory_client.models.project_events_datapoint import ProjectEventsDatapoint

class TestProjectEventsDatapoint(unittest.TestCase):
    """ProjectEventsDatapoint unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProjectEventsDatapoint:
        """Test ProjectEventsDatapoint
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProjectEventsDatapoint`
        """
        model = ProjectEventsDatapoint()
        if include_optional:
            return ProjectEventsDatapoint(
                attributes = [
                    ory_client.models.attribute.Attribute(
                        key = '', 
                        value = '', )
                    ],
                name = '',
                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f')
            )
        else:
            return ProjectEventsDatapoint(
                attributes = [
                    ory_client.models.attribute.Attribute(
                        key = '', 
                        value = '', )
                    ],
                name = '',
                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
        )
        """

    def testProjectEventsDatapoint(self):
        """Test ProjectEventsDatapoint"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
