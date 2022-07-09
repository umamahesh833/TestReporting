package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DriverUtil.Base;
import Reporting.ReportWriter;
import Tests.AuthenticationTests;

public class CreationPage {
	ReportWriter Report = new ReportWriter();
	Base base = new Base();
	
	public void fnVerifyAccountCreation() {
		WebElement eleConfirmMessage = Base.driver.findElement(By.xpath("//div[@id='content']/h1"));
		String ConMessage = eleConfirmMessage.getText();
		if(ConMessage.equals("Your Account Has Been Created!")) {
			AuthenticationTests.reporter.LogStepPass("Account Creation was Successfull");
		}else {
			AuthenticationTests.reporter.LogStepFail("Account Creation was not Successfull");
		}
	}
	
	

}
