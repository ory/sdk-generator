# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.UpdateLoginFlowWithPasskeyMethod do
  @moduledoc """
  Update Login Flow with Passkey Method
  """

  @derive Jason.Encoder
  defstruct [
    :csrf_token,
    :method,
    :passkey_login
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :method => String.t,
    :passkey_login => String.t | nil
  }

  def decode(value) do
    value
  end
end
