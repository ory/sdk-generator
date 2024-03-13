# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.IdentityCredentialsOidcProvider do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :initial_access_token,
    :initial_id_token,
    :initial_refresh_token,
    :organization,
    :provider,
    :subject
  ]

  @type t :: %__MODULE__{
    :initial_access_token => String.t | nil,
    :initial_id_token => String.t | nil,
    :initial_refresh_token => String.t | nil,
    :organization => String.t | nil,
    :provider => String.t | nil,
    :subject => String.t | nil
  }

  def decode(value) do
    value
  end
end

