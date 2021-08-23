/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.40
 * Contact: hi@ory.am
 * Generated by: https://openapi-generator.tech
 */

/// GetRuleInternalServerError : The standard error format



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct GetRuleInternalServerError {
    #[serde(rename = "Payload", skip_serializing_if = "Option::is_none")]
    pub payload: Option<Box<crate::models::GetRuleInternalServerErrorBody>>,
}

impl GetRuleInternalServerError {
    /// The standard error format
    pub fn new() -> GetRuleInternalServerError {
        GetRuleInternalServerError {
            payload: None,
        }
    }
}


