# coding: utf-8

"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.36
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_hydra_client.configuration import Configuration


class Oauth2TokenResponse(object):
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
        'access_token': 'str',
        'expires_in': 'int',
        'id_token': 'str',
        'refresh_token': 'str',
        'scope': 'str',
        'token_type': 'str'
    }

    attribute_map = {
        'access_token': 'access_token',
        'expires_in': 'expires_in',
        'id_token': 'id_token',
        'refresh_token': 'refresh_token',
        'scope': 'scope',
        'token_type': 'token_type'
    }

    def __init__(self, access_token=None, expires_in=None, id_token=None, refresh_token=None, scope=None, token_type=None, local_vars_configuration=None):  # noqa: E501
        """Oauth2TokenResponse - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._access_token = None
        self._expires_in = None
        self._id_token = None
        self._refresh_token = None
        self._scope = None
        self._token_type = None
        self.discriminator = None

        if access_token is not None:
            self.access_token = access_token
        if expires_in is not None:
            self.expires_in = expires_in
        if id_token is not None:
            self.id_token = id_token
        if refresh_token is not None:
            self.refresh_token = refresh_token
        if scope is not None:
            self.scope = scope
        if token_type is not None:
            self.token_type = token_type

    @property
    def access_token(self):
        """Gets the access_token of this Oauth2TokenResponse.  # noqa: E501


        :return: The access_token of this Oauth2TokenResponse.  # noqa: E501
        :rtype: str
        """
        return self._access_token

    @access_token.setter
    def access_token(self, access_token):
        """Sets the access_token of this Oauth2TokenResponse.


        :param access_token: The access_token of this Oauth2TokenResponse.  # noqa: E501
        :type: str
        """

        self._access_token = access_token

    @property
    def expires_in(self):
        """Gets the expires_in of this Oauth2TokenResponse.  # noqa: E501


        :return: The expires_in of this Oauth2TokenResponse.  # noqa: E501
        :rtype: int
        """
        return self._expires_in

    @expires_in.setter
    def expires_in(self, expires_in):
        """Sets the expires_in of this Oauth2TokenResponse.


        :param expires_in: The expires_in of this Oauth2TokenResponse.  # noqa: E501
        :type: int
        """

        self._expires_in = expires_in

    @property
    def id_token(self):
        """Gets the id_token of this Oauth2TokenResponse.  # noqa: E501


        :return: The id_token of this Oauth2TokenResponse.  # noqa: E501
        :rtype: str
        """
        return self._id_token

    @id_token.setter
    def id_token(self, id_token):
        """Sets the id_token of this Oauth2TokenResponse.


        :param id_token: The id_token of this Oauth2TokenResponse.  # noqa: E501
        :type: str
        """

        self._id_token = id_token

    @property
    def refresh_token(self):
        """Gets the refresh_token of this Oauth2TokenResponse.  # noqa: E501


        :return: The refresh_token of this Oauth2TokenResponse.  # noqa: E501
        :rtype: str
        """
        return self._refresh_token

    @refresh_token.setter
    def refresh_token(self, refresh_token):
        """Sets the refresh_token of this Oauth2TokenResponse.


        :param refresh_token: The refresh_token of this Oauth2TokenResponse.  # noqa: E501
        :type: str
        """

        self._refresh_token = refresh_token

    @property
    def scope(self):
        """Gets the scope of this Oauth2TokenResponse.  # noqa: E501


        :return: The scope of this Oauth2TokenResponse.  # noqa: E501
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """Sets the scope of this Oauth2TokenResponse.


        :param scope: The scope of this Oauth2TokenResponse.  # noqa: E501
        :type: str
        """

        self._scope = scope

    @property
    def token_type(self):
        """Gets the token_type of this Oauth2TokenResponse.  # noqa: E501


        :return: The token_type of this Oauth2TokenResponse.  # noqa: E501
        :rtype: str
        """
        return self._token_type

    @token_type.setter
    def token_type(self, token_type):
        """Sets the token_type of this Oauth2TokenResponse.


        :param token_type: The token_type of this Oauth2TokenResponse.  # noqa: E501
        :type: str
        """

        self._token_type = token_type

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
        if not isinstance(other, Oauth2TokenResponse):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Oauth2TokenResponse):
            return True

        return self.to_dict() != other.to_dict()
