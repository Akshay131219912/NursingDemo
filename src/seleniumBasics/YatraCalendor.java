package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraCalendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/international-flights/");
		driver.findElement(By.xpath("//li[@class='sel-depart prel']")).click();
		List <WebElement> l = driver.findElements(By.xpath("//*[@id='js_mainclaendar']/div/table/tbody/tr/td[@classname='undefined clsDateCell']"));
		for(int i=0;i<l.size();i++) {
			String a=l.get(i).getText();
			System.out.println(a);
			if(a.equalsIgnoreCase("25")) {
				l.get(i).click();
			}
		}
	}

}
