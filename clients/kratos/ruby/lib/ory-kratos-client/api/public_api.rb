=begin
#Ory Kratos

#Welcome to the ORY Kratos HTTP API documentation!

The version of the OpenAPI document: v0.0.0-alpha.31

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

require 'cgi'

module OryHydraClient
  class PublicApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Complete Profile Management Flow
    # This endpoint returns a login request's context with, for example, error details and other information.  For an in-depth look at ORY Krato's profile management flow, head over to: https://www.ory.sh/docs/kratos/selfservice/profile
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def complete_profile_management_flow(opts = {})
      complete_profile_management_flow_with_http_info(opts)
      nil
    end

    # Complete Profile Management Flow
    # This endpoint returns a login request&#39;s context with, for example, error details and other information.  For an in-depth look at ORY Krato&#39;s profile management flow, head over to: https://www.ory.sh/docs/kratos/selfservice/profile
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def complete_profile_management_flow_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.complete_profile_management_flow ...'
      end
      # resource path
      local_var_path = '/profiles'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#complete_profile_management_flow\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get Login Request
    # This endpoint returns a login request's context with, for example, error details and other information.  For an in-depth look at ORY Krato's login flow, head over to: https://www.ory.sh/docs/kratos/selfservice/login
    # @param [Hash] opts the optional parameters
    # @return [LoginRequest]
    def get_login_request(opts = {})
      data, _status_code, _headers = get_login_request_with_http_info(opts)
      data
    end

    # Get Login Request
    # This endpoint returns a login request&#39;s context with, for example, error details and other information.  For an in-depth look at ORY Krato&#39;s login flow, head over to: https://www.ory.sh/docs/kratos/selfservice/login
    # @param [Hash] opts the optional parameters
    # @return [Array<(LoginRequest, Integer, Hash)>] LoginRequest data, response status code and response headers
    def get_login_request_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.get_login_request ...'
      end
      # resource path
      local_var_path = '/auth/browser/requests/login'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'LoginRequest' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#get_login_request\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get Profile Management Request (via cookie)
    # This endpoint returns a profile management request's context with, for example, error details and other information.  It can be used from a Single Page Application or other applications running on a client device. The request must be made with valid authentication cookies or it will fail!  If you wish to access this endpoint without the valid cookies (e.g. as part of a server) please call this path at the admin port.  For an in-depth look at ORY Krato's profile management flow, head over to: https://www.ory.sh/docs/kratos/selfservice/profile
    # @param request [String] Request should be set to the value of the &#x60;request&#x60; query parameter by the profile management UI.
    # @param [Hash] opts the optional parameters
    # @return [ProfileManagementRequest]
    def get_profile_management_request(request, opts = {})
      data, _status_code, _headers = get_profile_management_request_with_http_info(request, opts)
      data
    end

    # Get Profile Management Request (via cookie)
    # This endpoint returns a profile management request&#39;s context with, for example, error details and other information.  It can be used from a Single Page Application or other applications running on a client device. The request must be made with valid authentication cookies or it will fail!  If you wish to access this endpoint without the valid cookies (e.g. as part of a server) please call this path at the admin port.  For an in-depth look at ORY Krato&#39;s profile management flow, head over to: https://www.ory.sh/docs/kratos/selfservice/profile
    # @param request [String] Request should be set to the value of the &#x60;request&#x60; query parameter by the profile management UI.
    # @param [Hash] opts the optional parameters
    # @return [Array<(ProfileManagementRequest, Integer, Hash)>] ProfileManagementRequest data, response status code and response headers
    def get_profile_management_request_with_http_info(request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.get_profile_management_request ...'
      end
      # verify the required parameter 'request' is set
      if @api_client.config.client_side_validation && request.nil?
        fail ArgumentError, "Missing the required parameter 'request' when calling PublicApi.get_profile_management_request"
      end
      # resource path
      local_var_path = '/profiles/requests'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'request'] = request

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'ProfileManagementRequest' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#get_profile_management_request\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get Registration Request
    # This endpoint returns a registration request's context with, for example, error details and other information.  For an in-depth look at ORY Krato's registration flow, head over to: https://www.ory.sh/docs/kratos/selfservice/registration
    # @param [Hash] opts the optional parameters
    # @return [RegistrationRequest]
    def get_registration_request(opts = {})
      data, _status_code, _headers = get_registration_request_with_http_info(opts)
      data
    end

    # Get Registration Request
    # This endpoint returns a registration request&#39;s context with, for example, error details and other information.  For an in-depth look at ORY Krato&#39;s registration flow, head over to: https://www.ory.sh/docs/kratos/selfservice/registration
    # @param [Hash] opts the optional parameters
    # @return [Array<(RegistrationRequest, Integer, Hash)>] RegistrationRequest data, response status code and response headers
    def get_registration_request_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.get_registration_request ...'
      end
      # resource path
      local_var_path = '/auth/browser/requests/registration'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'RegistrationRequest' 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#get_registration_request\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Initialize a Login Flow
    # This endpoint initializes a login flow. This endpoint **should not be called from a programatic API** but instead for the, for example, browser. It will redirect the user agent (e.g. browser) to the configured login UI, appending the login challenge.  If the user-agent already has a valid authentication session, the server will respond with a 302 code redirecting to the config value of `urls.default_return_to`.  For an in-depth look at ORY Krato's login flow, head over to: https://www.ory.sh/docs/kratos/selfservice/login
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def initialize_login_flow(opts = {})
      initialize_login_flow_with_http_info(opts)
      nil
    end

    # Initialize a Login Flow
    # This endpoint initializes a login flow. This endpoint **should not be called from a programatic API** but instead for the, for example, browser. It will redirect the user agent (e.g. browser) to the configured login UI, appending the login challenge.  If the user-agent already has a valid authentication session, the server will respond with a 302 code redirecting to the config value of &#x60;urls.default_return_to&#x60;.  For an in-depth look at ORY Krato&#39;s login flow, head over to: https://www.ory.sh/docs/kratos/selfservice/login
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def initialize_login_flow_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.initialize_login_flow ...'
      end
      # resource path
      local_var_path = '/auth/browser/login'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#initialize_login_flow\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Initialize Profile Management Flow
    # This endpoint initializes a profile update flow. This endpoint **should not be called from a programatic API** but instead for the, for example, browser. It will redirect the user agent (e.g. browser) to the configured login UI, appending the login challenge.  If the user-agent does not have a valid authentication session, a 302 code will be returned which redirects to the initializeLoginFlow endpoint, appending this page as the return_to value.  For an in-depth look at ORY Krato's profile management flow, head over to: https://www.ory.sh/docs/kratos/selfservice/profile
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def initialize_profile_management_flow(opts = {})
      initialize_profile_management_flow_with_http_info(opts)
      nil
    end

    # Initialize Profile Management Flow
    # This endpoint initializes a profile update flow. This endpoint **should not be called from a programatic API** but instead for the, for example, browser. It will redirect the user agent (e.g. browser) to the configured login UI, appending the login challenge.  If the user-agent does not have a valid authentication session, a 302 code will be returned which redirects to the initializeLoginFlow endpoint, appending this page as the return_to value.  For an in-depth look at ORY Krato&#39;s profile management flow, head over to: https://www.ory.sh/docs/kratos/selfservice/profile
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def initialize_profile_management_flow_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.initialize_profile_management_flow ...'
      end
      # resource path
      local_var_path = '/profiles'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#initialize_profile_management_flow\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Initialize a Registration Flow
    # This endpoint initializes a registration flow. This endpoint **should not be called from a programatic API** but instead for the, for example, browser. It will redirect the user agent (e.g. browser) to the configured registration UI, appending the registration challenge.  For an in-depth look at ORY Krato's registration flow, head over to: https://www.ory.sh/docs/kratos/selfservice/registration
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def initialize_registration_flow(opts = {})
      initialize_registration_flow_with_http_info(opts)
      nil
    end

    # Initialize a Registration Flow
    # This endpoint initializes a registration flow. This endpoint **should not be called from a programatic API** but instead for the, for example, browser. It will redirect the user agent (e.g. browser) to the configured registration UI, appending the registration challenge.  For an in-depth look at ORY Krato&#39;s registration flow, head over to: https://www.ory.sh/docs/kratos/selfservice/registration
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def initialize_registration_flow_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PublicApi.initialize_registration_flow ...'
      end
      # resource path
      local_var_path = '/auth/browser/registration'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] 

      # auth_names
      auth_names = opts[:auth_names] || []

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PublicApi#initialize_registration_flow\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
