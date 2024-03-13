# NOTE: This file is auto generated by OpenAPI Generator 7.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.UpdateRecoveryFlowWithLinkMethod do
  @moduledoc """
  Update Recovery Flow with Link Method
  """

  @derive Jason.Encoder
  defstruct [
    :csrf_token,
    :email,
    :method
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :email => String.t,
    :method => String.t
  }

  def decode(value) do
    value
  end
end

