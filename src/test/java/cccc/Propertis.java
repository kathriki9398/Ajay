package cccc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.format.CellDateFormatter;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Propertis {

	
	
	public static void main(String[] args) throws IOException, InvalidFormatException {
		
		
		
		File file = new File("C:\\Users\\User\\eclipse-workspace\\zzzzzzzzzRestassured\\ram.xlsx");
		
	System.out.println(file.exists());
		
		FileInputStream fis = new FileInputStream(file);
		
		
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		
		int row= sheet.getPhysicalNumberOfRows();
		
		int column= sheet.getRow(0).getLastCellNum();
		
		String [] [] data= new String[row][column];
		
		for(int i=1;i<row;i++) {
			
			
			for(int j=1;j<column;j++) {
				
				DataFormatter df = new DataFormatter();
				
				
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j).getStringCellValue());
				
				XSSFCell  rr= sheet.getRow(i).getCell(j);
				
				System.out.println(sheet.getRow(i+1).getCell(j).getStringCellValue());;
				
				
				
			}
			
			
			System.out.println();
		}
		
		
		
		
		
		 
	}
}
