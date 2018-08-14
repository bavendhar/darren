package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Createlead {
	
	
public RemoteWebDriver driver;
	
@Given("launch browser")
public void Launchbrowserchrome() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver = new ChromeDriver();
}
@And("load url")
public void Loadurleaf() {
	driver.get("http://leaftaps.com/opentaps");
	
}
@And("set implicitlyWait")
public void implicitlyWait() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@And("maximiz browser")
public void Setmaxmizebrowser() {
	driver.manage().window().maximize();
}
	
	@And("enter the username as (.*)")
	public void Enterusername(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And("enter the password as (.*)")
	public void Enterpassword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	
	@When("click login button")
	public void Clicksubmitbutton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@When("click crmsfa link")
	public void Clickcrmsfalink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@When("click leads link")
	public void Clickleadslink() {
		driver.findElementByLinkText("Leads").click();
	}
	@When("click createlead link")
	public void Clickcreateleadlink() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("enter companyname as (.*)")
	public void Setcompanyname(String data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	
	@And("enter firstname as (.*)")
	public void Setfirstname(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	
	@And("enter lastname as (.*)")
	public void Setlastname(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	
	@When("click create button")
	public void Clickcreatebutton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("close the browser window")
	public void Closebrowserwindow() {
		driver.close();
	}
}
