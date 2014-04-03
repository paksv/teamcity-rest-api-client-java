package code;

import stubs.generated.*;

import javax.xml.bind.JAXBException;
import java.util.Date;

public class MyTries {

  public static void main(String[] args) throws JAXBException {
    RestApiClient client = new RestApiClient("http://localhost:8111/", "s", "q");
    ObjectFactory fact = new ObjectFactory();

/*
    final Investigations investigations = client.getInvestigations("buildType:id:TestProj_TestConf");
    for (Investigation inv : investigations.getInvestigation()) {
      System.out.println(client.serializeObject(fact.createInvestigation(inv)));
    }
*/

/*
    final TestOccurrences tests = client.getTest("id:169,build:(id:55)");
    for (TestOccurrence test : tests.getTestOccurrence()) {
      System.out.println(client.serializeObject(fact.createTestOccurrence(test)));
    }
*/

//      client.createProject("TestProj");
//      client.createBuildType("TestConf", "name:TestProj");

/*
    final PropEntityStep step2 = new PropEntityStep();
    step2.setType("simpleRunner");
    step2.setName("My mega step");
    final Properties props2 = new Properties();
    props2.getProperty().add(propFrom("command.executable", "echo"));
    props2.getProperty().add(propFrom("command.parameters", "hello"));
    props2.getProperty().add(propFrom("teamcity.step.mode", "default"));
    step2.setProperties(props2);
    client.addBuildStep("id:TestProj_TestConf", step2);
*/

    Build buildData = new Build();
    buildData.setBuildTypeId("TestProj_TestConf");
    Properties buildProps = new Properties();
    buildData.setPersonal(true);
    buildProps.getProperty().add(propFrom("req", "50"));
    buildData.setProperties(buildProps);
    final Comment value = new Comment();
    value.setText("Testttt");
    buildData.setComment(value);
    AgentRef agent = new AgentRef();
    agent.setId(1);
    buildData.setAgent(agent);
    System.out.println(client.serializeObject(new ObjectFactory().createBuild(buildData)));

    client.triggerBuild(buildData);
    client.triggerBuild(buildData);

  }

  private static Property propFrom(String name, String value){
    final Property property = new Property();
    property.setName(name);
    property.setValue(value);
    return property;
  }

}