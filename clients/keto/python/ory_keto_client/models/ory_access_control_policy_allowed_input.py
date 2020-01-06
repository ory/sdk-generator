# coding: utf-8

"""
    ORY Keto

    A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.32+1
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_keto_client.configuration import Configuration


class OryAccessControlPolicyAllowedInput(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'action': 'str',
        'context': 'dict(str, object)',
        'resource': 'str',
        'subject': 'str'
    }

    attribute_map = {
        'action': 'action',
        'context': 'context',
        'resource': 'resource',
        'subject': 'subject'
    }

    def __init__(self, action=None, context=None, resource=None, subject=None, local_vars_configuration=None):  # noqa: E501
        """OryAccessControlPolicyAllowedInput - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._action = None
        self._context = None
        self._resource = None
        self._subject = None
        self.discriminator = None

        if action is not None:
            self.action = action
        if context is not None:
            self.context = context
        if resource is not None:
            self.resource = resource
        if subject is not None:
            self.subject = subject

    @property
    def action(self):
        """Gets the action of this OryAccessControlPolicyAllowedInput.  # noqa: E501

        Action is the action that is requested on the resource.  # noqa: E501

        :return: The action of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """Sets the action of this OryAccessControlPolicyAllowedInput.

        Action is the action that is requested on the resource.  # noqa: E501

        :param action: The action of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :type: str
        """

        self._action = action

    @property
    def context(self):
        """Gets the context of this OryAccessControlPolicyAllowedInput.  # noqa: E501

        Context is the request's environmental context.  # noqa: E501

        :return: The context of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :rtype: dict(str, object)
        """
        return self._context

    @context.setter
    def context(self, context):
        """Sets the context of this OryAccessControlPolicyAllowedInput.

        Context is the request's environmental context.  # noqa: E501

        :param context: The context of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :type: dict(str, object)
        """

        self._context = context

    @property
    def resource(self):
        """Gets the resource of this OryAccessControlPolicyAllowedInput.  # noqa: E501

        Resource is the resource that access is requested to.  # noqa: E501

        :return: The resource of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :rtype: str
        """
        return self._resource

    @resource.setter
    def resource(self, resource):
        """Sets the resource of this OryAccessControlPolicyAllowedInput.

        Resource is the resource that access is requested to.  # noqa: E501

        :param resource: The resource of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :type: str
        """

        self._resource = resource

    @property
    def subject(self):
        """Gets the subject of this OryAccessControlPolicyAllowedInput.  # noqa: E501

        Subject is the subject that is requesting access.  # noqa: E501

        :return: The subject of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject):
        """Sets the subject of this OryAccessControlPolicyAllowedInput.

        Subject is the subject that is requesting access.  # noqa: E501

        :param subject: The subject of this OryAccessControlPolicyAllowedInput.  # noqa: E501
        :type: str
        """

        self._subject = subject

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, OryAccessControlPolicyAllowedInput):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OryAccessControlPolicyAllowedInput):
            return True

        return self.to_dict() != other.to_dict()
