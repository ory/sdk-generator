# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryOathkeeperClient.Model.JsonWebKeySet do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"keys"
  ]

  @type t :: %__MODULE__{
    :"keys" => [OryOathkeeperClient.Model.JsonWebKey.t] | nil
  }
end

defimpl Poison.Decoder, for: OryOathkeeperClient.Model.JsonWebKeySet do
  import OryOathkeeperClient.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"keys", :list, OryOathkeeperClient.Model.JsonWebKey, options)
  end
end

