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

@Path("/app/rest/buildQueue")
public interface AppRestBuildQueueResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getBuilds(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @DELETE
    void deleteBuildsExperimental(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response replaceBuilds(@QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response queueNewBuild();

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{buildLocator}/example/buildCancelRequest")
    Response cancelBuild(@PathParam("buildLocator") String buildLocator);

/*
    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}")
    Response cancelBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator);
*/

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}")
    Response getBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{queuedBuildLocator}")
    void deleteBuild(@PathParam("queuedBuildLocator") String queuedBuildLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{queuedBuildLocator}/compatibleAgents")
    Response serveCompatibleAgents(@PathParam("queuedBuildLocator") String queuedBuildLocator, @QueryParam("fields") String fields);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/{field}")
    Response serveBuildFieldByBuildOnly(@PathParam("field") String field, @PathParam("buildLocator") String buildLocator);

}