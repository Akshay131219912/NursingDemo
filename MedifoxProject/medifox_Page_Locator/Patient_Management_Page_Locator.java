package medifox_Page_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

public class Patient_Management_Page_Locator {
	public WebDriver driver = null;
	public ExtentTest logger = null;

	 public Patient_Management_Page_Locator(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Patient Management')]")
	private WebElement PatientMgtBtn;

	public WebElement getPatientMgtBtn() {
		return PatientMgtBtn;
	}

}
