/**
 * Created by Apache CXF WadlToJava code generator
**/
package stubs.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/app/rest/stubs.cctray")
public interface AppRestCctrayResource {

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/projects.xml")
    Response serveProjects();

}