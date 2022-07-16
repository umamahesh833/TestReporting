package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DriverUtil.Base;

public class UserRegisterpage {
	
	By MyAccountElement = By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]");
	By RegisterElement = By.linkText("Register");
	By Firstnameelement =By.id("input-firstname");
	By Lastnameelement =By.id("input-lastname");
	By emailelement =By.xpath("//input[@id='input-email']");
	By telephoneelement=By.id("input-telephone");
	By elepassword=By.id("input-password");
	By elementconfirmpassword=By.id("input-confirm");
	By elementsubcribe=By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input");
	By elementprivacy=By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]");
	By elementcontinubtn=By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]");
	



	
	public void fnUserRegister(String sEmailID) {
		
	
		WebElement eleaccount = Base.driver.findElement(MyAccountElement);		
		eleaccount.click();
		WebElement eleregister = Base.driver.findElement(MyAccountElement);

		eleregister.click();
		WebElement elefirstname = Base.driver.findElement(Firstnameelement);
		elefirstname.sendKeys("sai12");
		
		WebElement elelastname = Base.driver.findElement(Lastnameelement);
		elelastname.sendKeys("jastisai12");
		
		
		WebElement eleemail = Base.driver.findElement(emailelement);
		eleemail.sendKeys(sEmailID);
		
		WebElement eletelephone = Base.driver.findElement(telephoneelement);
		eletelephone.sendKeys("9676245585");	
		
		WebElement elementpassword = Base.driver.findElement(elepassword);
		elementpassword.sendKeys("Saibaba");
		
		
		WebElement elepassconfirm = Base.driver.findElement(elementconfirmpassword);
		elepassconfirm.sendKeys("Saibaba");
		
		WebElement elesubscribe = Base.driver.findElement(elementsubcribe);
		elesubscribe.click();
		

		WebElement eleprivacy = Base.driver.findElement(elementprivacy);
		eleprivacy.click();
		

		WebElement elecontinuebtn = Base.driver.findElement(elementcontinubtn);
		elecontinuebtn.click();
	}
		
		
	

}
