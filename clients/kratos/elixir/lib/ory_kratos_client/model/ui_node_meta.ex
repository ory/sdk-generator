# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKratosClient.Model.UiNodeMeta do
  @moduledoc """
  This might include a label and other information that can optionally be used to render UIs.
  """

  @derive [Poison.Encoder]
  defstruct [
    :"label"
  ]

  @type t :: %__MODULE__{
    :"label" => OryKratosClient.Model.UiText.t | nil
  }
end

defimpl Poison.Decoder, for: OryKratosClient.Model.UiNodeMeta do
  import OryKratosClient.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"label", :struct, OryKratosClient.Model.UiText, options)
  end
end

