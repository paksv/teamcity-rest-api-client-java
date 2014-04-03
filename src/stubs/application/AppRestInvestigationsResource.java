/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/app/rest/investigations")
public interface AppRestInvestigationsResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getInvestigations(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{investigationLocator}")
    Response serveInstance(@PathParam("investigationLocator") String investigationLocator, @QueryParam("fields") String fields);

}