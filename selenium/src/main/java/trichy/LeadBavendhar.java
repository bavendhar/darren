package trichy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadBavendhar {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemosalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> allWindow = driver.getWindowHandles();
		List<String> allList=new ArrayList<String>();
		allList.addAll(allWindow);
		driver.switchTo().window(allList.get(1));
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("bavendhar");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(allList.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> allWindow1 = driver.getWindowHandles();
		List<String> allList1=new ArrayList<String>();
		allList1.addAll(allWindow1);
		driver.switchTo().window(allList1.get(1));
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("arif");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(allList1.get(0));
		driver.findElementByXPath("//a[@class='buttonDangerous']").click();
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		
		File bav = driver.getScreenshotAs(OutputType.FILE);
		File past=new File("./snaps/img.png");
		FileUtils.copyFile(bav, past);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
