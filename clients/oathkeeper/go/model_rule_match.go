/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * API version: v0.39.0
 * Contact: hi@ory.am
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// RuleMatch struct for RuleMatch
type RuleMatch struct {
	// An array of HTTP methods (e.g. GET, POST, PUT, DELETE, ...). When ORY Oathkeeper searches for rules to decide what to do with an incoming request to the proxy server, it compares the HTTP method of the incoming request with the HTTP methods of each rules. If a match is found, the rule is considered a partial match. If the matchesUrl field is satisfied as well, the rule is considered a full match.
	Methods []string `json:"methods,omitempty"`
	// This field represents the URL pattern this rule matches. When ORY Oathkeeper searches for rules to decide what to do with an incoming request to the proxy server, it compares the full request URL (e.g. https://mydomain.com/api/resource) without query parameters of the incoming request with this field. If a match is found, the rule is considered a partial match. If the matchesMethods field is satisfied as well, the rule is considered a full match.  You can use regular expressions in this field to match more than one url. Regular expressions are encapsulated in brackets < and >. The following example matches all paths of the domain `mydomain.com`: `https://mydomain.com/<.*>`.
	Url *string `json:"url,omitempty"`
}

// NewRuleMatch instantiates a new RuleMatch object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRuleMatch() *RuleMatch {
	this := RuleMatch{}
	return &this
}

// NewRuleMatchWithDefaults instantiates a new RuleMatch object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRuleMatchWithDefaults() *RuleMatch {
	this := RuleMatch{}
	return &this
}

// GetMethods returns the Methods field value if set, zero value otherwise.
func (o *RuleMatch) GetMethods() []string {
	if o == nil || o.Methods == nil {
		var ret []string
		return ret
	}
	return o.Methods
}

// GetMethodsOk returns a tuple with the Methods field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RuleMatch) GetMethodsOk() ([]string, bool) {
	if o == nil || o.Methods == nil {
		return nil, false
	}
	return o.Methods, true
}

// HasMethods returns a boolean if a field has been set.
func (o *RuleMatch) HasMethods() bool {
	if o != nil && o.Methods != nil {
		return true
	}

	return false
}

// SetMethods gets a reference to the given []string and assigns it to the Methods field.
func (o *RuleMatch) SetMethods(v []string) {
	o.Methods = v
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *RuleMatch) GetUrl() string {
	if o == nil || o.Url == nil {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RuleMatch) GetUrlOk() (*string, bool) {
	if o == nil || o.Url == nil {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *RuleMatch) HasUrl() bool {
	if o != nil && o.Url != nil {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *RuleMatch) SetUrl(v string) {
	o.Url = &v
}

func (o RuleMatch) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Methods != nil {
		toSerialize["methods"] = o.Methods
	}
	if o.Url != nil {
		toSerialize["url"] = o.Url
	}
	return json.Marshal(toSerialize)
}

type NullableRuleMatch struct {
	value *RuleMatch
	isSet bool
}

func (v NullableRuleMatch) Get() *RuleMatch {
	return v.value
}

func (v *NullableRuleMatch) Set(val *RuleMatch) {
	v.value = val
	v.isSet = true
}

func (v NullableRuleMatch) IsSet() bool {
	return v.isSet
}

func (v *NullableRuleMatch) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRuleMatch(val *RuleMatch) *NullableRuleMatch {
	return &NullableRuleMatch{value: val, isSet: true}
}

func (v NullableRuleMatch) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRuleMatch) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


