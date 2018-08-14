package trichy;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acer {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.acer.com/ac/en/US/content/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement dri = driver.findElementByXPath("//a[@title='For Home']");
		
		
		Actions builder=new Actions(driver);
		builder.moveToElement(dri).perform();
		Thread.sleep(3000);
		
		driver.findElementByLinkText("Laptops").click();
		driver.findElementByClassName("ie-svgFix").click();
		
		driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElementByXPath("(//h3[@class='fs-1 align-center text-tertiary-dark normal'])[1]").click();
		Thread.sleep(10000);
		
		File file = driver.getScreenshotAs(OutputType.FILE);
		File pro =new File("./snaps/img6.png");
		FileUtils.copyFile(file, pro);
		
		
		

	}

}
