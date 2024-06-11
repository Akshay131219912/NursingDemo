package webCommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import dataSource.PropertyReader;

public class TestCode {
	
	@Test
	public void testRadioBtn() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebBrowser.openURL(driver, "https://rahulshettyacademy.com/AutomationPractice/");
		//WebCheckBox.multiSelectCheckBox(driver, "xpath", "//label/input[@type='checkbox']", "option2", "option3", "value");
		driver.get("http://nursingdemo.medifox.in.net/Account/Login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Username")).sendKeys("admin");
		driver.findElement(By.id("Password")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String expectedColor="#00a65a";
		String rgbColor=driver.findElement(By.xpath("//nav[@role='navigation']")).getCssValue("background-color");
		Color color = Color.fromString(rgbColor);
		String colorval=color.asHex();
		System.out.println(colorval);
	}
}
