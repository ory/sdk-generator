# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.31
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_kratos_client.configuration import Configuration


class OidcStrategyRequestMethod(object):
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
        'errors': 'list[Error]',
        'fields': 'dict(str, FormField)',
        'method': 'str',
        'providers': 'list[FormField]'
    }

    attribute_map = {
        'action': 'action',
        'errors': 'errors',
        'fields': 'fields',
        'method': 'method',
        'providers': 'providers'
    }

    def __init__(self, action=None, errors=None, fields=None, method=None, providers=None, local_vars_configuration=None):  # noqa: E501
        """OidcStrategyRequestMethod - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._action = None
        self._errors = None
        self._fields = None
        self._method = None
        self._providers = None
        self.discriminator = None

        if action is not None:
            self.action = action
        if errors is not None:
            self.errors = errors
        if fields is not None:
            self.fields = fields
        if method is not None:
            self.method = method
        if providers is not None:
            self.providers = providers

    @property
    def action(self):
        """Gets the action of this OidcStrategyRequestMethod.  # noqa: E501

        Action should be used as the form action URL (<form action=\"{{ .Action }}\" method=\"post\">).  # noqa: E501

        :return: The action of this OidcStrategyRequestMethod.  # noqa: E501
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """Sets the action of this OidcStrategyRequestMethod.

        Action should be used as the form action URL (<form action=\"{{ .Action }}\" method=\"post\">).  # noqa: E501

        :param action: The action of this OidcStrategyRequestMethod.  # noqa: E501
        :type: str
        """

        self._action = action

    @property
    def errors(self):
        """Gets the errors of this OidcStrategyRequestMethod.  # noqa: E501

        Errors contains all form errors. These will be duplicates of the individual field errors.  # noqa: E501

        :return: The errors of this OidcStrategyRequestMethod.  # noqa: E501
        :rtype: list[Error]
        """
        return self._errors

    @errors.setter
    def errors(self, errors):
        """Sets the errors of this OidcStrategyRequestMethod.

        Errors contains all form errors. These will be duplicates of the individual field errors.  # noqa: E501

        :param errors: The errors of this OidcStrategyRequestMethod.  # noqa: E501
        :type: list[Error]
        """

        self._errors = errors

    @property
    def fields(self):
        """Gets the fields of this OidcStrategyRequestMethod.  # noqa: E501

        Fields contains multiple fields asdfasdf  # noqa: E501

        :return: The fields of this OidcStrategyRequestMethod.  # noqa: E501
        :rtype: dict(str, FormField)
        """
        return self._fields

    @fields.setter
    def fields(self, fields):
        """Sets the fields of this OidcStrategyRequestMethod.

        Fields contains multiple fields asdfasdf  # noqa: E501

        :param fields: The fields of this OidcStrategyRequestMethod.  # noqa: E501
        :type: dict(str, FormField)
        """

        self._fields = fields

    @property
    def method(self):
        """Gets the method of this OidcStrategyRequestMethod.  # noqa: E501

        Method is the form method (e.g. POST)  # noqa: E501

        :return: The method of this OidcStrategyRequestMethod.  # noqa: E501
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method):
        """Sets the method of this OidcStrategyRequestMethod.

        Method is the form method (e.g. POST)  # noqa: E501

        :param method: The method of this OidcStrategyRequestMethod.  # noqa: E501
        :type: str
        """

        self._method = method

    @property
    def providers(self):
        """Gets the providers of this OidcStrategyRequestMethod.  # noqa: E501


        :return: The providers of this OidcStrategyRequestMethod.  # noqa: E501
        :rtype: list[FormField]
        """
        return self._providers

    @providers.setter
    def providers(self, providers):
        """Sets the providers of this OidcStrategyRequestMethod.


        :param providers: The providers of this OidcStrategyRequestMethod.  # noqa: E501
        :type: list[FormField]
        """

        self._providers = providers

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
        if not isinstance(other, OidcStrategyRequestMethod):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OidcStrategyRequestMethod):
            return True

        return self.to_dict() != other.to_dict()
