package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DriverUtil.Base;
import Reporting.ReportWriter;
import Tests.AuthenticationTests;

public class AccountsPage {
	
	ReportWriter Report = new ReportWriter();
	Base base = new Base();
	
	public void fnVerifyLogin() throws Exception {
		WebElement eleAccounts = Base.driver.findElement(By.xpath("//div[@id='content']/h2"));
		
		if(eleAccounts.getText()=="My Account") {
			
			
			AuthenticationTests.reporter.LogStepPass("Logged in successfully");
		}else {
			AuthenticationTests.reporter.LogStepFail("Logged in successfully");
			AuthenticationTests.reporter.LogStepFailWithScreen("Logged in successfully", base.fnTakeScreenShot("VerifyLogin"));
		}

		
	}

}
