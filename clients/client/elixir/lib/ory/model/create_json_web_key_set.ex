# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.CreateJsonWebKeySet do
  @moduledoc """
  Create JSON Web Key Set Request Body
  """

  @derive [Poison.Encoder]
  defstruct [
    :alg,
    :kid,
    :use
  ]

  @type t :: %__MODULE__{
    :alg => String.t,
    :kid => String.t,
    :use => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.CreateJsonWebKeySet do
  def decode(value, _options) do
    value
  end
end
