package test.rest;

import code.RestApiClient;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stubs.generated.*;

import javax.xml.bind.JAXBException;
import java.util.Random;

/**
 * @author Sergey.Pak
 *         Date: 2/4/14
 *         Time: 4:42 PM
 */
public abstract class BaseRestTestCase extends Assert {

  protected RestApiClient restApiClient;
  protected Random random = new Random();
  protected static final String ROOT_PROJECT_ID ="_Root";

  @BeforeMethod
  public void setUp() throws JAXBException {
    random = new Random();
    restApiClient = new RestApiClient("http://localhost:8112/", "s", "q");
    // delete all Projects:
    final Project rootProject = restApiClient.getProject("id:" + ROOT_PROJECT_ID);
    for (Project p : rootProject.getProjects().getProject()) {
      deleteProjectRecursively(p);
    }
  }

  @AfterMethod
  public void tearDown(){
  }

  public void deleteProjectRecursively(Project p){
    final BuildTypes buildTypes = restApiClient.listBuildTypesByProject(p.getId());
    for (BuildType bt : buildTypes.getBuildType()) {
      restApiClient.deleteBuildType(bt.getId());
    }
    final Project project = restApiClient.getProject("id:" + p.getId());
    for (Project proj : project.getProjects().getProject()) {
      deleteProjectRecursively(proj);
    }
    restApiClient.deleteProject(p.getId());
  }

  protected Property propFrom(String name, String value){
    final Property property = new Property();
    property.setName(name);
    property.setValue(value);
    return property;
  }
}
