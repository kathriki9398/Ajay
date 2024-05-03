package pracitce;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenslinks {
	
	
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		
		for(WebElement link:list) {
			
			
			String url= link.getAttribute("href");
			
			
			if(url==null&&url.isEmpty()) {
				System.out.println("is empty");
				continue;
			}
			
			try {
				HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
				
				huc.connect();
				
				if(huc.getResponseCode()>=400) {
					
					System.out.println("is borken");
				}else{
					System.out.println(" is valid");
				}
				
				
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}

}
