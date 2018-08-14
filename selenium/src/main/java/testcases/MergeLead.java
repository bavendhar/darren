package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
@Test(invocationCount=2)
	public void mergelead() throws InterruptedException{
		
		WebElement linktext = locateElement("linktext", "Leads");
		click(linktext);
		WebElement mergebutton = locateElement("linktext", "Merge Leads");
		click(mergebutton);
		WebElement firstwindow = locateElement("xpath", "//img[@src='/images/fieldlookup.gif']");
		click(firstwindow);
		switchToWindow(1);
		WebElement name = locateElement("xpath", "//input[@name='firstName']");
		type(name, "virat");
		WebElement findclick = locateElement("xpath", "//button[@type='button']");
		click(findclick);
		Thread.sleep(3000);
		WebElement text = locateElement("xpath", "//a[@class='linktext']");
		String text2 = getText(text);
		WebElement viratlink = locateElement("xpath", "//a[@class='linktext']");
		clickWithNoSnap(viratlink);
		switchToWindow(0);
		
		WebElement firstwindow1 = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		click(firstwindow1);
		switchToWindow(1);
		WebElement name1 = locateElement("xpath", "//input[@name='firstName']");
		type(name1, "anuskha");
		WebElement findclick1 = locateElement("xpath", "//button[@type='button']");
		clickWithNoSnap(findclick1);
		Thread.sleep(3000);
		WebElement viratlinkk = locateElement("xpath", "//a[@class='linktext']");
		clickWithNoSnap(viratlinkk);
		switchToWindow(0);
		WebElement merge = locateElement("linktext", "Merge");
        clickWithNoSnap(merge);
        acceptAlert();
        WebElement find = locateElement("linktext", "Find Leads");
		click(find);
		WebElement id = locateElement("xpath", "//input[@name='id']");
		type(id, text2);
		WebElement click = locateElement("xpath", "//button[text()='Find Leads']");
		click(click);
		
		
		
		
		
		
		
		
		
		
		

	}

}
