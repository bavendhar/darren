package Mobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Draggable").click();
		driver.switchTo().frame("demo-frame");
		WebElement drop = driver.findElementByXPath("//p[text()='Drag me around']");
		driver.switchTo().frame(drop);
		String a = driver.findElementByXPath("//p[text()='Drag me around']").getText();
		System.out.println(a);
		
		
		
		
		
		
		

	}

}
