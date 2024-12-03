# coding: utf-8

"""
    Ory APIs

    # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

    The version of the OpenAPI document: v1.15.11
    Contact: support@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from ory_client.models.o_auth2_login_request import OAuth2LoginRequest
from ory_client.models.ui_container import UiContainer
from typing import Optional, Set
from typing_extensions import Self

class RegistrationFlow(BaseModel):
    """
    RegistrationFlow
    """ # noqa: E501
    active: Optional[StrictStr] = Field(default=None, description="Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode")
    expires_at: datetime = Field(description="ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.")
    id: StrictStr = Field(description="ID represents the flow's unique ID. When performing the registration flow, this represents the id in the registration ui's query parameter: http://<selfservice.flows.registration.ui_url>/?flow=<id>")
    issued_at: datetime = Field(description="IssuedAt is the time (UTC) when the flow occurred.")
    oauth2_login_challenge: Optional[StrictStr] = Field(default=None, description="Ory OAuth 2.0 Login Challenge.  This value is set using the `login_challenge` query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider.")
    oauth2_login_request: Optional[OAuth2LoginRequest] = None
    organization_id: Optional[StrictStr] = None
    request_url: StrictStr = Field(description="RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.")
    return_to: Optional[StrictStr] = Field(default=None, description="ReturnTo contains the requested return_to URL.")
    session_token_exchange_code: Optional[StrictStr] = Field(default=None, description="SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \"api\", and only on creating the flow.")
    state: Optional[Any] = Field(description="State represents the state of this request:  choose_method: ask the user to choose a method (e.g. registration with email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the registration challenge was passed.")
    transient_payload: Optional[Dict[str, Any]] = Field(default=None, description="TransientPayload is used to pass data from the registration to a webhook")
    type: StrictStr = Field(description="The flow type can either be `api` or `browser`.")
    ui: UiContainer
    additional_properties: Dict[str, Any] = {}
    __properties: ClassVar[List[str]] = ["active", "expires_at", "id", "issued_at", "oauth2_login_challenge", "oauth2_login_request", "organization_id", "request_url", "return_to", "session_token_exchange_code", "state", "transient_payload", "type", "ui"]

    @field_validator('active')
    def active_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['password', 'oidc', 'totp', 'lookup_secret', 'webauthn', 'code', 'passkey', 'profile', 'link_recovery', 'code_recovery']):
            raise ValueError("must be one of enum values ('password', 'oidc', 'totp', 'lookup_secret', 'webauthn', 'code', 'passkey', 'profile', 'link_recovery', 'code_recovery')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of RegistrationFlow from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * Fields in `self.additional_properties` are added to the output dict.
        """
        excluded_fields: Set[str] = set([
            "additional_properties",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of oauth2_login_request
        if self.oauth2_login_request:
            _dict['oauth2_login_request'] = self.oauth2_login_request.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ui
        if self.ui:
            _dict['ui'] = self.ui.to_dict()
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        # set to None if organization_id (nullable) is None
        # and model_fields_set contains the field
        if self.organization_id is None and "organization_id" in self.model_fields_set:
            _dict['organization_id'] = None

        # set to None if state (nullable) is None
        # and model_fields_set contains the field
        if self.state is None and "state" in self.model_fields_set:
            _dict['state'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of RegistrationFlow from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "active": obj.get("active"),
            "expires_at": obj.get("expires_at"),
            "id": obj.get("id"),
            "issued_at": obj.get("issued_at"),
            "oauth2_login_challenge": obj.get("oauth2_login_challenge"),
            "oauth2_login_request": OAuth2LoginRequest.from_dict(obj["oauth2_login_request"]) if obj.get("oauth2_login_request") is not None else None,
            "organization_id": obj.get("organization_id"),
            "request_url": obj.get("request_url"),
            "return_to": obj.get("return_to"),
            "session_token_exchange_code": obj.get("session_token_exchange_code"),
            "state": obj.get("state"),
            "transient_payload": obj.get("transient_payload"),
            "type": obj.get("type"),
            "ui": UiContainer.from_dict(obj["ui"]) if obj.get("ui") is not None else None
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


