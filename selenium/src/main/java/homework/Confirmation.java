package homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().sendKeys("i will kill you");
		driver.switchTo().alert().accept();
		//driver.switchTo().defaultContent();
		
		WebElement obj = driver.findElementById("demo");
		String text2 = obj.getText();
		if(text2.contains("i will you")) {
			System.out.println("kill you");
		}
		else {
			System.out.println("error");
		}
		}

	}

