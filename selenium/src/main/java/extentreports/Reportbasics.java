package extentreports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reportbasics {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/report.html");
		html.setAppendExisting(true);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest suittest = extent.createTest("createlead","create test case");
		
		ExtentTest test = suittest.createNode("leads");
		test.assignAuthor("sarath");
		test.assignCategory("smoke");
		
		
		test.pass("the data demosalesmanager entered successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		
		
		test.pass("crmsfa entered successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		
		test.pass("login clicked successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		
		extent.flush();
		
		
		
		
		
	}
}
