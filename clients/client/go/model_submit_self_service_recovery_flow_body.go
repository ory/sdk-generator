/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.169
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// SubmitSelfServiceRecoveryFlowBody - struct for SubmitSelfServiceRecoveryFlowBody
type SubmitSelfServiceRecoveryFlowBody struct {
	SubmitSelfServiceRecoveryFlowWithLinkMethodBody *SubmitSelfServiceRecoveryFlowWithLinkMethodBody
}

// SubmitSelfServiceRecoveryFlowWithLinkMethodBodyAsSubmitSelfServiceRecoveryFlowBody is a convenience function that returns SubmitSelfServiceRecoveryFlowWithLinkMethodBody wrapped in SubmitSelfServiceRecoveryFlowBody
func SubmitSelfServiceRecoveryFlowWithLinkMethodBodyAsSubmitSelfServiceRecoveryFlowBody(v *SubmitSelfServiceRecoveryFlowWithLinkMethodBody) SubmitSelfServiceRecoveryFlowBody {
	return SubmitSelfServiceRecoveryFlowBody{
		SubmitSelfServiceRecoveryFlowWithLinkMethodBody: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *SubmitSelfServiceRecoveryFlowBody) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into SubmitSelfServiceRecoveryFlowWithLinkMethodBody
	err = newStrictDecoder(data).Decode(&dst.SubmitSelfServiceRecoveryFlowWithLinkMethodBody)
	if err == nil {
		jsonSubmitSelfServiceRecoveryFlowWithLinkMethodBody, _ := json.Marshal(dst.SubmitSelfServiceRecoveryFlowWithLinkMethodBody)
		if string(jsonSubmitSelfServiceRecoveryFlowWithLinkMethodBody) == "{}" { // empty struct
			dst.SubmitSelfServiceRecoveryFlowWithLinkMethodBody = nil
		} else {
			match++
		}
	} else {
		dst.SubmitSelfServiceRecoveryFlowWithLinkMethodBody = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.SubmitSelfServiceRecoveryFlowWithLinkMethodBody = nil

		return fmt.Errorf("Data matches more than one schema in oneOf(SubmitSelfServiceRecoveryFlowBody)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("Data failed to match schemas in oneOf(SubmitSelfServiceRecoveryFlowBody)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src SubmitSelfServiceRecoveryFlowBody) MarshalJSON() ([]byte, error) {
	if src.SubmitSelfServiceRecoveryFlowWithLinkMethodBody != nil {
		return json.Marshal(&src.SubmitSelfServiceRecoveryFlowWithLinkMethodBody)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *SubmitSelfServiceRecoveryFlowBody) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.SubmitSelfServiceRecoveryFlowWithLinkMethodBody != nil {
		return obj.SubmitSelfServiceRecoveryFlowWithLinkMethodBody
	}

	// all schemas are nil
	return nil
}

type NullableSubmitSelfServiceRecoveryFlowBody struct {
	value *SubmitSelfServiceRecoveryFlowBody
	isSet bool
}

func (v NullableSubmitSelfServiceRecoveryFlowBody) Get() *SubmitSelfServiceRecoveryFlowBody {
	return v.value
}

func (v *NullableSubmitSelfServiceRecoveryFlowBody) Set(val *SubmitSelfServiceRecoveryFlowBody) {
	v.value = val
	v.isSet = true
}

func (v NullableSubmitSelfServiceRecoveryFlowBody) IsSet() bool {
	return v.isSet
}

func (v *NullableSubmitSelfServiceRecoveryFlowBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubmitSelfServiceRecoveryFlowBody(val *SubmitSelfServiceRecoveryFlowBody) *NullableSubmitSelfServiceRecoveryFlowBody {
	return &NullableSubmitSelfServiceRecoveryFlowBody{value: val, isSet: true}
}

func (v NullableSubmitSelfServiceRecoveryFlowBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubmitSelfServiceRecoveryFlowBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


