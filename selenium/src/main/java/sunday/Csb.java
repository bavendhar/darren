package sunday;

import org.openqa.selenium.chrome.ChromeDriver;

public class Csb {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://chennaischoolofbanking.com/");

	

}
}