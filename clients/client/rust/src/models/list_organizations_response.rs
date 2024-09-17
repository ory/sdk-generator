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

/// ListOrganizationsResponse : B2B SSO Organization List
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ListOrganizationsResponse {
    #[serde(rename = "has_next_page")]
    pub has_next_page: bool,
    #[serde(rename = "next_page_token")]
    pub next_page_token: String,
    /// The list of organizations
    #[serde(rename = "organizations")]
    pub organizations: Vec<models::Organization>,
}

impl ListOrganizationsResponse {
    /// B2B SSO Organization List
    pub fn new(has_next_page: bool, next_page_token: String, organizations: Vec<models::Organization>) -> ListOrganizationsResponse {
        ListOrganizationsResponse {
            has_next_page,
            next_page_token,
            organizations,
        }
    }
}

