package trichy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipkartMouseHover {

	public void mouseHoverActions() throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\driver\\geckodriver_64bit.exe");
		FirefoxDriver driver =  new FirefoxDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//press on the esc ket to close sweet alert popup
		//	driver.getKeyboard().sendKeys(Keys.ESCAPE);
		driver.findElementByXPath("//button[text()='✕']").click();
		//mouse hover to the electronics tab
		WebElement TVandAppliances=driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement samsung=driver.findElementByXPath("(//span[text()='Samsung'])[1]");


		Actions builder=new Actions(driver);
		builder.moveToElement(TVandAppliances).perform();
		Thread.sleep(5000);
		builder.moveToElement(samsung).click().perform();

		WebElement minimumPrice = driver.findElementByXPath("(//div[@class='_3aQU3C'])[1]");
		WebElement maximumPrice=driver.findElementByXPath("(//div[@class='_3aQU3C'])[2]");
		Scanner scan=new Scanner(System.in);


		//get the price value
		String minprice=driver.findElementByXPath("//select[@class='fPjUPw'][1]").getText();
		String maxprice=driver.findElementByXPath("//select[@class='fPjUPw'][2]").getText();

		//while loop for condition check of minimum rice
		while(minprice=="20000")
		{
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//move for minimum price
			builder.dragAndDropBy(minimumPrice, 10, 0);
		}		
		//while loop for condition check of minimum rice 
		while(maxprice=="60000")
		{
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//move for minimum price
			builder.dragAndDropBy(maximumPrice, -10, 0);
		}	


		/*//Select minimum and maximum price from the dropdown
		WebElement minimumPrice=driver.findElementByXPath("//select[@class='fPjUPw'][1]");
		Select minimum=new Select(minimumPrice);
		minimum.selectByValue("25000");
		WebElement maximumPrice=driver.findElementByXPath("//select[@class='fPjUPw'][2]");
		Select maximum=new Select(maximumPrice);
		maximum.selectByValue("80000");*/

		//Click on the Screensize filter
		driver.findElementByXPath("//div[text()='Screen Size']/following-sibling::*").click();

		//click on the 48-55size checkbok
		driver.findElementByXPath("//div[@title='48 - 55']//label/div[@class='_1p7h2j']").click();

		//click on the first element 
		driver.findElementByXPath("//img[@alt='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']");

		//get the price of the product
		String parentPrice=driver.findElementByXPath("//a[@title='Samsung Series 6 123cm (49 inch) Full HD Curved LED Smart TV']/following::a//div[@class='_1vC4OE']").getText();
		String pPrice=parentPrice.replaceAll("//D", "");
		int parent_price=Integer.parseInt(pPrice);
		System.out.println("Price in the Parent window is: \n"+parent_price);

		//switch to new window
		Set<String> firstProductWindow=driver.getWindowHandles();
		List<String> firstProductWindowList=new ArrayList<String>();

		firstProductWindowList.addAll(firstProductWindow);
		driver.switchTo().window(firstProductWindowList.get(1));

		//get the price in the second window
		String childPrice=driver.findElementByClassName("_1vC4OE _3qQ9m1").getText();
		String cPrice=parentPrice.replaceAll("//D", "");
		int child_price=Integer.parseInt(cPrice);
		System.out.println("Price in the Parent window is: \n"+child_price);

		//click on compare check box
		driver.findElementByClassName("_1p7h2j").click();

		//compare the price in both the window
		if(parent_price==child_price)
		{
			driver.close();

			//switch back to parent window
			driver.switchTo().window(firstProductWindowList.get(0));

			//click on second product link
			driver.findElementByXPath("//img[@alt='Samsung Basic Smart 123cm (49 inch) Full HD LED TV']").click();

			//switch to child window again
			Set<String> secondProductWindow=driver.getWindowHandles();
			List<String> secondProductWindowList=new ArrayList<String>();

			secondProductWindowList.addAll(secondProductWindow);
			driver.switchTo().window(secondProductWindowList.get(1));

			//click on the compare checkbox
			driver.findElementByClassName("_1p7h2j").click();

			//close the current window and switch back to main window
			driver.close();

			//switch back to parent window
			driver.switchTo().window(secondProductWindowList.get(0));

			//click on the compare button
			driver.findElementByXPath("//span[text()='COMPARE']").click();

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//check the titke of compare page
			String comparetitle=driver.findElementByXPath("//span[text()='Compare']").getText();

			//if condition to print the lowest price
			if(parent_price<child_price)
			{
				System.out.println("Lowest price is: \n"+parent_price);
			}
			else
			{
				System.out.println("Lowest price is: \n"+child_price);
			}
		}
	}

	public static void main(String[] args) throws Throwable {

		FlipkartMouseHover hover=new FlipkartMouseHover();
		hover.mouseHoverActions();
	}

}
