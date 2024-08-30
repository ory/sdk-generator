/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.14.5
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
    /// Update Settings Flow with TOTP Method
    /// </summary>
    [DataContract(Name = "updateSettingsFlowWithTotpMethod")]
    public partial class ClientUpdateSettingsFlowWithTotpMethod : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUpdateSettingsFlowWithTotpMethod" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientUpdateSettingsFlowWithTotpMethod()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUpdateSettingsFlowWithTotpMethod" /> class.
        /// </summary>
        /// <param name="csrfToken">CSRFToken is the anti-CSRF token.</param>
        /// <param name="method">Method  Should be set to \&quot;totp\&quot; when trying to add, update, or remove a totp pairing. (required).</param>
        /// <param name="totpCode">ValidationTOTP must contain a valid TOTP based on the.</param>
        /// <param name="totpUnlink">UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device..</param>
        /// <param name="transientPayload">Transient data to pass along to any webhooks.</param>
        public ClientUpdateSettingsFlowWithTotpMethod(string csrfToken = default(string), string method = default(string), string totpCode = default(string), bool totpUnlink = default(bool), Object transientPayload = default(Object))
        {
            // to ensure "method" is required (not null)
            if (method == null)
            {
                throw new ArgumentNullException("method is a required property for ClientUpdateSettingsFlowWithTotpMethod and cannot be null");
            }
            this.Method = method;
            this.CsrfToken = csrfToken;
            this.TotpCode = totpCode;
            this.TotpUnlink = totpUnlink;
            this.TransientPayload = transientPayload;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// CSRFToken is the anti-CSRF token
        /// </summary>
        /// <value>CSRFToken is the anti-CSRF token</value>
        [DataMember(Name = "csrf_token", EmitDefaultValue = false)]
        public string CsrfToken { get; set; }

        /// <summary>
        /// Method  Should be set to \&quot;totp\&quot; when trying to add, update, or remove a totp pairing.
        /// </summary>
        /// <value>Method  Should be set to \&quot;totp\&quot; when trying to add, update, or remove a totp pairing.</value>
        [DataMember(Name = "method", IsRequired = true, EmitDefaultValue = true)]
        public string Method { get; set; }

        /// <summary>
        /// ValidationTOTP must contain a valid TOTP based on the
        /// </summary>
        /// <value>ValidationTOTP must contain a valid TOTP based on the</value>
        [DataMember(Name = "totp_code", EmitDefaultValue = false)]
        public string TotpCode { get; set; }

        /// <summary>
        /// UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.
        /// </summary>
        /// <value>UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.</value>
        [DataMember(Name = "totp_unlink", EmitDefaultValue = true)]
        public bool TotpUnlink { get; set; }

        /// <summary>
        /// Transient data to pass along to any webhooks
        /// </summary>
        /// <value>Transient data to pass along to any webhooks</value>
        [DataMember(Name = "transient_payload", EmitDefaultValue = false)]
        public Object TransientPayload { get; set; }

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
            sb.Append("class ClientUpdateSettingsFlowWithTotpMethod {\n");
            sb.Append("  CsrfToken: ").Append(CsrfToken).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  TotpCode: ").Append(TotpCode).Append("\n");
            sb.Append("  TotpUnlink: ").Append(TotpUnlink).Append("\n");
            sb.Append("  TransientPayload: ").Append(TransientPayload).Append("\n");
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
