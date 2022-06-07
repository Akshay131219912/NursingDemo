package seleniumBasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		List <WebElement> ls=driver.findElements(By.xpath("//li[@class='gf-li']"));
		for(WebElement link:ls) {
			String links=link.getAttribute("href");
			System.out.println(links);
			HttpURLConnection conn =(HttpURLConnection)new URL(links).openConnection();
			conn.setRequestMethod("HEAD");
			int responsecode=conn.getResponseCode();
			//System.out.println(responsecode);
			if(responsecode>400) {
				System.out.println("brokenLinks"+link.getText()+"Displayed"+responsecode );
			}
		}
		
	}

}
