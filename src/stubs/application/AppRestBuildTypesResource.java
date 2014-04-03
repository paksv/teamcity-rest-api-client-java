/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/app/rest/buildTypes")
public interface AppRestBuildTypesResource {

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response addBuildType(@QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    Response getBuildTypes(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}")
    Response getFeature(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @DELETE
    @Path("/{btLocator}/features/{featureId}")
    void deleteFeature(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @PUT
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}")
    Response replaceFeature(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters/{name}")
    Response getParameter(@PathParam("btLocator") String btLocator, @PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}")
    Response getParameterValue(@PathParam("btLocator") String btLocator, @PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/parameters/{name}")
    Response setParameterValue(@PathParam("btLocator") String btLocator, @PathParam("name") String name);

    @DELETE
    @Path("/{btLocator}/parameters/{name}")
    void deleteBuildTypeParameter(@PathParam("btLocator") String btLocator, @PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/vcs-root-entries/{id}/checkout-rules")
    Response updateVcsRootEntryCheckoutRules(@PathParam("id") String id, @PathParam("btLocator") String btLocator);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/vcs-root-entries/{id}/checkout-rules")
    Response getVcsRootEntryCheckoutRules(@PathParam("id") String id, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/newBuildTypeDescription")
    Response getExampleNewProjectDescriptionCompatibilityVersion1(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
    Response setParameter(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
    Response serveBuildTypeParameters(@PathParam("btLocator") String btLocator, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/parameters")
    Response changeBuildTypeParameters(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}/parameters")
    void deleteAllBuildTypeParameters(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
    Response getSnapshotDep(@PathParam("btLocator") String btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator);

    @DELETE
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
    void deleteSnapshotDep(@PathParam("btLocator") String btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies/{snapshotDepLocator}")
    Response replaceSnapshotDep(@PathParam("btLocator") String btLocator, @PathParam("snapshotDepLocator") String snapshotDepLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
    Response getAgentRequirements(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
    Response replaceAgentRequirements(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements")
    Response addAgentRequirement(@PathParam("btLocator") String btLocator);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/{fieldName}")
    Response getStepSetting(@PathParam("btLocator") String btLocator, @PathParam("fieldName") String fieldName, @PathParam("stepId") String stepId);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/{fieldName}")
    Response changeStepSetting(@PathParam("btLocator") String btLocator, @PathParam("fieldName") String fieldName, @PathParam("stepId") String stepId);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries/{id}")
    Response getVcsRootEntry(@PathParam("id") String id, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries/{id}")
    Response updateVcsRootEntry(@PathParam("id") String id, @PathParam("btLocator") String btLocator);

    @DELETE
    @Path("/{btLocator}/vcs-root-entries/{id}")
    void deleteVcsRootEntry(@PathParam("id") String id, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}/parameters")
    Response getFeatureParameters(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features/{featureId}/parameters")
    Response replaceFeatureParameters(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/parameters/{parameterName}")
    Response getFeatureParameter(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId, @PathParam("parameterName") String parameterName);

    @PUT
    @Consumes("*/*")
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/parameters/{parameterName}")
    Response addFeatureParameter(@PathParam("btLocator") String btLocator, @PathParam("featureId") String featureId, @PathParam("parameterName") String parameterName);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/{name}")
    Response getFeatureSetting(@PathParam("btLocator") String btLocator, @PathParam("name") String name, @PathParam("featureId") String featureId);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/features/{featureId}/{name}")
    Response changeFeatureSetting(@PathParam("btLocator") String btLocator, @PathParam("name") String name, @PathParam("featureId") String featureId);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
    Response getArtifactDeps(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
    Response replaceArtifactDeps(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies")
    Response addArtifactDep(@PathParam("btLocator") String btLocator);

    @DELETE
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
    void deleteArtifactDep(@PathParam("btLocator") String btLocator, @PathParam("artifactDepLocator") String artifactDepLocator);

    @PUT
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
    Response replaceArtifactDep(@PathParam("btLocator") String btLocator, @PathParam("artifactDepLocator") String artifactDepLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/artifact-dependencies/{artifactDepLocator}")
    Response getArtifactDep(@PathParam("btLocator") String btLocator, @PathParam("artifactDepLocator") String artifactDepLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
    Response getSnapshotDeps(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
    Response replaceSnapshotDeps(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/snapshot-dependencies")
    Response addSnapshotDep(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
    Response replaceTriggers(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
    Response addTrigger(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers")
    Response getTriggers(@PathParam("btLocator") String btLocator);

    @DELETE
    @Path("/{btLocator}/triggers/{triggerLocator}")
    void deleteTrigger(@PathParam("btLocator") String btLocator, @PathParam("triggerLocator") String triggerLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers/{triggerLocator}")
    Response replaceTrigger(@PathParam("btLocator") String btLocator, @PathParam("triggerLocator") String triggerLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/triggers/{triggerLocator}")
    Response getTrigger(@PathParam("btLocator") String btLocator, @PathParam("triggerLocator") String triggerLocator);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/triggers/{triggerLocator}/{fieldName}")
    Response getTriggerSetting(@PathParam("btLocator") String btLocator, @PathParam("triggerLocator") String triggerLocator, @PathParam("fieldName") String fieldName);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/triggers/{triggerLocator}/{fieldName}")
    Response changeTriggerSetting(@PathParam("btLocator") String btLocator, @PathParam("triggerLocator") String triggerLocator, @PathParam("fieldName") String fieldName);

    @DELETE
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
    void deleteAgentRequirement(@PathParam("btLocator") String btLocator, @PathParam("agentRequirementLocator") String agentRequirementLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
    Response replaceAgentRequirement(@PathParam("btLocator") String btLocator, @PathParam("agentRequirementLocator") String agentRequirementLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/agent-requirements/{agentRequirementLocator}")
    Response getAgentRequirement(@PathParam("btLocator") String btLocator, @PathParam("agentRequirementLocator") String agentRequirementLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-instances")
    Response getCurrentVcsInstances(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/builds/{buildLocator}")
    Response serveBuildWithProject(@PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/builds/{buildLocator}/{field}")
    Response serveBuildField(@PathParam("field") String field, @PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/branches")
    Response serveBranches(@PathParam("btLocator") String btLocator, @QueryParam("locator") String locator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcsLabeling")
    Response getVCSLabelingOptions(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcsLabeling")
    Response setVCSLabelingOptions(@PathParam("btLocator") String btLocator);

    @GET
    @Produces("*/*")
    @Path("/{btLocator}/vcs/files/latest/content{path:(/.*)?}")
    Response getVcsFileContent(@PathParam("btLocator") String btLocator, @PathParam("path") String path, @QueryParam("resolveParameters") Boolean resolveParameters);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest/children{path:(/.*)?}")
    Response getVcsFileListing(@PathParam("btLocator") String btLocator, @PathParam("path") String path, @QueryParam("resolveParameters") Boolean resolveParameters);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
    Response getSteps(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
    Response replaceSteps(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps")
    Response addStep(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
    Response getVcsRootEntries(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
    Response replaceVcsRootEntries(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs-root-entries")
    Response addVcsRootEntry(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/investigations")
    Response getInvestigations(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
    Response getFeatures(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
    Response replaceFeatures(@PathParam("btLocator") String btLocator);

    @POST
    @Consumes("*/*")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/features")
    Response addFeature(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}")
    Response replaceStep(@PathParam("btLocator") String btLocator, @PathParam("stepId") String stepId);

    @DELETE
    @Path("/{btLocator}/steps/{stepId}")
    void deleteStep(@PathParam("btLocator") String btLocator, @PathParam("stepId") String stepId);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}")
    Response getStep(@PathParam("btLocator") String btLocator, @PathParam("stepId") String stepId);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/builds")
    Response serveBuilds(@PathParam("btLocator") String btLocator, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser, @QueryParam("includePersonal") Boolean includePersonal, 
                @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag, @QueryParam("agentName") String agentName, 
                @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start, @QueryParam("count") Integer count, 
                @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/vcs/files/latest/metadata{path:(/.*)?}")
    Response getVcsFile(@PathParam("btLocator") String btLocator, @PathParam("path") String path, @QueryParam("resolveParameters") Boolean resolveParameters);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/example/newBuildTypeDescription")
    Response getExampleNewProjectDescription(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}")
    Response serveBuildTypeXML(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}")
    void deleteBuildType(@PathParam("btLocator") String btLocator);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/{field}")
    Response serveBuildTypeField(@PathParam("field") String field, @PathParam("btLocator") String btLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/{field}")
    Response setBuildTypeField(@PathParam("field") String field, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/buildTags")
    Response serveBuildTypeBuildsTags(@PathParam("btLocator") String btLocator);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/settings/{name}")
    Response serveBuildTypeSettings(@PathParam("btLocator") String btLocator, @PathParam("name") String name);

    @PUT
    @Consumes("*/*")
    @Produces("text/plain")
    @Path("/{btLocator}/settings/{name}")
    Response putBuildTypeSetting(@PathParam("btLocator") String btLocator, @PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/settings")
    Response serveBuildTypeSettings(@PathParam("btLocator") String btLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/settings")
    Response replaceBuildTypeSettings(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/template")
    Response serveBuildTypeTemplate(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/template")
    Response getTemplateAssociation(@PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{btLocator}/template")
    void deleteTemplateAssociation(@PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}/parameters")
    Response getStepParameters(@PathParam("btLocator") String btLocator, @PathParam("stepId") String stepId);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{btLocator}/steps/{stepId}/parameters")
    Response replaceStepParameters(@PathParam("btLocator") String btLocator, @PathParam("stepId") String stepId);

    @GET
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/parameters/{parameterName}")
    Response getStepParameter(@PathParam("btLocator") String btLocator, @PathParam("stepId") String stepId, @PathParam("parameterName") String parameterName);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{btLocator}/steps/{stepId}/parameters/{parameterName}")
    Response addStepParameter(@PathParam("btLocator") String btLocator, @PathParam("stepId") String stepId, @PathParam("parameterName") String parameterName);

}