package zzzzzzzzzRestassured;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class As {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions()
				;
		
		
		HashMap<String, Object> cho=new  HashMap<String, Object>();
		cho.put("profile.default_content_settings.popups",0);
		String downloadepath= System.getProperty("user.dir");
		cho.put("downloade.default_directory", downloadepath);
;
		options.setExperimentalOption("prefs", cho);
		
		WebDriver driver= new ChromeDriver(options);
		
		
	
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		
	driver.findElement(By.linkText("ZIP file")).click();
		
	}

}
