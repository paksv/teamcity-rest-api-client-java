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

@Path("/app/rest/projects")
public interface AppRestProjectsResource {

    @POST
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    Response createEmptyProject();

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response createProject();

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveProjects(@QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters/{name}")
    Response getParameter(@PathParam("projectLocator") String projectLocator, @PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}")
    Response getParameterValue(@PathParam("projectLocator") String projectLocator, @PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{projectLocator}/parameters/{name}")
    Response putParameter(@PathParam("projectLocator") String projectLocator, @PathParam("name") String name);

    @DELETE
    @Path("/{projectLocator}/parameters/{name}")
    void deleteParameter(@PathParam("projectLocator") String projectLocator, @PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/newProjectDescription")
    Response getExampleNewProjectDescriptionCompatibilityVersion1(@PathParam("projectLocator") String projectLocator, @QueryParam("id") String id);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parentProject")
    Response getParentProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parentProject")
    Response setParentProject(@PathParam("projectLocator") String projectLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes")
    Response createBuildType(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes")
    Response serveBuildTypesInProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes")
    Response createEmptyBuildType(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters")
    Response setParameter(@PathParam("projectLocator") String projectLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters")
    Response serveParameters(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/parameters")
    Response changeAllParameters(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{projectLocator}/parameters")
    void deleteAllParameters(@PathParam("projectLocator") String projectLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}")
    Response serveBuildWithProject(@PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{projectLocator}")
    void deleteProject(@PathParam("projectLocator") String projectLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}")
    Response serveProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/{field}")
    Response serveProjectField(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{projectLocator}/{field}")
    Response setProjectFiled(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes/{btLocator}")
    Response serveBuildType(@PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates")
    Response serveTemplatesInProject(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes("text/plain")
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates")
    Response createEmptyBuildTypeTemplate(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates")
    Response createBuildTypeTemplate(@PathParam("projectLocator") String projectLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/templates/{btLocator}")
    Response serveBuildTypeTemplates(@PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/buildTypes/{btLocator}/builds/{buildLocator}/{field}")
    Response serveBuildFieldWithProject(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator);

    @DELETE
    @Path("/{projectLocator}/agentPools/{agentPoolLocator}")
    void getProjectAgentPools(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/agentPools")
    Response getProjectAgentPools(@PathParam("projectLocator") String projectLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/agentPools")
    Response setProjectAgentPools(@PathParam("projectLocator") String projectLocator);

/*
    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/agentPools")
    Response setProjectAgentPools(@PathParam("projectLocator") String projectLocator);
*/

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/buildTypes/{btLocator}/builds")
    Response serveBuilds(@PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser, 
                @QueryParam("includePersonal") Boolean includePersonal, @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag, 
                @QueryParam("agentName") String agentName, @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start, 
                @QueryParam("count") Integer count, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/buildTypes/{btLocator}/{field}")
    Response serveBuildTypeFieldWithProject(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{projectLocator}/example/newProjectDescription")
    Response getExampleNewProjectDescription(@PathParam("projectLocator") String projectLocator, @QueryParam("id") String id);

}