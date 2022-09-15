/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v0.2.0-alpha.46
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// SubmitSelfServiceLoginFlowWithWebAuthnMethodBody struct for SubmitSelfServiceLoginFlowWithWebAuthnMethodBody
type SubmitSelfServiceLoginFlowWithWebAuthnMethodBody struct {
	// Sending the anti-csrf token is only required for browser login flows.
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Identifier is the email or username of the user trying to log in.
	Identifier string `json:"identifier"`
	// Method should be set to \"webAuthn\" when logging in using the WebAuthn strategy.
	Method string `json:"method"`
	// Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
	WebauthnLogin *string `json:"webauthn_login,omitempty"`
}

// NewSubmitSelfServiceLoginFlowWithWebAuthnMethodBody instantiates a new SubmitSelfServiceLoginFlowWithWebAuthnMethodBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSubmitSelfServiceLoginFlowWithWebAuthnMethodBody(identifier string, method string) *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody {
	this := SubmitSelfServiceLoginFlowWithWebAuthnMethodBody{}
	this.Identifier = identifier
	this.Method = method
	return &this
}

// NewSubmitSelfServiceLoginFlowWithWebAuthnMethodBodyWithDefaults instantiates a new SubmitSelfServiceLoginFlowWithWebAuthnMethodBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSubmitSelfServiceLoginFlowWithWebAuthnMethodBodyWithDefaults() *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody {
	this := SubmitSelfServiceLoginFlowWithWebAuthnMethodBody{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetCsrfToken() string {
	if o == nil || o.CsrfToken == nil {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetCsrfTokenOk() (*string, bool) {
	if o == nil || o.CsrfToken == nil {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) HasCsrfToken() bool {
	if o != nil && o.CsrfToken != nil {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetIdentifier returns the Identifier field value
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetIdentifier() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Identifier
}

// GetIdentifierOk returns a tuple with the Identifier field value
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetIdentifierOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Identifier, true
}

// SetIdentifier sets field value
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) SetIdentifier(v string) {
	o.Identifier = v
}

// GetMethod returns the Method field value
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) SetMethod(v string) {
	o.Method = v
}

// GetWebauthnLogin returns the WebauthnLogin field value if set, zero value otherwise.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetWebauthnLogin() string {
	if o == nil || o.WebauthnLogin == nil {
		var ret string
		return ret
	}
	return *o.WebauthnLogin
}

// GetWebauthnLoginOk returns a tuple with the WebauthnLogin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) GetWebauthnLoginOk() (*string, bool) {
	if o == nil || o.WebauthnLogin == nil {
		return nil, false
	}
	return o.WebauthnLogin, true
}

// HasWebauthnLogin returns a boolean if a field has been set.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) HasWebauthnLogin() bool {
	if o != nil && o.WebauthnLogin != nil {
		return true
	}

	return false
}

// SetWebauthnLogin gets a reference to the given string and assigns it to the WebauthnLogin field.
func (o *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) SetWebauthnLogin(v string) {
	o.WebauthnLogin = &v
}

func (o SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CsrfToken != nil {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	if true {
		toSerialize["identifier"] = o.Identifier
	}
	if true {
		toSerialize["method"] = o.Method
	}
	if o.WebauthnLogin != nil {
		toSerialize["webauthn_login"] = o.WebauthnLogin
	}
	return json.Marshal(toSerialize)
}

type NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody struct {
	value *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody
	isSet bool
}

func (v NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody) Get() *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody {
	return v.value
}

func (v *NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody) Set(val *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) {
	v.value = val
	v.isSet = true
}

func (v NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody) IsSet() bool {
	return v.isSet
}

func (v *NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody(val *SubmitSelfServiceLoginFlowWithWebAuthnMethodBody) *NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody {
	return &NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody{value: val, isSet: true}
}

func (v NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubmitSelfServiceLoginFlowWithWebAuthnMethodBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


