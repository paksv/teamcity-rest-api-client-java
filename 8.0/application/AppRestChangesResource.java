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

@Path("/app/rest/changes")
public interface AppRestChangesResource {

    @GET
    @Produces({"application/xml", "application/json"})
    Response serveChanges(@QueryParam("project") String project, @QueryParam("buildType") String buildType, @QueryParam("build") String build, @QueryParam("vcsRoot") String vcsRoot, 
                @QueryParam("sinceChange") String sinceChange, @QueryParam("start") Long start, @QueryParam("count") Integer count, @QueryParam("locator") String locator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}")
    Response serveChange(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces("text/plain")
    @Path("/{changeLocator}/{field}")
    Response getChangeField(@PathParam("field") String field, @PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/parent-changes")
    Response getParentChanges(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/parent-revisions")
    Response getChangeParentRevisions(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/vcs-root")
    Response getChangeVCSRoot(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/attributes")
    Response getChangeAttributes(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/duplicates")
    Response getChangeDuplicates(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/issues")
    Response getChangeIssue(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/buildTypes")
    Response getRelatedBuildTypes(@PathParam("changeLocator") String changeLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{changeLocator}/firstBuilds")
    Response getChangeFirstBuilds(@PathParam("changeLocator") String changeLocator);

}