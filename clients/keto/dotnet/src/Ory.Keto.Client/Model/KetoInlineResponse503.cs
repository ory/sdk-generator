/*
 * Ory Oathkeeper API
 *
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v0.8.0-alpha.1
 * Contact: hi@ory.sh
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
using OpenAPIDateConverter = Ory.Keto.Client.Client.OpenAPIDateConverter;

namespace Ory.Keto.Client.Model
{
    /// <summary>
    /// KetoInlineResponse503
    /// </summary>
    [DataContract(Name = "inline_response_503")]
    public partial class KetoInlineResponse503 : IEquatable<KetoInlineResponse503>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KetoInlineResponse503" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KetoInlineResponse503()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="KetoInlineResponse503" /> class.
        /// </summary>
        /// <param name="errors">Errors contains a list of errors that caused the not ready status. (required).</param>
        public KetoInlineResponse503(Dictionary<string, string> errors = default(Dictionary<string, string>))
        {
            // to ensure "errors" is required (not null)
            if (errors == null) {
                throw new ArgumentNullException("errors is a required property for KetoInlineResponse503 and cannot be null");
            }
            this.Errors = errors;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Errors contains a list of errors that caused the not ready status.
        /// </summary>
        /// <value>Errors contains a list of errors that caused the not ready status.</value>
        [DataMember(Name = "errors", IsRequired = true, EmitDefaultValue = false)]
        public Dictionary<string, string> Errors { get; set; }

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
            sb.Append("class KetoInlineResponse503 {\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
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
            return this.Equals(input as KetoInlineResponse503);
        }

        /// <summary>
        /// Returns true if KetoInlineResponse503 instances are equal
        /// </summary>
        /// <param name="input">Instance of KetoInlineResponse503 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KetoInlineResponse503 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Errors == input.Errors ||
                    this.Errors != null &&
                    input.Errors != null &&
                    this.Errors.SequenceEqual(input.Errors)
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
                if (this.Errors != null)
                {
                    hashCode = (hashCode * 59) + this.Errors.GetHashCode();
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