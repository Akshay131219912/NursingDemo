package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingXcelFile {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\Users\\akshay  n\\Desktop\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0) ;
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			int columncount = row.getPhysicalNumberOfCells();
			for(int j=0;j<columncount;j++) {
				XSSFCell cell = row.getCell(j);
				String cellvalue = Getcelldata(cell);
				
				System.out.print("||" +cellvalue);
				
			}
			System.out.println();
		}
		//String ls = sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(ls);
		workbook.close();
		fis.close();
		
		}
	public static String Getcelldata(XSSFCell cell) {
		
		switch(cell.getCellType()){
			case NUMERIC:
				return String.valueOf(cell.getNumericCellValue());
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case STRING:
				return cell.getStringCellValue();
		}
		return cell.getStringCellValue() ;
		
	}
	

}

