package zzzzzzzzzRestassured;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.xml.XmlSerializer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SS {
	
	
	@Test
public void ram () {

	WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	
	 
	
	List<WebElement>list=driver.findElements(By.tagName("a"));
	
	for(WebElement links:list) {
		
		
		String huc= links.getAttribute("href");
		
		
		if(huc==null ||huc.isEmpty() ) {
			
			System.out.println("uc is isnpy");
			continue;
		}
		try {
			HttpURLConnection ram= (HttpURLConnection)(new URL(huc).openConnection());
			
			
			ram.connect();
			if(ram.getResponseCode()>=400) {
				
				System.out.println(huc+"is brokens");
				
			}
			else {
				System.out.println(huc+" is valid");
			}
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	driver.quit();
}}