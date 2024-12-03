/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.11
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
    /// ClientAttributeFilter
    /// </summary>
    [DataContract(Name = "AttributeFilter")]
    public partial class ClientAttributeFilter : IValidatableObject
    {
        /// <summary>
        /// Defines Condition
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ConditionEnum
        {
            /// <summary>
            /// Enum Equals for value: equals
            /// </summary>
            [EnumMember(Value = "equals")]
            Equals = 1,

            /// <summary>
            /// Enum NotEquals for value: not_equals
            /// </summary>
            [EnumMember(Value = "not_equals")]
            NotEquals = 2,

            /// <summary>
            /// Enum Contains for value: contains
            /// </summary>
            [EnumMember(Value = "contains")]
            Contains = 3,

            /// <summary>
            /// Enum NotContains for value: not_contains
            /// </summary>
            [EnumMember(Value = "not_contains")]
            NotContains = 4,

            /// <summary>
            /// Enum Regex for value: regex
            /// </summary>
            [EnumMember(Value = "regex")]
            Regex = 5,

            /// <summary>
            /// Enum NotRegex for value: not_regex
            /// </summary>
            [EnumMember(Value = "not_regex")]
            NotRegex = 6,

            /// <summary>
            /// Enum Set for value: set
            /// </summary>
            [EnumMember(Value = "set")]
            Set = 7,

            /// <summary>
            /// Enum NotSet for value: not_set
            /// </summary>
            [EnumMember(Value = "not_set")]
            NotSet = 8
        }


        /// <summary>
        /// Gets or Sets Condition
        /// </summary>
        [DataMember(Name = "condition", EmitDefaultValue = false)]
        public ConditionEnum? Condition { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientAttributeFilter" /> class.
        /// </summary>
        /// <param name="attribute">attribute.</param>
        /// <param name="condition">condition.</param>
        /// <param name="value">value.</param>
        public ClientAttributeFilter(string attribute = default(string), ConditionEnum? condition = default(ConditionEnum?), string value = default(string))
        {
            this.Attribute = attribute;
            this.Condition = condition;
            this.Value = value;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Attribute
        /// </summary>
        [DataMember(Name = "attribute", EmitDefaultValue = false)]
        public string Attribute { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

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
            sb.Append("class ClientAttributeFilter {\n");
            sb.Append("  Attribute: ").Append(Attribute).Append("\n");
            sb.Append("  Condition: ").Append(Condition).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
