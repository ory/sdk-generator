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
	"time"
)

// checks if the IdentityCredentials type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &IdentityCredentials{}

// IdentityCredentials Credentials represents a specific credential type
type IdentityCredentials struct {
	Config map[string]interface{} `json:"config,omitempty"`
	// CreatedAt is a helper struct field for gobuffalo.pop.
	CreatedAt *time.Time `json:"created_at,omitempty"`
	// Identifiers represents a list of unique identifiers this credential type matches.
	Identifiers []string `json:"identifiers,omitempty"`
	// Type discriminates between different types of credentials. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
	Type *string `json:"type,omitempty"`
	// UpdatedAt is a helper struct field for gobuffalo.pop.
	UpdatedAt *time.Time `json:"updated_at,omitempty"`
	// Version refers to the version of the credential. Useful when changing the config schema.
	Version *int64 `json:"version,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _IdentityCredentials IdentityCredentials

// NewIdentityCredentials instantiates a new IdentityCredentials object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIdentityCredentials() *IdentityCredentials {
	this := IdentityCredentials{}
	return &this
}

// NewIdentityCredentialsWithDefaults instantiates a new IdentityCredentials object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIdentityCredentialsWithDefaults() *IdentityCredentials {
	this := IdentityCredentials{}
	return &this
}

// GetConfig returns the Config field value if set, zero value otherwise.
func (o *IdentityCredentials) GetConfig() map[string]interface{} {
	if o == nil || IsNil(o.Config) {
		var ret map[string]interface{}
		return ret
	}
	return o.Config
}

// GetConfigOk returns a tuple with the Config field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentials) GetConfigOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Config) {
		return map[string]interface{}{}, false
	}
	return o.Config, true
}

// HasConfig returns a boolean if a field has been set.
func (o *IdentityCredentials) HasConfig() bool {
	if o != nil && !IsNil(o.Config) {
		return true
	}

	return false
}

// SetConfig gets a reference to the given map[string]interface{} and assigns it to the Config field.
func (o *IdentityCredentials) SetConfig(v map[string]interface{}) {
	o.Config = v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *IdentityCredentials) GetCreatedAt() time.Time {
	if o == nil || IsNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentials) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CreatedAt) {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *IdentityCredentials) HasCreatedAt() bool {
	if o != nil && !IsNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *IdentityCredentials) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetIdentifiers returns the Identifiers field value if set, zero value otherwise.
func (o *IdentityCredentials) GetIdentifiers() []string {
	if o == nil || IsNil(o.Identifiers) {
		var ret []string
		return ret
	}
	return o.Identifiers
}

// GetIdentifiersOk returns a tuple with the Identifiers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentials) GetIdentifiersOk() ([]string, bool) {
	if o == nil || IsNil(o.Identifiers) {
		return nil, false
	}
	return o.Identifiers, true
}

// HasIdentifiers returns a boolean if a field has been set.
func (o *IdentityCredentials) HasIdentifiers() bool {
	if o != nil && !IsNil(o.Identifiers) {
		return true
	}

	return false
}

// SetIdentifiers gets a reference to the given []string and assigns it to the Identifiers field.
func (o *IdentityCredentials) SetIdentifiers(v []string) {
	o.Identifiers = v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *IdentityCredentials) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentials) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *IdentityCredentials) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *IdentityCredentials) SetType(v string) {
	o.Type = &v
}

// GetUpdatedAt returns the UpdatedAt field value if set, zero value otherwise.
func (o *IdentityCredentials) GetUpdatedAt() time.Time {
	if o == nil || IsNil(o.UpdatedAt) {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentials) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.UpdatedAt) {
		return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *IdentityCredentials) HasUpdatedAt() bool {
	if o != nil && !IsNil(o.UpdatedAt) {
		return true
	}

	return false
}

// SetUpdatedAt gets a reference to the given time.Time and assigns it to the UpdatedAt field.
func (o *IdentityCredentials) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = &v
}

// GetVersion returns the Version field value if set, zero value otherwise.
func (o *IdentityCredentials) GetVersion() int64 {
	if o == nil || IsNil(o.Version) {
		var ret int64
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentials) GetVersionOk() (*int64, bool) {
	if o == nil || IsNil(o.Version) {
		return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *IdentityCredentials) HasVersion() bool {
	if o != nil && !IsNil(o.Version) {
		return true
	}

	return false
}

// SetVersion gets a reference to the given int64 and assigns it to the Version field.
func (o *IdentityCredentials) SetVersion(v int64) {
	o.Version = &v
}

func (o IdentityCredentials) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IdentityCredentials) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Config) {
		toSerialize["config"] = o.Config
	}
	if !IsNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if !IsNil(o.Identifiers) {
		toSerialize["identifiers"] = o.Identifiers
	}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.UpdatedAt) {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	if !IsNil(o.Version) {
		toSerialize["version"] = o.Version
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *IdentityCredentials) UnmarshalJSON(data []byte) (err error) {
	varIdentityCredentials := _IdentityCredentials{}

	err = json.Unmarshal(data, &varIdentityCredentials)

	if err != nil {
		return err
	}

	*o = IdentityCredentials(varIdentityCredentials)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "config")
		delete(additionalProperties, "created_at")
		delete(additionalProperties, "identifiers")
		delete(additionalProperties, "type")
		delete(additionalProperties, "updated_at")
		delete(additionalProperties, "version")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableIdentityCredentials struct {
	value *IdentityCredentials
	isSet bool
}

func (v NullableIdentityCredentials) Get() *IdentityCredentials {
	return v.value
}

func (v *NullableIdentityCredentials) Set(val *IdentityCredentials) {
	v.value = val
	v.isSet = true
}

func (v NullableIdentityCredentials) IsSet() bool {
	return v.isSet
}

func (v *NullableIdentityCredentials) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIdentityCredentials(val *IdentityCredentials) *NullableIdentityCredentials {
	return &NullableIdentityCredentials{value: val, isSet: true}
}

func (v NullableIdentityCredentials) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIdentityCredentials) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


