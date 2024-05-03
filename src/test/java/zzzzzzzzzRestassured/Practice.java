package zzzzzzzzzRestassured;

import static io.restassured.RestAssured.baseURI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class Practice {
	
	
	@Test(dataProvider = "ramm")
	public void logintest(String username , String password) {
		
		
		System.out.println(username +"-----"+password);
		
		
	}
	


	@DataProvider(name="ramm")
	public Object[][] dataduppliers() throws FileNotFoundException {
		
		
		File excelFile= new File(System.getProperty("C:\\Users\\User\\eclipse-workspace\\zzzzzzzzzRestassured\\ram.xlsx"));
		
		
	FileInputStream fis= new FileInputStream(excelFile)	;
	
	XSSFWorkbook workbook= new XSSFWorkbook();
	

	XSSFSheet sheet = workbook.getSheetAt(0);
	
	int rowCount = sheet.getLastRowNum();	
	int columnCount= sheet.getRow(1).getCell(1).getRowIndex();
	
	Object[][] data = new Object[rowCount][columnCount];
		
	
	
	for(int r=0;r<rowCount;r++) {
		
		XSSFRow row=sheet.getRow(r+1);
		
		for(int c=0;c<columnCount;c++) {
			
			XSSFCell cell=row.getCell(c);
			
			
			CellType cellType= cell.getCellType();
			
			
			switch (cellType) {
			case STRING:
				
				data[r][c]=cell.getRichStringCellValue();
				break;
			case NUMERIC:
				data[r][c]= Integer.toString((int)cell.getNumericCellValue());
				break;
				
			case BOOLEAN:
				data[r][c]= cell.getBooleanCellValue();
				
				break;
				
				
				
				
			}
			
			
		}
		
		
	}
	return data;
	
	}
	
	
	
	
	
}
