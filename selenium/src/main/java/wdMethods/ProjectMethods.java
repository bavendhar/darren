package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;

import xlsheet.ReadExcel;

public class ProjectMethods extends SeMethod {

	public String  excelFileName;
	@BeforeSuite
	public void begin() {
		beginResult();
	}
	@BeforeClass
	public void StartTest() {
		StartTestcases();
	}
	
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url,String uname,String pass) {
		
		ExtentTest test = suittest.createNode("leads");
		test.assignAuthor("sarath");
		test.assignCategory("smoke");
		
		
		

		startApp("chrome", url);
		WebElement username = locateElement("id", "username");
		type(username,  uname);
		WebElement password = locateElement("id", "password");
		type(password,pass);
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		WebElement crm = locateElement("linktext", "CRM/SFA");
		click(crm);
	}
	@DataProvider(name="fetchdata")
	public Object[][] getData() throws IOException{

		ReadExcel excel =new ReadExcel();
		return excel.fetchdata(excelFileName);


	}



}
