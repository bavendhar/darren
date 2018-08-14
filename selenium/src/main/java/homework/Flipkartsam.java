package homework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkartsam {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.getKeyboard().sendKeys(Keys.ESCAPE);

		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement ele = driver.findElementByXPath("//span[text()='TVs & Appliances']");

		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		Thread.sleep(3000);
		WebElement element = driver.findElementByXPath("(//span[text()='Samsung'])[2]");
		builder.moveToElement(element).pause(3000).click().build().perform();


		WebElement webElement = driver.findElementByXPath("(//select[@class='fPjUPw'])[1]");
		Select sel =new Select(webElement);
		sel.selectByValue("25000");
		Thread.sleep(2000);
		WebElement webElement2 = driver.findElementByXPath("(//select[@class='fPjUPw'])[2]");
		Select sel2 =new Select(webElement2);
		sel2.selectByValue("60000");
		Thread.sleep(3000);
		
		driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
	
		driver.findElementByXPath("//div[text()='Screen Size']").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//div[text()='48 - 55']/preceding-sibling::div").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='_3wU53n']").click();
		Set<String> allWindow = driver.getWindowHandles();
		List<String> allList =new ArrayList<String>();
		allList.addAll(allWindow);
		driver.switchTo().window(allList.get(1)); 
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(allList.get(0));
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//div[@class='_1p7h2j'])[18]").click();
		driver.findElementByXPath("(//div[@class='_1p7h2j'])[19]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='COMPARE']").click();
		
		WebElement a = driver.findElementByXPath("(//div[@class='_1vC4OE'])[1]");
		String obj = a.getText();
		System.out.println(obj);
		
		WebElement b = driver.findElementByXPath("(//div[@class='_1vC4OE'])[2]");
		String obj2 = b.getText();
		System.out.println(obj2);
		
		String x="₹59,999";
		String y="₹47,999";		
		
		String amount1=x.replaceAll("\\D","");
		String amount2=y.replaceAll("\\D","");
		
		
		int a1=Integer.parseInt(amount1);
		System.out.println(amount1);
		
		int a2=Integer.parseInt(amount2);
		System.out.println(amount2);
		
		if(a1<a2) {
			System.out.println();
			driver.findElementByLinkText("Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV").click();
		}else {
			System.out.println();
			driver.findElementByLinkText("Samsung Basic Smart 123cm (49 inch) Full HD LED TV").click();
		
		}
		Thread.sleep(7000);
		
		File bav = driver.getScreenshotAs(OutputType.FILE);
		File obj1 = new File("./snaps/img.png");
		FileUtils.copyFile(bav, obj1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
