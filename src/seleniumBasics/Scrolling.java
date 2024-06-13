package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		String beforeXpath = "//*[@id=\"product\"]/tbody/tr[";
		String afterXpath = "]/td[4]";
		List<WebElement> ls = driver
				.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr/td[4]"));
		int count = ls.size();
		int sum = 0;
		for (int i = 0; i < count; i++) {
			System.out.println(ls.get(i).getText());

			sum = sum + Integer.parseInt(ls.get(i).getText());
		}
		System.out.println(sum);
		WebElement ele = driver.findElement(By.xpath("//div[@class='totalAmount']"));
		String ele1 = ele.getText();
		String ele2 = ele1.split(":")[1].trim();
		System.out.println(ele2);
		int ele3 = Integer.parseInt(ele2);
		if (ele3 == sum) {
			System.out.print("Verified");

		}

		driver.close();

	}

}
