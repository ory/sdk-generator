# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.Rule do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"authenticators",
    :"authorizer",
    :"description",
    :"id",
    :"match",
    :"mutators",
    :"upstream"
  ]

  @type t :: %__MODULE__{
    :"authenticators" => [Ory.Model.RuleHandler.t] | nil,
    :"authorizer" => Ory.Model.RuleHandler.t | nil,
    :"description" => String.t | nil,
    :"id" => String.t | nil,
    :"match" => Ory.Model.RuleMatch.t | nil,
    :"mutators" => [Ory.Model.RuleHandler.t] | nil,
    :"upstream" => Ory.Model.Upstream.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.Rule do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"authenticators", :list, Ory.Model.RuleHandler, options)
    |> deserialize(:"authorizer", :struct, Ory.Model.RuleHandler, options)
    |> deserialize(:"match", :struct, Ory.Model.RuleMatch, options)
    |> deserialize(:"mutators", :list, Ory.Model.RuleHandler, options)
    |> deserialize(:"upstream", :struct, Ory.Model.Upstream, options)
  end
end

