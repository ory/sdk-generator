# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.GetProjectMetricsResponse do
  @moduledoc """
  Response of the getMetrics endpoint
  """

  @derive [Poison.Encoder]
  defstruct [
    :data
  ]

  @type t :: %__MODULE__{
    :data => [Ory.Model.MetricsDatapoint.t]
  }
end

defimpl Poison.Decoder, for: Ory.Model.GetProjectMetricsResponse do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:data, :list, Ory.Model.MetricsDatapoint, options)
  end
end

