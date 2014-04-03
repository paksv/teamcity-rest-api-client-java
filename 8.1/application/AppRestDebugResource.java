/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/app/rest/debug")
public interface AppRestDebugResource {

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Path("/database/query/{query}")
    Response executeDBQuery(@PathParam("query") String query, @QueryParam("fieldDelimiter") @DefaultValue(", ") String fieldDelimiter, @QueryParam("count") @DefaultValue("1000") Integer count);

    @POST
    @Produces({"application/xml", "application/json" })
    @Path("/vcsCheckingForChangesQueue")
    Response scheduleCheckingForChanges(@QueryParam("locator") String locator);

    @GET
    @Produces("text/plain; charset=UTF-8")
    @Path("/database/tables")
    Response listDBTables();

}