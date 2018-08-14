package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	@BeforeClass
	public void setdata() {
    excelFileName = "C:\\Users\\bavendhar\\eclipse-workspace\\selenium\\data\\datadata.xlsx";
	}
	
	@Test(dataProvider="fetchdata")
	public void createlead(String a,String b,String c,String d,String e) throws Throwable {
		
		WebElement link = locateElement("linktext", "Create Lead");
		click(link);
		WebElement loc = locateElement("class", "inputBox");
		type(loc, "test");
		WebElement firtname = locateElement("xpath", "(//input[@name='firstName'])[3]");
		type(firtname, a);
		WebElement lastname = locateElement("id", "createLeadForm_lastName");
		type(lastname, b);
		WebElement fname = locateElement("xpath", "//input[@name='firstNameLocal']");
		type(fname, c);
		WebElement lname = locateElement("xpath", "//input[@name='lastNameLocal']");
		type(lname, d);
		WebElement salutation = locateElement("xpath", "//input[@name='personalTitle']");
		type(salutation, e);
		Thread.sleep(3000);
		WebElement source = locateElement("xpath", "//select[@name='dataSourceId']");
		selectDropDownUsingText(source, "Conference");
		WebElement title = locateElement("name", "generalProfTitle");
		type(title, "bavyureka");
		WebElement annual = locateElement("id", "createLeadForm_annualRevenue");
		type(annual, "2000000");
		Thread.sleep(3000);
		WebElement industry = locateElement("name", "industryEnumId");
		selectDropDownUsingText(industry, "Computer Software");
		Thread.sleep(3000);
		WebElement owner = locateElement("name", "ownershipEnumId");
		selectDropDownUsingText(owner, "Partnership");
		WebElement sic = locateElement("name", "sicCode");
		type(sic, "1212");
		WebElement description = locateElement("id", "createLeadForm_description");
		type(description, "teatleaf such a best training center in chennai");
		WebElement inote = locateElement("id", "createLeadForm_importantNote");
		type(inote, "happy brouse");
		WebElement areacode = locateElement("xpath", "(//input[@name='primaryPhoneAreaCode'])[4]");
		type(areacode, "621005");
		WebElement extension = locateElement("name", "primaryPhoneExtension");
		type(extension, "arun exlo");
		WebElement departmentname = locateElement("name", "departmentName");
		type(departmentname, "automation testing");
		Thread.sleep(3000);
		WebElement currency = locateElement("name", "currencyUomId");
		selectDropDownUsingText(currency, "INR - Indian Rupee");
		WebElement numberemployees = locateElement("name", "numberEmployees");
		type(numberemployees, "25");
		WebElement tickersymbol = locateElement("id", "createLeadForm_tickerSymbol");
		type(tickersymbol, "rup");
		WebElement askforname = locateElement("name", "primaryPhoneAskForName");
		type(askforname, "arif");
		WebElement weburl = locateElement("name", "primaryWebUrl");
		type(weburl, "http://leaftaps.com");
		WebElement generaltoname = locateElement("name", "generalToName");
		type(generaltoname, "palanivel");
		WebElement generaladdress1 = locateElement("name", "generalAddress1");
		type(generaladdress1, "21a");
		WebElement generalcity = locateElement("name", "generalCity");
		type(generalcity, "trichy");
		WebElement postalcode = locateElement("xpath", "//input[@name='generalPostalCode']");
		type(postalcode, "621621");
		WebElement address2 = locateElement("name", "generalAddress2");
		type(address2, "gandhi nagar");
		Thread.sleep(3000);
		WebElement country = locateElement("id","createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(country, "India");
		Thread.sleep(3000);
		WebElement state = locateElement("id", "createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state, "TAMILNADU");
		Thread.sleep(3000);
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
	}
	  /*  @DataProvider(name="fetchdata")
		public Object[][] getData(){
	    	
	    	Object[][] data=new Object[3][5];
	    	
	    	data[0][0]="bavendhar";
	    	data[0][1]="p";
	    	data[0][2]="bav";
	    	data[0][3]="pp";
	    	data[0][4]="darren";
			
	    	
	    	data[1][0]="arif";
	    	data[1][1]="m";
	    	data[1][2]="bavbav";
	    	data[1][3]="pparif";
	    	data[1][4]="darrenarif";
	    	
	    	
	    	
	    	data[2][0]="prabu";
	    	data[2][1]="mmmm";
	    	data[2][2]="bavbavprabu";
	    	data[2][3]="prabuarif";
	    	data[2][4]="testleafprabu";
	    	
	    	return data;
			
			*/
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


	


