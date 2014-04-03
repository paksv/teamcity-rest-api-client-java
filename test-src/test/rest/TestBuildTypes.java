package test.rest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stubs.generated.*;

import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey.Pak
 *         Date: 2/4/14
 *         Time: 4:42 PM
 */

@Test
public class TestBuildTypes extends BaseRestTestCase {

  private Project restProject;
  private String projectLocator;
  private BuildType myBT;
  private String btLocator;

  @BeforeMethod
  @Override
  public void setUp() throws JAXBException {
    super.setUp();
    try {
    restProject = restApiClient.createProject("RestProject");
    projectLocator = "id:"+restProject.getId();
    myBT = restApiClient.createBuildType("MyBT", projectLocator);
    btLocator = "id:" + myBT.getId();
    } catch (Exception ex){}
  }



  public void test_bt_parameters() throws JAXBException {
    restApiClient.setBuildTypeParameter(btLocator, "btParam", "btParamValue");
    restApiClient.setProjectParameter(projectLocator, "projectParam", "projectParamValue");
    final Properties properties = restApiClient.listBuildTypeParameters(btLocator);
    Map<String,String> paramsCheck = new HashMap<String, String>();
    paramsCheck.put("btParam", "btParamValue");
    paramsCheck.put("projectParam", "projectParamValue");
    for (Property p : properties.getProperty()) {
      final String check = paramsCheck.get(p.getName());
      if (check != null){
        assertEquals(p.getValue(), check);
      }
    }
    restApiClient.setBuildTypeParameter(btLocator, "projectParam", "projectBtParamValue");
    paramsCheck.put("projectParam", "projectBtParamValue");
    for (Property p : properties.getProperty()) {
      final String check = paramsCheck.get(p.getName());
      if (check != null){
        assertEquals(p.getValue(), check);
      }
    }
  }

  public void test_bt_settings() throws JAXBException {
    restApiClient.setBuildTypeSetting(btLocator, "buildNumberCounter", "100");
    {
      final PropEntityStep step = new PropEntityStep();
      step.setType("simpleRunner");
      restApiClient.addBuildStep(btLocator, step);
    }
    {
      final PropEntityStep step2 = new PropEntityStep();
      step2.setType("simpleRunner");
      step2.setName("My mega step");
      final Properties props2 = new Properties();
      props2.getProperty().add(propFrom("command.executable", "echo"));
      props2.getProperty().add(propFrom("command.parameters", "hello"));
      props2.getProperty().add(propFrom("teamcity.step.mode", "default"));
      step2.setProperties(props2);
      restApiClient.addBuildStep(btLocator, step2);
    }

  }

}
