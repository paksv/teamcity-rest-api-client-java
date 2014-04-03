/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/app/rest/agents")
public interface AppRestAgentsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveAgents(@QueryParam("includeDisconnected") Boolean includeDisconnected, @QueryParam("includeUnauthorized") Boolean includeUnauthorized, @QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/pool")
    Response getAgentPool(@PathParam("agentLocator") String agentLocator, @QueryParam("fields") String fields);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}/pool")
    Response setAgentPool(@PathParam("agentLocator") String agentLocator);

    @DELETE
    @Path("/{agentLocator}")
    void deleteAgent(@PathParam("agentLocator") String agentLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentLocator}")
    Response serveAgent(@PathParam("agentLocator") String agentLocator);

    @GET
    @Produces("text/plain")
    @Path("/{agentLocator}/{field}")
    Response serveAgentField(@PathParam("field") String field, @PathParam("agentLocator") String agentLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{agentLocator}/{field}")
    Response setAgentField(@PathParam("field") String field, @PathParam("agentLocator") String agentLocator);

}