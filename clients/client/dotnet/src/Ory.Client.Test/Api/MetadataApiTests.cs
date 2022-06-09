/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.188
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Ory.Client.Client;
using Ory.Client.Api;
// uncomment below to import models
//using Ory.Client.Model;

namespace Ory.Client.Test.Api
{
    /// <summary>
    ///  Class for testing MetadataApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class MetadataApiTests : IDisposable
    {
        private MetadataApi instance;

        public MetadataApiTests()
        {
            instance = new MetadataApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of MetadataApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' MetadataApi
            //Assert.IsType<MetadataApi>(instance);
        }

        /// <summary>
        /// Test GetVersion
        /// </summary>
        [Fact]
        public void GetVersionTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.GetVersion();
            //Assert.IsType<ClientInlineResponse2001>(response);
        }

        /// <summary>
        /// Test IsAlive
        /// </summary>
        [Fact]
        public void IsAliveTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.IsAlive();
            //Assert.IsType<ClientInlineResponse200>(response);
        }

        /// <summary>
        /// Test IsReady
        /// </summary>
        [Fact]
        public void IsReadyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.IsReady();
            //Assert.IsType<ClientInlineResponse200>(response);
        }
    }
}
