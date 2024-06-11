package medifox_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import dataSource.PropertyReader;
import medifox_Page_Locator.Login_Page_Locator;
import webCommonFunctions.GetText;
import webCommonFunctions.WebButton;
import webCommonFunctions.WebElementCommon;
import webCommonFunctions.WebTextBox;

public class Login_Page_Action {
	WebDriver driver = null;
	Login_Page_Locator login = null;
	ExtentTest logger = null;
	Patient_Management_Page_Action action;

	public Login_Page_Action(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		login = new Login_Page_Locator(driver, logger);
	}

	public void enterUsername() {
		WebElement username = login.getUser();
		WebTextBox.enterText(username, PropertyReader.getPropertyValue(
				"E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/TestData/Medifox/configue.properties",
				"username"), logger);
	}
	public void enterUsername(String user) {
		WebElement username = login.getUser();
		WebTextBox.enterText(username, PropertyReader.getPropertyValue(
				"E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/TestData/Medifox/configue.properties",
				"username")+user, logger);
	}

	public Patient_Management_Page_Action perform() {
		enterUsername();
		enterPassword();
		enterLogin();
		action=new Patient_Management_Page_Action(driver, logger);
		return action;
	}
	public Patient_Management_Page_Action inValidUser() {
		enterUsername("abc");
		logger.log(LogStatus.PASS, "user entered invalid username");
		enterPassword();
		enterLogin();
		getText("wrong_Usename_Password");
		action=new Patient_Management_Page_Action(driver, logger);
		return action;
	}
	public Patient_Management_Page_Action inValidPass() {
		enterUsername();
		enterPassword("bcd");
		logger.log(LogStatus.PASS, "user entered invalid Password");
		enterLogin();
		getText("wrong_Usename_Password");
		action=new Patient_Management_Page_Action(driver, logger);
		return action;
	}

	public void enterPassword() {
		WebElement password = login.getPassword();
		WebTextBox.enterText(password, PropertyReader.getPropertyValue(
				"E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/TestData/Medifox/configue.properties",
				"password"), logger);
	}
	public void enterPassword(String pass) {
		WebElement password = login.getPassword();
		WebTextBox.enterText(password, PropertyReader.getPropertyValue(
				"E:/Selenium_4april_2022/eclipse-java-2022-03-R-win32-x86_64/eclipse/Complex_Design_Pattern_Framework/TestData/Medifox/configue.properties",
				"password")+pass, logger);
	}

	public void enterLogin() {
		WebElement loginbtn = login.loginBtn();
		WebButton.click(loginbtn, "LoginButton", logger);
		/*
		 * String expectedTitle = "AYUSHMAAN HOSPITAL - Dashboard"; String actualTitle =
		 * WebElementCommon.getTitle(driver); Assert.assertEquals(actualTitle,
		 * expectedTitle); logger.log(LogStatus.PASS, "Title validated successfully");
		 */
		
	}
	public void getText(String field) {
		WebElement element=login.getText();
		String actualText=GetText.getText(element, field, logger);
		String expectedText="Username or Password incorrect"; 
		Assert.assertEquals(actualText, expectedText);
		logger.log(LogStatus.PASS, "wrong username/password text varified");
	}
}
