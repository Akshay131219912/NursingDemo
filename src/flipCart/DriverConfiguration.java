package flipCart;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.list.SetUniqueList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfiguration {
	static WebDriver driver;
	private static DriverConfiguration driverConfigue = null;

	private static String url = "https://www.amazon.in/ap/signin?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Drhf_sign_in&openid.assoc_handle=inflex&openid.pape.max_auth_age=0";

	private DriverConfiguration() {

	}

	public static DriverConfiguration getInstance() {
	
		if (driverConfigue == null) {
			System.out.println("In getinstance");
			driverConfigue = new DriverConfiguration();
			driver= driverConfigue.setupDriver(driver);
			
		}
		else {
			System.out.println("Inside getinstance");
		}
		return driverConfigue;
	}

	WebDriver setupDriver(WebDriver driver) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;

	}
	public WebDriver getDriver() {
		return DriverConfiguration.getInstance().driver;
	}

}
