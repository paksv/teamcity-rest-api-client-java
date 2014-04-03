package code;

import stubs.generated.*;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;
import java.io.*;
import java.io.File;
import java.net.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Sergey.Pak
 * Date: 5/31/13
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldClient {
    public static void main(String[] argv) throws IOException, JAXBException, URISyntaxException {



        String authorizationHeader = "Basic "
//                + org.apache.cxf.common.util.Base64Utility.encode("sergey:qwerty".getBytes());
                + org.apache.cxf.common.util.Base64Utility.encode("testaccess:q".getBytes());

        post(new URL("http://localhost:8080/bs/asdsadsadsa"),null, authorizationHeader );
        post(new URL("http://localhost:8080/bs/res/%3Cscript%3Ealert(%22aaa%22!)%3C/script%3E"),null, authorizationHeader );

        for (int i=1113; i>0; i--){
            for (int j=1; j<4; j++) {
                post(new URL("http://localhost:8080/bs/ajax.html?comment=aaa&kill="+i+"&operationKind="+j+"&submit=Remove"),null, authorizationHeader );
            }
        }

        java.io.File file = new File("D:\\");
        final long usableSpace = file.getUsableSpace();
        post(new URL("http://localhost:8080/bs/httpAuth/app/rest/projects/"), "newtest1", authorizationHeader);

        System.out.println();
        {
            WebClient client = WebClient.create("http://localhost:8080/bs/httpAuth/app/rest/buildTypes/id:Commonsio_One/builds/")
                    .header("Authorization", authorizationHeader).accept("application/xml");
            final Builds builds = client.invoke("GET", null, Builds.class);
            System.out.println();
/*
          for (BuildRef buildRef : builds.getBuild()) {
              System.out.printf("%s %s %s%n", buildRef.getId(), buildRef.getNumber(), buildRef.getStatus());
          }
*/
        }
        {
            WebClient client = WebClient.create("http://localhost:8080/bs/httpAuth/app/rest/")
                    .header("Authorization", authorizationHeader).accept("application/xml");
            final Builds builds = client.path("/buildTypes/Commonsio_One/builds").get(Builds.class);
            for (Build buildRef : builds.getBuild()) {
                System.out.printf("%s %s %s%n", buildRef.getId(), buildRef.getNumber(), buildRef.getStatus());
            }
        }
        WebClient client = WebClient.create("http://localhost:8080/bs/app/rest/projects")
                .header("Authorization", authorizationHeader);

        final Projects projects = client.get(Projects.class);

//      client.back(false);

        final Project srcProject = projects.getProject().get(1);

        final BuildTypes buildTypes = client.path(String.format("/%s/buildTypes", srcProject.getId())).get(BuildTypes.class);

        final BuildType firstBuildType = buildTypes.getBuildType().get(0);
        for (int i = 70; i < 250; i++) {
            client = WebClient.create("http://localhost:8080/bs/httpAuth/app/rest/projects/" + srcProject.getId() + "/buildTypes")
                    .header("Authorization", authorizationHeader).accept("application/xml");
/*
          final String format = String.format("<newProjectDescription name='%s' " +
//                  " id='%s' " +
                  " sourceProjectLocator='id:%s' " +
                  " copyAllAssociatedSettings='true' shareVCSRoots='false'/>","Copy_" + i,
//                  "Copy_" + i,
                  srcProject.getId());
*/
            final String format = String.format("<newBuildTypeDescription name='%s' " +
//                  " id='%s' " +
                    " sourceBuildTypeLocator='id:%s' " +
                    " copyAllAssociatedSettings='true' shareVCSRoots='false'/>",
                    "Configo_" + i,
//                  "Copy_" + i,
                    firstBuildType.getId());
            System.out.println(format);
            final Response post = client.post(format);
            System.out.println(readIS((InputStream) post.getEntity()));
            System.out.println(post.getStatus());
//          post(new URL("http://sergey:qwerty@localhost:8080/bs/httpAuth/app/rest/projects"), format, authorizationHeader);
//          client.back(false);
        }

    }

    private static String readIS(InputStream is) throws IOException {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        int ch;
        while ((ch = is.read()) >= 0) {
            bOut.write(ch);
        }

        is.close();


        return bOut.toString();
    }

    private static String post(URL url, String data, String authHeader) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("Content-Type", "text/plain");
//        conn.setRequestProperty("Content-Type", "application/xml");
        conn.setRequestProperty("Authorization", authHeader);
        if (data != null) {
            conn.setDoOutput(true);
            conn.getOutputStream().write(data.getBytes());
            conn.getOutputStream().close();
        }
        System.out.println(conn.getResponseCode());
        for (Map.Entry<String, List<String>> entry : conn.getHeaderFields().entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), Arrays.toString(entry.getValue().toArray()));
        }

        return readIS(conn.getInputStream());
    }

}