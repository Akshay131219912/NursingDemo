package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvokeBrowser {

	public static void main(String[] args) throws Throwable {
		Logger log = Logger.getLogger("InvokeBrowser");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, "true");
		
		
		driver.manage().window().maximize();
		log.info("Window maximamized");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		List<WebElement> ele=driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		System.out.println(ele.size());
		System.out.println(ele.get(0).getText());
		String Exp="Female";
		
		for(int i=0;i<ele.size();i++) {
			if(ele.get(i).getText().equalsIgnoreCase(Exp)) {
				ele.get(i).click();
				System.out.print("Hello");
				break;
				
			}
		}
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nalawade");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Nalawade");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Akshay@123");
		WebElement ele1 = driver.findElement(By.id("day"));
		Select select =new Select(ele1);
		select.selectByValue("13");
		
		WebElement ele2 = driver.findElement(By.id("month"));
		Select select1 =new Select(ele2);
		select1.selectByVisibleText("Dec");
		
		WebElement ele3 = driver.findElement(By.id("year"));
		Select select3 =new Select(ele3);
		select3.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		driver.close();

	}

}
