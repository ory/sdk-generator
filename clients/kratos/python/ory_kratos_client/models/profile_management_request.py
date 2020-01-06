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


class ProfileManagementRequest(object):
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
        'expires_at': 'datetime',
        'form': 'Form',
        'id': 'str',
        'identity': 'Identity',
        'issued_at': 'datetime',
        'request_url': 'str',
        'update_successful': 'bool'
    }

    attribute_map = {
        'expires_at': 'expires_at',
        'form': 'form',
        'id': 'id',
        'identity': 'identity',
        'issued_at': 'issued_at',
        'request_url': 'request_url',
        'update_successful': 'update_successful'
    }

    def __init__(self, expires_at=None, form=None, id=None, identity=None, issued_at=None, request_url=None, update_successful=None, local_vars_configuration=None):  # noqa: E501
        """ProfileManagementRequest - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._expires_at = None
        self._form = None
        self._id = None
        self._identity = None
        self._issued_at = None
        self._request_url = None
        self._update_successful = None
        self.discriminator = None

        if expires_at is not None:
            self.expires_at = expires_at
        if form is not None:
            self.form = form
        if id is not None:
            self.id = id
        if identity is not None:
            self.identity = identity
        if issued_at is not None:
            self.issued_at = issued_at
        if request_url is not None:
            self.request_url = request_url
        if update_successful is not None:
            self.update_successful = update_successful

    @property
    def expires_at(self):
        """Gets the expires_at of this ProfileManagementRequest.  # noqa: E501

        ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the profile, a new request has to be initiated.  # noqa: E501

        :return: The expires_at of this ProfileManagementRequest.  # noqa: E501
        :rtype: datetime
        """
        return self._expires_at

    @expires_at.setter
    def expires_at(self, expires_at):
        """Sets the expires_at of this ProfileManagementRequest.

        ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the profile, a new request has to be initiated.  # noqa: E501

        :param expires_at: The expires_at of this ProfileManagementRequest.  # noqa: E501
        :type: datetime
        """

        self._expires_at = expires_at

    @property
    def form(self):
        """Gets the form of this ProfileManagementRequest.  # noqa: E501


        :return: The form of this ProfileManagementRequest.  # noqa: E501
        :rtype: Form
        """
        return self._form

    @form.setter
    def form(self, form):
        """Sets the form of this ProfileManagementRequest.


        :param form: The form of this ProfileManagementRequest.  # noqa: E501
        :type: Form
        """

        self._form = form

    @property
    def id(self):
        """Gets the id of this ProfileManagementRequest.  # noqa: E501


        :return: The id of this ProfileManagementRequest.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ProfileManagementRequest.


        :param id: The id of this ProfileManagementRequest.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def identity(self):
        """Gets the identity of this ProfileManagementRequest.  # noqa: E501


        :return: The identity of this ProfileManagementRequest.  # noqa: E501
        :rtype: Identity
        """
        return self._identity

    @identity.setter
    def identity(self, identity):
        """Sets the identity of this ProfileManagementRequest.


        :param identity: The identity of this ProfileManagementRequest.  # noqa: E501
        :type: Identity
        """

        self._identity = identity

    @property
    def issued_at(self):
        """Gets the issued_at of this ProfileManagementRequest.  # noqa: E501

        IssuedAt is the time (UTC) when the request occurred.  # noqa: E501

        :return: The issued_at of this ProfileManagementRequest.  # noqa: E501
        :rtype: datetime
        """
        return self._issued_at

    @issued_at.setter
    def issued_at(self, issued_at):
        """Sets the issued_at of this ProfileManagementRequest.

        IssuedAt is the time (UTC) when the request occurred.  # noqa: E501

        :param issued_at: The issued_at of this ProfileManagementRequest.  # noqa: E501
        :type: datetime
        """

        self._issued_at = issued_at

    @property
    def request_url(self):
        """Gets the request_url of this ProfileManagementRequest.  # noqa: E501

        RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL's path or query for example.  # noqa: E501

        :return: The request_url of this ProfileManagementRequest.  # noqa: E501
        :rtype: str
        """
        return self._request_url

    @request_url.setter
    def request_url(self, request_url):
        """Sets the request_url of this ProfileManagementRequest.

        RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL's path or query for example.  # noqa: E501

        :param request_url: The request_url of this ProfileManagementRequest.  # noqa: E501
        :type: str
        """

        self._request_url = request_url

    @property
    def update_successful(self):
        """Gets the update_successful of this ProfileManagementRequest.  # noqa: E501

        UpdateSuccessful, if true, indicates that the profile has been updated successfully with the provided data. Done will stay true when repeatedly checking. If set to true, done will revert back to false only when a request with invalid (e.g. \"please use a valid phone number\") data was sent.  # noqa: E501

        :return: The update_successful of this ProfileManagementRequest.  # noqa: E501
        :rtype: bool
        """
        return self._update_successful

    @update_successful.setter
    def update_successful(self, update_successful):
        """Sets the update_successful of this ProfileManagementRequest.

        UpdateSuccessful, if true, indicates that the profile has been updated successfully with the provided data. Done will stay true when repeatedly checking. If set to true, done will revert back to false only when a request with invalid (e.g. \"please use a valid phone number\") data was sent.  # noqa: E501

        :param update_successful: The update_successful of this ProfileManagementRequest.  # noqa: E501
        :type: bool
        """

        self._update_successful = update_successful

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
        if not isinstance(other, ProfileManagementRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ProfileManagementRequest):
            return True

        return self.to_dict() != other.to_dict()
