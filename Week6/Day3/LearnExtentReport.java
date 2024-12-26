package learnreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	public static void main(String[] args) {
		
		
		//Step1: Set the path for the report
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/result.html");

		//Step2:Create an Report
		ExtentReports extent=new ExtentReports();
		
		//Ste3: Adding the report to the path
		extent.attachReporter(reporter);
		
		//Step4: Create the Testcase and assign the details for that
		ExtentTest test = extent.createTest("CreateLead", "CreateLead with multiple data");
		test.assignAuthor("Vineeth");
		test.assignCategory("Smoke");
		
		//Step5: Adding step level status
		test.pass("Username is entered");
		test.pass("Password is entered");
		test.pass("Login button is Clicked");
		
		//Step6:Closing the report
		extent.flush();
		
		System.out.println("done");
		
	}

}
