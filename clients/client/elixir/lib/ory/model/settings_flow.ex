# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.SettingsFlow do
  @moduledoc """
  This flow is used when an identity wants to update settings (e.g. profile data, passwords, ...) in a selfservice manner.  We recommend reading the [User Settings Documentation](../self-service/flows/user-settings)
  """

  @derive Jason.Encoder
  defstruct [
    :active,
    :continue_with,
    :expires_at,
    :id,
    :identity,
    :issued_at,
    :request_url,
    :return_to,
    :state,
    :transient_payload,
    :type,
    :ui
  ]

  @type t :: %__MODULE__{
    :active => String.t | nil,
    :continue_with => [Ory.Model.ContinueWith.t] | nil,
    :expires_at => DateTime.t,
    :id => String.t,
    :identity => Ory.Model.Identity.t,
    :issued_at => DateTime.t,
    :request_url => String.t,
    :return_to => String.t | nil,
    :state => any() | nil,
    :transient_payload => map() | nil,
    :type => String.t,
    :ui => Ory.Model.UiContainer.t
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:continue_with, :list, Ory.Model.ContinueWith)
     |> Deserializer.deserialize(:expires_at, :datetime, nil)
     |> Deserializer.deserialize(:identity, :struct, Ory.Model.Identity)
     |> Deserializer.deserialize(:issued_at, :datetime, nil)
     |> Deserializer.deserialize(:ui, :struct, Ory.Model.UiContainer)
  end
end

