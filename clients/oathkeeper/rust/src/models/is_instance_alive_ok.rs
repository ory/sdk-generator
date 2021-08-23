/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.40
 * Contact: hi@ory.am
 * Generated by: https://openapi-generator.tech
 */

/// IsInstanceAliveOk : healthStatus



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct IsInstanceAliveOk {
    #[serde(rename = "Payload", skip_serializing_if = "Option::is_none")]
    pub payload: Option<Box<crate::models::SwaggerHealthStatus>>,
}

impl IsInstanceAliveOk {
    /// healthStatus
    pub fn new() -> IsInstanceAliveOk {
        IsInstanceAliveOk {
            payload: None,
        }
    }
}


