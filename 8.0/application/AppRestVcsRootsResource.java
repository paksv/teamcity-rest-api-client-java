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

@Path("/app/rest/vcs-roots")
public interface AppRestVcsRootsResource {

    @GET
    @Produces({"application/xml", "application/json"})
    Response serveRoots(@QueryParam("locator") String locator);

    @POST
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    Response addRoot();

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/{field}")
    Response setField(@PathParam("field") String field, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/{field}")
    Response serveField(@PathParam("field") String field, @PathParam("vcsRootLocator") String vcsRootLocator);

    @DELETE
    @Path("/{vcsRootLocator}/properties/{name}")
    void deleteParameter(@PathParam("vcsRootLocator") String vcsRootLocator, @PathParam("name") String name);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/properties/{name}")
    Response putParameter(@PathParam("vcsRootLocator") String vcsRootLocator, @PathParam("name") String name);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/properties/{name}")
    Response serveProperty(@PathParam("vcsRootLocator") String vcsRootLocator, @PathParam("name") String name);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootLocator}")
    Response serveRoot(@PathParam("vcsRootLocator") String vcsRootLocator);

    @DELETE
    @Path("/{vcsRootLocator}")
    void deleteRoot(@PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/properties")
    Response serveRootInstanceProperties(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}")
    Response serveInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}/{field}")
    Response setInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootLocator}/instances")
    Response serveRootInstances(@PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootLocator}/instances/{vcsRootInstanceLocator}")
    Response serveRootInstance(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator, @PathParam("vcsRootLocator") String vcsRootLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootLocator}/properties")
    Response serveProperties(@PathParam("vcsRootLocator") String vcsRootLocator);

    @PUT
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootLocator}/properties")
    Response changProperties(@PathParam("vcsRootLocator") String vcsRootLocator);

    @DELETE
    @Path("/{vcsRootLocator}/properties")
    void deleteAllProperties(@PathParam("vcsRootLocator") String vcsRootLocator);

}