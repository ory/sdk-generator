/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.40
 * Contact: hi@ory.am
 * Generated by: https://openapi-generator.tech
 */

/// GetWellKnownForbiddenBody : GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody get well known forbidden body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetWellKnownForbiddenBody {
    /// code
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<i64>,
    /// details
    #[serde(rename = "details", skip_serializing_if = "Option::is_none")]
    pub details: Option<Vec<serde_json::Value>>,
    /// message
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
    /// reason
    #[serde(rename = "reason", skip_serializing_if = "Option::is_none")]
    pub reason: Option<String>,
    /// request
    #[serde(rename = "request", skip_serializing_if = "Option::is_none")]
    pub request: Option<String>,
    /// status
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<String>,
}

impl GetWellKnownForbiddenBody {
    /// GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody GetWellKnownForbiddenBody get well known forbidden body
    pub fn new() -> GetWellKnownForbiddenBody {
        GetWellKnownForbiddenBody {
            code: None,
            details: None,
            message: None,
            reason: None,
            request: None,
            status: None,
        }
    }
}


