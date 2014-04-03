/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/app/rest/vcs-root-instances")
public interface AppRestVcsRootInstancesResource {

    @GET
    @Produces({"application/xml", "application/json"})
    Response serveInstances(@QueryParam("locator") String locator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootInstanceLocator}")
    Response serveInstance(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{vcsRootInstanceLocator}/properties")
    Response serveRootInstanceProperties(@PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @GET
    @Produces("text/plain")
    @Path("/{vcsRootInstanceLocator}/{field}")
    Response serveInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{vcsRootInstanceLocator}/{field}")
    Response setInstanceField(@PathParam("field") String field, @PathParam("vcsRootInstanceLocator") String vcsRootInstanceLocator);

}