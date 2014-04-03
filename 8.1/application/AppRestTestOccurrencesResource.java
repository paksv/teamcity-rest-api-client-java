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

@Path("/app/rest/testOccurrences")
public interface AppRestTestOccurrencesResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response getTestOccurrences(@QueryParam("locator") String locator, @QueryParam("fields") String fields);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/{testLocator}")
    Response serveInstance(@PathParam("testLocator") String testLocator, @QueryParam("fields") String fields);

}