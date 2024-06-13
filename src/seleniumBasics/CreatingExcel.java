package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcel {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\akshay  n\\Desktop\\Test2.xlsx");
		HSSFWorkbook b = new HSSFWorkbook();
		b.write(file);
		
		HSSFSheet sheet = b.createSheet();
		sheet.createRow(0).createCell(0).setCellValue("Hello");
		sheet.createRow(0).createCell(1).setCellValue("demo");
		HSSFSheet sheet1 = b.createSheet();
		sheet1.createRow(0).createCell(0).setCellValue("Hello1");
		sheet1.createRow(0).createCell(1).setCellValue("demo1");
		b.close();

	}

}
