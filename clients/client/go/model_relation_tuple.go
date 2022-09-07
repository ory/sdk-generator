/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v0.2.0-alpha.31
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// RelationTuple struct for RelationTuple
type RelationTuple struct {
	// Namespace of the Relation Tuple
	Namespace string `json:"namespace"`
	// Object of the Relation Tuple
	Object string `json:"object"`
	// Relation of the Relation Tuple
	Relation string `json:"relation"`
	// SubjectID of the Relation Tuple  Either SubjectSet or SubjectID can be provided.
	SubjectId *string `json:"subject_id,omitempty"`
	SubjectSet *SubjectSet `json:"subject_set,omitempty"`
}

// NewRelationTuple instantiates a new RelationTuple object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRelationTuple(namespace string, object string, relation string) *RelationTuple {
	this := RelationTuple{}
	this.Namespace = namespace
	this.Object = object
	this.Relation = relation
	return &this
}

// NewRelationTupleWithDefaults instantiates a new RelationTuple object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRelationTupleWithDefaults() *RelationTuple {
	this := RelationTuple{}
	return &this
}

// GetNamespace returns the Namespace field value
func (o *RelationTuple) GetNamespace() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Namespace
}

// GetNamespaceOk returns a tuple with the Namespace field value
// and a boolean to check if the value has been set.
func (o *RelationTuple) GetNamespaceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Namespace, true
}

// SetNamespace sets field value
func (o *RelationTuple) SetNamespace(v string) {
	o.Namespace = v
}

// GetObject returns the Object field value
func (o *RelationTuple) GetObject() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Object
}

// GetObjectOk returns a tuple with the Object field value
// and a boolean to check if the value has been set.
func (o *RelationTuple) GetObjectOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Object, true
}

// SetObject sets field value
func (o *RelationTuple) SetObject(v string) {
	o.Object = v
}

// GetRelation returns the Relation field value
func (o *RelationTuple) GetRelation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Relation
}

// GetRelationOk returns a tuple with the Relation field value
// and a boolean to check if the value has been set.
func (o *RelationTuple) GetRelationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Relation, true
}

// SetRelation sets field value
func (o *RelationTuple) SetRelation(v string) {
	o.Relation = v
}

// GetSubjectId returns the SubjectId field value if set, zero value otherwise.
func (o *RelationTuple) GetSubjectId() string {
	if o == nil || o.SubjectId == nil {
		var ret string
		return ret
	}
	return *o.SubjectId
}

// GetSubjectIdOk returns a tuple with the SubjectId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationTuple) GetSubjectIdOk() (*string, bool) {
	if o == nil || o.SubjectId == nil {
		return nil, false
	}
	return o.SubjectId, true
}

// HasSubjectId returns a boolean if a field has been set.
func (o *RelationTuple) HasSubjectId() bool {
	if o != nil && o.SubjectId != nil {
		return true
	}

	return false
}

// SetSubjectId gets a reference to the given string and assigns it to the SubjectId field.
func (o *RelationTuple) SetSubjectId(v string) {
	o.SubjectId = &v
}

// GetSubjectSet returns the SubjectSet field value if set, zero value otherwise.
func (o *RelationTuple) GetSubjectSet() SubjectSet {
	if o == nil || o.SubjectSet == nil {
		var ret SubjectSet
		return ret
	}
	return *o.SubjectSet
}

// GetSubjectSetOk returns a tuple with the SubjectSet field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationTuple) GetSubjectSetOk() (*SubjectSet, bool) {
	if o == nil || o.SubjectSet == nil {
		return nil, false
	}
	return o.SubjectSet, true
}

// HasSubjectSet returns a boolean if a field has been set.
func (o *RelationTuple) HasSubjectSet() bool {
	if o != nil && o.SubjectSet != nil {
		return true
	}

	return false
}

// SetSubjectSet gets a reference to the given SubjectSet and assigns it to the SubjectSet field.
func (o *RelationTuple) SetSubjectSet(v SubjectSet) {
	o.SubjectSet = &v
}

func (o RelationTuple) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["namespace"] = o.Namespace
	}
	if true {
		toSerialize["object"] = o.Object
	}
	if true {
		toSerialize["relation"] = o.Relation
	}
	if o.SubjectId != nil {
		toSerialize["subject_id"] = o.SubjectId
	}
	if o.SubjectSet != nil {
		toSerialize["subject_set"] = o.SubjectSet
	}
	return json.Marshal(toSerialize)
}

type NullableRelationTuple struct {
	value *RelationTuple
	isSet bool
}

func (v NullableRelationTuple) Get() *RelationTuple {
	return v.value
}

func (v *NullableRelationTuple) Set(val *RelationTuple) {
	v.value = val
	v.isSet = true
}

func (v NullableRelationTuple) IsSet() bool {
	return v.isSet
}

func (v *NullableRelationTuple) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRelationTuple(val *RelationTuple) *NullableRelationTuple {
	return &NullableRelationTuple{value: val, isSet: true}
}

func (v NullableRelationTuple) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRelationTuple) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


