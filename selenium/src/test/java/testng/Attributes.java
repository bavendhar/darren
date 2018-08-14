package testng;

import org.testng.annotations.Test;

public class Attributes {
  @Test()
  public void create() {
  }
  
  @Test(dependsOnMethods="edit")
  public void find() {
  }
  
  @Test(dependsOnMethods="create")
  public void edit() {
  }
}
