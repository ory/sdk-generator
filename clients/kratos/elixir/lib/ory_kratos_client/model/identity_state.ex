# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKratosClient.Model.IdentityState do
  @moduledoc """
  The state can either be `active` or `inactive`.
  """

  @derive [Poison.Encoder]
  defstruct [
    
  ]

  @type t :: %__MODULE__{
    
  }
end

defimpl Poison.Decoder, for: OryKratosClient.Model.IdentityState do
  def decode(value, _options) do
    value
  end
end

