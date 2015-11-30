package code;

import java.util.Random;
import stubs.generated.*;

import javax.xml.bind.JAXBException;
import java.util.Date;

public class MyTries {

  public static void main(String[] args) throws JAXBException, InterruptedException {
    RestApiClient client = new RestApiClient("http://localhost:8111/", "s", "q");
    Random r = new Random();
    createProjectAndAddRole(client);
/*
    for (int i=0; i<2000; i++) {
      triggerBuild(client, "Three_Fast", null);
      System.out.println(i);
    }
*/
  }

  private static void triggerBuild(final RestApiClient client, final String buildTypeId, final Property prop) throws JAXBException {
    Build buildData = new Build();
    buildData.setBuildTypeId(buildTypeId);
    if (prop != null) {
      Properties buildProps = new Properties();
      buildProps.getProperty().add(prop);
      buildData.setProperties(buildProps);
      final Comment value = new Comment();
      value.setText("Triggered via REST");
      buildData.setComment(value);
    }
    client.triggerBuild(buildData);
  }

  private static void createProjectAndAddRole(final RestApiClient client){
    final Users users = client.listUsers();
    for (User user : users.getUser()) {
      final Long userId = user.getId();

      if ("s".equals(user.getUsername()))
        continue;
      final String projectName = user.getName() == null ? user.getUsername() : user.getName();
      client.copyProject(projectName, "Stub");
      client.addUserRole(userId.toString(), projectName, "PROJECT_ADMIN");
    }
  }


  private static Property propFrom(String name, String value){
    final Property property = new Property();
    property.setName(name);
    property.setValue(value);
    return property;
  }

}