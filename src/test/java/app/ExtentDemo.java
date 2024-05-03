package app;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemo {

	@Test
	public void ram() throws IOException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html?m=1");

	Select ram= new Select(driver.findElement(By.id("ide")));
	
	ram.selectByIndex(2);
	
	
	List<WebElement>list=ram.getOptions();
	
	for(WebElement raj:list) {
		
		System.out.println(raj.getText());
		ram.selectByIndex(1);
		ram.selectByIndex(3);
		
		ram.selectByVisibleText("Java");
	}
		
		
		List<WebElement> vee= ram.getAllSelectedOptions();
		
		for(WebElement b:vee) {
			
			System.out.println(b.getText());
		}
		
		
		
	}
}
