package feeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BrowserFactory {
	
	
	public LoginPage() {
		this.driver=driver;
	}
	
	@FindBy(id="txtUsername") WebElement username1;
	@FindBy(id="txtPassword") WebElement password1;
	@FindBy(id="btnLogin") WebElement loginbtn;
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]") WebElement forgotpass;
	
	
	
	
		
	public void login(String username,String password) {
		
		username1.sendKeys(username);
		password1.sendKeys(password);
		loginbtn.click();
	}
	

}
