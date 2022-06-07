package orangHrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasePage   {
	static WebDriver driver;
	
	
	@BeforeTest
	  public void setup() {
		 driverSetup();
		//browserSetup("chrome");
	  }

	  @AfterTest
	  public void tearDown() {
		  closeBrowser();
	  }

	
	public static WebDriver browserSetup(String browsername) {
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browsername.equals("Firefox")) {
			driver=new FirefoxDriver();
		}else if(browsername.equals("IE")) {
			driver=new InternetExplorerDriver();
		}else {
			System.out.println("We does not support for this browser");
		}
		browserSetup("chorme");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PropertiesFile properties=new PropertiesFile();
		String URL=properties.getURL();
		driver.get(URL);
		return driver;
	}
	
	public static void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		//browserSetup("chorme");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		PropertiesFile properties=new PropertiesFile();
		String URL=properties.getURL();
		driver.get(URL);
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
