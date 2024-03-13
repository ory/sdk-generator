/*
 * Ory Hydra API
 *
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v2.2.0
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct VerifiableCredentialProof {
    #[serde(rename = "jwt", skip_serializing_if = "Option::is_none")]
    pub jwt: Option<String>,
    #[serde(rename = "proof_type", skip_serializing_if = "Option::is_none")]
    pub proof_type: Option<String>,
}

impl Default for VerifiableCredentialProof {
    fn default() -> Self {
        Self::new()
    }
}

impl VerifiableCredentialProof {
    pub fn new() -> VerifiableCredentialProof {
        VerifiableCredentialProof {
                jwt: None,
                proof_type: None,
        }
    }
}


