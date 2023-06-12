/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.34
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// SettingsFlowState show_form: No user data has been collected, or it is invalid, and thus the form should be shown. success: Indicates that the settings flow has been updated successfully with the provided data. Done will stay true when repeatedly checking. If set to true, done will revert back to false only when a flow with invalid (e.g. \"please use a valid phone number\") data was sent.
type SettingsFlowState string

// List of settingsFlowState
const (
	SETTINGSFLOWSTATE_SHOW_FORM SettingsFlowState = "show_form"
	SETTINGSFLOWSTATE_SUCCESS SettingsFlowState = "success"
)

// All allowed values of SettingsFlowState enum
var AllowedSettingsFlowStateEnumValues = []SettingsFlowState{
	"show_form",
	"success",
}

func (v *SettingsFlowState) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := SettingsFlowState(value)
	for _, existing := range AllowedSettingsFlowStateEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid SettingsFlowState", value)
}

// NewSettingsFlowStateFromValue returns a pointer to a valid SettingsFlowState
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewSettingsFlowStateFromValue(v string) (*SettingsFlowState, error) {
	ev := SettingsFlowState(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for SettingsFlowState: valid values are %v", v, AllowedSettingsFlowStateEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v SettingsFlowState) IsValid() bool {
	for _, existing := range AllowedSettingsFlowStateEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to settingsFlowState value
func (v SettingsFlowState) Ptr() *SettingsFlowState {
	return &v
}

type NullableSettingsFlowState struct {
	value *SettingsFlowState
	isSet bool
}

func (v NullableSettingsFlowState) Get() *SettingsFlowState {
	return v.value
}

func (v *NullableSettingsFlowState) Set(val *SettingsFlowState) {
	v.value = val
	v.isSet = true
}

func (v NullableSettingsFlowState) IsSet() bool {
	return v.isSet
}

func (v *NullableSettingsFlowState) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSettingsFlowState(val *SettingsFlowState) *NullableSettingsFlowState {
	return &NullableSettingsFlowState{value: val, isSet: true}
}

func (v NullableSettingsFlowState) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSettingsFlowState) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

