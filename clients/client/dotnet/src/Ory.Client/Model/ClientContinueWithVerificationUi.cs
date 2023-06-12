/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.34
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
    /// Indicates, that the UI flow could be continued by showing a verification ui
    /// </summary>
    [DataContract(Name = "continueWithVerificationUi")]
    public partial class ClientContinueWithVerificationUi : IEquatable<ClientContinueWithVerificationUi>, IValidatableObject
    {
        /// <summary>
        /// Action will always be &#x60;show_verification_ui&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI
        /// </summary>
        /// <value>Action will always be &#x60;show_verification_ui&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ActionEnum
        {
            /// <summary>
            /// Enum SetOrySessionToken for value: set_ory_session_token
            /// </summary>
            [EnumMember(Value = "set_ory_session_token")]
            SetOrySessionToken = 1,

            /// <summary>
            /// Enum ShowVerificationUi for value: show_verification_ui
            /// </summary>
            [EnumMember(Value = "show_verification_ui")]
            ShowVerificationUi = 2

        }


        /// <summary>
        /// Action will always be &#x60;show_verification_ui&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI
        /// </summary>
        /// <value>Action will always be &#x60;show_verification_ui&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI</value>
        [DataMember(Name = "action", IsRequired = true, EmitDefaultValue = false)]
        public ActionEnum Action { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContinueWithVerificationUi" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientContinueWithVerificationUi()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContinueWithVerificationUi" /> class.
        /// </summary>
        /// <param name="action">Action will always be &#x60;show_verification_ui&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI (required).</param>
        /// <param name="flow">flow (required).</param>
        public ClientContinueWithVerificationUi(ActionEnum action = default(ActionEnum), ClientContinueWithVerificationUiFlow flow = default(ClientContinueWithVerificationUiFlow))
        {
            this.Action = action;
            // to ensure "flow" is required (not null)
            if (flow == null) {
                throw new ArgumentNullException("flow is a required property for ClientContinueWithVerificationUi and cannot be null");
            }
            this.Flow = flow;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Flow
        /// </summary>
        [DataMember(Name = "flow", IsRequired = true, EmitDefaultValue = false)]
        public ClientContinueWithVerificationUiFlow Flow { get; set; }

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
            sb.Append("class ClientContinueWithVerificationUi {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Flow: ").Append(Flow).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientContinueWithVerificationUi);
        }

        /// <summary>
        /// Returns true if ClientContinueWithVerificationUi instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientContinueWithVerificationUi to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientContinueWithVerificationUi input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Action == input.Action ||
                    this.Action.Equals(input.Action)
                ) && 
                (
                    this.Flow == input.Flow ||
                    (this.Flow != null &&
                    this.Flow.Equals(input.Flow))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.Action.GetHashCode();
                if (this.Flow != null)
                {
                    hashCode = (hashCode * 59) + this.Flow.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
