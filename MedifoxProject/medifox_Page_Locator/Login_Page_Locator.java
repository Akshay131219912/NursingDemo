package medifox_Page_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

public class Login_Page_Locator {

	public WebDriver driver = null;
	public ExtentTest logger = null;

	public Login_Page_Locator(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Username")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}

	@FindBy(id = "Password")
	private WebElement paasword;

	public WebElement getPassword() {
		return paasword;
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginbtn;

	public WebElement loginBtn() {
		return loginbtn;
	}
	@FindBy(xpath = "//ul/li")
	private WebElement getText;

	public WebElement getText() {
		return getText;
	}
}
