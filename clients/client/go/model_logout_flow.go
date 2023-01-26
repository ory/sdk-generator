/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.7
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// LogoutFlow Logout Flow
type LogoutFlow struct {
	// LogoutToken can be used to perform logout using AJAX.
	LogoutToken string `json:"logout_token"`
	// LogoutURL can be opened in a browser to sign the user out.  format: uri
	LogoutUrl string `json:"logout_url"`
}

// NewLogoutFlow instantiates a new LogoutFlow object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLogoutFlow(logoutToken string, logoutUrl string) *LogoutFlow {
	this := LogoutFlow{}
	this.LogoutToken = logoutToken
	this.LogoutUrl = logoutUrl
	return &this
}

// NewLogoutFlowWithDefaults instantiates a new LogoutFlow object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLogoutFlowWithDefaults() *LogoutFlow {
	this := LogoutFlow{}
	return &this
}

// GetLogoutToken returns the LogoutToken field value
func (o *LogoutFlow) GetLogoutToken() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.LogoutToken
}

// GetLogoutTokenOk returns a tuple with the LogoutToken field value
// and a boolean to check if the value has been set.
func (o *LogoutFlow) GetLogoutTokenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LogoutToken, true
}

// SetLogoutToken sets field value
func (o *LogoutFlow) SetLogoutToken(v string) {
	o.LogoutToken = v
}

// GetLogoutUrl returns the LogoutUrl field value
func (o *LogoutFlow) GetLogoutUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.LogoutUrl
}

// GetLogoutUrlOk returns a tuple with the LogoutUrl field value
// and a boolean to check if the value has been set.
func (o *LogoutFlow) GetLogoutUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.LogoutUrl, true
}

// SetLogoutUrl sets field value
func (o *LogoutFlow) SetLogoutUrl(v string) {
	o.LogoutUrl = v
}

func (o LogoutFlow) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["logout_token"] = o.LogoutToken
	}
	if true {
		toSerialize["logout_url"] = o.LogoutUrl
	}
	return json.Marshal(toSerialize)
}

type NullableLogoutFlow struct {
	value *LogoutFlow
	isSet bool
}

func (v NullableLogoutFlow) Get() *LogoutFlow {
	return v.value
}

func (v *NullableLogoutFlow) Set(val *LogoutFlow) {
	v.value = val
	v.isSet = true
}

func (v NullableLogoutFlow) IsSet() bool {
	return v.isSet
}

func (v *NullableLogoutFlow) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLogoutFlow(val *LogoutFlow) *NullableLogoutFlow {
	return &NullableLogoutFlow{value: val, isSet: true}
}

func (v NullableLogoutFlow) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLogoutFlow) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


