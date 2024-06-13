package medifox_Page_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

public class In_Patient_mgt_PersonalDetails_Locator {
	public WebDriver driver = null;
	public ExtentTest logger = null;
	 public In_Patient_mgt_PersonalDetails_Locator(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "UHID")
	private WebElement UHID;

	public WebElement UHIDField() {
		return UHID;
	}

}
