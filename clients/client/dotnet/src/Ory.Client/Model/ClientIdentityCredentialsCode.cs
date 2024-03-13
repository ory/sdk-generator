/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.8.1
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
    /// CredentialsCode represents a one time login/registration code
    /// </summary>
    [DataContract(Name = "identityCredentialsCode")]
    public partial class ClientIdentityCredentialsCode : IEquatable<ClientIdentityCredentialsCode>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientIdentityCredentialsCode" /> class.
        /// </summary>
        /// <param name="addressType">The type of the address for this code.</param>
        /// <param name="usedAt">usedAt.</param>
        public ClientIdentityCredentialsCode(string addressType = default(string), DateTime? usedAt = default(DateTime?))
        {
            this.AddressType = addressType;
            this.UsedAt = usedAt;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The type of the address for this code
        /// </summary>
        /// <value>The type of the address for this code</value>
        [DataMember(Name = "address_type", EmitDefaultValue = false)]
        public string AddressType { get; set; }

        /// <summary>
        /// Gets or Sets UsedAt
        /// </summary>
        [DataMember(Name = "used_at", EmitDefaultValue = true)]
        public DateTime? UsedAt { get; set; }

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
            sb.Append("class ClientIdentityCredentialsCode {\n");
            sb.Append("  AddressType: ").Append(AddressType).Append("\n");
            sb.Append("  UsedAt: ").Append(UsedAt).Append("\n");
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
            return this.Equals(input as ClientIdentityCredentialsCode);
        }

        /// <summary>
        /// Returns true if ClientIdentityCredentialsCode instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientIdentityCredentialsCode to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientIdentityCredentialsCode input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AddressType == input.AddressType ||
                    (this.AddressType != null &&
                    this.AddressType.Equals(input.AddressType))
                ) && 
                (
                    this.UsedAt == input.UsedAt ||
                    (this.UsedAt != null &&
                    this.UsedAt.Equals(input.UsedAt))
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
                if (this.AddressType != null)
                {
                    hashCode = (hashCode * 59) + this.AddressType.GetHashCode();
                }
                if (this.UsedAt != null)
                {
                    hashCode = (hashCode * 59) + this.UsedAt.GetHashCode();
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
