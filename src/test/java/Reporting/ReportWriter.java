package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportWriter {
	
	ExtentReports Extent;
	ExtentTest Test;
	

	
	public void CreateHTMLReport(String sReportName) {
		
		Extent = new ExtentReports();
		ExtentSparkReporter ExSpark = new ExtentSparkReporter(sReportName);
		Extent.attachReporter(ExSpark);
	
	}
	
	public void CreateTest(String sTestname) {

		//Creating a test
		Test = Extent.createTest(sTestname);
	}
	
	public void LogStepPass(String sDescription) {
		Test.log(Status.PASS, sDescription);
	}
	
	public void LogStepFail(String sDescription) {
		Test.log(Status.FAIL, sDescription);
	}
	
	public void LogStepFailWithScreen(String sDescription, String sScreenPath) {
		Test.fail(sDescription, MediaEntityBuilder.createScreenCaptureFromPath(sScreenPath).build());
	}
	
	public void LogStepDone(String sDescription) {
		Test.log(Status.INFO, sDescription);
	}
	
	public void FlushReports() {
		Extent.flush();
	}
		
		
		
	

}
