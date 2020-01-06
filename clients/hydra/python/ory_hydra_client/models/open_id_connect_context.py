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


class OpenIDConnectContext(object):
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
        'acr_values': 'list[str]',
        'display': 'str',
        'id_token_hint_claims': 'dict(str, object)',
        'login_hint': 'str',
        'ui_locales': 'list[str]'
    }

    attribute_map = {
        'acr_values': 'acr_values',
        'display': 'display',
        'id_token_hint_claims': 'id_token_hint_claims',
        'login_hint': 'login_hint',
        'ui_locales': 'ui_locales'
    }

    def __init__(self, acr_values=None, display=None, id_token_hint_claims=None, login_hint=None, ui_locales=None, local_vars_configuration=None):  # noqa: E501
        """OpenIDConnectContext - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._acr_values = None
        self._display = None
        self._id_token_hint_claims = None
        self._login_hint = None
        self._ui_locales = None
        self.discriminator = None

        if acr_values is not None:
            self.acr_values = acr_values
        if display is not None:
            self.display = display
        if id_token_hint_claims is not None:
            self.id_token_hint_claims = id_token_hint_claims
        if login_hint is not None:
            self.login_hint = login_hint
        if ui_locales is not None:
            self.ui_locales = ui_locales

    @property
    def acr_values(self):
        """Gets the acr_values of this OpenIDConnectContext.  # noqa: E501

        ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: > Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.  # noqa: E501

        :return: The acr_values of this OpenIDConnectContext.  # noqa: E501
        :rtype: list[str]
        """
        return self._acr_values

    @acr_values.setter
    def acr_values(self, acr_values):
        """Sets the acr_values of this OpenIDConnectContext.

        ACRValues is the Authentication AuthorizationContext Class Reference requested in the OAuth 2.0 Authorization request. It is a parameter defined by OpenID Connect and expresses which level of authentication (e.g. 2FA) is required.  OpenID Connect defines it as follows: > Requested Authentication AuthorizationContext Class Reference values. Space-separated string that specifies the acr values that the Authorization Server is being requested to use for processing this Authentication Request, with the values appearing in order of preference. The Authentication AuthorizationContext Class satisfied by the authentication performed is returned as the acr Claim Value, as specified in Section 2. The acr Claim is requested as a Voluntary Claim by this parameter.  # noqa: E501

        :param acr_values: The acr_values of this OpenIDConnectContext.  # noqa: E501
        :type: list[str]
        """

        self._acr_values = acr_values

    @property
    def display(self):
        """Gets the display of this OpenIDConnectContext.  # noqa: E501

        Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \"feature phone\" type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.  # noqa: E501

        :return: The display of this OpenIDConnectContext.  # noqa: E501
        :rtype: str
        """
        return self._display

    @display.setter
    def display(self, display):
        """Sets the display of this OpenIDConnectContext.

        Display is a string value that specifies how the Authorization Server displays the authentication and consent user interface pages to the End-User. The defined values are: page: The Authorization Server SHOULD display the authentication and consent UI consistent with a full User Agent page view. If the display parameter is not specified, this is the default display mode. popup: The Authorization Server SHOULD display the authentication and consent UI consistent with a popup User Agent window. The popup User Agent window should be of an appropriate size for a login-focused dialog and should not obscure the entire window that it is popping up over. touch: The Authorization Server SHOULD display the authentication and consent UI consistent with a device that leverages a touch interface. wap: The Authorization Server SHOULD display the authentication and consent UI consistent with a \"feature phone\" type display.  The Authorization Server MAY also attempt to detect the capabilities of the User Agent and present an appropriate display.  # noqa: E501

        :param display: The display of this OpenIDConnectContext.  # noqa: E501
        :type: str
        """

        self._display = display

    @property
    def id_token_hint_claims(self):
        """Gets the id_token_hint_claims of this OpenIDConnectContext.  # noqa: E501

        IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User's current or past authenticated session with the Client.  # noqa: E501

        :return: The id_token_hint_claims of this OpenIDConnectContext.  # noqa: E501
        :rtype: dict(str, object)
        """
        return self._id_token_hint_claims

    @id_token_hint_claims.setter
    def id_token_hint_claims(self, id_token_hint_claims):
        """Sets the id_token_hint_claims of this OpenIDConnectContext.

        IDTokenHintClaims are the claims of the ID Token previously issued by the Authorization Server being passed as a hint about the End-User's current or past authenticated session with the Client.  # noqa: E501

        :param id_token_hint_claims: The id_token_hint_claims of this OpenIDConnectContext.  # noqa: E501
        :type: dict(str, object)
        """

        self._id_token_hint_claims = id_token_hint_claims

    @property
    def login_hint(self):
        """Gets the login_hint of this OpenIDConnectContext.  # noqa: E501

        LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.  # noqa: E501

        :return: The login_hint of this OpenIDConnectContext.  # noqa: E501
        :rtype: str
        """
        return self._login_hint

    @login_hint.setter
    def login_hint(self, login_hint):
        """Sets the login_hint of this OpenIDConnectContext.

        LoginHint hints about the login identifier the End-User might use to log in (if necessary). This hint can be used by an RP if it first asks the End-User for their e-mail address (or other identifier) and then wants to pass that value as a hint to the discovered authorization service. This value MAY also be a phone number in the format specified for the phone_number Claim. The use of this parameter is optional.  # noqa: E501

        :param login_hint: The login_hint of this OpenIDConnectContext.  # noqa: E501
        :type: str
        """

        self._login_hint = login_hint

    @property
    def ui_locales(self):
        """Gets the ui_locales of this OpenIDConnectContext.  # noqa: E501

        UILocales is the End-User'id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \"fr-CA fr en\" represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.  # noqa: E501

        :return: The ui_locales of this OpenIDConnectContext.  # noqa: E501
        :rtype: list[str]
        """
        return self._ui_locales

    @ui_locales.setter
    def ui_locales(self, ui_locales):
        """Sets the ui_locales of this OpenIDConnectContext.

        UILocales is the End-User'id preferred languages and scripts for the user interface, represented as a space-separated list of BCP47 [RFC5646] language tag values, ordered by preference. For instance, the value \"fr-CA fr en\" represents a preference for French as spoken in Canada, then French (without a region designation), followed by English (without a region designation). An error SHOULD NOT result if some or all of the requested locales are not supported by the OpenID Provider.  # noqa: E501

        :param ui_locales: The ui_locales of this OpenIDConnectContext.  # noqa: E501
        :type: list[str]
        """

        self._ui_locales = ui_locales

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
        if not isinstance(other, OpenIDConnectContext):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OpenIDConnectContext):
            return True

        return self.to_dict() != other.to_dict()
