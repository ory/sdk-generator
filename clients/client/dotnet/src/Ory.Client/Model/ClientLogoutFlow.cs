/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.15.0
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
    /// Logout Flow
    /// </summary>
    [DataContract(Name = "logoutFlow")]
    public partial class ClientLogoutFlow : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientLogoutFlow" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientLogoutFlow()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientLogoutFlow" /> class.
        /// </summary>
        /// <param name="logoutToken">LogoutToken can be used to perform logout using AJAX. (required).</param>
        /// <param name="logoutUrl">LogoutURL can be opened in a browser to sign the user out.  format: uri (required).</param>
        public ClientLogoutFlow(string logoutToken = default(string), string logoutUrl = default(string))
        {
            // to ensure "logoutToken" is required (not null)
            if (logoutToken == null)
            {
                throw new ArgumentNullException("logoutToken is a required property for ClientLogoutFlow and cannot be null");
            }
            this.LogoutToken = logoutToken;
            // to ensure "logoutUrl" is required (not null)
            if (logoutUrl == null)
            {
                throw new ArgumentNullException("logoutUrl is a required property for ClientLogoutFlow and cannot be null");
            }
            this.LogoutUrl = logoutUrl;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// LogoutToken can be used to perform logout using AJAX.
        /// </summary>
        /// <value>LogoutToken can be used to perform logout using AJAX.</value>
        [DataMember(Name = "logout_token", IsRequired = true, EmitDefaultValue = true)]
        public string LogoutToken { get; set; }

        /// <summary>
        /// LogoutURL can be opened in a browser to sign the user out.  format: uri
        /// </summary>
        /// <value>LogoutURL can be opened in a browser to sign the user out.  format: uri</value>
        [DataMember(Name = "logout_url", IsRequired = true, EmitDefaultValue = true)]
        public string LogoutUrl { get; set; }

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
            sb.Append("class ClientLogoutFlow {\n");
            sb.Append("  LogoutToken: ").Append(LogoutToken).Append("\n");
            sb.Append("  LogoutUrl: ").Append(LogoutUrl).Append("\n");
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
