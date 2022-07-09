package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DriverUtil.Base;
import Pages.AccountsPage;
import Pages.CreationPage;
import Pages.LoginPage;
import Pages.UserRegisterpage;
import Reporting.ReportWriter;

public class AuthenticationTests {
	
	
	
	
	Base ObjBase = new Base();
	UserRegisterpage PageUserReg = new UserRegisterpage();
	CreationPage PageCreation = new CreationPage();
	LoginPage PageLogin = new LoginPage();
	AccountsPage PageAccount = new AccountsPage();
	public static ReportWriter reporter = new ReportWriter();
	
	@BeforeTest
	public void Preq() {
		reporter.CreateHTMLReport("SasiMandala.html");
	}
	
	@AfterTest
	public void End() {
		reporter.FlushReports();
	}
	
	@Test (priority=1)
	public void TestRegirster() throws Exception {
		
		reporter.CreateTest("User Registeration");
		
		ObjBase.fnlaunchBrowser();
		ObjBase.fnNavigateTo("https://naveenautomationlabs.com/opencart/");
		PageUserReg.fnUserRegister("jastisaikumar2020@gmail.com");
		PageCreation.fnVerifyAccountCreation();
		ObjBase.fnCloseBrowser();
	}
	
	@Test(priority=2)
	public void TestLogin() throws Exception {
		
		reporter.CreateTest("Login Test");
		
		ObjBase.fnlaunchBrowser();
		ObjBase.fnNavigateTo("https://naveenautomationlabs.com/opencart/");
		PageLogin.fnLoginuser("jastisaikumar2020@gmail.com");
		PageAccount.fnVerifyLogin();
		ObjBase.fnCloseBrowser();
	}
	
	@Test(priority=3)
	public void TestLoginAnother() throws Exception {
		
		reporter.CreateTest("Login Test");
		
		ObjBase.fnlaunchBrowser();
		ObjBase.fnNavigateTo("https://naveenautomationlabs.com/opencart/");
		PageLogin.fnLoginuser("jastisaikumar2020@gmail.com");
		PageAccount.fnVerifyLogin();
		ObjBase.fnCloseBrowser();
	}
	
	@Test(priority=4)
	public void LogOutTest() throws Exception {
		
		reporter.CreateTest("Login Test");
		
		ObjBase.fnlaunchBrowser();
		ObjBase.fnNavigateTo("https://naveenautomationlabs.com/opencart/");
		PageLogin.fnLoginuser("jastisaikumar2020@gmail.com");
		PageAccount.fnVerifyLogin();
		ObjBase.fnCloseBrowser();
	}

}
