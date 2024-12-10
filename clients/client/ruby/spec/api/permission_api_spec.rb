=begin
#Ory APIs

## Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

The version of the OpenAPI document: v1.15.15
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
Generator version: 7.7.0

=end

require 'spec_helper'
require 'json'

# Unit tests for OryClient::PermissionApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'PermissionApi' do
  before do
    # run before each test
    @api_instance = OryClient::PermissionApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PermissionApi' do
    it 'should create an instance of PermissionApi' do
      expect(@api_instance).to be_instance_of(OryClient::PermissionApi)
    end
  end

  # unit tests for batch_check_permission
  # Batch check permissions
  # To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :max_depth 
  # @option opts [BatchCheckPermissionBody] :batch_check_permission_body 
  # @return [BatchCheckPermissionResult]
  describe 'batch_check_permission test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for check_permission
  # Check a permission
  # To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
  # @param [Hash] opts the optional parameters
  # @option opts [String] :namespace Namespace of the Relationship
  # @option opts [String] :object Object of the Relationship
  # @option opts [String] :relation Relation of the Relationship
  # @option opts [String] :subject_id SubjectID of the Relationship
  # @option opts [String] :subject_set_namespace Namespace of the Subject Set
  # @option opts [String] :subject_set_object Object of the Subject Set
  # @option opts [String] :subject_set_relation Relation of the Subject Set
  # @option opts [Integer] :max_depth 
  # @return [CheckPermissionResult]
  describe 'check_permission test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for check_permission_or_error
  # Check a permission
  # To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
  # @param [Hash] opts the optional parameters
  # @option opts [String] :namespace Namespace of the Relationship
  # @option opts [String] :object Object of the Relationship
  # @option opts [String] :relation Relation of the Relationship
  # @option opts [String] :subject_id SubjectID of the Relationship
  # @option opts [String] :subject_set_namespace Namespace of the Subject Set
  # @option opts [String] :subject_set_object Object of the Subject Set
  # @option opts [String] :subject_set_relation Relation of the Subject Set
  # @option opts [Integer] :max_depth 
  # @return [CheckPermissionResult]
  describe 'check_permission_or_error test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for expand_permissions
  # Expand a Relationship into permissions.
  # Use this endpoint to expand a relationship tuple into permissions.
  # @param namespace Namespace of the Subject Set
  # @param object Object of the Subject Set
  # @param relation Relation of the Subject Set
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :max_depth 
  # @return [ExpandedPermissionTree]
  describe 'expand_permissions test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for post_check_permission
  # Check a permission
  # To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :max_depth 
  # @option opts [PostCheckPermissionBody] :post_check_permission_body 
  # @return [CheckPermissionResult]
  describe 'post_check_permission test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for post_check_permission_or_error
  # Check a permission
  # To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :max_depth 
  # @option opts [PostCheckPermissionOrErrorBody] :post_check_permission_or_error_body 
  # @return [CheckPermissionResult]
  describe 'post_check_permission_or_error test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
