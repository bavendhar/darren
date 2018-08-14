package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		WebElement select = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(select);
	
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).perform();
		
		
		
		
		
		
		
		
		
		

	}

}
