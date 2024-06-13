package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		List<WebElement> ele= driver.findElements(By.xpath("//*[@name=\"courses\"]/tbody/tr"));
		String beforeXpath="//table[@name='courses']/tbody/tr[";
		String afterXpath="]/td[3]";
		int count = ele.size();
		int sum=0;
		for(int i=2;i<=count;i++) {
		sum=sum +	Integer.parseInt(driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText());
		}
		System.out.println(sum);
		driver.close();
		
	}

}
