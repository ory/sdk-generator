# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.NormalizedProjectRevisionSamlProvider do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :client_id,
    :client_secret,
    :created_at,
    :id,
    :label,
    :mapper_url,
    :organization_id,
    :project_revision_id,
    :provider_id,
    :raw_idp_metadata_xml,
    :state,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :client_id => String.t | nil,
    :client_secret => String.t | nil,
    :created_at => DateTime.t | nil,
    :id => String.t | nil,
    :label => String.t | nil,
    :mapper_url => String.t | nil,
    :organization_id => String.t | nil,
    :project_revision_id => String.t | nil,
    :provider_id => String.t | nil,
    :raw_idp_metadata_xml => String.t | nil,
    :state => String.t | nil,
    :updated_at => DateTime.t | nil
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:created_at, :datetime, nil)
     |> Deserializer.deserialize(:updated_at, :datetime, nil)
  end
end
