# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.ConsentRequestSession do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"access_token",
    :"id_token"
  ]

  @type t :: %__MODULE__{
    :"access_token" => %{optional(String.t) => map()} | nil,
    :"id_token" => %{optional(String.t) => map()} | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.ConsentRequestSession do
  def decode(value, _options) do
    value
  end
end

