package day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {
	
	
	
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
	
		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("bavendhar");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		
		driver.findElementByLinkText("Edit").click();
		
		WebElement Industry = driver.findElementById("updateLeadForm_industryEnumId");
		
		
		Select sel  = new Select(Industry);
		
		sel.selectByValue("IND_SOFTWARE");
		
		
		
WebElement Ownership = driver.findElementById("updateLeadForm_ownershipEnumId");


		
		
		Select sel1  = new Select(Ownership);
		
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (WebElement each : options) {
			System.out.println(each.getText());
			
		}
				
		
		sel1.selectByValue("OWN_PARTNERSHIP");
		
		
		

WebElement PreferredCurrency = driver.findElementById("updateLeadForm_currencyUomId");
		
		
		Select sel11  = new Select(PreferredCurrency);
		
		sel11.selectByValue("ARS");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		
			
		
		
		
		
		
		
		
		

}
}