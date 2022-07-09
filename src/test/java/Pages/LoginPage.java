package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DriverUtil.Base;
import Reporting.ReportWriter;
import Tests.AuthenticationTests;

public class LoginPage {
	ReportWriter Report = new ReportWriter();
	
	public void fnLoginuser(String sEmailID) {
		WebElement ele = Base.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]"));		
		ele.click();
		AuthenticationTests.reporter.LogStepFail("Logged in successfully");
		WebElement ele1 = Base.driver.findElement(By.linkText("Login"));
		ele1.click();
		AuthenticationTests.reporter.LogStepFail("Logged in successfully");
		
		WebElement ele2 = Base.driver.findElement(By.xpath("//*[@id=\"input-email\"]"));		
		ele2.sendKeys(sEmailID);
		AuthenticationTests.reporter.LogStepFail("Logged in successfully");
		
		WebElement ele3 = Base.driver.findElement(By.xpath("//*[@id=\"input-password\"]"));		
		ele3.sendKeys("Saibaba");
		
		
		WebElement ele4 = Base.driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
		
		
		ele4.click();
		
	}

}
