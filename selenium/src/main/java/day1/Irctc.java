package day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("bav");
		driver.findElementById("userRegistrationForm:password").sendKeys("bavendhar");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("bavendhar");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?",Keys.TAB);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("kutty");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("bav");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("endhar");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("p");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("19");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("MAR");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1993");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Public");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("789461335");
		driver.findElementById("userRegistrationForm:idno").sendKeys("554545");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("bavendhar.barathi@gamil.com");
		
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9952693351");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("21");
		driver.findElementById("userRegistrationForm:street").sendKeys("secondstreet");
		driver.findElementById("userRegistrationForm:area").sendKeys("mannachanallur");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("621005",Keys.TAB);
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Tiruchirappalli ");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Manachanalloor S.O");
		driver.findElementById("userRegistrationForm:landline").sendKeys("04312560093");
	
		
		
		
		





	}

}
