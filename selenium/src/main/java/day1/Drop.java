package day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		Actions builders =new Actions(driver);
		builders.dragAndDrop(draggable, droppable).perform();

	}

}
