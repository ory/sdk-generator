/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.15
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// ClientRegistrationFlow
    /// </summary>
    [DataContract(Name = "registrationFlow")]
    public partial class ClientRegistrationFlow : IValidatableObject
    {
        /// <summary>
        /// Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
        /// </summary>
        /// <value>Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ActiveEnum
        {
            /// <summary>
            /// Enum Password for value: password
            /// </summary>
            [EnumMember(Value = "password")]
            Password = 1,

            /// <summary>
            /// Enum Oidc for value: oidc
            /// </summary>
            [EnumMember(Value = "oidc")]
            Oidc = 2,

            /// <summary>
            /// Enum Totp for value: totp
            /// </summary>
            [EnumMember(Value = "totp")]
            Totp = 3,

            /// <summary>
            /// Enum LookupSecret for value: lookup_secret
            /// </summary>
            [EnumMember(Value = "lookup_secret")]
            LookupSecret = 4,

            /// <summary>
            /// Enum Webauthn for value: webauthn
            /// </summary>
            [EnumMember(Value = "webauthn")]
            Webauthn = 5,

            /// <summary>
            /// Enum Code for value: code
            /// </summary>
            [EnumMember(Value = "code")]
            Code = 6,

            /// <summary>
            /// Enum Passkey for value: passkey
            /// </summary>
            [EnumMember(Value = "passkey")]
            Passkey = 7,

            /// <summary>
            /// Enum Profile for value: profile
            /// </summary>
            [EnumMember(Value = "profile")]
            Profile = 8,

            /// <summary>
            /// Enum LinkRecovery for value: link_recovery
            /// </summary>
            [EnumMember(Value = "link_recovery")]
            LinkRecovery = 9,

            /// <summary>
            /// Enum CodeRecovery for value: code_recovery
            /// </summary>
            [EnumMember(Value = "code_recovery")]
            CodeRecovery = 10
        }


        /// <summary>
        /// Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode
        /// </summary>
        /// <value>Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode</value>
        [DataMember(Name = "active", EmitDefaultValue = false)]
        public ActiveEnum? Active { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientRegistrationFlow" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientRegistrationFlow()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientRegistrationFlow" /> class.
        /// </summary>
        /// <param name="active">Active, if set, contains the registration method that is being used. It is initially not set. password CredentialsTypePassword oidc CredentialsTypeOIDC totp CredentialsTypeTOTP lookup_secret CredentialsTypeLookup webauthn CredentialsTypeWebAuthn code CredentialsTypeCodeAuth passkey CredentialsTypePasskey profile CredentialsTypeProfile link_recovery CredentialsTypeRecoveryLink  CredentialsTypeRecoveryLink is a special credential type linked to the link strategy (recovery flow).  It is not used within the credentials object itself. code_recovery CredentialsTypeRecoveryCode.</param>
        /// <param name="expiresAt">ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated. (required).</param>
        /// <param name="id">ID represents the flow&#39;s unique ID. When performing the registration flow, this represents the id in the registration ui&#39;s query parameter: http://&lt;selfservice.flows.registration.ui_url&gt;/?flow&#x3D;&lt;id&gt; (required).</param>
        /// <param name="issuedAt">IssuedAt is the time (UTC) when the flow occurred. (required).</param>
        /// <param name="oauth2LoginChallenge">Ory OAuth 2.0 Login Challenge.  This value is set using the &#x60;login_challenge&#x60; query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider..</param>
        /// <param name="oauth2LoginRequest">oauth2LoginRequest.</param>
        /// <param name="organizationId">organizationId.</param>
        /// <param name="requestUrl">RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example. (required).</param>
        /// <param name="returnTo">ReturnTo contains the requested return_to URL..</param>
        /// <param name="sessionTokenExchangeCode">SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \&quot;api\&quot;, and only on creating the flow..</param>
        /// <param name="state">State represents the state of this request:  choose_method: ask the user to choose a method (e.g. registration with email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the registration challenge was passed. (required).</param>
        /// <param name="transientPayload">TransientPayload is used to pass data from the registration to a webhook.</param>
        /// <param name="type">The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;. (required).</param>
        /// <param name="ui">ui (required).</param>
        public ClientRegistrationFlow(ActiveEnum? active = default(ActiveEnum?), DateTime expiresAt = default(DateTime), string id = default(string), DateTime issuedAt = default(DateTime), string oauth2LoginChallenge = default(string), ClientOAuth2LoginRequest oauth2LoginRequest = default(ClientOAuth2LoginRequest), string organizationId = default(string), string requestUrl = default(string), string returnTo = default(string), string sessionTokenExchangeCode = default(string), Object state = default(Object), Object transientPayload = default(Object), string type = default(string), ClientUiContainer ui = default(ClientUiContainer))
        {
            this.ExpiresAt = expiresAt;
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for ClientRegistrationFlow and cannot be null");
            }
            this.Id = id;
            this.IssuedAt = issuedAt;
            // to ensure "requestUrl" is required (not null)
            if (requestUrl == null)
            {
                throw new ArgumentNullException("requestUrl is a required property for ClientRegistrationFlow and cannot be null");
            }
            this.RequestUrl = requestUrl;
            // to ensure "state" is required (not null)
            if (state == null)
            {
                throw new ArgumentNullException("state is a required property for ClientRegistrationFlow and cannot be null");
            }
            this.State = state;
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for ClientRegistrationFlow and cannot be null");
            }
            this.Type = type;
            // to ensure "ui" is required (not null)
            if (ui == null)
            {
                throw new ArgumentNullException("ui is a required property for ClientRegistrationFlow and cannot be null");
            }
            this.Ui = ui;
            this.Active = active;
            this.Oauth2LoginChallenge = oauth2LoginChallenge;
            this.Oauth2LoginRequest = oauth2LoginRequest;
            this.OrganizationId = organizationId;
            this.ReturnTo = returnTo;
            this.SessionTokenExchangeCode = sessionTokenExchangeCode;
            this.TransientPayload = transientPayload;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
        /// </summary>
        /// <value>ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.</value>
        [DataMember(Name = "expires_at", IsRequired = true, EmitDefaultValue = true)]
        public DateTime ExpiresAt { get; set; }

        /// <summary>
        /// ID represents the flow&#39;s unique ID. When performing the registration flow, this represents the id in the registration ui&#39;s query parameter: http://&lt;selfservice.flows.registration.ui_url&gt;/?flow&#x3D;&lt;id&gt;
        /// </summary>
        /// <value>ID represents the flow&#39;s unique ID. When performing the registration flow, this represents the id in the registration ui&#39;s query parameter: http://&lt;selfservice.flows.registration.ui_url&gt;/?flow&#x3D;&lt;id&gt;</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// IssuedAt is the time (UTC) when the flow occurred.
        /// </summary>
        /// <value>IssuedAt is the time (UTC) when the flow occurred.</value>
        [DataMember(Name = "issued_at", IsRequired = true, EmitDefaultValue = true)]
        public DateTime IssuedAt { get; set; }

        /// <summary>
        /// Ory OAuth 2.0 Login Challenge.  This value is set using the &#x60;login_challenge&#x60; query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider.
        /// </summary>
        /// <value>Ory OAuth 2.0 Login Challenge.  This value is set using the &#x60;login_challenge&#x60; query parameter of the registration and login endpoints. If set will cooperate with Ory OAuth2 and OpenID to act as an OAuth2 server / OpenID Provider.</value>
        [DataMember(Name = "oauth2_login_challenge", EmitDefaultValue = false)]
        public string Oauth2LoginChallenge { get; set; }

        /// <summary>
        /// Gets or Sets Oauth2LoginRequest
        /// </summary>
        [DataMember(Name = "oauth2_login_request", EmitDefaultValue = false)]
        public ClientOAuth2LoginRequest Oauth2LoginRequest { get; set; }

        /// <summary>
        /// Gets or Sets OrganizationId
        /// </summary>
        [DataMember(Name = "organization_id", EmitDefaultValue = true)]
        public string OrganizationId { get; set; }

        /// <summary>
        /// RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
        /// </summary>
        /// <value>RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.</value>
        [DataMember(Name = "request_url", IsRequired = true, EmitDefaultValue = true)]
        public string RequestUrl { get; set; }

        /// <summary>
        /// ReturnTo contains the requested return_to URL.
        /// </summary>
        /// <value>ReturnTo contains the requested return_to URL.</value>
        [DataMember(Name = "return_to", EmitDefaultValue = false)]
        public string ReturnTo { get; set; }

        /// <summary>
        /// SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \&quot;api\&quot;, and only on creating the flow.
        /// </summary>
        /// <value>SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \&quot;api\&quot;, and only on creating the flow.</value>
        [DataMember(Name = "session_token_exchange_code", EmitDefaultValue = false)]
        public string SessionTokenExchangeCode { get; set; }

        /// <summary>
        /// State represents the state of this request:  choose_method: ask the user to choose a method (e.g. registration with email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the registration challenge was passed.
        /// </summary>
        /// <value>State represents the state of this request:  choose_method: ask the user to choose a method (e.g. registration with email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the registration challenge was passed.</value>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = true)]
        public Object State { get; set; }

        /// <summary>
        /// TransientPayload is used to pass data from the registration to a webhook
        /// </summary>
        /// <value>TransientPayload is used to pass data from the registration to a webhook</value>
        [DataMember(Name = "transient_payload", EmitDefaultValue = false)]
        public Object TransientPayload { get; set; }

        /// <summary>
        /// The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
        /// </summary>
        /// <value>The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Ui
        /// </summary>
        [DataMember(Name = "ui", IsRequired = true, EmitDefaultValue = true)]
        public ClientUiContainer Ui { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClientRegistrationFlow {\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IssuedAt: ").Append(IssuedAt).Append("\n");
            sb.Append("  Oauth2LoginChallenge: ").Append(Oauth2LoginChallenge).Append("\n");
            sb.Append("  Oauth2LoginRequest: ").Append(Oauth2LoginRequest).Append("\n");
            sb.Append("  OrganizationId: ").Append(OrganizationId).Append("\n");
            sb.Append("  RequestUrl: ").Append(RequestUrl).Append("\n");
            sb.Append("  ReturnTo: ").Append(ReturnTo).Append("\n");
            sb.Append("  SessionTokenExchangeCode: ").Append(SessionTokenExchangeCode).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  TransientPayload: ").Append(TransientPayload).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Ui: ").Append(Ui).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
