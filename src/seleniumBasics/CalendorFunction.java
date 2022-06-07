package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendorFunction {

	public static void main(String[] args) {
		//CTRL+SHIFT+D==debug 
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		driver.findElement(By.id("calFromDate")).click();
		List<WebElement> y=driver.findElements(By.xpath("//select[@class='ui-datepicker-year']/option"));
		for(int i=0;i<y.size();i++) {
			String a=y.get(i).getText();
			System.out.println(a);
			if(a.equalsIgnoreCase("1965")) {
				y.get(i).click();
				break;
			}
		}
		List<WebElement> m=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']/option"));
		for(int i=0;i<m.size();i++) {
			String a=m.get(i).getText();
			if(a.equalsIgnoreCase("Nov")) {
				m.get(i).click();
				break;
			}
		}
		List<WebElement> e=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		for(int i =0;i<e.size();i++) {
			String s=e.get(i).getText();
			if(s.equalsIgnoreCase("17")) {
				e.get(i).click();
				break;
			}
		}
		driver.close();
		}
	}


