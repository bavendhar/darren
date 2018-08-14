package testcases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethod;

public class Delete extends ProjectMethods {


@Test(groups="sanity",dependsOnGroups="smoke")
	public void deletelead() throws InterruptedException   {
		
		
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
		Thread.sleep(3000);
		String text = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		WebElement name = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(name);
		
		WebElement delete = locateElement("linktext", "Delete");
		click(delete);
		WebElement findlead1 = locateElement("linktext", "Find Leads");
		click(findlead1);
		WebElement findid = locateElement("xpath", "//input[@name='id']");
		type(findid, text);
		WebElement find1 = locateElement("xpath", "//button[text()='Find Leads']");
		click(find1);
		Thread.sleep(3000);
		WebElement error = locateElement("class", "x-paging-info");
		verifyExactText(error, "No records to display");
		
}
}
