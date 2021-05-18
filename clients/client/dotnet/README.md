# Ory.Client - the C# library for the Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed
with a valid Personal Access Token. Public APIs are mostly used in browsers.


This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: v0.0.1-alpha.3
- SDK version: 0.0.1-alpha.3
- Build package: org.openapitools.codegen.languages.CSharpNetCoreClientCodegen
    For more information, please visit [https://www.ory.sh](https://www.ory.sh)

<a name="frameworks-supported"></a>
## Frameworks supported

<a name="dependencies"></a>
## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.11.7 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 12.0.3 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
Install-Package System.ComponentModel.Annotations
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742).
NOTE: RestSharp for .Net Core creates a new socket for each api call, which can lead to a socket exhaustion problem. See [RestSharp#1406](https://github.com/restsharp/RestSharp/issues/1406).

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Ory.Client.Api;
using Ory.Client.Client;
using Ory.Client.Model;
```
<a name="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out Ory.Client.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a name="usage"></a>
## Usage

To use the API client with a HTTP proxy, setup a `System.Net.WebProxy`
```csharp
Configuration c = new Configuration();
System.Net.WebProxy webProxy = new System.Net.WebProxy("http://myProxyUrl:80/");
webProxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
c.Proxy = webProxy;
```

<a name="getting-started"></a>
## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Ory.Client.Api;
using Ory.Client.Client;
using Ory.Client.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration config = new Configuration();
            config.BasePath = "https://playground.projects.oryapis.com";
            // Configure Bearer token for authorization: oryToken
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new DefaultApi(config);
            var clientCreateIdentity = new ClientCreateIdentity(); // ClientCreateIdentity |  (optional) 

            try
            {
                // Create an Identity
                ClientIdentity result = apiInstance.CreateIdentityAdmin(clientCreateIdentity);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DefaultApi.CreateIdentityAdmin: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://playground.projects.oryapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**CreateIdentityAdmin**](docs/DefaultApi.md#createidentityadmin) | **POST** /api/kratos/admin/identities | Create an Identity
*DefaultApi* | [**CreateRecoveryLinkAdmin**](docs/DefaultApi.md#createrecoverylinkadmin) | **POST** /api/kratos/admin/recovery/link | Create a Recovery Link
*DefaultApi* | [**DeleteIdentityAdmin**](docs/DefaultApi.md#deleteidentityadmin) | **DELETE** /api/kratos/admin/identities/{id} | Delete an Identity
*DefaultApi* | [**GetIdentityAdmin**](docs/DefaultApi.md#getidentityadmin) | **GET** /api/kratos/admin/identities/{id} | Get an Identity
*DefaultApi* | [**GetSchema**](docs/DefaultApi.md#getschema) | **GET** /api/kratos/public/schemas/{id} | 
*DefaultApi* | [**GetSchemaAdmin**](docs/DefaultApi.md#getschemaadmin) | **GET** /api/kratos/admin/schemas/{id} | 
*DefaultApi* | [**GetSelfServiceError**](docs/DefaultApi.md#getselfserviceerror) | **GET** /api/kratos/public/self-service/errors | Get User-Facing Self-Service Errors
*DefaultApi* | [**GetSelfServiceErrorAdmin**](docs/DefaultApi.md#getselfserviceerroradmin) | **GET** /api/kratos/admin/self-service/errors | Get User-Facing Self-Service Errors
*DefaultApi* | [**GetSelfServiceLoginFlow**](docs/DefaultApi.md#getselfserviceloginflow) | **GET** /api/kratos/public/self-service/login/flows | Get Login Flow
*DefaultApi* | [**GetSelfServiceLoginFlowAdmin**](docs/DefaultApi.md#getselfserviceloginflowadmin) | **GET** /api/kratos/admin/self-service/login/flows | Get Login Flow
*DefaultApi* | [**GetSelfServiceRecoveryFlow**](docs/DefaultApi.md#getselfservicerecoveryflow) | **GET** /api/kratos/public/self-service/recovery/flows | Get information about a recovery flow
*DefaultApi* | [**GetSelfServiceRecoveryFlowAdmin**](docs/DefaultApi.md#getselfservicerecoveryflowadmin) | **GET** /api/kratos/admin/self-service/recovery/flows | Get information about a recovery flow
*DefaultApi* | [**GetSelfServiceRegistrationFlow**](docs/DefaultApi.md#getselfserviceregistrationflow) | **GET** /api/kratos/public/self-service/registration/flows | Get Registration Flow
*DefaultApi* | [**GetSelfServiceRegistrationFlowAdmin**](docs/DefaultApi.md#getselfserviceregistrationflowadmin) | **GET** /api/kratos/admin/self-service/registration/flows | Get Registration Flow
*DefaultApi* | [**GetSelfServiceSettingsFlow**](docs/DefaultApi.md#getselfservicesettingsflow) | **GET** /api/kratos/public/self-service/settings/flows | Get Settings Flow
*DefaultApi* | [**GetSelfServiceSettingsFlowAdmin**](docs/DefaultApi.md#getselfservicesettingsflowadmin) | **GET** /api/kratos/admin/self-service/settings/flows | Get Settings Flow
*DefaultApi* | [**GetSelfServiceVerificationFlow**](docs/DefaultApi.md#getselfserviceverificationflow) | **GET** /api/kratos/public/self-service/verification/flows | Get Verification Flow
*DefaultApi* | [**GetSelfServiceVerificationFlowAdmin**](docs/DefaultApi.md#getselfserviceverificationflowadmin) | **GET** /api/kratos/admin/self-service/verification/flows | Get Verification Flow
*DefaultApi* | [**GetVersionAdmin**](docs/DefaultApi.md#getversionadmin) | **GET** /api/kratos/admin/version | Return Running Software Version.
*DefaultApi* | [**InitializeSelfServiceBrowserLogoutFlow**](docs/DefaultApi.md#initializeselfservicebrowserlogoutflow) | **GET** /api/kratos/public/self-service/browser/flows/logout | Initialize Browser-Based Logout User Flow
*DefaultApi* | [**InitializeSelfServiceLoginForBrowsers**](docs/DefaultApi.md#initializeselfserviceloginforbrowsers) | **GET** /api/kratos/public/self-service/login/browser | Initialize Login Flow for browsers
*DefaultApi* | [**InitializeSelfServiceLoginForNativeApps**](docs/DefaultApi.md#initializeselfserviceloginfornativeapps) | **GET** /api/kratos/public/self-service/login/api | Initialize Login Flow for Native Apps and API clients
*DefaultApi* | [**InitializeSelfServiceRecoveryForBrowsers**](docs/DefaultApi.md#initializeselfservicerecoveryforbrowsers) | **GET** /api/kratos/public/self-service/recovery/browser | Initialize Recovery Flow for Browser Clients
*DefaultApi* | [**InitializeSelfServiceRecoveryForNativeApps**](docs/DefaultApi.md#initializeselfservicerecoveryfornativeapps) | **GET** /api/kratos/public/self-service/recovery/api | Initialize Recovery Flow for Native Apps and API clients
*DefaultApi* | [**InitializeSelfServiceRegistrationForBrowsers**](docs/DefaultApi.md#initializeselfserviceregistrationforbrowsers) | **GET** /api/kratos/public/self-service/registration/browser | Initialize Registration Flow for browsers
*DefaultApi* | [**InitializeSelfServiceRegistrationForNativeApps**](docs/DefaultApi.md#initializeselfserviceregistrationfornativeapps) | **GET** /api/kratos/public/self-service/registration/api | Initialize Registration Flow for Native Apps and API clients
*DefaultApi* | [**InitializeSelfServiceSettingsForBrowsers**](docs/DefaultApi.md#initializeselfservicesettingsforbrowsers) | **GET** /api/kratos/public/self-service/settings/browser | Initialize Settings Flow for Browsers
*DefaultApi* | [**InitializeSelfServiceSettingsForNativeApps**](docs/DefaultApi.md#initializeselfservicesettingsfornativeapps) | **GET** /api/kratos/public/self-service/settings/api | Initialize Settings Flow for Native Apps and API clients
*DefaultApi* | [**InitializeSelfServiceVerificationForBrowsers**](docs/DefaultApi.md#initializeselfserviceverificationforbrowsers) | **GET** /api/kratos/public/self-service/verification/browser | Initialize Verification Flow for Browser Clients
*DefaultApi* | [**InitializeSelfServiceVerificationForNativeApps**](docs/DefaultApi.md#initializeselfserviceverificationfornativeapps) | **GET** /api/kratos/public/self-service/verification/api | Initialize Verification Flow for Native Apps and API clients
*DefaultApi* | [**IsAliveAdmin**](docs/DefaultApi.md#isaliveadmin) | **GET** /api/kratos/admin/health/alive | Check HTTP Server Status
*DefaultApi* | [**IsReadyAdmin**](docs/DefaultApi.md#isreadyadmin) | **GET** /api/kratos/admin/health/ready | Check HTTP Server and Database Status
*DefaultApi* | [**ListIdentitiesAdmin**](docs/DefaultApi.md#listidentitiesadmin) | **GET** /api/kratos/admin/identities | List Identities
*DefaultApi* | [**PrometheusAdmin**](docs/DefaultApi.md#prometheusadmin) | **GET** /api/kratos/admin/metrics/prometheus | Get snapshot metrics from the Hydra service. If you're using k8s, you can then add annotations to your deployment like so:
*DefaultApi* | [**RevokeSession**](docs/DefaultApi.md#revokesession) | **DELETE** /api/kratos/public/sessions | Initialize Logout Flow for API Clients - Revoke a Session
*DefaultApi* | [**SubmitSelfServiceLoginFlow**](docs/DefaultApi.md#submitselfserviceloginflow) | **POST** /api/kratos/public/self-service/login | Submit a Login Flow
*DefaultApi* | [**SubmitSelfServiceRecoveryFlow**](docs/DefaultApi.md#submitselfservicerecoveryflow) | **POST** /api/kratos/public/self-service/recovery | Complete Recovery Flow
*DefaultApi* | [**SubmitSelfServiceRecoveryFlowWithLinkMethod**](docs/DefaultApi.md#submitselfservicerecoveryflowwithlinkmethod) | **POST** /api/kratos/public/self-service/recovery/methods/link | Complete Recovery Flow with Link Method
*DefaultApi* | [**SubmitSelfServiceRegistrationFlow**](docs/DefaultApi.md#submitselfserviceregistrationflow) | **POST** /api/kratos/public/self-service/registration | Submit a Registration Flow
*DefaultApi* | [**SubmitSelfServiceSettingsFlow**](docs/DefaultApi.md#submitselfservicesettingsflow) | **POST** /api/kratos/public/self-service/settings | Complete Settings Flow
*DefaultApi* | [**SubmitSelfServiceVerificationFlow**](docs/DefaultApi.md#submitselfserviceverificationflow) | **POST** /api/kratos/public/self-service/verification/methods/link | Complete Verification Flow
*DefaultApi* | [**ToSession**](docs/DefaultApi.md#tosession) | **GET** /api/kratos/public/sessions/whoami | Check Who the Current HTTP Session Belongs To
*DefaultApi* | [**UpdateIdentityAdmin**](docs/DefaultApi.md#updateidentityadmin) | **PUT** /api/kratos/admin/identities/{id} | Update an Identity


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.ClientAuthenticateOKBody](docs/ClientAuthenticateOKBody.md)
 - [Model.ClientContainerChangeResponseItem](docs/ClientContainerChangeResponseItem.md)
 - [Model.ClientContainerCreateCreatedBody](docs/ClientContainerCreateCreatedBody.md)
 - [Model.ClientContainerTopOKBody](docs/ClientContainerTopOKBody.md)
 - [Model.ClientContainerUpdateOKBody](docs/ClientContainerUpdateOKBody.md)
 - [Model.ClientContainerWaitOKBody](docs/ClientContainerWaitOKBody.md)
 - [Model.ClientContainerWaitOKBodyError](docs/ClientContainerWaitOKBodyError.md)
 - [Model.ClientCreateIdentity](docs/ClientCreateIdentity.md)
 - [Model.ClientCreateRecoveryLink](docs/ClientCreateRecoveryLink.md)
 - [Model.ClientErrorResponse](docs/ClientErrorResponse.md)
 - [Model.ClientGenericError](docs/ClientGenericError.md)
 - [Model.ClientGraphDriverData](docs/ClientGraphDriverData.md)
 - [Model.ClientHealthNotReadyStatus](docs/ClientHealthNotReadyStatus.md)
 - [Model.ClientHealthStatus](docs/ClientHealthStatus.md)
 - [Model.ClientIdResponse](docs/ClientIdResponse.md)
 - [Model.ClientIdentity](docs/ClientIdentity.md)
 - [Model.ClientIdentityCredentials](docs/ClientIdentityCredentials.md)
 - [Model.ClientImageDeleteResponseItem](docs/ClientImageDeleteResponseItem.md)
 - [Model.ClientImageSummary](docs/ClientImageSummary.md)
 - [Model.ClientInlineResponse200](docs/ClientInlineResponse200.md)
 - [Model.ClientInlineResponse2001](docs/ClientInlineResponse2001.md)
 - [Model.ClientInlineResponse503](docs/ClientInlineResponse503.md)
 - [Model.ClientJsonError](docs/ClientJsonError.md)
 - [Model.ClientLoginFlow](docs/ClientLoginFlow.md)
 - [Model.ClientLoginViaApiResponse](docs/ClientLoginViaApiResponse.md)
 - [Model.ClientMeta](docs/ClientMeta.md)
 - [Model.ClientPlugin](docs/ClientPlugin.md)
 - [Model.ClientPluginConfig](docs/ClientPluginConfig.md)
 - [Model.ClientPluginConfigArgs](docs/ClientPluginConfigArgs.md)
 - [Model.ClientPluginConfigInterface](docs/ClientPluginConfigInterface.md)
 - [Model.ClientPluginConfigLinux](docs/ClientPluginConfigLinux.md)
 - [Model.ClientPluginConfigNetwork](docs/ClientPluginConfigNetwork.md)
 - [Model.ClientPluginConfigRootfs](docs/ClientPluginConfigRootfs.md)
 - [Model.ClientPluginConfigUser](docs/ClientPluginConfigUser.md)
 - [Model.ClientPluginDevice](docs/ClientPluginDevice.md)
 - [Model.ClientPluginEnv](docs/ClientPluginEnv.md)
 - [Model.ClientPluginInterfaceType](docs/ClientPluginInterfaceType.md)
 - [Model.ClientPluginMount](docs/ClientPluginMount.md)
 - [Model.ClientPluginSettings](docs/ClientPluginSettings.md)
 - [Model.ClientPort](docs/ClientPort.md)
 - [Model.ClientRecoveryAddress](docs/ClientRecoveryAddress.md)
 - [Model.ClientRecoveryFlow](docs/ClientRecoveryFlow.md)
 - [Model.ClientRecoveryLink](docs/ClientRecoveryLink.md)
 - [Model.ClientRegistrationFlow](docs/ClientRegistrationFlow.md)
 - [Model.ClientRegistrationViaApiResponse](docs/ClientRegistrationViaApiResponse.md)
 - [Model.ClientRevokeSession](docs/ClientRevokeSession.md)
 - [Model.ClientSelfServiceErrorContainer](docs/ClientSelfServiceErrorContainer.md)
 - [Model.ClientServiceUpdateResponse](docs/ClientServiceUpdateResponse.md)
 - [Model.ClientSession](docs/ClientSession.md)
 - [Model.ClientSettingsFlow](docs/ClientSettingsFlow.md)
 - [Model.ClientSettingsProfileFormConfig](docs/ClientSettingsProfileFormConfig.md)
 - [Model.ClientSettingsViaApiResponse](docs/ClientSettingsViaApiResponse.md)
 - [Model.ClientSubmitSelfServiceBrowserSettingsOIDCFlowPayload](docs/ClientSubmitSelfServiceBrowserSettingsOIDCFlowPayload.md)
 - [Model.ClientSubmitSelfServiceLoginFlow](docs/ClientSubmitSelfServiceLoginFlow.md)
 - [Model.ClientSubmitSelfServiceLoginFlowWithPasswordMethod](docs/ClientSubmitSelfServiceLoginFlowWithPasswordMethod.md)
 - [Model.ClientSubmitSelfServiceRecoveryFlowWithLinkMethod](docs/ClientSubmitSelfServiceRecoveryFlowWithLinkMethod.md)
 - [Model.ClientSubmitSelfServiceRegistrationFlow](docs/ClientSubmitSelfServiceRegistrationFlow.md)
 - [Model.ClientSubmitSelfServiceRegistrationFlowWithPasswordMethod](docs/ClientSubmitSelfServiceRegistrationFlowWithPasswordMethod.md)
 - [Model.ClientSubmitSelfServiceSettingsFlow](docs/ClientSubmitSelfServiceSettingsFlow.md)
 - [Model.ClientSubmitSelfServiceSettingsFlowWithPasswordMethod](docs/ClientSubmitSelfServiceSettingsFlowWithPasswordMethod.md)
 - [Model.ClientSubmitSelfServiceSettingsFlowWithProfileMethod](docs/ClientSubmitSelfServiceSettingsFlowWithProfileMethod.md)
 - [Model.ClientSubmitSelfServiceVerificationFlowWithLinkMethod](docs/ClientSubmitSelfServiceVerificationFlowWithLinkMethod.md)
 - [Model.ClientUiContainer](docs/ClientUiContainer.md)
 - [Model.ClientUiNode](docs/ClientUiNode.md)
 - [Model.ClientUiNodeAnchorAttributes](docs/ClientUiNodeAnchorAttributes.md)
 - [Model.ClientUiNodeAttributes](docs/ClientUiNodeAttributes.md)
 - [Model.ClientUiNodeImageAttributes](docs/ClientUiNodeImageAttributes.md)
 - [Model.ClientUiNodeInputAttributes](docs/ClientUiNodeInputAttributes.md)
 - [Model.ClientUiNodeInputAttributesValue](docs/ClientUiNodeInputAttributesValue.md)
 - [Model.ClientUiNodeTextAttributes](docs/ClientUiNodeTextAttributes.md)
 - [Model.ClientUiText](docs/ClientUiText.md)
 - [Model.ClientUpdateIdentity](docs/ClientUpdateIdentity.md)
 - [Model.ClientVerifiableIdentityAddress](docs/ClientVerifiableIdentityAddress.md)
 - [Model.ClientVerificationFlow](docs/ClientVerificationFlow.md)
 - [Model.ClientVersion](docs/ClientVersion.md)
 - [Model.ClientVolume](docs/ClientVolume.md)
 - [Model.ClientVolumeUsageData](docs/ClientVolumeUsageData.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="oryToken"></a>
### oryToken

- **Type**: Bearer Authentication

<a name="sessionCookie"></a>
### sessionCookie

- **Type**: API key
- **API key parameter name**: ory_kratos_session
- **Location**: 

<a name="sessionToken"></a>
### sessionToken

- **Type**: Bearer Authentication
