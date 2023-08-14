# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.ContinueWithVerificationUiFlow do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :id,
    :url,
    :verifiable_address
  ]

  @type t :: %__MODULE__{
    :id => String.t,
    :url => String.t | nil,
    :verifiable_address => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.ContinueWithVerificationUiFlow do
  def decode(value, _options) do
    value
  end
end
