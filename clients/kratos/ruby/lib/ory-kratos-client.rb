=begin
#Ory Kratos

#Welcome to the ORY Kratos HTTP API documentation!

The version of the OpenAPI document: v0.0.0-alpha.i+1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

# Common files
require 'ory-kratos-client/api_client'
require 'ory-kratos-client/api_error'
require 'ory-kratos-client/version'
require 'ory-kratos-client/configuration'

# Models
require 'ory-kratos-client/models/error'
require 'ory-kratos-client/models/form'
require 'ory-kratos-client/models/form_field'
require 'ory-kratos-client/models/generic_error'
require 'ory-kratos-client/models/health_not_ready_status'
require 'ory-kratos-client/models/health_status'
require 'ory-kratos-client/models/identity'
require 'ory-kratos-client/models/login_request'
require 'ory-kratos-client/models/login_request_method'
require 'ory-kratos-client/models/login_request_method_config'
require 'ory-kratos-client/models/oidc_strategy_credentials_config'
require 'ory-kratos-client/models/oidc_strategy_request_method'
require 'ory-kratos-client/models/profile_management_request'
require 'ory-kratos-client/models/registration_request'
require 'ory-kratos-client/models/registration_request_method'
require 'ory-kratos-client/models/registration_request_method_config'
require 'ory-kratos-client/models/version'

# APIs
require 'ory-kratos-client/api/health_api'
require 'ory-kratos-client/api/public_api'
require 'ory-kratos-client/api/version_api'

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
