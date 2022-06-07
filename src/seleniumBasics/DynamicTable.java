package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

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
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]/table/tbody/tr"));
		int count=ls.size();
		String beforeXpath="//*[@id='product']/tbody/tr[";
		String afterXpath="]/td[4]";
		for(int i =1;i<=count;i++) {
			WebElement element=driver.findElement(By.xpath(beforeXpath+i+afterXpath));
			System.out.println(element.getText());
			
		}
		driver.close();

	}

}
