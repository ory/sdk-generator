=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v1.1.34
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryClient::CreateRecoveryLinkForIdentityBody
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryClient::CreateRecoveryLinkForIdentityBody do
  let(:instance) { OryClient::CreateRecoveryLinkForIdentityBody.new }

  describe 'test an instance of CreateRecoveryLinkForIdentityBody' do
    it 'should create an instance of CreateRecoveryLinkForIdentityBody' do
      expect(instance).to be_instance_of(OryClient::CreateRecoveryLinkForIdentityBody)
    end
  end
  describe 'test attribute "expires_in"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "identity_id"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
