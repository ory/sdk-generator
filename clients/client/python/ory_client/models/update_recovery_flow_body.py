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
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from ory_client.models.update_recovery_flow_with_code_method import UpdateRecoveryFlowWithCodeMethod
from ory_client.models.update_recovery_flow_with_link_method import UpdateRecoveryFlowWithLinkMethod
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

UPDATERECOVERYFLOWBODY_ONE_OF_SCHEMAS = ["UpdateRecoveryFlowWithCodeMethod", "UpdateRecoveryFlowWithLinkMethod"]

class UpdateRecoveryFlowBody(BaseModel):
    """
    Update Recovery Flow Request Body
    """
    # data type: UpdateRecoveryFlowWithLinkMethod
    oneof_schema_1_validator: Optional[UpdateRecoveryFlowWithLinkMethod] = None
    # data type: UpdateRecoveryFlowWithCodeMethod
    oneof_schema_2_validator: Optional[UpdateRecoveryFlowWithCodeMethod] = None
    actual_instance: Optional[Union[UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod]] = None
    one_of_schemas: Set[str] = { "UpdateRecoveryFlowWithCodeMethod", "UpdateRecoveryFlowWithLinkMethod" }

    model_config = ConfigDict(
        validate_assignment=True,
        protected_namespaces=(),
    )


    discriminator_value_class_map: Dict[str, str] = {
    }

    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @field_validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = UpdateRecoveryFlowBody.model_construct()
        error_messages = []
        match = 0
        # validate data type: UpdateRecoveryFlowWithLinkMethod
        if not isinstance(v, UpdateRecoveryFlowWithLinkMethod):
            error_messages.append(f"Error! Input type `{type(v)}` is not `UpdateRecoveryFlowWithLinkMethod`")
        else:
            match += 1
        # validate data type: UpdateRecoveryFlowWithCodeMethod
        if not isinstance(v, UpdateRecoveryFlowWithCodeMethod):
            error_messages.append(f"Error! Input type `{type(v)}` is not `UpdateRecoveryFlowWithCodeMethod`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in UpdateRecoveryFlowBody with oneOf schemas: UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in UpdateRecoveryFlowBody with oneOf schemas: UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: Union[str, Dict[str, Any]]) -> Self:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Returns the object represented by the json string"""
        instance = cls.model_construct()
        error_messages = []
        match = 0

        # use oneOf discriminator to lookup the data type
        _data_type = json.loads(json_str).get("method")
        if not _data_type:
            raise ValueError("Failed to lookup data type from the field `method` in the input.")

        # check if data type is `UpdateRecoveryFlowWithCodeMethod`
        if _data_type == "code":
            instance.actual_instance = UpdateRecoveryFlowWithCodeMethod.from_json(json_str)
            return instance

        # check if data type is `UpdateRecoveryFlowWithLinkMethod`
        if _data_type == "link":
            instance.actual_instance = UpdateRecoveryFlowWithLinkMethod.from_json(json_str)
            return instance

        # check if data type is `UpdateRecoveryFlowWithCodeMethod`
        if _data_type == "updateRecoveryFlowWithCodeMethod":
            instance.actual_instance = UpdateRecoveryFlowWithCodeMethod.from_json(json_str)
            return instance

        # check if data type is `UpdateRecoveryFlowWithLinkMethod`
        if _data_type == "updateRecoveryFlowWithLinkMethod":
            instance.actual_instance = UpdateRecoveryFlowWithLinkMethod.from_json(json_str)
            return instance

        # deserialize data into UpdateRecoveryFlowWithLinkMethod
        try:
            instance.actual_instance = UpdateRecoveryFlowWithLinkMethod.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into UpdateRecoveryFlowWithCodeMethod
        try:
            instance.actual_instance = UpdateRecoveryFlowWithCodeMethod.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into UpdateRecoveryFlowBody with oneOf schemas: UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into UpdateRecoveryFlowBody with oneOf schemas: UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        if hasattr(self.actual_instance, "to_json") and callable(self.actual_instance.to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> Optional[Union[Dict[str, Any], UpdateRecoveryFlowWithCodeMethod, UpdateRecoveryFlowWithLinkMethod]]:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        if hasattr(self.actual_instance, "to_dict") and callable(self.actual_instance.to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.model_dump())


