package DriverUtil;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Reporting.ReportWriter;
import Tests.AuthenticationTests;

public class Base {
	
	public static WebDriver driver;
	
	
	
	
	public void fnlaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");		
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		AuthenticationTests.reporter.LogStepDone("Browser Launched");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Page load time
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	
	public void fnNavigateTo(String sUrl) throws Exception {
		driver.navigate().to(sUrl);	
		AuthenticationTests.reporter.LogStepDone("Navigated to Url - "+sUrl);
		AuthenticationTests.reporter.LogStepFailWithScreen("Navigate to URIL", fnTakeScreenShot("Navigate"));
	}
	
	public void fnCloseBrowser() {
		driver.quit();
		AuthenticationTests.reporter.LogStepDone("Browser Closed");
	}
	
	public String fnTakeScreenShot(String sImageName) throws Exception {
		
		TakesScreenshot TkScrnSht = (TakesScreenshot)driver;		
		File fs = TkScrnSht.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("C:\\Users\\ukadiyala\\Desktop\\ExtentReport\\"+sImageName));	
		
		return "C:\\Users\\ukadiyala\\Desktop\\ExtentReport\\"+sImageName;
		
	}
}
