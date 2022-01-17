# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKratosClient.Model.SelfServiceLoginFlow do
  @moduledoc """
  This object represents a login flow. A login flow is initiated at the \"Initiate Login API / Browser Flow\" endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"active",
    :"created_at",
    :"expires_at",
    :"id",
    :"issued_at",
    :"refresh",
    :"request_url",
    :"requested_aal",
    :"return_to",
    :"type",
    :"ui",
    :"updated_at"
  ]

  @type t :: %__MODULE__{
    :"active" => OryKratosClient.Model.IdentityCredentialsType.t | nil,
    :"created_at" => DateTime.t | nil,
    :"expires_at" => DateTime.t,
    :"id" => String.t,
    :"issued_at" => DateTime.t,
    :"refresh" => boolean() | nil,
    :"request_url" => String.t,
    :"requested_aal" => OryKratosClient.Model.AuthenticatorAssuranceLevel.t | nil,
    :"return_to" => String.t | nil,
    :"type" => String.t,
    :"ui" => OryKratosClient.Model.UiContainer.t,
    :"updated_at" => DateTime.t | nil
  }
end

defimpl Poison.Decoder, for: OryKratosClient.Model.SelfServiceLoginFlow do
  import OryKratosClient.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"active", :struct, OryKratosClient.Model.IdentityCredentialsType, options)
    |> deserialize(:"requested_aal", :struct, OryKratosClient.Model.AuthenticatorAssuranceLevel, options)
    |> deserialize(:"ui", :struct, OryKratosClient.Model.UiContainer, options)
  end
end

