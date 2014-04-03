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
import javax.ws.rs.core.Response;

@Path("/app/rest/users")
public interface AppRestUsersResource {

    @POST
    @Consumes({"application/xml", "application/json"})
    @Produces("*/*")
    Response createUser();

    @GET
    @Produces({"application/xml", "application/json"})
    Response serveUsers();

    @POST
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}/roles")
    Response addRole(@PathParam("userLocator") String userLocator);

    @PUT
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}/roles")
    Response replaceRoles(@PathParam("userLocator") String userLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}/roles")
    Response listRoles(@PathParam("userLocator") String userLocator);

    @PUT
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}")
    Response updateUser(@PathParam("userLocator") String userLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}")
    Response serveUser(@PathParam("userLocator") String userLocator);

    @DELETE
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    void deleteRole(@PathParam("userLocator") String userLocator, @PathParam("scope") String scope, @PathParam("roleId") String roleId);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    Response listRole(@PathParam("userLocator") String userLocator, @PathParam("scope") String scope, @PathParam("roleId") String roleId);

    @PUT
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    Response addRoleSimple(@PathParam("userLocator") String userLocator, @PathParam("scope") String scope, @PathParam("roleId") String roleId);

    @POST
    @Path("/{userLocator}/roles/{roleId}/{scope}")
    void addRoleSimplePost(@PathParam("userLocator") String userLocator, @PathParam("scope") String scope, @PathParam("roleId") String roleId);

    @GET
    @Produces("text/plain")
    @Path("/{userLocator}/{field}")
    Response serveUserField(@PathParam("field") String field, @PathParam("userLocator") String userLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{userLocator}/{field}")
    Response setUserField(@PathParam("field") String field, @PathParam("userLocator") String userLocator);

    @GET
    @Produces("text/plain")
    @Path("/{userLocator}/properties/{name}")
    Response serveUserProperties(@PathParam("userLocator") String userLocator, @PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{userLocator}/properties/{name}")
    Response putUserProperty(@PathParam("userLocator") String userLocator, @PathParam("name") String name);

    @DELETE
    @Path("/{userLocator}/properties/{name}")
    void removeUserProperty(@PathParam("userLocator") String userLocator, @PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{userLocator}/properties")
    Response serveUserProperties(@PathParam("userLocator") String userLocator);

}