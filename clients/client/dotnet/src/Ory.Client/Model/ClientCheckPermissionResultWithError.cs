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
    /// Check Permission Result With Error
    /// </summary>
    [DataContract(Name = "checkPermissionResultWithError")]
    public partial class ClientCheckPermissionResultWithError : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientCheckPermissionResultWithError" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientCheckPermissionResultWithError()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientCheckPermissionResultWithError" /> class.
        /// </summary>
        /// <param name="allowed">whether the relation tuple is allowed (required).</param>
        /// <param name="error">any error generated while checking the relation tuple.</param>
        public ClientCheckPermissionResultWithError(bool allowed = default(bool), string error = default(string))
        {
            this.Allowed = allowed;
            this.Error = error;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// whether the relation tuple is allowed
        /// </summary>
        /// <value>whether the relation tuple is allowed</value>
        [DataMember(Name = "allowed", IsRequired = true, EmitDefaultValue = true)]
        public bool Allowed { get; set; }

        /// <summary>
        /// any error generated while checking the relation tuple
        /// </summary>
        /// <value>any error generated while checking the relation tuple</value>
        [DataMember(Name = "error", EmitDefaultValue = false)]
        public string Error { get; set; }

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
            sb.Append("class ClientCheckPermissionResultWithError {\n");
            sb.Append("  Allowed: ").Append(Allowed).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
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
