package medifox_Page_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import medifox_Page_Locator.Patient_Management_Page_Locator;
import webCommonFunctions.WebButton;
import webCommonFunctions.WebElementCommon;

public class Patient_Management_Page_Action {
	WebDriver driver = null;
	Patient_Management_Page_Locator action = null;
	ExtentTest logger = null;

	public Patient_Management_Page_Action(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		action = new Patient_Management_Page_Locator(driver, logger);
	}

	public void clickOnBtn() {
		WebElement element = action.getPatientMgtBtn();
		Boolean flag = WebElementCommon.isClickable(element);
		if (flag == true) {
			WebButton.click(element, "PatientManagementButton", logger);
			logger.log(LogStatus.PASS, "PatientManagementButton clicked successfully");
		} else {
			logger.log(LogStatus.FAIL, "Unable to click on PatientManagementButton");
		}
	}
}
