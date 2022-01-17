# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKratosClient.Model.SessionAuthenticationMethod do
  @moduledoc """
  A singular authenticator used during authentication / login.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"completed_at",
    :"method"
  ]

  @type t :: %__MODULE__{
    :"completed_at" => DateTime.t | nil,
    :"method" => String.t | nil
  }
end

defimpl Poison.Decoder, for: OryKratosClient.Model.SessionAuthenticationMethod do
  def decode(value, _options) do
    value
  end
end

