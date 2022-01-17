# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKratosClient.Model.AuthenticatorAssuranceLevel do
  @moduledoc """
  The authenticator assurance level can be one of \"aal1\", \"aal2\", or \"aal3\". A higher number means that it is harder for an attacker to compromise the account.  Generally, \"aal1\" implies that one authentication factor was used while AAL2 implies that two factors (e.g. password + TOTP) have been used.  To learn more about these levels please head over to: https://www.ory.sh/kratos/docs/concepts/credentials
  """

  @derive [Poison.Encoder]
  defstruct [
    
  ]

  @type t :: %__MODULE__{
    
  }
end

defimpl Poison.Decoder, for: OryKratosClient.Model.AuthenticatorAssuranceLevel do
  def decode(value, _options) do
    value
  end
end

