package homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String string = driver.switchTo().alert().getText();
		System.out.println( string );
	
		
		
		
		driver.switchTo().alert().accept();
		//String string = driver.switchTo().alert().getText();
		//System.out.println( string );
	
	
		

	}

}
