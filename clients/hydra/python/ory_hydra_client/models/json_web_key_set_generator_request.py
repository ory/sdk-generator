# coding: utf-8

"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: v0.0.0-alpha.i+1
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_hydra_client.configuration import Configuration


class JsonWebKeySetGeneratorRequest(object):
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
        'alg': 'str',
        'kid': 'str',
        'use': 'str'
    }

    attribute_map = {
        'alg': 'alg',
        'kid': 'kid',
        'use': 'use'
    }

    def __init__(self, alg=None, kid=None, use=None, local_vars_configuration=None):  # noqa: E501
        """JsonWebKeySetGeneratorRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._alg = None
        self._kid = None
        self._use = None
        self.discriminator = None

        self.alg = alg
        self.kid = kid
        self.use = use

    @property
    def alg(self):
        """Gets the alg of this JsonWebKeySetGeneratorRequest.  # noqa: E501

        The algorithm to be used for creating the key. Supports \"RS256\", \"ES512\", \"HS512\", and \"HS256\"  # noqa: E501

        :return: The alg of this JsonWebKeySetGeneratorRequest.  # noqa: E501
        :rtype: str
        """
        return self._alg

    @alg.setter
    def alg(self, alg):
        """Sets the alg of this JsonWebKeySetGeneratorRequest.

        The algorithm to be used for creating the key. Supports \"RS256\", \"ES512\", \"HS512\", and \"HS256\"  # noqa: E501

        :param alg: The alg of this JsonWebKeySetGeneratorRequest.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and alg is None:  # noqa: E501
            raise ValueError("Invalid value for `alg`, must not be `None`")  # noqa: E501

        self._alg = alg

    @property
    def kid(self):
        """Gets the kid of this JsonWebKeySetGeneratorRequest.  # noqa: E501

        The kid of the key to be created  # noqa: E501

        :return: The kid of this JsonWebKeySetGeneratorRequest.  # noqa: E501
        :rtype: str
        """
        return self._kid

    @kid.setter
    def kid(self, kid):
        """Sets the kid of this JsonWebKeySetGeneratorRequest.

        The kid of the key to be created  # noqa: E501

        :param kid: The kid of this JsonWebKeySetGeneratorRequest.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and kid is None:  # noqa: E501
            raise ValueError("Invalid value for `kid`, must not be `None`")  # noqa: E501

        self._kid = kid

    @property
    def use(self):
        """Gets the use of this JsonWebKeySetGeneratorRequest.  # noqa: E501

        The \"use\" (public key use) parameter identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \"enc\" and \"sig\".  # noqa: E501

        :return: The use of this JsonWebKeySetGeneratorRequest.  # noqa: E501
        :rtype: str
        """
        return self._use

    @use.setter
    def use(self, use):
        """Sets the use of this JsonWebKeySetGeneratorRequest.

        The \"use\" (public key use) parameter identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \"enc\" and \"sig\".  # noqa: E501

        :param use: The use of this JsonWebKeySetGeneratorRequest.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and use is None:  # noqa: E501
            raise ValueError("Invalid value for `use`, must not be `None`")  # noqa: E501

        self._use = use

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
        if not isinstance(other, JsonWebKeySetGeneratorRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, JsonWebKeySetGeneratorRequest):
            return True

        return self.to_dict() != other.to_dict()
