package amazonApplication;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage extends BasicConfig {
	
	

	HomePage(){
		this.driver=driver;
	}
	

	@BeforeMethod
	public void setup() {
		configue();
	}

	@Test
	public void dashboard() {

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8087087394");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Komal@123");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("One plus");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String parentbrowser = driver.getWindowHandle();
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"))
				.click();

		Set<String> windows = driver.getWindowHandles();

		for (String window : windows) {

			if (!window.equals(parentbrowser)) {
				driver.switchTo().window(window);

				scroll.executeScript("window.scrollBy(0,500)");

				driver.findElement(By.id("add-to-cart-button")).click();
				// driver.switchTo().window(parentbrowser);
			}
		}
		driver.switchTo().window(parentbrowser);
		scroll.executeScript("window.scrollBy(0,-1000)");
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		scroll.executeScript("window.scrollBy(0,1200)");
		driver.findElement(By.xpath("//li/a[contains(text(),'Sign Out')]")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
