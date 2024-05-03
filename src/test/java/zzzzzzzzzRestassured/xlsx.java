package zzzzzzzzzRestassured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class xlsx {
	
	@Test
public void ram() throws IOException {
	File excelFile= new File(System.getProperty("C:\\Users\\User\\eclipse-workspace\\zzzzzzzzzRestassured\\ram.xlsx"));
	
	
FileInputStream fis= new FileInputStream(excelFile)	;

XSSFWorkbook workbook= new XSSFWorkbook(fis);


XSSFSheet sheet = workbook.getSheetAt(0);


String columnCount= sheet.getRow(1).getCell(1).getStringCellValue();

System.out.println(columnCount);
}
}
