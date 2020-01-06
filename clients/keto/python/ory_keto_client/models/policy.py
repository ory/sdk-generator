# coding: utf-8

"""
    ORY Keto

    A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.2
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_keto_client.configuration import Configuration


class Policy(object):
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
        'actions': 'list[str]',
        'conditions': 'dict(str, object)',
        'description': 'str',
        'effect': 'str',
        'id': 'str',
        'resources': 'list[str]',
        'subjects': 'list[str]'
    }

    attribute_map = {
        'actions': 'actions',
        'conditions': 'conditions',
        'description': 'description',
        'effect': 'effect',
        'id': 'id',
        'resources': 'resources',
        'subjects': 'subjects'
    }

    def __init__(self, actions=None, conditions=None, description=None, effect=None, id=None, resources=None, subjects=None, local_vars_configuration=None):  # noqa: E501
        """Policy - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._actions = None
        self._conditions = None
        self._description = None
        self._effect = None
        self._id = None
        self._resources = None
        self._subjects = None
        self.discriminator = None

        if actions is not None:
            self.actions = actions
        if conditions is not None:
            self.conditions = conditions
        if description is not None:
            self.description = description
        if effect is not None:
            self.effect = effect
        if id is not None:
            self.id = id
        if resources is not None:
            self.resources = resources
        if subjects is not None:
            self.subjects = subjects

    @property
    def actions(self):
        """Gets the actions of this Policy.  # noqa: E501

        Actions is an array representing all the actions this ORY Access Policy applies to.  # noqa: E501

        :return: The actions of this Policy.  # noqa: E501
        :rtype: list[str]
        """
        return self._actions

    @actions.setter
    def actions(self, actions):
        """Sets the actions of this Policy.

        Actions is an array representing all the actions this ORY Access Policy applies to.  # noqa: E501

        :param actions: The actions of this Policy.  # noqa: E501
        :type: list[str]
        """

        self._actions = actions

    @property
    def conditions(self):
        """Gets the conditions of this Policy.  # noqa: E501

        Conditions represents a keyed object of conditions under which this ORY Access Policy is active.  # noqa: E501

        :return: The conditions of this Policy.  # noqa: E501
        :rtype: dict(str, object)
        """
        return self._conditions

    @conditions.setter
    def conditions(self, conditions):
        """Sets the conditions of this Policy.

        Conditions represents a keyed object of conditions under which this ORY Access Policy is active.  # noqa: E501

        :param conditions: The conditions of this Policy.  # noqa: E501
        :type: dict(str, object)
        """

        self._conditions = conditions

    @property
    def description(self):
        """Gets the description of this Policy.  # noqa: E501

        Description is an optional, human-readable description.  # noqa: E501

        :return: The description of this Policy.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this Policy.

        Description is an optional, human-readable description.  # noqa: E501

        :param description: The description of this Policy.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def effect(self):
        """Gets the effect of this Policy.  # noqa: E501

        Effect is the effect of this ORY Access Policy. It can be \"allow\" or \"deny\".  # noqa: E501

        :return: The effect of this Policy.  # noqa: E501
        :rtype: str
        """
        return self._effect

    @effect.setter
    def effect(self, effect):
        """Sets the effect of this Policy.

        Effect is the effect of this ORY Access Policy. It can be \"allow\" or \"deny\".  # noqa: E501

        :param effect: The effect of this Policy.  # noqa: E501
        :type: str
        """

        self._effect = effect

    @property
    def id(self):
        """Gets the id of this Policy.  # noqa: E501

        ID is the unique identifier of the ORY Access Policy. It is used to query, update, and remove the ORY Access Policy.  # noqa: E501

        :return: The id of this Policy.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Policy.

        ID is the unique identifier of the ORY Access Policy. It is used to query, update, and remove the ORY Access Policy.  # noqa: E501

        :param id: The id of this Policy.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def resources(self):
        """Gets the resources of this Policy.  # noqa: E501

        Resources is an array representing all the resources this ORY Access Policy applies to.  # noqa: E501

        :return: The resources of this Policy.  # noqa: E501
        :rtype: list[str]
        """
        return self._resources

    @resources.setter
    def resources(self, resources):
        """Sets the resources of this Policy.

        Resources is an array representing all the resources this ORY Access Policy applies to.  # noqa: E501

        :param resources: The resources of this Policy.  # noqa: E501
        :type: list[str]
        """

        self._resources = resources

    @property
    def subjects(self):
        """Gets the subjects of this Policy.  # noqa: E501

        Subjects is an array representing all the subjects this ORY Access Policy applies to.  # noqa: E501

        :return: The subjects of this Policy.  # noqa: E501
        :rtype: list[str]
        """
        return self._subjects

    @subjects.setter
    def subjects(self, subjects):
        """Sets the subjects of this Policy.

        Subjects is an array representing all the subjects this ORY Access Policy applies to.  # noqa: E501

        :param subjects: The subjects of this Policy.  # noqa: E501
        :type: list[str]
        """

        self._subjects = subjects

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
        if not isinstance(other, Policy):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Policy):
            return True

        return self.to_dict() != other.to_dict()
