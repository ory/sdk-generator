/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.31
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CompletedRequest {
    /// RedirectURL is the URL which you should redirect the user to once the authentication process is completed.
    #[serde(rename = "redirect_to")]
    pub redirect_to: String,
}


impl CompletedRequest {
    pub fn new(redirect_to: String) -> CompletedRequest {
        CompletedRequest {
                redirect_to,
        }
    }
}


