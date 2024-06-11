package medifox_Page_Tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import initializer.BaseClass;
import medifox_Page_Actions.Login_Page_Action;
import medifox_Page_Actions.Patient_Management_Page_Action;

public class Login_Page_Test extends BaseClass {

	@Test(priority = 0)
	public void verifyLoginPage() {
		try {
			Login_Page_Action action = new Login_Page_Action(driver, testReports);
			Patient_Management_Page_Action action1 = action.perform();
			testReports.log(LogStatus.PASS, testReports.addScreenCapture(screenCapture(driver, "login")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			testReports.log(LogStatus.FAIL, testReports.addScreenCapture(screenCapture(driver, "login")));
		}
		
		// Patient_Management_Page_Action action1 = new
		// Patient_Management_Page_Action(driver, testReports);
		//action1.clickOnBtn();
	}

	/*
	 * @Test(dependsOnMethods = "verifyLoginPage") public void btnClick() {
	 * 
	 * }
	 */
	@Test(priority = 1)
	public void invalidUserName() {
		try {
			Login_Page_Action action= new Login_Page_Action(driver,testReports);
			Patient_Management_Page_Action action1=action.inValidUser();
			testReports.log(LogStatus.PASS, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));
		} catch (Exception e) {
			testReports.log(LogStatus.FAIL, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));
		}
		//Patient_Management_Page_Action action1 = new Patient_Management_Page_Action(driver, testReports);
		//action1.clickOnBtn();
	}
	@Test(priority = 2)
	public void invalidPassword() {
		try {
			Login_Page_Action action= new Login_Page_Action(driver,testReports);
			Patient_Management_Page_Action action1=action.inValidPass();
			testReports.log(LogStatus.PASS, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));
		} catch (Exception e) {
			testReports.log(LogStatus.FAIL, testReports.addScreenCapture(screenCapture(driver, "invalidlogin")));	
		}
		//Patient_Management_Page_Action action1 = new Patient_Management_Page_Action(driver, testReports);
		//action1.clickOnBtn();
	}
}

