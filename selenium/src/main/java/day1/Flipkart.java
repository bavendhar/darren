package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement ele = driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		

	}

}
