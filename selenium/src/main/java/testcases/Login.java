package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;


public class Login extends ProjectMethods {
@Test(invocationCount=2,timeOut=30000)
	public void createLead() {
		
		
		WebElement lead = locateElement("linktext", "Leads");
		click(lead);
		WebElement findlead = locateElement("linktext", "Find Leads");
		click(findlead);
		WebElement phone = locateElement("xpath", "//span[text()='Phone']");
		click(phone);
	    WebElement phonenumber = locateElement("xpath", "//input[@name='phoneNumber']");
		type(phonenumber, "9952693351");
		WebElement find = locateElement("xpath", "//button[text()='Find Leads']");
		click(find);
		/*Thread.sleep(3000);
		WebElement name = locateElement("linktext", "10814");
		click(name);
		takeSnap();
		WebElement delete = locateElement("linktext", "Delete");
		click(delete);
		WebElement findlead1 = locateElement("linktext", "Find Leads");
		click(findlead1);*/
		
	}

}
