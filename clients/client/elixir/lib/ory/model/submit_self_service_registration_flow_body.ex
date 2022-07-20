# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.SubmitSelfServiceRegistrationFlowBody do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :csrf_token,
    :method,
    :password,
    :traits,
    :provider,
    :webauthn_register,
    :webauthn_register_displayname
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :method => String.t,
    :password => String.t,
    :traits => map(),
    :provider => String.t,
    :webauthn_register => String.t | nil,
    :webauthn_register_displayname => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.SubmitSelfServiceRegistrationFlowBody do
  def decode(value, _options) do
    value
  end
end
