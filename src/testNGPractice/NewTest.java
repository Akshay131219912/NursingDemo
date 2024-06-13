package testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeSuite
	public void Setup() {
		System.out.println("Before suite");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	}
	@Test
	@BeforeTest
	public void test() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void Browser() {
		System.out.println("Before class");
		
		
		 driver= new ChromeDriver();
	}
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Before method");
		driver.get("https://www.facebook.com/");
	
	}
	
  @Test
  public void demo() {
	  System.out.println("1st output");
  }
  @AfterMethod
  public void Logout() {
	  System.out.println("After method");
	  System.out.println("Click on Logout");
  }
  @AfterClass
  public void CloseBrowser() {
	  System.out.println("Close Browser");
	  driver.close();
	  System.out.println("Close Browser");
  }
  @AfterTest
  public void Delete() {
	  System.out.println("After test");
	  System.out.println("DeleteCookies");
  }
 
  @AfterSuite
  public void Report() {
	  System.out.println("After Suite");
	  System.out.println("Generate Report");
  }
  
}
