/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.5
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// IdentityCredentials : Credentials represents a specific credential type
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IdentityCredentials {
    #[serde(rename = "config", skip_serializing_if = "Option::is_none")]
    pub config: Option<serde_json::Value>,
    /// CreatedAt is a helper struct field for gobuffalo.pop.
    #[serde(rename = "created_at", skip_serializing_if = "Option::is_none")]
    pub created_at: Option<String>,
    /// Identifiers represents a list of unique identifiers this credential type matches.
    #[serde(rename = "identifiers", skip_serializing_if = "Option::is_none")]
    pub identifiers: Option<Vec<String>>,
    /// Type discriminates between different types of credentials. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<TypeEnum>,
    /// UpdatedAt is a helper struct field for gobuffalo.pop.
    #[serde(rename = "updated_at", skip_serializing_if = "Option::is_none")]
    pub updated_at: Option<String>,
    /// Version refers to the version of the credential. Useful when changing the config schema.
    #[serde(rename = "version", skip_serializing_if = "Option::is_none")]
    pub version: Option<i64>,
}

impl IdentityCredentials {
    /// Credentials represents a specific credential type
    pub fn new() -> IdentityCredentials {
        IdentityCredentials {
            config: None,
            created_at: None,
            identifiers: None,
            r#type: None,
            updated_at: None,
            version: None,
        }
    }
}
/// Type discriminates between different types of credentials. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TypeEnum {
    #[serde(rename = "password")]
    Password,
    #[serde(rename = "oidc")]
    Oidc,
    #[serde(rename = "totp")]
    Totp,
    #[serde(rename = "lookup_secret")]
    LookupSecret,
    #[serde(rename = "webauthn")]
    Webauthn,
    #[serde(rename = "code")]
    Code,
    #[serde(rename = "passkey")]
    Passkey,
    #[serde(rename = "profile")]
    Profile,
    #[serde(rename = "link_recovery")]
    LinkRecovery,
    #[serde(rename = "code_recovery")]
    CodeRecovery,
}

impl Default for TypeEnum {
    fn default() -> TypeEnum {
        Self::Password
    }
}

