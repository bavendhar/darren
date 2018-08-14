package day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		driver.switchTo().frame("iframeResult");
		
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
	
		
		
		

	}

}
