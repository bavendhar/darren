package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public RemoteWebDriver driver;
	
	@Given("launch the browser")
	public void Launchbrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
    }
	@And("load the url")
	public void Loadurl() {
		driver.get("http://leaftaps.com/opentaps");
		
	}
	@And("set wait")
	public void Setwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("maximize the browser")
	public void Setmaxmize() {
		driver.manage().window().maximize();
	}
	@And("enter username as (.*)")
	public void Setusername(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And("enter password as (.*)")
	public void Setpassword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	@When("click the login button")
	public void Clicksubmit() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("close the browser")
	public void Closethebrowser() {
		driver.close();
	}
	@And("enter username DemoSales")
	public void enterusername() {
		driver.findElementById("username").sendKeys("DemoSales");
	}
	@And("enter password CRMSFA")
	public void enterpassword() {
		driver.findElementById("password").sendKeys("CRMSFA");
	}
	@But("click loginbutton")
	public void ClicksubmitButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("close browser")
	public void Closebrowser() {
		driver.close();
	}
	
}