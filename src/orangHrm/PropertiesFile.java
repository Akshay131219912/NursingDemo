package orangHrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public Properties pro;

	
	public PropertiesFile() {
		
		File file = new File("C:\\Users\\akshay  n\\eclipse-workspace\\Qa_idea\\src\\orangHrm\\Configue.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			 pro=new Properties();
			 pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getURL() {
		return pro.getProperty("url");
	}
}
