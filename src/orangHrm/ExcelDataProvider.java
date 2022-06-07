package orangHrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	@DataProvider(name = "getData")
	public String[][] getData() throws Exception {
		File file = new File("C:\\Users\\akshay  n\\Desktop\\Test1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook b = new XSSFWorkbook(fis);
		XSSFSheet sheet = b.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rows - 1][cell];
		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < cell; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));

				System.out.println(sheet.getRow(i + 1).getCell(j).getStringCellValue());
			}
		}
		b.close();
		fis.close();
		return data;
	}

}
