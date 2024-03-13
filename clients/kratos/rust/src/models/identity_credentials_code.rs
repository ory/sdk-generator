/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.1.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// IdentityCredentialsCode : CredentialsCode represents a one time login/registration code



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct IdentityCredentialsCode {
    /// The type of the address for this code
    #[serde(rename = "address_type", skip_serializing_if = "Option::is_none")]
    pub address_type: Option<String>,
    #[serde(rename = "used_at", skip_serializing_if = "Option::is_none")]
    pub used_at: Option<String>,
}

impl Default for IdentityCredentialsCode {
    fn default() -> Self {
        Self::new()
    }
}

impl IdentityCredentialsCode {
    /// CredentialsCode represents a one time login/registration code
    pub fn new() -> IdentityCredentialsCode {
        IdentityCredentialsCode {
                address_type: None,
                used_at: None,
        }
    }
}


