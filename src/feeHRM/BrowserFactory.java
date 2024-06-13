package feeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	WebDriver driver;

	public static WebDriver setupBrowser(WebDriver driver, String browsername, String url) {
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equals("IE")) {
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("We does not support for this browser");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}

}
