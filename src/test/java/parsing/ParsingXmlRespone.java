package parsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;
import org.json.JSONObject;



public class ParsingXmlRespone {

	@Test
public void ram() throws IOException {
	
	
	Properties pro= new Properties();
	
	pro.setProperty("name","kahtikri"
			);
	
	String ram= System.getProperty("user.dir")+"\\data\\exmples.properties";
	
	FileOutputStream js= new FileOutputStream(ram);

	
	pro.store(js, "kdiek");
	System.out.println(ram);
	
} 
	
	@Test
	public void r() throws IOException {
		
		Properties pr= new Properties();
		
		String ram= System.getProperty("user.dir")+"\\data\\exmples.properties";
				;
		
		FileInputStream file= new FileInputStream(ram);
		
		pr.load(file);
		
		String tt= pr.getProperty("name");
		System.err.println(tt.toString());
		
	}
	
	
	@Test
	public void rs() throws IOException {
		
		
	File file= new File("C:\\Users\\User\\eclipse-workspace\\zzzzzzzzzRestassured\\ram.xlsx");
	
	System.out.println(file.exists());
		
	FileInputStream fis= new FileInputStream(file);
	
	
	XSSFWorkbook workbook= new XSSFWorkbook(fis);
	
	XSSFSheet sheet= workbook.getSheet("Sheet1");
	
	System.out.println(sheet.getColumnWidth(2));
	
	
	System.out.println(sheet.getRow(2));
	
	int row= sheet.getPhysicalNumberOfRows();
	
	int column= sheet.getRow(0).getLastCellNum();
	
	
	for(int i=0;i<row;i++) {
		
		for(int j=1;j<column;j++) {
			
			
			String str= sheet.getSheetName();
			System.out.println(str);
		}
	}
	
		
	}
	
	@Test
	public void crssbowsertestin() throws MalformedURLException, IOException {
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		String browser= "edge";
		
		WebDriver driver=null;
		
		if(browser.equals("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			
			driver =new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
			
		}
		
		driver.get("https://www.facebook.com/");
		
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		
		
		for(WebElement link:list) {
			
			String url= link.getAttribute("href");
			
			if(url==null & url.isEmpty()) {
				
				System.out.println("is empty");
			}
			HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
			huc.connect();
			
			if(huc.getResponseCode()>=400) {
				
				System.out.println("is broken");
			}else {
				System.out.println("is valid");
			}
		}
		
		
		
		
		
	}
	
	@Test
	public void raja() {
		
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new 
		
		
		
	}
	
	@Test
	public void parsing() {
		
		
//		given()
//		
//		.contentType("Content-Type"
//		
//		.when()
//		.get("https://reqres.in/api/users?page=2")
//		
//		.then()
//		.statusCode(200)
//		
//		.body("data[0].first_name", equalTo("Michael"));
//		
		
		
		Response res= given().contentType("Content-Type")
			.when().get("https://reqres.in/api/users?page=2");
		
		
//			
//		assertEquals(res.getStatusCode(), 200);
//			
//		
//		String name= res.jsonPath().get("data[0].first_name").toString();
//		
//		assertEquals(name, "Michael");
		
		
		
		
		JSONObject js= new JSONObject(res.toString());
		
		String ram="";
		//for(int i=0;i<js.getJSONArray("data").length();i++) {
			
//			String book= js.getJSONArray("data").getJSONObject(i).get("first_name").toString();
//			
//			System.out.println(book);
			
			ram= ram+js.getJSONObject("first_name");
			
//			
	//	}
		//System.out.println();
	}
	
	
	
	
}
