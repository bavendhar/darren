package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Leads {
@Test
	public  void main() throws Throwable {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	
		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		
		Set<String> allWindow = driver.getWindowHandles();
		
		/*for (String eachWindow : allWindow) {
			System.out.println(eachWindow);
		}
			
		*/
		
		List<String> allList =new ArrayList<String>();
		allList.addAll(allWindow);
		driver.switchTo().window(allList.get(1)); 
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("arif");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		/*Thread.sleep(3000);
		driver.findElementByLinkText("arif").click();
		
		allWindow = driver.getWindowHandles();
		allList.addAll(allWindow);
		driver.switchTo().window(allList.get(0));

		
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> allWindow1 = driver.getWindowHandles();
		List<String> allList1 =new ArrayList<String>();
		allList1.addAll(allWindow1);
		driver.switchTo().window(allList1.get(1)); 
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("arif");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("arif").click();

		allWindow = driver.getWindowHandles();
		allList.addAll(allWindow);
		driver.switchTo().window(allList.get(0));

		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().accept();*/
		
		
		
		
		
		
		
		

		
		

	}

}
