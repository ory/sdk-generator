# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.UpdateLoginFlowWithOidcMethod do
  @moduledoc """
  Update Login Flow with OpenID Connect Method
  """

  @derive Jason.Encoder
  defstruct [
    :csrf_token,
    :id_token,
    :id_token_nonce,
    :method,
    :provider,
    :traits,
    :upstream_parameters
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :id_token => String.t | nil,
    :id_token_nonce => String.t | nil,
    :method => String.t,
    :provider => String.t,
    :traits => map() | nil,
    :upstream_parameters => map() | nil
  }

  def decode(value) do
    value
  end
end

