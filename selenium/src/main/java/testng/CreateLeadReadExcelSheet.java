package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateLeadReadExcelSheet  extends ProjectMethods {
	@BeforeClass
	public void setData()	{
		excelFileName ="./data/readExcel.xlsx"	;
	}
	@Test(dataProvider ="fetchExcelData"/*, groups="smoke"*/)
	public void createlead(String cName, String fName, String lName, String email, String phnNum) {
		click(locateElement ("linktext","Create Lead"));
		type(locateElement("id","createLeadForm_companyName"), cName);
		type(locateElement("id","createLeadForm_firstName"), fName);
		type(locateElement("id","createLeadForm_lastName"),lName);
		type(locateElement("id","createLeadForm_primaryEmail"),email);
		type(locateElement("id","createLeadForm_primaryPhoneNumber"),phnNum);//""+ is used before phnNum to append string value to int. 
		click(locateElement("name","submitButton"));
	}
}

