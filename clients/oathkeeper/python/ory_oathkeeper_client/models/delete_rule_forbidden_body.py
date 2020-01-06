# coding: utf-8

"""
    ORY Oathkeeper

    ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.36
    Contact: hi@ory.am
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_oathkeeper_client.configuration import Configuration


class DeleteRuleForbiddenBody(object):
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
        'code': 'int',
        'details': 'list[dict(str, object)]',
        'message': 'str',
        'reason': 'str',
        'request': 'str',
        'status': 'str'
    }

    attribute_map = {
        'code': 'code',
        'details': 'details',
        'message': 'message',
        'reason': 'reason',
        'request': 'request',
        'status': 'status'
    }

    def __init__(self, code=None, details=None, message=None, reason=None, request=None, status=None, local_vars_configuration=None):  # noqa: E501
        """DeleteRuleForbiddenBody - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._code = None
        self._details = None
        self._message = None
        self._reason = None
        self._request = None
        self._status = None
        self.discriminator = None

        if code is not None:
            self.code = code
        if details is not None:
            self.details = details
        if message is not None:
            self.message = message
        if reason is not None:
            self.reason = reason
        if request is not None:
            self.request = request
        if status is not None:
            self.status = status

    @property
    def code(self):
        """Gets the code of this DeleteRuleForbiddenBody.  # noqa: E501

        code  # noqa: E501

        :return: The code of this DeleteRuleForbiddenBody.  # noqa: E501
        :rtype: int
        """
        return self._code

    @code.setter
    def code(self, code):
        """Sets the code of this DeleteRuleForbiddenBody.

        code  # noqa: E501

        :param code: The code of this DeleteRuleForbiddenBody.  # noqa: E501
        :type: int
        """

        self._code = code

    @property
    def details(self):
        """Gets the details of this DeleteRuleForbiddenBody.  # noqa: E501

        details  # noqa: E501

        :return: The details of this DeleteRuleForbiddenBody.  # noqa: E501
        :rtype: list[dict(str, object)]
        """
        return self._details

    @details.setter
    def details(self, details):
        """Sets the details of this DeleteRuleForbiddenBody.

        details  # noqa: E501

        :param details: The details of this DeleteRuleForbiddenBody.  # noqa: E501
        :type: list[dict(str, object)]
        """

        self._details = details

    @property
    def message(self):
        """Gets the message of this DeleteRuleForbiddenBody.  # noqa: E501

        message  # noqa: E501

        :return: The message of this DeleteRuleForbiddenBody.  # noqa: E501
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this DeleteRuleForbiddenBody.

        message  # noqa: E501

        :param message: The message of this DeleteRuleForbiddenBody.  # noqa: E501
        :type: str
        """

        self._message = message

    @property
    def reason(self):
        """Gets the reason of this DeleteRuleForbiddenBody.  # noqa: E501

        reason  # noqa: E501

        :return: The reason of this DeleteRuleForbiddenBody.  # noqa: E501
        :rtype: str
        """
        return self._reason

    @reason.setter
    def reason(self, reason):
        """Sets the reason of this DeleteRuleForbiddenBody.

        reason  # noqa: E501

        :param reason: The reason of this DeleteRuleForbiddenBody.  # noqa: E501
        :type: str
        """

        self._reason = reason

    @property
    def request(self):
        """Gets the request of this DeleteRuleForbiddenBody.  # noqa: E501

        request  # noqa: E501

        :return: The request of this DeleteRuleForbiddenBody.  # noqa: E501
        :rtype: str
        """
        return self._request

    @request.setter
    def request(self, request):
        """Sets the request of this DeleteRuleForbiddenBody.

        request  # noqa: E501

        :param request: The request of this DeleteRuleForbiddenBody.  # noqa: E501
        :type: str
        """

        self._request = request

    @property
    def status(self):
        """Gets the status of this DeleteRuleForbiddenBody.  # noqa: E501

        status  # noqa: E501

        :return: The status of this DeleteRuleForbiddenBody.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this DeleteRuleForbiddenBody.

        status  # noqa: E501

        :param status: The status of this DeleteRuleForbiddenBody.  # noqa: E501
        :type: str
        """

        self._status = status

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
        if not isinstance(other, DeleteRuleForbiddenBody):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, DeleteRuleForbiddenBody):
            return True

        return self.to_dict() != other.to_dict()
