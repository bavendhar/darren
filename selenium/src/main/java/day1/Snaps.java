package day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snaps {

	public static void main(String[] args, Object FileUnits) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		driver.switchTo().frame("iframeResult");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		driver.switchTo().alert().sendKeys("bavendhar");
		
		driver.switchTo().alert().accept();
		
		
		WebElement obj = driver.findElementById("demo");
		String text = obj.getText();
		if (text.contains("bavendhar")) {
			System.out.println("hi bavendhar");
			
		}
		else {
			
			System.out.println("error");
		}
	
		/*File src = driver.getScreenshotAs(OutputType.FILE);
		File dec =new File("./snaps/img.png");
		FileUtils.copyFile(src, dec);
		*/
		
		File bav = driver.getScreenshotAs(OutputType.FILE);
		File obj1 =new File("./snaps/img.png");
		FileUtils.copyFile(bav, obj1);
		
		

	}

}
