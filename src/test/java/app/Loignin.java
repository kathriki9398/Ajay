package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loignin {

	
	@Test
	public void lodin() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("kathrik");
		driver.findElement(By.id("pass")).sendKeys("qw3r");
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.quit();
		
		
	}
	
	
	
}
