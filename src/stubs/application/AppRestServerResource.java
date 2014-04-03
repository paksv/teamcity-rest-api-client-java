/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/app/rest/server")
public interface AppRestServerResource {

    @GET
    @Produces({"application/xml", "application/json" })
    Response serveServerInfo();

    @POST
    @Produces("text/plain")
    @Path("/backup")
    Response startBackup(@QueryParam("fileName") String fileName, @QueryParam("addTimestamp") Boolean addTimestamp, @QueryParam("includeConfigs") Boolean includeConfigs, @QueryParam("includeDatabase") Boolean includeDatabase, 
                @QueryParam("includeBuildLogs") Boolean includeBuildLogs, @QueryParam("includePersonalChanges") Boolean includePersonalChanges);

    @GET
    @Produces("text/plain")
    @Path("/backup")
    Response getBackupStatus();

    @GET
    @Produces("text/plain")
    @Path("/{field}")
    Response serveServerVersion(@PathParam("field") String field);

    @GET
    @Produces({"application/xml", "application/json" })
    @Path("/plugins")
    Response servePlugins();

}