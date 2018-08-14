package bavendhar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//span[text()='AGENT LOGIN'])[1]").click();
		
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWindow = driver.getWindowHandles();
		for(String eachWindow : allWindow){
			System.out.println(eachWindow);
			
		}
		List<String> allList =new ArrayList<String>();
		allList.addAll(allWindow);
		driver.switchTo().window(allList.get(1));
		System.out.println(driver.getTitle());
		//driver.switchTo().window(allList.get(0));
		driver.close();
		
		
		

	}

}

