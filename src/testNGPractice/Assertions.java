package testNGPractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@Test(priority = 1, groups = "Title")
	public void googleTitletest() {
		String title = driver.getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals(title, "Google");

	}

	@Test(groups = "Logo")
	public void googleLogoTest() {
		Boolean e = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(e);
		System.out.println(e);
	}

	@AfterMethod
	public void TearDown() {
		driver.close();
	}
}
