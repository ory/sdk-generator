# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.HealthStatus do
  @moduledoc """
  HealthStatus health status
  """

  @derive [Poison.Encoder]
  defstruct [
    :"status"
  ]

  @type t :: %__MODULE__{
    :"status" => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.HealthStatus do
  def decode(value, _options) do
    value
  end
end

