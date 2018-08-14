package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	@Test(groups="smoke")
	public void editlead() throws InterruptedException {
		
		
		WebElement linktext = locateElement("linktext", "Leads");
		click(linktext);
		WebElement findlead = locateElement("linktext", "Find Leads");
		click(findlead);
		WebElement firstname = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(firstname, "bavendhar");
		WebElement find = locateElement("xpath","(//button[@class='x-btn-text'])[7]");
		click(find);
		WebElement linktext1 = locateElement("linktext", "bavendhar");
		click(linktext1);
		WebElement edit = locateElement("linktext", "Edit");
		click(edit);
		WebElement changecompanyname = locateElement("id", "updateLeadForm_companyName");
		changecompanyname.clear();
		type(changecompanyname, "tcs");
		WebElement update = locateElement("xpath", "//input[@class='smallSubmit']");
		click(update);
		closeBrowser();
		
		
		
	}

	
		
		
		
		

	

}
