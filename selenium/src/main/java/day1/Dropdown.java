package day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
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
		
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select sel  = new Select(source);
		List<WebElement> options = sel.getOptions();
		
		
		int size = options.size();
		System.out.println(size);
		
		for (WebElement each : options) {
			System.out.println(each.getText());
		}
		sel.selectByValue("LEAD_EMPLOYEE");
		
		
		
		 
	
		
		

	}

	
	
	
	
	
	
	
}
