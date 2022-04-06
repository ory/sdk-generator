/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.154
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// AdminCreateIdentityImportCredentialsOidc struct for AdminCreateIdentityImportCredentialsOidc
type AdminCreateIdentityImportCredentialsOidc struct {
	Config *AdminCreateIdentityImportCredentialsOidcConfig `json:"config,omitempty"`
}

// NewAdminCreateIdentityImportCredentialsOidc instantiates a new AdminCreateIdentityImportCredentialsOidc object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdminCreateIdentityImportCredentialsOidc() *AdminCreateIdentityImportCredentialsOidc {
	this := AdminCreateIdentityImportCredentialsOidc{}
	return &this
}

// NewAdminCreateIdentityImportCredentialsOidcWithDefaults instantiates a new AdminCreateIdentityImportCredentialsOidc object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdminCreateIdentityImportCredentialsOidcWithDefaults() *AdminCreateIdentityImportCredentialsOidc {
	this := AdminCreateIdentityImportCredentialsOidc{}
	return &this
}

// GetConfig returns the Config field value if set, zero value otherwise.
func (o *AdminCreateIdentityImportCredentialsOidc) GetConfig() AdminCreateIdentityImportCredentialsOidcConfig {
	if o == nil || o.Config == nil {
		var ret AdminCreateIdentityImportCredentialsOidcConfig
		return ret
	}
	return *o.Config
}

// GetConfigOk returns a tuple with the Config field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdminCreateIdentityImportCredentialsOidc) GetConfigOk() (*AdminCreateIdentityImportCredentialsOidcConfig, bool) {
	if o == nil || o.Config == nil {
		return nil, false
	}
	return o.Config, true
}

// HasConfig returns a boolean if a field has been set.
func (o *AdminCreateIdentityImportCredentialsOidc) HasConfig() bool {
	if o != nil && o.Config != nil {
		return true
	}

	return false
}

// SetConfig gets a reference to the given AdminCreateIdentityImportCredentialsOidcConfig and assigns it to the Config field.
func (o *AdminCreateIdentityImportCredentialsOidc) SetConfig(v AdminCreateIdentityImportCredentialsOidcConfig) {
	o.Config = &v
}

func (o AdminCreateIdentityImportCredentialsOidc) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Config != nil {
		toSerialize["config"] = o.Config
	}
	return json.Marshal(toSerialize)
}

type NullableAdminCreateIdentityImportCredentialsOidc struct {
	value *AdminCreateIdentityImportCredentialsOidc
	isSet bool
}

func (v NullableAdminCreateIdentityImportCredentialsOidc) Get() *AdminCreateIdentityImportCredentialsOidc {
	return v.value
}

func (v *NullableAdminCreateIdentityImportCredentialsOidc) Set(val *AdminCreateIdentityImportCredentialsOidc) {
	v.value = val
	v.isSet = true
}

func (v NullableAdminCreateIdentityImportCredentialsOidc) IsSet() bool {
	return v.isSet
}

func (v *NullableAdminCreateIdentityImportCredentialsOidc) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdminCreateIdentityImportCredentialsOidc(val *AdminCreateIdentityImportCredentialsOidc) *NullableAdminCreateIdentityImportCredentialsOidc {
	return &NullableAdminCreateIdentityImportCredentialsOidc{value: val, isSet: true}
}

func (v NullableAdminCreateIdentityImportCredentialsOidc) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdminCreateIdentityImportCredentialsOidc) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


