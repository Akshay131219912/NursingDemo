package webCommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

public class WebBackGroundColor {
	
	public void getColor(WebDriver driver,String loc,String locval) {
		
		
		String rgbColor=driver.findElement(By.xpath("")).getCssValue("background-color");
		Color color = Color.fromString(rgbColor);
		String colorval=color.asHex();
		System.out.println(colorval);
	}
	

}
