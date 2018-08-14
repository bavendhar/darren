package sunday;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaf {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");		

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		
		driver.findElementByXPath("//a[contains(text(),'Activities')]").click();
		
		
		driver.findElementByXPath("//input[@id='workEffortName']").sendKeys("bavendhar");
		
		WebElement Status = driver.findElementByXPath("//select[@class='inputBox']");
		
		Select obj=new Select(Status);
		
		obj.selectByVisibleText("Scheduled");
		
		
		
		
		
		
	}

}
