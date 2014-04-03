package test.rest;

import code.RestApiClient;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import stubs.generated.*;
import stubs.generated.Properties;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

import static org.testng.Assert.*;

/**
 * @author Sergey.Pak
 *         Date: 2/3/14
 *         Time: 3:43 PM
 */
@Test
public class TestProjects extends BaseRestTestCase {


  public void create_and_list_projects(){
    final String[] names = new String[5];
    final Random r = new Random();
    for (int i=0; i<names.length; i++) {
      names[i] = Long.toHexString(r.nextLong());
    }
    restApiClient.createProject(names[0]);
    restApiClient.createProject(names[1], "name:" + names[0]);
    try {
      restApiClient.createProject(names[1], "name:" + names[0]);
      fail("Should fail when creating project with the same name under the same root");
    } catch (RuntimeException ex){
      assertTrue(ex.toString().contains("Project with this name already exists: " + names[1]));
    }
    restApiClient.createProject(names[2], "name:" + names[0]);
    restApiClient.createProject(names[3], "name:" + names[1]);
    restApiClient.createProject(names[4], "name:" + names[2]);
    final Projects projects = restApiClient.listProjects();
    final List<String> namesList = new ArrayList<String>(Arrays.asList(names));
    for (Project p : projects.getProject()) {
      if (namesList.contains(p.getName())){
        namesList.remove(p.getName());
      }
    }
    assertTrue(namesList.size()==0);
  }

  public void create_nested_projects_with_the_same_name(){
    final String name = Long.toHexString(random.nextLong());
    restApiClient.createProject(name);
    restApiClient.createProject(name, "name:"+name);
    final Projects projects = restApiClient.listProjects();
    for (Project ref : projects.getProject()) {
      if (ROOT_PROJECT_ID.equals(ref.getId()) || ROOT_PROJECT_ID.equals(ref.getParentProjectId()))
        continue;

      final Project project = restApiClient.getProject("name:" + ref.getName() + ",parentProject:" + ref.getParentProjectId());
      assertEquals(project.getId(), ref.getId());
    }
  }

  public void test_project_fields(){
    final String name = Long.toHexString(random.nextLong());
    restApiClient.createProject(name);
    final String projectLocator = "name:" + name;
    restApiClient.setProjectField(projectLocator, "description", "value1");
    assertEquals(restApiClient.getProjectField(projectLocator, "description"), "value1");
    restApiClient.setProjectField(projectLocator, "description", "value2");
    assertEquals(restApiClient.getProjectField(projectLocator, "description"), "value2");
    restApiClient.setProjectField(projectLocator, "id", "value3");
    assertEquals(restApiClient.getProjectField(projectLocator, "id"), "value3");
    restApiClient.setProjectField(projectLocator, "archived", "true");
    restApiClient.setProjectField(projectLocator, "name", "value4");
    final Project project = restApiClient.getProject("id:value3");
    assertEquals(project.getDescription(), "value2");
    assertEquals(project.getName(), "value4");
    assertTrue(project.isArchived());
  }

  public void test_project_params() throws JAXBException, IOException, SAXException, ParserConfigurationException {
    final String name = Long.toHexString(random.nextLong());
    restApiClient.createProject(name);
    final String projectLocator = "name:" + name;
    final Property param1 = new Property();
    param1.setName("param1");
    param1.setValue("value1");
    restApiClient.setProjectParameter("id:_Root", "rootParam", "rootValue");
    restApiClient.setProjectParameter(projectLocator, "param1", "value1");
    restApiClient.setProjectParameter(projectLocator, "param1", "value2");
    param1.setValue("value2");
    restApiClient.setProjectParameter(projectLocator, "param2", "value3");
    final Property param2 = new Property();
    param2.setName("param2");
    param2.setValue("value3");
    final Property param1Value = restApiClient.getProjectParameter(projectLocator, "param1");
    assertEquals(param1Value.getValue(), "value2");
    final Property rootParam = restApiClient.getProjectParameter(projectLocator, "rootParam");
    assertEquals(rootParam.getValue(), "rootValue");
    final Properties parameters = restApiClient.listProjectParameters(projectLocator);
    Map<String,String> expectedMap = new HashMap<String, String>(){{
      put("param1", "value2");
      put("param2", "value3");
      put("rootParam", "rootValue");
    }};
    Map<String,String> actualMap = new HashMap<String, String>();
    for (Property property : parameters.getProperty()) {
      actualMap.put(property.getName(), property.getValue());
    }
    assertEquals(actualMap, expectedMap);
  }

  public void test_parent_project(){
    final String name = Long.toHexString(random.nextLong());
    restApiClient.createProject(name);

    restApiClient.createProject("childProject", "name:" + name);
    final Project project1 = restApiClient.getProject("name:" + name);
    final Project project2 = restApiClient.getProject("name:childProject/parentProject");
    assertEquals(project1.getId(), project2.getId());
  }

}
