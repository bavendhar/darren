package sunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@href='https://jqueryui.com/draggable/']").click();
		WebElement drop = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(drop);
		String a = driver.findElementByXPath("//p[text()='Drag me around']").getText();
		System.out.println(a);
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		

	}

}
