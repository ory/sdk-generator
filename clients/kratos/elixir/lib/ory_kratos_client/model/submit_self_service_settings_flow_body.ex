# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OryKratosClient.Model.SubmitSelfServiceSettingsFlowBody do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"csrf_token",
    :"method",
    :"password",
    :"traits",
    :"flow",
    :"link",
    :"unlink",
    :"totp_code",
    :"totp_unlink"
  ]

  @type t :: %__MODULE__{
    :"csrf_token" => String.t | nil,
    :"method" => String.t,
    :"password" => String.t,
    :"traits" => map(),
    :"flow" => String.t | nil,
    :"link" => String.t | nil,
    :"unlink" => String.t | nil,
    :"totp_code" => String.t | nil,
    :"totp_unlink" => boolean() | nil
  }
end

defimpl Poison.Decoder, for: OryKratosClient.Model.SubmitSelfServiceSettingsFlowBody do
  def decode(value, _options) do
    value
  end
end

