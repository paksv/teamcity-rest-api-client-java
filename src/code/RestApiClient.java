package code;

import com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl;
import com.sun.xml.internal.stream.XMLEventReaderImpl;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;
import org.apache.cxf.staxutils.StaxUtils;
import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import stubs.generated.*;

import javax.ws.rs.client.ClientException;
import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.*;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created with IntelliJ IDEA.
 * User: Sergey.Pak
 * Date: 6/7/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class RestApiClient {
  //    public static final String BASE_URL_STR = "http://localhost:8080/bs";
  private String myBaseAddress;
  private String myAuthToken;
  private final JAXBContext context;
  private final Unmarshaller unmarshaller;
  private final Marshaller marshaller;
  private final ObjectFactory factory = new ObjectFactory();



  public RestApiClient(String baseAddress, String username, String password) throws JAXBException {
    myBaseAddress = baseAddress + "/httpAuth/app/rest/";
    if (username != null && password != null) {
      myAuthToken = "Basic "
        + org.apache.cxf.common.util.Base64Utility.encode((username + ":" + password).getBytes());
    }

    final Class<Property> type = Property.class;
    context = JAXBContext.newInstance(type.getPackage().getName(), type.getClassLoader(), null);
    unmarshaller = context.createUnmarshaller();
    marshaller = context.createMarshaller();
  }

  public Project getProject(String projectLocator) {
    return getEntity(projectLocator, "projects", Project.class);
  }

  public Build getBuild(String buildLocator) {
    return getEntity(buildLocator, "builds", Build.class);
  }

  public BuildType getBuildType(String buildLocator) {
    return getEntity(buildLocator, "buildTypes", BuildType.class);
  }

  public void copyBuildType(BuildType baseBuildType, String newName) {
    final Project projectRef = baseBuildType.getProject();
    String postXml = String.format("<newBuildTypeDescription name='%s' " +
      "sourceBuildTypeLocator='id:%s' copyAllAssociatedSettings='true' shareVCSRoots='false'/>",
      newName, baseBuildType.getId());
    executePost(String.format("projects/%s/buildTypes", projectRef.getId()), postXml);
  }

  public void deleteBuildType(String buildTypeId) {
    executeDelete(String.format("buildTypes/id:%s", buildTypeId));
  }

  public BuildTypes listBuildTypesByProject(String projectId) {
    return getEntity(String.format("projects/id:%s/buildTypes", projectId), BuildTypes.class);
  }

  public Projects listProjects() {
    return getEntity("projects", Projects.class);
  }

  public Projects listProjects(String locator) {
    return getEntity("projects/" + locator, Projects.class);
  }

  public void deleteProject(String projectId) {
    executeDelete("projects/id:" + projectId);
  }

  public Project createProject(String name) {
    return getEntityFromPost("projects", name, Project.class, MediaType.TEXT_PLAIN_TYPE);
  }

  public void createProject(String name, String locator) {
    String parentProjectData = locator == null ? "" : String.format("<parentProject locator='%s'/>", locator);
    String postXml = String.format("<newProjectDescription name='%s'>" +
      "%s" +
      "</newProjectDescription>", name, parentProjectData);
    executePost("projects", postXml);
  }

  public void copyProject(String name, String sourceProjectId) {
    createProjectEx(name, null, null, sourceProjectId, null, null);
  }

  public void createProjectEx(String name, String id, String parentProjectId, String sourceProjectId,
                              Map<String, String> subProjectsIdMap, Map<String, String> buildTypesIdMap) {
    StringBuilder subProjects = new StringBuilder();
    if (subProjectsIdMap != null) {
      for (Map.Entry<String, String> entry : subProjectsIdMap.entrySet()) {
        subProjects.append(String.format("<property name='%s' value='%s'/>\n", entry.getKey(), entry.getValue()));
      }
      subProjects.append("</projectsIdsMap>\n");
      subProjects.insert(0, "<projectsIdsMap>\n");
    }

    StringBuilder buildTypes = new StringBuilder();
    if (buildTypesIdMap != null) {
      for (Map.Entry<String, String> entry : buildTypesIdMap.entrySet()) {
        buildTypes.append(String.format("<property name='%s' value='%s'/>\n", entry.getKey(), entry.getValue()));
      }
      buildTypes.append("</buildTypesIdsMap>\n");
      buildTypes.insert(0, "<buildTypesIdsMap>\n");
    }


    String postXml = String.format("<newProjectDescription name='%s' %s> " +
      "%s\n%s\n%s\n%s" +
      "</newProjectDescription>",
      name,
      id == null ? "" : String.format("id='%s'", id),
      subProjects,
      buildTypes,
      parentProjectId == null ? "" : String.format("<parentProject id=\"%s\"/>", parentProjectId),
      sourceProjectId == null ? "" : String.format("<sourceProject id=\"%s\"/>", sourceProjectId)
    );
    executePost("projects", postXml);
  }


  public void createBuildTypeEx(String name, String id, String sourceBuildTypeId, String projectLocator) {
    String sourceXml = sourceBuildTypeId == null ? "" :
      String.format("<sourceBuildType id='%s'/>", sourceBuildTypeId);
    String xml = String.format("<newBuildTypeDescription name='%s' %s copyAllAssociatedSettings=\"true\">" +
      "%s" +
      "</newBuildTypeDescription>", name, id == null ? "" : String.format("id='%s'", id), sourceXml);

    executePost(String.format("projects/%s/buildTypes", projectLocator), xml);
  }

  public BuildType createBuildType(String name, String projectLocator) throws JAXBException {
    return getEntityFromPost(String.format("projects/%s/buildTypes", projectLocator), name, BuildType.class, MediaType.TEXT_PLAIN_TYPE);
  }

  public String getProjectField(String projectLocator, String paramName) {
    return executeGet(String.format("projects/%s/%s", projectLocator, paramName));
  }

  public void setProjectField(String projectLocator, String paramName, String paramValue) {
    executePut(String.format("projects/%s/%s", projectLocator, paramName), paramValue, MediaType.TEXT_PLAIN_TYPE);
  }

  public Property getProjectParameter(String projectLocator, String paramName) throws JAXBException, ParserConfigurationException, IOException, SAXException {
    final String projectParamXml = executeGet(String.format("projects/%s/parameters/%s", projectLocator, paramName), MediaType.TEXT_PLAIN_TYPE);
    return readPropertyFromResponseString(paramName, projectParamXml);
  }

  public Property getBuildTypeParameter(String btLocator, String paramName) throws JAXBException, ParserConfigurationException, IOException, SAXException {
    final String projectParamXml = executeGet(String.format("projects/%s/parameters/%s", btLocator, paramName), MediaType.TEXT_PLAIN_TYPE);
    return readPropertyFromResponseString(paramName, projectParamXml);
  }

  public Property getBuildTypeSetting(String btLocator, String paramName) throws JAXBException, ParserConfigurationException, IOException, SAXException {
    final String projectParamXml = executeGet(String.format("projects/%s/settings/%s", btLocator, paramName), MediaType.TEXT_PLAIN_TYPE);
    return readPropertyFromResponseString(paramName, projectParamXml);
  }

  public Properties listProjectParameters(String projectLocator) {
    return getEntity(String.format("projects/%s/parameters", projectLocator), Properties.class);
  }

  public Properties listBuildTypeParameters(String btLocator) {
    return getEntity(String.format("buildTypes/%s/parameters", btLocator), Properties.class);
  }

  public Properties listBuildTypeSettings(String btLocator) {
    return getEntity(String.format("buildTypes/%s/settings", btLocator), Properties.class);
  }

  public void deleteProjectParameter(String projectLocator, String paramName) {
    executeDelete(String.format("projects/%s/parameters/%s", projectLocator, paramName));
  }
  public void deleteBuildTypeParameter(String projectLocator, String paramName) {
    executeDelete(String.format("buildTypes/%s/parameters/%s", projectLocator, paramName));
  }
  public void deleteBuildTypeSetting(String projectLocator, String paramName) {
    executeDelete(String.format("buildTypes/%s/settings/%s", projectLocator, paramName));
  }

  public void setProjectParameter(String projectLocator, String paramName, String paramValue) {
    executePut(String.format("projects/%s/parameters/%s", projectLocator, paramName), paramValue, MediaType.TEXT_PLAIN_TYPE);
  }
  public void setBuildTypeParameter(String projectLocator, String paramName, String paramValue) {
    executePut(String.format("buildTypes/%s/parameters/%s", projectLocator, paramName), paramValue, MediaType.TEXT_PLAIN_TYPE);
  }

  public void setBuildTypeSetting(String btLocator, String settingsName, String settingValue){
    executePut(String.format("buildTypes/%s/settings/%s", btLocator, settingsName), settingValue, MediaType.TEXT_PLAIN_TYPE);
  }

  public void addBuildStep(String btLocator, PropEntityStep step) throws JAXBException {
    getEntityFromPost(String.format("buildTypes/%s/steps/", btLocator), serializeObject(factory.createStep(step)), PropEntityStep.class, null);
  }

  public Build triggerBuild(Build buildData) throws JAXBException {
    return getEntityFromPost("buildQueue", serializeObject(factory.createBuild(buildData)), Build.class, null);
  }

  public TestOccurrences getTest(String locator) throws JAXBException {
    return getEntity("testOccurrences", TestOccurrences.class, Collections.singletonMap("locator", locator));
  }

  public Investigations getInvestigations(String locator){
    return getEntity("investigations", Investigations.class, Collections.singletonMap("locator", locator));
  }

  private Property readPropertyFromResponseString(String propertyName, String responseData) throws IOException, SAXException, ParserConfigurationException {
    Property p = new Property();
    p.setName(propertyName);
    if (responseData.startsWith("<?")) {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      final DocumentBuilder builder = dbf.newDocumentBuilder();
      final Document doc = builder.parse(new ByteArrayInputStream(responseData.getBytes()));
      final Element documentElement = doc.getDocumentElement();
      p.setValue(documentElement.getAttribute("value"));
    } else {
      p.setValue(responseData);
    }
    return p;

  }

  private <T> T getEntityFromPost(String locator, String path, String postData, Class<T> entityClass) {
    return getEntity(String.format("%s/%s", path, locator), postData, entityClass);
  }

  private <T> T getEntity(String locator, String path, Class<T> entityClass) {
    return getEntity(String.format("%s/%s", path, locator), entityClass);
  }

  private <T> T getEntityFromPost(String path, String postData, final Class<T> entityClass, MediaType mediaType) {
    final WebClient webClient = createWebClient();
    if (mediaType != null){
      webClient.type(mediaType);
    }
    try {
      final T result = webClient.path(path).post(postData, entityClass);
      processResponse(webClient.getResponse());
      return result;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
  private <T> T getEntity(String path, Class<T> entityClass) {
    return getEntity(path, entityClass, null);
  }
  private <T> T getEntity(String path, Class<T> entityClass, Map<String, String> parameters) {
    try {
      final WebClient webClient = createWebClient().path(path);
      if (parameters != null) {
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
          if (StringUtils.isNotEmpty(entry.getValue())) {
            webClient.query(entry.getKey(), entry.getValue());
          }
        }
      }
      return webClient.get(entityClass);
    } catch (Exception ex){
      final WebClient webClient = createWebClient().path(path);
      if (parameters != null) {
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
          webClient.query(entry.getKey(), entry.getValue());
        }
      }
      final Response response = webClient.get();
      processResponse(response);
      return null;
    }
  }

  private void executePost(String path, String data) {
    executePost(path, data, null);
  }

  private String executePost(String path, String data, MediaType mediaType) {
    System.out.printf("Sending post '%s' to '%s'%n", data, path);
    WebClient baseClient = createWebClient();
    if (mediaType != null) {
      baseClient = baseClient.type(mediaType);
    }
    return processResponse(baseClient.path(path).post(data));
  }

  private String executeGet(String path){
    return executeGet(path, null);
  }
  private String executeGet(String path, MediaType mediaType){
    WebClient baseClient = createWebClient();
    if (mediaType != null) {
      baseClient = baseClient.type(mediaType);
    }
    return processResponse(baseClient.path(path).get());
  }

  private void executePut(String path, String data){
    executePut(path, data, null);
  }
  private void executePut(String path, String data, MediaType mediaType){
    System.out.printf("Sending post '%s' to '%s'%n", data, path);
    WebClient baseClient = createWebClient();
    if (mediaType != null) {
      baseClient = baseClient.type(mediaType);
    }
    processResponse(baseClient.path(path).put(data));
  }

  private void executeDelete(String path) {
    processResponse(createWebClient().path(path).delete());
  }

  private String processResponse(Response response) {
    try {
      if (response.getEntity() instanceof InputStream) {
        final String responseString = readIS((InputStream) response.getEntity());
        if (responseString != null && responseString.length() > 0) {
          System.out.println(responseString);
        }
        if (response.getStatus() / 100 != 2) {
          final RuntimeException runtimeException = new RuntimeException(String.format("status is not 2xx: %d. Data: %s", response.getStatus(), responseString));
          runtimeException.printStackTrace();
          throw runtimeException;
        }
        return responseString;
      }
      if (response.getStatus() / 100 != 2) {
        final RuntimeException runtimeException = new RuntimeException(String.format("status is not 2xx: %d. Data: %s", response.getStatus(), response.getEntity()));
        runtimeException.printStackTrace();
        throw runtimeException;
      }
    } catch (IOException e) {
      throw new RuntimeException("An error with response: " + response.getStatus());
    }
    return null;
  }

  private WebClient createWebClient() {
    WebClient webClient = WebClient.create(myBaseAddress);
    if (myAuthToken != null) {
      webClient = webClient.header("Authorization", myAuthToken);
    }
//        webClient = webClient.accept(MediaType.TEXT_PLAIN_TYPE, MediaType.APPLICATION_XML_TYPE);
    return webClient;
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

  public String serializeObject(JAXBElement<?> obj) throws JAXBException {
    StringWriter writer = new StringWriter();
    marshaller.marshal(obj, writer);
    return writer.toString();
  }
}
