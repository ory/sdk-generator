# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKratosClient.Model.SelfServiceFlowExpiredError do
  @moduledoc """
  Is sent when a flow is expired
  """

  @derive [Poison.Encoder]
  defstruct [
    :"code",
    :"debug",
    :"details",
    :"id",
    :"message",
    :"reason",
    :"request",
    :"since",
    :"status",
    :"use_flow_id"
  ]

  @type t :: %__MODULE__{
    :"code" => integer() | nil,
    :"debug" => String.t | nil,
    :"details" => %{optional(String.t) => map()} | nil,
    :"id" => String.t | nil,
    :"message" => String.t,
    :"reason" => String.t | nil,
    :"request" => String.t | nil,
    :"since" => integer() | nil,
    :"status" => String.t | nil,
    :"use_flow_id" => String.t | nil
  }
end

defimpl Poison.Decoder, for: OryKratosClient.Model.SelfServiceFlowExpiredError do
  def decode(value, _options) do
    value
  end
end

