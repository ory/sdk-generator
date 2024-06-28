# coding: utf-8

"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

    The version of the OpenAPI document: v1.12.1
    Contact: support@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ory_client.models.continue_with import ContinueWith
from ory_client.models.identity import Identity
from ory_client.models.ui_container import UiContainer
from typing import Optional, Set
from typing_extensions import Self

class SettingsFlow(BaseModel):
    """
    This flow is used when an identity wants to update settings (e.g. profile data, passwords, ...) in a selfservice manner.  We recommend reading the [User Settings Documentation](../self-service/flows/user-settings)
    """ # noqa: E501
    active: Optional[StrictStr] = Field(default=None, description="Active, if set, contains the registration method that is being used. It is initially not set.")
    continue_with: Optional[List[ContinueWith]] = Field(default=None, description="Contains a list of actions, that could follow this flow  It can, for example, contain a reference to the verification flow, created as part of the user's registration.")
    expires_at: datetime = Field(description="ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to update the setting, a new flow has to be initiated.")
    id: StrictStr = Field(description="ID represents the flow's unique ID. When performing the settings flow, this represents the id in the settings ui's query parameter: http://<selfservice.flows.settings.ui_url>?flow=<id>")
    identity: Identity
    issued_at: datetime = Field(description="IssuedAt is the time (UTC) when the flow occurred.")
    request_url: StrictStr = Field(description="RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.")
    return_to: Optional[StrictStr] = Field(default=None, description="ReturnTo contains the requested return_to URL.")
    state: Optional[Any] = Field(description="State represents the state of this flow. It knows two states:  show_form: No user data has been collected, or it is invalid, and thus the form should be shown. success: Indicates that the settings flow has been updated successfully with the provided data. Done will stay true when repeatedly checking. If set to true, done will revert back to false only when a flow with invalid (e.g. \"please use a valid phone number\") data was sent.")
    transient_payload: Optional[Dict[str, Any]] = Field(default=None, description="TransientPayload is used to pass data from the settings flow to hooks and email templates")
    type: StrictStr = Field(description="The flow type can either be `api` or `browser`.")
    ui: UiContainer
    additional_properties: Dict[str, Any] = {}
    __properties: ClassVar[List[str]] = ["active", "continue_with", "expires_at", "id", "identity", "issued_at", "request_url", "return_to", "state", "transient_payload", "type", "ui"]

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
        """Create an instance of SettingsFlow from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in continue_with (list)
        _items = []
        if self.continue_with:
            for _item in self.continue_with:
                if _item:
                    _items.append(_item.to_dict())
            _dict['continue_with'] = _items
        # override the default output from pydantic by calling `to_dict()` of identity
        if self.identity:
            _dict['identity'] = self.identity.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ui
        if self.ui:
            _dict['ui'] = self.ui.to_dict()
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        # set to None if state (nullable) is None
        # and model_fields_set contains the field
        if self.state is None and "state" in self.model_fields_set:
            _dict['state'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SettingsFlow from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "active": obj.get("active"),
            "continue_with": [ContinueWith.from_dict(_item) for _item in obj["continue_with"]] if obj.get("continue_with") is not None else None,
            "expires_at": obj.get("expires_at"),
            "id": obj.get("id"),
            "identity": Identity.from_dict(obj["identity"]) if obj.get("identity") is not None else None,
            "issued_at": obj.get("issued_at"),
            "request_url": obj.get("request_url"),
            "return_to": obj.get("return_to"),
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

