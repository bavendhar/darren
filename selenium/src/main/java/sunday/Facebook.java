package sunday;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.SystemProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementByName("firstname").sendKeys("bavendhar");
	
	driver.findElementByName("lastname").sendKeys("p");
	
	driver.findElementByName("reg_email__").sendKeys("bavendhar.barathi");
	
	driver.findElementByXPath("(//input[@type='password'])[2]").sendKeys("bavbavbav");
	
	WebElement day = driver.findElementById("day");
	Select obj=new Select(day);
	
	obj.selectByValue("19");
	
	WebElement Month = driver.findElementByName("birthday_month");
	Select obj1=new Select(Month);
	obj1.selectByVisibleText("Mar");
	
	WebElement year = driver.findElementById("year");
	Select obj2=new Select(year);
	obj2.selectByValue("1993");
	

	
	driver.findElementByXPath("(//input[@name='sex'])[2]").click();


	
	
	
	
	
	

	}

}
