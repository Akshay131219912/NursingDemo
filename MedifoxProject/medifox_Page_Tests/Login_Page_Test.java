package medifox_Page_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import initializer.BaseClass;
import medifox_Page_Actions.In_Patient_mgt_PersonalDetails_Page_Action;
import medifox_Page_Actions.Login_Page_Action;
import medifox_Page_Actions.Patient_Management_Page_Action;

public class Login_Page_Test extends BaseClass {

	@Test(priority = 0,enabled = true)
	public void verifyLoginPage() {
		try {
			Login_Page_Action action = new Login_Page_Action(driver, testReports);
			action.perform();
			testReports.log(LogStatus.PASS, testReports.addScreenCapture(screenCapture(driver, "loginPage")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			testReports.log(LogStatus.FAIL, testReports.addScreenCapture(screenCapture(driver, "loginPage")));
		}
	}
	@Test(priority = 1,enabled = true)
	public void invalidUserName() {
		try {
			Login_Page_Action action= new Login_Page_Action(driver,testReports);
			action.inValidUser();
			testReports.log(LogStatus.PASS, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));
		} catch (Exception e) {
			testReports.log(LogStatus.FAIL, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));
		}
	}
	@Test(priority = 2,enabled = true)
	public void invalidPassword() {
		try {
			Login_Page_Action action= new Login_Page_Action(driver,testReports);
			action.inValidPass();
			testReports.log(LogStatus.PASS, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));
		} catch (Exception e) {
			testReports.log(LogStatus.FAIL, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));	
		}
	}
	@Test(priority = 3,enabled = true)
	public void inPatientRegistrationPage() {
		try {
			Login_Page_Action action = new Login_Page_Action(driver, testReports);
			Patient_Management_Page_Action action1 = action.perform();
			In_Patient_mgt_PersonalDetails_Page_Action personalDetails= action1.clickOnBtn();
			personalDetails.getUHID();
			testReports.log(LogStatus.PASS, testReports.addScreenCapture(screenCapture(driver, "UHID")));
		} catch (Exception e) {
			testReports.log(LogStatus.FAIL, testReports.addScreenCapture(screenCapture(driver, "UHID")));
		}
	}
}
