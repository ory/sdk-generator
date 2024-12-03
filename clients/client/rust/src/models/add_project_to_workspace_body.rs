/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.11
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AddProjectToWorkspaceBody {
    /// The environment of the project in the workspace. Can be one of \"prod\" or \"dev\". Note that the number of projects in the \"prod\" environment is limited depending on the subscription. prod Production stage Staging dev Development
    #[serde(rename = "environment")]
    pub environment: EnvironmentEnum,
    /// The action to take with the project subscription. Can be one of \"migrate\", and \"ignore\". \"migrate\" will migrate the project subscription to the workspace. \"ignore\" will ignore the project subscription. migrate ProjectSubscriptionActionMigrate  ProjectSubscriptionActionMigrate will migrate the project subscription to the  workspace. ignore ProjectSubscriptionActionIgnore  ProjectSubscriptionActionIgnore will ignore the project subscription.
    #[serde(rename = "project_subscription")]
    pub project_subscription: ProjectSubscriptionEnum,
}

impl AddProjectToWorkspaceBody {
    pub fn new(environment: EnvironmentEnum, project_subscription: ProjectSubscriptionEnum) -> AddProjectToWorkspaceBody {
        AddProjectToWorkspaceBody {
            environment,
            project_subscription,
        }
    }
}
/// The environment of the project in the workspace. Can be one of \"prod\" or \"dev\". Note that the number of projects in the \"prod\" environment is limited depending on the subscription. prod Production stage Staging dev Development
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum EnvironmentEnum {
    #[serde(rename = "prod")]
    Prod,
    #[serde(rename = "stage")]
    Stage,
    #[serde(rename = "dev")]
    Dev,
}

impl Default for EnvironmentEnum {
    fn default() -> EnvironmentEnum {
        Self::Prod
    }
}
/// The action to take with the project subscription. Can be one of \"migrate\", and \"ignore\". \"migrate\" will migrate the project subscription to the workspace. \"ignore\" will ignore the project subscription. migrate ProjectSubscriptionActionMigrate  ProjectSubscriptionActionMigrate will migrate the project subscription to the  workspace. ignore ProjectSubscriptionActionIgnore  ProjectSubscriptionActionIgnore will ignore the project subscription.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ProjectSubscriptionEnum {
    #[serde(rename = "migrate")]
    Migrate,
    #[serde(rename = "ignore")]
    Ignore,
}

impl Default for ProjectSubscriptionEnum {
    fn default() -> ProjectSubscriptionEnum {
        Self::Migrate
    }
}

