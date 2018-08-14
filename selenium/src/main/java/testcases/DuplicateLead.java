package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
@Test(groups="smoke")
	public void duplicate() throws InterruptedException {
		
	
	WebElement linktext = locateElement("linktext", "Leads");
	click(linktext);
	WebElement findlead = locateElement("linktext", "Find Leads");
	click(findlead);
	WebElement email1 = locateElement("xpath", "//span[text()='Email']");
	click(email1);
	WebElement eamil2 = locateElement("xpath", "//input[@name='emailAddress']");
	type(eamil2, "bavendhar.barathi@gmail.com");
	WebElement button = locateElement("xpath", "(//button[@type='button'])[7]");
	click(button);
	WebElement mail = locateElement("linktext", "bavendharbarathi");
	click(mail);
	WebElement duplicate = locateElement("linktext", "Duplicate Lead");
	click(duplicate);
	WebElement submit = locateElement("xpath", "//input[@name='submitButton']");
	click(submit);
	Thread.sleep(3000);
	takeSnap();
	closeBrowser();
		
	

	}

}
