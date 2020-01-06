=begin
#ORY Hydra

#Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.

The version of the OpenAPI document: v0.0.0-alpha.34

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

# Common files
require 'ory-hydra-client/api_client'
require 'ory-hydra-client/api_error'
require 'ory-hydra-client/version'
require 'ory-hydra-client/configuration'

# Models
require 'ory-hydra-client/models/accept_consent_request'
require 'ory-hydra-client/models/accept_login_request'
require 'ory-hydra-client/models/completed_request'
require 'ory-hydra-client/models/consent_request'
require 'ory-hydra-client/models/consent_request_session'
require 'ory-hydra-client/models/flush_inactive_o_auth2_tokens_request'
require 'ory-hydra-client/models/generic_error'
require 'ory-hydra-client/models/health_not_ready_status'
require 'ory-hydra-client/models/health_status'
require 'ory-hydra-client/models/json_web_key'
require 'ory-hydra-client/models/json_web_key_set'
require 'ory-hydra-client/models/json_web_key_set_generator_request'
require 'ory-hydra-client/models/login_request'
require 'ory-hydra-client/models/logout_request'
require 'ory-hydra-client/models/o_auth2_client'
require 'ory-hydra-client/models/o_auth2_token_introspection'
require 'ory-hydra-client/models/oauth2_token_response'
require 'ory-hydra-client/models/oauth_token_response'
require 'ory-hydra-client/models/open_id_connect_context'
require 'ory-hydra-client/models/previous_consent_session'
require 'ory-hydra-client/models/reject_request'
require 'ory-hydra-client/models/userinfo_response'
require 'ory-hydra-client/models/version'
require 'ory-hydra-client/models/well_known'

# APIs
require 'ory-hydra-client/api/admin_api'
require 'ory-hydra-client/api/public_api'

module OryHydraClient
  class << self
    # Customize default settings for the SDK using block.
    #   OryHydraClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
