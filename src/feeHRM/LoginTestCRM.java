package feeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCRM extends LoginPage {
	
	
	
	@Test
	public void loginHRM() {
		BrowserFactory.setupBrowser(driver, "chrome", "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		LoginPage loginpage= new LoginPage();
		loginpage.login("Admin","admin123");
		BrowserFactory.closeBrowser(driver);
	}

}
