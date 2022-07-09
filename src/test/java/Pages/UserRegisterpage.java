package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import DriverUtil.Base;

public class UserRegisterpage {

	
	public void fnUserRegister(String sEmailID) {
		
	
		WebElement ele = Base.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]"));		
		ele.click();
		WebElement ele1 = Base.driver.findElement(By.linkText("Register"));
		ele1.click();
		WebElement ele2 = Base.driver.findElement(By.id("input-firstname"));
		ele2.sendKeys("sai12");
		
		WebElement ele3 = Base.driver.findElement(By.id("input-lastname"));
		ele3.sendKeys("jastisai12");
		
		
		WebElement ele4 = Base.driver.findElement(By.xpath("//input[@id='input-email']"));
		ele4.sendKeys(sEmailID);
		
		WebElement ele5 = Base.driver.findElement(By.id("input-telephone"));
		ele5.sendKeys("9676245585");	
		
		WebElement ele6 = Base.driver.findElement(By.id("input-password"));
		ele6.sendKeys("Saibaba");
		
		
		WebElement ele7 = Base.driver.findElement(By.id("input-confirm"));
		ele7.sendKeys("Saibaba");
		
		WebElement ele8 = Base.driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"));
		ele8.click();
		

		WebElement ele9 = Base.driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));
		ele9.click();
		

		WebElement ele10 = Base.driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
		ele10.click();
	}
		
		
	

}
