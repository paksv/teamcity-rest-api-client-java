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

@Path("/app/rest/agentPools")
public interface AppRestAgentPoolsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getPools();

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    Response setPools();

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}")
    Response getPool(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{agentPoolLocator}")
    void deletePool(@PathParam("agentPoolLocator") String agentPoolLocator);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/agents")
    Response addAgent(@PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/agents")
    Response getPoolAgents(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Response getPoolProjects(@PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @POST
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Response addProject(@PathParam("agentPoolLocator") String agentPoolLocator);

    @PUT
    @Consumes({"application/xml", "application/json" })
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects")
    Response replaceProjects(@PathParam("agentPoolLocator") String agentPoolLocator);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{agentPoolLocator}/projects/{projectLocator}")
    Response getPoolProject(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator, @QueryParam("fields") String fields);

    @DELETE
    @Path("/{agentPoolLocator}/projects/{projectLocator}")
    void deletePoolProject(@PathParam("projectLocator") String projectLocator, @PathParam("agentPoolLocator") String agentPoolLocator);

}