package Mobile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("childIframe");
		driver.findElementByXPath("//button[text()='Close Me']").click();
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
