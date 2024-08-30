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
    /// ClientListWorkspaceProjects
    /// </summary>
    [DataContract(Name = "listWorkspaceProjects")]
    public partial class ClientListWorkspaceProjects : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientListWorkspaceProjects" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientListWorkspaceProjects()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientListWorkspaceProjects" /> class.
        /// </summary>
        /// <param name="hasNextPage">hasNextPage (required).</param>
        /// <param name="nextPage">nextPage (required).</param>
        /// <param name="projects">projects (required).</param>
        public ClientListWorkspaceProjects(bool hasNextPage = default(bool), string nextPage = default(string), List<ClientProjectMetadata> projects = default(List<ClientProjectMetadata>))
        {
            this.HasNextPage = hasNextPage;
            // to ensure "nextPage" is required (not null)
            if (nextPage == null)
            {
                throw new ArgumentNullException("nextPage is a required property for ClientListWorkspaceProjects and cannot be null");
            }
            this.NextPage = nextPage;
            // to ensure "projects" is required (not null)
            if (projects == null)
            {
                throw new ArgumentNullException("projects is a required property for ClientListWorkspaceProjects and cannot be null");
            }
            this.Projects = projects;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets HasNextPage
        /// </summary>
        [DataMember(Name = "has_next_page", IsRequired = true, EmitDefaultValue = true)]
        public bool HasNextPage { get; set; }

        /// <summary>
        /// Gets or Sets NextPage
        /// </summary>
        [DataMember(Name = "next_page", IsRequired = true, EmitDefaultValue = true)]
        public string NextPage { get; set; }

        /// <summary>
        /// Gets or Sets Projects
        /// </summary>
        [DataMember(Name = "projects", IsRequired = true, EmitDefaultValue = true)]
        public List<ClientProjectMetadata> Projects { get; set; }

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
            sb.Append("class ClientListWorkspaceProjects {\n");
            sb.Append("  HasNextPage: ").Append(HasNextPage).Append("\n");
            sb.Append("  NextPage: ").Append(NextPage).Append("\n");
            sb.Append("  Projects: ").Append(Projects).Append("\n");
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
