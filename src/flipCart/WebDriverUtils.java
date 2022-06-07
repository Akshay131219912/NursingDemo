package flipCart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverUtils {
	WebDriverUtils common;

	private static WebDriverUtils webdriverConfigue = null;

	public static WebDriverUtils getinstance() {
		if (webdriverConfigue == null) {
			webdriverConfigue = new WebDriverUtils();
		}
		return webdriverConfigue;
	}

	public WebElement findElement(String element, WebDriver driver) {
		return driver.findElement(By.xpath(element));
	}

	public void sendKeys(String value, WebElement element) {
		element.sendKeys(value);

	}

	public void click(WebElement element) {
		element.click();

	}

	public void scrollDown(String ScrollbyValue, WebDriver driver) {
		JavascriptExecutor scroll = (JavascriptExecutor) DriverConfiguration.getInstance().getDriver();
		scroll.executeScript(ScrollbyValue);
	}

	public void singlewindowHandling(WebDriver driver) {
		System.out.println("In handle method");
		String parent = (DriverConfiguration.getInstance().getDriver()).getWindowHandle();
		System.out.println("In handle");

		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {
			System.out.println("In handles");

			if (!window.equals(parent)) {
				System.out.println("before scroll");
				scrollDown("window.scrollBy(0,500)",DriverConfiguration.getInstance().getDriver());
				
				//scrollDown("window.scrollBy(0,500)",driver);
				System.out.println("after scroll");
				//scrollDown("window.scrollBy(0,500)",DriverConfiguration.getInstance().getDriver());
				//WebElement element = common.findElement(HomePageUIElements.addtocart,DriverConfiguration.getInstance().getDriver());
				//common.click(element);
				HomePage page=new HomePage();
				page.addToCart();

			}
			
		}
		driver.switchTo().window(parent);
		

	}
}
