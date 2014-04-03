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

@Path("/app/rest/builds")
public interface AppRestBuildsResource {

    @GET
    @Produces({"application/xml", "application/json"})
    Response serveAllBuilds(@QueryParam("buildType") String buildType, @QueryParam("status") String status, @QueryParam("triggeredByUser") String triggeredByUser, @QueryParam("includePersonal") Boolean includePersonal, 
                @QueryParam("includeCanceled") Boolean includeCanceled, @QueryParam("onlyPinned") Boolean onlyPinned, @QueryParam("tag") String tag, @QueryParam("agentName") String agentName, 
                @QueryParam("sinceBuild") String sinceBuild, @QueryParam("sinceDate") String sinceDate, @QueryParam("start") Long start, @QueryParam("count") Integer count, 
                @QueryParam("locator") String locator);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/resulting-properties/{propertyName}")
    Response getParameter(@PathParam("propertyName") String propertyName, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/artifacts")
    Response getArtifacts(@PathParam("buildLocator") String buildLocator);

    @PUT
    @Consumes("text/plain")
    @Path("/{buildLocator}/pin/")
    void pinBuild(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/pin/")
    Response getPinned(@PathParam("buildLocator") String buildLocator);

    @DELETE
    @Consumes("text/plain")
    @Path("/{buildLocator}/pin/")
    void unpinBuild(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/artifacts/metadata{path:(/.*)?}")
    Response getArtifactMetadata(@PathParam("path") String path, @PathParam("buildLocator") String buildLocator, @QueryParam("resolveParameters") Boolean resolveParameters, @QueryParam("locator") String locator);

    @DELETE
    @Path("/{buildLocator}")
    void deleteBuild(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}")
    Response serveBuild(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/resulting-properties/")
    Response serveBuildActualParameters(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/artifacts/children{path:(/.*)?}")
    Response getArtifactChildren(@PathParam("path") String path, @PathParam("buildLocator") String buildLocator, @QueryParam("resolveParameters") Boolean resolveParameters, @QueryParam("locator") String locator);

    @GET
    @Produces("*/*")
    @Path("/{buildLocator}/artifacts/content{path:(/.*)?}")
    Response getArtifactContent(@PathParam("path") String path, @PathParam("buildLocator") String buildLocator, @QueryParam("resolveParameters") Boolean resolveParameters);

    @GET
    @Produces("*/*")
    @Path("/{buildLocator}/artifacts/files{path:(/.*)?}")
    Response getArtifactFilesContent(@PathParam("path") String path, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("application/octet-stream")
    @Path("/{buildLocator}/sources/files/{fileName:.+}")
    Response serveSourceFile(@PathParam("fileName") String fileName, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/related-issues")
    Response serveBuildRelatedIssues(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/{field}")
    Response serveBuildFieldByBuildOnly(@PathParam("field") String field, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/statistics/")
    Response serveBuildStatisticValues(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("text/plain")
    @Path("/{buildLocator}/statistics/{name}")
    Response serveBuildStatisticValue(@PathParam("name") String name, @PathParam("buildLocator") String buildLocator);

    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/tags/")
    Response serveTags(@PathParam("buildLocator") String buildLocator);

    @PUT
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/xml", "application/json"})
    @Path("/{buildLocator}/tags/")
    Response replaceTags(@PathParam("buildLocator") String buildLocator);

    @POST
    @Consumes({"application/xml", "application/json"})
    @Path("/{buildLocator}/tags/")
    void addTags(@PathParam("buildLocator") String buildLocator);

    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    @Path("/{buildLocator}/tags/")
    Response addTag(@PathParam("buildLocator") String buildLocator);

    @PUT
    @Consumes("text/plain")
    @Path("/{buildLocator}/comment")
    void replaceComment(@PathParam("buildLocator") String buildLocator);

    @DELETE
    @Path("/{buildLocator}/comment")
    void deleteComment(@PathParam("buildLocator") String buildLocator);

    @GET
    @Produces("*/*")
    @Path("/{buildLocator}/statusIcon")
    Response serveBuildStatusIcon(@PathParam("buildLocator") String buildLocator);

}