package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/webhp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='lst-ib']").sendKeys("bavendhar");
		driver.findElementByXPath("//input[@name='btnK']").click();
		List<WebElement> bavendhar = driver.findElementsByPartialLinkText("bavendhar");
		//List<WebElement> bavendhar = driver.findElementsByLinkText("BAVENDHAR P | LinkedIn");
		int size = bavendhar.size();
		System.out.println(size);
		
		bavendhar.get(2).click();
		

	}

}
