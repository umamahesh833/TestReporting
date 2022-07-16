package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DriverUtil.Base;
import Reporting.ReportWriter;
import Tests.AuthenticationTests;

public class LoginPage {
	
	
	
	ReportWriter Report = new ReportWriter();
	
	By MyAccountElement = By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]");
	By LoginElement = By.linkText("Login");
	By emailElement = By.xpath("//*[@id=\"input-email\"]");
	By passwordelement= By.xpath("//*[@id=\"input-password\"]");
	By loginbuttonelement= By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input");

	
	public void fnLoginuser(String sEmailID) {
		
		WebElement eleMyAccount = Base.driver.findElement(MyAccountElement);		
		eleMyAccount.click();		
		AuthenticationTests.reporter.LogStepFail("Logged in successfully");
		
		//Clicking on Login link
		WebElement Login = Base.driver.findElement(LoginElement);
		Login.click();
		
		
		AuthenticationTests.reporter.LogStepFail("Logged in successfully");
		
		WebElement emailEle = Base.driver.findElement(emailElement);		
		emailEle.sendKeys(sEmailID);
		AuthenticationTests.reporter.LogStepFail("Logged in successfully");
		
		WebElement elepassword = Base.driver.findElement(passwordelement);		
		elepassword.sendKeys("Saibaba");
		
		
		WebElement loginbutton = Base.driver.findElement(loginbuttonelement);
		
		
		loginbutton.click();
		
	}

}
