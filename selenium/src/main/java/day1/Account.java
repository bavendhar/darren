  package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Account {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Accounts").click();

		driver.findElementByLinkText("Create Account").click();

		driver.findElementById("accountName").sendKeys("testleaf");

		driver.findElementById("groupNameLocal").sendKeys("bavendhar");
		
		driver.findElementById("annualRevenue").sendKeys("600000");
		
		driver.findElementByName("industryEnumId").sendKeys("Distribution");	
		
		driver.findElementByName("ownershipEnumId").sendKeys("Public Corporation");	
		
		driver.findElementById("sicCode").sendKeys("id100");
		
		driver.findElementById("dataSourceId").sendKeys("Existing Customer");
		
		driver.findElementById("initialTeamPartyId").sendKeys("Demo Sales Team No. 1");
		
		driver.findElementByName("description").sendKeys("good");
		
		driver.findElementByName("importantNote").sendKeys("hello");
		
		driver.findElementById("officeSiteName").sendKeys("testleaf");
		
		driver.findElementById("currencyUomId").sendKeys("INR - Indian Rupee");
		
		driver.findElementById("numberEmployees").sendKeys("20");
		
		driver.findElementById("tickerSymbol").sendKeys("rupee");
		
		
		driver.findElementById("marketingCampaignId").sendKeys("Automobile");
		
		
		
		driver.findElementById("primaryPhoneCountryCode").clear();
		
		
		
		
		
		driver.findElementById("primaryPhoneAreaCode").sendKeys("621005");
		
		driver.findElementById("primaryPhoneExtension").sendKeys("gggggggg");
		
		driver.findElementById("primaryEmail").sendKeys("bavendhar.barathi@gmail.com");
		
		driver.findElementById("generalToName").sendKeys("bavendhar");
		
		driver.findElementById("generalAddress1").sendKeys("gandhi nagar");
		
		driver.findElementById("generalCity").sendKeys("trichy");
		
		driver.findElementById("generalPostalCode").sendKeys("621005");
		
		driver.findElementById("generalPostalCodeExt").sendKeys("621621");
		
		driver.findElementById("primaryPhoneNumber").sendKeys("9952693351");
		
		driver.findElementById("primaryPhoneAskForName").sendKeys("arf");
		
		driver.findElementById("primaryWebUrl").sendKeys("http");
		
		driver.findElementById("generalAttnName").sendKeys("bav");
		
		driver.findElementById("generalAddress2").sendKeys("2ndcross");
		
		driver.findElementById("generalCountryGeoId").sendKeys("India");
		Thread.sleep(5000);
		
		driver.findElementById("generalStateProvinceGeoId").sendKeys("TAMILNADU");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
