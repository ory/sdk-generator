/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package sh.ory.client-kotlin-multiplatform.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import sh.ory.client-kotlin-multiplatform.apis.WorkspaceApi
import sh.ory.client-kotlin-multiplatform.models.CreateWorkspaceApiKeyBody
import sh.ory.client-kotlin-multiplatform.models.CreateWorkspaceBody
import sh.ory.client-kotlin-multiplatform.models.ErrorGeneric
import sh.ory.client-kotlin-multiplatform.models.ListWorkspaceProjects
import sh.ory.client-kotlin-multiplatform.models.ListWorkspaces
import sh.ory.client-kotlin-multiplatform.models.UpdateWorkspaceBody
import sh.ory.client-kotlin-multiplatform.models.Workspace
import sh.ory.client-kotlin-multiplatform.models.WorkspaceApiKey

class WorkspaceApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WorkspaceApi
        //val apiInstance = WorkspaceApi()

        // to test createWorkspace
        should("test createWorkspace") {
            // uncomment below to test createWorkspace
            //val createWorkspaceBody : CreateWorkspaceBody =  // CreateWorkspaceBody | 
            //val result : Workspace = apiInstance.createWorkspace(createWorkspaceBody)
            //result shouldBe ("TODO")
        }

        // to test createWorkspaceApiKey
        should("test createWorkspaceApiKey") {
            // uncomment below to test createWorkspaceApiKey
            //val workspace : kotlin.String = workspace_example // kotlin.String | The Workspace ID
            //val createWorkspaceApiKeyBody : CreateWorkspaceApiKeyBody =  // CreateWorkspaceApiKeyBody | 
            //val result : WorkspaceApiKey = apiInstance.createWorkspaceApiKey(workspace, createWorkspaceApiKeyBody)
            //result shouldBe ("TODO")
        }

        // to test deleteWorkspaceApiKey
        should("test deleteWorkspaceApiKey") {
            // uncomment below to test deleteWorkspaceApiKey
            //val workspace : kotlin.String = workspace_example // kotlin.String | The Workspace ID or Workspace slug
            //val tokenId : kotlin.String = tokenId_example // kotlin.String | The Token ID
            //apiInstance.deleteWorkspaceApiKey(workspace, tokenId)
        }

        // to test getWorkspace
        should("test getWorkspace") {
            // uncomment below to test getWorkspace
            //val workspace : kotlin.String = workspace_example // kotlin.String | 
            //val result : Workspace = apiInstance.getWorkspace(workspace)
            //result shouldBe ("TODO")
        }

        // to test listWorkspaceApiKeys
        should("test listWorkspaceApiKeys") {
            // uncomment below to test listWorkspaceApiKeys
            //val workspace : kotlin.String = workspace_example // kotlin.String | The Workspace ID or Workspace slug
            //val result : kotlin.collections.List<WorkspaceApiKey> = apiInstance.listWorkspaceApiKeys(workspace)
            //result shouldBe ("TODO")
        }

        // to test listWorkspaceProjects
        should("test listWorkspaceProjects") {
            // uncomment below to test listWorkspaceProjects
            //val workspace : kotlin.String = workspace_example // kotlin.String | 
            //val result : ListWorkspaceProjects = apiInstance.listWorkspaceProjects(workspace)
            //result shouldBe ("TODO")
        }

        // to test listWorkspaces
        should("test listWorkspaces") {
            // uncomment below to test listWorkspaces
            //val pageSize : kotlin.Long = 789 // kotlin.Long | Items per Page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val pageToken : kotlin.String = pageToken_example // kotlin.String | Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
            //val result : ListWorkspaces = apiInstance.listWorkspaces(pageSize, pageToken)
            //result shouldBe ("TODO")
        }

        // to test updateWorkspace
        should("test updateWorkspace") {
            // uncomment below to test updateWorkspace
            //val workspace : kotlin.String = workspace_example // kotlin.String | 
            //val updateWorkspaceBody : UpdateWorkspaceBody =  // UpdateWorkspaceBody | 
            //val result : Workspace = apiInstance.updateWorkspace(workspace, updateWorkspaceBody)
            //result shouldBe ("TODO")
        }

    }
}
