/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/app/rest")
public interface AppRestResource {

    @GET
    @Produces("text/plain")
    Response serveRoot();

    @GET
    @Produces("text/plain")
    @Path("/apiVersion")
    Response serveApiVersion();

    @GET
    @Produces("application/xml")
    @Path("/info")
    Response servePluginInfo();

    @GET
    @Produces("text/plain")
    @Path("/{projectLocator}/{btLocator}/{buildLocator}/{field}")
    Response serveBuildFieldShort(@PathParam("field") String field, @PathParam("projectLocator") String projectLocator, @PathParam("btLocator") String btLocator, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("text/plain")
    @Path("/version")
    Response serveVersion();

}