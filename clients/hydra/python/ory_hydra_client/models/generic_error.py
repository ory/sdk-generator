# coding: utf-8

"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.17
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_hydra_client.configuration import Configuration


class GenericError(object):
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
        'debug': 'str',
        'error': 'str',
        'error_description': 'str',
        'status_code': 'int'
    }

    attribute_map = {
        'debug': 'debug',
        'error': 'error',
        'error_description': 'error_description',
        'status_code': 'status_code'
    }

    def __init__(self, debug=None, error=None, error_description=None, status_code=None, local_vars_configuration=None):  # noqa: E501
        """GenericError - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._debug = None
        self._error = None
        self._error_description = None
        self._status_code = None
        self.discriminator = None

        if debug is not None:
            self.debug = debug
        self.error = error
        if error_description is not None:
            self.error_description = error_description
        if status_code is not None:
            self.status_code = status_code

    @property
    def debug(self):
        """Gets the debug of this GenericError.  # noqa: E501

        Debug contains debug information. This is usually not available and has to be enabled.  # noqa: E501

        :return: The debug of this GenericError.  # noqa: E501
        :rtype: str
        """
        return self._debug

    @debug.setter
    def debug(self, debug):
        """Sets the debug of this GenericError.

        Debug contains debug information. This is usually not available and has to be enabled.  # noqa: E501

        :param debug: The debug of this GenericError.  # noqa: E501
        :type: str
        """

        self._debug = debug

    @property
    def error(self):
        """Gets the error of this GenericError.  # noqa: E501

        Name is the error name.  # noqa: E501

        :return: The error of this GenericError.  # noqa: E501
        :rtype: str
        """
        return self._error

    @error.setter
    def error(self, error):
        """Sets the error of this GenericError.

        Name is the error name.  # noqa: E501

        :param error: The error of this GenericError.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and error is None:  # noqa: E501
            raise ValueError("Invalid value for `error`, must not be `None`")  # noqa: E501

        self._error = error

    @property
    def error_description(self):
        """Gets the error_description of this GenericError.  # noqa: E501

        Description contains further information on the nature of the error.  # noqa: E501

        :return: The error_description of this GenericError.  # noqa: E501
        :rtype: str
        """
        return self._error_description

    @error_description.setter
    def error_description(self, error_description):
        """Sets the error_description of this GenericError.

        Description contains further information on the nature of the error.  # noqa: E501

        :param error_description: The error_description of this GenericError.  # noqa: E501
        :type: str
        """

        self._error_description = error_description

    @property
    def status_code(self):
        """Gets the status_code of this GenericError.  # noqa: E501

        Code represents the error status code (404, 403, 401, ...).  # noqa: E501

        :return: The status_code of this GenericError.  # noqa: E501
        :rtype: int
        """
        return self._status_code

    @status_code.setter
    def status_code(self, status_code):
        """Sets the status_code of this GenericError.

        Code represents the error status code (404, 403, 401, ...).  # noqa: E501

        :param status_code: The status_code of this GenericError.  # noqa: E501
        :type: int
        """

        self._status_code = status_code

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
        if not isinstance(other, GenericError):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GenericError):
            return True

        return self.to_dict() != other.to_dict()
