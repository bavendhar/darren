package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//launch app
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		//Enter username
		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("testleaf");

		driver.findElementById("createLeadForm_firstName").sendKeys("bavendhar");
		driver.findElementById("createLeadForm_lastName").sendKeys("p");
		driver.findElementByClassName("smallSubmit").click();
	}

}
