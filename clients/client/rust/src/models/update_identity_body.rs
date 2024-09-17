/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.15.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// UpdateIdentityBody : Update Identity Body
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateIdentityBody {
    #[serde(rename = "credentials", skip_serializing_if = "Option::is_none")]
    pub credentials: Option<Box<models::IdentityWithCredentials>>,
    /// Store metadata about the user which is only accessible through admin APIs such as `GET /admin/identities/<id>`.
    #[serde(rename = "metadata_admin", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub metadata_admin: Option<Option<serde_json::Value>>,
    /// Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
    #[serde(rename = "metadata_public", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub metadata_public: Option<Option<serde_json::Value>>,
    /// SchemaID is the ID of the JSON Schema to be used for validating the identity's traits. If set will update the Identity's SchemaID.
    #[serde(rename = "schema_id")]
    pub schema_id: String,
    /// State is the identity's state. active StateActive inactive StateInactive
    #[serde(rename = "state")]
    pub state: StateEnum,
    /// Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_id`.
    #[serde(rename = "traits")]
    pub traits: serde_json::Value,
}

impl UpdateIdentityBody {
    /// Update Identity Body
    pub fn new(schema_id: String, state: StateEnum, traits: serde_json::Value) -> UpdateIdentityBody {
        UpdateIdentityBody {
            credentials: None,
            metadata_admin: None,
            metadata_public: None,
            schema_id,
            state,
            traits,
        }
    }
}
/// State is the identity's state. active StateActive inactive StateInactive
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum StateEnum {
    #[serde(rename = "active")]
    Active,
    #[serde(rename = "inactive")]
    Inactive,
}

impl Default for StateEnum {
    fn default() -> StateEnum {
        Self::Active
    }
}

