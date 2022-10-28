# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.GetNamespacesResponse do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :namespaces
  ]

  @type t :: %__MODULE__{
    :namespaces => [Ory.Model.Namespace.t] | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.GetNamespacesResponse do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:namespaces, :list, Ory.Model.Namespace, options)
  end
end
