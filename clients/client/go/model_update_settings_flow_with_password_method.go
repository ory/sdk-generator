/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.14.5
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// checks if the UpdateSettingsFlowWithPasswordMethod type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdateSettingsFlowWithPasswordMethod{}

// UpdateSettingsFlowWithPasswordMethod Update Settings Flow with Password Method
type UpdateSettingsFlowWithPasswordMethod struct {
	// CSRFToken is the anti-CSRF token
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Method  Should be set to password when trying to update a password.
	Method string `json:"method"`
	// Password is the updated password
	Password string `json:"password"`
	// Transient data to pass along to any webhooks
	TransientPayload map[string]interface{} `json:"transient_payload,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _UpdateSettingsFlowWithPasswordMethod UpdateSettingsFlowWithPasswordMethod

// NewUpdateSettingsFlowWithPasswordMethod instantiates a new UpdateSettingsFlowWithPasswordMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateSettingsFlowWithPasswordMethod(method string, password string) *UpdateSettingsFlowWithPasswordMethod {
	this := UpdateSettingsFlowWithPasswordMethod{}
	this.Method = method
	this.Password = password
	return &this
}

// NewUpdateSettingsFlowWithPasswordMethodWithDefaults instantiates a new UpdateSettingsFlowWithPasswordMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateSettingsFlowWithPasswordMethodWithDefaults() *UpdateSettingsFlowWithPasswordMethod {
	this := UpdateSettingsFlowWithPasswordMethod{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *UpdateSettingsFlowWithPasswordMethod) GetCsrfToken() string {
	if o == nil || IsNil(o.CsrfToken) {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithPasswordMethod) GetCsrfTokenOk() (*string, bool) {
	if o == nil || IsNil(o.CsrfToken) {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *UpdateSettingsFlowWithPasswordMethod) HasCsrfToken() bool {
	if o != nil && !IsNil(o.CsrfToken) {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *UpdateSettingsFlowWithPasswordMethod) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetMethod returns the Method field value
func (o *UpdateSettingsFlowWithPasswordMethod) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithPasswordMethod) GetMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *UpdateSettingsFlowWithPasswordMethod) SetMethod(v string) {
	o.Method = v
}

// GetPassword returns the Password field value
func (o *UpdateSettingsFlowWithPasswordMethod) GetPassword() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Password
}

// GetPasswordOk returns a tuple with the Password field value
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithPasswordMethod) GetPasswordOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Password, true
}

// SetPassword sets field value
func (o *UpdateSettingsFlowWithPasswordMethod) SetPassword(v string) {
	o.Password = v
}

// GetTransientPayload returns the TransientPayload field value if set, zero value otherwise.
func (o *UpdateSettingsFlowWithPasswordMethod) GetTransientPayload() map[string]interface{} {
	if o == nil || IsNil(o.TransientPayload) {
		var ret map[string]interface{}
		return ret
	}
	return o.TransientPayload
}

// GetTransientPayloadOk returns a tuple with the TransientPayload field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateSettingsFlowWithPasswordMethod) GetTransientPayloadOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.TransientPayload) {
		return map[string]interface{}{}, false
	}
	return o.TransientPayload, true
}

// HasTransientPayload returns a boolean if a field has been set.
func (o *UpdateSettingsFlowWithPasswordMethod) HasTransientPayload() bool {
	if o != nil && !IsNil(o.TransientPayload) {
		return true
	}

	return false
}

// SetTransientPayload gets a reference to the given map[string]interface{} and assigns it to the TransientPayload field.
func (o *UpdateSettingsFlowWithPasswordMethod) SetTransientPayload(v map[string]interface{}) {
	o.TransientPayload = v
}

func (o UpdateSettingsFlowWithPasswordMethod) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdateSettingsFlowWithPasswordMethod) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.CsrfToken) {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	toSerialize["method"] = o.Method
	toSerialize["password"] = o.Password
	if !IsNil(o.TransientPayload) {
		toSerialize["transient_payload"] = o.TransientPayload
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *UpdateSettingsFlowWithPasswordMethod) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"method",
		"password",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varUpdateSettingsFlowWithPasswordMethod := _UpdateSettingsFlowWithPasswordMethod{}

	err = json.Unmarshal(data, &varUpdateSettingsFlowWithPasswordMethod)

	if err != nil {
		return err
	}

	*o = UpdateSettingsFlowWithPasswordMethod(varUpdateSettingsFlowWithPasswordMethod)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "csrf_token")
		delete(additionalProperties, "method")
		delete(additionalProperties, "password")
		delete(additionalProperties, "transient_payload")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUpdateSettingsFlowWithPasswordMethod struct {
	value *UpdateSettingsFlowWithPasswordMethod
	isSet bool
}

func (v NullableUpdateSettingsFlowWithPasswordMethod) Get() *UpdateSettingsFlowWithPasswordMethod {
	return v.value
}

func (v *NullableUpdateSettingsFlowWithPasswordMethod) Set(val *UpdateSettingsFlowWithPasswordMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateSettingsFlowWithPasswordMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateSettingsFlowWithPasswordMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateSettingsFlowWithPasswordMethod(val *UpdateSettingsFlowWithPasswordMethod) *NullableUpdateSettingsFlowWithPasswordMethod {
	return &NullableUpdateSettingsFlowWithPasswordMethod{value: val, isSet: true}
}

func (v NullableUpdateSettingsFlowWithPasswordMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateSettingsFlowWithPasswordMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


