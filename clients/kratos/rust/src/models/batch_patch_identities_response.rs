/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.1
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// BatchPatchIdentitiesResponse : Patch identities response



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct BatchPatchIdentitiesResponse {
    /// The patch responses for the individual identities.
    #[serde(rename = "identities", skip_serializing_if = "Option::is_none")]
    pub identities: Option<Vec<crate::models::IdentityPatchResponse>>,
}

impl Default for BatchPatchIdentitiesResponse {
    fn default() -> Self {
        Self::new()
    }
}

impl BatchPatchIdentitiesResponse {
    /// Patch identities response
    pub fn new() -> BatchPatchIdentitiesResponse {
        BatchPatchIdentitiesResponse {
                identities: None,
        }
    }
}

